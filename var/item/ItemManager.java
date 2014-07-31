package var.item;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

import var.creativetabs.CreativeTabsManager;
import var.main.MainRegistry;

import cpw.mods.fml.common.registry.GameRegistry;

public class ItemManager {
	public static void mainRegistry() {
        initializeItem();
        registerItem();
    }
 
	//materials
	//titanium
	public static ToolMaterial titanium = EnumHelper.addToolMaterial("Titanium", 3, 3200, 8F, 8F, 14);
	public static ArmorMaterial titaniumArmor = EnumHelper.addArmorMaterial("Titanium", 40, new int[]{4, 10, 6, 4}, 12);
	
    public static void initializeItem() {
    	//titanium
    	titaniumIngot = new TitaniumIngot();
    	unsmeltedTitanium = new UnsmeltedTitanium();
    	titaniumPickaxe = new TitaniumPickaxe(titanium).setUnlocalizedName("titaniumPickaxe").setCreativeTab(CreativeTabsManager.xtramaterialsTab).setTextureName("cm:titaniumPickaxe");
    	titaniumSword = new TitaniumSword(titanium).setUnlocalizedName("titaniumSword").setCreativeTab(CreativeTabsManager.xtramaterialsTab).setTextureName("cm:titaniumSword");
        titaniumAxe = new TitaniumPickaxe(titanium).setUnlocalizedName("titaniumAxe").setCreativeTab(CreativeTabsManager.xtramaterialsTab).setTextureName("cm:titaniumAxe"); 
        titaniumShovel = new TitaniumPickaxe(titanium).setUnlocalizedName("titaniumShovel").setCreativeTab(CreativeTabsManager.xtramaterialsTab).setTextureName("cm:titaniumShovel");
        titaniumHoe = new TitaniumPickaxe(titanium).setUnlocalizedName("titaniumHoe").setCreativeTab(CreativeTabsManager.xtramaterialsTab).setTextureName("cm:titaniumHoe");
        lightningSword = new LightningSword(titanium).setUnlocalizedName("lightningRod").setCreativeTab(CreativeTabsManager.xtramaterialsTab).setTextureName("cm:lightningSword");
    	lightningConductor = new LightningConductor();
    	titaniumHelmet = new TitaniumHelmet(titaniumArmor, MainRegistry.proxy.addArmor("TitaniumHelmet"), 0).setCreativeTab(CreativeTabsManager.xtramaterialsTab).setTextureName("cm:titaniumHelmet").setUnlocalizedName("titaniumHelmet");
    	titaniumChestplate = new TitaniumChestplate(titaniumArmor, MainRegistry.proxy.addArmor("TitaniumChestplate"), 1).setCreativeTab(CreativeTabsManager.xtramaterialsTab).setTextureName("cm:titaniumChestplate").setUnlocalizedName("titaniumChestplate");
    	titaniumLeggings = new TitaniumLeggings(titaniumArmor, MainRegistry.proxy.addArmor("TitaniumLeggings"), 2).setCreativeTab(CreativeTabsManager.xtramaterialsTab).setTextureName("cm:titaniumLegs").setUnlocalizedName("titaniumLeggings");
    	titaniumBoots = new TitaniumBoots(titaniumArmor, MainRegistry.proxy.addArmor("TitaniumBoots"), 3).setCreativeTab(CreativeTabsManager.xtramaterialsTab).setTextureName("cm:titaniumBoots").setUnlocalizedName("titaniumBoots");
    
    	//platinum
    	platinumIngot = new PlatinumIngot();
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
    	GameRegistry.registerItem(lightningSword, lightningSword.getUnlocalizedName());
    	GameRegistry.registerItem(lightningConductor, lightningConductor.getUnlocalizedName());
    	GameRegistry.registerItem(titaniumHelmet, titaniumHelmet.getUnlocalizedName());
    	GameRegistry.registerItem(titaniumChestplate, titaniumChestplate.getUnlocalizedName());
    	GameRegistry.registerItem(titaniumLeggings, titaniumLeggings.getUnlocalizedName());
    	GameRegistry.registerItem(titaniumBoots, titaniumBoots.getUnlocalizedName());
    	//platinum
    	GameRegistry.registerItem(platinumIngot, platinumIngot.getUnlocalizedName());
    }
    //item calling
    //titanium
	public static Item titaniumIngot;
	public static Item unsmeltedTitanium;
	public static Item titaniumPickaxe;
	public static Item titaniumSword;
	public static Item lightningSword;
    public static Item titaniumAxe;
    public static Item titaniumShovel;
	public static Item titaniumHoe;
	public static Item lightningConductor;
	public static Item titaniumHelmet;
	public static Item titaniumChestplate;
	public static Item titaniumLeggings;
	public static Item titaniumBoots;
	//platinum
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
	
	//block calling
	//titanium
	public static Block titaniumOre;
	public static Block titaniumBlock;
	//platinum
	public static Block platinumOre;
	public static Block platinumBlock;
}
