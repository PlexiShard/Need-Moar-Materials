package var.item.platinum;

import cpw.mods.fml.common.registry.GameRegistry;
import var.creativetabs.CreativeTabsManager;
import var.main.MainRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class PlatinumManager {

	public static void mainRegistry() {
		initializeItem();
		registerItem();
	}

	public static ToolMaterial platinum = EnumHelper.addToolMaterial("Platinum", 3, 5000, 6.0F, 2.0F, 25);
	public static ArmorMaterial platinumArmor = EnumHelper.addArmorMaterial("Platinum", 50, new int[]{4, 9, 5, 3}, 9);
	
	public static Item platinumIngot;
	public static Item platinumPickaxe;
	public static Item platinumSword;
	public static Item platinumAxe;
	public static Item platinumShovel;
	public static Item platinumHoe;
	public static Item platinumHelmet;
	public static Item platinumChestplate;
	public static Item platinumLeggings;
	public static Item platinumBoots;
	
	public static void initializeItem() {
		platinumIngot = new PlatinumIngot();
    	platinumAxe = new PlatinumAxe(platinum).setUnlocalizedName("platinumAxe").setCreativeTab(CreativeTabsManager.nmmTools).setTextureName("platinum:platinumAxe");
    	platinumHoe = new PlatinumHoe(platinum).setUnlocalizedName("platinumHoe").setCreativeTab(CreativeTabsManager.nmmTools).setTextureName("platinum:platinumHoe");
    	platinumPickaxe = new PlatinumPickaxe(platinum).setUnlocalizedName("platinumPickaxe").setCreativeTab(CreativeTabsManager.nmmTools).setTextureName("platinum:platinumPickaxe");
    	platinumShovel = new PlatinumShovel(platinum).setUnlocalizedName("platinumShovel").setCreativeTab(CreativeTabsManager.nmmTools).setTextureName("platinum:platinumShovel");
    	platinumSword = new PlatinumSword(platinum).setUnlocalizedName("platinumSword").setCreativeTab(CreativeTabsManager.nmmCombat).setTextureName("platinum:platinumSword");
    	platinumHelmet = new PlatinumHelmet(platinumArmor, MainRegistry.proxy.addArmor("platinumHelmet"), 0).setCreativeTab(CreativeTabsManager.nmmCombat).setTextureName("platinum:platinumHelmet").setUnlocalizedName("platinumHelmet");
    	platinumChestplate = new PlatinumChestPlate(platinumArmor, MainRegistry.proxy.addArmor("platinumChestplate"), 1).setCreativeTab(CreativeTabsManager.nmmCombat).setTextureName("platinum:platinumChestplate").setUnlocalizedName("platinumChestplate");
    	platinumLeggings = new PlatinumLeggings(platinumArmor, MainRegistry.proxy.addArmor("platinumLeggings"), 2).setCreativeTab(CreativeTabsManager.nmmCombat).setTextureName("platinum:platinumLeggings").setUnlocalizedName("platinumLeggings");
    	platinumBoots = new PlatinumBoots(platinumArmor, MainRegistry.proxy.addArmor("platinumBoots"), 3).setCreativeTab(CreativeTabsManager.nmmCombat).setTextureName("platinum:platinumBoots").setUnlocalizedName("platinumBoots");
    	
	}
	
	public static void registerItem() {
		GameRegistry.registerItem(platinumIngot, platinumIngot.getUnlocalizedName());
    	GameRegistry.registerItem(platinumAxe, platinumAxe.getUnlocalizedName());
    	GameRegistry.registerItem(platinumPickaxe, platinumPickaxe.getUnlocalizedName());
    	GameRegistry.registerItem(platinumHoe, platinumHoe.getUnlocalizedName());
    	GameRegistry.registerItem(platinumShovel, platinumShovel.getUnlocalizedName());
    	GameRegistry.registerItem(platinumSword, platinumSword.getUnlocalizedName());
    	GameRegistry.registerItem(platinumHelmet, platinumHelmet.getUnlocalizedName());
    	GameRegistry.registerItem(platinumChestplate, platinumChestplate.getUnlocalizedName());
    	GameRegistry.registerItem(platinumLeggings, platinumLeggings.getUnlocalizedName());
    	GameRegistry.registerItem(platinumBoots, platinumBoots.getUnlocalizedName());
	}
}
