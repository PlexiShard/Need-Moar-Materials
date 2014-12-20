package var.item.elemental;

import cpw.mods.fml.common.registry.GameRegistry;
import var.creativetabs.CreativeTabsManager;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ElementalManager {

	public static void mainRegistry() {
		initializeItem();
		registerItem();
	}
	
	public static ToolMaterial elemental = EnumHelper.addToolMaterial("Elemental", 2, 100, 2.0F, 4.0F, 14);
	
	public static Item lightningSword;
	public static Item poisonSword;
	public static Item skySword;
	public static Item fireSword;
	public static Item darknessSword;
	public static Item fireBow;
	public static Item fireArrow;
	
	public static void initializeItem() {
		lightningSword = new LightningSword(elemental).setUnlocalizedName("lightningRod").setCreativeTab(CreativeTabsManager.nmmCombat).setTextureName("elemental:lightningSword").setMaxDamage(100);
    	poisonSword = new PoisonSword(elemental).setUnlocalizedName("poisonSword").setCreativeTab(CreativeTabsManager.nmmCombat).setTextureName("elemental:poisonSword").setMaxDamage(100);
    	skySword = new SkySword(elemental).setUnlocalizedName("skySword").setCreativeTab(CreativeTabsManager.nmmCombat).setTextureName("elemental:skySword").setMaxDamage(100);
    	fireSword = new FireSword(elemental).setUnlocalizedName("fireSword").setCreativeTab(CreativeTabsManager.nmmCombat).setTextureName("elemental:fireSword").setMaxDamage(100);
    	darknessSword = new DarknessSword(elemental).setUnlocalizedName("darknessSword").setCreativeTab(CreativeTabsManager.nmmCombat).setTextureName("elemental:darknessSword").setMaxDamage(100);
    	fireBow = new FireBow().setUnlocalizedName("fireBow");
    	fireArrow = new FireArrow().setUnlocalizedName("fireArrow").setCreativeTab(CreativeTabsManager.nmmCombat).setTextureName("elemental:fireArrow");
	}

	public static void registerItem() {
		GameRegistry.registerItem(lightningSword, lightningSword.getUnlocalizedName());
    	GameRegistry.registerItem(poisonSword, poisonSword.getUnlocalizedName());
    	GameRegistry.registerItem(skySword, skySword.getUnlocalizedName());
    	GameRegistry.registerItem(fireSword, fireSword.getUnlocalizedName());
    	GameRegistry.registerItem(darknessSword, darknessSword.getUnlocalizedName());
    	GameRegistry.registerItem(fireBow, fireBow.getUnlocalizedName());
    	GameRegistry.registerItem(fireArrow, fireArrow.getUnlocalizedName());
	}
	
}
