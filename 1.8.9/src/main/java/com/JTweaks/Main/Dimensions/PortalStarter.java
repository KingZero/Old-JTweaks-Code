package com.JTweaks.Main.Dimensions;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.JTweaks.Main.JTweaks;
import com.JTweaks.Main.Dimensions.Portals.Portal;

public class PortalStarter extends Item {
	
	public PortalStarter() {
		super();
		this.maxStackSize = 1;
		setMaxDamage(64);
		setCreativeTab(JTweaks.tabJMisc);
		}

	public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10) {
		if (par7 == 0)
		{
			par5--;
			}
		if (par7 == 1)
		{
			par5++;
			}
		if (par7 == 2)
		{
			par6--;
			}
		if (par7 == 3)
		{
			par6++;
			}
		if (par7 == 4)
		{
			par4--;
			}
		if (par7 == 5)
		{
			par4++;
			}
		if (!par2EntityPlayer.canPlayerEdit(par4, par5, par6, par7, par1ItemStack))
		{
			return false;
			}
		Block i1 = par3World.getBlock(par4, par5, par6);
		if (i1 == Blocks.air)
		{
			par3World.playSoundEffect(par4 + 0.5D, par5 + 0.5D, par6 + 0.5D, "fire.ignite", 1.0F, itemRand.nextFloat() * 0.4F + 0.8F);
			Portal.tryToCreatePortal(par3World, par4, par5, par6 );
			}
		par1ItemStack.damageItem(1, par2EntityPlayer);
		return true;
		}
	}
