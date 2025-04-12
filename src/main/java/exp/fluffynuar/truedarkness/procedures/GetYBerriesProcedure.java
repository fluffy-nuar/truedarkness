package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.core.Direction;

public class GetYBerriesProcedure {
	public static double execute(Direction direction) {
		if (direction == null)
			return 0;
		if (direction == Direction.UP) {
			return 1;
		} else if (direction == Direction.DOWN) {
			return -1;
		}
		return 0;
	}
}
