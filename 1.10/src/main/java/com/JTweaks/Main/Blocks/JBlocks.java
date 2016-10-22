package com.JTweaks.Main.Blocks;

import com.JTweaks.Main.*;
import com.JTweaks.Main.Blocks.Forge.*;
import com.JTweaks.Main.Items.*;
import com.JTweaks.Main.Util.Reference;

import net.minecraft.init.*;
import net.minecraft.item.*;
import net.minecraft.item.Item.*;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.world.*;
import net.minecraft.potion.*;
import net.minecraft.world.biome.*;
import net.minecraft.client.*;
import net.minecraft.client.renderer.entity.*;
import net.minecraft.creativetab.*;
import net.minecraftforge.common.*;
import net.minecraftforge.common.BiomeDictionary.*;
import net.minecraftforge.common.util.*;
import net.minecraftforge.fml.common.registry.*;

public class JBlocks {
	
	public static Block BlockNetherOre = new BlockNetherOre()
	.setUnlocalizedName("NetherOre");
	
	public static Block BlockForgeAnvil = new BlockForgeAnvil()
	.setUnlocalizedName("ForgeAnvil");
	
	public static Block BlockForge = new BlockForge()
	.setUnlocalizedName("Forge");

}
