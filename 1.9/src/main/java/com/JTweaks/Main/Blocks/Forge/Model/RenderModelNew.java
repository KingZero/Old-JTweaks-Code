package com.JTweaks.Main.Blocks.Forge.Model;

import org.lwjgl.opengl.GL11;

import com.JTweaks.Main.Util.Reference;

import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.renderer.tileentity.*;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

public class RenderModelNew extends TileEntitySpecialRenderer{
	
	public static final ResourceLocation Forge = new ResourceLocation(Reference.MODID + ":" + "textures/blocks/Forge.png");
	
	private ModelNew Model;
	
	public RenderModelNew(){
		this.Model = new ModelNew();
	}
	
	@Override
	public void renderTileEntityAt(TileEntity te, double x, double y, double z, float partialTicks, int destroyStage) {

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
