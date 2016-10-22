package com.JTweaks.Main;

import com.JTweaks.Main.Blocks.*;
import com.JTweaks.Main.Crops.*;
import com.JTweaks.Main.Items.*;

import net.minecraftforge.fml.relauncher.*;
import net.minecraftforge.fml.common.*;
import net.minecraftforge.fml.common.Mod.*;
import net.minecraftforge.fml.common.event.*;
import net.minecraftforge.fml.common.network.*;
import net.minecraftforge.fml.common.registry.*;
import net.minecraft.block.Block;
import net.minecraft.creativetab.*;
import net.minecraft.init.*;
import net.minecraft.item.*;
import net.minecraft.stats.*;

public class JMisc extends CreativeTabs {

	public JMisc(int par1 ,String par2) {
       super(par1, par2);
       }
   
	//Creative Tabs
	@SideOnly(Side.CLIENT)
	public Item getTabIconItem() {
		if (this == JTweaks.tabJBlocks)  return Items.baked_potato;//return Item.getItemFromBlock(JBlocks.BlockNetherOre);
		if (this == JTweaks.tabJCrops) return Items.baked_potato;// return JCrops.ItemRye;
		if (this == JTweaks.tabJItems) return Items.baked_potato;// return ItemStaffs.Staff;
		if (this == JTweaks.tabJMisc) return Items.baked_potato;// return JItems.ItemHammer;
		return Items.arrow;
		}
	@SideOnly(Side.CLIENT)
    public int getItemIconDamage() {
		if (this == JTweaks.tabJBlocks)  return 0;
		if (this == JTweaks.tabJCrops)  return 0;
		if (this == JTweaks.tabJItems)  return 0;
		if (this == JTweaks.tabJMisc)  return 0;
		return 0;
    }
}