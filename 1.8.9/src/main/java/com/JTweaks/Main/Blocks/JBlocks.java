package com.JTweaks.Main.Blocks;

import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.GameRegistry;
import com.JTweaks.Main.Reference;
import com.JTweaks.Main.Blocks.Forge.BlockForge;
import com.JTweaks.Main.Blocks.Forge.BlockForgeAnvil;
import com.JTweaks.Main.Dimensions.Portals.Portal;

public class JBlocks {
	
	public static Block BlockNetherOre = new BlockNetherOre()
	.setUnlocalizedName(Reference.MODID + "." + "NetherOre");
	
	public static Block BlockForgeAnvil = new BlockForgeAnvil()
	.setUnlocalizedName(Reference.MODID + "." + "ForgeAnvil");
	
	public static Block BlockForge = new BlockForge()
	.setUnlocalizedName(Reference.MODID + "." + "Forge");
	
	public static Block Portal = new Portal()
	.setUnlocalizedName(Reference.MODID + "." + "Portal");
	
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
