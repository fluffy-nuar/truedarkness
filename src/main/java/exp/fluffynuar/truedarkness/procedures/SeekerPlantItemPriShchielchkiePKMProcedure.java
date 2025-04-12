package exp.fluffynuar.truedarkness.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.common.ForgeMod;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import java.util.Map;

import exp.fluffynuar.truedarkness.init.TruedarknessModBlocks;

public class SeekerPlantItemPriShchielchkiePKMProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		boolean left_hand = false;
		if (!((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == itemstack.getItem())) {
			left_hand = true;
		}
		if (world.isEmptyBlock(BlockPos.containing(x, y - 1, z)) && (entity.level()
				.clip(new ClipContext(entity.getEyePosition(1f),
						entity.getEyePosition(1f)
								.add(entity.getViewVector(1f)
										.scale((entity instanceof LivingEntity _livingEntity4 && _livingEntity4.getAttributes().hasAttribute(ForgeMod.BLOCK_REACH.get()) ? _livingEntity4.getAttribute(ForgeMod.BLOCK_REACH.get()).getValue() : 0))),
						ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
				.getDirection()) == Direction.DOWN && world.getBlockState(BlockPos.containing(x, y, z)).isFaceSturdy(world, BlockPos.containing(x, y, z), Direction.DOWN)) {
			{
				BlockPos _bp = BlockPos.containing(x, y - 1, z);
				BlockState _bs = (Mth.nextInt(RandomSource.create(), 1, 10) <= 5 ? TruedarknessModBlocks.SEEKER_PLANT_TOP.get().defaultBlockState() : TruedarknessModBlocks.SEEKER_PLANT_GLOW_TOP.get().defaultBlockState());
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
					if (_property != null && _bs.getValue(_property) != null)
						try {
							_bs = _bs.setValue(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.azalea.place")), SoundSource.BLOCKS, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.azalea.place")), SoundSource.BLOCKS, 1, 1, false);
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))) == TruedarknessModBlocks.SEEKER_PLANT_TOP.get().defaultBlockState()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = TruedarknessModBlocks.SEEKER_PLANT.get().defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))) == TruedarknessModBlocks.SEEKER_PLANT_GLOW_TOP.get().defaultBlockState()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = TruedarknessModBlocks.SEEKER_PLANT_GLOW.get().defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
			}
			if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
				if (left_hand) {
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = itemstack.copy();
						_setstack.setCount((int) (itemstack.getCount() - 1));
						_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.OFF_HAND, true);
				} else {
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = itemstack.copy();
						_setstack.setCount((int) (itemstack.getCount() - 1));
						_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
				}
			}
		}
	}
}
