package com.var.item;

import com.var.creativetabs.CreativeTabsManager;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class UnsmeltedTitanium extends Item {

	public UnsmeltedTitanium() {
		this.setUnlocalizedName("unsmeltedtitanium");
		this.setCreativeTab(CreativeTabsManager.xtramaterialsTab);
		this.setMaxStackSize(64);
		this.setTextureName("cm:unsmeltedTinanium");
	}

}
