package var.dimension.sky;

import java.util.Random;

import var.block.BlockManager;
import var.main.MainRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPortal;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.Teleporter;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;

public class SkyPortal extends BlockPortal {

	public SkyPortal() {
		super();
		this.setStepSound(soundTypeGlass);
	}

	@Override
	public int getLightValue(IBlockAccess world, BlockPos pos) {
		return 14;
	}

	@Override
	public void onEntityCollidedWithBlock(World worldIn, BlockPos pos, IBlockState state, Entity entityIn) {
		if (entityIn.ridingEntity == null && entityIn.riddenByEntity == null) {
			int id = 2;
			if (entityIn.dimension == id) {
				id = 0;
			}
			if (entityIn instanceof EntityPlayerMP) {

				EntityPlayerMP player = (EntityPlayerMP) entityIn;
				MinecraftServer mcServer = player.mcServer;

				if (player.timeUntilPortal > 0) {
					player.timeUntilPortal = 400;
					player.setInPortal();
				}
				else if (player.dimension != 2) {
					player.timeUntilPortal = 400;
					SkyTeleporter skyTeleporter = new SkyTeleporter(mcServer.worldServerForDimension(2));
					player.mcServer.getConfigurationManager().transferPlayerToDimension(player, 2, (Teleporter) skyTeleporter);
				}
				else {
					player.timeUntilPortal = 400;
					SkyTeleporter skyTeleporter = new SkyTeleporter(mcServer.worldServerForDimension(0));
					player.mcServer.getConfigurationManager().transferPlayerToDimension(player, 0, (Teleporter) skyTeleporter);
				}
			}
			else {
				travelToDimension(entityIn, id);
			}
		}
	}

	private void travelToDimension(Entity entity, int id) {
		if (!entity.worldObj.isRemote && !entity.isDead) {
			entity.timeUntilPortal = 10;
			entity.worldObj.theProfiler.startSection("changeDimension");
			MinecraftServer minecraftserver = MinecraftServer.getServer();
			int j = entity.dimension;
			WorldServer worldserver = minecraftserver.worldServerForDimension(j);
			WorldServer worldserver1 = minecraftserver.worldServerForDimension(id);
			entity.dimension = id;

			if (j == 1 && id == 1) {
				worldserver1 = minecraftserver.worldServerForDimension(0);
				entity.dimension = 0;
			}

			entity.worldObj.removeEntity(entity);
			entity.isDead = false;
			entity.worldObj.theProfiler.startSection("reposition");
			minecraftserver.getConfigurationManager().transferEntityToWorld(entity, j, worldserver, worldserver1, new SkyTeleporter(worldserver1));
			entity.worldObj.theProfiler.endStartSection("reloading");
			Entity entity1 = EntityList.createEntityByName(EntityList.getEntityString(entity), worldserver1);

			if (entity1 != null) {
				entity1.copyDataFromOld(entity);

				if (j == 1 && id == 1) {
					BlockPos spawnPoint = worldserver1.getSpawnPoint();
					spawnPoint = entity.worldObj.getTopSolidOrLiquidBlock(spawnPoint);
					entity1.setLocationAndAngles(spawnPoint.getX(), spawnPoint.getY(), spawnPoint.getZ(), entity1.rotationYaw, entity1.rotationPitch);
				}

				worldserver1.spawnEntityInWorld(entity1);
			}

			entity.isDead = true;
			entity.worldObj.theProfiler.endSection();
			worldserver.resetUpdateEntityTick();
			worldserver1.resetUpdateEntityTick();
			entity.worldObj.theProfiler.endSection();
			entity.getPortalCooldown();
		}
	}

