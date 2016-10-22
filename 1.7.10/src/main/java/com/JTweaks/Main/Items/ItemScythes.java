package com.JTweaks.Main.Items;

import com.JTweaks.Main.*;
import cpw.mods.fml.common.registry.*;
import net.minecraft.client.*;
import net.minecraft.creativetab.*;
import net.minecraft.init.*;
import net.minecraft.item.*;
import net.minecraft.item.Item.*;

public class ItemScythes extends ItemSword{
	
	protected float field_150934_a;
    public Item.ToolMaterial field_150933_b;

	public ItemScythes(Item.ToolMaterial par1, int par2, int par3) {
		super(par1);
		setItemEnchantability(par2);
		setMaxDamage(getMaxDamage() + par3);
        field_150933_b = par1;
        maxStackSize = 1;
        field_150934_a = 6.0F + par1.getDamageVsEntity();
		setCreativeTab(JTweaks.tabJItems);
		}
	
	public int setItemEnchantability(int i)
    {
		return (this.getItemEnchantability() + i);
    }
	
/*	public int setOblink()
    {
		return (this.getMaxDamage() + 45);
    }
	
	public int setObsidian()
    {
		return (this.getMaxDamage() + 500);
    } */
	
	public static Item ItemScytheMold = new Item()
	.setUnlocalizedName(Reference.MODID + "." + "ScytheMold")
	.setTextureName(Reference.MODID + ":" + "ScytheMold");
	
	public static Item NetherScytheHead = new ItemScytheHead(JTweaks.MaterialNether)
	.setUnlocalizedName(Reference.MODID + "." + "NetherScytheHead")
	.setTextureName(Reference.MODID + ":" + "NetherScytheHead");
	
	public static Item DiamondScytheHead = new ItemScytheHead(ToolMaterial.EMERALD)
	.setUnlocalizedName(Reference.MODID + "." + "DiamondScytheHead")
	.setTextureName(Reference.MODID + ":" + "DiamondScytheHead");
	
	public static Item GoldScytheHead = new ItemScytheHead(ToolMaterial.GOLD)
	.setUnlocalizedName(Reference.MODID + "." + "GoldScytheHead")
	.setTextureName(Reference.MODID + ":" + "GoldScytheHead");
	
	public static Item IronScytheHead = new ItemScytheHead(ToolMaterial.IRON)
	.setUnlocalizedName(Reference.MODID + "." + "IronScytheHead")
	.setTextureName(Reference.MODID + ":" + "IronScytheHead");
	
	public static Item StoneScytheHead = new ItemScytheHead(ToolMaterial.STONE)
	.setUnlocalizedName(Reference.MODID + "." + "StoneScytheHead")
	.setTextureName(Reference.MODID + ":" + "StoneScytheHead");
	
	public static Item WoodScytheHead = new ItemScytheHead(ToolMaterial.WOOD)
	.setUnlocalizedName(Reference.MODID + "." + "WoodScytheHead")
	.setTextureName(Reference.MODID + ":" + "WoodScytheHead");
	
	//----------------------------------------------------------------------------------------
	//----------------------------------------------------------------------------------------
	//----------------------------------------------------------------------------------------
	//----------------------------------------------------------------------------------------

	public static Item NetherScythe = new ItemScythes(JTweaks.MaterialNether, 0, 0)
	.setUnlocalizedName(Reference.MODID + "." + "NetherScythe")
	.setTextureName(Reference.MODID + ":" + "NetherScythe");
	
	public static Item DiamondScythe = new ItemScythes(ToolMaterial.EMERALD, 0, 0)
	.setUnlocalizedName(Reference.MODID + "." + "DiamondScythe")
	.setTextureName(Reference.MODID + ":" + "DiamondScythe");

	public static Item GoldScythe = new ItemScythes(ToolMaterial.GOLD, 0, 0)
	.setUnlocalizedName(Reference.MODID + "." + "GoldScythe")
	.setTextureName(Reference.MODID + ":" + "GoldScythe");
	
	public static Item IronScythe = new ItemScythes(ToolMaterial.IRON, 0, 0)
	.setUnlocalizedName(Reference.MODID + "." + "IronScythe")
	.setTextureName(Reference.MODID + ":" + "IronScythe");
	
