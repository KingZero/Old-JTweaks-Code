package com.JTweaks.Main.Items;

import java.util.Set;

import net.minecraft.init.*;
import net.minecraft.item.*;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item.*;

import com.JTweaks.Main.*;

public class ItemScytheHead extends Item{
	
	public ItemScytheHead(Item.ToolMaterial par1) {
		super();
        maxStackSize = 1;
        setMaxDamage(par1.getMaxUses());
		setCreativeTab(JTweaks.tabJItems);
	}
}
