package var.recipe;

import var.item.ItemManager;
import var.main.MainRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import cpw.mods.fml.common.registry.GameRegistry;

public class RecipeManager {
		public static void mainRegistry() {
			addCraftingRecipes();
			addSmeltingRecipes();
		}
		
		public static void addCraftingRecipes() {
			//titanium
			GameRegistry.addShapelessRecipe(new ItemStack(ItemManager.titaniumIngot, 9), ItemManager.titaniumBlock);
			GameRegistry.addShapedRecipe(new ItemStack(ItemManager.titaniumBlock, 1), "xxx", "xxx", "xxx", 'x', ItemManager.titaniumIngot);
			GameRegistry.addShapedRecipe(new ItemStack(ItemManager.titaniumSword, 1), " x ", " x ", " y ", 'x', ItemManager.titaniumIngot, 'y', Items.stick);
			GameRegistry.addShapedRecipe(new ItemStack(ItemManager.titaniumPickaxe, 1), "xxx", " y ", " y ", 'x', ItemManager.titaniumIngot, 'y', Items.stick);
			GameRegistry.addShapedRecipe(new ItemStack(ItemManager.titaniumAxe, 1), "xx", "xy", " y", 'x', ItemManager.titaniumIngot, 'y', Items.stick);
			GameRegistry.addShapedRecipe(new ItemStack(ItemManager.titaniumHoe, 1), "xx", " y", " y", 'x', ItemManager.titaniumIngot, 'y', Items.stick);
			GameRegistry.addShapedRecipe(new ItemStack(ItemManager.titaniumShovel, 1), "x", "s", "s", 'x', ItemManager.titaniumIngot, 's', Items.stick);
			GameRegistry.addShapedRecipe(new ItemStack(ItemManager.titaniumHelmet, 1), "ttt", "t t", 't', ItemManager.titaniumIngot);
			GameRegistry.addShapedRecipe(new ItemStack(ItemManager.titaniumChestplate, 1), "t t", "ttt", "ttt", 't', ItemManager.titaniumIngot);
			GameRegistry.addShapedRecipe(new ItemStack(ItemManager.titaniumLeggings, 1), "ttt", "t t", "t t", 't', ItemManager.titaniumIngot);
			GameRegistry.addShapedRecipe(new ItemStack(ItemManager.titaniumBoots, 1), "t t", "t t", 't', ItemManager.titaniumIngot);
			
			//platinum
			GameRegistry.addShapelessRecipe(new ItemStack(ItemManager.platinumIngot, 9), ItemManager.platinumBlock);
			GameRegistry.addShapedRecipe(new ItemStack(ItemManager.platinumBlock, 1), "ppp", "ppp", "ppp", 'p', ItemManager.platinumIngot);
			GameRegistry.addShapedRecipe(new ItemStack(ItemManager.platinumAxe, 1), "pp", "ps", " s", 'p', ItemManager.platinumIngot, 's', Items.stick);
			GameRegistry.addShapedRecipe(new ItemStack(ItemManager.platinumHoe, 1), "pp", " s", " s", 'p', ItemManager.platinumIngot, 's', Items.stick);
			GameRegistry.addShapedRecipe(new ItemStack(ItemManager.platinumPickaxe, 1), "ppp", " s ", " s ", 'p', ItemManager.platinumIngot, 's', Items.stick);
			GameRegistry.addShapedRecipe(new ItemStack(ItemManager.platinumShovel, 1), "p", "s", "s", 'p', ItemManager.platinumShovel, 's', Items.stick);
			GameRegistry.addShapedRecipe(new ItemStack(ItemManager.platinumSword, 1), "p", "p", "s", 'p', ItemManager.platinumIngot, 's', Items.stick);
			GameRegistry.addShapedRecipe(new ItemStack(ItemManager.platinumHelmet, 1), "ppp", "p p", 'p', ItemManager.platinumIngot);
			GameRegistry.addShapedRecipe(new ItemStack(ItemManager.platinumChestplate, 1), "p p", "ppp", "ppp", 'p', ItemManager.platinumIngot);
			GameRegistry.addShapedRecipe(new ItemStack(ItemManager.platinumLeggings, 1), "ppp", "p p", "p p", 'p', ItemManager.platinumIngot);
			GameRegistry.addShapedRecipe(new ItemStack(ItemManager.platinumBoots, 1), "p p", "p p", 'p', ItemManager.platinumIngot);
			
			//steel
			GameRegistry.addShapelessRecipe(new ItemStack(ItemManager.steelIngot, 9), ItemManager.steelBlock);
			GameRegistry.addShapedRecipe(new ItemStack(ItemManager.steelBlock, 1), "ppp", "ppp", "ppp", 'p', ItemManager.steelIngot);
			GameRegistry.addShapedRecipe(new ItemStack(ItemManager.steelAxe, 1), "pp", "ps", " s", 'p', ItemManager.steelIngot, 's', Items.stick);
			GameRegistry.addShapedRecipe(new ItemStack(ItemManager.steelHoe, 1), "pp", " s", " s", 'p', ItemManager.steelIngot, 's', Items.stick);
			GameRegistry.addShapedRecipe(new ItemStack(ItemManager.steelPickaxe, 1), "ppp", " s ", " s ", 'p', ItemManager.steelIngot, 's', Items.stick);
			GameRegistry.addShapedRecipe(new ItemStack(ItemManager.steelShovel, 1), "p", "s", "s", 'p', ItemManager.steelShovel, 's', Items.stick);
			GameRegistry.addShapedRecipe(new ItemStack(ItemManager.steelSword, 1), "p", "p", "s", 'p', ItemManager.steelIngot, 's', Items.stick);
			GameRegistry.addShapedRecipe(new ItemStack(ItemManager.steelHelmet, 1), "ppp", "p p", 'p', ItemManager.steelIngot);
			GameRegistry.addShapedRecipe(new ItemStack(ItemManager.steelChestplate, 1), "p p", "ppp", "ppp", 'p', ItemManager.steelIngot);
			GameRegistry.addShapedRecipe(new ItemStack(ItemManager.steelLeggings, 1), "ppp", "p p", "p p", 'p', ItemManager.steelIngot);
			GameRegistry.addShapedRecipe(new ItemStack(ItemManager.steelBoots, 1), "p p", "p p", 'p', ItemManager.steelIngot);
			GameRegistry.addShapelessRecipe(new ItemStack(ItemManager.steelIngot, 1), ItemManager.titaniumIngot, Items.iron_ingot);
			
			//brass
			GameRegistry.addShapedRecipe(new ItemStack(ItemManager.brassIngot, 1), "crc", "rsr", "crc", 'c', ItemManager.copperIngot, 'r', Items.redstone, 's', ItemManager.steelIngot);
			GameRegistry.addShapedRecipe(new ItemStack(ItemManager.brassIngot, 1), "i", "i", "s", 'i', ItemManager.steelIngot, 's', Items.stick);
			
			//elemental swords
			GameRegistry.addShapedRecipe(new ItemStack(ItemManager.lightningSword, 1), "rlr", "rsr", "rrr", 'r', Items.redstone, 'l', ItemManager.lightningConductor, 's', ItemManager.titaniumSword);
			GameRegistry.addShapedRecipe(new ItemStack(ItemManager.poisonSword, 1), " p ", "psp", " d ", 'p', Items.poisonous_potato, 's', ItemManager.titaniumSword, 'd', ItemManager.platinumSword);
			GameRegistry.addShapedRecipe(new ItemStack(ItemManager.skySword, 1), " p ", "fsf", " p ", 'p', Blocks.piston, 'f', Items.feather, 's', ItemManager.titaniumSword);
			GameRegistry.addShapedRecipe(new ItemStack(ItemManager.darknessSword, 1), "ded", " s ", "d d", 'd', ItemManager.darknessDust, 's', ItemManager.titaniumSword, 'e', ItemManager.steelSword);
			
			//misc. items
			GameRegistry.addShapedRecipe(new ItemStack(ItemManager.lightningConductor, 1), "x", "x", "x", 'x', ItemManager.titaniumIngot);
			GameRegistry.addShapelessRecipe(new ItemStack(ItemManager.darknessDust, 1), Items.glowstone_dust, Items.redstone, Items.coal, Items.coal);
		}
		
		public static void addSmeltingRecipes() {
			GameRegistry.addSmelting(ItemManager.unsmeltedTitanium, new ItemStack(ItemManager.titaniumIngot, 1), 1F);
			GameRegistry.addSmelting(ItemManager.platinumOre, new ItemStack(ItemManager.platinumIngot, 1),  1F);
			GameRegistry.addSmelting(ItemManager.steelOre, new ItemStack(ItemManager.steelIngot, 1), 1F);
			GameRegistry.addSmelting(ItemManager.bronzeOre, new ItemStack(ItemManager.bronzeIngot, 1), 1F);

	}

}
