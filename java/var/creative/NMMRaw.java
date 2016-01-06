package var.creative;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import var.item.TitaniumManager;

public final class NMMRaw extends CreativeTabs
{
    public NMMRaw(String label)
    {	super(label);}
    
    @SideOnly(Side.CLIENT)
    public Item getTabIconItem()
    {	return TitaniumManager.unsmeltedTitanium;}
    
    @SideOnly(Side.CLIENT)
	public ItemStack getIconItemStack() 
    {	return new ItemStack(TitaniumManager.unsmeltedTitanium, 1);}
}