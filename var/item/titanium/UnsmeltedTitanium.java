package var.item.titanium;

import var.creativetabs.CreativeTabsManager;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class UnsmeltedTitanium extends Item {

	public UnsmeltedTitanium() {
		this.setUnlocalizedName("unsmeltedtitanium");
		this.setCreativeTab(CreativeTabsManager.nmmRaw);
		this.setMaxStackSize(64);
		this.setTextureName("titanium:unsmeltedTinanium");
	}

}
