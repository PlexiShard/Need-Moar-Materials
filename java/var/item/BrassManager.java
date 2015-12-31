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

public class BrassManager extends BaseManager{
	public BrassManager(){init();register();}
	
	public static ToolMaterial brass = EnumHelper.addToolMaterial("Brass", 2, 300, 7.5F, 8.5F, 14); 
	public static ArmorMaterial brassArmor = EnumHelper.addArmorMaterial("BRASS", "Brass", 10, new int[]{3, 7, 5, 3}, 10);
	public static Item brassIngot;
	public static Item brassSword;
	public static Item brassHoe;
	public static Item brassShovel;
	public static Item brassPickaxe;
	public static Item brassAxe;
	public static Item brassHelmet;
	public static Item brassChestplate;
	public static Item brassLeggings;
	public static Item brassBoots;
	
	
	@Override
	public void init() {
		brassIngot = new BaseItem().setup("brassIngot", NMMTabManager.nmmRaw, "brassIngot");
		brassSword = new BaseSword(brass).setup("brassSword", NMMTabManager.nmmCombat, "brassSword");
		brassHoe = new BaseHoe(brass).setup("brassHoe", NMMTabManager.nmmTools, "brassHoe");
		brassShovel = new BaseSpade(brass).setup("brassShovel", NMMTabManager.nmmTools, "brassShovel");
		brassPickaxe = new BasePickaxe(brass).setup("brassPickaxe", NMMTabManager.nmmTools, "brassPickaxe");
		brassAxe = new BaseAxe(brass).setup("brassAxe", NMMTabManager.nmmTools, "brassAxe");
		brassHelmet = new BaseArmor(brassArmor, 0, 0).setup("BrassHelmet", NMMTabManager.nmmCombat, "brassHelmet");
		brassChestplate = new BaseArmor(brassArmor, 0, 1).setup("BrassChestplate", NMMTabManager.nmmCombat, "brassChestplate");
		brassLeggings = new BaseArmor(brassArmor, 0, 2).setup("BrassLeggings", NMMTabManager.nmmCombat, "brassLeggings");
		brassBoots = new BaseArmor(brassArmor, 0, 3).setup("BrassBoots", NMMTabManager.nmmCombat, "brassBoots");
	}
	
	@Override
	public void register() {
		regItem(brassIngot);
		regItem(brassSword);
		regItem(brassHoe);
		regItem(brassPickaxe);
		regItem(brassShovel);
		regItem(brassAxe);
		regItem(brassHelmet);
		regItem(brassChestplate);
		regItem(brassLeggings);
		regItem(brassBoots);
	}
}
