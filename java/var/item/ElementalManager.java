package var.item;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import var.base.BaseManager;
import var.creative.NMMTabManager;
import var.item.elemental.DarknessSword;
import var.item.elemental.FireArrow;
import var.item.elemental.FireBow;
import var.item.elemental.FireSword;
import var.item.elemental.HighLighter;
import var.item.elemental.LightningSword;
import var.item.elemental.PoisonSword;
import var.item.elemental.SkySword;
import var.item.elemental.SuperItem;

public class ElementalManager extends BaseManager{
	
	public static ToolMaterial elemental = EnumHelper.addToolMaterial("Elemental", 2, 100, 2.0F, 4.0F, 14);
	
	public static Item lightningSword;
	public static Item poisonSword;
	public static Item skySword;
	public static Item fireSword;
	public static Item darknessSword;
	public static Item fireBow;
	public static Item fireArrow;
	public static Item superItem;
	public static Item highLighter;
	
	@Override public void init() {
		lightningSword = new LightningSword(elemental).setup("lightningSword", NMMTabManager.nmmCombat, "lightningSword").setMaxDamage(100);
    	poisonSword = new PoisonSword(elemental).setup("poisonSword", NMMTabManager.nmmCombat, "poisonSword").setMaxDamage(100);
    	skySword = new SkySword(elemental).setup("skySword", NMMTabManager.nmmCombat, "skySword").setMaxDamage(100);
    	fireSword = new FireSword(elemental).setup("fireSword", NMMTabManager.nmmCombat, "fireSword").setMaxDamage(100);
    	darknessSword = new DarknessSword(elemental).setup("darknessSword", NMMTabManager.nmmCombat, "darknessSword").setMaxDamage(100);
    	fireBow = new FireBow().setup("fireBow", NMMTabManager.nmmCombat, "fireBow");
    	fireArrow = new FireArrow().setup("fireArrow", NMMTabManager.nmmCombat, "fireArrow");
    	superItem = new SuperItem().setup("superItem", NMMTabManager.nmmTools, "superItem");
    	highLighter = new HighLighter().setup("highLighter", NMMTabManager.nmmTools, "highLighter");
	}

	@Override public void register() {
		regItem(lightningSword);
    	regItem(poisonSword);
    	regItem(skySword);
    	regItem(fireSword);
    	regItem(darknessSword);
    	regItem(fireBow);
    	regItem(fireArrow);
    	regItem(superItem);
    	regItem(highLighter);
	}
}
