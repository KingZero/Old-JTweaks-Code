package com.JTweaks.Main.Items;

import net.minecraft.item.Item;

import com.JTweaks.Main.JTweaks;

public class ItemScytheHead extends Item{
	
	public ItemScytheHead(Item.ToolMaterial par1) {
		super();
        maxStackSize = 1;
        setMaxDamage(par1.getMaxUses());
		setCreativeTab(JTweaks.tabJItems);
	}
}
