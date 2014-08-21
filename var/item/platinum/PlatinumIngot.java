package var.item.platinum;

import var.creativetabs.CreativeTabsManager;
import net.minecraft.item.Item;

public class PlatinumIngot extends Item {
	public PlatinumIngot() {
		this.setUnlocalizedName("platinumIngot");
		this.setCreativeTab(CreativeTabsManager.nmmRaw);
		this.setMaxStackSize(64);
		this.setTextureName("platinum:platinumIngot");
	}
}
