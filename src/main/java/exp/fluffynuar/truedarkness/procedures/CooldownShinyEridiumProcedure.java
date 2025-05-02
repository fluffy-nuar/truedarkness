package exp.fluffynuar.truedarkness.procedures;

public class CooldownShinyEridiumProcedure {
	public static double execute(String perk) {
		if (perk == null)
			return 0;
		if ((perk).equals("stream")) {
			return 2;
		} else if ((perk).equals("smelt")) {
			return 50;
		} else if ((perk).equals("tread")) {
			return 22;
		} else if ((perk).equals("seer")) {
			return 12;
		} else if ((perk).equals("shot")) {
			return 14;
		} else if ((perk).equals("lightning")) {
			return 14;
		} else if ((perk).equals("ringing")) {
			return 34;
		} else if ((perk).equals("fangs")) {
			return 22;
		} else if ((perk).equals("undead")) {
			return 30;
		} else if ((perk).equals("greed")) {
			return 50;
		}
		return 0;
	}
}
