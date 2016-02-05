package var.base;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BaseItem extends Item {

	/**Stores the UnlocalizedName until it can be registered*/
	public String uname;
	/**Stores the link to the {@link Item}'s texture json file until it can be registered in the {@link var.main.MainRegistry#Load Init} stage*/
	public String texture;
	/**Stores the {@link CreativeTabs CreativeTab} until the {@link Item} can be registered under it*/
	public CreativeTabs tab;

	/**@return the current state of {@link BaseItem#uname}*/
	public String uname() {return uname;}
	/**@return the current state of {@link BaseItem#texture}*/
	public String texture() {return texture;}
	/**@return the current state of {@link BaseItem#tab}*/
	public CreativeTabs tab() {return tab;}
	
	/**Creates an Item which is automatically textured, named, and tabbed
	 * @param newuname The UnlocalizedName to be used in the return {@link Item}
	 * @param newtab The {@link CreativeTabs CreativeTab} which the return {@link Item} will be listed under
	 * @param texture The name of the .json file the texture will use. Called by the {@link var.main.TextureHandler TextureHandler} and {@link var.main.ClientProxy ClientProxy}
	 * @return An {@link Item} with a set unlocalizedName, {@link CreativeTabs CreativeTab}, and texture .json*/
	public Item setup(String newuname, CreativeTabs newtab, String texture) 
	{	tab = newtab;
		this.setCreativeTab(tab);
		uname = newuname;
		this.setUnlocalizedName(uname);
		this.texture = texture;
		return this;
}	}
