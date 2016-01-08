package var.base;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BaseCreativeTab extends CreativeTabs {
	
	Item tabIcon;
	ItemStack tabIconItemStack;
	
	public BaseCreativeTab(String label) {
		super(label);
		// TODO Auto-generated constructor stub
	}

	public BaseCreativeTab(String label, Item icon) 
	{	super(label);
		this.tabIcon = icon;
		this.tabIconItemStack = new ItemStack(tabIcon, 1);
	}
	
	public void setTabIcon(Item icon)
	{	this.tabIcon = icon;
		this.tabIconItemStack = new ItemStack(tabIcon, 1);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public Item getTabIconItem() 
	{	return tabIcon;}

	@Override
	@SideOnly(Side.CLIENT)
	public ItemStack getIconItemStack()
	{	return tabIconItemStack;}
}
