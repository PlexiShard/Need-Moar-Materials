package var.item.elemental;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import var.base.BaseSword;

public class PoisonSword extends BaseSword {

	public PoisonSword(ToolMaterial p_i45356_1_) {
		super(p_i45356_1_);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean hitEntity(ItemStack sword, EntityLivingBase target, EntityLivingBase owner) {
		target.addPotionEffect(new PotionEffect(Potion.wither.id, 100, 10));
		return true;
	}
	
}
