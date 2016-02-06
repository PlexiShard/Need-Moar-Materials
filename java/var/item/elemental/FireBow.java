package var.item.elemental;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.ArrowLooseEvent;
import net.minecraftforge.event.entity.player.ArrowNockEvent;
import var.base.BaseBow;
import var.base.BaseCreativeTab;
import var.item.ElementalManager;

public class FireBow extends BaseBow {

	public FireBow(String uname, BaseCreativeTab tab, String texture) {
		this.setupThis(uname, tab, texture);
	}

	public void onPlayerStoppedUsing(ItemStack bow, World world, EntityPlayer player, int p_77615_4_)
    {
        int j = this.getMaxItemUseDuration(bow) - p_77615_4_;

        ArrowLooseEvent event = new ArrowLooseEvent(player, bow, j);
        MinecraftForge.EVENT_BUS.post(event);
        if (event.isCanceled())
        {
            return;
        }
        j = event.charge;

        boolean flag = player.capabilities.isCreativeMode || EnchantmentHelper.getEnchantmentLevel(Enchantment.infinity.effectId, bow) > 0;

        if (flag || player.inventory.hasItem(ElementalManager.fireArrow))
        {
            float f = (float)j / 20.0F;
            f = (f * f + f * 2.0F) / 3.0F;

            if ((double)f < 0.1D)
            {
                return;
            }

            if (f > 1.0F)
            {
                f = 1.0F;
            }

            EntityFireArrow entityarrow = new EntityFireArrow(world, player);
            world.playSoundAtEntity(player, "random.bow", 1.0F, 1.0F / (itemRand.nextFloat() * 0.4F + 1.2F) + f * 0.5F);
            if (!world.isRemote)
            {
                world.spawnEntityInWorld(entityarrow);
                player.inventory.consumeInventoryItem(ElementalManager.fireArrow);
                bow.damageItem(1, player);
            }
        }
    }

    public ItemStack onEaten(ItemStack bow, World world, EntityPlayer player)
    {
        return bow;
    }
    public int getMaxItemUseDuration(ItemStack p_77626_1_)
    {
        return 72000;
    }
    public EnumAction getItemUseAction(ItemStack p_77661_1_)
    {
        return EnumAction.BOW;
    }

    /**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    public ItemStack onItemRightClick(ItemStack bow, World world, EntityPlayer player)
    {
        ArrowNockEvent event = new ArrowNockEvent(player, bow);
        MinecraftForge.EVENT_BUS.post(event);
        if (event.isCanceled())
        {
            return event.result;
        }

        if (player.capabilities.isCreativeMode || player.inventory.hasItem(ElementalManager.fireArrow))
        {
            player.setItemInUse(bow, this.getMaxItemUseDuration(bow));
        }

        return bow;
    }

    /**
     * Return the enchantability factor of the item, most of the time is based on material.
     */
    public int getItemEnchantability()
    {
        return 1;
    }
}