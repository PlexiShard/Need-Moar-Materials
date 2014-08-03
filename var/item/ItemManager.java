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
	public static ToolMaterial titanium = EnumHelper.addToolMaterial("Titanium", 3, 1000, 8.0F, 6.0F, 14);
	public static ArmorMaterial titaniumArmor = EnumHelper.addArmorMaterial("Titanium", 15, new int[]{4, 12, 6, 4}, 12);
	
	//platinum
	public static ToolMaterial platinum = EnumHelper.addToolMaterial("Platinum", 3, 5000, 6.0F, 2.0F, 25);
	public static ArmorMaterial platinumArmor = EnumHelper.addArmorMaterial("Platinum", 50, new int[]{4, 9, 5, 3}, 9);
	
    public static void initializeItem() {
    	//titanium
    	titaniumIngot = new TitaniumIngot();
    	unsmeltedTitanium = new UnsmeltedTitanium();
    	titaniumPickaxe = new TitaniumPickaxe(titanium).setUnlocalizedName("titaniumPickaxe").setCreativeTab(CreativeTabsManager.xtramaterialsTab).setTextureName("cm:titaniumPickaxe");
    	titaniumSword = new TitaniumSword(titanium).setUnlocalizedName("titaniumSword").setCreativeTab(CreativeTabsManager.xtramaterialsTab).setTextureName("cm:titaniumSword");
        titaniumAxe = new TitaniumAxe(titanium).setUnlocalizedName("titaniumAxe").setCreativeTab(CreativeTabsManager.xtramaterialsTab).setTextureName("cm:titaniumAxe"); 
        titaniumShovel = new TitaniumShovel(titanium).setUnlocalizedName("titaniumShovel").setCreativeTab(CreativeTabsManager.xtramaterialsTab).setTextureName("cm:titaniumShovel");
        titaniumHoe = new TitaniumHoe(titanium).setUnlocalizedName("titaniumHoe").setCreativeTab(CreativeTabsManager.xtramaterialsTab).setTextureName("cm:titaniumHoe");
    	titaniumHelmet = new TitaniumHelmet(titaniumArmor, MainRegistry.proxy.addArmor("TitaniumHelmet"), 0).setCreativeTab(CreativeTabsManager.xtramaterialsTab).setTextureName("cm:titaniumHelmet").setUnlocalizedName("titaniumHelmet");
    	titaniumChestplate = new TitaniumChestplate(titaniumArmor, MainRegistry.proxy.addArmor("TitaniumChestplate"), 1).setCreativeTab(CreativeTabsManager.xtramaterialsTab).setTextureName("cm:titaniumChestplate").setUnlocalizedName("titaniumChestplate");
    	titaniumLeggings = new TitaniumLeggings(titaniumArmor, MainRegistry.proxy.addArmor("TitaniumLeggings"), 2).setCreativeTab(CreativeTabsManager.xtramaterialsTab).setTextureName("cm:titaniumLegs").setUnlocalizedName("titaniumLeggings");
    	titaniumBoots = new TitaniumBoots(titaniumArmor, MainRegistry.proxy.addArmor("TitaniumBoots"), 3).setCreativeTab(CreativeTabsManager.xtramaterialsTab).setTextureName("cm:titaniumBoots").setUnlocalizedName("titaniumBoots");
    	//platinum
    	platinumIngot = new PlatinumIngot();
    	platinumAxe = new PlatinumAxe(platinum).setUnlocalizedName("platinumAxe").setCreativeTab(CreativeTabsManager.xtramaterialsTab).setTextureName("cm:platinumAxe");
    	platinumHoe = new PlatinumHoe(platinum).setUnlocalizedName("platinumHoe").setCreativeTab(CreativeTabsManager.xtramaterialsTab).setTextureName("cm:platinumHoe");
    	platinumPickaxe = new PlatinumPickaxe(platinum).setUnlocalizedName("platinumPickaxe").setCreativeTab(CreativeTabsManager.xtramaterialsTab).setTextureName("cm:platinumPickaxe");
    	platinumShovel = new PlatinumShovel(platinum).setUnlocalizedName("platinumShovel").setCreativeTab(CreativeTabsManager.xtramaterialsTab).setTextureName("cm:platinumShovel");
    	platinumSword = new PlatinumSword(platinum).setUnlocalizedName("platinumSword").setCreativeTab(CreativeTabsManager.xtramaterialsTab).setTextureName("cm:platinumSword");
    	platinumHelmet = new PlatinumHelmet(platinumArmor, MainRegistry.proxy.addArmor("platinumHelmet"), 0).setCreativeTab(CreativeTabsManager.xtramaterialsTab).setTextureName("cm:platinumHelmet").setUnlocalizedName("platinumHelmet");
    	platinumChestplate = new PlatinumChestPlate(platinumArmor, MainRegistry.proxy.addArmor("platinumChestplate"), 1).setCreativeTab(CreativeTabsManager.xtramaterialsTab).setTextureName("cm:platinumChestplate").setUnlocalizedName("platinumChestplate");
    	platinumLeggings = new PlatinumLeggings(platinumArmor, MainRegistry.proxy.addArmor("platinumLeggings"), 2).setCreativeTab(CreativeTabsManager.xtramaterialsTab).setTextureName("cm:platinumLeggings").setUnlocalizedName("platinumLeggings");
    	platinumBoots = new PlatinumBoots(platinumArmor, MainRegistry.proxy.addArmor("platinumBoots"), 3).setCreativeTab(CreativeTabsManager.xtramaterialsTab).setTextureName("cm:platinumBoots").setUnlocalizedName("platinumBoots");
    	//Elemental Swords
    	lightningSword = new LightningSword(titanium).setUnlocalizedName("lightningRod").setCreativeTab(CreativeTabsManager.xtramaterialsTab).setTextureName("cm:lightningSword").setMaxDamage(100);
    	poisonSword = new PoisonSword(titanium).setUnlocalizedName("poisonSword").setCreativeTab(CreativeTabsManager.xtramaterialsTab).setTextureName("cm:poisonSword").setMaxDamage(100);
    	skySword = new SkySword(titanium).setUnlocalizedName("skySword").setCreativeTab(CreativeTabsManager.xtramaterialsTab).setTextureName("cm:skySword").setMaxDamage(100);
    	//Misc. Items
    	lightningConductor = new LightningConductor();
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
    	//platinum
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
    	//Elemental Swords
    	GameRegistry.registerItem(lightningSword, lightningSword.getUnlocalizedName());
    	GameRegistry.registerItem(poisonSword, poisonSword.getUnlocalizedName());
    	GameRegistry.registerItem(skySword, skySword.getUnlocalizedName());
    	//Misc. Items
    	GameRegistry.registerItem(lightningConductor, lightningConductor.getUnlocalizedName());
    	
    }
    //item calling
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
	//Elemental Swords
	public static Item lightningSword;
	public static Item poisonSword;
	public static Item skySword;
	//Misc. Items
	public static Item lightningConductor;
	
	//block calling
	//titanium
	public static Block titaniumOre;
	public static Block titaniumBlock;
	//platinum
	public static Block platinumOre;
	public static Block platinumBlock;
}
