package com.jerzykwilczek.extratools.handler;

import com.jerzykwilczek.extratools.client.settings.Keybindings;
import com.jerzykwilczek.extratools.reference.Key;
import com.jerzykwilczek.extratools.utility.LogHelper;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;

public class KeyInputEventHandler

{

   /* private static Key getPressedKeybinding()
    {
        if (Keybindings.charge.isPressed())
        {
            return Key.CHARGE;
        }
        else if (Keybindings.relase.isPressed())
        {
            return Key.RELASE;
        }

        return Key.UNKNOWN;

    }

    @SubscribeEvent
    public void handlerKeyInputEvent(InputEvent.KeyInputEvent event)
    {
        LogHelper.info(getPressedKeybinding());
    }
    */
}
