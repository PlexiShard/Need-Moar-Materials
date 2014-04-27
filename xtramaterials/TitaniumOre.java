package xtramaterials;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class TitaniumOre extends Block {

	public TitaniumOre(int par1, Material par2Material) {
		super(par1, par2Material);
		// TODO Auto-generated constructor stub
	}
	public int idDropped(int par4, Random par5Random, int par6)
    {
        return Xtramaterials.TitaniumUnsmelted.itemID;
    }

}
