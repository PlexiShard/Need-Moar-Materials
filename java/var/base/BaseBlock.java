package var.base;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BaseBlock extends Block{
	/**Initializes BaseBlock
	 * 
	 * @param materialIn
	 * Sets the block material*/
	public BaseBlock(Material materialIn) {
		super(materialIn);
	}

	/**Used to stored the unlocalizedName until it is registered*/
	public static String uname;
	/**Unknown Usage*/
	public static String texture;
	/**Used to stored the CreativeTab until it is registered*/
	public static CreativeTabs tab;
	/**Returns the texture*/
	public String getTexture() {return texture();}
	/**Returns the texture*/
	public String texture() {return texture;}
	
	/**
	 * @param newuname
	 * Unlocalized Name to be returned in Block
	 * 
	 * @param newtab
	 * CreativeTab to be returned in Block
	 * 
	 * @param texture
	 * String to be used for the texture .json
	 * 
	 * @param resistance
	 * Float to be returned in Block
	 * 
	 * @param hardness
	 * Float to be returned in Block
	 * 
	 * @return A Block with set Hardness, Resistance, Unlocalized Name, and Creative Tab
	 * */
	public Block setup(String newuname, CreativeTabs newtab, String texture, float resistance, float hardness) 
	{	tab = newtab;
		this.setCreativeTab(tab);
		uname = newuname;
		this.setUnlocalizedName(uname);
		this.setResistance(resistance);
		this.setHardness(hardness);
		return this;
	}	
}