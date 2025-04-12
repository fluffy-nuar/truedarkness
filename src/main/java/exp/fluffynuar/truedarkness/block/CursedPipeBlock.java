
package exp.fluffynuar.truedarkness.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.DirectionalBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.Containers;
import net.minecraft.util.RandomSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import exp.fluffynuar.truedarkness.procedures.CursedPipePriRazmieshchieniiSushchnostiuProcedure;
import exp.fluffynuar.truedarkness.procedures.CursedPipePriObnovlieniiTikaProcedure;
import exp.fluffynuar.truedarkness.block.entity.CursedPipeBlockEntity;

public class CursedPipeBlock extends Block implements SimpleWaterloggedBlock, EntityBlock {
	public static final IntegerProperty BLOCKSTATE = IntegerProperty.create("blockstate", 0, 3);
	public static final DirectionProperty FACING = DirectionalBlock.FACING;
	public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

	public CursedPipeBlock() {
		super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.LANTERN).strength(1f, 10f).lightLevel(s -> (new Object() {
			public int getLightLevel() {
				if (s.getValue(BLOCKSTATE) == 1)
					return 0;
				if (s.getValue(BLOCKSTATE) == 2)
					return 0;
				if (s.getValue(BLOCKSTATE) == 3)
					return 0;
				return 0;
			}
		}.getLightLevel())).requiresCorrectToolForDrops().noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
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
		if (state.getValue(BLOCKSTATE) == 1) {
			return switch (state.getValue(FACING)) {
				default -> Shapes.or(box(5, 5, 1, 11, 11, 16), box(4, 4, 2, 12, 12, 3), box(4, 4, 0, 12, 12, 1));
				case NORTH -> Shapes.or(box(5, 5, 0, 11, 11, 15), box(4, 4, 13, 12, 12, 14), box(4, 4, 15, 12, 12, 16));
				case EAST -> Shapes.or(box(1, 5, 5, 16, 11, 11), box(2, 4, 4, 3, 12, 12), box(0, 4, 4, 1, 12, 12));
				case WEST -> Shapes.or(box(0, 5, 5, 15, 11, 11), box(13, 4, 4, 14, 12, 12), box(15, 4, 4, 16, 12, 12));
				case UP -> Shapes.or(box(5, 1, 5, 11, 16, 11), box(4, 2, 4, 12, 3, 12), box(4, 0, 4, 12, 1, 12));
				case DOWN -> Shapes.or(box(5, 0, 5, 11, 15, 11), box(4, 13, 4, 12, 14, 12), box(4, 15, 4, 12, 16, 12));
			};
		}
		if (state.getValue(BLOCKSTATE) == 2) {
			return switch (state.getValue(FACING)) {
				default -> Shapes.or(box(5, 5, 0, 11, 11, 15), box(4, 4, 13, 12, 12, 14), box(4, 4, 15, 12, 12, 16));
				case NORTH -> Shapes.or(box(5, 5, 1, 11, 11, 16), box(4, 4, 2, 12, 12, 3), box(4, 4, 0, 12, 12, 1));
				case EAST -> Shapes.or(box(0, 5, 5, 15, 11, 11), box(13, 4, 4, 14, 12, 12), box(15, 4, 4, 16, 12, 12));
				case WEST -> Shapes.or(box(1, 5, 5, 16, 11, 11), box(2, 4, 4, 3, 12, 12), box(0, 4, 4, 1, 12, 12));
				case UP -> Shapes.or(box(5, 0, 5, 11, 15, 11), box(4, 13, 4, 12, 14, 12), box(4, 15, 4, 12, 16, 12));
				case DOWN -> Shapes.or(box(5, 1, 5, 11, 16, 11), box(4, 2, 4, 12, 3, 12), box(4, 0, 4, 12, 1, 12));
			};
		}
		if (state.getValue(BLOCKSTATE) == 3) {
			return switch (state.getValue(FACING)) {
				default -> box(5, 5, 0, 11, 11, 16);
				case NORTH -> box(5, 5, 0, 11, 11, 16);
				case EAST -> box(0, 5, 5, 16, 11, 11);
				case WEST -> box(0, 5, 5, 16, 11, 11);
				case UP -> box(5, 0, 5, 11, 16, 11);
				case DOWN -> box(5, 0, 5, 11, 16, 11);
			};
		}
		return switch (state.getValue(FACING)) {
			default -> Shapes.or(box(5, 5, 1, 11, 11, 15), box(4, 4, 13, 12, 12, 14), box(4, 4, 2, 12, 12, 3), box(4, 4, 0, 12, 12, 1), box(4, 4, 15, 12, 12, 16));
			case NORTH -> Shapes.or(box(5, 5, 1, 11, 11, 15), box(4, 4, 2, 12, 12, 3), box(4, 4, 13, 12, 12, 14), box(4, 4, 15, 12, 12, 16), box(4, 4, 0, 12, 12, 1));
			case EAST -> Shapes.or(box(1, 5, 5, 15, 11, 11), box(13, 4, 4, 14, 12, 12), box(2, 4, 4, 3, 12, 12), box(0, 4, 4, 1, 12, 12), box(15, 4, 4, 16, 12, 12));
			case WEST -> Shapes.or(box(1, 5, 5, 15, 11, 11), box(2, 4, 4, 3, 12, 12), box(13, 4, 4, 14, 12, 12), box(15, 4, 4, 16, 12, 12), box(0, 4, 4, 1, 12, 12));
			case UP -> Shapes.or(box(5, 1, 5, 11, 15, 11), box(4, 13, 4, 12, 14, 12), box(4, 2, 4, 12, 3, 12), box(4, 0, 4, 12, 1, 12), box(4, 15, 4, 12, 16, 12));
			case DOWN -> Shapes.or(box(5, 1, 5, 11, 15, 11), box(4, 2, 4, 12, 3, 12), box(4, 13, 4, 12, 14, 12), box(4, 15, 4, 12, 16, 12), box(4, 0, 4, 12, 1, 12));
		};
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		super.createBlockStateDefinition(builder);
		builder.add(FACING, WATERLOGGED, BLOCKSTATE);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		boolean flag = context.getLevel().getFluidState(context.getClickedPos()).getType() == Fluids.WATER;
		return super.getStateForPlacement(context).setValue(FACING, context.getClickedFace()).setValue(WATERLOGGED, flag);
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
	public void onPlace(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
		super.onPlace(blockstate, world, pos, oldState, moving);
		world.scheduleTick(pos, this, 1);
	}

