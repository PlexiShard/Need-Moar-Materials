package var.recipe;

import var.block.BlockManager;
import var.item.ItemManager;
import var.item.brass.BrassManager;
import var.item.copper.CopperManager;
import var.item.elemental.ElementalManager;
import var.item.misc.MiscManager;
import var.item.platinum.PlatinumManager;
import var.item.steel.SteelManager;
import var.item.titanium.TitaniumManager;
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
			GameRegistry.addShapelessRecipe(new ItemStack(TitaniumManager.titaniumIngot, 9), BlockManager.titaniumBlock);
			GameRegistry.addShapedRecipe(new ItemStack(BlockManager.titaniumBlock, 1), "xxx", "xxx", "xxx", 'x', TitaniumManager.titaniumIngot);
			GameRegistry.addShapedRecipe(new ItemStack(TitaniumManager.titaniumSword, 1), " x ", " x ", " y ", 'x', TitaniumManager.titaniumIngot, 'y', Items.stick);
			GameRegistry.addShapedRecipe(new ItemStack(TitaniumManager.titaniumPickaxe, 1), "xxx", " y ", " y ", 'x', TitaniumManager.titaniumIngot, 'y', Items.stick);
			GameRegistry.addShapedRecipe(new ItemStack(TitaniumManager.titaniumAxe, 1), "xx", "xy", " y", 'x', TitaniumManager.titaniumIngot, 'y', Items.stick);
			GameRegistry.addShapedRecipe(new ItemStack(TitaniumManager.titaniumHoe, 1), "xx", " y", " y", 'x', TitaniumManager.titaniumIngot, 'y', Items.stick);
			GameRegistry.addShapedRecipe(new ItemStack(TitaniumManager.titaniumShovel, 1), "x", "s", "s", 'x', TitaniumManager.titaniumIngot, 's', Items.stick);
			GameRegistry.addShapedRecipe(new ItemStack(TitaniumManager.titaniumHelmet, 1), "ttt", "t t", 't', TitaniumManager.titaniumIngot);
			GameRegistry.addShapedRecipe(new ItemStack(TitaniumManager.titaniumChestplate, 1), "t t", "ttt", "ttt", 't', TitaniumManager.titaniumIngot);
			GameRegistry.addShapedRecipe(new ItemStack(TitaniumManager.titaniumLeggings, 1), "ttt", "t t", "t t", 't', TitaniumManager.titaniumIngot);
			GameRegistry.addShapedRecipe(new ItemStack(TitaniumManager.titaniumBoots, 1), "t t", "t t", 't', TitaniumManager.titaniumIngot);
			
			//platinum
			GameRegistry.addShapelessRecipe(new ItemStack(PlatinumManager.platinumIngot, 9), BlockManager.platinumBlock);
			GameRegistry.addShapedRecipe(new ItemStack(BlockManager.platinumBlock, 1), "ppp", "ppp", "ppp", 'p', PlatinumManager.platinumIngot);
			GameRegistry.addShapedRecipe(new ItemStack(PlatinumManager.platinumAxe, 1), "pp", "ps", " s", 'p', PlatinumManager.platinumIngot, 's', Items.stick);
			GameRegistry.addShapedRecipe(new ItemStack(PlatinumManager.platinumHoe, 1), "pp", " s", " s", 'p', PlatinumManager.platinumIngot, 's', Items.stick);
			GameRegistry.addShapedRecipe(new ItemStack(PlatinumManager.platinumPickaxe, 1), "ppp", " s ", " s ", 'p', PlatinumManager.platinumIngot, 's', Items.stick);
			GameRegistry.addShapedRecipe(new ItemStack(PlatinumManager.platinumShovel, 1), "p", "s", "s", 'p', PlatinumManager.platinumShovel, 's', Items.stick);
			GameRegistry.addShapedRecipe(new ItemStack(PlatinumManager.platinumSword, 1), "p", "p", "s", 'p', PlatinumManager.platinumIngot, 's', Items.stick);
			GameRegistry.addShapedRecipe(new ItemStack(PlatinumManager.platinumHelmet, 1), "ppp", "p p", 'p', PlatinumManager.platinumIngot);
			GameRegistry.addShapedRecipe(new ItemStack(PlatinumManager.platinumChestplate, 1), "p p", "ppp", "ppp", 'p', PlatinumManager.platinumIngot);
			GameRegistry.addShapedRecipe(new ItemStack(PlatinumManager.platinumLeggings, 1), "ppp", "p p", "p p", 'p', PlatinumManager.platinumIngot);
			GameRegistry.addShapedRecipe(new ItemStack(PlatinumManager.platinumBoots, 1), "p p", "p p", 'p', PlatinumManager.platinumIngot);
			
			//steel
			GameRegistry.addShapelessRecipe(new ItemStack(SteelManager.steelIngot, 9), BlockManager.steelBlock);
			GameRegistry.addShapedRecipe(new ItemStack(BlockManager.steelBlock, 1), "ppp", "ppp", "ppp", 'p', SteelManager.steelIngot);
			GameRegistry.addShapedRecipe(new ItemStack(SteelManager.steelAxe, 1), "pp", "ps", " s", 'p', SteelManager.steelIngot, 's', Items.stick);
			GameRegistry.addShapedRecipe(new ItemStack(SteelManager.steelHoe, 1), "pp", " s", " s", 'p', SteelManager.steelIngot, 's', Items.stick);
			GameRegistry.addShapedRecipe(new ItemStack(SteelManager.steelPickaxe, 1), "ppp", " s ", " s ", 'p', SteelManager.steelIngot, 's', Items.stick);
			GameRegistry.addShapedRecipe(new ItemStack(SteelManager.steelShovel, 1), "p", "s", "s", 'p', SteelManager.steelShovel, 's', Items.stick);
			GameRegistry.addShapedRecipe(new ItemStack(SteelManager.steelSword, 1), "p", "p", "s", 'p', SteelManager.steelIngot, 's', Items.stick);
			GameRegistry.addShapedRecipe(new ItemStack(SteelManager.steelHelmet, 1), "ppp", "p p", 'p', SteelManager.steelIngot);
			GameRegistry.addShapedRecipe(new ItemStack(SteelManager.steelChestplate, 1), "p p", "ppp", "ppp", 'p', SteelManager.steelIngot);
			GameRegistry.addShapedRecipe(new ItemStack(SteelManager.steelLeggings, 1), "ppp", "p p", "p p", 'p', SteelManager.steelIngot);
			GameRegistry.addShapedRecipe(new ItemStack(SteelManager.steelBoots, 1), "p p", "p p", 'p', SteelManager.steelIngot);
			GameRegistry.addShapelessRecipe(new ItemStack(SteelManager.steelIngot, 1), TitaniumManager.titaniumIngot, Items.iron_ingot);
			
			//brass
			GameRegistry.addShapedRecipe(new ItemStack(BrassManager.brassIngot, 4), "crc", "rsr", "crc", 'c', CopperManager.copperIngot, 'r', Items.redstone, 's', SteelManager.steelIngot);
			GameRegistry.addShapedRecipe(new ItemStack(BrassManager.brassSword, 1), "i", "i", "s", 'i', BrassManager.brassIngot, 's', Items.stick);
			GameRegistry.addShapedRecipe(new ItemStack(BrassManager.brassPickaxe, 1), "bbb", " s ", " s ", 'b', BrassManager.brassIngot, 's', Items.stick);
			GameRegistry.addShapedRecipe(new ItemStack(BrassManager.brassAxe, 1), "bb", "bs", " s", 'b', BrassManager.brassIngot, 's', Items.stick);
			GameRegistry.addShapedRecipe(new ItemStack(BrassManager.brassHoe, 1), "bb", "s ", "s ", 'b', BrassManager.brassIngot, 's', Items.stick);
			GameRegistry.addShapedRecipe(new ItemStack(BrassManager.brassShovel, 1), "b", "s", "s", 'b', BrassManager.brassIngot, 's', Items.stick);
			GameRegistry.addShapedRecipe(new ItemStack(BrassManager.brassHelmet, 1), "bbb", "b b", 'b', BrassManager.brassIngot);
			GameRegistry.addShapedRecipe(new ItemStack(BrassManager.brassChestplate, 1), "b b", "bbb", "bbb", 'b', BrassManager.brassIngot);
			GameRegistry.addShapedRecipe(new ItemStack(BrassManager.brassLeggings, 1), "bbb", "b b", "b b", 'b', BrassManager.brassIngot);
			GameRegistry.addShapedRecipe(new ItemStack(BrassManager.brassBoots, 1), "b b", "b b", 'b', BrassManager.brassIngot);
			
			//elemental weapons
			GameRegistry.addShapedRecipe(new ItemStack(ElementalManager.lightningSword, 1), "rlr", "rsr", "rrr", 'r', Items.redstone, 'l', MiscManager.lightningConductor, 's', TitaniumManager.titaniumSword);
			GameRegistry.addShapedRecipe(new ItemStack(ElementalManager.poisonSword, 1), " p ", "psp", " d ", 'p', Items.poisonous_potato, 's', TitaniumManager.titaniumSword, 'd', PlatinumManager.platinumSword);
			GameRegistry.addShapedRecipe(new ItemStack(ElementalManager.skySword, 1), " p ", "fsf", " p ", 'p', Blocks.piston, 'f', Items.feather, 's', TitaniumManager.titaniumSword);
			GameRegistry.addShapedRecipe(new ItemStack(ElementalManager.darknessSword, 1), "ded", " s ", "d d", 'd', MiscManager.darknessDust, 's', TitaniumManager.titaniumSword, 'e', SteelManager.steelSword);
			GameRegistry.addShapedRecipe(new ItemStack(ElementalManager.fireSword, 1), " l ", "bsb", "fmf", 'l', Items.lava_bucket, 'b', Items.blaze_powder, 's', TitaniumManager.titaniumSword, 'f', Items.flint_and_steel);
			GameRegistry.addShapedRecipe(new ItemStack(ElementalManager.fireBow, 1), "fpf", "pbp", "fpf", 'f', Items.fire_charge, 'p', Items.blaze_powder, 'b', Items.bow);
			GameRegistry.addShapedRecipe(new ItemStack(ElementalManager.fireArrow, 4), " f ", "pap", " p ", 'f', Items.fire_charge, 'p', Items.blaze_powder, 'a', Items.arrow);
			
			//misc. items
			GameRegistry.addShapedRecipe(new ItemStack(MiscManager.lightningConductor, 1), "x", "x", "x", 'x', TitaniumManager.titaniumIngot);
			GameRegistry.addShapelessRecipe(new ItemStack(MiscManager.darknessDust, 1), Items.glowstone_dust, Items.redstone, Items.coal, Items.coal);
		}
		
		public static void addSmeltingRecipes() {
			GameRegistry.addSmelting(TitaniumManager.unsmeltedTitanium, new ItemStack(TitaniumManager.titaniumIngot, 1), 1F);
			GameRegistry.addSmelting(BlockManager.platinumOre, new ItemStack(PlatinumManager.platinumIngot, 1),  1F);
			GameRegistry.addSmelting(BlockManager.steelOre, new ItemStack(SteelManager.steelIngot, 1), 1F);
			GameRegistry.addSmelting(BlockManager.copperOre, new ItemStack(CopperManager.copperIngot, 1), 1F);
		}

}
