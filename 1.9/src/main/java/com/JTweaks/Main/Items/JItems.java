package com.JTweaks.Main.Items;

import com.JTweaks.Main.*;
import com.JTweaks.Main.Items.Backpack.*;
import com.JTweaks.Main.Util.Reference;

import net.minecraft.block.Block;
import net.minecraft.client.*;
import net.minecraft.init.*;
import net.minecraft.item.*;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.*;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.registry.IForgeRegistryEntry;

public class JItems {
	
	public static Item Staff = new JItemClasses.ItemStaffs()
	.setUnlocalizedName("Staff");
	
	public static Item BlazeStaff = new JItemClasses.ItemStaffs()
	.setUnlocalizedName("BlazeStaff");

	
	public static Item ObsidianStaff = new JItemClasses.ItemStaffs()
	.setUnlocalizedName("ObsidianStaff");
	
	public static Item ObsidianRod = new Item()
	.setUnlocalizedName("ObsidianRod")
	.setCreativeTab(JTweaks.tabJItems);
	
/*	public static Item ItemBackpack = new ItemBackpack()
	.setUnlocalizedName("Backpack")
	.setCreativeTab(JTweaks.tabJMisc); */
	
	public static Item ItemGuardMold = new Item()
	.setUnlocalizedName("GuardMold")
	.setCreativeTab(JTweaks.tabJMisc);
	
	public static Item ItemHiltMold = new Item()
	.setUnlocalizedName("HiltMold")
	.setCreativeTab(JTweaks.tabJMisc);
	
	public static Item ItemPommelMold = new Item()
	.setUnlocalizedName("PommelMold")
	.setCreativeTab(JTweaks.tabJMisc);
	
	public static Item ItemBladeMold = new Item()
	.setUnlocalizedName(Reference.MODID + "." + "BladeMold")
	.setCreativeTab(JTweaks.tabJMisc);
	
	public static Item ItemGuard = new Item()
	.setUnlocalizedName("Guard")
	.setCreativeTab(JTweaks.tabJMisc);
	
	public static Item ItemHilt = new Item()
	.setUnlocalizedName("Hilt")
	.setCreativeTab(JTweaks.tabJMisc);
	
	public static Item ItemPommel = new Item()
	.setUnlocalizedName("Pommel")
	.setCreativeTab(JTweaks.tabJMisc);
	
	public static Item ItemBlade = new Item()
	.setUnlocalizedName("Blade")
	.setCreativeTab(JTweaks.tabJMisc);
	
	public static Item ItemFlour = new Item()
	.setUnlocalizedName("Flour")
	.setCreativeTab(JTweaks.tabJMisc);
	
	public static Item ItemGlue = new Item()
	.setUnlocalizedName("Glue")
	.setCreativeTab(JTweaks.tabJMisc);
	
	public static Item ItemHammer = new Item()
	.setUnlocalizedName("Hammer")
	.setCreativeTab(JTweaks.tabJMisc);
	
/*	public static Item PortalStarter = new PortalStarter()
	.setRegistryName(Reference.MODID , "PortalStarter")
	.setUnlocalizedName("PortalStarter")
	.setCreativeTab(JTweaks.tabJMisc); */
	
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
//		new ChestGenHooks("dungeonChest").addItem(new WeightedRandomChestContent(new ItemStack(PortalStarter), 1, 5, 10));
}
