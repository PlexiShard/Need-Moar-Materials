package var.main;

import net.minecraft.client.gui.GuiScreen;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.BiomeGenBase.Height;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.GuiModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartedEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import var.dimension.sky.SkyBiome;
import var.dimension.sky.SkyTeleporter;
import var.dimension.sky.SkyWorldProvider;
import var.world.Generate;

@Mod(modid = MainRegistry.MODID, name = MainRegistry.NAME, version = MainRegistry.VERSION, guiFactory="var.main.ConfigGUI")
public class MainRegistry 
{	public final static String MODID = "nmm";
	public final static String NAME = "Need Moar Materials";
	public final static String VERSION = "Beta 1.1";
	public static Configuration configFile;
	public static BiomeGenBase skyBiome = new SkyBiome(SkyBiome.getEmptyBiomeID(), true).setBiomeName("skyBiome").setHeight(new Height(1.5f, 0.05f));  
	public SkyTeleporter teleporterSurface;
	public SkyTeleporter teleporterSky;
	
	/**Events which should occur when a server starts with this mod enabled*/
	@EventHandler
	public void serverStart(FMLServerStartedEvent event)
	{	this.teleporterSurface = new SkyTeleporter(MinecraftServer.getServer().worldServerForDimension(0));
    	this.teleporterSky = new SkyTeleporter(MinecraftServer.getServer().worldServerForDimension(Config.iSkyDimensionID));
	}
	
	/**Events which should be run when this mod is first loaded (mostly for creating new values and objects)*/
	@EventHandler
	public void PreLoad(FMLPreInitializationEvent PreEvent) 
	{	this.configFile = new Configuration(PreEvent.getSuggestedConfigurationFile());

		new Config();
	
		LogHelper.logInfo("Registered Configuration File");
		
		new PreInit();
		
		GameRegistry.registerWorldGenerator(new Generate(), 1);
		LogHelper.logInfo("Registered world generators");
	}
	
	/**Events which should be run when this mod reaches the Init state (mostly for adding textures and models)*/
	@EventHandler
	public void Load(FMLInitializationEvent event) 
	{	Config.update();
		
		if (event.getSide() == Side.CLIENT)
		{	ClientProxy proxy = new ClientProxy();
			proxy.addTextures();
			LogHelper.logInfo("Setting Textures");
			
			
			LogHelper.logInfo("Updated settings");
			
			
		}	
	
		if(Config.bSkyDimension){
			BiomeManager.addBiome(BiomeType.WARM, new BiomeEntry(skyBiome, 0));
	
			DimensionManager.registerProviderType(Config.iSkyDimensionID, SkyWorldProvider.class, false);
			DimensionManager.registerDimension(Config.iSkyDimensionID, Config.iSkyDimensionID);
		}
		
		LogHelper.logInfo("Init phase complete. Begining PostInit...");
	}
	
	/**Events which should be run when this mod reaches the PostInit state (Unknown usage)*/
	@EventHandler
	public void PostLoad(FMLPostInitializationEvent PostLoad) 
	{	LogHelper.logInfo("PostInit complete. NMM fully initialized");	}
}