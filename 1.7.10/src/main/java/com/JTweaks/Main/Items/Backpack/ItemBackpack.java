package com.JTweaks.Main.Items.Backpack;

import java.util.List;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;

import com.JTweaks.Main.JTweaks;
import com.JTweaks.Main.Items.JItems;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemBackpack extends Item {

	public ItemBackpack() {
		super();
		setMaxStackSize(1);
		setCreativeTab(CreativeTabs.tabMisc);
	}

	public int getMaxItemUseDuration(ItemStack stack) {
		return 1;
	}

	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
		if (!world.isRemote) {
			if (!player.isSneaking()) {
				player.openGui(JTweaks.instance, JTweaks.ItemGuiIndex, player.worldObj, 0, 0, 0);
			} else {
//				new InventoryBackpack(player.getHeldItem()).setInventorySlotContents(0, new ItemStack(Items.diamond, 4));
				return null;
			}
		}
		return stack;
	}

	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4) {
		list.add(EnumChatFormatting.ITALIC + "");
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister) {
		itemIcon = iconRegister.registerIcon("tutorial:" + getUnlocalizedName().substring(5).toLowerCase());
	}
}