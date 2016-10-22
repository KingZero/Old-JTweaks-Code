package com.JTweaks.Main.Blocks.Forge;

import java.util.*;

import com.JTweaks.Main.*;
import com.JTweaks.Main.Blocks.JBlocks;
import com.JTweaks.Main.Blocks.Forge.Model.TileEntityModelNew;
import com.JTweaks.Main.Entities.*;

import cpw.mods.fml.common.registry.*;
import cpw.mods.fml.common.*;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
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
import net.minecraft.world.*;

public class BlockForge extends BlockContainer{
	
    public IIcon[] icons = new IIcon[6];

	public BlockForge() {
		super(Material.iron);
		this.setBlockBounds(0f, 0f, -0.5f, 1f, 1f, 1f);
		this.setCreativeTab(JTweaks.tabJBlocks);
	}

    @Override
    public void registerBlockIcons(IIconRegister reg) {
            this.blockIcon = reg.registerIcon(Reference.MODID + ":" + this.getLocalizedName().substring(5));
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
		return new TileEntityModelNew();
	}
	
	@Override
	public boolean hasTileEntity(){
		return true;
	}
    
    
    //---------------------------------------------------------------------------
    
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
    
    @Override
    public int tickRate(World world)
    {
        return 10;
    }
    
    public void randomDisplayTick(World world, int i, int j, int k, Random random){
    	EntityPlayer entity = Minecraft.getMinecraft().thePlayer;
    	World par1World = world;
    			int par2 = i;
    			int par3 = j;
    			int par4 = k;
    			Random par5Random = random;
    			if(true)
    	    for (int la = 0; la < 4; ++la)
    		        {
    		            int l = par1World.getBlockMetadata(par2, par3, par4);
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
    	}
}