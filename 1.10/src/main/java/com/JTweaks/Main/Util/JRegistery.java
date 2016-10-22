package com.JTweaks.Main.Util;

import com.JTweaks.Main.JTweaks;
import com.JTweaks.Main.OreGen;
import com.JTweaks.Main.Blocks.JBlocks;
import com.JTweaks.Main.Items.JItems;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class JRegistery {
	
    public static void init() {
    	
		GameRegistry.registerFuelHandler(new Fuel());
		GameRegistry.registerWorldGenerator(new OreGen(), 0);
		
		//Blocks
	    GameRegistry.registerBlock(JBlocks.BlockNetherOre, JBlocks.BlockNetherOre.getUnlocalizedName());
	    GameRegistry.registerBlock(JBlocks.BlockForgeAnvil, JBlocks.BlockForgeAnvil.getUnlocalizedName());
	    GameRegistry.registerBlock(JBlocks.BlockForge, JBlocks.BlockForge.getUnlocalizedName());

		//Items
//		GameRegistry.registerItem(ItemBackpack,ItemBackpack.getUnlocalizedName());
		
		GameRegistry.registerItem(JItems.ItemGuardMold, JItems.ItemGuardMold.getUnlocalizedName());
		GameRegistry.registerItem(JItems.ItemHiltMold, JItems.ItemHiltMold.getUnlocalizedName());
		GameRegistry.registerItem(JItems.ItemPommelMold, JItems.ItemPommelMold.getUnlocalizedName());
		GameRegistry.registerItem(JItems.ItemBladeMold, JItems.ItemBladeMold.getUnlocalizedName());
		
		GameRegistry.registerItem(JItems.ItemGuard, JItems.ItemGuard.getUnlocalizedName());
		GameRegistry.registerItem(JItems.ItemHilt, JItems.ItemHilt.getUnlocalizedName());
		GameRegistry.registerItem(JItems.ItemPommel, JItems.ItemPommel.getUnlocalizedName());
		GameRegistry.registerItem(JItems.ItemBlade, JItems.ItemBlade.getUnlocalizedName());
		
		GameRegistry.registerItem(JItems.ItemFlour, JItems.ItemFlour.getUnlocalizedName());
		GameRegistry.registerItem(JItems.ItemGlue, JItems.ItemGlue.getUnlocalizedName());
		GameRegistry.registerItem(JItems.ItemHammer, JItems.ItemHammer.getUnlocalizedName());
//		GameRegistry.registerItem(JItems.PortalStarter, JItems.PortalStarter.getUnlocalizedName());
		
		GameRegistry.registerItem(JItems.Staff, JItems.Staff.getUnlocalizedName());
		GameRegistry.registerItem(JItems.BlazeStaff, JItems.BlazeStaff.getUnlocalizedName());
		GameRegistry.registerItem(JItems.ObsidianRod, JItems.ObsidianRod.getUnlocalizedName());
		GameRegistry.registerItem(JItems.ObsidianStaff, JItems.ObsidianStaff.getUnlocalizedName());
		
    	//Scythe Heads
//    	GameRegistry.registerItem(JItems.NetherScytheHead, JItems.NetherScytheHead.getUnlocalizedName());
    	GameRegistry.registerItem(JItems.DiamondScytheHead, JItems.DiamondScytheHead.getUnlocalizedName());
    	GameRegistry.registerItem(JItems.GoldScytheHead, JItems.GoldScytheHead.getUnlocalizedName());
    	GameRegistry.registerItem(JItems.IronScytheHead, JItems.IronScytheHead.getUnlocalizedName());
    	GameRegistry.registerItem(JItems.StoneScytheHead, JItems.StoneScytheHead.getUnlocalizedName());
    	GameRegistry.registerItem(JItems.WoodScytheHead, JItems.WoodScytheHead.getUnlocalizedName());

    	//----------------------------------------------------------------------------------------
    	
		//Scythe Items
//    	GameRegistry.registerItem(JItems.NetherScythe, JItems.NetherScythe.getUnlocalizedName());
    	GameRegistry.registerItem(JItems.DiamondScythe, JItems.DiamondScythe.getUnlocalizedName());
    	GameRegistry.registerItem(JItems.GoldScythe, JItems.GoldScythe.getUnlocalizedName());
    	GameRegistry.registerItem(JItems.IronScythe, JItems.IronScythe.getUnlocalizedName());
    	GameRegistry.registerItem(JItems.StoneScythe, JItems.StoneScythe.getUnlocalizedName());
    	GameRegistry.registerItem(JItems.WoodScythe, JItems.WoodScythe.getUnlocalizedName());

    	//----------------------------------------------------------------------------------------
    	
//    	GameRegistry.registerItem(JItems.NetherBlazeScythe, JItems.NetherBlazeScythe.getUnlocalizedName());
    	GameRegistry.registerItem(JItems.DiamondBlazeScythe, JItems.DiamondBlazeScythe.getUnlocalizedName());
    	GameRegistry.registerItem(JItems.GoldBlazeScythe, JItems.GoldBlazeScythe.getUnlocalizedName());
    	GameRegistry.registerItem(JItems.IronBlazeScythe, JItems.IronBlazeScythe.getUnlocalizedName());
    	GameRegistry.registerItem(JItems.StoneBlazeScythe, JItems.StoneBlazeScythe.getUnlocalizedName());
    	GameRegistry.registerItem(JItems.WoodBlazeScythe, JItems.WoodBlazeScythe.getUnlocalizedName());
    	
    	//----------------------------------------------------------------------------------------
    	
//    	GameRegistry.registerItem(JItems.NetherObsidianScythe, JItems.NetherObsidianScythe.getUnlocalizedName());
    	GameRegistry.registerItem(JItems.DiamondObsidianScythe, JItems.DiamondObsidianScythe.getUnlocalizedName());
    	GameRegistry.registerItem(JItems.GoldObsidianScythe, JItems.GoldObsidianScythe.getUnlocalizedName());
    	GameRegistry.registerItem(JItems.IronObsidianScythe, JItems.IronObsidianScythe.getUnlocalizedName());
    	GameRegistry.registerItem(JItems.StoneObsidianScythe, JItems.StoneObsidianScythe.getUnlocalizedName());
    	GameRegistry.registerItem(JItems.WoodObsidianScythe, JItems.WoodObsidianScythe.getUnlocalizedName());
    	
    }
    
    public static void recipes() {
    	
		//Item Recipes
		GameRegistry.addShapelessRecipe(new ItemStack(JItems.ItemGlue, 4), new Object[]{Items.WATER_BUCKET, JItems.ItemFlour});
		GameRegistry.addShapelessRecipe(new ItemStack(JItems.ItemGuard), new Object[]{Items.IRON_INGOT, JItems.ItemGuardMold});
		GameRegistry.addShapelessRecipe(new ItemStack(JItems.ItemHilt), new Object[]{Items.IRON_INGOT, JItems.ItemHiltMold});
		GameRegistry.addShapelessRecipe(new ItemStack(JItems.ItemPommel), new Object[]{Items.IRON_INGOT, JItems.ItemPommelMold});
		GameRegistry.addShapelessRecipe(new ItemStack(JItems.ItemBlade), new Object[]{Items.IRON_INGOT, JItems.ItemBladeMold});
		
		GameRegistry.addRecipe(new ItemStack(JItems.Staff), new Object[]{
		    	"oox","oxo","xoo",'x', Items.STICK});
			
		GameRegistry.addRecipe(new ItemStack(JItems.BlazeStaff), new Object[]{
		    	"oox","oxo","xoo",'x', Items.BLAZE_ROD});
			
		GameRegistry.addRecipe(new ItemStack(JItems.ObsidianRod, 3), new Object[]{
		    	"ox","xo",'x', Blocks.OBSIDIAN});
			
		GameRegistry.addRecipe(new ItemStack(JItems.ObsidianStaff), new Object[]{
		    	"oox","oxo","xoo",'x', JItems.ObsidianRod});
		
    	//Heads
    	GameRegistry.addRecipe(new ItemStack(JItems.DiamondScytheHead), new Object[]{
    		"oox","xxo",'o', Items.DIAMOND});
    	
    	GameRegistry.addRecipe(new ItemStack(JItems.GoldScytheHead), new Object[]{
    		"oox","xxo",'o', Items.GOLD_INGOT});
    	
    	GameRegistry.addRecipe(new ItemStack(JItems.IronScytheHead), new Object[]{
    		"oox","xxo",'o', Items.IRON_INGOT});
    	
    	GameRegistry.addRecipe(new ItemStack(JItems.StoneScytheHead), new Object[]{
    		"oox","xxo",'o', Blocks.STONE});
    	
    	GameRegistry.addRecipe(new ItemStack(JItems.WoodScytheHead), new Object[]{
    		"oox","xxo",'o', Blocks.LOG, 'o', Blocks.LOG2});
		
		//Recipes----------------------------------------------------------------------
    	
    	GameRegistry.addRecipe(new ItemStack(JItems.DiamondScythe), new Object[]{
    		"ooz","os","x",'o', JItems.DiamondScytheHead, 'x', JItems.Staff, 's', JItems.ItemGlue});

    	GameRegistry.addRecipe(new ItemStack(JItems.GoldScythe), new Object[]{
    		"ooz","os","x",'o', JItems.GoldScytheHead, 'x', JItems.Staff, 's', JItems.ItemGlue});

    	GameRegistry.addRecipe(new ItemStack(JItems.IronScythe), new Object[]{
    		"ooz","os","x",'o', JItems.IronScytheHead, 'x', JItems.Staff, 's', JItems.ItemGlue});
    	
    	GameRegistry.addRecipe(new ItemStack(JItems.StoneScythe), new Object[]{
    		"ooz","os","x",'o', JItems.StoneScytheHead, 'x', JItems.Staff, 's', JItems.ItemGlue});
    	
    	GameRegistry.addRecipe(new ItemStack(JItems.WoodScythe), new Object[]{
    		"ooz","os","x",'o', JItems.WoodScytheHead, 'x', JItems.Staff, 's', JItems.ItemGlue});
    	
    	//----------------------------------------------------------------------------------------
    	
    	GameRegistry.addRecipe(new ItemStack(JItems.DiamondBlazeScythe), new Object[]{
    		"ooz","os","x",'o', JItems.DiamondScytheHead, 'x', JItems.BlazeStaff, 's', JItems.ItemGlue});

    	GameRegistry.addRecipe(new ItemStack(JItems.GoldBlazeScythe), new Object[]{
    		"ooz","os","x",'o', JItems.GoldScytheHead, 'x', JItems.BlazeStaff, 's', JItems.ItemGlue});

    	GameRegistry.addRecipe(new ItemStack(JItems.IronBlazeScythe), new Object[]{
    		"ooz","os","x",'o', JItems.IronScytheHead, 'x', JItems.BlazeStaff, 's', JItems.ItemGlue});
    	
    	GameRegistry.addRecipe(new ItemStack(JItems.StoneBlazeScythe), new Object[]{
    		"ooz","os","x",'o', JItems.StoneScytheHead, 'x', JItems.BlazeStaff, 's', JItems.ItemGlue});
    	
    	GameRegistry.addRecipe(new ItemStack(JItems.WoodBlazeScythe), new Object[]{
    		"ooz","os","x",'o', JItems.WoodScytheHead, 'x', JItems.BlazeStaff, 's', JItems.ItemGlue});
    	
    	//----------------------------------------------------------------------------------------
    	
    	GameRegistry.addRecipe(new ItemStack(JItems.DiamondObsidianScythe), new Object[]{
    		"ooz","os","x",'o', JItems.DiamondScytheHead, 'x', JItems.ObsidianStaff, 's', JItems.ItemGlue});

    	GameRegistry.addRecipe(new ItemStack(JItems.GoldObsidianScythe), new Object[]{
    		"ooz","os","x",'o', JItems.GoldScytheHead, 'x', JItems.ObsidianStaff, 's', JItems.ItemGlue});

    	GameRegistry.addRecipe(new ItemStack(JItems.IronObsidianScythe), new Object[]{
    		"ooz","os","x",'o', JItems.IronScytheHead, 'x', JItems.ObsidianStaff, 's', JItems.ItemGlue});
    	
    	GameRegistry.addRecipe(new ItemStack(JItems.StoneObsidianScythe), new Object[]{
    		"ooz","os","x",'o', JItems.StoneScytheHead, 'x', JItems.ObsidianStaff, 's', JItems.ItemGlue});
    	
    	GameRegistry.addRecipe(new ItemStack(JItems.WoodObsidianScythe), new Object[]{
    		"ooz","os","x",'o', JItems.WoodScytheHead, 'x', JItems.ObsidianStaff, 's', JItems.ItemGlue});
    }
}