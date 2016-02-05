package var.item;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import var.base.BaseItem;
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
	
	public ElementalManager(){init();register();}
	
	public static ToolMaterial elemental = EnumHelper.addToolMaterial("Elemental", 2, 100, 2.0F, 4.0F, 14);
	
	public static BaseItem lightningSword;
	public static BaseItem poisonSword;
	public static BaseItem skySword;
	public static BaseItem fireSword;
	public static BaseItem darknessDust;
	public static BaseItem darknessSword;
	public static BaseItem fireBow;
	public static BaseItem fireArrow;
	public static BaseItem superItem;
	public static BaseItem highLighter;
	
	@Override public void init() {
		lightningSword = new LightningSword(elemental, "lightningSword", NMMTabManager.nmmCombat, "lightningSword");
    	poisonSword = new PoisonSword(elemental, "poisonSword", NMMTabManager.nmmCombat, "poisonSword");
    	skySword = new SkySword(elemental, "skySword", NMMTabManager.nmmCombat, "skySword");
    	fireSword = new FireSword(elemental, "fireSword", NMMTabManager.nmmCombat, "fireSword");
    	darknessDust = new BaseItem("darknessDust", NMMTabManager.nmmRaw, "darknessDust");
    	darknessSword = new DarknessSword(elemental, "darknessSword", NMMTabManager.nmmCombat, "darknessSword");
    	fireBow = new FireBow("fireBow", NMMTabManager.nmmCombat, "fireBow");
    	fireArrow = new BaseItem("fireArrow", NMMTabManager.nmmCombat, "fireArrow");
    	superItem = new SuperItem("superItem", NMMTabManager.nmmTools, "superItem").setMaxStackSize(1);
    	highLighter = new HighLighter("highLighter", NMMTabManager.nmmTools, "highLighter");
	}

	@Override public void register() {
		regItem(lightningSword);
    	regItem(poisonSword);
    	regItem(skySword);
    	regItem(fireSword);
    	regItem(darknessDust);
    	regItem(darknessSword);
    	regItem(fireBow);
    	regItem(fireArrow);
    	regItem(superItem);
    	regItem(highLighter);
	}
}
