package com.jerzykwilczek.extratools.handler;

import com.jerzykwilczek.extratools.reference.Reference;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler
{
    public static Configuration configuration;
    public static boolean testValue = false;
    public static int testValue2 = 10;

    public static void init(File configFile)
    {
        if (configuration == null)
        {
            configuration = new Configuration(configFile);
            loadConfiguration();
        }
    }
    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if (event.modID.equalsIgnoreCase(Reference.MOD_ID))
        {
            loadConfiguration();
        }
    }

    private static void loadConfiguration()
    {
        testValue = configuration.getBoolean("Test1", Configuration.CATEGORY_GENERAL, true, "A test boolean");
        testValue2 = configuration.getInt("Test2", Configuration.CATEGORY_GENERAL, 20, 5, 30, "A test integer");

        if (configuration.hasChanged())
        {
            configuration.save();
        }
    }
}
