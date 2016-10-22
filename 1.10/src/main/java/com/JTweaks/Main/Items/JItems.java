package com.JTweaks.Main.Items;

import com.JTweaks.Main.*;
import com.JTweaks.Main.Items.Backpack.*;
import com.JTweaks.Main.Util.Reference;

import net.minecraft.block.Block;
import net.minecraft.client.*;
import net.minecraft.init.*;
import net.minecraft.item.*;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.*;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.registry.IForgeRegistryEntry;

public class JItems {
	
	public static Item Staff = new JItemClasses.ItemStaffs()
	.setUnlocalizedName(Reference.MODID + ":" + "Staff");
	
	public static Item BlazeStaff = new JItemClasses.ItemStaffs()
	.setUnlocalizedName(Reference.MODID + ":" + "BlazeStaff");

	
	public static Item ObsidianStaff = new JItemClasses.ItemStaffs()
	.setUnlocalizedName(Reference.MODID + ":" + "ObsidianStaff");
	
	public static Item ObsidianRod = new Item()
	.setUnlocalizedName(Reference.MODID + ":" + "ObsidianRod")
	.setCreativeTab(JTweaks.tabJItems);
	
	public static Item ItemGuardMold = new Item()
	.setUnlocalizedName(Reference.MODID + ":" + "GuardMold")
	.setCreativeTab(JTweaks.tabJMisc);
	
	public static Item ItemHiltMold = new Item()
	.setUnlocalizedName(Reference.MODID + ":" + "HiltMold")
	.setCreativeTab(JTweaks.tabJMisc);
	
	public static Item ItemPommelMold = new Item()
	.setUnlocalizedName(Reference.MODID + ":" + "PommelMold")
	.setCreativeTab(JTweaks.tabJMisc);
	
	public static Item ItemBladeMold = new Item()
	.setUnlocalizedName(Reference.MODID + "." + "BladeMold")
	.setCreativeTab(JTweaks.tabJMisc);
	
	public static Item ItemGuard = new Item()
	.setUnlocalizedName(Reference.MODID + ":" + "Guard")
	.setCreativeTab(JTweaks.tabJMisc);
	
	public static Item ItemHilt = new Item()
	.setUnlocalizedName(Reference.MODID + ":" + "Hilt")
	.setCreativeTab(JTweaks.tabJMisc);
	
	public static Item ItemPommel = new Item()
	.setUnlocalizedName("Pommel")
	.setCreativeTab(JTweaks.tabJMisc);
	
	public static Item ItemBlade = new Item()
	.setUnlocalizedName(Reference.MODID + ":" + "Blade")
	.setCreativeTab(JTweaks.tabJMisc);
	
	public static Item ItemFlour = new Item()
	.setUnlocalizedName(Reference.MODID + ":" + "Flour")
	.setCreativeTab(JTweaks.tabJMisc);
	
	public static Item ItemGlue = new Item()
	.setUnlocalizedName(Reference.MODID + ":" + "Glue")
	.setCreativeTab(JTweaks.tabJMisc);
	
	public static Item ItemHammer = new Item()
	.setUnlocalizedName(Reference.MODID + ":" + "Hammer")
	.setCreativeTab(JTweaks.tabJMisc);
	
	//public static Item PortalStarter = new PortalStarter().setRegistryName(Reference.MODID , "PortalStarter").setUnlocalizedName("PortalStarter").setCreativeTab(JTweaks.tabJMisc);
	
	//public static Item ItemBackpack = new ItemBackpack().setUnlocalizedName("Backpack").setCreativeTab(JTweaks.tabJMisc);
	
	//---------------------------------------------------------------------------------------- CONDENSE
	
	public static Item ItemScytheMold = new Item().setUnlocalizedName("ScytheMold");
			
	public static Item NetherScytheHead = new JItemClasses.ItemScytheHead(JTweaks.MaterialNether)
	.setUnlocalizedName("NetherScytheHead");
	
	public static Item DiamondScytheHead = new JItemClasses.ItemScytheHead(ToolMaterial.DIAMOND)
	.setUnlocalizedName("DiamondScytheHead");
	
