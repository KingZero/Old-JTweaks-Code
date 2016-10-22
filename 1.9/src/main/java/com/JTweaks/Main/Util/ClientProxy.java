package com.JTweaks.Main.Util;

import com.JTweaks.Main.JTweaks;
import com.JTweaks.Main.Blocks.Forge.Model.RenderModelNew;
import com.JTweaks.Main.Blocks.Forge.Model.TileEntityModelNew;
import com.JTweaks.Main.Items.Backpack.ContainerBackpack;
import com.JTweaks.Main.Items.Backpack.GuiBackpack;
import com.JTweaks.Main.Items.Backpack.InventoryBackpack;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.fml.client.registry.ClientRegistry;

public class ClientProxy extends CommonProxy {
	
	@Override
	public void registerRenders() {
		
	}
	
	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		return null;
	}
}