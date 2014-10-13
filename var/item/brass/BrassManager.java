package var.item.brass;

import cpw.mods.fml.common.registry.GameRegistry;
import var.creativetabs.CreativeTabsManager;
import var.main.MainRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class BrassManager {

	public static void mainRegistry() {
		initializeItem();
        registerItem();
	}
	public static ToolMaterial brass = EnumHelper.addToolMaterial("Brass", 2, 300, 7.5F, 8.5F, 14); 
	public static ArmorMaterial brassArmor = EnumHelper.addArmorMaterial("Brass", 10, new int[]{3, 7, 5, 3}, 10);
	
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
	
	public static void initializeItem() {
		//brass
		brassSword = new BrassSword(brass).setUnlocalizedName("brassSword").setCreativeTab(CreativeTabsManager.nmmCombat).setTextureName("brass:brassSword");
    	brassIngot = new BrassIngot().setUnlocalizedName("brassIngot").setCreativeTab(CreativeTabsManager.nmmRaw).setTextureName("brass:brassIngot");
    	brassPickaxe = new BrassPickaxe(brass).setUnlocalizedName("brassPickaxe").setCreativeTab(CreativeTabsManager.nmmTools).setTextureName("brass:brassPickaxe");
    	brassShovel = new BrassShovel(brass).setUnlocalizedName("brassShovel").setCreativeTab(CreativeTabsManager.nmmTools).setTextureName("brass:brassShovel");
    	brassHoe = new BrassHoe(brass).setUnlocalizedName("brassHoe").setCreativeTab(CreativeTabsManager.nmmTools).setTextureName("brass:brassHoe");
    	brassAxe = new BrassAxe(brass).setUnlocalizedName("brassAxe").setCreativeTab(CreativeTabsManager.nmmTools).setTextureName("brass:brassAxe");
    	brassHelmet = new BrassHelmet(brassArmor, MainRegistry.proxy.addArmor("BrassHelmet"), 0).setUnlocalizedName("brassHelmet").setCreativeTab(CreativeTabsManager.nmmCombat).setTextureName("brass:brassHelmet");
    	brassChestplate = new BrassChestplate(brassArmor, MainRegistry.proxy.addArmor("BrassChestplate"), 1).setUnlocalizedName("brassChestplate").setCreativeTab(CreativeTabsManager.nmmCombat).setTextureName("brass:brassChestplate");
    	brassLeggings = new BrassLeggings(brassArmor, MainRegistry.proxy.addArmor("brassLeggings"), 2).setUnlocalizedName("brassLeggings").setCreativeTab(CreativeTabsManager.nmmCombat).setTextureName("brass:brassLeggings");
    	brassBoots = new BrassBoots(brassArmor, MainRegistry.proxy.addArmor("brassBoots"), 3).setUnlocalizedName("brassBoots").setCreativeTab(CreativeTabsManager.nmmCombat).setTextureName("brass:brassBoots");
	}
	public static void registerItem() {
		GameRegistry.registerItem(brassSword, brassSword.getUnlocalizedName());
    	GameRegistry.registerItem(brassIngot, brassIngot.getUnlocalizedName());
    	GameRegistry.registerItem(brassPickaxe, brassPickaxe.getUnlocalizedName());
    	GameRegistry.registerItem(brassAxe, brassAxe.getUnlocalizedName());
    	GameRegistry.registerItem(brassHoe, brassHoe.getUnlocalizedName());
    	GameRegistry.registerItem(brassShovel, brassShovel.getUnlocalizedName());
    	GameRegistry.registerItem(brassHelmet, brassHelmet.getUnlocalizedName());
    	GameRegistry.registerItem(brassChestplate, brassChestplate.getUnlocalizedName());
    	GameRegistry.registerItem(brassLeggings, brassLeggings.getUnlocalizedName());
    	GameRegistry.registerItem(brassBoots, brassBoots.getUnlocalizedName());
	}
}
