
package exp.fluffynuar.truedarkness.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SlabBlock;

public class DustClaySlabBlock extends SlabBlock {
	public DustClaySlabBlock() {
		super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.PACKED_MUD).strength(0.5f).requiresCorrectToolForDrops().dynamicShape());
	}
}
