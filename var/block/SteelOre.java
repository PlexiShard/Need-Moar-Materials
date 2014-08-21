package var.block;

import var.creativetabs.CreativeTabsManager;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class SteelOre extends Block {

	protected SteelOre(Material p_i45394_1_) {
		super(p_i45394_1_);
		this.setBlockName("SteelOre");
		this.setCreativeTab(CreativeTabsManager.nmmBlocks);
		this.setBlockTextureName("steel:steelOre");
		this.setResistance(10.0F);
		this.setHardness(4.5F);
	}

}
