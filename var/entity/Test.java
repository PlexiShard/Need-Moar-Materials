package var.entity;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.world.World;

public class Test extends EntityMob{

	public Test(World par1World) {
		super(par1World);
		// TODO Auto-generated constructor stub
	}
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(40.0D);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(1000.0D);
		this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(3);
	}
}
