package com.var.main;

import com.var.entity.Ogre;
import com.var.model.ModelOgre;
import com.var.render.RenderOgre;

import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends com.var.main.ServerProxy{
	public void registerRenderThings() {
		RenderingRegistry.registerEntityRenderingHandler(Ogre.class, new RenderOgre(new ModelOgre(), 0));
	}
	
	public int addArmor (String armor) {
		return RenderingRegistry.addNewArmourRendererPrefix(armor);
	}
}
