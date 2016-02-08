package var.base;

import net.minecraft.block.Block;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BaseHoe extends BaseItem{
	protected Item.ToolMaterial theToolMaterial;
    private static final String __OBFID = "CL_00000039";

    /**
     * Initializes BaseHoe
     * 
     * @param material
     * {@link ToolMaterial} for BaseHoe
     * */
    public BaseHoe(Item.ToolMaterial material)
    {	this.theToolMaterial = material;
        this.maxStackSize = 1;
        this.setMaxDamage(material.getMaxUses());
        this.setCreativeTab(CreativeTabs.tabTools);
    }
    
    public BaseHoe(Item.ToolMaterial material, String newuname, CreativeTabs newtab, String texture)
    {	this.theToolMaterial = material;
    	this.maxStackSize = 1;
    	this.setMaxDamage(material.getMaxUses());
    	this.setupThis(newuname, newtab, texture);
    }

    /**
     * Called when the BaseHoe is right-clicked on a {@link Block}. <br><br>
     * Calls {@link #useHoe} if the {@link Block} is among a list of blocks (Currently consists only of farmland, dirt, and grass)
     * @param stack The {@link ItemStack} of BaseHoe
     * @param playerIn The {@link EntityPlayer} using stack
     * @param worldIn The {@link World} that stack exists in
     * @param pos The {@link BlockPos} of the {@link Block} the {@link Item} is being used on
     * @param side The {@link EnumFacing} of the {@link Block} which pos refers to.
     * @param hitX Unknown usage. Required for the function {@link Item#onItemUse} in {@link Item}
     * @param hitY Unknown usage. Required for the function {@link Item#onItemUse} in {@link Item}
     * @param hitZ Unknown usage. Required for the function {@link Item#onItemUse} in {@link Item}
     * 
     * @return A boolean, true if it can be turned into farmland, false if it can't.
     * */
    public boolean onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos, EnumFacing side, float hitX, float hitY, float hitZ)
    {	if (!playerIn.canPlayerEdit(pos.offset(side), side, stack))
        {	return false;	}
        else
        {	int hook = net.minecraftforge.event.ForgeEventFactory.onHoeUse(stack, playerIn, worldIn, pos);
            if (hook != 0) return hook > 0;

            IBlockState iblockstate = worldIn.getBlockState(pos);
            Block block = iblockstate.getBlock();

            if (side != EnumFacing.DOWN && worldIn.isAirBlock(pos.up()))
            {	if (block == Blocks.grass)
                {	return this.useHoe(stack, playerIn, worldIn, pos, Blocks.farmland.getDefaultState());}

                if (block == Blocks.dirt)
                {	switch (BaseHoe.SwitchDirtType.TYPE_LOOKUP[((BlockDirt.DirtType)iblockstate.getValue(BlockDirt.VARIANT)).ordinal()])
                    {	case 1:
                            return this.useHoe(stack, playerIn, worldIn, pos, Blocks.farmland.getDefaultState());
                        case 2:
                            return this.useHoe(stack, playerIn, worldIn, pos, Blocks.dirt.getDefaultState().withProperty(BlockDirt.VARIANT, BlockDirt.DirtType.DIRT));
                    
                
            }	}	}

            return false;
    }	}
    
    /**Called from {@link #onItemUse} of {@link BaseHoe}. Does not run checks, it just sets a {@link IBlockState Block State} and {@link World#playSoundEffect plays a sound}.
     * @param stack The {@link ItemStack} of the {@link net.minecraft.item.ItemHoe Hoe}
     * @param player The {@link EntityPlayer Player} using the {@link net.minecraft.item.ItemHoe Hoe}
     * @param worldIn The {@link World} being modified
     * @param target The {@link BlockPos Position} of the {@link Block} being targeted
     * @param newState The {@link IBlockState BlockState} that the target will be set to
     * @return Will always return true. Meant to be used in other functions, which check if the {@link Block} can be Hoed*/
    protected boolean useHoe(ItemStack stack, EntityPlayer player, World worldIn, BlockPos target, IBlockState newState)
    {	worldIn.playSoundEffect((double)((float)target.getX() + 0.5F), (double)((float)target.getY() + 0.5F), (double)((float)target.getZ() + 0.5F), newState.getBlock().stepSound.getStepSound(), (newState.getBlock().stepSound.getVolume() + 1.0F) / 2.0F, newState.getBlock().stepSound.getFrequency() * 0.8F);

        if (worldIn.isRemote)
        {	return true;	}
        else
        {	worldIn.setBlockState(target, newState);
            stack.damageItem(1, player);
            return true; 
    }	}

    @SideOnly(Side.CLIENT)
    public boolean isFull3D()
    {	return true;	}

    /**@return The name of the {@link ToolMaterial Tool Material} which the {@link net.minecraft.item.ItemHoe Hoe} uses*/
    public String getMaterialName()
    {	return this.theToolMaterial.toString();}

    /***/
    static final class SwitchDirtType
    {	static final int[] TYPE_LOOKUP = new int[BlockDirt.DirtType.values().length];
        private static final String __OBFID = "CL_00002179";
        static
        {	try
            {TYPE_LOOKUP[BlockDirt.DirtType.DIRT.ordinal()] = 1;}
            catch (NoSuchFieldError var2){;}
        	try
            {TYPE_LOOKUP[BlockDirt.DirtType.COARSE_DIRT.ordinal()] = 2;}
            catch (NoSuchFieldError var1)
            {;}
}	}	}