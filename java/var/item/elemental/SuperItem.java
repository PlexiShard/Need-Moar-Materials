package var.item.elemental;

import java.util.Random;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import var.base.BaseItem;
import var.block.BlockManager;

public class SuperItem extends BaseItem {

	public SuperItem(String uname, CreativeTabs tab, String texture)
	{	setupThis(uname, tab, texture);}

	@Override
	public boolean onItemUse(ItemStack stack, EntityPlayer playerIn, World world, BlockPos pos, EnumFacing side, float hitX, float hitY, float hitZ) {
		Random rand = new Random();
		int chance = rand.nextInt(4);
		if (chance == 0){
			world.setBlockState(pos, BlockManager.platinumBlock.getDefaultState());
			return true;
		} else if (chance == 1) {
			world.setBlockState(pos, BlockManager.titaniumBlock.getDefaultState());
			return true;
		} else if (chance == 2) {
			world.setBlockState(pos, BlockManager.copperBlock.getDefaultState());
			return true;
		} else if (chance == 3) {
			world.setBlockState(pos, BlockManager.steelBlock.getDefaultState());
			return true;
		} else {
			return false;
		}
		
		
	}
	
}
