package var.block;

import var.creativetabs.CreativeTabsManager;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class CopperOre extends Block {

	public CopperOre(Material p_i45398_1_) {
		super(p_i45398_1_);
		this.setBlockName("CopperOre");
		this.setCreativeTab(CreativeTabsManager.nmmBlocks);
		this.setBlockTextureName("copper:copperOre");
		this.setResistance(10.0F);
		this.setHardness(4.5F);
	}

}