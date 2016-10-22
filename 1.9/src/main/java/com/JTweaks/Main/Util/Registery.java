package com.JTweaks.Main.Util;

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

public class Registery {
	
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
    }
    
    public static void recipes() {
    	
		//Item Recipes
		GameRegistry.addShapelessRecipe(new ItemStack(JItems.ItemGlue, 4), new Object[]{Items.water_bucket, JItems.ItemFlour});
		GameRegistry.addShapelessRecipe(new ItemStack(JItems.ItemGuard), new Object[]{Items.iron_ingot, JItems.ItemGuardMold});
		GameRegistry.addShapelessRecipe(new ItemStack(JItems.ItemHilt), new Object[]{Items.iron_ingot, JItems.ItemHiltMold});
		GameRegistry.addShapelessRecipe(new ItemStack(JItems.ItemPommel), new Object[]{Items.iron_ingot, JItems.ItemPommelMold});
		GameRegistry.addShapelessRecipe(new ItemStack(JItems.ItemBlade), new Object[]{Items.iron_ingot, JItems.ItemBladeMold});
		
		GameRegistry.addRecipe(new ItemStack(JItems.Staff), new Object[]{
		    	"oox","oxo","xoo",'x', Items.stick});
			
		GameRegistry.addRecipe(new ItemStack(JItems.BlazeStaff), new Object[]{
		    	"oox","oxo","xoo",'x', Items.blaze_rod});
			
		GameRegistry.addRecipe(new ItemStack(JItems.ObsidianRod, 3), new Object[]{
		    	"ox","xo",'x', Blocks.obsidian});
			
		GameRegistry.addRecipe(new ItemStack(JItems.ObsidianStaff), new Object[]{
		    	"oox","oxo","xoo",'x', JItems.ObsidianRod});
    }
    
	public static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getUnlocalizedName(), "inventory"));
	}
	
    public static void registerRenders() {
    	
    	//Items
    	registerRender(JItems.ItemPommel);
    }
		
    
    
}
