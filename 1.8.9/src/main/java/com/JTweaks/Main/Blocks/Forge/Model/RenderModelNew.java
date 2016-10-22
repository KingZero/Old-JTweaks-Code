package com.JTweaks.Main.Blocks.Forge.Model;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

import com.JTweaks.Main.Reference;

public class RenderModelNew extends TileEntitySpecialRenderer{
	
	public static final ResourceLocation Forge = new ResourceLocation(Reference.MODID + ":" + "textures/blocks/Forge.png");
	
	private ModelNew Model;
	
	public RenderModelNew(){
		this.Model = new ModelNew();
	}
	
	@Override
	public void renderTileEntityAt(TileEntity tileentity, double x, double y, double z, float f, int arg5) {
		this.bindTexture(Forge);
		GL11.glPushMatrix();
		GL11.glTranslatef((float) x +0.5f , (float) y + 1.5f, (float) z + 0.5f);
		GL11.glRotatef(180, 0f, 0f, 1f);
		GL11.glPushMatrix();
		this.Model.renderModel(0.0625f);
		GL11.glPopMatrix();
		GL11.glPopMatrix();
	}
}
