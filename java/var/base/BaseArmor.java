package var.base;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.client.renderer.entity.RenderPlayer;;

public class BaseArmor extends ItemArmor{

	/**
	 * Creates BaseArmor as {@link ItemArmor}, with additional functions and variables
	 * 
	 * @param material
	 * The {@link ArmorMaterial} used for this {@link ItemArmor}
	 * 
	 * @param renderIndex
	 * Used on {@link RenderPlayer} to select the correspondent armor to be rendered on the player: 0 is cloth, 1 is chain, 2 is iron, 3 is diamond and 4 is gold.
	 * 
	 * @param armorType
	 * Stores the armor type: 0 is helmet, 1 is plate, 2 is legs and 3 is boots */
	public BaseArmor(ArmorMaterial material, int renderIndex, int armorType) {
		super(material, renderIndex, armorType);
	}
	public BaseArmor(ArmorMaterial material, int armorType, String uname, CreativeTabs tab, String texture) {
		super(material, 0, armorType);
		this.setupThis(uname, tab, texture);
	}
	
	/**Used to temporarily store the CreativeTab until it is registered*/
	public static CreativeTabs tab;
	/**Used to temporarily store the unlocalizedName until it is registered*/
	public static String unlocalizedName;
	/**Stores the link to the {@link BaseArmor}'s texture json file until it can be registered in the {@link var.main.MainRegistry#Load Init} stage*/
	public String texture;

	public String texture() {return texture;}
	
	/**Returns an {@link Item} with {@link ItemArmor} functions
	 * 
	 * @deprecated
	 * @param newname
	 * New value for BaseArmor.name
	 * 
	 * @param newtab
	 * The {@link CreativeTabs} which you want the Armor to be found under
	 * 
	 * @param newuname
	 * The value you want BaseArmor to utilize for its unlocalizedName
	 * 
	 * @return 
	 * An item with a set {@link CreativeTabs} and unlocalizedName*/
	public Item setup(String newname, CreativeTabs newtab, String newuname) {
		tab = newtab;
		this.setCreativeTab(tab);
		unlocalizedName = newuname;
		this.setUnlocalizedName(unlocalizedName);
		return this;
	}
	
	/**Returns an {@link Item} with {@link ItemArmor} functions
	 * 
	 * @param newtab
	 * The {@link CreativeTabs} which you want the Armor to be found under
	 * 
	 * @param newuname
	 * The value you want BaseArmor to utilize for its unlocalizedName
	 * 
	 * @return 
	 * An item with a set {@link CreativeTabs} and unlocalizedName*/
	public Item setup(CreativeTabs newtab, String newuname) {
		tab = newtab;
		this.setCreativeTab(tab);
		unlocalizedName = newuname;
		this.setUnlocalizedName(unlocalizedName);
		return this;
	}
	
	/**Sets the {@link BaseArmor}'s own variables so it can be used like an {@link Item} but with easier access to textures
	 * @param newuname The UnlocalizedName to be used.
	 * @param newtab The {@link CreativeTabs CreativeTab} which the {@link BaseArmor} will be listed under
	 * @param texture The name of the .json file the texture will use. Called by the {@link var.main.TextureHandler TextureHandler} and {@link var.main.ClientProxy ClientProxy}
	 * */
	public void setupThis(String newuname, CreativeTabs newtab, String texture) 
	{	tab = newtab;
		this.setCreativeTab(tab);
		unlocalizedName = newuname;
		this.setUnlocalizedName(unlocalizedName);
		this.texture = texture;
	}
	
	/**Sets the Armor Texture according to this.getArmorMaterial, allowing automatic texture setting.
	 * 
	 * @param stack
	 * The ItemStack of the Armor
	 * 
	 * @param entity
	 * The Entity wearing the Armor
	 * 
	 * @param slot
	 * The slot the Armor fits in (0 = helm, 1 = chest, 2 = leggings, 3 = boots)
	 * 
	 * @param type
	 * The subtype, can be null or "overlay"
	 * 
	 * @return A String pointing to a png file in <i>/assets/nmm/textures/models/armor/</i>, with a name based on the details of the Armor
	 * */
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		if(slot == 0 || slot == 1 || slot == 3) {
			return "nmm:textures/models/armor/"+this.getArmorMaterial().toString().toLowerCase()+"_layer_1.png";
		}
		else if(slot == 2) {
			return "nmm:textures/models/armor/"+this.getArmorMaterial().toString().toLowerCase()+"_layer_2.png";
		} else {
			return null;
		}
	}	
}