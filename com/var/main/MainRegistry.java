package com.var.main;

import com.var.block.BlockManager;
import com.var.blockgen.TitaiumOreGen;
import com.var.creativetabs.CreativeTabsManager;
import com.var.entity.EntityManager;
import com.var.item.ItemManager;
import com.var.item.TitaniumIngot;
import com.var.recipe.RecipeManager;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
@Mod(modid= "var", name = "Var_Username's Xtra materials", version = "0.1 Alpha")

public class MainRegistry {
	
	@SidedProxy(clientSide = "com.var.main.ClientProxy", serverSide = "com.var.main.ServerProxy")
	public static ClientProxy proxy;
	
	public static TitaiumOreGen gen = new TitaiumOreGen();
	
	@EventHandler
	public static void PreLoad(FMLPreInitializationEvent PreEvent) {
		CreativeTabsManager.mainRegistry();
		ItemManager.mainRegistry();
		BlockManager.mainRegistry();
		EntityManager.mainRegistry();
		RecipeManager.mainRegistry();
		proxy.registerRenderThings();
	}
	@EventHandler
	public static void Load(FMLInitializationEvent Load) {
		GameRegistry.registerWorldGenerator(gen, 1);
	}

	@EventHandler
	public static void PostLoad(FMLPostInitializationEvent PostLoad) {
		
	}

	
}
