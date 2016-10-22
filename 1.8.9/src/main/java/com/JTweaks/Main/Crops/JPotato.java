package com.JTweaks.Main.Crops;

import static net.minecraftforge.common.EnumPlantType.Crop;
import static net.minecraftforge.common.EnumPlantType.Plains;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class JPotato extends JWheat{

	public JPotato() {
        this.setTickRandomly(true);
        this.setBlockBounds(0F, 0.0F, 0F, 1F, 0.25F, 1F);
//		this.setCreativeTab(JTweaks.tabJCrops);
	}

    protected boolean canPlaceBlockOn(Block Bpar1)
    {
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
	public EnumPlantType getPlantType(IBlockAccess world, int x, int y, int z) {
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
	public Item getItem(World world, int x, int y, int z)
	{	
		if (this == JCrops.Onion)  return JCrops.ItemOnion;
		if (this == JCrops.Tomato)  return JCrops.ItemTomato;
		if (this == JCrops.Orange)  return JCrops.ItemOrange;
		return null;
		}
	
    @Override
	public void func_149853_b(World parWorld, Random parRand, int parX, int parY, int parZ)
    {
        int growStage = parWorld.getBlockMetadata(parX, parY, parZ) + MathHelper.getRandomIntegerInRange(parRand, 1, 3);
        if (growStage > 3) {
        	growStage = 3;
        }
        parWorld.setBlockMetadataWithNotify(parX, parY, parZ, growStage, 1);
    }
	
	@Override
    public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune)
    {
        ArrayList<ItemStack> drops = new ArrayList<ItemStack>();
        int count = quantityDropped(metadata, fortune, world.rand);
        for(int i = 0; i < count; i++) {
            Item item = getItemDropped(metadata, world.rand, fortune);
            if (item != null) {
            	drops.add(new ItemStack(this.Posionous()));
                }
            }
        if (metadata >= 3) {
            for (int i = 0; i < 3 + fortune; ++i) {
                if (world.rand.nextInt(15) <= metadata){
                    drops.add(new ItemStack(this.getCrop(), 1, 0));
                    }
                }
            }
        return drops;
    }
}