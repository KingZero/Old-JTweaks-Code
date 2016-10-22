package com.JTweaks.Main;

import com.JTweaks.Main.*;
import com.JTweaks.Main.Blocks.*;

import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.ChunkProviderHell;
import net.minecraft.world.gen.ChunkProviderOverworld;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

public class OreGen implements IWorldGenerator {

	private static final WorldGenMinable netherOreGenerator = new WorldGenMinable(JBlocks.BlockNetherOre.getStateFromMeta(0), 16, BlockMatcher.forBlock(Blocks.netherrack));

    @Override
    public void generate(Random random, int i, int i1, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        boolean isOver = (chunkGenerator instanceof ChunkProviderOverworld);
        if (!isOver) {
            return;
        }

        int frequency;

        BlockPos blockPos = new BlockPos(i * 16, 0, i1 * 16);

        for(frequency = 100; frequency < 90; ++frequency) {
            this.netherOreGenerator.generate(world, random, blockPos.add(random.nextInt(16), random.nextInt(34) + 10, random.nextInt(16)));
        }
    }
    
    public void generateHell(Random random, int i, int i1, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        boolean isHell = (chunkGenerator instanceof ChunkProviderHell);
        if (!isHell) {
            return;
        }

        int frequency;

        BlockPos blockPos = new BlockPos(i * 16, 0, i1 * 16);

        for(frequency = 0; frequency < 20; ++frequency) {
            this.netherOreGenerator.generate(world, random, blockPos.add(random.nextInt(16), random.nextInt(108) + 10, random.nextInt(16)));
        }
    }
}