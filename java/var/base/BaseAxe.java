package var.base;

import java.util.Set;

import com.google.common.collect.Sets;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class BaseAxe extends BaseTool{
	/**A set of blocks which BaseAxe is effective on, in addition to getStrVsBlock function*/
	private static final Set EFFECTIVE_ON = Sets.newHashSet(new Block[] {Blocks.planks, Blocks.bookshelf, Blocks.log, Blocks.log2, Blocks.chest, Blocks.pumpkin, Blocks.lit_pumpkin, Blocks.melon_block, Blocks.ladder});
    //private static final String __OBFID = "CL_00001770";

    /**
     * Initializes Base axe
     * 
     * @param material
     * Tool Material for BaseAxe
     * */
    public BaseAxe(Item.ToolMaterial material)
    {
        super(3.0F, material, EFFECTIVE_ON);
    }

    /**
     * Returns how effective BaseAxe is against block
     * 
     * @param stack
     * The item stack of BaseAxe
     * 
     * @param block
     * The block which BaseAxe is used against*/
    public float getStrVsBlock(ItemStack stack, Block block)
    {
        return block.getMaterial() != Material.wood && block.getMaterial() != Material.plants && block.getMaterial() != Material.vine ? super.getStrVsBlock(stack, block) : this.efficiencyOnProperMaterial;
    }
}
