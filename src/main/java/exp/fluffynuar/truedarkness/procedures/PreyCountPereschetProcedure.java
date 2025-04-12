package exp.fluffynuar.truedarkness.procedures;

public class PreyCountPereschetProcedure {
	public static double execute(double number_u) {
		if (number_u * 0.25 < 1 && number_u * 0.25 > -1) {
			return number_u;
		}
		return number_u * 0.25;
	}
}
