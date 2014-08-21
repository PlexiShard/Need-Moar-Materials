package var.block;

import var.creativetabs.CreativeTabsManager;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class SteelBlock extends Block {

	protected SteelBlock(Material p_i45394_1_) {
		super(p_i45394_1_);
		this.setBlockName("SteelBlock");
		this.setCreativeTab(CreativeTabsManager.nmmBlocks);
		this.setBlockTextureName("steel:steelBlock");
		this.setResistance(100.0F);
	}

}
