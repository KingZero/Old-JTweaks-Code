package com.JTweaks.Main.Blocks;

import java.util.Random;

import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.item.*;
import net.minecraft.block.*;
import net.minecraft.block.material.*;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.texture.*;
import net.minecraft.creativetab.CreativeTabs;

import com.JTweaks.Main.*;
import com.JTweaks.Main.Items.*;
import com.JTweaks.Main.Crops.*;
import com.JTweaks.Main.Blocks.*;

public class BlockNetherOre extends Block {

	public BlockNetherOre(){
		super(Material.rock);
		this.setHarvestLevel("pickaxe", 1);
		this.setCreativeTab(JTweaks.tabJBlocks);
	}

    public int getExpDrop(IBlockState blockState, IBlockAccess world, BlockPos blockPos, int fortune) {
        Random rand = world instanceof World ? ((World) world).rand : new Random();
    	
        return MathHelper.getRandomIntegerInRange(rand, 0, 2);
    }
}