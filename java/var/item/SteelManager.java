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
	public static BaseItem steelIngot;
	public static BaseItem steelSword;
	public static BaseItem steelHoe;
	public static BaseItem steelShovel;
	public static BaseItem steelPickaxe;
	public static BaseItem steelAxe;
	public static BaseArmor steelHelmet;
	public static BaseArmor steelChestplate;
	public static BaseArmor steelLeggings;
	public static BaseArmor steelBoots;
	
	
	@Override
	public void init() {
		steelIngot = new BaseItem("steelIngot", NMMTabManager.nmmRaw, "steelIngot");
		steelSword = new BaseSword(steel, "steelSword", NMMTabManager.nmmCombat, "steelSword");
		steelHoe = new BaseHoe(steel, "steelHoe", NMMTabManager.nmmTools, "steelHoe");
		steelShovel = new BaseSpade(steel, "steelShovel", NMMTabManager.nmmTools, "steelShovel");
		steelPickaxe = new BasePickaxe(steel, "steelPickaxe", NMMTabManager.nmmTools, "steelPickaxe");
		steelAxe = new BaseAxe(steel, "steelAxe", NMMTabManager.nmmTools, "steelAxe");
		steelHelmet = new BaseArmor(steelArmor, 0, "steelHelmet", NMMTabManager.nmmCombat, "steelHelmet");
		steelChestplate = new BaseArmor(steelArmor, 1, "steelChestplate", NMMTabManager.nmmCombat, "steelChestplate");
		steelLeggings = new BaseArmor(steelArmor, 2, "steelLeggings", NMMTabManager.nmmCombat, "steelLeggings");
		steelBoots = new BaseArmor(steelArmor, 3, "steelBoots", NMMTabManager.nmmCombat, "steelBoots");
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
