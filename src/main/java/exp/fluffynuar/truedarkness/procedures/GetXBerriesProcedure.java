package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.core.Direction;

public class GetXBerriesProcedure {
	public static double execute(Direction direction) {
		if (direction == null)
			return 0;
		if (direction == Direction.EAST) {
			return 1;
		} else if (direction == Direction.WEST) {
			return -1;
		}
		return 0;
	}
}
