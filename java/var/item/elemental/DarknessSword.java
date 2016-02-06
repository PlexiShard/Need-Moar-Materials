package var.item.elemental;

import var.base.BaseCreativeTab;
import var.base.BaseSword;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

public class DarknessSword extends BaseSword {


	public DarknessSword(ToolMaterial material, String uname, CreativeTabs tab, String texture) {
		super(material, uname, tab, texture);
	}

	@Override
	public boolean hitEntity(ItemStack sword, EntityLivingBase target, EntityLivingBase owner) {
		target.addPotionEffect(new PotionEffect(Potion.confusion.id, 100, 10));
		target.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 100, 10));
		return true;
	}

}
