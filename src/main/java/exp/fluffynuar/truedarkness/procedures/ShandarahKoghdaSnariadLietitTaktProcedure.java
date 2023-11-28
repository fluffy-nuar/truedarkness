package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.particles.SimpleParticleType;

import exp.fluffynuar.truedarkness.init.TruedarknessModParticleTypes;

public class ShandarahKoghdaSnariadLietitTaktProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.addParticle((SimpleParticleType) (TruedarknessModParticleTypes.CORRUPTED_SPELL.get()), x, y, z, 0, 1, 0);
	}
}
