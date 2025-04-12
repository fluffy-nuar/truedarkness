package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

import exp.fluffynuar.truedarkness.network.TruedarknessModVariables;

public class EchoHeartWhileBaubleIsEquippedTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (Math.sqrt(Math
				.pow(entity.getX() - ((entity instanceof ServerPlayer _player && !_player.level().isClientSide())
						? ((_player.getRespawnDimension().equals(_player.level().dimension()) && _player.getRespawnPosition() != null) ? _player.getRespawnPosition().getX() : _player.level().getLevelData().getXSpawn())
						: 0), 2)
				+ Math.pow(entity.getY() - ((entity instanceof ServerPlayer _player && !_player.level().isClientSide())
						? ((_player.getRespawnDimension().equals(_player.level().dimension()) && _player.getRespawnPosition() != null) ? _player.getRespawnPosition().getY() : _player.level().getLevelData().getYSpawn())
						: 0), 2)
				+ Math.pow(entity.getZ() - ((entity instanceof ServerPlayer _player && !_player.level().isClientSide())
						? ((_player.getRespawnDimension().equals(_player.level().dimension()) && _player.getRespawnPosition() != null) ? _player.getRespawnPosition().getZ() : _player.level().getLevelData().getZSpawn())
						: 0), 2)) <= 8) {
			if ((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).SculkedMana != 8) {
				{
					double _setval = 8;
					entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.SculkedMana = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
	}
}
