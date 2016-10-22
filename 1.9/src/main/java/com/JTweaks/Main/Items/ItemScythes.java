package com.JTweaks.Main.Items;

import com.JTweaks.Main.*;
import net.minecraft.client.*;
import net.minecraft.creativetab.*;
import net.minecraft.init.*;
import net.minecraft.item.*;
import net.minecraft.item.Item.*;
import net.minecraftforge.fml.common.registry.*;

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
	.setUnlocalizedName("ScytheMold");
	
	public static Item NetherScytheHead = new ItemScytheHead(JTweaks.MaterialNether)
	.setUnlocalizedName("NetherScytheHead");
	
	public static Item DiamondScytheHead = new ItemScytheHead(ToolMaterial.DIAMOND)
	.setUnlocalizedName("DiamondScytheHead");
	
	public static Item GoldScytheHead = new ItemScytheHead(ToolMaterial.GOLD)
	.setUnlocalizedName("GoldScytheHead");
	
	public static Item IronScytheHead = new ItemScytheHead(ToolMaterial.IRON)
	.setUnlocalizedName("IronScytheHead");
	
	public static Item StoneScytheHead = new ItemScytheHead(ToolMaterial.STONE)
	.setUnlocalizedName("StoneScytheHead");
	
	public static Item WoodScytheHead = new ItemScytheHead(ToolMaterial.WOOD)
	.setUnlocalizedName("WoodScytheHead");
	
	//----------------------------------------------------------------------------------------

	public static Item NetherScythe = new ItemScythes(JTweaks.MaterialNether, 0, 0)
	.setUnlocalizedName("NetherScythe");
	
	public static Item DiamondScythe = new ItemScythes(ToolMaterial.DIAMOND, 0, 0)
	.setUnlocalizedName("DiamondScythe");

	public static Item GoldScythe = new ItemScythes(ToolMaterial.GOLD, 0, 0)
	.setUnlocalizedName("GoldScythe");
	
	public static Item IronScythe = new ItemScythes(ToolMaterial.IRON, 0, 0)
	.setUnlocalizedName("IronScythe");
	
	public static Item StoneScythe = new ItemScythes(ToolMaterial.STONE, 0, 0)
	.setUnlocalizedName("StoneScythe");
	
	public static Item WoodScythe = new ItemScythes(ToolMaterial.WOOD, 0, 0)
	.setUnlocalizedName("WoodScythe");
	
	//----------------------------------------------------------------------------------------
    
	public static Item NetherBlazeScythe = new ItemScythes(JTweaks.MaterialNether, 40, 0)
	.setUnlocalizedName("NetherBlazeScythe");
	
	public static Item DiamondBlazeScythe = new ItemScythes(ToolMaterial.DIAMOND, 40, 0)
	.setUnlocalizedName("DiamondBlazeScythe");

	public static Item GoldBlazeScythe = new ItemScythes(ToolMaterial.GOLD, 40, 0)
	.setUnlocalizedName("GoldBlazeScythe");
	
	public static Item IronBlazeScythe = new ItemScythes(ToolMaterial.IRON, 40, 0)
	.setUnlocalizedName("IronBlazeScythe");
	
	public static Item StoneBlazeScythe = new ItemScythes(ToolMaterial.STONE, 40, 0)
	.setUnlocalizedName("StoneBlazeScythe");
	
	public static Item WoodBlazeScythe = new ItemScythes(ToolMaterial.WOOD, 40, 0)
	.setUnlocalizedName("WoodBlazeScythe");
	
	//----------------------------------------------------------------------------------------
	
	public static Item NetherObsidianScythe = new ItemScythes(JTweaks.MaterialNether, 0, 1000)
	.setUnlocalizedName("NetherObsidianScythe");
	
	public static Item DiamondObsidianScythe = new ItemScythes(ToolMaterial.DIAMOND, 0, 1000)
	.setUnlocalizedName("DiamondObsidianScythe");

	public static Item GoldObsidianScythe = new ItemScythes(ToolMaterial.GOLD, 0, 1000)
	.setUnlocalizedName("GoldObsidianScythe");
	
	public static Item IronObsidianScythe = new ItemScythes(ToolMaterial.IRON, 0, 1000)
	.setUnlocalizedName("IronObsidianScythe");
	
	public static Item StoneObsidianScythe = new ItemScythes(ToolMaterial.STONE, 0, 1000)
	.setUnlocalizedName("StoneObsidianScythe");
	
	public static Item WoodObsidianScythe = new ItemScythes(ToolMaterial.WOOD, 0, 1000)
	.setUnlocalizedName("WoodObsidianScythe");
	
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
    		"oox","xxo",'o', Items.diamond});
    	
    	GameRegistry.addRecipe(new ItemStack(GoldScytheHead), new Object[]{
    		"oox","xxo",'o', Items.gold_ingot});
    	
    	GameRegistry.addRecipe(new ItemStack(IronScytheHead), new Object[]{
    		"oox","xxo",'o', Items.iron_ingot});
    	
    	GameRegistry.addRecipe(new ItemStack(StoneScytheHead), new Object[]{
    		"oox","xxo",'o', Blocks.stone});
    	
    	GameRegistry.addRecipe(new ItemStack(WoodScytheHead), new Object[]{
    		"oox","xxo",'o', Blocks.log, 'o', Blocks.log2});
		
		//Recipes----------------------------------------------------------------------
    	
    	GameRegistry.addRecipe(new ItemStack(ItemScythes.DiamondScythe), new Object[]{
    		"ooz","os","x",'o', DiamondScytheHead, 'x', JItems.Staff, 's', JItems.ItemGlue});

    	GameRegistry.addRecipe(new ItemStack(ItemScythes.GoldScythe), new Object[]{
    		"ooz","os","x",'o', GoldScytheHead, 'x', JItems.Staff, 's', JItems.ItemGlue});

    	GameRegistry.addRecipe(new ItemStack(ItemScythes.IronScythe), new Object[]{
    		"ooz","os","x",'o', IronScytheHead, 'x', JItems.Staff, 's', JItems.ItemGlue});
    	
    	GameRegistry.addRecipe(new ItemStack(ItemScythes.StoneScythe), new Object[]{
    		"ooz","os","x",'o', StoneScytheHead, 'x', JItems.Staff, 's', JItems.ItemGlue});
    	
    	GameRegistry.addRecipe(new ItemStack(ItemScythes.WoodScythe), new Object[]{
    		"ooz","os","x",'o', WoodScytheHead, 'x', JItems.Staff, 's', JItems.ItemGlue});
    	
    	//----------------------------------------------------------------------------------------
    	
    	GameRegistry.addRecipe(new ItemStack(ItemScythes.DiamondBlazeScythe), new Object[]{
    		"ooz","os","x",'o', DiamondScytheHead, 'x', JItems.BlazeStaff, 's', JItems.ItemGlue});

    	GameRegistry.addRecipe(new ItemStack(ItemScythes.GoldBlazeScythe), new Object[]{
    		"ooz","os","x",'o', GoldScytheHead, 'x', JItems.BlazeStaff, 's', JItems.ItemGlue});

    	GameRegistry.addRecipe(new ItemStack(ItemScythes.IronBlazeScythe), new Object[]{
    		"ooz","os","x",'o', IronScytheHead, 'x', JItems.BlazeStaff, 's', JItems.ItemGlue});
    	
    	GameRegistry.addRecipe(new ItemStack(ItemScythes.StoneBlazeScythe), new Object[]{
    		"ooz","os","x",'o', StoneScytheHead, 'x', JItems.BlazeStaff, 's', JItems.ItemGlue});
    	
    	GameRegistry.addRecipe(new ItemStack(ItemScythes.WoodBlazeScythe), new Object[]{
    		"ooz","os","x",'o', WoodScytheHead, 'x', JItems.BlazeStaff, 's', JItems.ItemGlue});
    	
    	//----------------------------------------------------------------------------------------
    	
    	GameRegistry.addRecipe(new ItemStack(ItemScythes.DiamondObsidianScythe), new Object[]{
    		"ooz","os","x",'o', DiamondScytheHead, 'x', JItems.ObsidianStaff, 's', JItems.ItemGlue});

    	GameRegistry.addRecipe(new ItemStack(ItemScythes.GoldObsidianScythe), new Object[]{
    		"ooz","os","x",'o', GoldScytheHead, 'x', JItems.ObsidianStaff, 's', JItems.ItemGlue});

    	GameRegistry.addRecipe(new ItemStack(ItemScythes.IronObsidianScythe), new Object[]{
    		"ooz","os","x",'o', IronScytheHead, 'x', JItems.ObsidianStaff, 's', JItems.ItemGlue});
    	
    	GameRegistry.addRecipe(new ItemStack(ItemScythes.StoneObsidianScythe), new Object[]{
    		"ooz","os","x",'o', StoneScytheHead, 'x', JItems.ObsidianStaff, 's', JItems.ItemGlue});
    	
    	GameRegistry.addRecipe(new ItemStack(ItemScythes.WoodObsidianScythe), new Object[]{
    		"ooz","os","x",'o', WoodScytheHead, 'x', JItems.ObsidianStaff, 's', JItems.ItemGlue});

	}
}