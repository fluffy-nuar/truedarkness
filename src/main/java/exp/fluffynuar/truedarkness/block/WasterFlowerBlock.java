
package exp.fluffynuar.truedarkness.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraftforge.common.PlantType;

import net.minecraft.world.level.storage.loot.LootParams;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import java.util.List;
import java.util.Collections;

import exp.fluffynuar.truedarkness.init.TruedarknessModBlocks;

public class WasterFlowerBlock extends FlowerBlock {
	public WasterFlowerBlock() {
		super(() -> MobEffects.MOVEMENT_SPEED, 0,
				BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).sound(SoundType.HARD_CROP).instabreak().lightLevel(s -> 7).noCollission().replaceable().offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY));
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
	public List<ItemStack> getDrops(BlockState state, LootParams.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(Items.STICK));
	}

	@Override
	public boolean mayPlaceOn(BlockState groundState, BlockGetter worldIn, BlockPos pos) {
		return groundState.is(TruedarknessModBlocks.SWAMP_SAND.get()) || groundState.is(TruedarknessModBlocks.SAND_OF_MISSING.get());
	}

	@Override
	public boolean canSurvive(BlockState blockstate, LevelReader worldIn, BlockPos pos) {
		BlockPos blockpos = pos.below();
		BlockState groundState = worldIn.getBlockState(blockpos);
		return this.mayPlaceOn(groundState, worldIn, blockpos);
	}

	@Override
	public PlantType getPlantType(BlockGetter world, BlockPos pos) {
		return PlantType.DESERT;
	}
}
