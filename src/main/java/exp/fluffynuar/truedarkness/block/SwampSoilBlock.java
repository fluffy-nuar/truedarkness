
package exp.fluffynuar.truedarkness.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

public class SwampSoilBlock extends Block {
	public SwampSoilBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.MUD).strength(1f, 10f).speedFactor(0.8f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}
