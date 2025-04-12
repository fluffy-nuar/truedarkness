package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import exp.fluffynuar.truedarkness.network.TruedarknessModVariables;
import exp.fluffynuar.truedarkness.init.TruedarknessModMobEffects;

public class ReactorRadientPriNalozhieniiEffiektaProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Faction).equals("corrupt")
				&& !(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
			if (entity instanceof Player _player) {
				_player.getAbilities().mayfly = ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(TruedarknessModMobEffects.REACTOR_RADIENT.get())
						? _livEnt.getEffect(TruedarknessModMobEffects.REACTOR_RADIENT.get()).getDuration()
						: 0) > 9);
				_player.onUpdateAbilities();
			}
			if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(TruedarknessModMobEffects.REACTOR_RADIENT.get()) ? _livEnt.getEffect(TruedarknessModMobEffects.REACTOR_RADIENT.get()).getDuration() : 0) < 5) {
				if (entity instanceof Player _player) {
					_player.getAbilities().flying = ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(TruedarknessModMobEffects.REACTOR_RADIENT.get())
							? _livEnt.getEffect(TruedarknessModMobEffects.REACTOR_RADIENT.get()).getDuration()
							: 0) > 5);
					_player.onUpdateAbilities();
				}
			}
		}
	}
}
