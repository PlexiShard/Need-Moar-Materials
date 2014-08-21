package var.creativetabs;

import var.item.misc.MiscManager;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class NMMMisc extends CreativeTabs {

	public NMMMisc(String lable) {
		super(lable);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Item getTabIconItem() {
		// TODO Auto-generated method stub
		return MiscManager.darknessDust;
	}

}
