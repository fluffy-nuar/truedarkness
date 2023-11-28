
package exp.fluffynuar.truedarkness.block;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.storage.loot.LootParams;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import java.util.List;
import java.util.Collections;

public class TableclothBlock extends Block implements SimpleWaterloggedBlock {
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
	public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

	public TableclothBlock() {
		super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.WOOL).strength(-1, 3600000).noOcclusion().hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true)
				.isRedstoneConductor((bs, br, bp) -> false));
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(WATERLOGGED, false));
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return state.getFluidState().isEmpty();
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.empty();
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return switch (state.getValue(FACING)) {
			default -> Shapes.or(box(-0.2, -10.2, -0.2, 16.2, 0.2, 0.2), box(-0.2, -10.2, 15.8, 16.2, 0.2, 16.2), box(-0.2, -10.2, -0.2, 0.2, 0.2, 16.2), box(-0.2, -0.2, -0.2, 16.2, 0.2, 16.2), box(15.8, -10.2, -0.2, 16.2, 0.2, 16.2),
					box(10.7, -5.3, 10.7, 16.3, 0.3, 16.3), box(10.7, -5.3, -0.3, 16.3, 0.3, 5.3), box(-0.3, -5.3, -0.3, 5.3, 0.3, 5.3), box(-0.3, -5.3, 10.7, 5.3, 0.3, 16.3), box(9, 0.2, 1, 15, 1.2, 10), box(9, 2.2, 1, 15, 3.2, 10),
					box(14, 1.2, 1, 15, 2.2, 10), box(10, 1.2, 2, 14, 2.2, 9), box(2.6, 0.2, 8.6, 8.4, 5, 14.4), box(3.6, 5, 9.6, 7.4, 6.8, 13.4), box(3, 0, 9, 8, 4, 14));
			case NORTH -> Shapes.or(box(-0.2, -10.2, 15.8, 16.2, 0.2, 16.2), box(-0.2, -10.2, -0.2, 16.2, 0.2, 0.2), box(15.8, -10.2, -0.2, 16.2, 0.2, 16.2), box(-0.2, -0.2, -0.2, 16.2, 0.2, 16.2), box(-0.2, -10.2, -0.2, 0.2, 0.2, 16.2),
					box(-0.3, -5.3, -0.3, 5.3, 0.3, 5.3), box(-0.3, -5.3, 10.7, 5.3, 0.3, 16.3), box(10.7, -5.3, 10.7, 16.3, 0.3, 16.3), box(10.7, -5.3, -0.3, 16.3, 0.3, 5.3), box(1, 0.2, 6, 7, 1.2, 15), box(1, 2.2, 6, 7, 3.2, 15),
					box(1, 1.2, 6, 2, 2.2, 15), box(2, 1.2, 7, 6, 2.2, 14), box(7.6, 0.2, 1.6, 13.4, 5, 7.4), box(8.6, 5, 2.6, 12.4, 6.8, 6.4), box(8, 0, 2, 13, 4, 7));
			case EAST -> Shapes.or(box(-0.2, -10.2, -0.2, 0.2, 0.2, 16.2), box(15.8, -10.2, -0.2, 16.2, 0.2, 16.2), box(-0.2, -10.2, 15.8, 16.2, 0.2, 16.2), box(-0.2, -0.2, -0.2, 16.2, 0.2, 16.2), box(-0.2, -10.2, -0.2, 16.2, 0.2, 0.2),
					box(10.7, -5.3, -0.3, 16.3, 0.3, 5.3), box(-0.3, -5.3, -0.3, 5.3, 0.3, 5.3), box(-0.3, -5.3, 10.7, 5.3, 0.3, 16.3), box(10.7, -5.3, 10.7, 16.3, 0.3, 16.3), box(1, 0.2, 1, 10, 1.2, 7), box(1, 2.2, 1, 10, 3.2, 7),
					box(1, 1.2, 1, 10, 2.2, 2), box(2, 1.2, 2, 9, 2.2, 6), box(8.6, 0.2, 7.6, 14.4, 5, 13.4), box(9.6, 5, 8.6, 13.4, 6.8, 12.4), box(9, 0, 8, 14, 4, 13));
			case WEST -> Shapes.or(box(15.8, -10.2, -0.2, 16.2, 0.2, 16.2), box(-0.2, -10.2, -0.2, 0.2, 0.2, 16.2), box(-0.2, -10.2, -0.2, 16.2, 0.2, 0.2), box(-0.2, -0.2, -0.2, 16.2, 0.2, 16.2), box(-0.2, -10.2, 15.8, 16.2, 0.2, 16.2),
					box(-0.3, -5.3, 10.7, 5.3, 0.3, 16.3), box(10.7, -5.3, 10.7, 16.3, 0.3, 16.3), box(10.7, -5.3, -0.3, 16.3, 0.3, 5.3), box(-0.3, -5.3, -0.3, 5.3, 0.3, 5.3), box(6, 0.2, 9, 15, 1.2, 15), box(6, 2.2, 9, 15, 3.2, 15),
					box(6, 1.2, 14, 15, 2.2, 15), box(7, 1.2, 10, 14, 2.2, 14), box(1.6, 0.2, 2.6, 7.4, 5, 8.4), box(2.6, 5, 3.6, 6.4, 6.8, 7.4), box(2, 0, 3, 7, 4, 8));
		};
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(FACING, WATERLOGGED);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		boolean flag = context.getLevel().getFluidState(context.getClickedPos()).getType() == Fluids.WATER;
		return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite()).setValue(WATERLOGGED, flag);
	}

	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}

	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
	}

	@Override
	public FluidState getFluidState(BlockState state) {
		return state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state);
	}

	@Override
	public BlockState updateShape(BlockState state, Direction facing, BlockState facingState, LevelAccessor world, BlockPos currentPos, BlockPos facingPos) {
		if (state.getValue(WATERLOGGED)) {
			world.scheduleTick(currentPos, Fluids.WATER, Fluids.WATER.getTickDelay(world));
		}
		return super.updateShape(state, facing, facingState, world, currentPos, facingPos);
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootParams.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}
}