	@Override
	public boolean func_176548_d(World worldIn, BlockPos p_176548_2_) {
		SkyPortal.Size size = new SkyPortal.Size(worldIn, p_176548_2_, EnumFacing.Axis.X);

		if (size.func_150860_b() && size.field_150864_e == 0) {
			size.func_150859_c();
			return true;
		}
		else {
			SkyPortal.Size size1 = new SkyPortal.Size(worldIn, p_176548_2_, EnumFacing.Axis.Z);

			if (size1.func_150860_b() && size1.field_150864_e == 0) {
				size1.func_150859_c();
				return true;
			}
			else {
				return false;
			}
		}
	}

	@Override
	public void randomDisplayTick(World worldIn, BlockPos pos, IBlockState state, Random rand) {

		pos.getX();
		pos.getY();
		pos.getZ();

		if (rand.nextInt(100) == 0) {
			worldIn.playSound(pos.getX() + 0.5D, pos.getY() + 0.5D, pos.getZ() + 0.5D, "portal.portal", 0.5F, rand.nextFloat() * 0.4F + 0.8F, false);
		}

		for (int i = 0; i < 4; ++i) {
			double d0 = pos.getX() + rand.nextFloat();
			double d1 = pos.getY() + rand.nextFloat();
			double d2 = pos.getZ() + rand.nextFloat();
			double d3 = (rand.nextFloat() - 0.5D) * 0.5D;
			double d4 = (rand.nextFloat() - 0.5D) * 0.5D;
			double d5 = (rand.nextFloat() - 0.5D) * 0.5D;
			int j = rand.nextInt(2) * 2 - 1;

			if (worldIn.getBlockState(pos.west()).getBlock() != this && worldIn.getBlockState(pos.east()).getBlock() != this) {
				d0 = pos.getX() + 0.5D + 0.25D * j;
				d3 = rand.nextFloat() * 2.0F * j;
			}
			else {
				d2 = pos.getZ() + 0.5D + 0.25D * j;
				d5 = rand.nextFloat() * 2.0F * j;
			}

			worldIn.spawnParticle(EnumParticleTypes.PORTAL, d0, d1, d2, d3, d4, d5, new int[0]);
		}
	}

	@Override
	public void onNeighborBlockChange(World worldIn, BlockPos pos, IBlockState state, Block neighborBlock) {
		EnumFacing.Axis axis = (EnumFacing.Axis) state.getValue(AXIS);
		SkyPortal.Size size;

		if (axis == EnumFacing.Axis.X) {
			size = new SkyPortal.Size(worldIn, pos, EnumFacing.Axis.X);

			if (!size.func_150860_b() || size.field_150864_e < size.field_150868_h * size.field_150862_g) {
				worldIn.setBlockState(pos, Blocks.air.getDefaultState());
			}
		}
		else if (axis == EnumFacing.Axis.Z) {
			size = new SkyPortal.Size(worldIn, pos, EnumFacing.Axis.Z);

			if (!size.func_150860_b() || size.field_150864_e < size.field_150868_h * size.field_150862_g) {
				worldIn.setBlockState(pos, Blocks.air.getDefaultState());
			}
		}
	}

	public static class Size {
		private final World world;
		private final EnumFacing.Axis axis;
		private final EnumFacing field_150866_c;
		private final EnumFacing field_150863_d;
		private int field_150864_e = 0;
		private BlockPos field_150861_f;
		private int field_150862_g;
		private int field_150868_h;
		private static final String __OBFID = "CL_00000285";