	public static Item StoneScythe = new ItemScythes(ToolMaterial.STONE, 0, 0)
	.setUnlocalizedName(Reference.MODID + "." + "StoneScythe")
	.setTextureName(Reference.MODID + ":" + "StoneScythe");
	
	public static Item WoodScythe = new ItemScythes(ToolMaterial.WOOD, 0, 0)
	.setUnlocalizedName(Reference.MODID + "." + "WoodScythe")
	.setTextureName(Reference.MODID + ":" + "WoodScythe");
	
	//----------------------------------------------------------------------------------------
	//----------------------------------------------------------------------------------------
	//----------------------------------------------------------------------------------------
	//----------------------------------------------------------------------------------------
    
	public static Item NetherBlazeScythe = new ItemScythes(JTweaks.MaterialNether, 40, 0)
	.setUnlocalizedName(Reference.MODID + "." + "NetherBlazeScythe")
	.setTextureName(Reference.MODID + ":" + "NetherBlazeScythe");
	
	public static Item DiamondBlazeScythe = new ItemScythes(ToolMaterial.EMERALD, 40, 0)
	.setUnlocalizedName(Reference.MODID + "." + "DiamondBlazeScythe")
	.setTextureName(Reference.MODID + ":" + "DiamondBlazeScythe");

	public static Item GoldBlazeScythe = new ItemScythes(ToolMaterial.GOLD, 40, 0)
	.setUnlocalizedName(Reference.MODID + "." + "GoldBlazeScythe")
	.setTextureName(Reference.MODID + ":" + "GoldBlazeScythe");
	
	public static Item IronBlazeScythe = new ItemScythes(ToolMaterial.IRON, 40, 0)
	.setUnlocalizedName(Reference.MODID + "." + "IronBlazeScythe")
	.setTextureName(Reference.MODID + ":" + "IronBlazeScythe");
	
	public static Item StoneBlazeScythe = new ItemScythes(ToolMaterial.STONE, 40, 0)
	.setUnlocalizedName(Reference.MODID + "." + "StoneBlazeScythe")
	.setTextureName(Reference.MODID + ":" + "StoneBlazeScythe");
	
	public static Item WoodBlazeScythe = new ItemScythes(ToolMaterial.WOOD, 40, 0)
	.setUnlocalizedName(Reference.MODID + "." + "WoodBlazeScythe")
	.setTextureName(Reference.MODID + ":" + "WoodBlazeScythe");
	
	//----------------------------------------------------------------------------------------
	//----------------------------------------------------------------------------------------
	//----------------------------------------------------------------------------------------
	//----------------------------------------------------------------------------------------
	
	public static Item NetherObsidianScythe = new ItemScythes(JTweaks.MaterialNether, 0, 1000)
	.setUnlocalizedName(Reference.MODID + "." + "NetherObsidianScythe")
	.setTextureName(Reference.MODID + ":" + "NetherObsidianScythe");
	
	public static Item DiamondObsidianScythe = new ItemScythes(ToolMaterial.EMERALD, 0, 1000)
	.setUnlocalizedName(Reference.MODID + "." + "DiamondObsidianScythe")
	.setTextureName(Reference.MODID + ":" + "DiamondObsidianScythe");

	public static Item GoldObsidianScythe = new ItemScythes(ToolMaterial.GOLD, 0, 1000)
	.setUnlocalizedName(Reference.MODID + "." + "GoldObsidianScythe")
	.setTextureName(Reference.MODID + ":" + "GoldObsidianScythe");
	
	public static Item IronObsidianScythe = new ItemScythes(ToolMaterial.IRON, 0, 1000)
	.setUnlocalizedName(Reference.MODID + "." + "IronObsidianScythe")
	.setTextureName(Reference.MODID + ":" + "IronObsidianScythe");
	
	public static Item StoneObsidianScythe = new ItemScythes(ToolMaterial.STONE, 0, 1000)
	.setUnlocalizedName(Reference.MODID + "." + "StoneObsidianScythe")
	.setTextureName(Reference.MODID + ":" + "StoneObsidianScythe");
	
	public static Item WoodObsidianScythe = new ItemScythes(ToolMaterial.WOOD, 0, 1000)
	.setUnlocalizedName(Reference.MODID + "." + "WoodObsidianScythe")
	.setTextureName(Reference.MODID + ":" + "WoodObsidianScythe");
	
