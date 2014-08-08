package var.main;

import var.block.BlockManager;
import var.blockgen.OreGen;
import var.creativetabs.CreativeTabsManager;
import var.entity.EntityManager;
import var.item.ItemManager;
import var.recipe.RecipeManager;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
@Mod(modid= "NMM", name = "PlexiShard's NMM Modification", version = "Alpha")

public class MainRegistry {
	
	@SidedProxy(clientSide = "var.main.ClientProxy", serverSide = "var.main.ServerProxy")
	public static ClientProxy proxy;
	
	public static OreGen gen = new OreGen();
	
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
