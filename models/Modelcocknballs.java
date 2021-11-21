// Made with Blockbench 4.0.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelcocknballs extends EntityModel<Entity> {
	private final ModelRenderer bod;
	private final ModelRenderer cube_r1;
	private final ModelRenderer LeftLeg;
	private final ModelRenderer cube_r2;
	private final ModelRenderer RightLeg;
	private final ModelRenderer cube_r3;

	public Modelcocknballs() {
		textureWidth = 16;
		textureHeight = 16;

		bod = new ModelRenderer(this);
		bod.setRotationPoint(0.0F, 12.0324F, -0.5043F);
		bod.setTextureOffset(0, 0).addBox(-2.0F, -0.0324F, -1.4957F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		bod.setTextureOffset(4, 10).addBox(2.0F, -4.0324F, -0.4957F, 0.0F, 4.0F, 2.0F, 0.0F, false);
		bod.setTextureOffset(0, 10).addBox(-2.0F, -4.0324F, -0.4957F, 0.0F, 4.0F, 2.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 1.9676F, -1.9957F);
		bod.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.2618F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(0, 0).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(2.0F, 16.0F, 0.0F);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.5F, 3.0F, 1.0F);
		LeftLeg.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.1309F);
		cube_r2.setTextureOffset(10, 4).addBox(-0.5F, -5.0F, -2.0F, 1.0F, 10.0F, 2.0F, 0.0F, false);

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(-2.0F, 16.0F, 0.0F);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-0.5F, 3.0F, 0.0F);
		RightLeg.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, 0.1309F);
		cube_r3.setTextureOffset(10, 4).addBox(-0.5F, -5.0F, -1.0F, 1.0F, 10.0F, 2.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		bod.render(matrixStack, buffer, packedLight, packedOverlay);
		LeftLeg.render(matrixStack, buffer, packedLight, packedOverlay);
		RightLeg.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.LeftLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.RightLeg.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
	}
}