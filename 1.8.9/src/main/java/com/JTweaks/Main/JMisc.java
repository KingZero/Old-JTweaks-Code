package com.JTweaks.Main;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import com.JTweaks.Main.Blocks.JBlocks;
import com.JTweaks.Main.Crops.JCrops;
import com.JTweaks.Main.Items.ItemStaffs;
import com.JTweaks.Main.Items.JItems;

public class JMisc extends CreativeTabs {

	public JMisc(int par1 ,String par2) {
       super(par1, par2);
       }
   
	//Creative Tabs
	@SideOnly(Side.CLIENT)
	public Item getTabIconItem() {
		if (this == JTweaks.tabJBlocks)  return Item.getItemFromBlock(JBlocks.BlockNetherOre);
		if (this == JTweaks.tabJCrops)  return JCrops.ItemRye;
		if (this == JTweaks.tabJItems)  return ItemStaffs.Staff;
		if (this == JTweaks.tabJMisc)  return JItems.ItemHammer;
		return null;
		}
}