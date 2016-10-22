package com.JTweaks.Main.Blocks;

import com.JTweaks.Main.*;
import com.JTweaks.Main.Blocks.Forge.*;
import com.JTweaks.Main.Dimensions.*;
import com.JTweaks.Main.Items.*;
import com.JTweaks.Main.Dimensions.Portals.*;

import cpw.mods.fml.common.registry.*;
import cpw.mods.fml.common.*;
import net.minecraft.init.*;
import net.minecraft.item.*;
import net.minecraft.item.Item.*;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.world.*;
import net.minecraft.potion.*;
import net.minecraft.world.biome.*;
import net.minecraft.world.biome.BiomeGenBase.*;
import net.minecraft.client.*;
import net.minecraft.client.renderer.entity.*;
import net.minecraft.creativetab.*;
import net.minecraftforge.common.*;
import net.minecraftforge.common.BiomeDictionary.*;
import net.minecraftforge.common.util.*;

public class JBlocks {
	
	public static Block BlockNetherOre = new BlockNetherOre()
	.setBlockName(Reference.MODID + "." + "NetherOre")
	.setBlockTextureName(Reference.MODID + ":" + "NetherOre");
	
	public static Block BlockForgeAnvil = new BlockForgeAnvil()
	.setBlockName(Reference.MODID + "." + "ForgeAnvil")
	.setBlockTextureName(Reference.MODID + ":" + "ForgeAnvil");
	
	public static Block BlockForge = new BlockForge()
	.setBlockName(Reference.MODID + "." + "Forge")
	.setBlockTextureName(Reference.MODID + ":" + "Forge");
	
	public static Block Portal = new Portal()
	.setBlockName(Reference.MODID + "." + "Portal")
	.setBlockTextureName(Reference.MODID + ":" + "Portal");
	
    public static void init() {
    
    //Textures
    GameRegistry.registerBlock(Portal,Portal.getUnlocalizedName());
    GameRegistry.registerBlock(BlockNetherOre,BlockNetherOre.getUnlocalizedName());
    GameRegistry.registerBlock(BlockForgeAnvil,BlockForgeAnvil.getUnlocalizedName());
    GameRegistry.registerBlock(BlockForge,BlockForge.getUnlocalizedName());
    
	//Recipes
/*	GameRegistry.addShapedRecipe(new ItemStack(BlockForgeAnvil), new Object[]{
		"ABC",
		"DEF",
		"GHI",
		'A', Items.iron_ingot, 'B', 'C','D','E','F','G','H','I', });
*/    }
}
