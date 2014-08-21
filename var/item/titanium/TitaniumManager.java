package var.item.titanium;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import var.creativetabs.CreativeTabsManager;
import var.main.MainRegistry;

public class TitaniumManager {
	public static void mainRegistry() {
		initializeItem();
		registerItem();
	}
	
	//titanium
	public static ToolMaterial titanium = EnumHelper.addToolMaterial("Titanium", 3, 500, 8.0F, 6.0F, 14);
	public static ArmorMaterial titaniumArmor = EnumHelper.addArmorMaterial("Titanium", 15, new int[]{4, 8, 6, 4}, 12);
	
	//titanium
	public static Item titaniumIngot;
	public static Item unsmeltedTitanium;
	public static Item titaniumPickaxe;
	public static Item titaniumSword;
	public static Item titaniumAxe;
	public static Item titaniumShovel;
	public static Item titaniumHoe;
	public static Item titaniumHelmet;
	public static Item titaniumChestplate;
	public static Item titaniumLeggings;
	public static Item titaniumBoots;
	
	public static void initializeItem() {
		//titanium
		titaniumIngot = new TitaniumIngot();
		unsmeltedTitanium = new UnsmeltedTitanium();
		titaniumPickaxe = new TitaniumPickaxe(titanium).setUnlocalizedName("titaniumPickaxe").setCreativeTab(CreativeTabsManager.nmmTools).setTextureName("titanium:titaniumPickaxe");
		titaniumSword = new TitaniumSword(titanium).setUnlocalizedName("titaniumSword").setCreativeTab(CreativeTabsManager.nmmCombat).setTextureName("titanium:titaniumSword");
		titaniumAxe = new TitaniumAxe(titanium).setUnlocalizedName("titaniumAxe").setCreativeTab(CreativeTabsManager.nmmTools).setTextureName("titanium:titaniumAxe"); 
    	titaniumShovel = new TitaniumShovel(titanium).setUnlocalizedName("titaniumShovel").setCreativeTab(CreativeTabsManager.nmmTools).setTextureName("titanium:titaniumShovel");
    	titaniumHoe = new TitaniumHoe(titanium).setUnlocalizedName("titaniumHoe").setCreativeTab(CreativeTabsManager.nmmTools).setTextureName("titanium:titaniumHoe");
		titaniumHelmet = new TitaniumHelmet(titaniumArmor, MainRegistry.proxy.addArmor("TitaniumHelmet"), 0).setCreativeTab(CreativeTabsManager.nmmCombat).setTextureName("titanium:titaniumHelmet").setUnlocalizedName("titaniumHelmet");
		titaniumChestplate = new TitaniumChestplate(titaniumArmor, MainRegistry.proxy.addArmor("TitaniumChestplate"), 1).setCreativeTab(CreativeTabsManager.nmmCombat).setTextureName("titanium:titaniumChestplate").setUnlocalizedName("titaniumChestplate");
		titaniumLeggings = new TitaniumLeggings(titaniumArmor, MainRegistry.proxy.addArmor("TitaniumLeggings"), 2).setCreativeTab(CreativeTabsManager.nmmCombat).setTextureName("titanium:titaniumLegs").setUnlocalizedName("titaniumLeggings");
		titaniumBoots = new TitaniumBoots(titaniumArmor, MainRegistry.proxy.addArmor("TitaniumBoots"), 3).setCreativeTab(CreativeTabsManager.nmmCombat).setTextureName("titanium:titaniumBoots").setUnlocalizedName("titaniumBoots");
	}

	public static void registerItem() {
		//titanium
    	GameRegistry.registerItem(titaniumIngot, titaniumIngot.getUnlocalizedName());
    	GameRegistry.registerItem(unsmeltedTitanium, unsmeltedTitanium.getUnlocalizedName());
    	GameRegistry.registerItem(titaniumPickaxe, titaniumPickaxe.getUnlocalizedName());
    	GameRegistry.registerItem(titaniumSword, titaniumSword.getUnlocalizedName());
        GameRegistry.registerItem(titaniumShovel, titaniumShovel.getUnlocalizedName());
        GameRegistry.registerItem(titaniumAxe, titaniumAxe.getUnlocalizedName());
        GameRegistry.registerItem(titaniumHoe, titaniumHoe.getUnlocalizedName());
    	GameRegistry.registerItem(titaniumHelmet, titaniumHelmet.getUnlocalizedName());
    	GameRegistry.registerItem(titaniumChestplate, titaniumChestplate.getUnlocalizedName());
    	GameRegistry.registerItem(titaniumLeggings, titaniumLeggings.getUnlocalizedName());
    	GameRegistry.registerItem(titaniumBoots, titaniumBoots.getUnlocalizedName());
	}
	
}
