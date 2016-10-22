package com.JTweaks.Main.Dimensions;

import net.minecraftforge.common.DimensionManager;

public class Dimensions {
	
	public static int DIMID = 3;

    public static void init() {
    	
		DimensionManager.registerProviderType(DIMID, TestDimension.WorldProviderMod.class, false);
		DimensionManager.registerDimension(DIMID, DIMID);

		}
}
