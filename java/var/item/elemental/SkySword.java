package var.item.elemental;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import var.base.BaseCreativeTab;
import var.base.BaseSword;

public class SkySword extends BaseSword {
	
	public SkySword(ToolMaterial material, String uname, CreativeTabs tab, String texture) {
		super(material, uname, tab, texture);
	}

	@Override
	public boolean hitEntity(ItemStack sword, EntityLivingBase target, EntityLivingBase owner) {
		target.motionY += 0.75F;
		return true;
	}
	
}
