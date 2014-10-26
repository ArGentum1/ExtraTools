package com.jerzykwilczek.extratools.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemSnowball;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class testGranade extends ItemET

{
    public testGranade()
    {
        super();
        this.setUnlocalizedName("testGranade");
    }

    public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player)
    {
        world.playSoundAtEntity(player, "random.bow", 0.5F, 0.4F);
        return itemstack;
    }

}
