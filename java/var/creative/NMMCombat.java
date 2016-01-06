package var.creative;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import var.item.ElementalManager;
import var.item.TitaniumManager;

public class NMMCombat extends CreativeTabs {

	ItemStack iconItemStack;
	
	public NMMCombat(String label) 
	{	super(label);}

	@Override
	@SideOnly(Side.CLIENT)
	public Item getTabIconItem() 
	{	return ElementalManager.lightningSword;}
	
	@SideOnly(Side.CLIENT)
    public ItemStack getIconItemStack()
    {	if (this.iconItemStack == null)
        {	this.iconItemStack = new ItemStack(this.getTabIconItem(), 1, this.getIconItemDamage());}
        return this.iconItemStack;
    }

}
