package var.creative;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import var.item.ElementalManager;

public class NMMCombat extends CreativeTabs {

	public NMMCombat(String label) {
		super(label);
	}

	@SideOnly(Side.CLIENT)
	public Item getTabIconItem() {
		return ElementalManager.lightningSword;
	}

}
