package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import exp.fluffynuar.truedarkness.network.TruedarknessModVariables;
import exp.fluffynuar.truedarkness.init.TruedarknessModMobEffects;

public class ReactorRadientKazhdyiTikVoVriemiaEffiektaProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (!((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Faction).equals("corrupt")) {
			if (entity.isSprinting()) {
				entity.setSprinting((!(entity instanceof LivingEntity _livEnt1 && _livEnt1.hasEffect(TruedarknessModMobEffects.REACTOR_RADIENT.get()))));
			}
			if (entity.isShiftKeyDown()) {
				entity.setShiftKeyDown((!(entity instanceof LivingEntity _livEnt4 && _livEnt4.hasEffect(TruedarknessModMobEffects.REACTOR_RADIENT.get()))));
			}
			if (entity.getAirSupply() <= 1) {
				entity.setAirSupply(0);
			}
		}
		if (((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Faction).equals("corrupt")
				&& !(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
			if (entity instanceof Player _player) {
				_player.getAbilities().mayfly = ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(TruedarknessModMobEffects.REACTOR_RADIENT.get())
						? _livEnt.getEffect(TruedarknessModMobEffects.REACTOR_RADIENT.get()).getDuration()
						: 0) > 9);
				_player.onUpdateAbilities();
			}
		}
	}
}
