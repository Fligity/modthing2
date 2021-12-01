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
import net.minecraft.client.renderer.entity.SpriteRenderer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.Minecraft;

import net.mcreator.biomesohplanty.entity.SpermEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class SpermRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(SpermEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelSperm(), 0.5f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("biomes_oh_planty:textures/sperm.png");
					}
				};
			});
			RenderingRegistry.registerEntityRenderingHandler(SpermEntity.arrow,
					renderManager -> new SpriteRenderer(renderManager, Minecraft.getInstance().getItemRenderer()));
		}
	}

	// Made with Blockbench 4.0.5
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelSperm extends EntityModel<Entity> {
		private final ModelRenderer Head;
		private final ModelRenderer Tail1;
		private final ModelRenderer Tail2;
		private final ModelRenderer Tail3;
		private final ModelRenderer Tail4;
		public ModelSperm() {
			textureWidth = 64;
			textureHeight = 64;
			Head = new ModelRenderer(this);
			Head.setRotationPoint(0.0F, 20.0F, -2.75F);
			Head.setTextureOffset(9, 0).addBox(-4.0F, -4.0F, -2.25F, 8.0F, 8.0F, 15.0F, 0.0F, false);
			Head.setTextureOffset(0, 0).addBox(-3.0F, -3.0F, -8.25F, 6.0F, 6.0F, 6.0F, 0.0F, false);
			Tail1 = new ModelRenderer(this);
			Tail1.setRotationPoint(0.0F, 20.0F, 10.0F);
			Tail1.setTextureOffset(45, 26).addBox(0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 9.0F, 0.0F, false);
			Tail2 = new ModelRenderer(this);
			Tail2.setRotationPoint(0.0F, 20.5F, 19.0F);
			Tail2.setTextureOffset(39, 50).addBox(0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 12.0F, 0.0F, false);
			Tail3 = new ModelRenderer(this);
			Tail3.setRotationPoint(0.0F, 19.5F, 31.0F);
			Tail3.setTextureOffset(1, 44).addBox(0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 12.0F, 0.0F, false);
			Tail4 = new ModelRenderer(this);
			Tail4.setRotationPoint(0.0F, 20.5F, 43.0F);
			Tail4.setTextureOffset(17, 41).addBox(0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 12.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			Head.render(matrixStack, buffer, packedLight, packedOverlay);
			Tail1.render(matrixStack, buffer, packedLight, packedOverlay);
			Tail2.render(matrixStack, buffer, packedLight, packedOverlay);
			Tail3.render(matrixStack, buffer, packedLight, packedOverlay);
			Tail4.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.Head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.Head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.Tail4.rotateAngleZ = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.Tail1.rotateAngleZ = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.Tail3.rotateAngleZ = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.Tail2.rotateAngleZ = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		}
	}
}
