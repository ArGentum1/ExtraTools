package com.jerzykwilczek.extratools.thaumcraft;

import com.jerzykwilczek.extratools.reference.ResearchReference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;
import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.research.ResearchItem;
import thaumcraft.api.research.ResearchPage;

public class ResearchItemET extends ResearchItem

{

    public ResearchItemET(String key) {
        super(key, ResearchReference.RESEARCH_TAB);
    }

    public ResearchItemET(String key, AspectList tags, int col, int row, int complex, ResourceLocation icon) {
        super(key, ResearchReference.RESEARCH_TAB, tags, col, row, complex, icon);
    }

    public ResearchItemET(String key, AspectList tags, int col, int row, int complex, ItemStack icon) {
        super(key, ResearchReference.RESEARCH_TAB, tags, col, row, complex, icon);
    }
    @Override
    public ResearchItemET setPages(ResearchPage... par)
    {
        for(ResearchPage page : par)
        {
            if(page.type == ResearchPage.PageType.TEXT)
            {
                page.text = "etpage." + key + "." + page.text;
            }
        }
        return (ResearchItemET) super.setPages(par);
    }
    @Override
    @SideOnly(Side.CLIENT)
    public String getName()
    {
        return StatCollector.translateToLocal("etname." + key);
    }
    @Override
    @SideOnly(Side.CLIENT)
    public String getText()
    {
        return StatCollector.translateToLocal("ettext." + key);
    }
}
