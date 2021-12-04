// Made with Blockbench 4.0.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelSpectercum extends EntityModel<Entity> {
	private final ModelRenderer Body;
	private final ModelRenderer tenticles;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer tenticles2;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer tenticles3;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer cube_r16;

	public ModelSpectercum() {
		textureWidth = 320;
		textureHeight = 320;

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 24.0F, 0.0F);
		Body.setTextureOffset(22, 100).addBox(-34.0F, -69.0F, -32.0F, 69.0F, 69.0F, 80.0F, 0.0F, false);
		Body.setTextureOffset(0, 0).addBox(-24.0F, -60.0F, -70.0F, 50.0F, 50.0F, 50.0F, 0.0F, false);

		tenticles = new ModelRenderer(this);
		tenticles.setRotationPoint(0.0F, 24.0F, 0.0F);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(23.0F, -67.0F, 48.0F);
		tenticles.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.1309F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(0, 189).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 128.0F, 0.0F, false);
		cube_r1.setTextureOffset(0, 189).addBox(-47.0F, -1.0F, -1.0F, 2.0F, 2.0F, 128.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(33.0F, -67.0F, 48.0F);
		tenticles.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.1745F, 0.2618F, 0.0F);
		cube_r2.setTextureOffset(0, 189).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 128.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(13.0F, -67.0F, 48.0F);
		tenticles.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.1309F, 0.0F, 0.0F);
		cube_r3.setTextureOffset(0, 189).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 128.0F, 0.0F, false);
		cube_r3.setTextureOffset(0, 189).addBox(-27.0F, -1.0F, -1.0F, 2.0F, 2.0F, 128.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, -67.0F, 48.0F);
		tenticles.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.0873F, 0.0F, 0.0F);
		cube_r4.setTextureOffset(0, 189).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 128.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-32.0F, -67.0F, 48.0F);
		tenticles.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.1745F, -0.2618F, 0.0F);
		cube_r5.setTextureOffset(0, 189).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 128.0F, 0.0F, false);

		tenticles2 = new ModelRenderer(this);
		tenticles2.setRotationPoint(0.0F, 88.0F, 0.0F);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(23.0F, -67.0F, 48.0F);
		tenticles2.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.1309F, 0.0F, 0.0F);
		cube_r6.setTextureOffset(0, 189).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 128.0F, 0.0F, false);
		cube_r6.setTextureOffset(0, 189).addBox(-47.0F, -1.0F, -1.0F, 2.0F, 2.0F, 128.0F, 0.0F, false);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(33.0F, -67.0F, 48.0F);
		tenticles2.addChild(cube_r7);
		setRotationAngle(cube_r7, -0.1745F, 0.2618F, 0.0F);
		cube_r7.setTextureOffset(0, 189).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 128.0F, 0.0F, false);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(13.0F, -67.0F, 48.0F);
		tenticles2.addChild(cube_r8);
		setRotationAngle(cube_r8, -0.1309F, 0.0F, 0.0F);
		cube_r8.setTextureOffset(0, 189).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 128.0F, 0.0F, false);
		cube_r8.setTextureOffset(0, 189).addBox(-27.0F, -1.0F, -1.0F, 2.0F, 2.0F, 128.0F, 0.0F, false);

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(0.0F, -67.0F, 48.0F);
		tenticles2.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0873F, 0.0F, 0.0F);
		cube_r9.setTextureOffset(0, 189).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 128.0F, 0.0F, false);

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-32.0F, -67.0F, 48.0F);
		tenticles2.addChild(cube_r10);
		setRotationAngle(cube_r10, -0.1745F, -0.2618F, 0.0F);
		cube_r10.setTextureOffset(0, 189).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 128.0F, 0.0F, false);

		tenticles3 = new ModelRenderer(this);
		tenticles3.setRotationPoint(0.0F, 54.0F, 0.0F);
		tenticles3.setTextureOffset(0, 189).addBox(-1.0F, -68.0F, 47.0F, 2.0F, 2.0F, 128.0F, 0.0F, false);

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(0.0F, 0.0F, 48.0F);
		tenticles3.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.1309F, 0.0F);
		cube_r11.setTextureOffset(0, 189).addBox(22.0F, -68.0F, -1.0F, 2.0F, 2.0F, 128.0F, 0.0F, false);

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(0.0F, 0.0F, 48.0F);
		tenticles3.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, 0.1745F, 0.0F);
		cube_r12.setTextureOffset(0, 189).addBox(32.0F, -68.0F, -1.0F, 2.0F, 2.0F, 128.0F, 0.0F, false);

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(13.0F, -67.0F, 48.0F);
		tenticles3.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, 0.0436F, 0.0F);
		cube_r13.setTextureOffset(0, 189).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 128.0F, 0.0F, false);

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-13.0F, -67.0F, 48.0F);
		tenticles3.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, -0.0436F, 0.0F);
		cube_r14.setTextureOffset(0, 189).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 128.0F, 0.0F, false);

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(-23.0F, -67.0F, 48.0F);
		tenticles3.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, -0.0873F, 0.0F);
		cube_r15.setTextureOffset(0, 189).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 128.0F, 0.0F, false);

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(-32.0F, -67.0F, 48.0F);
		tenticles3.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, -0.1745F, 0.0F);
		cube_r16.setTextureOffset(0, 189).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 128.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		Body.render(matrixStack, buffer, packedLight, packedOverlay);
		tenticles.render(matrixStack, buffer, packedLight, packedOverlay);
		tenticles2.render(matrixStack, buffer, packedLight, packedOverlay);
		tenticles3.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.tenticles2.rotateAngleY = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.tenticles.rotateAngleY = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.tenticles3.rotateAngleY = f3 / (180F / (float) Math.PI);
	}
}