
package net.mcreator.biomesohplanty.item;

@BiomesOhPlantyModElements.ModElement.Tag
public class CamelbycamelItem extends BiomesOhPlantyModElements.ModElement {

	@ObjectHolder("biomes_oh_planty:camelbycamel")
	public static final Item block = null;

	public CamelbycamelItem(BiomesOhPlantyModElements instance) {
		super(instance, 145);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	public static class MusicDiscItemCustom extends MusicDiscItem {

		public MusicDiscItemCustom() {
			super(0, BiomesOhPlantyModElements.sounds.get(new ResourceLocation("biomes_oh_planty:thatvideo")),
					new Item.Properties().group(ItemGroup.MISC).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("camelbycamel");
		}

	}

}