	public static Item GoldScytheHead = new JItemClasses.ItemScytheHead(ToolMaterial.GOLD)
	.setUnlocalizedName("GoldScytheHead");
	
	public static Item IronScytheHead = new JItemClasses.ItemScytheHead(ToolMaterial.IRON)
	.setUnlocalizedName("IronScytheHead");
	
	public static Item StoneScytheHead = new JItemClasses.ItemScytheHead(ToolMaterial.STONE)
	.setUnlocalizedName("StoneScytheHead");
	
	public static Item WoodScytheHead = new JItemClasses.ItemScytheHead(ToolMaterial.WOOD)
	.setUnlocalizedName("WoodScytheHead");
	
	//----------------------------------------------------------------------------------------
	public static Item NetherScythe = new JItemClasses.ItemScythes(JTweaks.MaterialNether, 0, 0)
	.setUnlocalizedName("NetherScythe");
			
	public static Item DiamondScythe = new JItemClasses.ItemScythes(ToolMaterial.DIAMOND, 0, 0)
	.setUnlocalizedName("DiamondScythe");

	public static Item GoldScythe = new JItemClasses.ItemScythes(ToolMaterial.GOLD, 0, 0)
	.setUnlocalizedName("GoldScythe");
	
	public static Item IronScythe = new JItemClasses.ItemScythes(ToolMaterial.IRON, 0, 0)
	.setUnlocalizedName("IronScythe");
	
	public static Item StoneScythe = new JItemClasses.ItemScythes(ToolMaterial.STONE, 0, 0)
	.setUnlocalizedName("StoneScythe");
	
	public static Item WoodScythe = new JItemClasses.ItemScythes(ToolMaterial.WOOD, 0, 0)
	.setUnlocalizedName("WoodScythe");
			
	//----------------------------------------------------------------------------------------
    
	public static Item NetherBlazeScythe = new JItemClasses.ItemScythes(JTweaks.MaterialNether, 40, 0)
	.setUnlocalizedName("NetherBlazeScythe");
	
	public static Item DiamondBlazeScythe = new JItemClasses.ItemScythes(ToolMaterial.DIAMOND, 40, 0)
	.setUnlocalizedName("DiamondBlazeScythe");

	public static Item GoldBlazeScythe = new JItemClasses.ItemScythes(ToolMaterial.GOLD, 40, 0)
	.setUnlocalizedName("GoldBlazeScythe");
			
	public static Item IronBlazeScythe = new JItemClasses.ItemScythes(ToolMaterial.IRON, 40, 0)
	.setUnlocalizedName("IronBlazeScythe");
			
	public static Item StoneBlazeScythe = new JItemClasses.ItemScythes(ToolMaterial.STONE, 40, 0)
	.setUnlocalizedName("StoneBlazeScythe");
	
	public static Item WoodBlazeScythe = new JItemClasses.ItemScythes(ToolMaterial.WOOD, 40, 0)
	.setUnlocalizedName("WoodBlazeScythe");
	
	//----------------------------------------------------------------------------------------
	
	public static Item NetherObsidianScythe = new JItemClasses.ItemScythes(JTweaks.MaterialNether, 0, 1000)
	.setUnlocalizedName("NetherObsidianScythe");
	
	public static Item DiamondObsidianScythe = new JItemClasses.ItemScythes(ToolMaterial.DIAMOND, 0, 1000)
	.setUnlocalizedName("DiamondObsidianScythe");

	public static Item GoldObsidianScythe = new JItemClasses.ItemScythes(ToolMaterial.GOLD, 0, 1000)
	.setUnlocalizedName("GoldObsidianScythe");
	
	public static Item IronObsidianScythe = new JItemClasses.ItemScythes(ToolMaterial.IRON, 0, 1000)
	.setUnlocalizedName("IronObsidianScythe");
	
	public static Item StoneObsidianScythe = new JItemClasses.ItemScythes(ToolMaterial.STONE, 0, 1000)
	.setUnlocalizedName("StoneObsidianScythe");
	
	public static Item WoodObsidianScythe = new JItemClasses.ItemScythes(ToolMaterial.WOOD, 0, 1000)
	.setUnlocalizedName("WoodObsidianScythe");
	
}
