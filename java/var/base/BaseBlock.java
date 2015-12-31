package var.base;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BaseBlock extends Block implements IItem{
	public BaseBlock(Material materialIn) {
		super(materialIn);
	}

	public static String name;
	public static String uname;
	public static String texture;
	public static CreativeTabs tab;
	public static float resistance;
	public static float hardness;
	
	public String getName() {return name();}
	public String getUName() {return uname();}
	public String getTexture() {return texture();}
	public CreativeTabs getTab() {return tab();}
	public float getResistance() {return resistance;}
	public float getHardness() {return hardness;}
	
	public String name() {return name;}
	public String uname() {return uname;}
	public String texture() {return texture;}
	public CreativeTabs tab() {return tab;}
	
	public Block setup(String newuname, CreativeTabs newtab, String texture, float resistance, float hardness) 
	{	tab = newtab;
		this.setCreativeTab(tab);
		uname = newuname;
		this.setUnlocalizedName(uname);
		this.setResistance(resistance);
		this.resistance = resistance;
		this.setHardness(hardness);
		this.hardness = hardness;
		return this;
}	}