package var.base;

import java.util.Set;

import com.google.common.collect.Sets;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class BaseAxe extends BaseTool{
	/**A set of {@link Block} which BaseAxe is effective on, in addition to {@link #getStrVsBlock} function*/
	private static final Set EFFECTIVE_ON = Sets.newHashSet(new Block[] {Blocks.planks, Blocks.bookshelf, Blocks.log, Blocks.log2, Blocks.chest, Blocks.pumpkin, Blocks.lit_pumpkin, Blocks.melon_block, Blocks.ladder});
    //private static final String __OBFID = "CL_00001770";

    /**
     * Initializes Base axe
     * 
     * @param material
     * {@link ToolMaterial} for BaseAxe
     * */
    public BaseAxe(Item.ToolMaterial material)
    {
    {	super(3.0F, material, EFFECTIVE_ON);
    }

    /**
     * Returns how effective BaseAxe is against block
     * 
     * @param stack
     * The {@link ItemStack} of BaseAxe
     * 
     * @param block
     * The {@link Block} which BaseAxe is used against
     * 
     * @return A float referencing how quickly the {@link Item} from stack can destroy the {@link Block} inputted*/
    public float getStrVsBlock(ItemStack stack, Block block)
    {
        return block.getMaterial() != Material.wood && block.getMaterial() != Material.plants && block.getMaterial() != Material.vine ? super.getStrVsBlock(stack, block) : this.efficiencyOnProperMaterial;
    }
}
