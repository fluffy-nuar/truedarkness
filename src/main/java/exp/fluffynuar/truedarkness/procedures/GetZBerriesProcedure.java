package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.core.Direction;

public class GetZBerriesProcedure {
	public static double execute(Direction direction) {
		if (direction == null)
			return 0;
		if (direction == Direction.SOUTH) {
			return 1;
		} else if (direction == Direction.NORTH) {
			return -1;
		}
		return 0;
	}
}
