
package net.mcreator.biomesohplanty.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.biomesohplanty.block.HolyPeniswoodPlanksBlock;
import net.mcreator.biomesohplanty.BiomesOhPlantyModElements;

@BiomesOhPlantyModElements.ModElement.Tag
public class HolypeniswoodSwordItem extends BiomesOhPlantyModElements.ModElement {
	@ObjectHolder("biomes_oh_planty:holypeniswood_sword")
	public static final Item block = null;
	public HolypeniswoodSwordItem(BiomesOhPlantyModElements instance) {
		super(instance, 71);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
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
		}, 3, -3f, new Item.Properties().group(ItemGroup.COMBAT)) {
		}.setRegistryName("holypeniswood_sword"));
	}
}
