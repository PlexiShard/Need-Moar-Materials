package var.creative;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class NMMTabManager {
	public static CreativeTabs nmmRaw;
	public static CreativeTabs nmmTools;
	public static CreativeTabs nmmCombat;
	public static CreativeTabs nmmBlocks;
	
	public NMMTabManager() {
		registerTabs();
	}
	
	public void registerTabs() {
		nmmRaw = new NMMRaw("nmmRaw");
		Item Raw = nmmRaw.getTabIconItem();
		nmmTools = new NMMTools("nmmTools");
		Item Tool = nmmTools.getTabIconItem();
		nmmCombat = new NMMCombat("nmmCombat");
		Item Combat = nmmCombat.getTabIconItem();
		nmmBlocks = new NMMBlocks("nmmBlocks");
		Item Block = nmmBlocks.getTabIconItem();
	}
	
	
}
