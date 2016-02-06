package var.item.elemental;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import var.base.BaseCreativeTab;
import var.base.BaseItem;
import var.block.BlockManager;

public class HighLighter extends BaseItem {
	public HighLighter()
    {
        this.maxStackSize = 1;
        this.setMaxDamage(64);
    }

    public HighLighter(String uname, BaseCreativeTab tab, String texture) {
		this.maxStackSize = 1;
		this.setMaxStackSize(maxStackSize);
		this.setMaxDamage(64);
		this.setupThis(uname, tab, texture);
	}

	public boolean onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos, EnumFacing side, float hitX, float hitY, float hitZ)
    {
        pos = pos.offset(side);

        if (!playerIn.canPlayerEdit(pos, side, stack))
        {
            return false;
        }
        else
        {
            if (worldIn.isAirBlock(pos))
            {
                worldIn.playSoundEffect((double)pos.getX() + 0.5D, (double)pos.getY() + 0.5D, (double)pos.getZ() + 0.5D, "fire.ignite", 1.0F, itemRand.nextFloat() * 0.4F + 0.8F);
                worldIn.setBlockState(pos, BlockManager.highFire.getDefaultState());
            }

            stack.damageItem(1, playerIn);
            return true;
        }
    }
}
