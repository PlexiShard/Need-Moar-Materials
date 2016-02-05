package var.item.elemental;

import var.base.BaseCreativeTab;
import var.base.BaseSword;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class FireSword extends BaseSword {

	public FireSword(ToolMaterial material, String uname, CreativeTabs tab, String texture) {
		super(material, uname, tab, texture);
	}

	@Override
	public boolean hitEntity(ItemStack sword, EntityLivingBase target, EntityLivingBase owner) {
		target.setFire(5);
		return true;
	}
}
