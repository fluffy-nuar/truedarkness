
package exp.fluffynuar.truedarkness.enchantment;

import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.entity.EquipmentSlot;

import java.util.List;

public class WorldBlockBreakerEnchantment extends Enchantment {
	public WorldBlockBreakerEnchantment(EquipmentSlot... slots) {
		super(Enchantment.Rarity.VERY_RARE, EnchantmentCategory.DIGGER, slots);
	}

	@Override
	protected boolean checkCompatibility(Enchantment ench) {
		return List.of(Enchantments.MENDING, Enchantments.UNBREAKING, Enchantments.BLOCK_EFFICIENCY, Enchantments.BLOCK_FORTUNE).contains(ench);
	}
}
