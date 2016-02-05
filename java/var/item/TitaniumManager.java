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
	public static BaseItem titaniumIngot;
	public static BaseItem titaniumSword;
	public static BaseItem titaniumHoe;
	public static BaseItem titaniumShovel;
	public static BaseItem titaniumPickaxe;
	public static BaseItem titaniumAxe;
	public static BaseArmor titaniumHelmet;
	public static BaseArmor titaniumChestplate;
	public static BaseArmor titaniumLeggings;
	public static BaseArmor titaniumBoots;
	public static BaseItem unsmeltedTitanium;
	public static BaseItem lightningRod;
	
	
	@Override
	public void init() {
		titaniumIngot = new BaseItem("titaniumIngot", NMMTabManager.nmmRaw, "titaniumIngot");
		titaniumSword = new BaseSword(titanium, "titaniumSword", NMMTabManager.nmmCombat, "titaniumSword");
		titaniumHoe = new BaseHoe(titanium, "titaniumHoe", NMMTabManager.nmmTools, "titaniumHoe");
		titaniumShovel = new BaseSpade(titanium, "titaniumShovel", NMMTabManager.nmmTools, "titaniumShovel");
		titaniumPickaxe = new BasePickaxe(titanium, "titaniumPickaxe", NMMTabManager.nmmTools, "titaniumPickaxe");
		titaniumAxe = new BaseAxe(titanium, "titaniumAxe", NMMTabManager.nmmTools, "titaniumAxe");
		titaniumHelmet = new BaseArmor(titaniumArmor, 0, "titaniumHelmet", NMMTabManager.nmmCombat, "titaniumHelmet");
		titaniumChestplate = new BaseArmor(titaniumArmor, 1, "titaniumChestplate", NMMTabManager.nmmCombat, "titaniumChestplate");
		titaniumLeggings = new BaseArmor(titaniumArmor, 2, "titaniumLeggings", NMMTabManager.nmmCombat, "titaniumLeggings");
		titaniumBoots = new BaseArmor(titaniumArmor, 3, "titaniumBoots", NMMTabManager.nmmCombat, "titaniumBoots");
		unsmeltedTitanium = new BaseItem("unsmeltedTitanium", NMMTabManager.nmmRaw, "unsmeltedTitanium");
		lightningRod = new BaseItem("lightningConductor", NMMTabManager.nmmRaw, "lightningConductor").setMaxStackSize(1);
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
