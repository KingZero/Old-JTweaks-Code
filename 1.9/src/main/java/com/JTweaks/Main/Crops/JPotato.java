package com.JTweaks.Main.Crops;

import static net.minecraftforge.common.EnumPlantType.Crop;
import static net.minecraftforge.common.EnumPlantType.Plains;

import java.util.*;

import com.JTweaks.Main.*;

import net.minecraft.block.*;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.init.*;
import net.minecraft.item.*;
import net.minecraft.util.math.*;
import net.minecraft.world.*;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.fml.relauncher.*;

public class JPotato extends JWheat{

	public JPotato() {
        this.setTickRandomly(true);
//        this.setBlockBounds(0F, 0.0F, 0F, 1F, 0.25F, 1F);
	}

    protected boolean canPlaceBlockOn(Block Bpar1) {
        return Bpar1 == Blocks.farmland;
        }

	protected Item getCrop()
    {
		if (this == JCrops.Onion)  return JCrops.ItemOnion;
		if (this == JCrops.Tomato)  return JCrops.ItemTomato;
		if (this == JCrops.Orange)  return JCrops.ItemOrange;
		return null;
		}

	protected Item Posionous()
    {
		if (this == JCrops.Onion)  return JCrops.PoisonousOnion;
		if (this == JCrops.Tomato)  return JCrops.PoisonousTomato;
		if (this == JCrops.Orange)  return JCrops.ItemOrange;
		return null;
        }
	
	@Override
	public EnumPlantType getPlantType(IBlockAccess world, BlockPos pos) {
		if (this == JCrops.Onion)		return Crop;
		if (this == JCrops.Tomato)		return Crop;
		if (this == JCrops.Orange)		return Crop;
		return Plains;
	}

	public String getName() {
		if (this == JCrops.Onion)		return "Onion";
		if (this == JCrops.Tomato)		return "Tomato";
		if (this == JCrops.Orange)		return "Orange";
		return null;
	}
	
	@SideOnly(Side.CLIENT) 
	public Item getItem(World world, BlockPos pos)
	{	
		if (this == JCrops.Onion)  return JCrops.ItemOnion;
		if (this == JCrops.Tomato)  return JCrops.ItemTomato;
		if (this == JCrops.Orange)  return JCrops.ItemOrange;
		return null;
		}
	
    @Override
    public void grow(World worldIn, BlockPos pos, IBlockState state)
    {
        int i = this.func_185527_x(state) + this.func_185529_b(worldIn);
        int j = this.func_185526_g();
        if (i > j){
            i = j;}
        worldIn.setBlockState(pos, this.func_185528_e(i), 2);
    }
	
	@Override
    public List<ItemStack> getDrops(IBlockAccess world, BlockPos pos, IBlockState state, int fortune)
    {
        List<ItemStack> drops = super.getDrops(world, pos, state, fortune);
        int count = ((Integer)state.getValue(AGE)).intValue();
        Random rand = world instanceof World ? ((World)world).rand : new Random();
        
        for(int i = 0; i < count; i++) {
            Item item = getItemDropped(state, rand, fortune);
            if (item != null) {
            	drops.add(new ItemStack(this.Posionous()));
                }
            }
        if (count >= 3) {
            for (int i = 0; i < 3 + fortune; ++i) {
                if (rand.nextInt(15) <= count){
                    drops.add(new ItemStack(this.getCrop(), 1, 0));
                    }
                }
            }
        return drops;
    }
}