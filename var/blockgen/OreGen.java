package var.blockgen;

import java.util.Random;

import var.block.BlockManager;
import var.item.ItemManager;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class OreGen implements IWorldGenerator {
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
	IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		/* runs 'generateNether' or 'generateSurface' depending on which dimension you're loading */
			switch(world.provider.dimensionId) {
			case -1: generateNether(world, random, chunkX*16, chunkZ*16);
			break;
			case 0: generateSurface(world, random, chunkX*16, chunkZ*16);
			break;
			}
		}
	
	public void generateSurface(World world, Random random, int x, int z) {
		this.addOreSpawn(BlockManager.titaniumOre, world, random, x, z, 16, 16, 5, 10, 1, 32);
		this.addOreSpawn(BlockManager.platinumOre, world, random, x, z, 16, 16, 3, 3, 1, 16);
		this.addOreSpawn(BlockManager.steelOre, world, random, x, z, 16, 16, 6, 6, 1, 48);
		this.addOreSpawn(BlockManager.copperOre, world, random, x, z, 16, 16, 6, 5, 1, 48);
	}
	
	public void generateNether(World world, Random random, int x, int z) {
	
	}
	
	public void addOreSpawn(Block block, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int chancesToSpawn, int minY, int maxY ){
		for(int i = 0; i < chancesToSpawn; i++){
			int posX = blockXPos + random.nextInt(maxX);
			int posY = minY + random.nextInt(maxY -minY);
			int posZ = blockZPos + random.nextInt(maxZ);
			new WorldGenMinable(block, maxVeinSize).generate(world, random, posX, posY, posZ);
		}
	}
}