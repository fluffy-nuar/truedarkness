
package exp.fluffynuar.truedarkness.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import exp.fluffynuar.truedarkness.procedures.TrapSandOfMissingKoghdaSushchnostKhoditPoBlokuProcedure;

public class TrapSandOfMissingBlock extends Block {
	public TrapSandOfMissingBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.SAND).strength(1.2f, 12f).noCollission().friction(0.4f).speedFactor(0.2f).jumpFactor(0.1f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public void attack(BlockState blockstate, Level world, BlockPos pos, Player entity) {
		super.attack(blockstate, world, pos, entity);
		TrapSandOfMissingKoghdaSushchnostKhoditPoBlokuProcedure.execute(world, entity);
	}

	@Override
	public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity) {
		super.entityInside(blockstate, world, pos, entity);
		TrapSandOfMissingKoghdaSushchnostKhoditPoBlokuProcedure.execute(world, entity);
	}

	@Override
	public void stepOn(Level world, BlockPos pos, BlockState blockstate, Entity entity) {
		super.stepOn(world, pos, blockstate, entity);
		TrapSandOfMissingKoghdaSushchnostKhoditPoBlokuProcedure.execute(world, entity);
	}
}
