package var.creativetabs;

import var.block.BlockManager;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class NMMBlocks extends CreativeTabs {

	public NMMBlocks(String lable) {
		super(lable);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Item getTabIconItem() {
		// TODO Auto-generated method stub
		return Item.getItemFromBlock(BlockManager.steelOre);
	}

}
