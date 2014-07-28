package var.item;

import var.creativetabs.CreativeTabsManager;
import var.lib.StringLibrary;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TitaniumIngot extends Item {
	public TitaniumIngot() {	
		this.setUnlocalizedName("titaniumIngot");
		this.setCreativeTab(CreativeTabsManager.xtramaterialsTab);
		this.setMaxStackSize(64);
		this.setTextureName("cm:titaniumIngot");
	}
}
