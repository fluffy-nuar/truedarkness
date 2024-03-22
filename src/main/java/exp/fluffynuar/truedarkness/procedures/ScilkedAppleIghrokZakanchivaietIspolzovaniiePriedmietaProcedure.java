package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import exp.fluffynuar.truedarkness.network.TruedarknessModVariables;

public class ScilkedAppleIghrokZakanchivaietIspolzovaniiePriedmietaProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (1 + (entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).SculkedMana > 8) {
			{
				double _setval = 8;
				entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.SculkedMana = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(("\u00A73" + Component.translatable("item.truedarkness.echo_harp.mana.max").getString())), true);
		} else {
			{
				double _setval = (entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).SculkedMana + 1;
				entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.SculkedMana = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A73+1"), true);
		}
	}
}
