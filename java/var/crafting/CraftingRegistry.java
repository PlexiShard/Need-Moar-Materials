package var.crafting;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import var.block.BlockManager;
import var.item.BrassManager;
import var.item.ElementalManager;
import var.item.PlatinumManager;
import var.item.SteelManager;
import var.item.TitaniumManager;
import var.recipe.RecipeManager;

public class CraftingRegistry {

	public CraftingRegistry()
	{	addCraftingRecipies();
		addSmeltingRecipies();
	}

	public void addCraftingRecipies() {
		//titanium
		RecipeManager.addFullSet(TitaniumManager.titaniumIngot, TitaniumManager.titaniumSword, TitaniumManager.titaniumHoe, TitaniumManager.titaniumPickaxe, TitaniumManager.titaniumAxe, TitaniumManager.titaniumShovel, TitaniumManager.titaniumHelmet, TitaniumManager.titaniumChestplate, TitaniumManager.titaniumLeggings, TitaniumManager.titaniumBoots, BlockManager.titaniumBlock);
		
		//platinum
		RecipeManager.addFullSet(PlatinumManager.platinumIngot, PlatinumManager.platinumSword, PlatinumManager.platinumHoe, PlatinumManager.platinumPickaxe, PlatinumManager.platinumAxe, PlatinumManager.platinumShovel, PlatinumManager.platinumHelmet, PlatinumManager.platinumChestplate, PlatinumManager.platinumLeggings, PlatinumManager.platinumBoots, BlockManager.titaniumBlock);
		
		//steel
		RecipeManager.addFullSet(SteelManager.steelIngot, SteelManager.steelSword, SteelManager.steelHoe, SteelManager.steelPickaxe, SteelManager.steelAxe, SteelManager.steelShovel, SteelManager.steelHelmet, SteelManager.steelChestplate, SteelManager.steelLeggings, SteelManager.steelBoots, BlockManager.titaniumBlock);
		GameRegistry.addShapelessRecipe(new ItemStack(SteelManager.steelIngot, 1), TitaniumManager.titaniumIngot, Items.iron_ingot);
		
		//brass
		GameRegistry.addShapedRecipe(new ItemStack(BrassManager.brassIngot, 4), "crc", "rsr", "crc", 'c', BrassManager.copperIngot, 'r', Items.redstone, 's', SteelManager.steelIngot);
		RecipeManager.addSword(BrassManager.brassSword, BrassManager.brassIngot);
		RecipeManager.addPick(BrassManager.brassPickaxe, BrassManager.brassIngot);
		RecipeManager.addAxe(BrassManager.brassAxe, BrassManager.brassIngot);
		RecipeManager.addHoe(BrassManager.brassHoe, BrassManager.brassIngot);
		RecipeManager.addSpade(BrassManager.brassShovel, BrassManager.brassIngot);
		RecipeManager.addHelmet(BrassManager.brassHelmet, BrassManager.brassIngot);
		RecipeManager.addChestplate(BrassManager.brassChestplate, BrassManager.brassIngot);
		RecipeManager.addLeggings(BrassManager.brassLeggings, BrassManager.brassIngot);
		RecipeManager.addBoots(BrassManager.brassBoots, BrassManager.brassIngot);
		
		//elemental weapons
		GameRegistry.addShapedRecipe(new ItemStack(ElementalManager.lightningSword, 1), "rlr", "rsr", "rrr", 'r', Items.redstone, 'l', TitaniumManager.lightningRod, 's', TitaniumManager.titaniumSword);
		GameRegistry.addShapedRecipe(new ItemStack(ElementalManager.poisonSword, 1), " p ", "psp", " d ", 'p', Items.poisonous_potato, 's', TitaniumManager.titaniumSword, 'd', PlatinumManager.platinumSword);
		GameRegistry.addShapedRecipe(new ItemStack(ElementalManager.skySword, 1), " p ", "fsf", " p ", 'p', Blocks.piston, 'f', Items.feather, 's', TitaniumManager.titaniumSword);
		GameRegistry.addShapedRecipe(new ItemStack(ElementalManager.darknessSword, 1), "ded", " s ", "d d", 'd', ElementalManager.darknessDust, 's', TitaniumManager.titaniumSword, 'e', SteelManager.steelSword);
		GameRegistry.addShapedRecipe(new ItemStack(ElementalManager.fireSword, 1), " l ", "bsb", "fmf", 'l', Items.lava_bucket, 'b', Items.blaze_powder, 's', TitaniumManager.titaniumSword, 'f', Items.flint_and_steel);
		GameRegistry.addShapedRecipe(new ItemStack(ElementalManager.fireBow, 1), "fpf", "pbp", "fpf", 'f', Items.fire_charge, 'p', Items.blaze_powder, 'b', Items.bow);
		GameRegistry.addShapedRecipe(new ItemStack(ElementalManager.fireArrow, 4), " f ", "pap", " p ", 'f', Items.fire_charge, 'p', Items.blaze_powder, 'a', Items.arrow);
		
		//misc. items
		GameRegistry.addShapedRecipe(new ItemStack(TitaniumManager.lightningRod, 1), "x", "x", "x", 'x', TitaniumManager.titaniumIngot);
		GameRegistry.addShapelessRecipe(new ItemStack(ElementalManager.darknessDust, 1), Items.glowstone_dust, Items.redstone, Items.coal, Items.coal);
	}
	
	public void addSmeltingRecipies() {
		GameRegistry.addSmelting(TitaniumManager.unsmeltedTitanium, new ItemStack(TitaniumManager.titaniumIngot, 1), 1F);
		GameRegistry.addSmelting(BlockManager.platinumOre, new ItemStack(PlatinumManager.platinumIngot, 1),  1F);
		GameRegistry.addSmelting(BlockManager.steelOre, new ItemStack(SteelManager.steelIngot, 1), 1F);
		GameRegistry.addSmelting(BlockManager.copperOre, new ItemStack(BrassManager.copperIngot, 1), 1F);
	}

}
