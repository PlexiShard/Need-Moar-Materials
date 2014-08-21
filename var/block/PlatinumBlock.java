package var.block;

import var.creativetabs.CreativeTabsManager;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class PlatinumBlock extends Block {

	public PlatinumBlock(Material p_i45394_1_) {
		super(p_i45394_1_);
		this.setBlockName("PlatinumBlock");
		this.setCreativeTab(CreativeTabsManager.nmmBlocks);
		this.setBlockTextureName("platinum:platinumBlock");
		this.setResistance(100.0F);
		this.setHardness(9.0F);
	}

}
