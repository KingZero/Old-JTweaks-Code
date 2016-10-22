package com.JTweaks.Main.Util;

import com.JTweaks.Main.Items.JItems;

import net.minecraft.client.*;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.block.model.*;
import net.minecraft.item.*;

public class ItemTextures {
	
	public static String modid = Reference.MODID;

	public static void registerItemRenderer() {
	    reg(JItems.ItemPommel);
	}

	public static void reg(Item item) {
	    Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
	    .register(item, 0, new ModelResourceLocation(modid + "." + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
