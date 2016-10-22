package com.JTweaks.Main.Crops;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemReed;
import net.minecraft.item.ItemSeedFood;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.JTweaks.Main.JTweaks;
import com.JTweaks.Main.Reference;

public class JCrops {

	//Crops
	public static Block Rye = new JWheat()
	.setUnlocalizedName(Reference.MODID + "." + "Rye");
	
	public static Block Bamboo = new JReed()
	.setUnlocalizedName(Reference.MODID + "." + "Bamboo");
	
	public static Block Onion = new JPotato()
	.setUnlocalizedName(Reference.MODID + "." + "Onion");
	
	public static Block Tomato = new JPotato()
	.setUnlocalizedName(Reference.MODID + "." + "Tomato");
	
	public static Block Orange = new JPotato()
	.setUnlocalizedName(Reference.MODID + "." + "Orange");
	
	//Items ------------------------------------------------------------------------
	public static Item SeedsRye = new ItemSeeds(Rye, Blocks.farmland)
	.setUnlocalizedName(Reference.MODID + "." + "SeedsRye")
	.setCreativeTab(JTweaks.tabJCrops);
	
	public static Item	ItemRye = (new Item())
	.setUnlocalizedName(Reference.MODID + "." + "ItemRye")
	.setCreativeTab(JTweaks.tabJCrops);
	
	public static Item ItemBamboo = new ItemReed(JCrops.Bamboo)
	.setUnlocalizedName(Reference.MODID + "." + "ItemBamboo")
	.setCreativeTab(JTweaks.tabJCrops);
	
	public static Item ItemOnion = new ItemSeedFood(1, 0.3F, JCrops.Onion, Blocks.farmland)
	.setUnlocalizedName(Reference.MODID + "." + "ItemOnion")
	.setCreativeTab(JTweaks.tabJCrops);
	
	public static Item	PoisonousOnion = (new Item())
	.setUnlocalizedName(Reference.MODID + "." + "PoisonousOnion")
	.setCreativeTab(JTweaks.tabJCrops);
	
	public static Item ItemTomato = new ItemSeedFood(1, 0.3F, JCrops.Tomato, Blocks.farmland)
	.setUnlocalizedName(Reference.MODID + "." + "ItemTomato")
	.setCreativeTab(JTweaks.tabJCrops);
	
	public static Item	PoisonousTomato = (new Item())
	.setUnlocalizedName(Reference.MODID + "." + "PoisonousTomato")
	.setCreativeTab(JTweaks.tabJCrops);
	
	public static Item ItemOrange = new ItemSeedFood(1, 0.3F, JCrops.Orange, Blocks.farmland)
	.setUnlocalizedName(Reference.MODID + "." + "ItemOrange")
	.setCreativeTab(JTweaks.tabJCrops);
	
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
