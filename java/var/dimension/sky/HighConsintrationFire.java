package var.dimension.sky;

import java.util.Map;
import java.util.Random;

import var.block.BlockManager;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFire;
import net.minecraft.block.BlockTNT;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.google.common.collect.Maps;

import net.minecraft.block.BlockFire;

public class HighConsintrationFire extends Block {

	public static final PropertyInteger AGE = PropertyInteger.create("age", 0, 15);
	public static final int age = 0;
	public static final PropertyBool FLIP = PropertyBool.create("flip");
	public static final PropertyBool ALT = PropertyBool.create("alt");
	public static final PropertyBool NORTH = PropertyBool.create("north");
	public static final PropertyBool EAST = PropertyBool.create("east");
	public static final PropertyBool SOUTH = PropertyBool.create("south");
	public static final PropertyBool WEST = PropertyBool.create("west");
	public static final PropertyInteger UPPER = PropertyInteger.create("upper", 0, 2);
	private final Map encouragements = Maps.newIdentityHashMap();
	private final Map flammabilities = Maps.newIdentityHashMap();
	private static final String __OBFID = "CL_00000245";
	/**
	* Get the actual Block state of this Block at the given position. This
	* applies properties not visible in the metadata, such as fence
	* connections.
	*/
	@Override
	public IBlockState getActualState(IBlockState state, IBlockAccess worldIn, BlockPos pos) {
		int i = pos.getX();
		int j = pos.getY();
		int k = pos.getZ();
		if (!World.doesBlockHaveSolidTopSurface(worldIn, pos.down()) && !((HighConsintrationFire) BlockManager.highFire).canCatchFire(worldIn, pos.down(), EnumFacing.UP)) {
			boolean flag = (i + j + k & 1) == 1;
			boolean flag1 = (i / 2 + j / 2 + k / 2 & 1) == 1;
			int l = 0;
			if (this.canCatchFire(worldIn, pos.up(), EnumFacing.DOWN)) {
				l = flag ? 1 : 2;
			}
			return state.withProperty(NORTH, Boolean.valueOf(this.canCatchFire(worldIn, pos.north(), EnumFacing.SOUTH))).withProperty(EAST, Boolean.valueOf(this.canCatchFire(worldIn, pos.east(), EnumFacing.EAST))).withProperty(SOUTH, Boolean.valueOf(this.canCatchFire(worldIn, pos.south(), EnumFacing.NORTH))).withProperty(WEST, Boolean.valueOf(this.canCatchFire(worldIn, pos.west(), EnumFacing.EAST))).withProperty(UPPER, Integer.valueOf(l)).withProperty(FLIP, Boolean.valueOf(flag1)).withProperty(ALT, Boolean.valueOf(flag));
		}
		else {
			return this.getDefaultState();
		}
	}
	public HighConsintrationFire() {
		super(Material.fire);
		this.setDefaultState(this.blockState.getBaseState().withProperty(FLIP, Boolean.valueOf(false)).withProperty(ALT, Boolean.valueOf(false)).withProperty(NORTH, Boolean.valueOf(false)).withProperty(EAST, Boolean.valueOf(false)).withProperty(SOUTH, Boolean.valueOf(false)).withProperty(WEST, Boolean.valueOf(false)).withProperty(UPPER, Integer.valueOf(0)));
		this.setTickRandomly(true);
	}
	
