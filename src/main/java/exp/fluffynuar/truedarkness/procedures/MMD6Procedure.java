package exp.fluffynuar.truedarkness.procedures;

import top.theillusivec4.curios.api.CuriosApi;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import exp.fluffynuar.truedarkness.network.TruedarknessModVariables;
import exp.fluffynuar.truedarkness.init.TruedarknessModItems;

public class MMD6Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == TruedarknessModItems.SPELL_EYE.get() && !WingsNoneEquippedProcedure.execute(entity)
				|| ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getString("spell")).equals("eye") && !WingsNoneEquippedProcedure.execute(entity)
				|| (("" + (entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).magic_down).equals("eye") && entity instanceof LivingEntity lv
						? CuriosApi.getCuriosHelper().findEquippedCurio(TruedarknessModItems.ECHO_WINGS.get(), lv).isPresent()
						: false)) {
			return true;
		}
		return false;
	}
}
