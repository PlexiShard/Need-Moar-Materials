package com.var.item;

import com.var.creativetabs.CreativeTabsManager;

import net.minecraft.item.Item;

public class LightningConductor extends Item {

	public LightningConductor() {
		this.setUnlocalizedName("lightningConductor");
		this.setMaxStackSize(1);
		this.setTextureName("cm:lightningConductor");
		this.setCreativeTab(CreativeTabsManager.xtramaterialsTab);
	}
}
