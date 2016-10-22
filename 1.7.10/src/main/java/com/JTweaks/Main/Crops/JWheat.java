package com.JTweaks.Main.Crops;

import java.util.*;

import com.JTweaks.Main.*;

import cpw.mods.fml.relauncher.*;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.*;
import net.minecraft.init.*;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import static net.minecraftforge.common.EnumPlantType.*;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.IPlantable;

public class JWheat extends BlockCrops{
	
	public JWheat() {
        this.setTickRandomly(true);
        this.setBlockBounds(0F, 0.0F, 0F, 1F, 0.25F, 1F);
//		this.setCreativeTab(JTweaks.tabJCrops);
	}
	
    protected boolean canPlaceBlockOn(Block Bpar1)
    {
        return Bpar1 == Blocks.farmland;
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
	public EnumPlantType getPlantType(IBlockAccess world, int x, int y, int z) {
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
    public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune)
    {
        ArrayList<ItemStack> drops = new ArrayList<ItemStack>();
        int count = quantityDropped(metadata, fortune, world.rand);
        for(int i = 0; i < count; i++) {
            Item item = getItemDropped(metadata, world.rand, fortune);
            if (item != null) {
            	drops.add(new ItemStack(this.getSeed()));
                }
            }
        if (metadata >= 7) {
            for (int i = 0; i < 3 + fortune; ++i) {
                if (world.rand.nextInt(15) <= metadata){
                    drops.add(new ItemStack(this.getCrop(), 1, 0));
                    }
                }
            }
        return drops;
    }
}