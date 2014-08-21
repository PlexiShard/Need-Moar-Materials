package var.item.titanium;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class TitaniumHelmet extends ItemArmor {

	public TitaniumHelmet(ArmorMaterial p_i45325_1_, int p_i45325_2_,
			int p_i45325_3_) {
		super(p_i45325_1_, p_i45325_2_, p_i45325_3_);
		// TODO Auto-generated constructor stub
	}
	
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
        if(slot == 0 || slot == 1 || slot == 3) {
            return "titanium:textures/models/armor/titanium_layer_1.png";
 
        }
        else if(slot == 2) {
            return "titanium:textures/models/armor/titanium_layer_2.png";
        }
        else {
            return null;
        }
    }

}
