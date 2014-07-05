package com.var.creativetabs;

import com.var.item.ItemManager;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class XtramaterialsTab extends CreativeTabs {

	public XtramaterialsTab(String lable) {
		super(lable);
		// TODO Auto-generated constructor stub
	}

	//@Override
	public Item getTabIconItem() {
		// TODO Auto-generated method stub
		return ItemManager.titaniumIngot;
	}

}
