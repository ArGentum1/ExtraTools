package com.jerzykwilczek.extratools.thaumcraft;

import com.jerzykwilczek.extratools.init.ModItems;
import com.jerzykwilczek.extratools.reference.Reference;
import net.minecraft.item.ItemStack;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.research.ResearchItem;
import thaumcraft.api.research.ResearchPage;
import thaumcraft.common.lib.research.ResearchNoteData;

public class testResearch

{
  /*  @Override
    public ResearchItem setPages(ResearchPage... par) {
        for (ResearchPage page : par) {
            if (page.type == ResearchPage.PageType.TEXT)
                page.text = "ttresearch.page." + "testResearch" + "." + page.text;
        }
        return super.setPages(par);
    }
    */

    public static void init()
    {
        ResearchPage page = new ResearchPage("etresearch.testResearch.page.0");

        //ResearchItem research = new ResearchItem("testResearch", "ETTab", new AspectList().add(Aspect.AIR, 2).add(Aspect.FIRE, 2).add(Aspect.ARMOR, 3), 3, 3, 2, new ItemStack(ModItems.rainbowniumIngot)).setPages(page).registerResearchItem();

    }

}
