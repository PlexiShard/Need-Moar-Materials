package var.block;

import var.creativetabs.CreativeTabsManager;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class CopperBlock extends Block {

	public CopperBlock(Material p_i45399_1_) {
		super(p_i45399_1_);
		this.setBlockName("CopperBlock");
		this.setCreativeTab(CreativeTabsManager.nmmBlocks);
		this.setBlockTextureName("copper:copperBlock");
		this.setResistance(90.0F);
		this.setHardness(9.0F);
	}

}
