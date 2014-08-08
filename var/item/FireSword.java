package var.item;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class FireSword extends ItemSword {

	public FireSword(ToolMaterial p_i45356_1_) {
		super(p_i45356_1_);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean hitEntity(ItemStack sword, EntityLivingBase target, EntityLivingBase owner) {
		target.setFire(5);
		return true;
	}
}
