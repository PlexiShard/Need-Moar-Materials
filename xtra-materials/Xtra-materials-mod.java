package Xtra-materials;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid="Xtra-materials", name="Xtra-materials-mod", version="0.1 Alpha")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)

public class Xtra-materials-mod{
  @Instance("xtra materials mod")
  public static Xtra-materials-mod instance;
  
  @SidedProxy(clientSide="Xtra-materials-mod.client.ClientProxy", serverSide="Xtra-materials.CommonProxy")
  public static CommonProxy proxy;
  
  @EventHandler
  public void preInit(FMLPreInitializationEvent event){
  }
  
  @EventHandler
	public void load(FMLInitializationEvent event){
	  proxy.registerRenderers();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
	}
}
