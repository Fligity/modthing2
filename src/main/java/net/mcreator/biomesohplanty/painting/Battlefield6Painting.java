
package net.mcreator.biomesohplanty.painting;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class Battlefield6Painting {

	@SubscribeEvent
	public static void registerPaintingType(RegistryEvent.Register<PaintingType> event) {
		event.getRegistry().register(new PaintingType(128, 128).setRegistryName("battlefield_6"));
	}

}
