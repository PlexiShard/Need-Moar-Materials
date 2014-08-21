package var.creativetabs;

import var.item.platinum.PlatinumManager;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class NMMRaw extends CreativeTabs {

	public NMMRaw(String lable) {
		super(lable);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Item getTabIconItem() {
		// TODO Auto-generated method stub
		return PlatinumManager.platinumIngot;
	}

}
