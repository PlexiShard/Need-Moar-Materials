package var.item.titanium;

import var.creativetabs.CreativeTabsManager;
import var.lib.StringLibrary;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TitaniumIngot extends Item {
	public TitaniumIngot() {	
		this.setUnlocalizedName("titaniumIngot");
		this.setCreativeTab(CreativeTabsManager.nmmRaw);
		this.setMaxStackSize(64);
		this.setTextureName("titanium:titaniumIngot");
	}
}
