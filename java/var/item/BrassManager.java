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
	public static BaseItem brassIngot;
	public static BaseItem brassSword;
	public static BaseItem brassHoe;
	public static BaseItem brassShovel;
	public static BaseItem brassPickaxe;
	public static BaseItem brassAxe;
	public static BaseArmor brassHelmet;
	public static BaseArmor brassChestplate;
	public static BaseArmor brassLeggings;
	public static BaseArmor brassBoots;
	public static BaseItem copperIngot;
	
	@Override
	public void init() {
		brassIngot = new BaseItem("brassIngot", NMMTabManager.nmmRaw, "brassIngot");
		brassSword = new BaseSword(brass, "brassSword", NMMTabManager.nmmCombat, "brassSword");
		brassHoe = new BaseHoe(brass, "brassHoe", NMMTabManager.nmmTools, "brassHoe");
		brassShovel = new BaseSpade(brass, "brassShovel", NMMTabManager.nmmTools, "brassShovel");
		brassPickaxe = new BasePickaxe(brass, "brassPickaxe", NMMTabManager.nmmTools, "brassPickaxe");
		brassAxe = new BaseAxe(brass, "brassAxe", NMMTabManager.nmmTools, "brassAxe");
		brassHelmet = new BaseArmor(brassArmor, 0, "brassHelmet", NMMTabManager.nmmCombat, "brassHelmet");
		brassChestplate = new BaseArmor(brassArmor, 1, "brassChestplate", NMMTabManager.nmmCombat, "brassChestplate");
		brassLeggings = new BaseArmor(brassArmor, 2, "brassLeggings", NMMTabManager.nmmCombat, "brassLeggings");
		brassBoots = new BaseArmor(brassArmor, 3, "brassBoots", NMMTabManager.nmmCombat, "brassBoots");
		copperIngot = new BaseItem("copperIngot", NMMTabManager.nmmRaw, "copperIngot");
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
		regItem(copperIngot);
	}
}
