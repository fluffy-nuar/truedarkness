package exp.fluffynuar.truedarkness.procedures;

import top.theillusivec4.curios.api.CuriosApi;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import exp.fluffynuar.truedarkness.init.TruedarknessModItems;

public class MonarchbarSandglassProcProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(TruedarknessModItems.ECHO_SANDGLASS.get(), lv).isPresent() : false) {
			return true;
		}
		return false;
	}
}
