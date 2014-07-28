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
		ItemManager.titaniumOre = new TitaniumOre(Material.rock);
		ItemManager.titaniumBlock = new TitaniumBlock(Material.rock);
	}
	
	public static void registerBlock() {
		GameRegistry.registerBlock(ItemManager.titaniumOre, ItemManager.titaniumOre.getUnlocalizedName());
		GameRegistry.registerBlock(ItemManager.titaniumBlock, ItemManager.titaniumBlock.getUnlocalizedName());
	}
}
