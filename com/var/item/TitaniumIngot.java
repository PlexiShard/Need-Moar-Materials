package com.var.item;

import com.var.creativetabs.CreativeTabsManager;
import com.var.lib.StringLibrary;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TitaniumIngot extends Item {
	public TitaniumIngot() {	
		this.setUnlocalizedName("titaniumIngot");
		this.setCreativeTab(CreativeTabsManager.xtramaterialsTab);
		this.setMaxStackSize(64);
		this.setTextureName("cm:titaniumIngot");
	}
}
