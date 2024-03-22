package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import exp.fluffynuar.truedarkness.init.TruedarknessModItems;

public class MonarchCooldownProcProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof Player _plrCldRem0 ? _plrCldRem0.getCooldowns().getCooldownPercent(TruedarknessModItems.ECHO_WINGS.get(), 0f) * 100 : 0) != 0) {
			return true;
		}
		return false;
	}
}
