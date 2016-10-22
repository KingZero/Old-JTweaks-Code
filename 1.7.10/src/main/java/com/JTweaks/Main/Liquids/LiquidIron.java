package com.JTweaks.Main.Liquids;

import net.minecraft.block.*;
import net.minecraft.block.material.*;
import net.minecraft.world.*;
import cpw.mods.fml.relauncher.*;

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
