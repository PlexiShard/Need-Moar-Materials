package var.recipe;

import var.item.ItemManager;
import var.main.MainRegistry;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class RecipeManager {
		public static void mainRegistry() {
			addCraftingRecipes();
			addSmeltingRecipes();
		}
		
		public static void addCraftingRecipes() {
			GameRegistry.addShapedRecipe(new ItemStack(ItemManager.titaniumSword, 1), " x ", " x ", " y ", 'x', ItemManager.titaniumIngot, 'y', Items.stick);
			GameRegistry.addShapedRecipe(new ItemStack(ItemManager.titaniumPickaxe, 1), "xxx", " y ", " y ", 'x', ItemManager.titaniumIngot, 'y', Items.stick);
			GameRegistry.addShapedRecipe(new ItemStack(ItemManager.titaniumBlock, 1), "xxx", "xxx", "xxx", 'x', ItemManager.titaniumIngot);
			GameRegistry.addShapedRecipe(new ItemStack(ItemManager.lightningConductor, 1), " x ", " x ", " x ", 'x', ItemManager.titaniumIngot);
			GameRegistry.addShapedRecipe(new ItemStack(ItemManager.lightningSword, 1), "rlr", "rsr", "rrr", 'r', Items.redstone, 'l', ItemManager.lightningConductor, 's', ItemManager.titaniumSword);
			GameRegistry.addShapedRecipe(new ItemStack(ItemManager.titaniumAxe, 1), "xx ", "xy ", " y ", 'x', ItemManager.titaniumIngot, 'y', Items.stick);
			GameRegistry.addShapedRecipe(new ItemStack(ItemManager.titaniumHoe, 1), "xx ", " y ", " y ", 'x', ItemManager.titaniumIngot, 'y', Items.stick);
			GameRegistry.addShapelessRecipe(new ItemStack(ItemManager.titaniumIngot, 9), ItemManager.titaniumBlock);
			GameRegistry.addShapedRecipe(new ItemStack(ItemManager.titaniumShovel, 1), " x ", " s ", " s ", 'x', ItemManager.titaniumIngot, 's', Items.stick);
		}
		
		public static void addSmeltingRecipes() {
			GameRegistry.addSmelting(ItemManager.unsmeltedTitanium, new ItemStack(var.item.ItemManager.titaniumIngot, 1), 1F);
	}

}
