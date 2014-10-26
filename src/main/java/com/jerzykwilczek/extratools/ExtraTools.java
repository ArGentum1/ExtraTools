package com.jerzykwilczek.extratools;

import com.jerzykwilczek.extratools.handler.KeyInputEventHandler;
import com.jerzykwilczek.extratools.init.ModBlocks;
import com.jerzykwilczek.extratools.init.ModItems;
import com.jerzykwilczek.extratools.handler.ConfigurationHandler;
import com.jerzykwilczek.extratools.init.Recipes;
import com.jerzykwilczek.extratools.init.Thaumcraft;
import com.jerzykwilczek.extratools.proxy.IProxy;
import com.jerzykwilczek.extratools.reference.Reference;
import com.jerzykwilczek.extratools.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)

public class ExtraTools
{
    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.Instance(Reference.MOD_ID)
    public static ExtraTools instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {

        /*
        * KeyBindings */

        proxy.registerKeyBindings();


        /*
        * Configurations */
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

        /*
        * Items and Blocks init */
        ModItems.init();

        ModBlocks.init();

        LogHelper.info("Pre Initialization Complete!!!");

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {


        // Keybinding listener
        FMLCommonHandler.instance().bus().register(new KeyInputEventHandler());

        // Recipes init
        Recipes.init();

        LogHelper.info("Initialization complete!!!");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        LogHelper.info("Integer is " + ConfigurationHandler.testValue2);
        LogHelper.info("Boolean is " + ConfigurationHandler.testValue);
        Thaumcraft.greatInit();
        LogHelper.info("Post Initialization complete!!!");
    }
}
