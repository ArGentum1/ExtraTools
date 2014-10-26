package com.jerzykwilczek.extratools.creativetab;

import com.jerzykwilczek.extratools.init.ModBlocks;
import com.jerzykwilczek.extratools.init.ModItems;
import com.jerzykwilczek.extratools.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabET
{
    public static final CreativeTabs ET_RESOURCESTAB = new CreativeTabs(Reference.MOD_ID.toLowerCase() + "Resources") {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.ironPlating;
        }

    };

    public static final CreativeTabs ET_TOOLSTAB = new CreativeTabs(Reference.MOD_ID.toLowerCase() + "Tools") {
        @Override
        public Item getTabIconItem() {
            return ModItems.ironPlating;
        }
    };

}
