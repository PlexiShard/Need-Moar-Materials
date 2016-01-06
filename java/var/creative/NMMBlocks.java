package var.creative;

import var.block.BlockManager;
import var.item.TitaniumManager;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class NMMBlocks extends CreativeTabs {

	public NMMBlocks(String label) 
	{	super(label);}

	@SideOnly(Side.CLIENT)
	public Item getTabIconItem() 
	{	return Item.getItemFromBlock(BlockManager.titaniumOre);}

	@SideOnly(Side.CLIENT)
	public ItemStack getIconItemStack() {
		return new ItemStack(BlockManager.titaniumBlock, 1);
	}
	
}
