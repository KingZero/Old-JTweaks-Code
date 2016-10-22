package com.JTweaks.Main.Liquids;

import net.minecraft.block.BlockDynamicLiquid;
import net.minecraft.block.BlockStaticLiquid;
import net.minecraft.block.material.Material;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class LiquidIron {

	static class liquidIronFlowing extends BlockDynamicLiquid {

        public liquidIronFlowing() {
                super(Material.lava);
                this.blockHardness = 100.0F;
                this.setLightOpacity(3);
        }

	@SideOnly(Side.CLIENT)
    public int colorMultiplier(IBlockAccess par1IBlockAccess, int par2, int par3, int par4){
    	return 0xffffff;
    }

}

	static class liquidIronStill extends BlockStaticLiquid {

        public liquidIronStill() {
                super(Material.lava);
                this.blockHardness = 100.0F;
                this.setLightOpacity(3);
                this.disableStats();
        }

        	@SideOnly(Side.CLIENT)
		    public int colorMultiplier(IBlockAccess par1IBlockAccess, int par2, int par3, int par4){
		    	return 0xffffff;
			}

}

}
