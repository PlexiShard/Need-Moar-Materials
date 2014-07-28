package var.block;

import var.creativetabs.CreativeTabsManager;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class TitaniumBlock extends Block {

	protected TitaniumBlock(Material p_i45394_1_) {
		super(p_i45394_1_);
		this.setBlockName("TitaniumBlock");
		this.setCreativeTab(CreativeTabsManager.xtramaterialsTab);
		this.setBlockTextureName("cm:titaniumBlock");
		this.setResistance(100.0F);
		this.setHardness(9.0F);
	}

}
