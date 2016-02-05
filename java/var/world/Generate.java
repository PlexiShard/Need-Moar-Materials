package var.world;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;
import var.block.BlockManager;

public class Generate implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch(world.provider.getDimensionId()) {
		case -1: generateNether(world, random, chunkX*16, chunkZ*16);
			break;
		case 0: generateSurface(world, random, chunkX*16, chunkZ*16);
			break;
		}
	}
	
	public void generateSurface(World world, Random random, int x, int z) {
		this.addOreSpawn(BlockManager.titaniumOre, world, random, x, z, 5, 10, 1, 32);
		this.addOreSpawn(BlockManager.platinumOre, world, random, x, z, 3, 3, 1, 16);
		this.addOreSpawn(BlockManager.steelOre, world, random, x, z, 6, 6, 1, 48);
		this.addOreSpawn(BlockManager.copperOre, world, random, x, z, 6, 5, 1, 48);
	}
	
	public void generateNether(World world, Random random, int x, int z) {
	
	}
	
	public void addOreSpawn(Block block, World world, Random random, int chunkX, int chunkZ, int maxVeinSize, int chancesToSpawn, int minY, int maxY ){
		for(int i = 0; i < chancesToSpawn; i++){
			int posX = chunkX + random.nextInt(16);
			int posY = minY + random.nextInt(maxY -minY);
			int posZ = chunkZ + random.nextInt(16);
			new WorldGenMinable(block.getDefaultState(), maxVeinSize).generate(world, random, new BlockPos(posX, posY, posZ));
		}
	}

}
