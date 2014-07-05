package com.var.entity;

import java.util.Random;

import com.var.item.ItemManager;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class Ogre extends EntityMob{

	public Ogre(World par1World) {
		super(par1World);
		this.dropItem(ItemManager.unsmeltedTitanium, 3);
	}
	
	@Override
	public void dropFewItems(boolean recentlyHit, int lootLevel) {
		int quantity = this.rand.nextInt(5) + 3;
		
		for (int i = 0; i < quantity; i++) {
			Item drop = Item.getItemFromBlock(ItemManager.titaniumOre);
			this.dropItem(drop, 3);
		}
	}
	
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(40.0D);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(1000.0D);
		this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(3);
	}
}
