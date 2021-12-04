package net.mcreator.biomesohplanty.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.math.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import net.mcreator.biomesohplanty.entity.CumeepsEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class CumeepsRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(CumeepsEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelcumstim(), 0.5f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("biomes_oh_planty:textures/cumstim.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.0.5
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelcumstim extends EntityModel<Entity> {
		private final ModelRenderer Body;
		private final ModelRenderer cube_r1;
		private final ModelRenderer Head;
		private final ModelRenderer cube_r2;
		private final ModelRenderer cube_r3;
		private final ModelRenderer Leftleg;
		private final ModelRenderer leg1;
		private final ModelRenderer cube_r4;
		private final ModelRenderer leg2;
		private final ModelRenderer cube_r5;
		private final ModelRenderer leg3;
		private final ModelRenderer cube_r6;
		private final ModelRenderer leg4;
		private final ModelRenderer cube_r7;
		private final ModelRenderer rightleg;
		private final ModelRenderer leg5;
		private final ModelRenderer cube_r8;
		private final ModelRenderer leg6;
		private final ModelRenderer cube_r9;
		private final ModelRenderer leg7;
		private final ModelRenderer cube_r10;
		private final ModelRenderer leg8;
		private final ModelRenderer cube_r11;
		public Modelcumstim() {
			textureWidth = 32;
			textureHeight = 32;
			Body = new ModelRenderer(this);
			Body.setRotationPoint(0.0F, 24.0F, 0.0F);
			Body.setTextureOffset(0, 14).addBox(-3.0F, -7.0F, -6.0F, 6.0F, 4.0F, 14.0F, 0.0F, false);
			Body.setTextureOffset(0, 12).addBox(-3.0F, -8.0F, 0.0F, 0.0F, 1.0F, 9.0F, 0.0F, false);
			Body.setTextureOffset(0, 12).addBox(3.0F, -8.0F, 0.0F, 0.0F, 1.0F, 9.0F, 0.0F, false);
			Body.setTextureOffset(0, 15).addBox(-4.0F, -3.0F, -4.0F, 8.0F, 1.0F, 10.0F, 0.0F, false);
			Body.setTextureOffset(0, 11).addBox(-1.0F, -6.0F, 8.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(-0.5F, -8.0F, -2.5F);
			Body.addChild(cube_r1);
			setRotationAngle(cube_r1, 0.1309F, 0.0F, 0.0F);
			cube_r1.setTextureOffset(0, 14).addBox(-1.5F, -1.0F, -2.5F, 4.0F, 3.0F, 5.0F, 0.0F, false);
			Head = new ModelRenderer(this);
			Head.setRotationPoint(0.0F, 15.0341F, -3.2914F);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(0.0F, -1.7204F, -1.6384F);
			Head.addChild(cube_r2);
			setRotationAngle(cube_r2, 0.2182F, 0.0F, 0.0F);
			cube_r2.setTextureOffset(0, 0).addBox(-1.0F, -0.5F, -3.5F, 2.0F, 1.0F, 7.0F, 0.0F, false);
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(0.0F, -1.5341F, 0.2914F);
			Head.addChild(cube_r3);
			setRotationAngle(cube_r3, 0.3054F, 0.0F, 0.0F);
			cube_r3.setTextureOffset(0, 0).addBox(-1.0F, -0.5F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			Leftleg = new ModelRenderer(this);
			Leftleg.setRotationPoint(0.0F, 24.0F, 0.0F);
			leg1 = new ModelRenderer(this);
			leg1.setRotationPoint(0.0F, 0.0F, 0.0F);
			Leftleg.addChild(leg1);
			cube_r4 = new ModelRenderer(this);
			cube_r4.setRotationPoint(6.0F, -3.5F, 0.0F);
			leg1.addChild(cube_r4);
			setRotationAngle(cube_r4, 0.0F, 0.2182F, 0.5236F);
			cube_r4.setTextureOffset(12, 0).addBox(-4.0F, -0.5F, -1.0F, 8.0F, 1.0F, 2.0F, 0.0F, false);
			leg2 = new ModelRenderer(this);
			leg2.setRotationPoint(6.0F, -3.5F, 0.0F);
			Leftleg.addChild(leg2);
			setRotationAngle(leg2, 0.0F, -0.829F, 0.0F);
			cube_r5 = new ModelRenderer(this);
			cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
			leg2.addChild(cube_r5);
			setRotationAngle(cube_r5, 0.0F, 0.2182F, 0.5236F);
			cube_r5.setTextureOffset(12, 0).addBox(-4.0F, -0.5F, 2.0F, 8.0F, 1.0F, 2.0F, 0.0F, false);
			leg3 = new ModelRenderer(this);
			leg3.setRotationPoint(0.0F, 0.0F, 0.0F);
			Leftleg.addChild(leg3);
			cube_r6 = new ModelRenderer(this);
			cube_r6.setRotationPoint(3.5F, -3.0F, -4.0F);
			leg3.addChild(cube_r6);
			setRotationAngle(cube_r6, 0.0F, 0.0F, -0.3491F);
			cube_r6.setTextureOffset(12, 0).addBox(-0.5F, -3.0F, -1.0F, 1.0F, 6.0F, 2.0F, 0.0F, false);
			leg4 = new ModelRenderer(this);
			leg4.setRotationPoint(0.0F, 0.0F, 11.0F);
			Leftleg.addChild(leg4);
			cube_r7 = new ModelRenderer(this);
			cube_r7.setRotationPoint(3.5F, -3.0F, -4.0F);
			leg4.addChild(cube_r7);
			setRotationAngle(cube_r7, 0.0F, 0.0F, -0.3491F);
			cube_r7.setTextureOffset(12, 0).addBox(-0.5F, -3.0F, -1.0F, 1.0F, 6.0F, 2.0F, 0.0F, false);
			rightleg = new ModelRenderer(this);
			rightleg.setRotationPoint(0.0F, 24.0F, 4.0F);
			setRotationAngle(rightleg, 0.0F, 3.1416F, 0.0F);
			leg5 = new ModelRenderer(this);
			leg5.setRotationPoint(0.0F, 0.0F, 1.0F);
			rightleg.addChild(leg5);
			cube_r8 = new ModelRenderer(this);
			cube_r8.setRotationPoint(6.0F, -3.5F, 0.0F);
			leg5.addChild(cube_r8);
			setRotationAngle(cube_r8, 0.0F, 0.2182F, 0.5236F);
			cube_r8.setTextureOffset(12, 0).addBox(-4.0F, -0.5F, -1.0F, 8.0F, 1.0F, 2.0F, 0.0F, false);
			leg6 = new ModelRenderer(this);
			leg6.setRotationPoint(6.0F, -3.5F, 1.0F);
			rightleg.addChild(leg6);
			setRotationAngle(leg6, 0.0F, -0.829F, 0.0F);
			cube_r9 = new ModelRenderer(this);
			cube_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
			leg6.addChild(cube_r9);
			setRotationAngle(cube_r9, 0.0F, 0.2182F, 0.5236F);
			cube_r9.setTextureOffset(12, 0).addBox(-4.0F, -0.5F, 2.0F, 8.0F, 1.0F, 2.0F, 0.0F, false);
			leg7 = new ModelRenderer(this);
			leg7.setRotationPoint(0.0F, 0.0F, 1.0F);
			rightleg.addChild(leg7);
			cube_r10 = new ModelRenderer(this);
			cube_r10.setRotationPoint(3.5F, -3.0F, -4.0F);
			leg7.addChild(cube_r10);
			setRotationAngle(cube_r10, 0.0F, 0.0F, -0.3491F);
			cube_r10.setTextureOffset(12, 0).addBox(-0.5F, -3.0F, -1.0F, 1.0F, 6.0F, 2.0F, 0.0F, false);
			leg8 = new ModelRenderer(this);
			leg8.setRotationPoint(0.0F, 0.0F, 12.0F);
			rightleg.addChild(leg8);
			cube_r11 = new ModelRenderer(this);
			cube_r11.setRotationPoint(3.5F, -3.0F, -4.0F);
			leg8.addChild(cube_r11);
			setRotationAngle(cube_r11, 0.0F, 0.0F, -0.3491F);
			cube_r11.setTextureOffset(12, 0).addBox(-0.5F, -3.0F, -1.0F, 1.0F, 6.0F, 2.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			Body.render(matrixStack, buffer, packedLight, packedOverlay);
			Head.render(matrixStack, buffer, packedLight, packedOverlay);
			Leftleg.render(matrixStack, buffer, packedLight, packedOverlay);
			rightleg.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.Head.rotateAngleX = f3 / (180F / (float) Math.PI);
			this.leg1.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.leg4.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.leg5.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.leg2.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.leg3.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.leg8.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.leg6.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.leg7.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		}
	}
}
