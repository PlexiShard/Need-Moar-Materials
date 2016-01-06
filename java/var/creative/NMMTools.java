package var.creative;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import var.item.TitaniumManager;

public class NMMTools extends CreativeTabs {

	public NMMTools(String label) {
		super(label);
	}

	@SideOnly(Side.CLIENT)
	public Item getTabIconItem() {
		return TitaniumManager.titaniumPickaxe;
	}

	@SideOnly(Side.CLIENT)
	public ItemStack getIconItemStack() {
		return new ItemStack(TitaniumManager.titaniumPickaxe, 1);
	}
}
