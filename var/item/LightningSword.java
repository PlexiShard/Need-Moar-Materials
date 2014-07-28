package var.item;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class LightningSword extends ItemSword {
	
	public LightningSword(ToolMaterial p_i45356_1_) {
		super(p_i45356_1_);
		this.setFull3D();
		this.setMaxStackSize(1);
	}

	@Override
	public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase owner) {
	    Entity bolt = new EntityLightningBolt(owner.worldObj, target.posX, target.posY, target.posZ);
	    owner.worldObj.addWeatherEffect(bolt);
	    return true;
	}
}
