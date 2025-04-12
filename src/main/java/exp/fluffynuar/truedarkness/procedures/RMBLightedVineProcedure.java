package exp.fluffynuar.truedarkness.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.common.ForgeMod;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import javax.annotation.Nullable;

import java.util.Map;

import exp.fluffynuar.truedarkness.init.TruedarknessModItems;
import exp.fluffynuar.truedarkness.init.TruedarknessModBlocks;

@Mod.EventBusSubscriber
public class RMBLightedVineProcedure {
	@SubscribeEvent
	public static void onRightClickBlock(PlayerInteractEvent.RightClickBlock event) {
		if (event.getHand() != event.getEntity().getUsedItemHand())
			return;
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == TruedarknessModItems.TEAR_BERRY.get()
				|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == TruedarknessModItems.TEAR_BERRY.get())
				&& (Blocks.CAVE_VINES.defaultBlockState().canSurvive(world,
						BlockPos.containing(
								x + GetXBerriesProcedure.execute(entity.level()
										.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(
												(entity instanceof LivingEntity _livingEntity4 && _livingEntity4.getAttributes().hasAttribute(ForgeMod.BLOCK_REACH.get()) ? _livingEntity4.getAttribute(ForgeMod.BLOCK_REACH.get()).getValue() : 0))),
												ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
										.getDirection()),
								y + GetYBerriesProcedure.execute(entity.level()
										.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(
												(entity instanceof LivingEntity _livingEntity6 && _livingEntity6.getAttributes().hasAttribute(ForgeMod.BLOCK_REACH.get()) ? _livingEntity6.getAttribute(ForgeMod.BLOCK_REACH.get()).getValue() : 0))),
												ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
										.getDirection()),
								z + GetZBerriesProcedure.execute(entity.level()
										.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(
												(entity instanceof LivingEntity _livingEntity8 && _livingEntity8.getAttributes().hasAttribute(ForgeMod.BLOCK_REACH.get()) ? _livingEntity8.getAttribute(ForgeMod.BLOCK_REACH.get()).getValue() : 0))),
												ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
										.getDirection())))
						&& Blocks.WEEPING_VINES.defaultBlockState()
								.canSurvive(world,
										BlockPos.containing(x + GetXBerriesProcedure.execute(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(
												(entity instanceof LivingEntity _livingEntity11 && _livingEntity11.getAttributes().hasAttribute(ForgeMod.BLOCK_REACH.get()) ? _livingEntity11.getAttribute(ForgeMod.BLOCK_REACH.get()).getValue() : 0))),
												ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getDirection()), y
														+ GetYBerriesProcedure
																.execute(
																		entity.level()
																				.clip(new ClipContext(entity.getEyePosition(1f),
																						entity.getEyePosition(1f).add(entity.getViewVector(1f)
																								.scale((entity instanceof LivingEntity _livingEntity13 && _livingEntity13.getAttributes().hasAttribute(ForgeMod.BLOCK_REACH.get())
																										? _livingEntity13.getAttribute(ForgeMod.BLOCK_REACH.get()).getValue()
																										: 0))),
																						ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																				.getDirection()),
												z + GetZBerriesProcedure
														.execute(
																entity.level()
																		.clip(new ClipContext(
																				entity.getEyePosition(1f), entity
																						.getEyePosition(
																								1f)
																						.add(entity
																								.getViewVector(
																										1f)
																								.scale((entity instanceof LivingEntity _livingEntity15 && _livingEntity15.getAttributes().hasAttribute(ForgeMod.BLOCK_REACH.get())
																										? _livingEntity15.getAttribute(ForgeMod.BLOCK_REACH.get()).getValue()
																										: 0))),
																				ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																		.getDirection())))
						|| (world.getBlockState(BlockPos.containing(
								x + GetXBerriesProcedure.execute(entity.level()
										.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(
												(entity instanceof LivingEntity _livingEntity18 && _livingEntity18.getAttributes().hasAttribute(ForgeMod.BLOCK_REACH.get()) ? _livingEntity18.getAttribute(ForgeMod.BLOCK_REACH.get()).getValue() : 0))),
												ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
										.getDirection()),
								y + GetYBerriesProcedure.execute(entity.level()
										.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(
												(entity instanceof LivingEntity _livingEntity20 && _livingEntity20.getAttributes().hasAttribute(ForgeMod.BLOCK_REACH.get()) ? _livingEntity20.getAttribute(ForgeMod.BLOCK_REACH.get()).getValue() : 0))),
												ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
										.getDirection()) + 1,
								z + GetZBerriesProcedure.execute(entity.level()
										.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(
												(entity instanceof LivingEntity _livingEntity22 && _livingEntity22.getAttributes().hasAttribute(ForgeMod.BLOCK_REACH.get()) ? _livingEntity22.getAttribute(ForgeMod.BLOCK_REACH.get()).getValue() : 0))),
												ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
										.getDirection()))))
								.getBlock() == TruedarknessModBlocks.TEAR_BERRY_BLOCK.get())
				&& world.isEmptyBlock(
						BlockPos.containing(
								x + GetXBerriesProcedure.execute(entity.level()
										.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(
												(entity instanceof LivingEntity _livingEntity26 && _livingEntity26.getAttributes().hasAttribute(ForgeMod.BLOCK_REACH.get()) ? _livingEntity26.getAttribute(ForgeMod.BLOCK_REACH.get()).getValue() : 0))),
												ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
										.getDirection()),
								y + GetYBerriesProcedure.execute(entity.level()
										.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(
												(entity instanceof LivingEntity _livingEntity28 && _livingEntity28.getAttributes().hasAttribute(ForgeMod.BLOCK_REACH.get()) ? _livingEntity28.getAttribute(ForgeMod.BLOCK_REACH.get()).getValue() : 0))),
												ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
										.getDirection()),
								z + GetZBerriesProcedure.execute(entity.level()
										.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(
												(entity instanceof LivingEntity _livingEntity30 && _livingEntity30.getAttributes().hasAttribute(ForgeMod.BLOCK_REACH.get()) ? _livingEntity30.getAttribute(ForgeMod.BLOCK_REACH.get()).getValue() : 0))),
												ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
										.getDirection())))) {
			{
				BlockPos _bp = BlockPos
						.containing(
								x + GetXBerriesProcedure.execute(entity.level()
										.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(
												(entity instanceof LivingEntity _livingEntity33 && _livingEntity33.getAttributes().hasAttribute(ForgeMod.BLOCK_REACH.get()) ? _livingEntity33.getAttribute(ForgeMod.BLOCK_REACH.get()).getValue() : 0))),
												ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
										.getDirection()),
								y + GetYBerriesProcedure.execute(entity.level()
										.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(
												(entity instanceof LivingEntity _livingEntity35 && _livingEntity35.getAttributes().hasAttribute(ForgeMod.BLOCK_REACH.get()) ? _livingEntity35.getAttribute(ForgeMod.BLOCK_REACH.get()).getValue() : 0))),
												ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
										.getDirection()),
								z + GetZBerriesProcedure.execute(entity.level()
										.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(
												(entity instanceof LivingEntity _livingEntity37 && _livingEntity37.getAttributes().hasAttribute(ForgeMod.BLOCK_REACH.get()) ? _livingEntity37.getAttribute(ForgeMod.BLOCK_REACH.get()).getValue() : 0))),
												ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
										.getDirection()));
				BlockState _bs = TruedarknessModBlocks.TEAR_BERRY_BLOCK.get().defaultBlockState();
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
			if ((world
					.getBlockState(BlockPos.containing(
							x + GetXBerriesProcedure.execute(entity.level()
									.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(
											(entity instanceof LivingEntity _livingEntity40 && _livingEntity40.getAttributes().hasAttribute(ForgeMod.BLOCK_REACH.get()) ? _livingEntity40.getAttribute(ForgeMod.BLOCK_REACH.get()).getValue() : 0))),
											ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
									.getDirection()),
							y + GetYBerriesProcedure.execute(entity.level()
									.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(
											(entity instanceof LivingEntity _livingEntity42 && _livingEntity42.getAttributes().hasAttribute(ForgeMod.BLOCK_REACH.get()) ? _livingEntity42.getAttribute(ForgeMod.BLOCK_REACH.get()).getValue() : 0))),
											ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
									.getDirection()) + 1,
							z + GetZBerriesProcedure.execute(entity.level()
									.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(
											(entity instanceof LivingEntity _livingEntity44 && _livingEntity44.getAttributes().hasAttribute(ForgeMod.BLOCK_REACH.get()) ? _livingEntity44.getAttribute(ForgeMod.BLOCK_REACH.get()).getValue() : 0))),
											ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
									.getDirection()))))
					.getBlock() == TruedarknessModBlocks.TEAR_BERRY_BLOCK.get()
					&& ((world.getBlockState(BlockPos.containing(
							x + GetXBerriesProcedure.execute(entity.level()
									.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(
											(entity instanceof LivingEntity _livingEntity48 && _livingEntity48.getAttributes().hasAttribute(ForgeMod.BLOCK_REACH.get()) ? _livingEntity48.getAttribute(ForgeMod.BLOCK_REACH.get()).getValue() : 0))),
											ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
									.getDirection()),
							y + GetYBerriesProcedure.execute(entity.level()
									.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(
											(entity instanceof LivingEntity _livingEntity50 && _livingEntity50.getAttributes().hasAttribute(ForgeMod.BLOCK_REACH.get()) ? _livingEntity50.getAttribute(ForgeMod.BLOCK_REACH.get()).getValue() : 0))),
											ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
									.getDirection()) + 1,
							z + GetZBerriesProcedure.execute(entity.level()
									.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(
											(entity instanceof LivingEntity _livingEntity52 && _livingEntity52.getAttributes().hasAttribute(ForgeMod.BLOCK_REACH.get()) ? _livingEntity52.getAttribute(ForgeMod.BLOCK_REACH.get()).getValue() : 0))),
											ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
									.getDirection()))))
							.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip55
									? (world.getBlockState(BlockPos.containing(x + GetXBerriesProcedure.execute(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(
											(entity instanceof LivingEntity _livingEntity48 && _livingEntity48.getAttributes().hasAttribute(ForgeMod.BLOCK_REACH.get()) ? _livingEntity48.getAttribute(ForgeMod.BLOCK_REACH.get()).getValue() : 0))),
											ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getDirection()), y
													+ GetYBerriesProcedure.execute(entity.level()
															.clip(new ClipContext(entity.getEyePosition(1f),
																	entity.getEyePosition(1f)
																			.add(entity.getViewVector(1f)
																					.scale((entity instanceof LivingEntity _livingEntity50 && _livingEntity50.getAttributes().hasAttribute(ForgeMod.BLOCK_REACH.get())
																							? _livingEntity50.getAttribute(ForgeMod.BLOCK_REACH.get()).getValue()
																							: 0))),
																	ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
															.getDirection())
													+ 1,
											z + GetZBerriesProcedure.execute(entity.level()
													.clip(new ClipContext(entity.getEyePosition(1f),
															entity.getEyePosition(1f)
																	.add(entity.getViewVector(1f)
																			.scale((entity instanceof LivingEntity _livingEntity52 && _livingEntity52.getAttributes().hasAttribute(ForgeMod.BLOCK_REACH.get())
																					? _livingEntity52.getAttribute(ForgeMod.BLOCK_REACH.get()).getValue()
																					: 0))),
															ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
													.getDirection()))))
											.getValue(_getip55)
									: -1) == 0) {
				{
					int _value = 1;
					BlockPos _pos = BlockPos.containing(
							x + GetXBerriesProcedure.execute(entity.level()
									.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(
											(entity instanceof LivingEntity _livingEntity56 && _livingEntity56.getAttributes().hasAttribute(ForgeMod.BLOCK_REACH.get()) ? _livingEntity56.getAttribute(ForgeMod.BLOCK_REACH.get()).getValue() : 0))),
											ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
									.getDirection()),
							y + GetYBerriesProcedure.execute(entity.level()
									.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(
											(entity instanceof LivingEntity _livingEntity58 && _livingEntity58.getAttributes().hasAttribute(ForgeMod.BLOCK_REACH.get()) ? _livingEntity58.getAttribute(ForgeMod.BLOCK_REACH.get()).getValue() : 0))),
											ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
									.getDirection()) + 1,
							z + GetZBerriesProcedure.execute(entity.level()
									.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(
											(entity instanceof LivingEntity _livingEntity60 && _livingEntity60.getAttributes().hasAttribute(ForgeMod.BLOCK_REACH.get()) ? _livingEntity60.getAttribute(ForgeMod.BLOCK_REACH.get()).getValue() : 0))),
											ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
									.getDirection()));
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
						world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.cave_vines.place")), SoundSource.BLOCKS, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.cave_vines.place")), SoundSource.BLOCKS, 1, 1, false);
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == TruedarknessModItems.TEAR_BERRY.get()) {
				if (entity instanceof LivingEntity _entity)
					_entity.swing(InteractionHand.MAIN_HAND, true);
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).copy();
						_setstack.setCount((int) ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount() - 1));
						_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
				}
			} else {
				if (entity instanceof LivingEntity _entity)
					_entity.swing(InteractionHand.OFF_HAND, true);
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).copy();
						_setstack.setCount((int) ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getCount() - 1));
						_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
				}
			}
		} else if (entity.isShiftKeyDown() || (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ItemStack.EMPTY.getItem()) {
			if (((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip83 ? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip83) : -1) >= 2
					&& (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == TruedarknessModBlocks.TEAR_BERRY_BLOCK.get()) {
				{
					int _value = (int) (((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip87
							? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip87)
							: -1) - 1);
					BlockPos _pos = BlockPos.containing(x, y, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
						world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x + 0.5, y, z + 0.5), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.cave_vines.pick_berries")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound((x + 0.5), y, (z + 0.5), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.cave_vines.pick_berries")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), y, (z + 0.5), new ItemStack(TruedarknessModItems.TEAR_BERRY.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
				if (entity instanceof LivingEntity _entity)
					_entity.swing(InteractionHand.MAIN_HAND, true);
			}
		}
	}
}
