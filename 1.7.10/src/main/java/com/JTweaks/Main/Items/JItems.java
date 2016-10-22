package com.JTweaks.Main.Items;

import com.JTweaks.Main.*;
import com.JTweaks.Main.Items.Backpack.*;
import com.JTweaks.Main.Liquids.*;
import com.JTweaks.Main.Dimensions.PortalStarter;
import cpw.mods.fml.common.registry.*;
import net.minecraft.client.*;
import net.minecraft.init.*;
import net.minecraft.item.*;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;
import net.minecraftforge.common.DungeonHooks;


public class JItems {
	
	public static Item ItemBackpack = new ItemBackpack()
	.setUnlocalizedName(Reference.MODID + "." + "Backpack")
	.setCreativeTab(JTweaks.tabJMisc)
	.setTextureName(Reference.MODID + ":" + "Backpack");
	
	public static Item ItemGuardMold = new Item()
	.setUnlocalizedName(Reference.MODID + "." + "GuardMold")
	.setCreativeTab(JTweaks.tabJMisc)
	.setTextureName(Reference.MODID + ":" + "GuardMold");
	
	public static Item ItemHiltMold = new Item()
	.setUnlocalizedName(Reference.MODID + "." + "HiltMold")
	.setCreativeTab(JTweaks.tabJMisc)
	.setTextureName(Reference.MODID + ":" + "HiltMold");
	
	public static Item ItemPommelMold = new Item()
	.setUnlocalizedName(Reference.MODID + "." + "PommelMold")
	.setCreativeTab(JTweaks.tabJMisc)
	.setTextureName(Reference.MODID + ":" + "PommelMold");
	
	public static Item ItemBladeMold = new Item()
	.setUnlocalizedName(Reference.MODID + "." + "BladeMold")
	.setCreativeTab(JTweaks.tabJMisc)
	.setTextureName(Reference.MODID + ":" + "BladeMold");
	
	public static Item ItemGuard = new Item()
	.setUnlocalizedName(Reference.MODID + "." + "Guard")
	.setCreativeTab(JTweaks.tabJMisc)
	.setTextureName(Reference.MODID + ":" + "Guard");
	
	public static Item ItemHilt = new Item()
	.setUnlocalizedName(Reference.MODID + "." + "Hilt")
	.setCreativeTab(JTweaks.tabJMisc)
	.setTextureName(Reference.MODID + ":" + "Hilt");
	
	public static Item ItemPommel = new Item()
	.setUnlocalizedName(Reference.MODID + "." + "Pommel")
	.setCreativeTab(JTweaks.tabJMisc)
	.setTextureName(Reference.MODID + ":" + "Pommel");
	
	public static Item ItemBlade = new Item()
	.setUnlocalizedName(Reference.MODID + "." + "Blade")
	.setCreativeTab(JTweaks.tabJMisc)
	.setTextureName(Reference.MODID + ":" + "Blade");
	
	public static Item ItemFlour = new Item()
	.setUnlocalizedName(Reference.MODID + "." + "Flour")
	.setCreativeTab(JTweaks.tabJMisc)
	.setTextureName(Reference.MODID + ":" + "Flour");
	
	public static Item ItemGlue = new Item()
	.setUnlocalizedName(Reference.MODID + "." + "Glue")
	.setCreativeTab(JTweaks.tabJMisc)
	.setTextureName(Reference.MODID + ":" + "Glue");
	
	public static Item ItemHammer = new Item()
	.setUnlocalizedName(Reference.MODID + "." + "Hammer")
	.setCreativeTab(JTweaks.tabJMisc)
	.setTextureName(Reference.MODID + ":" + "Hammer");
	
	public static Item PortalStarter = new PortalStarter()
	.setUnlocalizedName(Reference.MODID + "." + "PortalStarter")
	.setCreativeTab(JTweaks.tabJMisc)
	.setTextureName(Reference.MODID + ":" + "PortalStarter");
	
