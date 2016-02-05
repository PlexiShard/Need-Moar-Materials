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

public class PlatinumManager extends BaseManager {

public PlatinumManager(){init();register();}
	
	public static ToolMaterial platinum = EnumHelper.addToolMaterial("Platinum", 3, 5000, 6.0F, 2.0F, 25);
	public static ArmorMaterial platinumArmor = EnumHelper.addArmorMaterial("PLATINUM", "Platinum", 50, new int[]{4, 9, 5, 3}, 9);
	public static BaseItem platinumIngot;
	public static BaseItem platinumSword;
	public static BaseItem platinumHoe;
	public static BaseItem platinumShovel;
	public static BaseItem platinumPickaxe;
	public static BaseItem platinumAxe;
	public static BaseArmor platinumHelmet;
	public static BaseArmor platinumChestplate;
	public static BaseArmor platinumLeggings;
	public static BaseArmor platinumBoots;
	
	
	@Override
	public void init() {
		platinumIngot = new BaseItem("platinumIngot", NMMTabManager.nmmRaw, "platinumIngot");
		platinumSword = new BaseSword(platinum, "platinumSword", NMMTabManager.nmmCombat, "platinumSword");
		platinumHoe = new BaseHoe(platinum, "platinumHoe", NMMTabManager.nmmTools, "platinumHoe");
		platinumShovel = new BaseSpade(platinum, "platinumShovel", NMMTabManager.nmmTools, "platinumShovel");
		platinumPickaxe = new BasePickaxe(platinum, "platinumPickaxe", NMMTabManager.nmmTools, "platinumPickaxe");
		platinumAxe = new BaseAxe(platinum, "platinumAxe", NMMTabManager.nmmTools, "platinumAxe");
		platinumHelmet = new BaseArmor(platinumArmor, 0, "platinumHelmet", NMMTabManager.nmmCombat, "platinumHelmet");
		platinumChestplate = new BaseArmor(platinumArmor, 1, "platinumChestplate", NMMTabManager.nmmCombat, "platinumChestplate");
		platinumLeggings = new BaseArmor(platinumArmor, 2, "platinumLeggings", NMMTabManager.nmmCombat, "platinumLeggings");
		platinumBoots = new BaseArmor(platinumArmor, 3, "platinumBoots", NMMTabManager.nmmCombat, "platinumBoots");
	}
	
	@Override
	public void register() {
		regItem(platinumIngot);
		regItem(platinumSword);
		regItem(platinumHoe);
		regItem(platinumPickaxe);
		regItem(platinumShovel);
		regItem(platinumAxe);
		regItem(platinumHelmet);
		regItem(platinumChestplate);
		regItem(platinumLeggings);
		regItem(platinumBoots);
	}

}
