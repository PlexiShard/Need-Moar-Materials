package var.main;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import var.block.BlockManager;
import var.blockgen.Buildings;
import var.blockgen.Generate;
import var.creativetabs.CreativeTabsManager;
import var.entity.EntityManager;
import var.item.ItemManager;
import var.recipe.RecipeManager;

@Mod(modid= "NMM", name = "Need Moar Materials", version = "0.1 Beta")

public class MainRegistry {
	
	@SidedProxy(clientSide = "var.main.ClientProxy", serverSide = "var.main.ServerProxy")
	public static ClientProxy proxy;
	
	public static Generate gen = new Generate();
	public static Buildings buildgen = new Buildings();
	
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
		GameRegistry.registerWorldGenerator(buildgen, 2);
	}

	@EventHandler
	public static void PostLoad(FMLPostInitializationEvent PostLoad) {
		
	}

	
}




