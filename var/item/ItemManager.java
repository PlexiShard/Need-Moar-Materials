package var.item;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import var.creativetabs.CreativeTabsManager;
import var.item.brass.BrassManager;
import var.item.copper.CopperManager;
import var.item.elemental.ElementalManager;
import var.item.misc.MiscManager;
import var.item.platinum.PlatinumManager;
import var.item.steel.SteelManager;
import var.item.titanium.TitaniumManager;
import var.main.MainRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

public class ItemManager {
	public static void mainRegistry() {
        BrassManager.mainRegistry();
        CopperManager.mainRegistry();
        ElementalManager.mainRegistry();
        MiscManager.mainRegistry();
        PlatinumManager.mainRegistry();
        SteelManager.mainRegistry();
        TitaniumManager.mainRegistry();
    }
	
}
