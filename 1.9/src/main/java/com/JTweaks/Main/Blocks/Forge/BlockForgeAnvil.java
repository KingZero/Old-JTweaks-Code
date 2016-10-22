package com.JTweaks.Main.Blocks.Forge;

import java.util.*;

import com.JTweaks.Main.*;
import com.JTweaks.Main.Blocks.JBlocks;

import net.minecraftforge.fml.common.*;
import net.minecraftforge.fml.common.Mod.*;
import net.minecraftforge.fml.common.registry.*;
import net.minecraftforge.fml.common.event.*;
import net.minecraftforge.fml.common.network.*;
import net.minecraftforge.fml.relauncher.*;
import net.minecraft.block.*;
import net.minecraft.block.material.*;
import net.minecraft.client.*;
import net.minecraft.client.gui.inventory.*;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.texture.*;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.*;
import net.minecraft.entity.player.*;
import net.minecraft.init.*;
import net.minecraft.item.*;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.*;

public class BlockForgeAnvil extends BlockAnvil {

	public BlockForgeAnvil() {
		super();
        float f = 1F;
		this.setCreativeTab(JTweaks.tabJBlocks);
	}

    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int q, float i, float j, float k) {
		BlockPos Air = new BlockPos(x, y + 1, z);
		BlockPos i1 = new BlockPos(x + 1, y, z);
		BlockPos i2 = new BlockPos(x - 1, y, z);
		BlockPos i3 = new BlockPos(x, y, z + 1);
		BlockPos i4 = new BlockPos(x, y, z - 1);
    	
		if (!world.isRemote) {
			if (world.isAirBlock(Air)) {
				if ((world.getBlockState(i1).getBlock() != Blocks.lava) || 
						(world.getBlockState(i2).getBlock() != Blocks.lava) || 
						(world.getBlockState(i3).getBlock() != Blocks.lava) || 
						(world.getBlockState(i4).getBlock() != Blocks.lava) || 
						(world.getBlockState(i1).getBlock() != Blocks.fire) || 
						(world.getBlockState(i2).getBlock() != Blocks.fire) || 
						(world.getBlockState(i3).getBlock() != Blocks.fire) || 
						(world.getBlockState(i4).getBlock() != Blocks.fire)) {
    					if ((world.getBlockState(i1).getBlock() != JBlocks.BlockForgeAnvil) || 
    							(world.getBlockState(i2).getBlock() != JBlocks.BlockForgeAnvil) || 
    							(world.getBlockState(i3).getBlock() != JBlocks.BlockForgeAnvil) || 
    							(world.getBlockState(i4).getBlock() != JBlocks.BlockForgeAnvil)) {
    						if (!player.isSneaking()) {
    							player.openGui(JTweaks.instance, JTweaks.BlockGuiIndex, player.worldObj, 0, 0, 0);
    							return true;
    							} else {
    								return false;
    							}
    						}
    					}
					}
				}
			return false;
		}
    
    public void func_149828_a(World p1, BlockPos pos, int p5)
    {
        p1.playAuxSFX(1022, pos, 0);
    }
    
    public boolean renderAsNormalBlock()
    {
        return false;
    }

    public boolean isOpaqueCube()
    {
        return false;
    }
    
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item p_149666_1_, CreativeTabs p_149666_2_, List p_149666_3_)
    {
        p_149666_3_.add(new ItemStack(p_149666_1_, 1, 0));
    }
}