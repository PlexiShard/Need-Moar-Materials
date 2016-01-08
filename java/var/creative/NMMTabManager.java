package var.creative;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import var.base.BaseCreativeTab;
import var.block.BlockManager;
import var.item.TitaniumManager;

public class NMMTabManager {
	
	public static BaseCreativeTab nmmRaw;
	public static BaseCreativeTab nmmTools;
	public static BaseCreativeTab nmmCombat;
	public static BaseCreativeTab nmmBlocks;
	
	public NMMTabManager() {
		registerTabs();
	}
	
	public void registerTabs() {
		/*nmmRaw = new NMMRaw("nmmRaw");
		Item Raw = nmmRaw.getTabIconItem();
		nmmTools = new NMMTools("nmmTools");
		Item Tool = nmmTools.getTabIconItem();
		nmmCombat = new NMMCombat("nmmCombat");
		Item Combat = nmmCombat.getTabIconItem();
		nmmBlocks = new NMMBlocks("nmmBlocks");
		Item Block = nmmBlocks.getTabIconItem();*/
		
		nmmRaw = new BaseCreativeTab("nmmRaw");
		nmmTools = new BaseCreativeTab("nmmTools");
		nmmCombat = new BaseCreativeTab("nmmCombat");
		nmmBlocks = new BaseCreativeTab("nmmBlocks");
	}
	
	public static void registerIcons()
	{	nmmRaw.setTabIcon(TitaniumManager.unsmeltedTitanium);
		nmmTools.setTabIcon(TitaniumManager.titaniumPickaxe);
		nmmCombat.setTabIcon(TitaniumManager.titaniumSword);
		nmmBlocks.setTabIcon(Item.getItemFromBlock(BlockManager.titaniumOre));
	}
}
