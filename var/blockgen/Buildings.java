package var.blockgen;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;
import var.blockgen.NMMtemple;

public class Buildings implements IWorldGenerator {
	
	
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		// TODO Auto-generated method stub
		switch(world.provider.dimensionId) {
		case -1: generateNether(world, random, chunkX*16, chunkZ*16);
		break;
		case 0: generateSurface(world, random, chunkX*16, chunkZ*16);
		break;
		}
		
	}
	public void generateSurface(World world, Random random, int x, int z) {
		spawnTemple(world, random, x, z, 1, 56, 200);
		spawnQuartzTemple(world, random, x, z, 1, 56, 200);
	}
	
	public void generateNether(World world, Random random, int x, int z) {
		
	}
	public void spawnTemple(World world, Random random, int blockXPos, int blockZPos, int chancesToSpawn, int minY, int maxY ) {
		for(int i = 0; i < chancesToSpawn; i++){
			int posX = blockXPos + random.nextInt(16);
			int posY = minY + random.nextInt(maxY -minY);
			int posZ = blockZPos + random.nextInt(16);
			(new NMMtemple()).generate(world, random, posX, posY, posZ);
		}
	}
	
	public void spawnQuartzTemple(World world, Random random, int blockXPos, int blockZPos, int chancesToSpawn, int minY, int maxY ) {
		for(int i = 0; i < chancesToSpawn; i++){
			int posX = blockXPos + random.nextInt(16);
			int posY = minY + random.nextInt(maxY -minY);
			int posZ = blockZPos + random.nextInt(16);
			(new NMMquartztemple()).generate(world, random, posX, posY, posZ);
		}
	}
}