	@Override
	public int getRenderType() {
	return 3;
	}
	public static void init() {
		((HighConsintrationFire) BlockManager.highFire).setFireInfo(Blocks.planks, 5, 20);
		((HighConsintrationFire) BlockManager.highFire).setFireInfo(Blocks.double_wooden_slab, 5, 20);
		((HighConsintrationFire) BlockManager.highFire).setFireInfo(Blocks.wooden_slab, 5, 20);
		((HighConsintrationFire) BlockManager.highFire).setFireInfo(Blocks.oak_fence_gate, 5, 20);
		((HighConsintrationFire) BlockManager.highFire).setFireInfo(Blocks.spruce_fence_gate, 5, 20);
		((HighConsintrationFire) BlockManager.highFire).setFireInfo(Blocks.birch_fence_gate, 5, 20);
		((HighConsintrationFire) BlockManager.highFire).setFireInfo(Blocks.jungle_fence_gate, 5, 20);
		((HighConsintrationFire) BlockManager.highFire).setFireInfo(Blocks.dark_oak_fence_gate, 5, 20);
		((HighConsintrationFire) BlockManager.highFire).setFireInfo(Blocks.acacia_fence_gate, 5, 20);
		((HighConsintrationFire) BlockManager.highFire).setFireInfo(Blocks.oak_fence, 5, 20);
		((HighConsintrationFire) BlockManager.highFire).setFireInfo(Blocks.spruce_fence, 5, 20);
		((HighConsintrationFire) BlockManager.highFire).setFireInfo(Blocks.birch_fence, 5, 20);
		((HighConsintrationFire) BlockManager.highFire).setFireInfo(Blocks.jungle_fence, 5, 20);
		((HighConsintrationFire) BlockManager.highFire).setFireInfo(Blocks.dark_oak_fence, 5, 20);
		((HighConsintrationFire) BlockManager.highFire).setFireInfo(Blocks.acacia_fence, 5, 20);
		((HighConsintrationFire) BlockManager.highFire).setFireInfo(Blocks.oak_stairs, 5, 20);
		((HighConsintrationFire) BlockManager.highFire).setFireInfo(Blocks.birch_stairs, 5, 20);
		((HighConsintrationFire) BlockManager.highFire).setFireInfo(Blocks.spruce_stairs, 5, 20);
		((HighConsintrationFire) BlockManager.highFire).setFireInfo(Blocks.jungle_stairs, 5, 20);
		((HighConsintrationFire) BlockManager.highFire).setFireInfo(Blocks.log, 5, 5);
		((HighConsintrationFire) BlockManager.highFire).setFireInfo(Blocks.log2, 5, 5);
		((HighConsintrationFire) BlockManager.highFire).setFireInfo(Blocks.leaves, 30, 60);
		((HighConsintrationFire) BlockManager.highFire).setFireInfo(Blocks.leaves2, 30, 60);
		((HighConsintrationFire) BlockManager.highFire).setFireInfo(Blocks.bookshelf, 30, 20);
		((HighConsintrationFire) BlockManager.highFire).setFireInfo(Blocks.tnt, 15, 100);
		((HighConsintrationFire) BlockManager.highFire).setFireInfo(Blocks.tallgrass, 60, 100);
		((HighConsintrationFire) BlockManager.highFire).setFireInfo(Blocks.double_plant, 60, 100);
		((HighConsintrationFire) BlockManager.highFire).setFireInfo(Blocks.yellow_flower, 60, 100);
		((HighConsintrationFire) BlockManager.highFire).setFireInfo(Blocks.red_flower, 60, 100);
		((HighConsintrationFire) BlockManager.highFire).setFireInfo(Blocks.deadbush, 60, 100);
		((HighConsintrationFire) BlockManager.highFire).setFireInfo(Blocks.wool, 30, 60);
		((HighConsintrationFire) BlockManager.highFire).setFireInfo(Blocks.vine, 15, 100);
		((HighConsintrationFire) BlockManager.highFire).setFireInfo(Blocks.coal_block, 5, 5);
		((HighConsintrationFire) BlockManager.highFire).setFireInfo(Blocks.hay_block, 60, 20);
		((HighConsintrationFire) BlockManager.highFire).setFireInfo(Blocks.carpet, 60, 20);
	}
	public void setFireInfo(Block blockIn, int encouragement, int flammability) {
		if (blockIn == Blocks.air) {
			throw new IllegalArgumentException("Tried to set air on fire... This is bad.");
		}
		this.encouragements.put(blockIn, Integer.valueOf(encouragement*3));
		this.flammabilities.put(blockIn, Integer.valueOf(flammability*3));
	}
	
