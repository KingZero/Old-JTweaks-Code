package com.JTweaks.Main.Items;

import java.util.Vector;

import com.JTweaks.Main.*;

import net.minecraft.block.material.*;
import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.*;
import net.minecraft.init.*;
import net.minecraft.item.*;
import net.minecraft.item.Item.*;
import net.minecraft.world.*;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemStaffs extends ItemSword {
    
	public ItemStaffs() {
		super(ToolMaterial.WOOD);
		setCreativeTab(JTweaks.tabJItems);
	}
}
