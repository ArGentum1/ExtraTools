package com.jerzykwilczek.extratools.utility;

import com.jerzykwilczek.extratools.item.ItemET;
import com.jerzykwilczek.extratools.item.tools.*;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.oredict.OreDictionary;
import thaumcraft.api.aspects.AspectList;

public class QuickGen

{





    public static void QuickGenTools(String materialNameCapital , int harvestLevel, int maxUses, float efficiency, float damage, int enchantablility)
    {


       Item.ToolMaterial newMaterial = EnumHelper.addToolMaterial(materialNameCapital, harvestLevel, maxUses, efficiency, damage, enchantablility);



        ItemET materialIngot = (ItemET) new ItemET().setUnlocalizedName(materialNameCapital.toLowerCase() + "Ingot");
        GameRegistry.registerItem(materialIngot, materialNameCapital.toLowerCase() + "Ingot");
        OreDictionary.registerOre(materialNameCapital.toLowerCase() + "Ingot", materialIngot);

        ItemAxeET materialAxe = (ItemAxeET) new ItemAxeET(newMaterial).setUnlocalizedName(materialNameCapital.toLowerCase() + "Axe");
        ItemHoeET materialHoe = (ItemHoeET) new ItemHoeET(newMaterial).setUnlocalizedName(materialNameCapital.toLowerCase() + "Hoe");
        ItemPickaxeET materialPickaxe = (ItemPickaxeET) new ItemPickaxeET(newMaterial).setUnlocalizedName(materialNameCapital.toLowerCase() + "Pickaxe");
        ItemShovelET materialShovel = (ItemShovelET) new ItemShovelET(newMaterial).setUnlocalizedName(materialNameCapital.toLowerCase() + "Shovel");
        ItemSwordET materialSword = (ItemSwordET) new ItemSwordET(newMaterial).setUnlocalizedName(materialNameCapital.toLowerCase() + "Sword");

        GameRegistry.registerItem(materialAxe, materialNameCapital.toLowerCase() + "Axe");
        GameRegistry.registerItem(materialHoe, materialNameCapital.toLowerCase() + "Hoe");
        GameRegistry.registerItem(materialPickaxe, materialNameCapital.toLowerCase() + "Pickaxe");
        GameRegistry.registerItem(materialShovel, materialNameCapital.toLowerCase() + "Shovel");
        GameRegistry.registerItem(materialSword, materialNameCapital.toLowerCase() + "Sword");


        GameRegistry.addRecipe(new ItemStack(materialAxe), "ii ", "is ", " s ", 'i', new ItemStack(materialIngot), 's', new ItemStack(Items.stick));
        GameRegistry.addRecipe(new ItemStack(materialAxe), " ii", " si", " s ", 'i', new ItemStack(materialIngot), 's', new ItemStack(Items.stick));
        GameRegistry.addRecipe(new ItemStack(materialHoe), "ii ", " s ", " s ", 'i', new ItemStack(materialIngot), 's', new ItemStack(Items.stick));
        GameRegistry.addRecipe(new ItemStack(materialHoe), " ii", " s ", " s ", 'i', new ItemStack(materialIngot), 's', new ItemStack(Items.stick));
        GameRegistry.addRecipe(new ItemStack(materialPickaxe), "iii", " s ", " s ", 'i', new ItemStack(materialIngot), 's', new ItemStack(Items.stick));
        GameRegistry.addRecipe(new ItemStack(materialShovel), " i ", " s ", " s ", 'i', new ItemStack(materialIngot), 's', new ItemStack(Items.stick));
        GameRegistry.addRecipe(new ItemStack(materialSword), " i ", " i ", " s ", 'i', new ItemStack(materialIngot), 's', new ItemStack(Items.stick));






    }

    public static void ToolsFromIngot(Item ingot, Item.ToolMaterial material, String nameCapital)
    {
        ItemAxeET materialAxe = (ItemAxeET) new ItemAxeET(material).setUnlocalizedName(nameCapital.toLowerCase() + "Axe");
        ItemHoeET materialHoe = (ItemHoeET) new ItemHoeET(material).setUnlocalizedName(nameCapital.toLowerCase() + "Hoe");
        ItemPickaxeET materialPickaxe = (ItemPickaxeET) new ItemPickaxeET(material).setUnlocalizedName(nameCapital.toLowerCase() + "Pickaxe");
        ItemShovelET materialShovel = (ItemShovelET) new ItemShovelET(material).setUnlocalizedName(nameCapital.toLowerCase() + "Shovel");
        ItemSwordET materialSword = (ItemSwordET) new ItemSwordET(material).setUnlocalizedName(nameCapital.toLowerCase() + "Sword");

        GameRegistry.registerItem(materialAxe, nameCapital.toLowerCase() + "Axe");
        GameRegistry.registerItem(materialHoe, nameCapital.toLowerCase() + "Hoe");
        GameRegistry.registerItem(materialPickaxe, nameCapital.toLowerCase() + "Pickaxe");
        GameRegistry.registerItem(materialShovel, nameCapital.toLowerCase() + "Shovel");
        GameRegistry.registerItem(materialSword, nameCapital.toLowerCase() + "Sword");

        GameRegistry.addRecipe(new ItemStack(materialAxe), "ii ", "is ", " s ", 'i', new ItemStack(ingot), 's', new ItemStack(Items.stick));
        GameRegistry.addRecipe(new ItemStack(materialAxe), " ii", " si", " s ", 'i', new ItemStack(ingot), 's', new ItemStack(Items.stick));
        GameRegistry.addRecipe(new ItemStack(materialHoe), "ii ", " s ", " s ", 'i', new ItemStack(ingot), 's', new ItemStack(Items.stick));
        GameRegistry.addRecipe(new ItemStack(materialHoe), " ii", " s ", " s ", 'i', new ItemStack(ingot), 's', new ItemStack(Items.stick));
        GameRegistry.addRecipe(new ItemStack(materialPickaxe), "iii", " s ", " s ", 'i', new ItemStack(ingot), 's', new ItemStack(Items.stick));
        GameRegistry.addRecipe(new ItemStack(materialShovel), " i ", " s ", " s ", 'i', new ItemStack(ingot), 's', new ItemStack(Items.stick));
        GameRegistry.addRecipe(new ItemStack(materialSword), " i ", " i ", " s ", 'i', new ItemStack(ingot), 's', new ItemStack(Items.stick));


    }

    public static void researchGen(String key, AspectList aspects, int col, int row, int compexity, ItemStack image)
    {

    }

    public static void researchGen(String key, AspectList aspects, int col, int row, int compexity, ResourceLocation image)
    {

    }


}
