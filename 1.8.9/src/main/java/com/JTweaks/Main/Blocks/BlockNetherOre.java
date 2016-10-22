package com.JTweaks.Main.Blocks;

import java.util.Random;

import net.minecraft.util.*;
import net.minecraft.item.*;
import net.minecraft.block.*;
import net.minecraft.block.material.*;
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
		this.setStepSound(soundTypeStone);
		this.setHardness(0.0F);
		this.setResistance(0.0F);
		this.setCreativeTab(JTweaks.tabJBlocks);
	}
    
    public boolean isOpagueCude(){
    	return true;
    }
}