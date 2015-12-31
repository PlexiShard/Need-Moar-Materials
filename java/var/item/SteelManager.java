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

public class SteelManager extends BaseManager {

public SteelManager(){init();register();}
	
	public static ToolMaterial steel = EnumHelper.addToolMaterial("Steel", 3, 2500, 6.0F, 4.0F, 14);
	public static ArmorMaterial steelArmor = EnumHelper.addArmorMaterial("STEEL", "Steel", 25, new int[]{4, 6, 4, 3}, 9);	
	public static Item steelIngot;
	public static Item steelSword;
	public static Item steelHoe;
	public static Item steelShovel;
	public static Item steelPickaxe;
	public static Item steelAxe;
	public static Item steelHelmet;
	public static Item steelChestplate;
	public static Item steelLeggings;
	public static Item steelBoots;
	
	
	@Override
	public void init() {
		steelIngot = new BaseItem().setup("steelIngot", NMMTabManager.nmmRaw, "steelIngot");
		steelSword = new BaseSword(steel).setup("steelSword", NMMTabManager.nmmCombat, "steelSword");
		steelHoe = new BaseHoe(steel).setup("steelHoe", NMMTabManager.nmmTools, "steelHoe");
		steelShovel = new BaseSpade(steel).setup("steelShovel", NMMTabManager.nmmTools, "steelShovel");
		steelPickaxe = new BasePickaxe(steel).setup("steelPickaxe", NMMTabManager.nmmTools, "steelPickaxe");
		steelAxe = new BaseAxe(steel).setup("steelAxe", NMMTabManager.nmmTools, "steelAxe");
		steelHelmet = new BaseArmor(steelArmor, 0, 0).setup("SteelHelmet", NMMTabManager.nmmCombat, "steelHelmet");
		steelChestplate = new BaseArmor(steelArmor, 0, 1).setup("SteelChestplate", NMMTabManager.nmmCombat, "steelChestplate");
		steelLeggings = new BaseArmor(steelArmor, 0, 2).setup("SteelLeggings", NMMTabManager.nmmCombat, "steelLeggings");
		steelBoots = new BaseArmor(steelArmor, 0, 3).setup("SteelBoots", NMMTabManager.nmmCombat, "steelBoots");
	}
	
	@Override
	public void register() {
		regItem(steelIngot);
		regItem(steelSword);
		regItem(steelHoe);
		regItem(steelPickaxe);
		regItem(steelShovel);
		regItem(steelAxe);
		regItem(steelHelmet);
		regItem(steelChestplate);
		regItem(steelLeggings);
		regItem(steelBoots);
	}

}
