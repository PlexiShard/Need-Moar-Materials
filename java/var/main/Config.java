package var.main;

import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.config.GuiConfigEntries.NumberSliderEntry;

public class Config {

	public static Configuration configFile = MainRegistry.configFile;
	
	public static boolean bGenerateOres;
	public static boolean bCraftingRecipies;
	public static boolean bSkyDimension;
	public static int iSkyDimensionID;
	public static int iSkyDimensionCloudSize;
	public static int iSkyDimensionCloudNumber;
	
	
	public Config()
	{	configFile.load();
		update();
		configFile.save();
	}
	
	public static void update()
	{	bGenerateOres = configFile.getBoolean("generateOres", "coreFeatures", true, "Toggles if Ores generate on their own (Will crash Minecraft if this is true, while Blocks are off)", "generateOres");
		bCraftingRecipies = configFile.getBoolean("craftingRecipies", "coreFeatures", true, "Toggles if Recipies will be registered", "craftingRecipies");
		bSkyDimension = configFile.getBoolean("skyDimension", "coreFeatures", true, "Toggles if the Sky Dimension will be registered", "skyDimension");
		iSkyDimensionID = configFile.getInt("skyDimensionID", "coreFeatures", 2, 2, 102, "The ID which the Sky Dimension will be registered under (modify if another dimension already holds the default value)");
		iSkyDimensionCloudSize = configFile.getInt("skyDimensionCloudSize", "coreFeatures", 100, 10, 250, "The Maximum size of any individual ore cloud");
		iSkyDimensionCloudNumber = configFile.getInt("skyDimensionCloudNumber", "coreFeatures", 1, 1, 10, "How often ore clouds spawn (Reduce Ore Cloud Size before increasing spawnrate)");
	}
	
}
