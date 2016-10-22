package com.JTweaks.Main.Util;

import com.JTweaks.Main.Blocks.Forge.*;
import com.JTweaks.Main.Items.*;
import com.JTweaks.Main.Items.Backpack.*;

import net.minecraft.client.renderer.tileentity.*;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.*;

public class CommonProxy implements IGuiHandler {
	
	public void registerRenders() {
		
	}
	
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		return null;
	}
}