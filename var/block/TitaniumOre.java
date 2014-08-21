package var.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import var.creativetabs.CreativeTabsManager;
import var.item.ItemManager;
import var.item.titanium.TitaniumManager;
import var.main.MainRegistry;

public class TitaniumOre extends Block{

	protected TitaniumOre(Material p_i45394_1_) {
		super(p_i45394_1_);
		
		this.setBlockName("TitaniumOre");
		this.setCreativeTab(CreativeTabsManager.nmmBlocks);
		this.setBlockTextureName("titanium:titaniumOre");
		this.setResistance(10.0F);
		this.setHardness(4.5F);
		
	}
    public int quantityDropped(Random rand)
    {
        return rand.nextInt(3) + 1;
    }

    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        return TitaniumManager.unsmeltedTitanium;
    }
}
