package var.base;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public interface IItem {

	public String name();
	public String uname();
	public String texture();
	public CreativeTabs tab();
	
	public String getName();
	public String getUName();
	public String getTexture();
	public CreativeTabs getTab();
}
