package var.item.steel;

import cpw.mods.fml.common.registry.GameRegistry;
import var.creativetabs.CreativeTabsManager;
import var.main.MainRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class SteelManager {

	public static void mainRegistry() {
		initializeItem();
		registerItem();
	}
	public static ToolMaterial steel = EnumHelper.addToolMaterial("Steel", 3, 2500, 6.0F, 4.0F, 14);
	public static ArmorMaterial steelArmor = EnumHelper.addArmorMaterial("Steel", 25, new int[]{4, 6, 4, 3}, 9);
	
	public static Item steelAxe;
	public static Item steelHoe;
	public static Item steelIngot;
	public static Item steelPickaxe;
	public static Item steelShovel;
	public static Item steelSword;
	public static Item steelHelmet;
	public static Item steelChestplate;
	public static Item steelLeggings;
	public static Item steelBoots;
	
	public static void initializeItem() {
    	steelAxe = new SteelAxe(steel).setUnlocalizedName("steelAxe").setCreativeTab(CreativeTabsManager.nmmTools).setTextureName("steel:steelAxe");
    	steelHoe = new SteelHoe(steel).setUnlocalizedName("steelHoe").setCreativeTab(CreativeTabsManager.nmmTools).setTextureName("steel:steelHoe");
    	steelPickaxe = new SteelPickaxe(steel).setUnlocalizedName("steelPickaxe").setCreativeTab(CreativeTabsManager.nmmTools).setTextureName("steel:steelPickaxe");
    	steelIngot = new SteelIngot().setUnlocalizedName("steelIngot").setCreativeTab(CreativeTabsManager.nmmRaw).setTextureName("steel:steelIngot");
    	steelShovel = new SteelShovel(steel).setUnlocalizedName("steelShovel").setCreativeTab(CreativeTabsManager.nmmTools).setTextureName("steel:steelShovel");
    	steelSword = new SteelSword(steel).setUnlocalizedName("steelSword").setCreativeTab(CreativeTabsManager.nmmCombat).setTextureName("steel:steelSword");
    	steelHelmet = new SteelHelmet(steelArmor, MainRegistry.proxy.addArmor("SteelHelmet"), 0).setUnlocalizedName("steelHelmet").setCreativeTab(CreativeTabsManager.nmmCombat).setTextureName("steel:steelHelmet");
    	steelChestplate = new SteelChestplate(steelArmor, MainRegistry.proxy.addArmor("SteelChestplate"), 1).setUnlocalizedName("steelChestplate").setCreativeTab(CreativeTabsManager.nmmCombat).setTextureName("steel:steelChestplate");
    	steelLeggings = new SteelLeggings(steelArmor, MainRegistry.proxy.addArmor("SteelLeggings"), 2).setUnlocalizedName("steelLeggings").setCreativeTab(CreativeTabsManager.nmmCombat).setTextureName("steel:steelLeggings");
    	steelBoots = new SteelBoots(steelArmor, MainRegistry.proxy.addArmor("SteelBoots"), 3).setUnlocalizedName("steelBoots").setCreativeTab(CreativeTabsManager.nmmCombat).setTextureName("steel:steelBoots");
        
	}
	
	public static void registerItem() {
		GameRegistry.registerItem(steelIngot, steelIngot.getUnlocalizedName());
    	GameRegistry.registerItem(steelAxe, steelAxe.getUnlocalizedName());
    	GameRegistry.registerItem(steelHoe, steelHoe.getUnlocalizedName());
    	GameRegistry.registerItem(steelPickaxe, steelPickaxe.getUnlocalizedName());
    	GameRegistry.registerItem(steelShovel, steelShovel.getUnlocalizedName());
    	GameRegistry.registerItem(steelSword, steelSword.getUnlocalizedName());
    	GameRegistry.registerItem(steelHelmet, steelHelmet.getUnlocalizedName());
    	GameRegistry.registerItem(steelChestplate, steelChestplate.getUnlocalizedName());
    	GameRegistry.registerItem(steelLeggings, steelLeggings.getUnlocalizedName());
    	GameRegistry.registerItem(steelBoots, steelBoots.getUnlocalizedName());
	}
}
