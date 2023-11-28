package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.particles.ParticleTypes;

public class SculkFeatherKoghdaSnariadLietitTaktProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.addParticle(ParticleTypes.SONIC_BOOM, x, y, z, 0, 1, 0);
	}
}
