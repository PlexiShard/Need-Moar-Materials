package var.base;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BaseItem extends Item implements IItem {

	public static String name;
	public static String uname;
	public static String texture;
	public static CreativeTabs tab;
	
	public String getName() {return name();}
	public String getUName() {return uname();}
	public String getTexture() {return texture();}
	public CreativeTabs getTab() {return tab();}
	
	public String name() {return name;}
	public String uname() {return uname;}
	public String texture() {return texture;}
	public CreativeTabs tab() {return tab;}
	
	public Item setup(String newuname, CreativeTabs newtab, String texture) 
	{	tab = newtab;
		this.setCreativeTab(tab);
		uname = newuname;
		this.setUnlocalizedName(uname);
		return this;
}	}
