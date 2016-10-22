package com.JTweaks.Main;

import com.JTweaks.Main.Items.*;

import cpw.mods.fml.common.*;
import cpw.mods.fml.common.Mod.*;
import cpw.mods.fml.common.event.*;
import cpw.mods.fml.common.registry.*;
import net.minecraft.item.*;

public class Fuel implements IFuelHandler {

	@Override
	public int getBurnTime(ItemStack fuel) {
		if( fuel.getItem() == JItems.ItemBackpack)
			return 200;
		else return 0;
	}
}
