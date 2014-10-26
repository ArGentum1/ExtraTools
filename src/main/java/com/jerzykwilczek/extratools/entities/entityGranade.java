package com.jerzykwilczek.extratools.entities;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class entityGranade extends EntityThrowable

{

    public entityGranade(World p_i1777_1_, EntityLivingBase p_i1777_2_) {
        super(p_i1777_1_, p_i1777_2_);
    }

    @Override
    protected void onImpact(MovingObjectPosition p_70184_1_) {

    }
}
