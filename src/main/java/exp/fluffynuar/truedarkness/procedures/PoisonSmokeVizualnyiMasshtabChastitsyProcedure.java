package exp.fluffynuar.truedarkness.procedures;

public class PoisonSmokeVizualnyiMasshtabChastitsyProcedure {
	public static double execute(double age) {
		return age >= 40 ? ((80 - age) / 40) * 2.5 : 2.5;
	}
}
