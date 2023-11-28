package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import exp.fluffynuar.truedarkness.network.TruedarknessModVariables;
import exp.fluffynuar.truedarkness.TruedarknessMod;

public class EchoStoneKoghdaPriedmietVInvientarieProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		TruedarknessMod.queueServerWork(Mth.nextInt(RandomSource.create(), (int) (20 * 60 * 1), (int) (20 * 60 * 2)), () -> {
			{
				double _setval = (entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).SculkedMana + 2;
				entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.SculkedMana = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			EchoStoneKoghdaPriedmietVInvientarieProcedure.execute(world, entity);
		});
	}
}
