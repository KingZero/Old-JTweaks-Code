package com.JTweaks.Main.Items;

import java.util.Vector;

import com.JTweaks.Main.*;

import cpw.mods.fml.common.registry.*;
import net.minecraft.block.material.*;
import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.*;
import net.minecraft.init.*;
import net.minecraft.item.*;
import net.minecraft.item.Item.*;
import net.minecraft.world.*;

public class ItemStaffs extends ItemSword {
    
	public ItemStaffs() {
		super(ToolMaterial.WOOD);
		setCreativeTab(JTweaks.tabJItems);
	}

	public static Item Staff = new ItemStaffs()
	.setUnlocalizedName(Reference.MODID + "." + "Staff")
	.setTextureName(Reference.MODID + ":" + "Staff");
	
	public static Item BlazeStaff = new ItemStaffs()
	.setUnlocalizedName(Reference.MODID + "." + "BlazeStaff")
	.setTextureName(Reference.MODID + ":" + "BlazeStaff");
	
	public static Item ObsidianRod = new Item()
	.setUnlocalizedName(Reference.MODID + "." + "ObsidianRod")
	.setCreativeTab(JTweaks.tabJItems)
	.setTextureName(Reference.MODID + ":" + "ObsidianRod");
	
	public static Item ObsidianStaff = new ItemStaffs()
	.setUnlocalizedName(Reference.MODID + "." + "ObsidianStaff")
	.setTextureName(Reference.MODID + ":" + "ObsidianStaff");
	
    public static void init() {
    	
	GameRegistry.registerItem(Staff, Staff.getUnlocalizedName());
	GameRegistry.registerItem(BlazeStaff, BlazeStaff.getUnlocalizedName());
	GameRegistry.registerItem(ObsidianRod, ObsidianRod.getUnlocalizedName());
	GameRegistry.registerItem(ObsidianStaff, ObsidianStaff.getUnlocalizedName());
    	
	GameRegistry.addRecipe(new ItemStack(ItemStaffs.Staff), new Object[]{
    	"oox",
    	"oxo",
    	"xoo",
    	'x', Items.stick});
	
	GameRegistry.addRecipe(new ItemStack(ItemStaffs.BlazeStaff), new Object[]{
    	"oox",
    	"oxo",
    	"xoo",
    	'x', Items.blaze_rod});
	
	GameRegistry.addRecipe(new ItemStack(ItemStaffs.ObsidianRod, 3), new Object[]{
    	"ox",
    	"xo",
    	'x', Blocks.obsidian});
	
	GameRegistry.addRecipe(new ItemStack(ItemStaffs.ObsidianStaff), new Object[]{
    	"oox",
    	"oxo",
    	"xoo",
    	'x', ItemStaffs.ObsidianRod});
    }
}
