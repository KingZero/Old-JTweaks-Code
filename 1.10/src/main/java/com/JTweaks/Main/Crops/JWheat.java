package com.JTweaks.Main.Crops;

import java.util.*;

import com.JTweaks.Main.*;

import net.minecraftforge.fml.relauncher.*;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.init.*;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import static net.minecraftforge.common.EnumPlantType.*;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.IPlantable;

public class JWheat extends BlockCrops{
	
	public JWheat() {
        this.setTickRandomly(true);
//        this.setBlockBounds(0F, 0.0F, 0F, 1F, 0.25F, 1F);
	}
	
    protected boolean canPlaceBlockOn(Block Bpar1)
    {
        return Bpar1 == Blocks.FARMLAND;
        }

	protected Item getSeed()
    {
		if (this == JCrops.Rye)  return JCrops.SeedsRye;
        return null;
        }

	protected Item getCrop()
    {
		if (this == JCrops.Rye)  return JCrops.ItemRye;
        return null;
        }
	
	@Override
	public EnumPlantType getPlantType(IBlockAccess world, BlockPos pos) {
		if (this == JCrops.Rye)  return Crop;
		return Plains;
	}

	public String getName() {
		if (this == JCrops.Rye)		return "Rye";
		return null;
	}
	

	@SideOnly(Side.CLIENT) 
	public Item getItemDropped(World world, int x, int y, int z)
	{	
		if (this == JCrops.Rye)  return JCrops.ItemRye;
        return null;
        }
	
    @Override
    public List<ItemStack> getDrops(IBlockAccess world, BlockPos pos, IBlockState state, int fortune)
    {
        List<ItemStack> ret = super.getDrops(world, pos, state, fortune);
        int age = ((Integer)state.getValue(AGE)).intValue();
        Random rand = world instanceof World ? ((World)world).rand : new Random();

        if (age >= 7){
            int k = 3 + fortune;
            for (int i = 0; i < 3 + fortune; ++i){
                if (rand.nextInt(15) <= age){
                    ret.add(new ItemStack(this.getSeed(), 1, 0));
                }
            }
        }
        return ret;
    }
}