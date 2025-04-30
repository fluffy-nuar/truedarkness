package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

import exp.fluffynuar.truedarkness.network.TruedarknessModVariables;

public class CorruptedRemnantUsingPriNalozhieniiEffiektaProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		{
			double _setval = entity.getX();
			entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.Remnant_x = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			double _setval = entity.getY();
			entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.Remnant_y = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			double _setval = entity.getZ();
			entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.Remnant_z = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			double _setval = entity.getLookAngle().x;
			entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.Remnant_vx = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			double _setval = entity.getLookAngle().y;
			entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.Remnant_vy = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			double _setval = entity.getLookAngle().z;
			entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.Remnant_vz = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			double _setval = entity.getXRot();
			entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.Remnant_head = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			double _setval = entity.getYRot();
			entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.Remnant_axis = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.LARGE_SMOKE, ((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Remnant_x),
					((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Remnant_y),
					((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Remnant_z), 20, 0.1, 0.1, 0.1, 0.3);
	}
}
