package com.JTweaks.Main.Liquids;

import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class JLiquids {
	
	public static Block LiquidIron = new LiquidIron.liquidIronFlowing()
	.setUnlocalizedName("Liquid Iron");
	
	public static Block LiquidIron2 = new LiquidIron.liquidIronStill()
	.setUnlocalizedName("Liquid Iron2");
	
    public static void init() {
    	
	GameRegistry.registerBlock(LiquidIron, "Liquid Iron");
	GameRegistry.registerBlock(LiquidIron2, "Still Liquid Iron");
	
	}
}
