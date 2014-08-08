package var.block;

import var.item.ItemManager;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import cpw.mods.fml.common.registry.GameRegistry;

public class BlockManager {
	public static void mainRegistry() {
		initializeBlock();
		registerBlock();
	}
	
	
	public static void initializeBlock() {
		//titanium
		ItemManager.titaniumOre = new TitaniumOre(Material.rock);
		ItemManager.titaniumBlock = new TitaniumBlock(Material.rock);
		//platinum
		ItemManager.platinumOre = new PlatinumOre(Material.rock);
		ItemManager.platinumBlock = new PlatinumBlock(Material.rock);
		//steel
		ItemManager.steelOre = new SteelOre(Material.rock);
		ItemManager.steelBlock = new SteelBlock(Material.rock);
	}
	
	public static void registerBlock() {
		//titanium
		GameRegistry.registerBlock(ItemManager.titaniumOre, ItemManager.titaniumOre.getUnlocalizedName());
		GameRegistry.registerBlock(ItemManager.titaniumBlock, ItemManager.titaniumBlock.getUnlocalizedName());
		//platinum
		GameRegistry.registerBlock(ItemManager.platinumOre, ItemManager.platinumOre.getUnlocalizedName());
		GameRegistry.registerBlock(ItemManager.platinumBlock, ItemManager.platinumBlock.getUnlocalizedName());
		//steel
		GameRegistry.registerBlock(ItemManager.steelBlock, ItemManager.steelBlock.getUnlocalizedName());
		GameRegistry.registerBlock(ItemManager.steelOre, ItemManager.steelOre.getUnlocalizedName());
	}
}
