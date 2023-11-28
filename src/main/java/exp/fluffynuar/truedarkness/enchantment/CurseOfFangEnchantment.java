
package exp.fluffynuar.truedarkness.enchantment;

import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.entity.EquipmentSlot;

public class CurseOfFangEnchantment extends Enchantment {
	public CurseOfFangEnchantment(EquipmentSlot... slots) {
		super(Enchantment.Rarity.COMMON, EnchantmentCategory.WEAPON, slots);
	}

	@Override
	public boolean isCurse() {
		return true;
	}
}
