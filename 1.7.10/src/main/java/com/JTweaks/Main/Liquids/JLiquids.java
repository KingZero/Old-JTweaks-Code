package com.JTweaks.Main.Liquids;

import com.JTweaks.Main.JTweaks;

import net.minecraft.block.*;
import cpw.mods.fml.common.registry.*;

public class JLiquids {
	
	public static Block LiquidIron = new LiquidIron.liquidIronFlowing()
	.setBlockName("Liquid Iron");
	
	public static Block LiquidIron2 = new LiquidIron.liquidIronStill()
	.setBlockName("Liquid Iron2");
	
    public static void init() {
    	
	GameRegistry.registerBlock(LiquidIron, "Liquid Iron");
	GameRegistry.registerBlock(LiquidIron2, "Still Liquid Iron");
	
	}
}
