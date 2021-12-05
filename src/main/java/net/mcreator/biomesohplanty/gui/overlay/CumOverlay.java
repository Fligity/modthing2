
package net.mcreator.biomesohplanty.gui.overlay;

@Mod.EventBusSubscriber
public class CumOverlay {

	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent(priority = EventPriority.NORMAL)
	public static void eventHandler(RenderGameOverlayEvent.Post event) {
		if (event.getType() == RenderGameOverlayEvent.ElementType.HELMET) {
			int w = event.getWindow().getScaledWidth();
			int h = event.getWindow().getScaledHeight();

			int posX = w / 2;
			int posY = h / 2;

			World _world = null;
			double _x = 0;
			double _y = 0;
			double _z = 0;

			PlayerEntity entity = Minecraft.getInstance().player;
			if (entity != null) {
				_world = entity.world;
				_x = entity.getPosX();
				_y = entity.getPosY();
				_z = entity.getPosZ();
			}

			World world = _world;
			double x = _x;
			double y = _y;
			double z = _z;

			if (true) {

				Minecraft.getInstance().fontRenderer.drawString(event.getMatrixStack(), "Welcome to the cumzone", posX + -334, posY + -172, -1);
				Minecraft.getInstance().fontRenderer.drawString(event.getMatrixStack(), "Alpha", posX + 185, posY + 105, -1);
			}

		}
	}

}
