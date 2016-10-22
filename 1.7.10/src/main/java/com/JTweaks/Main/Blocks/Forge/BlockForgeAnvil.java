package com.JTweaks.Main.Blocks.Forge;

import java.util.*;

import com.JTweaks.Main.*;
import com.JTweaks.Main.Blocks.JBlocks;

import cpw.mods.fml.common.registry.*;
import cpw.mods.fml.common.*;
import cpw.mods.fml.relauncher.*;
import net.minecraft.block.*;
import net.minecraft.block.material.*;
import net.minecraft.client.*;
import net.minecraft.client.gui.inventory.*;
import net.minecraft.client.renderer.texture.*;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.*;
import net.minecraft.entity.player.*;
import net.minecraft.init.*;
import net.minecraft.item.*;
import net.minecraft.util.*;
import net.minecraft.world.*;

public class BlockForgeAnvil extends BlockAnvil {
	
    public IIcon[] icons = new IIcon[6];

	public BlockForgeAnvil() {
		super();
        float f = 1F;
		this.setCreativeTab(JTweaks.tabJBlocks);
	}
	
	
    @Override
    public void registerBlockIcons(IIconRegister reg) {
        for (int i = 0; i < 6; i ++) {
            this.icons[i] = reg.registerIcon(JBlocks.BlockForge + "." + i);
        }
    }
    
    @Override
    public IIcon getIcon(int side, int meta) {
        return this.icons[side];
    }

    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int q, float i, float j, float k) {
		if (!world.isRemote) {
			if (world.isAirBlock(x, y + 1, z)) {
				if ((world.getBlock(x + 1, y, z) != Blocks.lava) || 
						(world.getBlock(x - 1, y, z) != Blocks.lava) || 
						(world.getBlock(x, y, z + 1) != Blocks.lava) || 
						(world.getBlock(x, y, z - 1) != Blocks.lava) ||
						(world.getBlock(x + 1, y, z) != Blocks.fire) || 
						(world.getBlock(x - 1, y, z) != Blocks.fire) || 
						(world.getBlock(x, y, z + 1) != Blocks.fire) || 
						(world.getBlock(x, y, z - 1) != Blocks.fire)) {
    					if ((world.getBlock(x + 1, y, z) != JBlocks.BlockForgeAnvil) || 
    							(world.getBlock(x - 1, y, z) != JBlocks.BlockForgeAnvil) || 
    							(world.getBlock(x, y, z + 1) != JBlocks.BlockForgeAnvil) || 
    							(world.getBlock(x, y, z - 1) != JBlocks.BlockForgeAnvil)) {
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
    
    public void func_149828_a(World p_149828_1_, int p_149828_2_, int p_149828_3_, int p_149828_4_, int p_149828_5_)
    {
        p_149828_1_.playAuxSFX(1022, p_149828_2_, p_149828_3_, p_149828_4_, 0);
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