package com.jerzykwilczek.extratools.init;

import com.jerzykwilczek.extratools.block.BlockET;
import com.jerzykwilczek.extratools.block.BlockIronPlating;
import com.jerzykwilczek.extratools.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.material.Material;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockET ironPlatingBlock = new BlockIronPlating();
    public static final BlockET rainbowniumBlock = (BlockET) new BlockET(Material.iron).setBlockName("rainbowniumBlock").setBlockTextureName("rainbowniumBlock").setHardness(5.5F).setResistance(10.0F);

    public static void init()
    {
        GameRegistry.registerBlock(ironPlatingBlock, "ironPlatingBlock");
        GameRegistry.registerBlock(rainbowniumBlock, "rainbowniumBlock");
    }
}
