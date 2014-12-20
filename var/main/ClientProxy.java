package var.main;

import var.entity.Ogre;
import var.entity.projectiles.EntityFireArrow;
import var.model.ModelOgre;
import var.render.RenderFireArrow;
import var.render.RenderOgre;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends var.main.ServerProxy{
	public void registerRenderThings() {
		RenderingRegistry.registerEntityRenderingHandler(Ogre.class, new RenderOgre(new ModelOgre(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityFireArrow.class, new RenderFireArrow());
	}
	
	public int addArmor (String armor) {
		return RenderingRegistry.addNewArmourRendererPrefix(armor);
	}
}
