package net.mcreator.biomesohplanty.entity.renderer;

@OnlyIn(Dist.CLIENT)
public class JoebidenRenderer {

	public static class ModelRegisterHandler {

		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(JoebidenEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modeljoebiden(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("biomes_oh_planty:textures/joebiden.png");
					}
				};
			});

		}
	}

	// Made with Blockbench 4.0.5
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports

	public static class Modeljoebiden extends EntityModel<Entity> {
		private final ModelRenderer leg1;
		private final ModelRenderer leg2;
		private final ModelRenderer body;
		private final ModelRenderer arm1;
		private final ModelRenderer arm2;
		private final ModelRenderer head;

		public Modeljoebiden() {
			textureWidth = 128;
			textureHeight = 128;

			leg1 = new ModelRenderer(this);
			leg1.setRotationPoint(-4.0F, 4.125F, -2.625F);
			leg1.setTextureOffset(0, 102).addBox(-3.0F, -0.125F, -0.375F, 6.0F, 20.0F, 6.0F, 0.0F, false);
			leg1.setTextureOffset(0, 102).addBox(2.0F, 18.875F, -1.375F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			leg1.setTextureOffset(0, 102).addBox(-3.0F, 18.875F, -1.375F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			leg1.setTextureOffset(0, 102).addBox(-1.0F, 18.875F, -1.375F, 2.0F, 1.0F, 1.0F, 0.0F, false);

			leg2 = new ModelRenderer(this);
			leg2.setRotationPoint(4.0F, 4.125F, -2.625F);
			leg2.setTextureOffset(23, 102).addBox(-3.0F, -0.125F, -0.375F, 6.0F, 20.0F, 6.0F, 0.0F, false);
			leg2.setTextureOffset(23, 102).addBox(2.0F, 18.875F, -1.375F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			leg2.setTextureOffset(23, 102).addBox(-1.0F, 18.875F, -1.375F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			leg2.setTextureOffset(23, 102).addBox(-3.0F, 18.875F, -1.375F, 1.0F, 1.0F, 1.0F, 0.0F, false);

			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, -7.5F, -5.1667F);
			body.setTextureOffset(76, 91).addBox(-8.0F, -15.5F, 0.1667F, 16.0F, 27.0F, 10.0F, 0.0F, false);
			body.setTextureOffset(94, 71).addBox(-7.0F, -7.5F, -2.8333F, 14.0F, 17.0F, 3.0F, 0.0F, false);
			body.setTextureOffset(100, 55).addBox(-6.0F, -5.5F, -4.8333F, 12.0F, 13.0F, 2.0F, 0.0F, false);

			arm1 = new ModelRenderer(this);
			arm1.setRotationPoint(-12.5F, -16.5F, 0.0F);
			arm1.setTextureOffset(82, 0).addBox(-6.5F, -4.5F, -6.0F, 11.0F, 17.0F, 12.0F, 0.0F, false);

			arm2 = new ModelRenderer(this);
			arm2.setRotationPoint(12.5F, -16.5F, 0.0F);
			arm2.setTextureOffset(82, 0).addBox(-4.5F, -4.5F, -6.0F, 11.0F, 17.0F, 12.0F, 0.0F, false);

			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -21.25F, -2.25F);
			head.setTextureOffset(0, 23).addBox(-8.0F, -9.75F, -3.75F, 16.0F, 8.0F, 12.0F, 0.0F, false);
			head.setTextureOffset(0, 0).addBox(-9.0F, -1.75F, -4.75F, 18.0F, 3.0F, 5.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			leg1.render(matrixStack, buffer, packedLight, packedOverlay);
			leg2.render(matrixStack, buffer, packedLight, packedOverlay);
			body.render(matrixStack, buffer, packedLight, packedOverlay);
			arm1.render(matrixStack, buffer, packedLight, packedOverlay);
			arm2.render(matrixStack, buffer, packedLight, packedOverlay);
			head.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {

			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.leg1.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.leg2.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.arm1.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.arm2.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		}
	}

}
