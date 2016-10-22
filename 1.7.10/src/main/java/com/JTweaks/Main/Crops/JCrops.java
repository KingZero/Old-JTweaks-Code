package com.JTweaks.Main.Crops;

import net.minecraft.block.*;
import net.minecraft.client.*;
import net.minecraft.creativetab.*;
import cpw.mods.fml.common.registry.*;
import net.minecraft.init.*;
import net.minecraft.init.*;
import net.minecraft.item.*;
import net.minecraftforge.common.*;

import com.JTweaks.Main.*;
import com.JTweaks.Main.Blocks.*;

public class JCrops {

	//Crops
	public static Block Rye = new JWheat()
	.setBlockName(Reference.MODID + "." + "Rye")
	.setBlockTextureName(Reference.MODID + ":" + "Rye");
	
	public static Block Bamboo = new JReed()
	.setBlockName(Reference.MODID + "." + "Bamboo")
	.setBlockTextureName(Reference.MODID + ":" + "Bamboo");
	
	public static Block Onion = new JPotato()
	.setBlockName(Reference.MODID + "." + "Onion")
	.setBlockTextureName(Reference.MODID + ":" + "Onion");
	
	public static Block Tomato = new JPotato()
	.setBlockName(Reference.MODID + "." + "Tomato")
	.setBlockTextureName(Reference.MODID + ":" + "Tomato");
	
	public static Block Orange = new JPotato()
	.setBlockName(Reference.MODID + "." + "Orange")
	.setBlockTextureName(Reference.MODID + ":" + "Orange");
	
	//Items ------------------------------------------------------------------------
	public static Item SeedsRye = new ItemSeeds(Rye, Blocks.farmland)
	.setUnlocalizedName(Reference.MODID + "." + "SeedsRye")
	.setCreativeTab(JTweaks.tabJCrops)
	.setTextureName(Reference.MODID + ":" + "SeedsRye");
	
	public static Item	ItemRye = (new Item())
	.setUnlocalizedName(Reference.MODID + "." + "ItemRye")
	.setCreativeTab(JTweaks.tabJCrops)
	.setTextureName(Reference.MODID + ":" + "ItemRye");
	
	public static Item ItemBamboo = new ItemReed(JCrops.Bamboo)
	.setUnlocalizedName(Reference.MODID + "." + "ItemBamboo")
	.setCreativeTab(JTweaks.tabJCrops)
	.setTextureName(Reference.MODID + ":" + "ItemBamboo");
	
	public static Item ItemOnion = new ItemSeedFood(1, 0.3F, JCrops.Onion, Blocks.farmland)
	.setUnlocalizedName(Reference.MODID + "." + "ItemOnion")
	.setCreativeTab(JTweaks.tabJCrops)
	.setTextureName(Reference.MODID + ":" + "ItemOnion");
	
	public static Item	PoisonousOnion = (new Item())
	.setUnlocalizedName(Reference.MODID + "." + "PoisonousOnion")
	.setCreativeTab(JTweaks.tabJCrops)
	.setTextureName(Reference.MODID + ":" + "PoisonousOnion");
	
	public static Item ItemTomato = new ItemSeedFood(1, 0.3F, JCrops.Tomato, Blocks.farmland)
	.setUnlocalizedName(Reference.MODID + "." + "ItemTomato")
	.setCreativeTab(JTweaks.tabJCrops)
	.setTextureName(Reference.MODID + ":" + "ItemTomato");
	
	public static Item	PoisonousTomato = (new Item())
	.setUnlocalizedName(Reference.MODID + "." + "PoisonousTomato")
	.setCreativeTab(JTweaks.tabJCrops)
	.setTextureName(Reference.MODID + ":" + "PoisonousTomato");
	
	public static Item ItemOrange = new ItemSeedFood(1, 0.3F, JCrops.Orange, Blocks.farmland)
	.setUnlocalizedName(Reference.MODID + "." + "ItemOrange")
	.setCreativeTab(JTweaks.tabJCrops)
	.setTextureName(Reference.MODID + ":" + "ItemOrange");
	
    public static void init() {

	//Crops
	GameRegistry.registerBlock(Rye,Rye.getUnlocalizedName());
	GameRegistry.registerBlock(Bamboo,Bamboo.getUnlocalizedName());
	GameRegistry.registerBlock(Onion,Onion.getUnlocalizedName());
	GameRegistry.registerBlock(Tomato,Tomato.getUnlocalizedName());
	GameRegistry.registerBlock(Orange,Orange.getUnlocalizedName());
	
	//Items
	GameRegistry.registerItem(SeedsRye,SeedsRye.getUnlocalizedName());
	MinecraftForge.addGrassSeed(new ItemStack(SeedsRye),10);
	GameRegistry.registerItem(ItemRye,ItemRye.getUnlocalizedName());
	GameRegistry.registerItem(ItemBamboo,ItemBamboo.getUnlocalizedName());
	GameRegistry.registerItem(ItemOnion,ItemOnion.getUnlocalizedName());
	GameRegistry.registerItem(PoisonousOnion,PoisonousOnion.getUnlocalizedName());
	GameRegistry.registerItem(ItemTomato,ItemTomato.getUnlocalizedName());
	GameRegistry.registerItem(PoisonousTomato,PoisonousTomato.getUnlocalizedName());
	GameRegistry.registerItem(ItemOrange,ItemOrange.getUnlocalizedName());
	
	//Recipes
	GameRegistry.addRecipe(new ItemStack(Items.bread), new Object[]{
    	"AAA",
    	'A', ItemRye});
	
	}
}
