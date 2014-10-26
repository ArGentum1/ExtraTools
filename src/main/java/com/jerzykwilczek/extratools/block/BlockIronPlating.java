package com.jerzykwilczek.extratools.block;

import net.minecraft.block.material.Material;

public class BlockIronPlating extends BlockET
{
    public BlockIronPlating()
    {
        super(Material.iron);
        this.setBlockName("ironPlatingBlock");
        this.setBlockTextureName("ironPlatingBlock");
        this.setHardness(6.0F);
        this.setStepSound(soundTypeMetal);
        this.setResistance(11.0F);
    }
}
