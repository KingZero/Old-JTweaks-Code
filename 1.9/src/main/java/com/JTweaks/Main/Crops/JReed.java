package com.JTweaks.Main.Crops;

import java.util.*;

import com.JTweaks.Main.*;

import net.minecraftforge.fml.relauncher.*;
import net.minecraft.block.*;
import net.minecraft.block.material.*;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.*;
import net.minecraft.item.*;
import net.minecraft.util.*;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3i;
import net.minecraft.world.*;
import net.minecraft.world.gen.feature.*;
import net.minecraftforge.common.*;
import net.minecraftforge.common.util.*;

public class JReed extends BlockReed {	

	private Vec3i oldBlockPos;

	public JReed() {
        float f = 0.375F;
//        this.setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 1.0F, 0.5F + f);
        this.setTickRandomly(true);
	}
	
// BlockPos newBlockPos = new BlockPos(oldBlockPos.getX(), oldBlockPos.getY(), oldBlockPos.getZ());
	
	protected Block Plant(){
		if (this == JCrops.Bamboo)  return JCrops.Bamboo;
		else
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

/*	public void generateSurface(World world, Random rand, int chunkX, int chunkZ){
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
*/
    public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand)
    {
        if (worldIn.getBlockState(pos.down()).getBlock() == Blocks.reeds || this.checkForDrop(worldIn, pos, state))
        {
            if (worldIn.isAirBlock(pos.up()))
            {
                int i;

                for (i = 1; worldIn.getBlockState(pos.down(i)).getBlock() == this; ++i)
                if (i < 3)
                {
                    int j = ((Integer)state.getValue(AGE)).intValue();
                    if (j == 15){ 
                    	worldIn.setBlockState(pos.up(), this.getDefaultState());
                        worldIn.setBlockState(pos, state.withProperty(AGE, Integer.valueOf(0)), 4);}
                    else {
                        worldIn.setBlockState(pos, state.withProperty(AGE, Integer.valueOf(j + 1)), 4);
                    }
                }
            }
        }
    }
    
	public void onNeighborBlockChange(World world, BlockPos pos, Block par1)
    {
        this.pls(world, pos);
    }
	
    protected final boolean pls(World world, BlockPos pos)
    {
        if (!this.canBlockStay(world, pos))
        {
            this.dropBlockAsItem(world, pos, world.getBlockState(pos), 0);
            world.setBlockToAir(pos);
            return false;
        }
        else
        {
            return true;
        }
    }
    
	public boolean canBlockStay(World world, BlockPos pos)
	{
		return canPlaceBlockAt(world, pos);
	}
	
	@Override
    public boolean canPlaceBlockAt(World worldIn, BlockPos pos)
    {
        IBlockState state = worldIn.getBlockState(pos.down());
        Block block = state.getBlock();
        if (block.canSustainPlant(state, worldIn, pos.down(), EnumFacing.UP, this)) return true;

        if (block == this){
            return true;
        } else 
        	if (block != Blocks.grass && block != Blocks.dirt && block != Blocks.sand){
            return false;
        } else {
            BlockPos blockpos = pos.down();
            for (EnumFacing enumfacing : EnumFacing.Plane.HORIZONTAL)
            {
                IBlockState iblockstate = worldIn.getBlockState(blockpos.offset(enumfacing));{
                    return true;
                }
            }
            return false;
        }
    }

	public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int i, int j, int k) 
	{
        return NULL_AABB;
	}

	public String getName() {
		if (this == JCrops.Bamboo)		return "Bamboo";
		return null;
	}
}