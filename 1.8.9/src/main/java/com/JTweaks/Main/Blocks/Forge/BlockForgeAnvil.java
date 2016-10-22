package com.JTweaks.Main.Blocks.Forge;

import java.util.List;

import net.minecraft.block.BlockAnvil;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.JTweaks.Main.JTweaks;
import com.JTweaks.Main.Blocks.JBlocks;

public class BlockForgeAnvil extends BlockAnvil {
	
    public IIcon[] icons = new IIcon[6];

	public BlockForgeAnvil() {
		super();
        float f = 1F;
		this.setCreativeTab(JTweaks.tabJBlocks);
	}
	
	
    @Override
    public void registerBlockIcons(IIconRegister reg) {
        for (int i = 0; i < 6; i ++) {
            this.icons[i] = reg.registerIcon(JBlocks.BlockForge + "." + i);
        }
    }
    
    @Override
    public IIcon getIcon(int side, int meta) {
        return this.icons[side];
    }

    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int q, float i, float j, float k) {

		}
    
    public boolean renderAsNormalBlock()
    {
        return false;
    }

    public boolean isOpaqueCube()
    {
        return false;
    }
    
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item p_149666_1_, CreativeTabs p_149666_2_, List p_149666_3_)
    {
        p_149666_3_.add(new ItemStack(p_149666_1_, 1, 0));
    }
}