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
	public static ToolMaterial titanium = EnumHelper.addToolMaterial("Titanium", 3, 500, 8.0F, 6.0F, 14);
	public static ArmorMaterial titaniumArmor = EnumHelper.addArmorMaterial("Titanium", 15, new int[]{4, 12, 6, 4}, 12);
	
	//platinum
	public static ToolMaterial platinum = EnumHelper.addToolMaterial("Platinum", 3, 5000, 6.0F, 2.0F, 25);
	public static ArmorMaterial platinumArmor = EnumHelper.addArmorMaterial("Platinum", 50, new int[]{4, 9, 5, 3}, 9);
	//steel
	public static ToolMaterial steel = EnumHelper.addToolMaterial("Steel", 3, 2500, 6.0F, 4.0F, 14);
	public static ArmorMaterial steelArmor = EnumHelper.addArmorMaterial("Steel", 25, new int[]{4, 8, 6, 4}, 9);
	
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
	//steel
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
	//Elemental Swords
	public static Item lightningSword;
	public static Item poisonSword;
	public static Item skySword;
	public static Item fireSword;
	public static Item darknessSword;
	//Misc. Items
	public static Item lightningConductor;
	public static Item darknessDust;
	
	//block calling
	//titanium
	public static Block titaniumOre;
	public static Block titaniumBlock;
	//platinum
	public static Block platinumOre;
	public static Block platinumBlock;
	//steel
	public static Block steelOre;
	public static Block steelBlock;
    
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
    	//steel
    	steelAxe = new SteelAxe(steel).setUnlocalizedName("steelAxe").setCreativeTab(CreativeTabsManager.xtramaterialsTab).setTextureName("cm:steelAxe");
    	steelHoe = new SteelHoe(steel).setUnlocalizedName("steelHoe").setCreativeTab(CreativeTabsManager.xtramaterialsTab).setTextureName("cm:steelHoe");
    	steelPickaxe = new SteelPickaxe(steel).setUnlocalizedName("steelPickaxe").setCreativeTab(CreativeTabsManager.xtramaterialsTab).setTextureName("cm:steelPickaxe");
    	steelIngot = new SteelIngot().setUnlocalizedName("steelIngot").setCreativeTab(CreativeTabsManager.xtramaterialsTab).setTextureName("cm:steelIngot");
    	steelShovel = new SteelShovel(steel).setUnlocalizedName("steelShovel").setCreativeTab(CreativeTabsManager.xtramaterialsTab).setTextureName("cm:steelShovel");
    	steelSword = new SteelSword(steel).setUnlocalizedName("steelSword").setCreativeTab(CreativeTabsManager.xtramaterialsTab).setTextureName("cm:steelSword");
    	steelHelmet = new SteelHelmet(steelArmor, MainRegistry.proxy.addArmor("SteelHelmet"), 0).setUnlocalizedName("steelHelmet").setCreativeTab(CreativeTabsManager.xtramaterialsTab).setTextureName("cm:steelHelmet");
    	steelChestplate = new SteelChestplate(steelArmor, MainRegistry.proxy.addArmor("SteelChestplate"), 1).setUnlocalizedName("steelChestplate").setCreativeTab(CreativeTabsManager.xtramaterialsTab).setTextureName("cm:steelChestplate");
    	steelLeggings = new SteelLeggings(steelArmor, MainRegistry.proxy.addArmor("SteelLeggings"), 2).setUnlocalizedName("steelLeggings").setCreativeTab(CreativeTabsManager.xtramaterialsTab).setTextureName("cm:steelLeggings");
    	steelBoots = new SteelBoots(steelArmor, MainRegistry.proxy.addArmor("SteelBoots"), 3).setUnlocalizedName("steelBoots").setCreativeTab(CreativeTabsManager.xtramaterialsTab).setTextureName("cm:steelBoots");
    	//Elemental Swords
    	lightningSword = new LightningSword(titanium).setUnlocalizedName("lightningRod").setCreativeTab(CreativeTabsManager.xtramaterialsTab).setTextureName("cm:lightningSword").setMaxDamage(100);
    	poisonSword = new PoisonSword(titanium).setUnlocalizedName("poisonSword").setCreativeTab(CreativeTabsManager.xtramaterialsTab).setTextureName("cm:poisonSword").setMaxDamage(100);
    	skySword = new SkySword(titanium).setUnlocalizedName("skySword").setCreativeTab(CreativeTabsManager.xtramaterialsTab).setTextureName("cm:skySword").setMaxDamage(100);
    	fireSword = new FireSword(titanium).setUnlocalizedName("fireSword").setCreativeTab(CreativeTabsManager.xtramaterialsTab).setTextureName("cm:fireSword").setMaxDamage(100);
    	darknessSword = new DarknessSword(titanium).setUnlocalizedName("darknessSword").setCreativeTab(CreativeTabsManager.xtramaterialsTab).setTextureName("cm:darknessSword").setMaxDamage(100);
    	//Misc. Items
    	lightningConductor = new LightningConductor();
    	darknessDust = new DarknessDust().setUnlocalizedName("darknessDust").setCreativeTab(CreativeTabsManager.xtramaterialsTab).setTextureName("cm:darknessDust");
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
    	//steel
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
    	//Elemental Swords
    	GameRegistry.registerItem(lightningSword, lightningSword.getUnlocalizedName());
    	GameRegistry.registerItem(poisonSword, poisonSword.getUnlocalizedName());
    	GameRegistry.registerItem(skySword, skySword.getUnlocalizedName());
    	GameRegistry.registerItem(fireSword, fireSword.getUnlocalizedName());
    	GameRegistry.registerItem(darknessSword, darknessSword.getUnlocalizedName());
    	//Misc. Items
    	GameRegistry.registerItem(lightningConductor, lightningConductor.getUnlocalizedName());
    	GameRegistry.registerItem(darknessDust, darknessDust.getUnlocalizedName());
    	
    }
    
}
