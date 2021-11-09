package net.mcreator.biomesohplanty.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.effect.LightningBoltEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Entity;

import net.mcreator.biomesohplanty.item.CummingArmorItem;
import net.mcreator.biomesohplanty.BiomesOhPlantyMod;

import java.util.Map;

public class CumcumorHelmetTickEventProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				BiomesOhPlantyMod.LOGGER.warn("Failed to load dependency entity for procedure CumcumorHelmetTickEvent!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				BiomesOhPlantyMod.LOGGER.warn("Failed to load dependency world for procedure CumcumorHelmetTickEvent!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		IWorld world = (IWorld) dependencies.get("world");
		if (((((((entity instanceof LivingEntity)
				? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.fromSlotTypeAndIndex(EquipmentSlotType.Group.ARMOR, (int) 3))
				: ItemStack.EMPTY).getItem() == CummingArmorItem.helmet)
				&& (((entity instanceof LivingEntity)
						? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.fromSlotTypeAndIndex(EquipmentSlotType.Group.ARMOR, (int) 2))
						: ItemStack.EMPTY).getItem() == CummingArmorItem.body))
				&& ((((entity instanceof LivingEntity)
						? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.fromSlotTypeAndIndex(EquipmentSlotType.Group.ARMOR, (int) 1))
						: ItemStack.EMPTY).getItem() == CummingArmorItem.legs)
						&& (((entity instanceof LivingEntity)
								? ((LivingEntity) entity)
										.getItemStackFromSlot(EquipmentSlotType.fromSlotTypeAndIndex(EquipmentSlotType.Group.ARMOR, (int) 0))
								: ItemStack.EMPTY).getItem() == CummingArmorItem.boots)))
				&& (true))) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).clearActivePotions();
		} else {
			if (world instanceof ServerWorld) {
				LightningBoltEntity _ent = EntityType.LIGHTNING_BOLT.create((World) world);
				_ent.moveForced(Vector3d
						.copyCenteredHorizontally(new BlockPos((int) (entity.getPosX()), (int) (entity.getPosY()), (int) (entity.getPosZ()))));
				_ent.setEffectOnly(false);
				((World) world).addEntity(_ent);
			}
		}
	}
}
