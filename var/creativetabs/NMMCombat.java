package var.creativetabs;

import var.item.elemental.ElementalManager;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class NMMCombat extends CreativeTabs {

	public NMMCombat(String lable) {
		super(lable);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Item getTabIconItem() {
		// TODO Auto-generated method stub
		return ElementalManager.lightningSword;
	}

}
