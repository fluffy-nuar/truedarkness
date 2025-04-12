package exp.fluffynuar.truedarkness.procedures;

public class CooldownShinyEridiumProcedure {
	public static double execute(double stage, String eridium) {
		if (eridium == null)
			return 0;
		if ((eridium).equals("dash")) {
			return 20 + 20 * (6 - stage);
		} else if ((eridium).equals("seer")) {
			return 180 + 40 * (6 - stage);
		} else if ((eridium).equals("undying")) {
			return 260 + 60 * (6 - stage);
		} else if ((eridium).equals("rune")) {
			return 100 + 30 * (6 - stage);
		} else if ((eridium).equals("teleport")) {
			return 120 + 20 * (6 - stage);
		} else if ((eridium).equals("echo")) {
			return 260 + 60 * (6 - stage);
		} else if ((eridium).equals("smelt")) {
			return 240 + 60 * (6 - stage);
		} else if ((eridium).equals("tool")) {
			return 350 + 60 * (6 - stage);
		} else if ((eridium).equals("skull")) {
			return 80 + 80 * (6 - stage);
		} else if ((eridium).equals("light")) {
			return 20 + 20 * (6 - stage);
		}
		return 0;
	}
}