		public Size(World worldIn, BlockPos p_i45694_2_, EnumFacing.Axis p_i45694_3_) {
			this.world = worldIn;
			this.axis = p_i45694_3_;

			if (p_i45694_3_ == EnumFacing.Axis.X) {
				this.field_150863_d = EnumFacing.EAST;
				this.field_150866_c = EnumFacing.WEST;
			}
			else {
				this.field_150863_d = EnumFacing.NORTH;
				this.field_150866_c = EnumFacing.SOUTH;
			}

			for (BlockPos blockpos1 = p_i45694_2_; p_i45694_2_.getY() > blockpos1.getY() - 21 && p_i45694_2_.getY() > 0 && this.func_150857_a(worldIn.getBlockState(p_i45694_2_.down()).getBlock()); p_i45694_2_ = p_i45694_2_.down()) {
				;
			}

			int i = this.func_180120_a(p_i45694_2_, this.field_150863_d) - 1;

			if (i >= 0) {
				this.field_150861_f = p_i45694_2_.offset(this.field_150863_d, i);
				this.field_150868_h = this.func_180120_a(this.field_150861_f, this.field_150866_c);

				if (this.field_150868_h < 2 || this.field_150868_h > 21) {
					this.field_150861_f = null;
					this.field_150868_h = 0;
				}
			}

			if (this.field_150861_f != null) {
				this.field_150862_g = this.func_150858_a();
			}
		}

		protected int func_180120_a(BlockPos p_180120_1_, EnumFacing p_180120_2_) {
			int i;

			for (i = 0; i < 22; ++i) {
				BlockPos blockpos1 = p_180120_1_.offset(p_180120_2_, i);

				if (!this.func_150857_a(this.world.getBlockState(blockpos1).getBlock()) || this.world.getBlockState(blockpos1.down()).getBlock() != BlockManager.titaniumBlock) {
					break;
				}
			}

			Block block = this.world.getBlockState(p_180120_1_.offset(p_180120_2_, i)).getBlock();
			return block == BlockManager.titaniumBlock ? i : 0;
		}

		protected int func_150858_a() {
			int i;
			label56:

			for (this.field_150862_g = 0; this.field_150862_g < 21; ++this.field_150862_g) {
				for (i = 0; i < this.field_150868_h; ++i) {
					BlockPos blockpos = this.field_150861_f.offset(this.field_150866_c, i).up(this.field_150862_g);
					Block block = this.world.getBlockState(blockpos).getBlock();

					if (!this.func_150857_a(block)) {
						break label56;
					}

					if (block == BlockManager.skyPortal) {
						++this.field_150864_e;
					}

					if (i == 0) {
						block = this.world.getBlockState(blockpos.offset(this.field_150863_d)).getBlock();

						if (block != BlockManager.titaniumBlock) {
							break label56;
						}
					}
					else if (i == this.field_150868_h - 1) {
						block = this.world.getBlockState(blockpos.offset(this.field_150866_c)).getBlock();

						if (block != BlockManager.titaniumBlock) {
							break label56;
						}
					}
				}
			}

			for (i = 0; i < this.field_150868_h; ++i) {
				if (this.world.getBlockState(this.field_150861_f.offset(this.field_150866_c, i).up(this.field_150862_g)).getBlock() != BlockManager.titaniumBlock) {
					this.field_150862_g = 0;
					break;
				}
			}

			if (this.field_150862_g <= 21 && this.field_150862_g >= 3) {
				return this.field_150862_g;
			}
			else {
				this.field_150861_f = null;
				this.field_150868_h = 0;
				this.field_150862_g = 0;
				return 0;
			}
		}

		protected boolean func_150857_a(Block p_150857_1_) {
			return p_150857_1_.getMaterial() == Material.air || p_150857_1_ == BlockManager.highFire || p_150857_1_ == BlockManager.skyPortal;
		}

		public boolean func_150860_b() {
			return this.field_150861_f != null && this.field_150868_h >= 2 && this.field_150868_h <= 21 && this.field_150862_g >= 3 && this.field_150862_g <= 21;
		}

		public void func_150859_c() {
			for (int i = 0; i < this.field_150868_h; ++i) {
				BlockPos blockpos = this.field_150861_f.offset(this.field_150866_c, i);

				for (int j = 0; j < this.field_150862_g; ++j) {
					this.world.setBlockState(blockpos.up(j), BlockManager.skyPortal.getDefaultState().withProperty(SkyPortal.AXIS, this.axis), 2);
				}
			}
		}
	}
	
}
