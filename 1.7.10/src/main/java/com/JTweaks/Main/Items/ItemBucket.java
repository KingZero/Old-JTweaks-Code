package com.JTweaks.Main.Items;

import com.JTweaks.Main.Liquids.JLiquids;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemBucket {

	public boolean onItemUse(ItemStack itemStack, EntityPlayer entity, World world, int i, int j, int k, int l, float a, float b, float c){
		float var4 = 1.0F;
		if(true){
		world.setBlock(i, j, k, JLiquids.LiquidIron, 0, 2);
		}
		return false;
	}
}