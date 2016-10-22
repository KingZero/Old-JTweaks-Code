package com.JTweaks.Main;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;
import com.JTweaks.Main.Items.JItems;

public class Fuel implements IFuelHandler {

	@Override
	public int getBurnTime(ItemStack fuel) {
		if( fuel.getItem() == JItems.ItemBackpack)
			return 200;
		else return 0;
	}
}
