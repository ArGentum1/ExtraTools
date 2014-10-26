package com.jerzykwilczek.extratools.thaumcraft;

import com.jerzykwilczek.extratools.reference.Reference;
import com.jerzykwilczek.extratools.reference.ResearchReference;
import net.minecraft.util.ResourceLocation;
import thaumcraft.api.research.ResearchCategories;

public class ResearchTab

{
    public static void init()
    {
        ResourceLocation background = new ResourceLocation(Reference.MOD_ID.toLowerCase(), "/textures/gui/TCResearchtab/background.png");
        ResourceLocation icon = new ResourceLocation(Reference.MOD_ID.toLowerCase(), "/textures/gui/TCResearchtab/icon.png");
        ResearchCategories.registerCategory(ResearchReference.RESEARCH_TAB, icon, background);
    }
}
