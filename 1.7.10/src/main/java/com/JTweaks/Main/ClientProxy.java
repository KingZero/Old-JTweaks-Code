package com.JTweaks.Main;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

import com.JTweaks.Main.Blocks.Forge.Model.RenderModelNew;
import com.JTweaks.Main.Blocks.Forge.Model.TileEntityModelNew;
import com.JTweaks.Main.Items.Backpack.ContainerBackpack;
import com.JTweaks.Main.Items.Backpack.GuiBackpack;
import com.JTweaks.Main.Items.Backpack.InventoryBackpack;
import com.JTweaks.Main.CommonProxy;

import cpw.mods.fml.client.registry.ClientRegistry;

public class ClientProxy extends CommonProxy{
	
	public void registerRender(){
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityModelNew.class, new RenderModelNew());
	}
	
	@Override
	public Object getClientGuiElement(int guiId, EntityPlayer player, World world, int x, int y, int z) {
		if (guiId == JTweaks.ItemBackpackGui) {
			return new GuiBackpack((ContainerBackpack) new ContainerBackpack(player, player.inventory, new InventoryBackpack(player.getHeldItem())));
			}
		return null;
		}
}

