package var.main;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigCategory;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.config.GuiConfig;
import net.minecraftforge.fml.client.config.IConfigElement;
import net.minecraftforge.fml.client.config.DummyConfigElement.DummyCategoryElement;
import net.minecraftforge.fml.client.config.GuiConfigEntries.NumberSliderEntry;


public class Config extends GuiConfig {
	
	public static boolean bGenerateOres;
	public static ConfigElement generateOres = getNewBoolean("generateOres", "coreFeatures", true, "Toggles if Ores generate on their own (Will crash Minecraft if this is true, while Blocks are off)");
	public static boolean bCraftingRecipies;
	public static ConfigElement craftingRecipies = getNewBoolean("craftingRecipies", "coreFeatures", true, "Toggles if Recipies will be registered");
	public static boolean bSkyDimension;
	public static ConfigElement skyDimension = getNewBoolean("skyDimension", "coreFeatures", true, "Toggles if the Sky Dimension will be registered");
	public static int iSkyDimensionID;
	public static ConfigElement skyDimensionID = new ConfigElement(MainRegistry.configFile.get("coreFeatures", "skyDimensionID", 2, "The ID which the Sky Dimension will be registered under (modify if another dimension already holds the default value)", 2, 102).setConfigEntryClass(NumberSliderEntry.class));
	public static int iSkyDimensionCloudSize;
	public static ConfigElement skyDimensionCloudSize = new ConfigElement(MainRegistry.configFile.get("coreFeatures", "skyDimensionCloudSize", 100, "The Maximum size of any individual ore cloud", 10, 250).setConfigEntryClass(NumberSliderEntry.class));
	public static int iSkyDimensionCloudNumber;
	public static ConfigElement skyDimensionCloudNumber = new ConfigElement(MainRegistry.configFile.get("coreFeatures", "skyDimensionCloudNumber", 1, "How often ore clouds spawn (Reduce Ore Cloud Size before increasing spawnrate)", 1, 10).setConfigEntryClass(NumberSliderEntry.class));
	
	public Config(GuiScreen parent) {
	    super(parent, getConfigElements(), MainRegistry.MODID, false, false, GuiConfig.getAbridgedConfigPath(MainRegistry.configFile.toString()));
	    MainRegistry.configFile.load();
	}
	
	public static void update()
	{	bGenerateOres = (boolean) Boolean.valueOf((String) generateOres.get());
		bCraftingRecipies = (boolean) Boolean.valueOf((String) craftingRecipies.get());
		bSkyDimension = (boolean) Boolean.valueOf((String) skyDimension.get());
		iSkyDimensionID = (int) Integer.valueOf((String) skyDimensionID.get());
		iSkyDimensionCloudSize = (int) Integer.valueOf((String) skyDimensionCloudSize.get());
		iSkyDimensionCloudNumber = (int) Integer.valueOf((String) skyDimensionCloudNumber.get());
	}
	
	private static List<IConfigElement> getConfigElements()
	{	List<IConfigElement> returnList = new ArrayList<IConfigElement>();
		Pattern commaDelimitedPattern = Pattern.compile("([A-Za-z]+((,){1}( )*|$))+?");
		
		List<IConfigElement> coreFeatures = new ArrayList<IConfigElement>();
		
		coreFeatures.add(generateOres);
		coreFeatures.add(craftingRecipies);
		coreFeatures.add(skyDimension);
		coreFeatures.add(skyDimensionID);
		coreFeatures.add(skyDimensionCloudSize);
		coreFeatures.add(skyDimensionCloudNumber);
		
		returnList.add(new DummyCategoryElement("Core Elements", "nmm.config.core", coreFeatures));
		
		bGenerateOres = (boolean) Boolean.valueOf((String) generateOres.get());
		bCraftingRecipies = (boolean) Boolean.valueOf((String) craftingRecipies.get());
		bSkyDimension = (boolean) Boolean.valueOf((String) skyDimension.get());
		iSkyDimensionID = (int) Integer.valueOf((String) skyDimensionID.get());
		iSkyDimensionCloudSize = (int) Integer.valueOf((String) skyDimensionCloudSize.get());
		iSkyDimensionCloudNumber = (int) Integer.valueOf((String) skyDimensionCloudNumber.get());
		
		return returnList;	
	}
	
	public static ConfigElement getNewBoolean(String name, String category, boolean defaultValue, String comment)
	{	return new ConfigElement(MainRegistry.configFile.get(category, name, defaultValue, comment));}
	
	public void onGuiClosed()
	{	MainRegistry.configFile.save();}
}
