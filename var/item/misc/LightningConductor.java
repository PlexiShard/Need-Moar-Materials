package var.item.misc;

import var.creativetabs.CreativeTabsManager;

import net.minecraft.item.Item;

public class LightningConductor extends Item {

	public LightningConductor() {
		this.setUnlocalizedName("lightningConductor");
		this.setMaxStackSize(1);
		this.setTextureName("elemental:lightningConductor");
		this.setCreativeTab(CreativeTabsManager.nmmMisc);
	}
}
