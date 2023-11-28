package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

public class ArfinNaturalnoieUsloviiePoiavlieniiaSushchnostiProcedure {
	public static boolean execute() {
		if (Mth.nextInt(RandomSource.create(), 1, 10) <= 5) {
			return true;
		}
		return false;
	}
}
