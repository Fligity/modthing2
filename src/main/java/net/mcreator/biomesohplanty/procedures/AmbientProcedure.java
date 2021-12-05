package net.mcreator.biomesohplanty.procedures;

public class AmbientProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				BiomesOhPlantyMod.LOGGER.warn("Failed to load dependency entity for procedure Ambient!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				BiomesOhPlantyMod.LOGGER.warn("Failed to load dependency x for procedure Ambient!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				BiomesOhPlantyMod.LOGGER.warn("Failed to load dependency y for procedure Ambient!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				BiomesOhPlantyMod.LOGGER.warn("Failed to load dependency z for procedure Ambient!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				BiomesOhPlantyMod.LOGGER.warn("Failed to load dependency world for procedure Ambient!");
			return;
		}

		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");

		double ambientselec = 0;
		double AmbientSelector = 0;
		{
			double _setval = (double) Math.random();
			entity.getCapability(BiomesOhPlantyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.AmbientS = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		if (((((entity.getCapability(BiomesOhPlantyModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new BiomesOhPlantyModVariables.PlayerVariables())).AmbientS) <= 1)
				&& (((entity.getCapability(BiomesOhPlantyModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new BiomesOhPlantyModVariables.PlayerVariables())).AmbientS) > 0.75))) {
			if (world instanceof World && !world.isRemote()) {
				((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("biomes_oh_planty:bacon2")),
						SoundCategory.NEUTRAL, (float) 1, (float) 1);
			} else {
				((World) world).playSound(x, y, z,
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("biomes_oh_planty:bacon2")),
						SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
			}
		}
		if (((((entity.getCapability(BiomesOhPlantyModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new BiomesOhPlantyModVariables.PlayerVariables())).AmbientS) <= 0.75)
				&& (((entity.getCapability(BiomesOhPlantyModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new BiomesOhPlantyModVariables.PlayerVariables())).AmbientS) > 0.5))) {
			if (world instanceof World && !world.isRemote()) {
				((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
								.getValue(new ResourceLocation("biomes_oh_planty:battlefield-cringe-voicelines")),
						SoundCategory.NEUTRAL, (float) 1, (float) 1);
			} else {
				((World) world).playSound(x, y, z,
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
								.getValue(new ResourceLocation("biomes_oh_planty:battlefield-cringe-voicelines")),
						SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
			}
		}
		if (((((entity.getCapability(BiomesOhPlantyModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new BiomesOhPlantyModVariables.PlayerVariables())).AmbientS) <= 0.5)
				&& (((entity.getCapability(BiomesOhPlantyModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new BiomesOhPlantyModVariables.PlayerVariables())).AmbientS) > 0.25))) {
			if (world instanceof World && !world.isRemote()) {
				((World) world)
						.playSound(null, new BlockPos((int) x, (int) y, (int) z),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
										.getValue(new ResourceLocation("biomes_oh_planty:theeggannouncement")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1);
			} else {
				((World) world).playSound(x, y, z,
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
								.getValue(new ResourceLocation("biomes_oh_planty:theeggannouncement")),
						SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
			}
		}
		if (((((entity.getCapability(BiomesOhPlantyModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new BiomesOhPlantyModVariables.PlayerVariables())).AmbientS) <= 0.25)
				&& (((entity.getCapability(BiomesOhPlantyModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new BiomesOhPlantyModVariables.PlayerVariables())).AmbientS) >= 0))) {
			if (world instanceof World && !world.isRemote()) {
				((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("biomes_oh_planty:pkfire")),
						SoundCategory.NEUTRAL, (float) 1, (float) 1);
			} else {
				((World) world).playSound(x, y, z,
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("biomes_oh_planty:pkfire")),
						SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
			}
		}
	}

}
