package com.JTweaks.Main.Util;

import com.JTweaks.Main.Blocks.JBlocks;
import com.JTweaks.Main.Items.JItems;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class ModelRegistery {
	
	public static String MODID = Reference.MODID;

	public static void regI(Item item) {
	    Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(MODID + ":" + item.getUnlocalizedName().substring(8), "inventory"));
	}
	
	public static void regB(Block block) {
	    Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
	    .register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(MODID + ":" + block.getUnlocalizedName().substring(8), "inventory"));
	}

	
	public static void registerItemRenderer() {
	    regI(JItems.ItemPommel);
	}
	
	public static void registerBlockRenderer() {
	    regB(JBlocks.BlockForgeAnvil);
	}
}
