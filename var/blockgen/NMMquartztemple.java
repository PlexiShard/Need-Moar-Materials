package var.blockgen;

import java.util.Random;

import var.block.BlockManager;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class NMMquartztemple extends WorldGenerator{

	@Override
	public boolean generate(World world, Random rand, int i, int j, int k) {
		if(world.getBlock(i, j-1, k) == Blocks.air || world.getBlock(i+14, j-1, k+14) == Blocks.air || world.getBlock(i+14,j-1,k) == Blocks.air || world.getBlock(i,j-1,k+14)==Blocks.air || world.getBlock(i,j+4,k)!=Blocks.air || world.getBlock(i+14, j+4, k+14) != Blocks.air || world.getBlock(i+14,j+4,k) != Blocks.air || world.getBlock(i,j+4,k+14)!=Blocks.air) {
			return false;
			} else if (world.getBlock(i, j-1, k)!=Blocks.air&&world.getBlock(i,j-1,k)!=Blocks.water&&world.getBlock(i,j,k)==Blocks.air){
			world.setBlock(i + 0, j + 0, k + 5, Blocks.quartz_block);
			world.setBlock(i + 0, j + 0, k + 6, Blocks.quartz_block);
			world.setBlock(i + 0, j + 0, k + 8, Blocks.quartz_block);
			world.setBlock(i + 0, j + 0, k + 9, Blocks.quartz_block);
			world.setBlock(i + 0, j + 1, k + 5, Blocks.quartz_block);
			world.setBlock(i + 0, j + 1, k + 6, Blocks.quartz_block);
			world.setBlock(i + 0, j + 1, k + 8, Blocks.quartz_block);
			world.setBlock(i + 0, j + 1, k + 9, Blocks.quartz_block);
			world.setBlock(i + 0, j + 2, k + 5, Blocks.quartz_block);
			world.setBlock(i + 0, j + 2, k + 6, Blocks.quartz_block);
			world.setBlock(i + 0, j + 2, k + 7, Blocks.quartz_block);
			world.setBlock(i + 0, j + 2, k + 8, Blocks.quartz_block);
			world.setBlock(i + 0, j + 2, k + 9, Blocks.quartz_block);
			world.setBlock(i + 1, j + 0, k + 3, Blocks.quartz_block);
			world.setBlock(i + 1, j + 0, k + 4, Blocks.quartz_block);
			world.setBlock(i + 1, j + 0, k + 10, Blocks.quartz_block);
			world.setBlock(i + 1, j + 0, k + 11, Blocks.quartz_block);
			world.setBlock(i + 1, j + 1, k + 3, Blocks.quartz_block);
			world.setBlock(i + 1, j + 1, k + 4, Blocks.quartz_block);
			world.setBlock(i + 1, j + 1, k + 10, Blocks.quartz_block);
			world.setBlock(i + 1, j + 1, k + 11, Blocks.quartz_block);
			world.setBlock(i + 1, j + 2, k + 4, Blocks.quartz_block);
			world.setBlock(i + 1, j + 2, k + 10, Blocks.quartz_block);
			world.setBlock(i + 2, j + 0, k + 2, Blocks.quartz_block);
			world.setBlock(i + 2, j + 0, k + 12, Blocks.quartz_block);
			world.setBlock(i + 3, j + 0, k + 1, Blocks.quartz_block);
			world.setBlock(i + 3, j + 0, k + 13, Blocks.quartz_block);
			world.setBlock(i + 3, j + 1, k + 13, Blocks.quartz_block);
			world.setBlock(i + 4, j + 0, k + 1, Blocks.quartz_block);
			world.setBlock(i + 4, j + 0, k + 6, Blocks.quartz_block);
			world.setBlock(i + 4, j + 0, k + 7, Blocks.quartz_block);
			world.setBlock(i + 4, j + 0, k + 8, Blocks.quartz_block);
			world.setBlock(i + 4, j + 0, k + 13, Blocks.quartz_block);
			world.setBlock(i + 4, j + 1, k + 1, Blocks.quartz_block);
			world.setBlock(i + 4, j + 1, k + 6, Blocks.quartz_block);
			world.setBlock(i + 4, j + 1, k + 7, Blocks.quartz_block);
			world.setBlock(i + 4, j + 1, k + 8, Blocks.quartz_block);
			world.setBlock(i + 4, j + 1, k + 13, Blocks.quartz_block);
			world.setBlock(i + 4, j + 2, k + 6, Blocks.quartz_block);
			world.setBlock(i + 4, j + 2, k + 7, Blocks.quartz_block);
			world.setBlock(i + 4, j + 2, k + 8, Blocks.quartz_block);
			world.setBlock(i + 5, j + 0, k + 0, Blocks.quartz_block);
			world.setBlock(i + 5, j + 0, k + 5, Blocks.quartz_block);
			world.setBlock(i + 5, j + 0, k + 9, Blocks.quartz_block);
			world.setBlock(i + 5, j + 0, k + 14, Blocks.quartz_block);
			world.setBlock(i + 5, j + 1, k + 0, Blocks.quartz_block);
			world.setBlock(i + 5, j + 1, k + 5, Blocks.quartz_block);
			world.setBlock(i + 5, j + 1, k + 9, Blocks.quartz_block);
			world.setBlock(i + 5, j + 1, k + 14, Blocks.quartz_block);
			world.setBlock(i + 5, j + 2, k + 5, Blocks.quartz_block);
			world.setBlock(i + 5, j + 2, k + 9, Blocks.quartz_block);
			world.setBlock(i + 5, j + 2, k + 14, Blocks.quartz_block);
			world.setBlock(i + 6, j + 0, k + 0, Blocks.quartz_block);
			world.setBlock(i + 6, j + 0, k + 4, Blocks.quartz_block);
			if (rand.nextInt(3)+1 > 2) {world.setBlock(i + 6, j + 0, k + 6, BlockManager.titaniumBlock);}
			if (rand.nextInt(3)+1 > 2) {world.setBlock(i + 6, j + 0, k + 7, BlockManager.steelBlock);}
			if (rand.nextInt(3)+1 > 2) {world.setBlock(i + 6, j + 0, k + 8, BlockManager.platinumBlock);}
			world.setBlock(i + 6, j + 0, k + 10, Blocks.quartz_block);
			world.setBlock(i + 6, j + 0, k + 14, Blocks.quartz_block);
			world.setBlock(i + 6, j + 1, k + 0, Blocks.quartz_block);
			world.setBlock(i + 6, j + 1, k + 4, Blocks.quartz_block);
			world.setBlock(i + 6, j + 1, k + 10, Blocks.quartz_block);
			world.setBlock(i + 6, j + 1, k + 14, Blocks.quartz_block);
			world.setBlock(i + 6, j + 2, k + 0, Blocks.quartz_block);
			world.setBlock(i + 6, j + 2, k + 4, Blocks.quartz_block);
			world.setBlock(i + 6, j + 2, k + 10, Blocks.quartz_block);
			world.setBlock(i + 6, j + 2, k + 14, Blocks.quartz_block);
			world.setBlock(i + 7, j + 0, k + 4, Blocks.quartz_block);
			if (rand.nextInt(3)+1 > 2) {world.setBlock(i + 7, j + 0, k + 6, BlockManager.steelBlock);}
			if (rand.nextInt(3)+1 > 2) {world.setBlock(i + 7, j + 0, k + 7, BlockManager.titaniumBlock);}
			if (rand.nextInt(3)+1 > 2) {world.setBlock(i + 7, j + 0, k + 8, BlockManager.platinumBlock);}
			world.setBlock(i + 7, j + 0, k + 10, Blocks.quartz_block);
			world.setBlock(i + 7, j + 1, k + 4, Blocks.quartz_block);
			world.setBlock(i + 7, j + 1, k + 10, Blocks.quartz_block);
			world.setBlock(i + 7, j + 2, k + 0, Blocks.quartz_block);
			world.setBlock(i + 7, j + 2, k + 4, Blocks.quartz_block);
			world.setBlock(i + 7, j + 2, k + 10, Blocks.quartz_block);
			world.setBlock(i + 7, j + 2, k + 14, Blocks.quartz_block);
			world.setBlock(i + 8, j + 0, k + 0, Blocks.quartz_block);
			world.setBlock(i + 8, j + 0, k + 4, Blocks.quartz_block);
			if (rand.nextInt(3)+1 > 2) {world.setBlock(i + 8, j + 0, k + 6, BlockManager.steelBlock);}
			if (rand.nextInt(3)+1 > 2) {world.setBlock(i + 8, j + 0, k + 7, BlockManager.copperBlock);}
			if (rand.nextInt(3)+1 > 2) {world.setBlock(i + 8, j + 0, k + 8, BlockManager.copperBlock);}
			world.setBlock(i + 8, j + 0, k + 10, Blocks.quartz_block);
			world.setBlock(i + 8, j + 0, k + 14, Blocks.quartz_block);
			world.setBlock(i + 8, j + 1, k + 0, Blocks.quartz_block);
			world.setBlock(i + 8, j + 1, k + 4, Blocks.quartz_block);
			world.setBlock(i + 8, j + 1, k + 10, Blocks.quartz_block);
			world.setBlock(i + 8, j + 1, k + 14, Blocks.quartz_block);
			world.setBlock(i + 8, j + 2, k + 0, Blocks.quartz_block);
			world.setBlock(i + 8, j + 2, k + 4, Blocks.quartz_block);
			world.setBlock(i + 8, j + 2, k + 10, Blocks.quartz_block);
			world.setBlock(i + 8, j + 2, k + 14, Blocks.quartz_block);
			world.setBlock(i + 9, j + 0, k + 0, Blocks.quartz_block);
			world.setBlock(i + 9, j + 0, k + 5, Blocks.quartz_block);
			world.setBlock(i + 9, j + 0, k + 9, Blocks.quartz_block);
			world.setBlock(i + 9, j + 0, k + 14, Blocks.quartz_block);
			world.setBlock(i + 9, j + 1, k + 0, Blocks.quartz_block);
			world.setBlock(i + 9, j + 1, k + 5, Blocks.quartz_block);
			world.setBlock(i + 9, j + 1, k + 9, Blocks.quartz_block);
			world.setBlock(i + 9, j + 1, k + 14, Blocks.quartz_block);
			world.setBlock(i + 9, j + 2, k + 0, Blocks.quartz_block);
			world.setBlock(i + 9, j + 2, k + 5, Blocks.quartz_block);
			world.setBlock(i + 9, j + 2, k + 9, Blocks.quartz_block);
			world.setBlock(i + 10, j + 0, k + 1, Blocks.quartz_block);
			world.setBlock(i + 10, j + 0, k + 6, Blocks.quartz_block);
			world.setBlock(i + 10, j + 0, k + 7, Blocks.quartz_block);
			world.setBlock(i + 10, j + 0, k + 8, Blocks.quartz_block);
			world.setBlock(i + 10, j + 0, k + 13, Blocks.quartz_block);
			world.setBlock(i + 10, j + 1, k + 1, Blocks.quartz_block);
			world.setBlock(i + 10, j + 1, k + 6, Blocks.quartz_block);
			world.setBlock(i + 10, j + 1, k + 7, Blocks.quartz_block);
			world.setBlock(i + 10, j + 1, k + 8, Blocks.quartz_block);
			world.setBlock(i + 10, j + 2, k + 1, Blocks.quartz_block);
			world.setBlock(i + 10, j + 2, k + 6, Blocks.quartz_block);
			world.setBlock(i + 10, j + 2, k + 7, Blocks.quartz_block);
			world.setBlock(i + 10, j + 2, k + 8, Blocks.quartz_block);
			world.setBlock(i + 11, j + 0, k + 1, Blocks.quartz_block);
			world.setBlock(i + 11, j + 0, k + 13, Blocks.quartz_block);
			world.setBlock(i + 11, j + 1, k + 1, Blocks.quartz_block);
			world.setBlock(i + 11, j + 2, k + 1, Blocks.quartz_block);
			world.setBlock(i + 12, j + 0, k + 2, Blocks.quartz_block);
			world.setBlock(i + 12, j + 0, k + 12, Blocks.quartz_block);
			world.setBlock(i + 12, j + 1, k + 2, Blocks.quartz_block);
			world.setBlock(i + 12, j + 1, k + 12, Blocks.quartz_block);
			world.setBlock(i + 13, j + 0, k + 3, Blocks.quartz_block);
			world.setBlock(i + 13, j + 0, k + 4, Blocks.quartz_block);
			world.setBlock(i + 13, j + 0, k + 10, Blocks.quartz_block);
			world.setBlock(i + 13, j + 0, k + 11, Blocks.quartz_block);
			world.setBlock(i + 13, j + 1, k + 10, Blocks.quartz_block);
			world.setBlock(i + 13, j + 1, k + 11, Blocks.quartz_block);
			world.setBlock(i + 13, j + 2, k + 10, Blocks.quartz_block);
			world.setBlock(i + 13, j + 2, k + 11, Blocks.quartz_block);
			world.setBlock(i + 14, j + 0, k + 5, Blocks.quartz_block);
			world.setBlock(i + 14, j + 0, k + 6, Blocks.quartz_block);
			world.setBlock(i + 14, j + 0, k + 8, Blocks.quartz_block);
			world.setBlock(i + 14, j + 0, k + 9, Blocks.quartz_block);
			world.setBlock(i + 14, j + 1, k + 5, Blocks.quartz_block);
			world.setBlock(i + 14, j + 1, k + 6, Blocks.quartz_block);
			world.setBlock(i + 14, j + 1, k + 8, Blocks.quartz_block);
			world.setBlock(i + 14, j + 1, k + 9, Blocks.quartz_block);
			world.setBlock(i + 14, j + 2, k + 7, Blocks.quartz_block);
			world.setBlock(i + 14, j + 2, k + 8, Blocks.quartz_block);
			world.setBlock(i + 14, j + 2, k + 9, Blocks.quartz_block);
			}
			return true;
		}

}
