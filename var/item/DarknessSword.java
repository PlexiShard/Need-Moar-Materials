package var.item;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

public class DarknessSword extends ItemSword {

	public DarknessSword(ToolMaterial p_i45356_1_) {
		super(p_i45356_1_);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean hitEntity(ItemStack sword, EntityLivingBase target, EntityLivingBase owner) {
		target.addPotionEffect(new PotionEffect(Potion.confusion.id, 100, 10));
		target.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 100, 10));
		return true;
	}

}
