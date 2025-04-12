
package exp.fluffynuar.truedarkness.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.SoundType;

public class CorruptBricksWallBlock extends WallBlock {
	public CorruptBricksWallBlock() {
		super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.CORAL_BLOCK).strength(1f, 10f).requiresCorrectToolForDrops().dynamicShape().forceSolidOn());
	}
}
