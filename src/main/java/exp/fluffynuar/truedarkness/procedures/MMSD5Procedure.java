package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import exp.fluffynuar.truedarkness.init.TruedarknessModItems;

public class MMSD5Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getString("spell")).equals("potion")
				|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == TruedarknessModItems.SPELL_POTION.get()) && WingsEquipProcedure.execute(entity)) {
			return true;
		}
		return false;
	}
}
