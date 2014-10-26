package com.jerzykwilczek.extratools.thaumcraft;

import com.jerzykwilczek.extratools.init.ModItems;
import com.jerzykwilczek.extratools.reference.ResearchReference;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;

import static com.jerzykwilczek.extratools.reference.ResearchReference.RESEARCH_BASIC_RING;

public class Recipes

{
    public static void init()
    {
        ThaumcraftApi.addArcaneCraftingRecipe(ResearchReference.RESEARCH_BASIC_RING, new ItemStack(ModItems.ringBasic), new AspectList().add(Aspect.FIRE, 10).add(Aspect.EARTH, 10).add(Aspect.ORDER, 10), " s ", "s s", " s ", 's', new ItemStack(Items.gold_ingot));
        ThaumcraftApi.addArcaneCraftingRecipe(ResearchReference.RESEARCH_BASIC_RING, new ItemStack(ModItems.amuletBasic), new AspectList().add(Aspect.FIRE, 10).add(Aspect.AIR, 10).add(Aspect.ORDER, 10), "sss", "s s", " g ", 's', new ItemStack(Items.string), 'g', new ItemStack(Items.gold_ingot));
        ThaumcraftApi.addArcaneCraftingRecipe(ResearchReference.RESEARCH_BASIC_RING, new ItemStack(ModItems.beltBasic),new AspectList().add(Aspect.WATER, 10).add(Aspect.AIR, 10).add(Aspect.ORDER, 10), "ggg", "l l", "lll", 'g', new ItemStack(Items.gold_ingot), 'l', new ItemStack(Items.leather));
        ThaumcraftApi.addCrucibleRecipe(ResearchReference.RESEARCH_RING_ALLOY, new ItemStack(ModItems.ringAlloy, 2), new ItemStack(Items.gold_ingot), new AspectList().add(Aspect.METAL, 4));
        ThaumcraftApi.addArcaneCraftingRecipe(ResearchReference.RESEARCH_RING_ALLOY, new ItemStack(ModItems.ringBasic), new AspectList().add(Aspect.FIRE, 10).add(Aspect.ORDER, 10).add(Aspect.EARTH, 10), " s ", "s s", " s ", 's', new ItemStack(ModItems.ringAlloy));
    }
}
