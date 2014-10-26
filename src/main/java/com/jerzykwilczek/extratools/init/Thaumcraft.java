package com.jerzykwilczek.extratools.init;

import com.jerzykwilczek.extratools.thaumcraft.*;
import com.jerzykwilczek.extratools.thaumcraft.Recipes;

public class Thaumcraft

{
    public static void greatInit()
    {
        ResearchTab.init();
        //testResearch.init();
        //com.jerzykwilczek.extratools.thaumcraft.Recipes.init();
        ResearchesCreator.init();
        Recipes.init();
    }
}
