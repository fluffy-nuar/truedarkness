
package exp.fluffynuar.truedarkness.block;

import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.level.storage.loot.LootParams;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.block.BonemealableBlock;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.util.RandomSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import java.util.List;
import java.util.Collections;

import exp.fluffynuar.truedarkness.procedures.LightMushroomsUsloviieUspiekhaKostnoiMukiProcedure;
import exp.fluffynuar.truedarkness.procedures.LightMushroomPriNazhatiiPravoiKnopkiMyshiNaRastieniiProcedure;
import exp.fluffynuar.truedarkness.procedures.LightMushroo1msPriUspiekhieKostnoiMukiProcedure;
import exp.fluffynuar.truedarkness.init.TruedarknessModBlocks;

public class LightMushroomsDisableBlock extends FlowerBlock implements BonemealableBlock {
	public LightMushroomsDisableBlock() {
		super(() -> MobEffects.MOVEMENT_SPEED, 0, BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).sound(SoundType.SMALL_DRIPLEAF).instabreak().noCollission().offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY));
	}

	@Override
	public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 100;
	}

	@Override
	public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 60;
	}

	@Override
	public ItemStack getCloneItemStack(BlockState state, HitResult target, BlockGetter world, BlockPos pos, Player player) {
		return new ItemStack(TruedarknessModBlocks.LIGHT_MUSHROOMS_ACTIVE.get());
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootParams.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(TruedarknessModBlocks.LIGHT_MUSHROOMS_ACTIVE.get()));
	}

	@Override
	public boolean mayPlaceOn(BlockState groundState, BlockGetter worldIn, BlockPos pos) {
		return groundState.is(TruedarknessModBlocks.SWAMP_STONE.get()) || groundState.is(TruedarknessModBlocks.SWAMP_DIRT.get()) || groundState.is(TruedarknessModBlocks.SWAMP_TERRACOTA.get()) || groundState.is(TruedarknessModBlocks.SWAMP_MUD.get())
				|| groundState.is(TruedarknessModBlocks.SWAMP_BLACK_SOIL.get()) || groundState.is(TruedarknessModBlocks.SWAMP_SAND.get()) || groundState.is(TruedarknessModBlocks.DARKNITE.get())
				|| groundState.is(TruedarknessModBlocks.COBBLED_DARKNITE.get()) || groundState.is(TruedarknessModBlocks.DARKNITE_BRICKS.get());
	}

	@Override
	public boolean canSurvive(BlockState blockstate, LevelReader worldIn, BlockPos pos) {
		BlockPos blockpos = pos.below();
		BlockState groundState = worldIn.getBlockState(blockpos);
		return this.mayPlaceOn(groundState, worldIn, blockpos);
	}

	@Override
	public InteractionResult use(BlockState blockstate, Level world, BlockPos pos, Player entity, InteractionHand hand, BlockHitResult hit) {
		super.use(blockstate, world, pos, entity, hand, hit);
		LightMushroomPriNazhatiiPravoiKnopkiMyshiNaRastieniiProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ(), entity);
		return InteractionResult.SUCCESS;
	}

	@Override
	public boolean isValidBonemealTarget(LevelReader worldIn, BlockPos pos, BlockState blockstate, boolean clientSide) {
		return true;
	}

	@Override
	public boolean isBonemealSuccess(Level world, RandomSource random, BlockPos pos, BlockState blockstate) {
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		return LightMushroomsUsloviieUspiekhaKostnoiMukiProcedure.execute(world, x, y, z);
	}

	@Override
	public void performBonemeal(ServerLevel world, RandomSource random, BlockPos pos, BlockState blockstate) {
		LightMushroo1msPriUspiekhieKostnoiMukiProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
	}
}
