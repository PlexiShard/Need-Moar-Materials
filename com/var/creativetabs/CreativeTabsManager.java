package com.var.creativetabs;

import net.minecraft.creativetab.CreativeTabs;

public class CreativeTabsManager {

	public static void mainRegistry() {
		initializeTabs();
	}
	
	public static CreativeTabs xtramaterialsTab;
	
	public static void initializeTabs() {
		xtramaterialsTab = new XtramaterialsTab("Xtramatertials");
	}
}
