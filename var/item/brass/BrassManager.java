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
	
	public static Item unsmeltedBrass;
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
	
	public static Block brassBlock;
	
	public static void initializeItem() {
		//brass
    	//unsmeltedBrass = new UnsmeltedBrass().setUnlocalizedName("unsmeltedBrass").setCreativeTab(CreativeTabsManager.nmmRaw);
		brassSword = new BrassSword(brass).setUnlocalizedName("brassSword").setCreativeTab(CreativeTabsManager.nmmCombat).setTextureName("brass:brassSword");
    	brassIngot = new BrassIngot().setUnlocalizedName("brassIngot").setCreativeTab(CreativeTabsManager.nmmRaw).setTextureName("brass:brassIngot");
    	/*brassPickaxe = new BrassPickaxe(brass);
    	brassShovel = new BrassShovel(brass);
    	brassHoe = new BrassHoe(brass);
    	brassAxe = new BrassAxe(brass);
    	brassHelmet = new BrassHelmet(brassArmor, MainRegistry.proxy.addArmor("BrassHelmet"), 0);
    	brassChestplate = new BrassChestplate(brassArmor, MainRegistry.proxy.addArmor("BrassChestplate"), 1);
    	brassLeggings = new BrassLeggings(brassArmor, MainRegistry.proxy.addArmor("brassLeggings"), 2);
    	brassBoots = new BrassBoots(brassArmor, MainRegistry.proxy.addArmor("brassBoots"), 3);*/
	}
	public static void registerItem() {
		GameRegistry.registerItem(brassSword, brassSword.getUnlocalizedName());
    	GameRegistry.registerItem(brassIngot, brassIngot.getUnlocalizedName());
	}
}
