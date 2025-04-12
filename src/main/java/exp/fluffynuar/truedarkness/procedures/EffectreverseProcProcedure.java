package exp.fluffynuar.truedarkness.procedures;

public class EffectreverseProcProcedure {
	public static String execute(String effect) {
		if (effect == null)
			return "";
		if ((effect).equals("minecraft:night_vision")) {
			return "minecraft:invisibility";
		} else if ((effect).equals("minecraft:speed")) {
			return "minecraft:slowness";
		} else if ((effect).equals("minecraft:jump_boost")) {
			return "minecraft:slowness";
		}
		return effect;
	}
}
