package com.jerzykwilczek.extratools.init;

import com.jerzykwilczek.extratools.item.*;
import com.jerzykwilczek.extratools.item.baubles.*;
import com.jerzykwilczek.extratools.item.items.materials.ItemRainbowniumIngot;
import com.jerzykwilczek.extratools.item.items.regular.ItemIronChain;
import com.jerzykwilczek.extratools.item.items.regular.ItemIronPlating;
import com.jerzykwilczek.extratools.item.items.tools.rainbownium.*;
import com.jerzykwilczek.extratools.item.tools.*;
import com.jerzykwilczek.extratools.reference.Reference;
import com.jerzykwilczek.extratools.utility.NBTHelper;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

import static net.minecraft.item.Item.ToolMaterial;


@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    //Materials
   // public static ToolMaterial testMaterial = EnumHelper.addToolMaterial("Test Tool Material", 3, 200, 25.0F, 10.0F, 30);
    public static ToolMaterial rainbowniumMaterial = EnumHelper.addToolMaterial("Rainbow Tool material", 2, 300, 6.5F, 2.5F, 27);
   // public static ToolMaterial jarkoniumMaterial = EnumHelper.addToolMaterial("Jarkonium tool material", 2, 500, 6.0F, 10.0F, 6);

    //Resources

    public static final ItemET ironPlating = new ItemIronPlating();
    public static final ItemET ironChain = new ItemIronChain();
    public static final ItemET rainbowniumIngot = new ItemRainbowniumIngot();
    public static final ItemET testIngot = (ItemET) new ItemET().setUnlocalizedName("testIngot");
    public static final ItemET ringAlloy = (ItemET) new ItemET().setUnlocalizedName("ringAlloy");


    //Baubles
    public static final ringFireDiscount ringDiscount = (ringFireDiscount) new ringFireDiscount().setUnlocalizedName("ringDiscount");
    public static final ringSpeed ringSwift = (ringSpeed) new ringSpeed().setUnlocalizedName("ringSpeed");
    public static final ItemRingET ringBasic = (ItemRingET) new ItemRingET().setUnlocalizedName("ringBasic");
    public static final ItemAmuletET amuletBasic = (ItemAmuletET) new ItemAmuletET().setUnlocalizedName("amuletBasic");
    public static final ItemBeltET beltBasic = (ItemBeltET) new ItemBeltET().setUnlocalizedName("beltBasic");


    //Tools


    //Rainbownium
    public static final ItemPickaxeET rainbowniumPickaxe = new ItemRainbowniumPickaxe(rainbowniumMaterial);
    public static final ItemAxeET rainbowniumAxe = new ItemRainbowniumAxe(rainbowniumMaterial);
    public static final ItemHoeET rainbowniumHoe = new ItemRainbowniumHoe(rainbowniumMaterial);
    public static final ItemShovelET rainbowniumShovel = new ItemRainbowniumShovel(rainbowniumMaterial);
    public static final ItemSwordET rainbowniumSword = new ItemRainbowniumSword(rainbowniumMaterial);
    //Jarkonium
      /*  public static final ItemAxeET jarkoniumAxe = (ItemAxeET) new ItemAxeET(jarkoniumMaterial).setUnlocalizedName("jarkoniumAxe");
        public static final ItemHoeET jarkoniumHoe = (ItemHoeET) new ItemHoeET(jarkoniumMaterial).setUnlocalizedName("jarkoniumHoe");
        public static final ItemPickaxeET jarkoniumPickaxe = (ItemPickaxeET) new ItemPickaxeET(jarkoniumMaterial).setUnlocalizedName("jarkoniumPickaxe");
        public static final ItemShovelET jarkoniumShovel = (ItemShovelET) new ItemShovelET(jarkoniumMaterial).setUnlocalizedName("jarkoniumShovel");
        public static final ItemSwordET jarkoniumSword = (ItemSwordET) new ItemSwordET(jarkoniumMaterial).setUnlocalizedName("jarkoniumSword");
        */
    // public static final ItemPickaxeET testPickaxe = new ItemTestPickaxe(testMaterial);

    //Armors



    public static void init()
    {

        //Materials
        GameRegistry.registerItem(ironPlating, "ironPlating");
        GameRegistry.registerItem(ironChain, "ironChain");
        GameRegistry.registerItem(rainbowniumIngot, "rainbowniumIngot");
        GameRegistry.registerItem(ringAlloy, "ringAlloy");

        //GameRegistry.registerItem(testIngot, "testIngot");
        //Baubles
        GameRegistry.registerItem(ringDiscount, "ringDiscount");
        GameRegistry.registerItem(ringSwift, "ringSpeed");
        GameRegistry.registerItem(ringBasic, "ringBasic");
        GameRegistry.registerItem(amuletBasic, "amuletBasic");
        GameRegistry.registerItem(beltBasic, "beltBasic");


        //Tools
        // GameRegistry.registerItem(testPickaxe, "testPickaxe");
            //Rainbownium
            GameRegistry.registerItem(rainbowniumAxe, "rainbowniumAxe");
            GameRegistry.registerItem(rainbowniumHoe, "rainbowniumHoe");
            GameRegistry.registerItem(rainbowniumPickaxe, "rainbowniumPickaxe");
            GameRegistry.registerItem(rainbowniumShovel, "rainbowniumShovel");
            GameRegistry.registerItem(rainbowniumSword, "rainbowniumSword");
            //Jarkonium
          /*  GameRegistry.registerItem(jarkoniumAxe, "jarkoniumAxe");
            GameRegistry.registerItem(jarkoniumHoe, "jarkoniumHoe");
            GameRegistry.registerItem(jarkoniumPickaxe, "jarkoniumPickaxe");
            GameRegistry.registerItem(jarkoniumShovel, "jarkoniumShovel");
            GameRegistry.registerItem(jarkoniumSword, "jarkoniumSword");
          */

        //QuickGen.ToolsFromIngot(testIngot, testMaterial, "Test");

    }
}
