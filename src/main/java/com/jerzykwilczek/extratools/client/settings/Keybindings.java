package com.jerzykwilczek.extratools.client.settings;

import com.jerzykwilczek.extratools.reference.Names;
import net.minecraft.client.settings.KeyBinding;
import org.lwjgl.input.Keyboard;

public class Keybindings
{
    public static KeyBinding charge = new KeyBinding(Names.Keys.CHARGE, Keyboard.KEY_V, Names.Keys.CATEGORY);
    public static KeyBinding relase = new KeyBinding(Names.Keys.RELASE, Keyboard.KEY_B, Names.Keys.CATEGORY);
}
