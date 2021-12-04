package net.mcreator.biomesohplanty.entity.renderer;

@OnlyIn(Dist.CLIENT)
public class MyPetRenderer {

	public static class ModelRegisterHandler {

		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(MyPetEntity.entity,
					renderManager -> new MobRenderer(renderManager, new SilverfishModel(), 0.5f) {

						@Override
						public ResourceLocation getEntityTexture(Entity entity) {
							return new ResourceLocation("biomes_oh_planty:textures/sperm.png");
						}
					});

		}
	}

}
