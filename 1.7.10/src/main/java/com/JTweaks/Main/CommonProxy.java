package com.JTweaks.Main;

import com.JTweaks.Main.Blocks.Forge.*;
import com.JTweaks.Main.Items.*;
import com.JTweaks.Main.Items.Backpack.*;

import net.minecraft.client.renderer.tileentity.*;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.event.*;
import cpw.mods.fml.common.network.IGuiHandler;

public class CommonProxy implements IGuiHandler {
	
	public void registerRender(){}
	
	@Override
	public Object getServerGuiElement(int guiId, EntityPlayer player, World world, int x, int y, int z) {
		return null;
		}

	@Override
	public Object getClientGuiElement(int arg0, EntityPlayer arg1, World arg2, int arg3, int arg4, int arg5) {
		return null;
	}
}

