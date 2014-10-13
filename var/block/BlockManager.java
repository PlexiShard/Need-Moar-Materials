package var.block;

import var.item.ItemManager;
import var.item.brass.BrassManager;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import cpw.mods.fml.common.registry.GameRegistry;

public class BlockManager {
	public static void mainRegistry() {
		initializeBlock();
		registerBlock();
	}
	
	//titanium
	public static Block titaniumOre;
	public static Block titaniumBlock;
	//platinum
	public static Block platinumOre;
	public static Block platinumBlock;
	//steel
	public static Block steelOre;
	public static Block steelBlock;
	//copper
	public static Block copperOre;
	public static Block copperBlock;
	
	public static void initializeBlock() {
		//titanium
		titaniumOre = new TitaniumOre(Material.rock);
		titaniumBlock = new TitaniumBlock(Material.rock);
		//platinum
		platinumOre = new PlatinumOre(Material.rock);
		platinumBlock = new PlatinumBlock(Material.rock);
		//steel
		steelOre = new SteelOre(Material.rock);
		steelBlock = new SteelBlock(Material.rock);
		//copper
		copperBlock = new CopperBlock(Material.rock);
		copperOre = new CopperOre(Material.rock);

	}
	
	public static void registerBlock() {
		//titanium
		GameRegistry.registerBlock(titaniumOre, titaniumOre.getUnlocalizedName());
		GameRegistry.registerBlock(titaniumBlock, titaniumBlock.getUnlocalizedName());
		//platinum
		GameRegistry.registerBlock(platinumOre, platinumOre.getUnlocalizedName());
		GameRegistry.registerBlock(platinumBlock, platinumBlock.getUnlocalizedName());
		//steel
		GameRegistry.registerBlock(steelBlock, steelBlock.getUnlocalizedName());
		GameRegistry.registerBlock(steelOre, steelOre.getUnlocalizedName());
		//copper
		GameRegistry.registerBlock(copperOre, copperOre.getUnlocalizedName());
		GameRegistry.registerBlock(copperBlock, copperBlock.getUnlocalizedName());

	}
}
