package com.JTweaks.Main.Blocks.Forge;

import java.util.*;

import com.JTweaks.Main.*;
import com.JTweaks.Main.Blocks.JBlocks;
import com.JTweaks.Main.Blocks.Forge.Model.*;

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
import net.minecraft.client.renderer.texture.*;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.*;
import net.minecraft.entity.player.*;
import net.minecraft.init.Blocks;
import net.minecraft.item.*;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.*;

public class BlockForge extends BlockContainer{

	public BlockForge() {
		super(Material.IRON);
//		this.setBlockBounds(0f, 0f, -0.5f, 1f, 1f, 1f);
		this.setCreativeTab(JTweaks.tabJBlocks);
	}
  
    //---------------------------------------------------------------------------
    
    
    public int getRenderType(){
    	return -1;
    }
    
    public boolean isOpagueCude(){
    	return false;
    }
    
    public boolean renderAsNormalBlock(){
		return false;
    }
    
	@Override
	public TileEntity createNewTileEntity(World arg0, int arg1) {
		return new TileEntityForgeModel();
	}
	
	@Override
	public boolean hasTileEntity(){
		return true;
	}
    
    
    //---------------------------------------------------------------------------
    
    public boolean onBlockActivated(World world, BlockPos pos, int x, int y, int z, EntityPlayer player, int q, float i, float j, float k) {
		BlockPos Air = new BlockPos(x, y + 1, z);
		BlockPos i1 = new BlockPos(x + 1, y, z);
		BlockPos i2 = new BlockPos(x - 1, y, z);
		BlockPos i3 = new BlockPos(x, y, z + 1);
		BlockPos i4 = new BlockPos(x, y, z - 1);
    	
		if (!world.isRemote) {
			if (world.isAirBlock(Air)) {
				if ((world.getBlockState(i1).getBlock() != Blocks.LAVA) || 
						(world.getBlockState(i2).getBlock() != Blocks.LAVA) || 
						(world.getBlockState(i3).getBlock() != Blocks.LAVA) || 
						(world.getBlockState(i4).getBlock() != Blocks.LAVA) || 
						(world.getBlockState(i1).getBlock() != Blocks.FIRE) || 
						(world.getBlockState(i2).getBlock() != Blocks.FIRE) || 
						(world.getBlockState(i3).getBlock() != Blocks.FIRE) || 
						(world.getBlockState(i4).getBlock() != Blocks.FIRE)) {
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
    
    @Override
    public int tickRate(World world)
    {
        return 10;
    }
    
/*    public void randomDisplayTick(World world, int i, int j, int k, Random random){
    	EntityPlayer entity = Minecraft.getMinecraft().thePlayer;
    	World par1World = world;
    			int par2 = i;
    			int par3 = j;
    			int par4 = k;
    			Random par5Random = random;
    			if(true)
    	    for (int la = 0; la < 4; ++la)
    		        {
    		            int l = par1World.getBlockState(par2, par3, par4).getBlock();
    		            double d0 = (double)((float)par2 + 0.5F) + (double)(par5Random.nextFloat() - 0.5F) * 0.3D;
    		            double d1 = ((double)((float)par3 + 0.7F) + (double)(par5Random.nextFloat() - 0.5F) * 0.3D)+0.5D;
    		            double d2 = (double)((float)par4 + 0.5F) + (double)(par5Random.nextFloat() - 0.5F) * 0.3D;
    		            double d3 = 0.2199999988079071D;
    		            double d4 = 0.27000001072883606D;

    		            if (l == 1)
    		            {
    		                par1World.spawnParticle("smoke", d0 - d4, d1 + d3, d2, 0.0D, 0.0D, 0.0D);
    		            }
    		            else if (l == 2)
    		            {
    		                par1World.spawnParticle("smoke", d0 + d4, d1 + d3, d2, 0.0D, 0.0D, 0.0D);
    		            }
    		            else if (l == 3)
    		            {
    		                par1World.spawnParticle("smoke", d0, d1 + d3, d2 - d4, 0.0D, 0.0D, 0.0D);
    		            }
    		            else if (l == 4)
    		            {
    		                par1World.spawnParticle("smoke", d0, d1 + d3, d2 + d4, 0.0D, 0.0D, 0.0D);
    		            }
    		            else
    		            {
    		                par1World.spawnParticle("smoke", d0, d1, d2, 0.0D, 0.0D, 0.0D);
    		            }
    	        }
    	}*/
}