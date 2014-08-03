package var.block;

import var.creativetabs.CreativeTabsManager;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class PlatinumOre extends Block {

	public PlatinumOre(Material p_i45394_1_) {
		super(p_i45394_1_);
		this.setBlockName("PlatinumOre");
		this.setCreativeTab(CreativeTabsManager.xtramaterialsTab);
		this.setBlockTextureName("cm:platinumOre");
		this.setResistance(10.0F);
		this.setHardness(4.5F);
	}

}
