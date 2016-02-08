package var.base;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BaseCreativeTab extends CreativeTabs {
	/**Variable to be null until the {@link Item} and it's texture have been initialized*/
	Item tabIcon;
	/**Variable to be null until the {@link ItemStack} and it's texture have been initialized*/
	ItemStack tabIconItemStack;
	
	/**Initializes a {@link CreativeTabs} with a label and the {@link setTabIcon} method
	 * @param label
	 * Label to be used in the {@link CreativeTabs}*/
	public BaseCreativeTab(String label) {
		super(label);
		// TODO Auto-generated constructor stub
	}

	/**Initializes a {@link CreativeTabs} (Does not work without {@link #setTabIcon})
	 * @deprecated
	 * Does not work
	 * @param label
	 * Label to be used in the {@link CreativeTabs}
	 * @param icon
	 * Icon to be used in the {@link CreativeTabs}*/
	public BaseCreativeTab(String label, Item icon) 
	{	super(label);
		this.tabIcon = icon;
		this.tabIconItemStack = new ItemStack(tabIcon, 1);
	}
	/**Sets an Item to serve as a {@link CreativeTabs}'s icon.
	 * <br>
	 * <br>
	 * Used in {@link var.main.ClientProxy} after Items and their textures are registered, to avoid errors
	 * 
	 * @param icon
	 * The {@link Item} to be used for the {@link CreativeTabs} icon*/
	public void setTabIcon(Item icon)
	{	this.tabIcon = icon;
		this.tabIconItemStack = new ItemStack(tabIcon, 1);
	}
	
	/**Returns the current state of {@link #tabIcon}.
	 * <br>
	 * <br>
	 * Run whenever the tab is rendered
	 * @throws NullPointerException
	 * If Minecraft tries to render the tab but {@link tabIcon} is null or the item has not been textured*/
	@Override
	@SideOnly(Side.CLIENT)
	public Item getTabIconItem() 
	{	return tabIcon;}

	/**Returns the current state of {@link #tabIconItemStack}.
	 * <br>
	 * <br>
	 * Run whenever the tab is rendered
	 * @throws NullPointerException
	 * If Minecraft tries to render the tab but {@link tabIcon} or {@link tabIconItemStack} is null or the item has not been textured*/
	@Override
	@SideOnly(Side.CLIENT)
	public ItemStack getIconItemStack()
	{	return tabIconItemStack;}
}
