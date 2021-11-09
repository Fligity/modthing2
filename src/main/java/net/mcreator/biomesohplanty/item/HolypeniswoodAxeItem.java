
package net.mcreator.biomesohplanty.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import net.mcreator.biomesohplanty.block.HolyPeniswoodPlanksBlock;
import net.mcreator.biomesohplanty.BiomesOhPlantyModElements;

@BiomesOhPlantyModElements.ModElement.Tag
public class HolypeniswoodAxeItem extends BiomesOhPlantyModElements.ModElement {
	@ObjectHolder("biomes_oh_planty:holypeniswood_axe")
	public static final Item block = null;
	public HolypeniswoodAxeItem(BiomesOhPlantyModElements instance) {
		super(instance, 70);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 323;
			}

			public float getEfficiency() {
				return 7f;
			}

			public float getAttackDamage() {
				return 0f;
			}

			public int getHarvestLevel() {
				return 2;
			}

			public int getEnchantability() {
				return 17;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(HolyPeniswoodPlanksBlock.block));
			}
		}, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("holypeniswood_axe"));
	}
}
