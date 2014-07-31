package var.item;

import var.creativetabs.CreativeTabsManager;
import net.minecraft.item.Item;

public class PlatinumIngot extends Item {
	public PlatinumIngot() {
		this.setUnlocalizedName("platinumIngot");
		this.setCreativeTab(CreativeTabsManager.xtramaterialsTab);
		this.setMaxStackSize(64);
		this.setTextureName("cm:platinumIngot");
	}
}
