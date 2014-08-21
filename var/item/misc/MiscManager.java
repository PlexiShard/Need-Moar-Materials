package var.item.misc;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import var.creativetabs.CreativeTabsManager;

public class MiscManager {

	public static void mainRegistry() {
		initializeItem();
		registerItem();
	}
	
	public static Item lightningConductor;
	public static Item darknessDust;
	
	public static void initializeItem() {
		lightningConductor = new LightningConductor();
    	darknessDust = new DarknessDust().setUnlocalizedName("darknessDust").setCreativeTab(CreativeTabsManager.nmmMisc).setTextureName("elemental:darknessDust");
	}
	
	public static void registerItem() {
		GameRegistry.registerItem(lightningConductor, lightningConductor.getUnlocalizedName());
    	GameRegistry.registerItem(darknessDust, darknessDust.getUnlocalizedName());
	}
}
