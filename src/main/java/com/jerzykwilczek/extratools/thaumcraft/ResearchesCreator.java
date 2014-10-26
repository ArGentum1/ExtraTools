package com.jerzykwilczek.extratools.thaumcraft;

import com.jerzykwilczek.extratools.init.ModItems;
import com.jerzykwilczek.extratools.reference.ResearchReference;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.crafting.CrucibleRecipe;
import thaumcraft.api.crafting.ShapedArcaneRecipe;
import thaumcraft.api.research.ResearchPage;

import static com.jerzykwilczek.extratools.reference.ResearchReference.*;

public class ResearchesCreator

{
    public static void init()
    {
        ResearchItemET research;

        //name, Aspects, column, row, complexity, image(ItemStack or ResourceLocation)

        research = new ResearchItemET(RESEARCH_GOLD_IRON, new AspectList(), 0, -6, 1, new ItemStack(Items.iron_ingot));
        research.setPages(new ResearchPage[]{new ResearchPage("1"), new ResearchPage(new ItemStack(Blocks.iron_ore)), new ResearchPage(new ItemStack(Blocks.gold_ore))});
        research.setAutoUnlock().registerResearchItem();
        //ThaumcraftApi.addWarpToResearch(RESEARCH_GOLD_IRON, 5);

        research = new ResearchItemET(RESEARCH_BASIC_RING, new AspectList().add(Aspect.METAL, 3).add(Aspect.GREED, 5).add(Aspect.MAGIC, 3), -5, -5, 1, new ItemStack(ModItems.ringBasic));
        ShapedArcaneRecipe ring = new ShapedArcaneRecipe(RESEARCH_BASIC_RING, ModItems.ringBasic, new AspectList().add(Aspect.FIRE, 10).add(Aspect.EARTH, 10).add(Aspect.ORDER, 10), " s ", "s s", " s ", 's', new ItemStack(Items.gold_ingot));
        ShapedArcaneRecipe amulet = new ShapedArcaneRecipe(RESEARCH_BASIC_RING, ModItems.amuletBasic, new AspectList().add(Aspect.FIRE, 10).add(Aspect.AIR, 10).add(Aspect.ORDER, 10), "sss", "s s", " g ", 's', new ItemStack(Items.string), 'g', new ItemStack(Items.gold_ingot));
        ShapedArcaneRecipe belt = new ShapedArcaneRecipe(RESEARCH_BASIC_RING, ModItems.beltBasic,new AspectList().add(Aspect.WATER, 10).add(Aspect.AIR, 10).add(Aspect.ORDER, 10), "ggg", "l l", "lll", 'g', new ItemStack(Items.gold_ingot), 'l', new ItemStack(Items.leather));
        research.setPages(new ResearchPage[]{new ResearchPage("1"), new ResearchPage(ring), new ResearchPage(amulet), new ResearchPage(belt)});
        research.setParents(RESEARCH_GOLD_IRON).registerResearchItem();

        research = new ResearchItemET(RESEARCH_RING_ALLOY, new AspectList().add(Aspect.METAL, 3).add(Aspect.GREED, 3).add(Aspect.EXCHANGE, 3), -8, -4, 1, new ItemStack(ModItems.ringAlloy));
        CrucibleRecipe ringAlloy = new CrucibleRecipe(RESEARCH_RING_ALLOY, new ItemStack(ModItems.ringAlloy, 2), new ItemStack(Items.gold_ingot), new AspectList().add(Aspect.METAL, 4));
        research.setPages(new ResearchPage[]{new ResearchPage("1"), new ResearchPage(ringAlloy), new ResearchPage(new ShapedArcaneRecipe(RESEARCH_RING_ALLOY, new ItemStack(ModItems.ringBasic), new AspectList().add(Aspect.FIRE, 10).add(Aspect.ORDER, 10).add(Aspect.EARTH, 10), " s ", "s s", " s ", 's', new ItemStack(ModItems.ringAlloy)))});
        research.setRound().setParents(RESEARCH_BASIC_RING).setSecondary().setConcealed().registerResearchItem();


    }

}
