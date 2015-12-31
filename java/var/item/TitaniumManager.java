package var.item;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import var.base.BaseArmor;
import var.base.BaseAxe;
import var.base.BaseHoe;
import var.base.BaseItem;
import var.base.BaseManager;
import var.base.BasePickaxe;
import var.base.BaseSpade;
import var.base.BaseSword;
import var.creative.NMMTabManager;

public class TitaniumManager extends BaseManager {

public TitaniumManager(){init();register();}
	
	public static ToolMaterial titanium = EnumHelper.addToolMaterial("Titanium", 3, 500, 8.0F, 6.0F, 14);
	public static ArmorMaterial titaniumArmor = EnumHelper.addArmorMaterial("TITANIUM", "Titanium", 15, new int[]{4, 8, 6, 4}, 12);
	public static Item titaniumIngot;
	public static Item titaniumSword;
	public static Item titaniumHoe;
	public static Item titaniumShovel;
	public static Item titaniumPickaxe;
	public static Item titaniumAxe;
	public static Item titaniumHelmet;
	public static Item titaniumChestplate;
	public static Item titaniumLeggings;
	public static Item titaniumBoots;
	public static Item unsmeltedTitanium;
	public static Item lightningRod;
	
	
	@Override
	public void init() {
		titaniumIngot = new BaseItem().setup("titaniumIngot", NMMTabManager.nmmRaw, "titaniumIngot");
		titaniumSword = new BaseSword(titanium).setup("titaniumSword", NMMTabManager.nmmCombat, "titaniumSword");
		titaniumHoe = new BaseHoe(titanium).setup("titaniumHoe", NMMTabManager.nmmTools, "titaniumHoe");
		titaniumShovel = new BaseSpade(titanium).setup("titaniumShovel", NMMTabManager.nmmTools, "titaniumShovel");
		titaniumPickaxe = new BasePickaxe(titanium).setup("titaniumPickaxe", NMMTabManager.nmmTools, "titaniumPickaxe");
		titaniumAxe = new BaseAxe(titanium).setup("titaniumAxe", NMMTabManager.nmmTools, "titaniumAxe");
		titaniumHelmet = new BaseArmor(titaniumArmor, 0, 0).setup("TitaniumHelmet", NMMTabManager.nmmCombat, "titaniumHelmet");
		titaniumChestplate = new BaseArmor(titaniumArmor, 0, 1).setup("TitaniumChestplate", NMMTabManager.nmmCombat, "titaniumChestplate");
		titaniumLeggings = new BaseArmor(titaniumArmor, 0, 2).setup("TitaniumLeggings", NMMTabManager.nmmCombat, "titaniumLeggings");
		titaniumBoots = new BaseArmor(titaniumArmor, 0, 3).setup("TitaniumBoots", NMMTabManager.nmmCombat, "titaniumBoots");
		unsmeltedTitanium = new BaseItem().setup("unsmeltedTitanium", NMMTabManager.nmmRaw, "unsmeltedTitanium");
		lightningRod = new BaseItem().setup("lightningConductor", NMMTabManager.nmmRaw, "lightningConductor").setMaxStackSize(1);
	}
	
	@Override
	public void register() {
		regItem(titaniumIngot);
		regItem(titaniumSword);
		regItem(titaniumHoe);
		regItem(titaniumPickaxe);
		regItem(titaniumShovel);
		regItem(titaniumAxe);
		regItem(titaniumHelmet);
		regItem(titaniumChestplate);
		regItem(titaniumLeggings);
		regItem(titaniumBoots);
		regItem(unsmeltedTitanium);
		regItem(lightningRod);
	}
}
