package exp.fluffynuar.truedarkness.procedures;

import top.theillusivec4.curios.api.CuriosApi;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import exp.fluffynuar.truedarkness.network.TruedarknessModVariables;
import exp.fluffynuar.truedarkness.init.TruedarknessModItems;

public class MonarchGUIProcProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(TruedarknessModItems.ECHO_SCROLL.get(), lv).isPresent() : false) {
			if ((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).ScrollToggle) {
				return true;
			}
			return false;
		}
		return false;
	}
}
