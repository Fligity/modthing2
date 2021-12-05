package net.mcreator.biomesohplanty.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.biomesohplanty.BiomesOhPlantyModVariables;
import net.mcreator.biomesohplanty.BiomesOhPlantyMod;

import java.util.Map;
import java.util.HashMap;

public class AmbProcedure {
	@Mod.EventBusSubscriber
	private static class GlobalTrigger {
		@SubscribeEvent
		public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
			if (event.phase == TickEvent.Phase.END) {
				Entity entity = event.player;
				World world = entity.world;
				double i = entity.getPosX();
				double j = entity.getPosY();
				double k = entity.getPosZ();
				Map<String, Object> dependencies = new HashMap<>();
				dependencies.put("x", i);
				dependencies.put("y", j);
				dependencies.put("z", k);
				dependencies.put("world", world);
				dependencies.put("entity", entity);
				dependencies.put("event", event);
				executeProcedure(dependencies);
			}
		}
	}
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				BiomesOhPlantyMod.LOGGER.warn("Failed to load dependency entity for procedure Amb!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				BiomesOhPlantyMod.LOGGER.warn("Failed to load dependency x for procedure Amb!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				BiomesOhPlantyMod.LOGGER.warn("Failed to load dependency y for procedure Amb!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				BiomesOhPlantyMod.LOGGER.warn("Failed to load dependency z for procedure Amb!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				BiomesOhPlantyMod.LOGGER.warn("Failed to load dependency world for procedure Amb!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		double AmbientSelector = 0;
		double AmbientTimer = 0;
		if ((entity instanceof PlayerEntity)) {
			System.out.println(((entity.getCapability(BiomesOhPlantyModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new BiomesOhPlantyModVariables.PlayerVariables())).Ambient));
			{
				double _setval = (double) (((entity.getCapability(BiomesOhPlantyModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new BiomesOhPlantyModVariables.PlayerVariables())).Ambient) + 1);
				entity.getCapability(BiomesOhPlantyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Ambient = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if ((((entity.getCapability(BiomesOhPlantyModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new BiomesOhPlantyModVariables.PlayerVariables())).Ambient) == 6000)) {
				System.out.println("going");
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					$_dependencies.put("x", x);
					$_dependencies.put("y", y);
					$_dependencies.put("z", z);
					$_dependencies.put("world", world);
					AmbientProcedure.executeProcedure($_dependencies);
				}
				{
					double _setval = (double) 0;
					entity.getCapability(BiomesOhPlantyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Ambient = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
	}
}
