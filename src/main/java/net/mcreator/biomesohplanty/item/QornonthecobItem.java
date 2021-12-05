
package net.mcreator.biomesohplanty.item;

@BiomesOhPlantyModElements.ModElement.Tag
public class QornonthecobItem extends BiomesOhPlantyModElements.ModElement {

	@ObjectHolder("biomes_oh_planty:qornonthecob")
	public static final Item block = null;

	public QornonthecobItem(BiomesOhPlantyModElements instance) {
		super(instance, 144);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}

	public static class FoodItemCustom extends Item {

		public FoodItemCustom() {
			super(new Item.Properties().group(ItemGroup.FOOD).maxStackSize(64).rarity(Rarity.UNCOMMON)
					.food((new Food.Builder()).hunger(2).saturation(0.6f).setAlwaysEdible().meat().build()));
			setRegistryName("qornonthecob");
		}

		@Override
		public int getUseDuration(ItemStack stack) {
			return 20;
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.BOW;
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent("yummy"));
		}

	}

}
