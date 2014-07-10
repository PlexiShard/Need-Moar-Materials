package com.var.recipe;

import com.var.item.ItemManager;
import com.var.main.MainRegistry;

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
			GameRegistry.addShapedRecipe(new ItemStack(ItemManager.titaniumAxe, 1), "xx ", "xy ", " y ", 'x', ItemManager.titaniumIngot, 'y', Item.stick);
			GameRegistry.addShapelessRecipe(new ItemStack(ItemManager.titaniumIngot, 9), ItemManager.titaniumBlock);
		}
		
		public static void addSmeltingRecipes() {
			GameRegistry.addSmelting(ItemManager.unsmeltedTitanium, new ItemStack(com.var.item.ItemManager.titaniumIngot, 1), 1F);
	}

}
