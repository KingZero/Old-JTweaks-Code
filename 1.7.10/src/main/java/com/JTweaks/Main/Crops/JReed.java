package com.JTweaks.Main.Crops;

import java.util.*;

import com.JTweaks.Main.*;

import cpw.mods.fml.relauncher.*;
import net.minecraft.block.*;
import net.minecraft.block.material.*;
import net.minecraft.init.*;
import net.minecraft.item.*;
import net.minecraft.util.*;
import net.minecraft.world.*;
import net.minecraft.world.gen.feature.*;
import net.minecraftforge.common.*;
import net.minecraftforge.common.util.*;

public class JReed extends BlockReed {	

	public JReed() {
        float f = 0.375F;
        this.setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 1.0F, 0.5F + f);
        this.setTickRandomly(true);
//		this.setCreativeTab(JTweaks.tabJCrops);
	}
	
	protected Block Plant(){
		return JCrops.Bamboo;
	}
	
	protected Item getSeed()
    {
		if (this == JCrops.Bamboo)  return JCrops.ItemBamboo;
        return null;
        }
	
	protected Block find()
	    {
		if (this == JCrops.Bamboo)  return JCrops.Bamboo;
        return null;
        }
	
	@SideOnly(Side.CLIENT) 
	public Item getItem(World world, int x, int y, int z)
	{	
		if (this == JCrops.Bamboo)  return JCrops.ItemBamboo;
		return null;
		}
	
	public Item getCrop(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
		if (this == JCrops.Bamboo)  return JCrops.ItemBamboo;
		return null;
        }
	
    public EnumPlantType getPlantType(IBlockAccess world, int x, int y, int z)
    {
		if (this == JCrops.Bamboo)		return EnumPlantType.Plains;
        return EnumPlantType.Beach;
    }

	public void generateSurface(World world, Random rand, int chunkX, int chunkZ){
		for(int i = 0; i < 20; i++)
		{
			int l6 = chunkX + rand.nextInt(16) + 8;
			int i11 = rand.nextInt(70);
			int l14 = chunkZ + rand.nextInt(16) + 8;
			(new WorldGenFlowers(this.Plant())).generate(world, rand, l6, i11, l14);
			}
		}
	
	public void updateTick(World world, int x, int y, int z, Random random){
		if (world.getBlock(x, y - 1, z) == this.find() || this.func_150170_e(world, x, y, z)){
			if (world.isAirBlock(x, y + 1, z)){
				int l;
				for (l = 1; world.getBlock(x, y - l, z) == this; ++l){;}
				if (l < 6){
					int i1 = world.getBlockMetadata(x, y, z);
					if (i1 == 15){world.setBlock(x, y + 1, z, this);world.setBlockMetadataWithNotify(x, y, z, 0, 4);}
					else{world.setBlockMetadataWithNotify(x, y, z, i1 + 1, 4);}
					}
				}
			}
		}
    
	public void onNeighborBlockChange(World world, int i, int j, int k, Block par1)
    {
        this.func_150170_q(world, i, j, k);
    }
	
    protected final boolean func_150170_q(World world, int i, int j, int k)
    {
        if (!this.canBlockStay(world, i, j, k))
        {
            this.dropBlockAsItem(world, i, j, k, world.getBlockMetadata(i, j, k), 0);
            world.setBlockToAir(i, j, k);
            return false;
        }
        else
        {
            return true;
        }
    }
    
	public boolean canBlockStay(World world, int i, int j, int k)
	{
		return canPlaceBlockAt(world, i, j, k);
	}
	
	@Override 
	public boolean canPlaceBlockAt(World world, int x, int y, int z) {
		Block block = world.getBlock(x, y - 1, z);
		return (block.canSustainPlant(world, x, y - 1, z, ForgeDirection.UP, this) || block == this.find());}

	public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int i, int j, int k) 
	{
		return null;
	}

	public String getName() {
		if (this == JCrops.Bamboo)		return "Bamboo";
		return null;
	}
}