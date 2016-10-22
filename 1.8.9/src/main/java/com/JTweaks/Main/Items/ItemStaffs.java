package com.JTweaks.Main.Items;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.JTweaks.Main.JTweaks;
import com.JTweaks.Main.Reference;

public class ItemStaffs extends ItemSword {
    
	public ItemStaffs() {
		super(ToolMaterial.WOOD);
		setCreativeTab(JTweaks.tabJItems);
	}

	public static Item Staff = new ItemStaffs()
	.setUnlocalizedName(Reference.MODID + "." + "Staff");
	
	public static Item BlazeStaff = new ItemStaffs()
	.setUnlocalizedName(Reference.MODID + "." + "BlazeStaff");
	
	public static Item ObsidianRod = new Item()
	.setUnlocalizedName(Reference.MODID + "." + "ObsidianRod")
	.setCreativeTab(JTweaks.tabJItems);
	
	public static Item ObsidianStaff = new ItemStaffs()
	.setUnlocalizedName(Reference.MODID + "." + "ObsidianStaff");
	
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
