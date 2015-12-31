package var.base;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class BaseArmor extends ItemArmor{

	public BaseArmor(ArmorMaterial material, int renderIndex, int armorType) {
		super(material, renderIndex, armorType);
		// TODO Auto-generated constructor stub
	}
	
	
	public static String name;
	public static CreativeTabs tab;
	public static String unlocalizedName;

	public String name(){return name;}public CreativeTabs tab(){return tab;}public String unlocalizedName(){return unlocalizedName;}
	
	public Item setup(String newname, CreativeTabs newtab, String newuname) {
		name = newname;
		tab = newtab;
		this.setCreativeTab(tab);
		unlocalizedName = newuname;
		this.setUnlocalizedName(unlocalizedName);
		return this;
	}
	
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