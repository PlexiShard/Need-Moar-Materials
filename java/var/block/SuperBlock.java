package var.block;

import java.util.Random;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import var.base.BaseBlock;
import var.item.ElementalManager;


public class SuperBlock extends BaseBlock {

	public SuperBlock(Material materialIn) {
		super(materialIn);
		// TODO Auto-generated constructor stub
	}
	
	@Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return ElementalManager.superItem;
    }
	
}
