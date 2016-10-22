package com.JTweaks.Main.Dimensions;

import com.JTweaks.Main.Blocks.*;
import com.JTweaks.Main.Dimensions.Portals.*;
import net.minecraft.block.*;
import net.minecraft.item.*;
import net.minecraftforge.common.*;
import cpw.mods.fml.common.registry.*;

public class Dimensions {
	
	public static int DIMID = 3;

    public static void init() {
    	
		DimensionManager.registerProviderType(DIMID, TestDimension.WorldProviderMod.class, false);
		DimensionManager.registerDimension(DIMID, DIMID);

		}
}
