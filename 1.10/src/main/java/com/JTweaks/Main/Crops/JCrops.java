package com.JTweaks.Main.Crops;

import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.client.*;
import net.minecraft.creativetab.*;
import net.minecraftforge.fml.common.registry.*;
import net.minecraft.init.*;
import net.minecraft.init.*;
import net.minecraft.item.*;
import net.minecraftforge.common.*;

import com.JTweaks.Main.*;
import com.JTweaks.Main.Blocks.*;

public class JCrops {
	
	public static Block Bamboo = new JReed().setCreativeTab(JTweaks.tabJCrops);
	public static ItemBlock BambooItemBlock = new ItemBlock(Bamboo);
	
	//Crops
	public static Block Rye = new JWheat()
	.setUnlocalizedName("Rye");
//	.setCreativeTab(JTweaks.tabJCrops);
//	.setBlockTextureName(Reference.MODID + ":" + "Rye");
	
//	public static Block Bamboo = new JReed()
//	.setUnlocalizedName("Bamboo");
//	.setCreativeTab(JTweaks.tabJCrops);
//	.setBlockTextureName(Reference.MODID + ":" + "Bamboo");
	
	public static Block Onion = new JPotato()
	.setUnlocalizedName("Onion");
//	.setCreativeTab(JTweaks.tabJCrops);
//	.setBlockTextureName(Reference.MODID + ":" + "Onion");
	
	public static Block Tomato = new JPotato()
	.setUnlocalizedName("Tomato");
//	.setCreativeTab(JTweaks.tabJCrops);
//	.setBlockTextureName(Reference.MODID + ":" + "Tomato");
	
	public static Block Orange = new JPotato()
	.setUnlocalizedName("Orange");
//	.setCreativeTab(JTweaks.tabJCrops);
//	.setBlockTextureName(Reference.MODID + ":" + "Orange");
	
	//Items ------------------------------------------------------------------------
	public static Item SeedsRye = new ItemSeeds(Rye, Blocks.FARMLAND)
	.setUnlocalizedName("SeedsRye")
	.setCreativeTab(JTweaks.tabJCrops);
//	.setTextureName(Reference.MODID + ":" + "SeedsRye");
	
	public static Item	ItemRye = (new Item())
	.setUnlocalizedName("ItemRye")
	.setCreativeTab(JTweaks.tabJCrops);
//	.setTextureName(Reference.MODID + ":" + "ItemRye");
	
//	public static ItemBlock ItemBamboo = new ItemBlockSpecial(JCrops.Bamboo)
//	.setUnlocalizedName("ItemBamboo")
//	.setCreativeTab(JTweaks.tabJCrops);
//	.setTextureName(Reference.MODID + ":" + "ItemBamboo");
	
//	public static ItemBlock ItemOnion = new ItemSeedFood(1, 0.3F, JCrops.Onion, Blocks.FARMLAND)
//	.setUnlocalizedName("ItemOnion")
//	.setCreativeTab(JTweaks.tabJCrops);
//	.setTextureName(Reference.MODID + ":" + "ItemOnion");
	
	public static Item	PoisonousOnion = (new Item())
	.setUnlocalizedName("PoisonousOnion")
	.setCreativeTab(JTweaks.tabJCrops);
//	.setTextureName(Reference.MODID + ":" + "PoisonousOnion");
	
//	public static ItemBlock ItemTomato = new ItemSeedFood(1, 0.3F, JCrops.Tomato, Blocks.FARMLAND)
//	.setUnlocalizedName("ItemTomato")
//	.setCreativeTab(JTweaks.tabJCrops);
//	.setTextureName(Reference.MODID + ":" + "ItemTomato");
	
	public static Item	PoisonousTomato = (new Item())
	.setUnlocalizedName("PoisonousTomato")
	.setCreativeTab(JTweaks.tabJCrops);
//	.setTextureName(Reference.MODID + ":" + "PoisonousTomato");
	
//	public static ItemBlock ItemOrange = new ItemSeedFood(1, 0.3F, JCrops.Orange, Blocks.FARMLAND)
//	.setUnlocalizedName("ItemOrange")
//	.setCreativeTab(JTweaks.tabJCrops);
//	.setTextureName(Reference.MODID + ":" + "ItemOrange");
	
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
//	GameRegistry.registerItem(ItemBamboo,ItemBamboo.getUnlocalizedName());
//	GameRegistry.registerItem(ItemOnion,ItemOnion.getUnlocalizedName());
	GameRegistry.registerItem(PoisonousOnion,PoisonousOnion.getUnlocalizedName());
//	GameRegistry.registerItem(ItemTomato,ItemTomato.getUnlocalizedName());
	GameRegistry.registerItem(PoisonousTomato,PoisonousTomato.getUnlocalizedName());
//	GameRegistry.registerItem(ItemOrange,ItemOrange.getUnlocalizedName());
	
	//Recipes
	GameRegistry.addRecipe(new ItemStack(Items.BREAD), new Object[]{
    	"AAA",
    	'A', ItemRye});
	
	}
}
