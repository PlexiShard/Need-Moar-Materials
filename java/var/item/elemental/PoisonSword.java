package var.item.elemental;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import var.base.BaseCreativeTab;
import var.base.BaseSword;

public class PoisonSword extends BaseSword {

	public PoisonSword(ToolMaterial material, String uname, CreativeTabs tab, String texture) {
		super(material, uname, tab, texture);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean hitEntity(ItemStack sword, EntityLivingBase target, EntityLivingBase owner) {
		target.addPotionEffect(new PotionEffect(Potion.wither.id, 100, 10));
		return true;
	}
	
}
