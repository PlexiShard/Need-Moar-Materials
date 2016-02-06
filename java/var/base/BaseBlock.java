package var.base;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BaseBlock extends Block{
	/**Initializes BaseBlock
	 * 
	 * @param materialIn
	 * Sets the {@link Block} {@link Material}*/
	public BaseBlock(Material materialIn) {
		super(materialIn);
	}
	public BaseBlock(Material materialIn, String newuname, CreativeTabs newtab, String texture, float resistance, float hardness) {
		super(materialIn);
		this.setupThis(newuname, newtab, texture, resistance, hardness);
	}

	/**Used to stored the unlocalizedName until it is registered*/
	public static String uname;
	/**Used for Texture handling*/
	public String texture;
	/**Used to stored the {@link CreativeTabs} until it is registered*/
	public static CreativeTabs tab;
	/**Returns the texture*/
	public String getTexture() {return texture();}
	/**Returns the texture*/
	public String texture() {return texture;}
	
	/**
	 * @param newuname
	 * Unlocalized Name to be returned in {@link Block}
	 * 
	 * @param newtab
	 * {@link CreativeTab} to be returned in {@link Block}
	 * 
	 * @param texture
	 * String to be used for the texture .json
	 * 
	 * @param resistance
	 * Float to be returned in {@link Block}'s resistance
	 * 
	 * @param hardness
	 * Float to be returned in the {@link Block}'s hardness
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
		this.texture = texture;
		return this;
	}	
	
	/**Allows BaseBlock to be used by itself
	 * @param newuname
	 * Unlocalized Name to be returned in {@link Block}
	 * 
	 * @param newtab
	 * {@link CreativeTab} to be returned in {@link Block}
	 * 
	 * @param texture
	 * String to be used for the texture .json
	 * 
	 * @param resistance
	 * Float to be returned in {@link Block}'s resistance
	 * 
	 * @param hardness
	 * Float to be returned in the {@link Block}'s hardness
	 * */
	public void setupThis(String newuname, CreativeTabs newtab, String texture, float resistance, float hardness)
	{	tab = newtab;
		this.setCreativeTab(tab);
		uname = newuname;
		this.setUnlocalizedName(uname);
		this.setResistance(resistance);
		this.setHardness(hardness);
		this.texture = texture;
	}	
}