    public static void init() {
    	
    	
    	//Heads
//    	GameRegistry.registerItem(NetherScytheHead, NetherScytheHead.getUnlocalizedName());
    	GameRegistry.registerItem(DiamondScytheHead, DiamondScytheHead.getUnlocalizedName());
    	GameRegistry.registerItem(GoldScytheHead, GoldScytheHead.getUnlocalizedName());
    	GameRegistry.registerItem(IronScytheHead, IronScytheHead.getUnlocalizedName());
    	GameRegistry.registerItem(StoneScytheHead, StoneScytheHead.getUnlocalizedName());
    	GameRegistry.registerItem(WoodScytheHead, WoodScytheHead.getUnlocalizedName());

    	//----------------------------------------------------------------------------------------
    	
		//Items
//    	GameRegistry.registerItem(NetherScythe, NetherScythe.getUnlocalizedName());
    	GameRegistry.registerItem(DiamondScythe, DiamondScythe.getUnlocalizedName());
    	GameRegistry.registerItem(GoldScythe, GoldScythe.getUnlocalizedName());
    	GameRegistry.registerItem(IronScythe, IronScythe.getUnlocalizedName());
    	GameRegistry.registerItem(StoneScythe, StoneScythe.getUnlocalizedName());
    	GameRegistry.registerItem(WoodScythe, WoodScythe.getUnlocalizedName());

    	//----------------------------------------------------------------------------------------
    	
//    	GameRegistry.registerItem(NetherBlazeScythe, NetherBlazeScythe.getUnlocalizedName());
    	GameRegistry.registerItem(DiamondBlazeScythe, DiamondBlazeScythe.getUnlocalizedName());
    	GameRegistry.registerItem(GoldBlazeScythe, GoldBlazeScythe.getUnlocalizedName());
    	GameRegistry.registerItem(IronBlazeScythe, IronBlazeScythe.getUnlocalizedName());
    	GameRegistry.registerItem(StoneBlazeScythe, StoneBlazeScythe.getUnlocalizedName());
    	GameRegistry.registerItem(WoodBlazeScythe, WoodBlazeScythe.getUnlocalizedName());
    	
    	//----------------------------------------------------------------------------------------
    	
//    	GameRegistry.registerItem(NetherObsidianScythe, NetherObsidianScythe.getUnlocalizedName());
    	GameRegistry.registerItem(DiamondObsidianScythe, DiamondObsidianScythe.getUnlocalizedName());
    	GameRegistry.registerItem(GoldObsidianScythe, GoldObsidianScythe.getUnlocalizedName());
    	GameRegistry.registerItem(IronObsidianScythe, IronObsidianScythe.getUnlocalizedName());
    	GameRegistry.registerItem(StoneObsidianScythe, StoneObsidianScythe.getUnlocalizedName());
    	GameRegistry.registerItem(WoodObsidianScythe, WoodObsidianScythe.getUnlocalizedName());
    	
    	//----------------------------------------------------------------------------------------
    	
    	//Heads
    	GameRegistry.addRecipe(new ItemStack(DiamondScytheHead), new Object[]{
    		"oox",
    		"xxo",
    		'o', Items.diamond});
    	
    	GameRegistry.addRecipe(new ItemStack(GoldScytheHead), new Object[]{
    		"oox",
    		"xxo",
    		'o', Items.gold_ingot});
    	
    	GameRegistry.addRecipe(new ItemStack(IronScytheHead), new Object[]{
    		"oox",
    		"xxo",
    		'o', Items.iron_ingot});
    	
    	GameRegistry.addRecipe(new ItemStack(StoneScytheHead), new Object[]{
    		"oox",
    		"xxo",
    		'o', Blocks.stone});
    	
    	GameRegistry.addRecipe(new ItemStack(WoodScytheHead), new Object[]{
    		"oox",
    		"xxo",
    		'o', Blocks.log, 'o', Blocks.log2});
		
		//Recipes----------------------------------------------------------------------
    	
    	GameRegistry.addRecipe(new ItemStack(ItemScythes.DiamondScythe), new Object[]{
    		"ooz",
    		"os",
    		"x",
    		'o', DiamondScytheHead, 'x', ItemStaffs.Staff, 's', JItems.ItemGlue});

    	GameRegistry.addRecipe(new ItemStack(ItemScythes.GoldScythe), new Object[]{
    		"ooz",
    		"os",
    		"x",
    		'o', GoldScytheHead, 'x', ItemStaffs.Staff, 's', JItems.ItemGlue});

    	GameRegistry.addRecipe(new ItemStack(ItemScythes.IronScythe), new Object[]{
    		"ooz",
    		"os",
    		"x",
    		'o', IronScytheHead, 'x', ItemStaffs.Staff, 's', JItems.ItemGlue});
    	
    	GameRegistry.addRecipe(new ItemStack(ItemScythes.StoneScythe), new Object[]{
    		"ooz",
    		"os",
    		"x",
    		'o', StoneScytheHead, 'x', ItemStaffs.Staff, 's', JItems.ItemGlue});
    	
    	GameRegistry.addRecipe(new ItemStack(ItemScythes.WoodScythe), new Object[]{
    		"ooz",
    		"os",
    		"x",
    		'o', WoodScytheHead, 'x', ItemStaffs.Staff, 's', JItems.ItemGlue});
    	
    	//----------------------------------------------------------------------------------------
    	
    	GameRegistry.addRecipe(new ItemStack(ItemScythes.DiamondBlazeScythe), new Object[]{
    		"ooz",
    		"os",
    		"x",
    		'o', DiamondScytheHead, 'x', ItemStaffs.BlazeStaff, 's', JItems.ItemGlue});

    	GameRegistry.addRecipe(new ItemStack(ItemScythes.GoldBlazeScythe), new Object[]{
    		"ooz",
    		"os",
    		"x",
    		'o', GoldScytheHead, 'x', ItemStaffs.BlazeStaff, 's', JItems.ItemGlue});

    	GameRegistry.addRecipe(new ItemStack(ItemScythes.IronBlazeScythe), new Object[]{
    		"ooz",
    		"os",
    		"x",
    		'o', IronScytheHead, 'x', ItemStaffs.BlazeStaff, 's', JItems.ItemGlue});
    	
    	GameRegistry.addRecipe(new ItemStack(ItemScythes.StoneBlazeScythe), new Object[]{
    		"ooz",
    		"os",
    		"x",
    		'o', StoneScytheHead, 'x', ItemStaffs.BlazeStaff, 's', JItems.ItemGlue});
    	
    	GameRegistry.addRecipe(new ItemStack(ItemScythes.WoodBlazeScythe), new Object[]{
    		"ooz",
    		"os",
    		"x",
    		'o', WoodScytheHead, 'x', ItemStaffs.BlazeStaff, 's', JItems.ItemGlue});
    	
    	//----------------------------------------------------------------------------------------
    	
    	GameRegistry.addRecipe(new ItemStack(ItemScythes.DiamondObsidianScythe), new Object[]{
    		"ooz",
    		"os",
    		"x",
    		'o', DiamondScytheHead, 'x', ItemStaffs.ObsidianStaff, 's', JItems.ItemGlue});

    	GameRegistry.addRecipe(new ItemStack(ItemScythes.GoldObsidianScythe), new Object[]{
    		"ooz",
    		"os",
    		"x",
    		'o', GoldScytheHead, 'x', ItemStaffs.ObsidianStaff, 's', JItems.ItemGlue});

    	GameRegistry.addRecipe(new ItemStack(ItemScythes.IronObsidianScythe), new Object[]{
    		"ooz",
    		"os",
    		"x",
    		'o', IronScytheHead, 'x', ItemStaffs.ObsidianStaff, 's', JItems.ItemGlue});
    	
    	GameRegistry.addRecipe(new ItemStack(ItemScythes.StoneObsidianScythe), new Object[]{
    		"ooz",
    		"os",
    		"x",
    		'o', StoneScytheHead, 'x', ItemStaffs.ObsidianStaff, 's', JItems.ItemGlue});
    	
    	GameRegistry.addRecipe(new ItemStack(ItemScythes.WoodObsidianScythe), new Object[]{
    		"ooz",
    		"os",
    		"x",
    		'o', WoodScytheHead, 'x', ItemStaffs.ObsidianStaff, 's', JItems.ItemGlue});

	}
}