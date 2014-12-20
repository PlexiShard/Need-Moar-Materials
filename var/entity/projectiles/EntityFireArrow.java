package var.entity.projectiles;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityFireArrow extends EntityThrowable {

	public EntityFireArrow(World p_i1753_1_) {
		super(p_i1753_1_);
		// TODO Auto-generated constructor stub
	}
	
	public EntityFireArrow(World par1World, EntityLivingBase par2EntityLivingBase)
    {
        super(par1World, par2EntityLivingBase);
    }
    
	public EntityFireArrow(World par1World, double par2, double par4, double par6)
    {
        super(par1World, par2, par4, par6);
    }
	
	@Override
	protected void onImpact(MovingObjectPosition par1) {
		this.worldObj.createExplosion(this, this.posX, this.posY, this.posZ, 2.0F, true); 
		this.setDead();
	}
}
