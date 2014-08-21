package var.item.copper;

import cpw.mods.fml.common.registry.GameRegistry;
import var.creativetabs.CreativeTabsManager;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class CopperManager {

	public static void mainRegistry() {
		initializeItem();
		registerItem();
	}
	
	public static ToolMaterial copper = EnumHelper.addToolMaterial("Copper", 2, 300, 7.0F, 8.0F, 16); 
	
	public static Item unsmeltedCopper;
	public static Item copperIngot;
	public static Item copperSword;
	
	public static void initializeItem() {
		copperIngot = new CopperIngot().setUnlocalizedName("copperIngot").setCreativeTab(CreativeTabsManager.nmmRaw).setTextureName("copper:copperIngot");
	}
	
	public static void registerItem() {
		GameRegistry.registerItem(copperIngot, copperIngot.getUnlocalizedName());
	}

}
