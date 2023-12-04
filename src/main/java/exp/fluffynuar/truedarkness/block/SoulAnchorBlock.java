
package exp.fluffynuar.truedarkness.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.storage.loot.LootParams;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.material.FluidState;
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
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import java.util.List;
import java.util.Collections;

public class SoulAnchorBlock extends Block implements SimpleWaterloggedBlock {
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
	public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

	public SoulAnchorBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.LANTERN).strength(-1, 3600000).lightLevel(s -> 3).requiresCorrectToolForDrops().noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
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
			default -> Shapes.or(box(6, 0, 6, 10, 32, 10), box(5, 1, 5, 11, 8, 11), box(11, 2, 6, 13, 7, 10), box(3, 2, 6, 5, 7, 10), box(5, 26, 5, 11, 30, 11), box(11, 27, 6, 14, 29, 10), box(2, 27, 6, 5, 29, 10), box(10, 1, 6.5, 15, 6, 9.5),
					box(15, 3, 7, 17, 6, 9), box(17, 2, 6.5, 19, 9, 9.5), box(1, 1, 6.5, 6, 6, 9.5), box(-1, 3, 7, 1, 6, 9), box(-3, 2, 6.5, -1, 9, 9.5));
			case NORTH -> Shapes.or(box(6, 0, 6, 10, 32, 10), box(5, 1, 5, 11, 8, 11), box(3, 2, 6, 5, 7, 10), box(11, 2, 6, 13, 7, 10), box(5, 26, 5, 11, 30, 11), box(2, 27, 6, 5, 29, 10), box(11, 27, 6, 14, 29, 10), box(1, 1, 6.5, 6, 6, 9.5),
					box(-1, 3, 7, 1, 6, 9), box(-3, 2, 6.5, -1, 9, 9.5), box(10, 1, 6.5, 15, 6, 9.5), box(15, 3, 7, 17, 6, 9), box(17, 2, 6.5, 19, 9, 9.5));
			case EAST -> Shapes.or(box(6, 0, 6, 10, 32, 10), box(5, 1, 5, 11, 8, 11), box(6, 2, 3, 10, 7, 5), box(6, 2, 11, 10, 7, 13), box(5, 26, 5, 11, 30, 11), box(6, 27, 2, 10, 29, 5), box(6, 27, 11, 10, 29, 14), box(6.5, 1, 1, 9.5, 6, 6),
					box(7, 3, -1, 9, 6, 1), box(6.5, 2, -3, 9.5, 9, -1), box(6.5, 1, 10, 9.5, 6, 15), box(7, 3, 15, 9, 6, 17), box(6.5, 2, 17, 9.5, 9, 19));
			case WEST -> Shapes.or(box(6, 0, 6, 10, 32, 10), box(5, 1, 5, 11, 8, 11), box(6, 2, 11, 10, 7, 13), box(6, 2, 3, 10, 7, 5), box(5, 26, 5, 11, 30, 11), box(6, 27, 11, 10, 29, 14), box(6, 27, 2, 10, 29, 5), box(6.5, 1, 10, 9.5, 6, 15),
					box(7, 3, 15, 9, 6, 17), box(6.5, 2, 17, 9.5, 9, 19), box(6.5, 1, 1, 9.5, 6, 6), box(7, 3, -1, 9, 6, 1), box(6.5, 2, -3, 9.5, 9, -1));
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
	public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
		if (player.getInventory().getSelected().getItem() instanceof PickaxeItem tieredItem)
			return tieredItem.getTier().getLevel() >= 1;
		return false;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootParams.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}
}
