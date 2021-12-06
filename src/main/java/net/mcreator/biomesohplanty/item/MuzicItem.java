
package net.mcreator.biomesohplanty.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;

import net.mcreator.biomesohplanty.BiomesOhPlantyModElements;

@BiomesOhPlantyModElements.ModElement.Tag
public class MuzicItem extends BiomesOhPlantyModElements.ModElement {
	@ObjectHolder("biomes_oh_planty:muzic")
	public static final Item block = null;
	public MuzicItem(BiomesOhPlantyModElements instance) {
		super(instance, 148);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}
	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, BiomesOhPlantyModElements.sounds.get(new ResourceLocation("biomes_oh_planty:bacon2")),
					new Item.Properties().group(ItemGroup.MISC).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("muzic");
		}
	}
}
