package com.jerzykwilczek.extratools.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemDye;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import thaumcraft.api.ItemApi;

public class Recipes
{
    public static void init()
    {
        GameRegistry.addRecipe(new ItemStack(ModItems.ironChain, 8), "ii ", "i i", "ii ", 'i', new ItemStack(Items.iron_ingot));
        GameRegistry.addRecipe(new ItemStack(Items.chainmail_boots), "c c", "c c", 'c', new ItemStack(ModItems.ironChain));
        GameRegistry.addRecipe(new ItemStack(Items.chainmail_chestplate), "c c", "ccc", "ccc", 'c', new ItemStack(ModItems.ironChain));
        GameRegistry.addRecipe(new ItemStack(Items.chainmail_helmet), "ccc", "c c", 'c', new ItemStack(ModItems.ironChain));
        GameRegistry.addRecipe(new ItemStack(Items.chainmail_leggings), "ccc", "c c", "c c", 'c', new ItemStack(ModItems.ironChain));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ironPlating), new ItemStack(Items.iron_ingot), new ItemStack(Items.iron_ingot), new ItemStack(Items.iron_ingot));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.rainbowniumAxe), " rr", " sr", " s ", 'r', new ItemStack(ModItems.rainbowniumIngot), 's', new ItemStack(Items.stick));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.rainbowniumAxe), "rr ", "rs ", " s ", 'r', new ItemStack(ModItems.rainbowniumIngot), 's', new ItemStack(Items.stick));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.rainbowniumHoe), "rr ", " s ", " s ", 'r', new ItemStack(ModItems.rainbowniumIngot), 's', new ItemStack(Items.stick));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.rainbowniumHoe), " rr", " s ", " s ", 'r', new ItemStack(ModItems.rainbowniumIngot), 's', new ItemStack(Items.stick));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.rainbowniumPickaxe), "rrr", " s ", " s ", 'r', new ItemStack(ModItems.rainbowniumIngot), 's', new ItemStack(Items.stick));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.rainbowniumShovel), " r ", " s ", " s ", 'r', new ItemStack(ModItems.rainbowniumIngot), 's', new ItemStack(Items.stick));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.rainbowniumSword), " r ", " r ", " s ", 'r', new ItemStack(ModItems.rainbowniumIngot), 's', new ItemStack(Items.stick));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.rainbowniumIngot, 2), "dyeRed", "dyeOrange", "dyeYellow", "dyeGreen", "dyeLightBlue", "dyeBlue", "dyePurple", "ingotIron"));
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.rainbowniumBlock), "rrr", "rrr", "rrr", 'r', new ItemStack(ModItems.rainbowniumIngot));


        //ItemStack tcJar = ItemApi.getBlock("blockJar", 0);
        //GameRegistry.addShapelessRecipe(new ItemStack(Items.iron_ingot), tcJar);



        //GameRegistry.addRecipe(new shapelessOreRecipe(new ItemStack(ModItems.ironPlating), "ingotIron" ));


    }
}
