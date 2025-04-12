package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

public class StarsVizualnyiMasshtabChastitsyProcedure {
	public static double execute() {
		return Mth.nextDouble(RandomSource.create(), 1, 2);
	}
}
