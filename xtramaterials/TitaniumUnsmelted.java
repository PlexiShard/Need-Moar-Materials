package xtramaterials;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class TitaniumUnsmelted extends Item {

	public void registerIcons(IconRegister par1IconRegister)
	{
		this.itemIcon = par1IconRegister.registerIcon(Xtramaterials.modid + ":"+ (this.getUnlocalizedName().substring(5)));
	}
	public TitaniumUnsmelted(int par1) {
		super(par1);
		// TODO Auto-generated constructor stub
	}
}
