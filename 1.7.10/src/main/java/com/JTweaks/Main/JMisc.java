package com.JTweaks.Main;

import com.JTweaks.Main.Blocks.*;
import com.JTweaks.Main.Crops.*;
import com.JTweaks.Main.Items.*;
import cpw.mods.fml.common.gameevent.PlayerEvent.*;
import cpw.mods.fml.relauncher.*;
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
		if (this == JTweaks.tabJBlocks)  return Item.getItemFromBlock(JBlocks.BlockNetherOre);
		if (this == JTweaks.tabJCrops)  return JCrops.ItemRye;
		if (this == JTweaks.tabJItems)  return ItemStaffs.Staff;
		if (this == JTweaks.tabJMisc)  return JItems.ItemHammer;
		return null;
		}
}