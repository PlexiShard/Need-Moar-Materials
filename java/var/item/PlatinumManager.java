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
	public static Item platinumIngot;
	public static Item platinumSword;
	public static Item platinumHoe;
	public static Item platinumShovel;
	public static Item platinumPickaxe;
	public static Item platinumAxe;
	public static Item platinumHelmet;
	public static Item platinumChestplate;
	public static Item platinumLeggings;
	public static Item platinumBoots;
	
	
	@Override
	public void init() {
		platinumIngot = new BaseItem().setup("platinumIngot", NMMTabManager.nmmRaw, "platinumIngot");
		platinumSword = new BaseSword(platinum).setup("platinumSword", NMMTabManager.nmmCombat, "platinumSword");
		platinumHoe = new BaseHoe(platinum).setup("platinumHoe", NMMTabManager.nmmTools, "platinumHoe");
		platinumShovel = new BaseSpade(platinum).setup("platinumShovel", NMMTabManager.nmmTools, "platinumShovel");
		platinumPickaxe = new BasePickaxe(platinum).setup("platinumPickaxe", NMMTabManager.nmmTools, "platinumPickaxe");
		platinumAxe = new BaseAxe(platinum).setup("platinumAxe", NMMTabManager.nmmTools, "platinumAxe");
		platinumHelmet = new BaseArmor(platinumArmor, 0, 0).setup("PlatinumHelmet", NMMTabManager.nmmCombat, "platinumHelmet");
		platinumChestplate = new BaseArmor(platinumArmor, 0, 1).setup("PlatinumChestplate", NMMTabManager.nmmCombat, "platinumChestplate");
		platinumLeggings = new BaseArmor(platinumArmor, 0, 2).setup("PlatinumLeggings", NMMTabManager.nmmCombat, "platinumLeggings");
		platinumBoots = new BaseArmor(platinumArmor, 0, 3).setup("PlatinumBoots", NMMTabManager.nmmCombat, "platinumBoots");
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