	@Override
	public void tick(BlockState blockstate, ServerLevel world, BlockPos pos, RandomSource random) {
		super.tick(blockstate, world, pos, random);
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		CursedPipePriObnovlieniiTikaProcedure.execute(world, x, y, z, blockstate);
		world.scheduleTick(pos, this, 1);
	}

	@Override
	public void setPlacedBy(Level world, BlockPos pos, BlockState blockstate, LivingEntity entity, ItemStack itemstack) {
		super.setPlacedBy(world, pos, blockstate, entity, itemstack);
		CursedPipePriRazmieshchieniiSushchnostiuProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
	}

	@Override
	public MenuProvider getMenuProvider(BlockState state, Level worldIn, BlockPos pos) {
		BlockEntity tileEntity = worldIn.getBlockEntity(pos);
		return tileEntity instanceof MenuProvider menuProvider ? menuProvider : null;
	}

	@Override
	public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
		return new CursedPipeBlockEntity(pos, state);
	}

	@Override
	public boolean triggerEvent(BlockState state, Level world, BlockPos pos, int eventID, int eventParam) {
		super.triggerEvent(state, world, pos, eventID, eventParam);
		BlockEntity blockEntity = world.getBlockEntity(pos);
		return blockEntity == null ? false : blockEntity.triggerEvent(eventID, eventParam);
	}

	@Override
	public void onRemove(BlockState state, Level world, BlockPos pos, BlockState newState, boolean isMoving) {
		if (state.getBlock() != newState.getBlock()) {
			BlockEntity blockEntity = world.getBlockEntity(pos);
			if (blockEntity instanceof CursedPipeBlockEntity be) {
				Containers.dropContents(world, pos, be);
				world.updateNeighbourForOutputSignal(pos, this);
			}
			super.onRemove(state, world, pos, newState, isMoving);
		}
	}

	@Override
	public boolean hasAnalogOutputSignal(BlockState state) {
		return true;
	}

	@Override
	public int getAnalogOutputSignal(BlockState blockState, Level world, BlockPos pos) {
		BlockEntity tileentity = world.getBlockEntity(pos);
		if (tileentity instanceof CursedPipeBlockEntity be)
			return AbstractContainerMenu.getRedstoneSignalFromContainer(be);
		else
			return 0;
	}
}
