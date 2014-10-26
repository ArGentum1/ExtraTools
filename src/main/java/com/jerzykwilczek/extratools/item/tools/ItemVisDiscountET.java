package com.jerzykwilczek.extratools.item.tools;

import com.jerzykwilczek.extratools.item.ItemET;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import thaumcraft.api.IVisDiscountGear;
import thaumcraft.api.aspects.Aspect;

public class ItemVisDiscountET extends ItemET implements IVisDiscountGear

{

    @Override
    public int getVisDiscount(ItemStack stack, EntityPlayer player, Aspect aspect) {
        if(aspect == Aspect.FIRE)
        {
            return 5;
        }
        else
        {
            return 0;
        }
    }
}
