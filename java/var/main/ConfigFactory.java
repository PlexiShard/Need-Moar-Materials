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


public class ConfigFactory extends GuiConfig {
	
	public ConfigFactory(GuiScreen parent) {
		super(parent, getConfigElements(), MainRegistry.MODID, false, false, GuiConfig.getAbridgedConfigPath(MainRegistry.configFile.toString()));
	    Config.configFile.save();
	}
	
	public static ConfigElement generateOres = new ConfigElement(Config.configFile.get("coreFeatures", "generateOres", true));
	public static ConfigElement craftingRecipies = new ConfigElement(Config.configFile.get("coreFeatures", "craftingRecipies", true));
	public static ConfigElement skyDimension = new ConfigElement(Config.configFile.get("coreFeatures", "skyDimension", true));
	public static ConfigElement skyDimensionID = new ConfigElement(Config.configFile.get("coreFeatures", "skyDimensionID", 2, "The ID which the Sky Dimension will be registered under (modify if another dimension already holds the default value)", 2, 102).setConfigEntryClass(NumberSliderEntry.class));
	public static ConfigElement skyDimensionCloudSize = new ConfigElement(Config.configFile.get("coreFeatures", "skyDimensionCloudSize", 100, "The Maximum size of any individual ore cloud", 10, 250).setConfigEntryClass(NumberSliderEntry.class));
	public static ConfigElement skyDimensionCloudNumber = new ConfigElement(Config.configFile.get("coreFeatures", "skyDimensionCloudNumber", 1, "How often ore clouds spawn (Reduce Ore Cloud Size before increasing spawnrate)", 1, 10).setConfigEntryClass(NumberSliderEntry.class));
	
	private static List<IConfigElement> getConfigElements()
	{	Config.configFile.load();
	
		List<IConfigElement> returnList = new ArrayList<IConfigElement>();
		Pattern commaDelimitedPattern = Pattern.compile("([A-Za-z]+((,){1}( )*|$))+?");
		
		List<IConfigElement> coreFeatures = new ArrayList<IConfigElement>();
		
		coreFeatures.add(generateOres);
		coreFeatures.add(craftingRecipies);
		coreFeatures.add(skyDimension);
		coreFeatures.add(skyDimensionID);
		coreFeatures.add(skyDimensionCloudSize);
		coreFeatures.add(skyDimensionCloudNumber);
		
		returnList.add(new DummyCategoryElement("Core Elements", "nmm.config.core", coreFeatures));
		
		return returnList;	
	}
	
	public static ConfigElement getNewBoolean(String name, String category, boolean defaultValue, String comment)
	{	return new ConfigElement(Config.configFile.get(category, name, defaultValue, comment));}
	
	public void onGuiClosed()
	{	MainRegistry.configFile.save();}
}
