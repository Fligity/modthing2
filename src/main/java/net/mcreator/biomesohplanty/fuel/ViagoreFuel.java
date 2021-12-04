
package net.mcreator.biomesohplanty.fuel;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;

import net.mcreator.biomesohplanty.item.ViagroreItem;

@Mod.EventBusSubscriber
public class ViagoreFuel {
	@SubscribeEvent
	public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == ViagroreItem.block)
			event.setBurnTime(2000);
	}
}
