
package exp.fluffynuar.truedarkness.enchantment;

import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.EquipmentSlot;

import exp.fluffynuar.truedarkness.init.TruedarknessModItems;

public class FastCarvingEnchantment extends Enchantment {
	private static final EnchantmentCategory ENCHANTMENT_CATEGORY = EnchantmentCategory.create("truedarkness_fast_carving",
			item -> Ingredient.of(new ItemStack(TruedarknessModItems.CARVING_KNIFE.get()), new ItemStack(TruedarknessModItems.ECHO_CARVING_KNIFE.get()), new ItemStack(TruedarknessModItems.ERIDIUM_CARVING_KNIFE.get())).test(new ItemStack(item)));

	public FastCarvingEnchantment() {
		super(Enchantment.Rarity.COMMON, ENCHANTMENT_CATEGORY, new EquipmentSlot[]{EquipmentSlot.MAINHAND});
	}

	@Override
	public int getMinCost(int level) {
		return 1 + level * 10;
	}

	@Override
	public int getMaxCost(int level) {
		return 6 + level * 10;
	}

	@Override
	public int getMaxLevel() {
		return 2;
	}
}
