
package net.mcreator.biomesohplanty.item;

@BiomesOhPlantyModElements.ModElement.Tag
public class Yharonp2Item extends BiomesOhPlantyModElements.ModElement {

	@ObjectHolder("biomes_oh_planty:yharonp_2")
	public static final Item block = null;

	public Yharonp2Item(BiomesOhPlantyModElements instance) {
		super(instance, 144);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	public static class MusicDiscItemCustom extends MusicDiscItem {

		public MusicDiscItemCustom() {
			super(0, BiomesOhPlantyModElements.sounds.get(new ResourceLocation("biomes_oh_planty:yharon_p2")),
					new Item.Properties().group(ItemGroup.MISC).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("yharonp_2");
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public boolean hasEffect(ItemStack itemstack) {
			return true;
		}

	}

}
