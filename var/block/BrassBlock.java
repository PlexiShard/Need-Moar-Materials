package var.block;

import var.creativetabs.CreativeTabsManager;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BrassBlock extends Block {

	public BrassBlock(Material p_i45394_1_) {
		super(p_i45394_1_);
		this.setBlockName("BrassBlock");
		this.setCreativeTab(CreativeTabsManager.nmmBlocks);
		this.setBlockTextureName("brass:brassBlock");
		this.setResistance(90.0F);
		this.setHardness(9.0F);
	}

}
