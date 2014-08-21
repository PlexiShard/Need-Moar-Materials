package var.creativetabs;

import net.minecraft.creativetab.CreativeTabs;

public class CreativeTabsManager {

	public static void mainRegistry() {
		initializeTabs();
	}
	
	public static CreativeTabs nmmRaw;
	public static CreativeTabs nmmTools;
	public static CreativeTabs nmmCombat;
	public static CreativeTabs nmmBlocks;
	public static CreativeTabs nmmMisc;
	
	public static void initializeTabs() {
		nmmRaw = new NMMRaw("NMMRaw");
		nmmTools = new NMMTools("NMMTools");
		nmmCombat = new NMMCombat("NMMCombat");
		nmmBlocks = new NMMBlocks("NMMBlocks");
		nmmMisc = new NMMMisc("NMMMisc");
	}
}
