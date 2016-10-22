package com.JTweaks.Main.Util;

import com.JTweaks.Main.Items.*;

import net.minecraftforge.fml.common.*;
import net.minecraftforge.fml.common.Mod.*;
import net.minecraftforge.fml.common.event.*;
import net.minecraftforge.fml.common.network.*;
import net.minecraftforge.fml.common.registry.*;
import net.minecraft.item.*;

public class Fuel implements IFuelHandler {

	@Override
	public int getBurnTime(ItemStack fuel) {
		if( fuel.getItem() == JItems.ItemHilt)
			return 200;
		else return 0;
	}
}