	@Override
	public AxisAlignedBB getCollisionBoundingBox(World worldIn, BlockPos pos, IBlockState state) {
		return null;
	}
	@Override
	public boolean isOpaqueCube() {
		return false;
	}
	@Override
	public boolean isFullCube() {
		return false;
	}
	/**
	* Returns the quantity of items to drop on block destruction.
	*/
	@Override
	public int quantityDropped(Random random) {
		return 0;
	}
	/**
	* How many world ticks before ticking
	*/
	@Override
	public int tickRate(World worldIn) {
		return 30;
	}
	@Override
	public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand) {
		if (worldIn.getGameRules().getGameRuleBooleanValue("doFireTick")) {
			if (!this.canPlaceBlockAt(worldIn, pos)) {
				worldIn.setBlockToAir(pos);
			}
			Block block = worldIn.getBlockState(pos.down()).getBlock();
			boolean flag = block.isFireSource(worldIn, pos.down(), EnumFacing.UP);
			if (!flag && worldIn.isRaining() && this.canDie(worldIn, pos)) {
				worldIn.setBlockToAir(pos);
			}
			else {
				int i = age;
				if (i < 15) {
					worldIn.setBlockState(pos, state, 4);
				}
				worldIn.scheduleUpdate(pos, this, this.tickRate(worldIn) + rand.nextInt(10));
				if (!flag) {
					if (!this.canNeighborCatchFire(worldIn, pos)) {
						if (!World.doesBlockHaveSolidTopSurface(worldIn, pos.down()) || i > 3) {
							worldIn.setBlockToAir(pos);
						}
						return;
					}
					if (!this.canCatchFire(worldIn, pos.down(), EnumFacing.UP) && i == 15 && rand.nextInt(4) == 0) {
						worldIn.setBlockToAir(pos);
						return;
					}
				}
				boolean flag1 = worldIn.isBlockinHighHumidity(pos);
				byte b0 = 0;
				if (flag1) {
					b0 = -50;
				}
				this.tryCatchFire(worldIn, pos.east(), 300 + b0, rand, i, EnumFacing.WEST);
				this.tryCatchFire(worldIn, pos.west(), 300 + b0, rand, i, EnumFacing.EAST);
				this.tryCatchFire(worldIn, pos.down(), 250 + b0, rand, i, EnumFacing.UP);
				this.tryCatchFire(worldIn, pos.up(), 250 + b0, rand, i, EnumFacing.DOWN);
				this.tryCatchFire(worldIn, pos.north(), 300 + b0, rand, i, EnumFacing.SOUTH);
				this.tryCatchFire(worldIn, pos.south(), 300 + b0, rand, i, EnumFacing.NORTH);
				for (int j = -1; j <= 1; ++j) {
					for (int k = -1; k <= 1; ++k) {
						for (int l = -1; l <= 4; ++l) {
							if (j != 0 || l != 0 || k != 0) {
								int i1 = 100;
								if (l > 1) {
									i1 += (l - 1) * 100;
								}
								BlockPos blockpos1 = pos.add(j, l, k);
								int j1 = this.getNeighborEncouragement(worldIn, blockpos1);
								if (j1 > 0) {
									int k1 = (j1 + 40 + worldIn.getDifficulty().getDifficultyId() * 7) / (i + 30);
									if (flag1) {
										k1 /= 2;
									}
									if (k1 > 0 && rand.nextInt(i1) <= k1 && (!worldIn.isRaining() || !this.canDie(worldIn, blockpos1))) {
										int l1 = i + rand.nextInt(5) / 4;
										if (l1 > 15) {
											l1 = 15;
										}
										worldIn.setBlockState(blockpos1, state, 3);
									}
								}
							}
						}
					}
				}
			}
		}
	}
	protected boolean canDie(World worldIn, BlockPos pos) {
		return worldIn.canLightningStrike(pos) || worldIn.canLightningStrike(pos.west()) || worldIn.canLightningStrike(pos.east()) || worldIn.canLightningStrike(pos.north()) || worldIn.canLightningStrike(pos.south());
	}
	@Override
	public boolean requiresUpdates() {
		return false;
	}
	@Deprecated
	// Use Block.getFlammability
	public int getFlammability(Block blockIn) {
		Integer integer = (Integer) this.flammabilities.get(blockIn);
		return integer == null ? 0 : integer.intValue();
	}
	@Deprecated
	// Use Block.getFlammability
	public int getEncouragement(Block blockIn) {
		Integer integer = (Integer) this.encouragements.get(blockIn);
		return integer == null ? 0 : integer.intValue();
	}
	@Deprecated
	// Use tryCatchFire with face below
	private void catchOnFire(World worldIn, BlockPos pos, int chance, Random random, int age) {
		this.tryCatchFire(worldIn, pos, chance, random, age, EnumFacing.UP);
	}
	private void tryCatchFire(World worldIn, BlockPos pos, int chance, Random random, int age, EnumFacing face) {
		int k = worldIn.getBlockState(pos).getBlock().getFlammability(worldIn, pos, face);
		if (random.nextInt(chance) < k) {
			IBlockState iblockstate = worldIn.getBlockState(pos);
			if (random.nextInt(age + 10) < 5 && !worldIn.canLightningStrike(pos)) {
				int l = age + random.nextInt(5) / 4;
				if (l > 15) {
					l = 15;
				}
				worldIn.setBlockState(pos, this.getDefaultState(), 3);
			}
			else {
				worldIn.setBlockToAir(pos);
			}
			if (iblockstate.getBlock() == Blocks.tnt) {
				Blocks.tnt.onBlockDestroyedByPlayer(worldIn, pos, iblockstate.withProperty(BlockTNT.EXPLODE, Boolean.valueOf(true)));
			}
		}
	}
	private boolean canNeighborCatchFire(World worldIn, BlockPos pos) {
		EnumFacing[] aenumfacing = EnumFacing.values();
		int i = aenumfacing.length;
		for (int j = 0; j < i; ++j) {
			EnumFacing enumfacing = aenumfacing[j];
			if (this.canCatchFire(worldIn, pos.offset(enumfacing), enumfacing.getOpposite())) {
				return true;
			}
		}
		return false;
	}
	private int getNeighborEncouragement(World worldIn, BlockPos pos) {
		if (!worldIn.isAirBlock(pos)) {
			return 0;
		}
		else {
			int i = 0;
			EnumFacing[] aenumfacing = EnumFacing.values();
			int j = aenumfacing.length;
			for (int k = 0; k < j; ++k) {
				EnumFacing enumfacing = aenumfacing[k];
				i = Math.max(worldIn.getBlockState(pos.offset(enumfacing)).getBlock().getFlammability(worldIn, pos.offset(enumfacing), enumfacing.getOpposite()), i);
			}
			return i;
		}
	}
	/**
	* Returns if this block is collidable (only used by Fire). Args: x, y, z
	*/
	@Override
	public boolean isCollidable() {
		return false;
	}
	/**
	* Checks if the block can be caught on fire
	*/
	@Deprecated
	// Use canCatchFire with face sensitive version below
	public boolean canCatchFire(IBlockAccess worldIn, BlockPos pos) {
		return canCatchFire(worldIn, pos, EnumFacing.UP);
	}
	@Override
	public boolean canPlaceBlockAt(World worldIn, BlockPos pos) {
		return World.doesBlockHaveSolidTopSurface(worldIn, pos.down()) || this.canNeighborCatchFire(worldIn, pos);
	}
	/**
	* Called when a neighboring block changes.
	*/
	@Override
	public void onNeighborBlockChange(World worldIn, BlockPos pos, IBlockState state, Block neighborBlock) {
		if (!World.doesBlockHaveSolidTopSurface(worldIn, pos.down()) && !this.canNeighborCatchFire(worldIn, pos)) {
			worldIn.setBlockToAir(pos);
		}
	}
	@Override
	public void onBlockAdded(World worldIn, BlockPos pos, IBlockState state) {
		if (worldIn.provider.getDimensionId() > 2 || !((SkyPortal) BlockManager.skyPortal).func_176548_d(worldIn, pos)) {
			if (!World.doesBlockHaveSolidTopSurface(worldIn, pos.down()) && !this.canNeighborCatchFire(worldIn, pos)) {
				worldIn.setBlockToAir(pos);
			}
			else {
				worldIn.scheduleUpdate(pos, this, this.tickRate(worldIn) + worldIn.rand.nextInt(10));
			}
		}
	}
	@Override
	@SideOnly(Side.CLIENT)
	public void randomDisplayTick(World worldIn, BlockPos pos, IBlockState state, Random rand) {
		if (rand.nextInt(24) == 0) {
			worldIn.playSound(pos.getX() + 0.5F, pos.getY() + 0.5F, pos.getZ() + 0.5F, "fire.fire", 1.0F + rand.nextFloat(), rand.nextFloat() * 0.7F + 0.3F, false);
		}
		int i;
		double d0;
		double d1;
		double d2;
		if (!World.doesBlockHaveSolidTopSurface(worldIn, pos.down()) && !Blocks.fire.canCatchFire(worldIn, pos.down(), EnumFacing.UP)) {
			if (((HighConsintrationFire) BlockManager.highFire).canCatchFire(worldIn, pos.west(), EnumFacing.EAST)) {
				for (i = 0; i < 2; ++i) {
					d0 = pos.getX() + rand.nextDouble() * 0.10000000149011612D;
					d1 = pos.getY() + rand.nextDouble();
					d2 = pos.getZ() + rand.nextDouble();
					worldIn.spawnParticle(EnumParticleTypes.SMOKE_LARGE, d0, d1, d2, 0.0D, 0.0D, 0.0D, new int[0]);
				}
			}
			if (((HighConsintrationFire) BlockManager.highFire).canCatchFire(worldIn, pos.east(), EnumFacing.WEST)) {
				for (i = 0; i < 2; ++i) {
					d0 = pos.getX() + 1 - rand.nextDouble() * 0.10000000149011612D;
					d1 = pos.getY() + rand.nextDouble();
					d2 = pos.getZ() + rand.nextDouble();
					worldIn.spawnParticle(EnumParticleTypes.SMOKE_LARGE, d0, d1, d2, 0.0D, 0.0D, 0.0D, new int[0]);
				}
			}
			if (((HighConsintrationFire) BlockManager.highFire).canCatchFire(worldIn, pos.north(), EnumFacing.SOUTH)) {
				for (i = 0; i < 2; ++i) {
					d0 = pos.getX() + rand.nextDouble();
					d1 = pos.getY() + rand.nextDouble();
					d2 = pos.getZ() + rand.nextDouble() * 0.10000000149011612D;
					worldIn.spawnParticle(EnumParticleTypes.SMOKE_LARGE, d0, d1, d2, 0.0D, 0.0D, 0.0D, new int[0]);
				}
			}
			if (((HighConsintrationFire) BlockManager.highFire).canCatchFire(worldIn, pos.south(), EnumFacing.NORTH)) {
				for (i = 0; i < 2; ++i) {
					d0 = pos.getX() + rand.nextDouble();
					d1 = pos.getY() + rand.nextDouble();
					d2 = pos.getZ() + 1 - rand.nextDouble() * 0.10000000149011612D;
					worldIn.spawnParticle(EnumParticleTypes.SMOKE_LARGE, d0, d1, d2, 0.0D, 0.0D, 0.0D, new int[0]);
				}
			}
			if (((HighConsintrationFire) BlockManager.highFire).canCatchFire(worldIn, pos.up(), EnumFacing.DOWN)) {
				for (i = 0; i < 2; ++i) {
					d0 = pos.getX() + rand.nextDouble();
					d1 = pos.getY() + 1 - rand.nextDouble() * 0.10000000149011612D;
					d2 = pos.getZ() + rand.nextDouble();
					worldIn.spawnParticle(EnumParticleTypes.SMOKE_LARGE, d0, d1, d2, 0.0D, 0.0D, 0.0D, new int[0]);
				}
			}
		}
		else {
			for (i = 0; i < 3; ++i) {
				d0 = pos.getX() + rand.nextDouble();
				d1 = pos.getY() + rand.nextDouble() * 0.5D + 0.5D;
				d2 = pos.getZ() + rand.nextDouble();
				worldIn.spawnParticle(EnumParticleTypes.SMOKE_LARGE, d0, d1, d2, 0.0D, 0.0D, 0.0D, new int[0]);
			}
		}
	}
	/**
	* Get the MapColor for this Block and the given BlockState
	*/
	@Override
	public MapColor getMapColor(IBlockState state) {
		return MapColor.tntColor;
	}
	@Override
	@SideOnly(Side.CLIENT)
	public EnumWorldBlockLayer getBlockLayer() {
		return EnumWorldBlockLayer.CUTOUT;
	}
	/**
	* Convert the given metadata into a BlockState for this Block
	*/
	@Override
	public IBlockState getStateFromMeta(int meta) {
		return this.getDefaultState();
	}
	/**
	* Convert the BlockState into the correct metadata value
	*/
	@Override
	public int getMetaFromState(IBlockState state) {
		return 0;
	}
	@Override
	protected BlockState createBlockState() {
		return new BlockState(this, new IProperty[] {NORTH, EAST, SOUTH, WEST, UPPER, FLIP,
	ALT });
	}
	/* ================================= Forge Start
	* ====================================== */
	public boolean canCatchFire(IBlockAccess world, BlockPos pos, EnumFacing face) {
		return world.getBlockState(pos).getBlock().isFlammable(world, pos, face);
	}
}
