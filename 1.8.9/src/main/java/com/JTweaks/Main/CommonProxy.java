package com.JTweaks.Main;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

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

