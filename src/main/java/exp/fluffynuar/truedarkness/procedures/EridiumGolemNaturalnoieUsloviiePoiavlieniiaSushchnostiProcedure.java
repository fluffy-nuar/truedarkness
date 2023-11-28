package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

public class EridiumGolemNaturalnoieUsloviiePoiavlieniiaSushchnostiProcedure {
	public static boolean execute() {
		if (Mth.nextInt(RandomSource.create(), 1, 10) >= 6) {
			return true;
		}
		return false;
	}
}