	/*--------------------------------------------------------//
	//--------------------------------------------------------//
	//--------------------------------------------------------//
	
	public static Item ItemGoldGuard = new Item()
	.setUnlocalizedName(Reference.MODID + "." + "GoldGuard")
	.setCreativeTab(JTweaks.tabJMisc)
	.setTextureName(Reference.MODID + ":" + "GoldGuard");
	
	public static Item ItemGoldHilt = new Item()
	.setUnlocalizedName(Reference.MODID + "." + "GoldHilt")
	.setCreativeTab(JTweaks.tabJMisc)
	.setTextureName(Reference.MODID + ":" + "GoldHilt");
	
	public static Item ItemGoldPommel = new Item()
	.setUnlocalizedName(Reference.MODID + "." + "GoldPommel")
	.setCreativeTab(JTweaks.tabJMisc)
	.setTextureName(Reference.MODID + ":" + "GoldPommel");
	
	public static Item ItemGoldBlade = new Item()
	.setUnlocalizedName(Reference.MODID + "." + "GoldBlade")
	.setCreativeTab(JTweaks.tabJMisc)
	.setTextureName(Reference.MODID + ":" + "GoldBlade");

	//--------------------------------------------------------//
	
	public static Item ItemDiamondGuard = new Item()
	.setUnlocalizedName(Reference.MODID + "." + "DiamondGuard")
	.setCreativeTab(JTweaks.tabJMisc)
	.setTextureName(Reference.MODID + ":" + "DiamondGuard");
	
	public static Item ItemDiamondHilt = new Item()
	.setUnlocalizedName(Reference.MODID + "." + "DiamondHilt")
	.setCreativeTab(JTweaks.tabJMisc)
	.setTextureName(Reference.MODID + ":" + "DiamondHilt");
	
	public static Item ItemDiamondPommel = new Item()
	.setUnlocalizedName(Reference.MODID + "." + "DiamondPommel")
	.setCreativeTab(JTweaks.tabJMisc)
	.setTextureName(Reference.MODID + ":" + "DiamondPommel");
	
	public static Item ItemDiamondBlade = new Item()
	.setUnlocalizedName(Reference.MODID + "." + "DiamondBlade")
	.setCreativeTab(JTweaks.tabJMisc)
	.setTextureName(Reference.MODID + ":" + "DiamondBlade");
	
	//--------------------------------------------------------//
	//--------------------------------------------------------//
	//--------------------------------------------------------*/
	
    public static void init() {

		//Items
		GameRegistry.registerItem(ItemBackpack,ItemBackpack.getUnlocalizedName());
		
		GameRegistry.registerItem(ItemGuardMold,ItemGuardMold.getUnlocalizedName());
		GameRegistry.registerItem(ItemHiltMold,ItemHiltMold.getUnlocalizedName());
		GameRegistry.registerItem(ItemPommelMold,ItemPommelMold.getUnlocalizedName());
		GameRegistry.registerItem(ItemBladeMold,ItemBladeMold.getUnlocalizedName());
		
		GameRegistry.registerItem(ItemGuard,ItemGuard.getUnlocalizedName());
		GameRegistry.registerItem(ItemHilt,ItemHilt.getUnlocalizedName());
		GameRegistry.registerItem(ItemPommel,ItemPommel.getUnlocalizedName());
		GameRegistry.registerItem(ItemBlade,ItemBlade.getUnlocalizedName());
		
		GameRegistry.registerItem(ItemFlour,ItemFlour.getUnlocalizedName());
		GameRegistry.registerItem(ItemGlue,ItemGlue.getUnlocalizedName());
		GameRegistry.registerItem(ItemHammer,ItemHammer.getUnlocalizedName());
		GameRegistry.registerItem(PortalStarter,PortalStarter.getUnlocalizedName());
		
		//Recipes
		GameRegistry.addShapelessRecipe(new ItemStack(ItemGlue, 4), new Object[]{Items.water_bucket, ItemFlour});
		GameRegistry.addShapelessRecipe(new ItemStack(ItemGuard), new Object[]{Items.iron_ingot, ItemGuardMold});
		GameRegistry.addShapelessRecipe(new ItemStack(ItemHilt), new Object[]{Items.iron_ingot, ItemHiltMold});
		GameRegistry.addShapelessRecipe(new ItemStack(ItemPommel), new Object[]{Items.iron_ingot, ItemPommelMold});
		GameRegistry.addShapelessRecipe(new ItemStack(ItemBlade), new Object[]{Items.iron_ingot, ItemBladeMold});
		
/*
 * pyramidDesertyChest
 * pyramidJungleChest
 * pyramidJungleDispenser
 * strongholdCorridor
 * strongholdLibrary
 * strongholdCrossing
 * villageBlacksmith
 * bonusChest
 * mineshaftCorridor
 */
		//Chest Spawn
		new ChestGenHooks("dungeonChest").addItem(new WeightedRandomChestContent(new ItemStack(PortalStarter), 1, 5, 10));

		
		
		/*--------------------------------------------------------//
		GameRegistry.registerItem(ItemGoldGuard,ItemGoldGuard.getUnlocalizedName());
		GameRegistry.registerItem(ItemGoldHilt,ItemGoldHilt.getUnlocalizedName());
		GameRegistry.registerItem(ItemGoldPommel,ItemGoldPommel.getUnlocalizedName());
		GameRegistry.registerItem(ItemGoldBlade,ItemGoldBlade.getUnlocalizedName());
		
		GameRegistry.registerItem(ItemDiamondGuard,ItemDiamondGuard.getUnlocalizedName());
		GameRegistry.registerItem(ItemDiamondHilt,ItemDiamondHilt.getUnlocalizedName());
		GameRegistry.registerItem(ItemDiamondPommel,ItemDiamondPommel.getUnlocalizedName());
		GameRegistry.registerItem(ItemDiamondBlade,ItemDiamondBlade.getUnlocalizedName());
		//--------------------------------------------------------*/
	}
}
