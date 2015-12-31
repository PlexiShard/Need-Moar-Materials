package var.creative;

import net.minecraft.creativetab.CreativeTabs;
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
		nmmTools = new NMMTools("nmmTools");
		nmmCombat = new NMMCombat("nmmCombat");
		nmmBlocks = new NMMBlocks("nmmBlocks");
	}
	
	
}
