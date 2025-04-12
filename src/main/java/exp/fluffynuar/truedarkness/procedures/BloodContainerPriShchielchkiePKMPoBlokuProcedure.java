package exp.fluffynuar.truedarkness.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.BlockTags;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;

import exp.fluffynuar.truedarkness.init.TruedarknessModItems;
import exp.fluffynuar.truedarkness.init.TruedarknessModBlocks;

public class BloodContainerPriShchielchkiePKMPoBlokuProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double max = 0;
		boolean right_hand = false;
		ItemStack ritual_knife = ItemStack.EMPTY;
		ItemStack add_item = ItemStack.EMPTY;
		if ((world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(new ResourceLocation("truedarkness:blood_container")))) {
			max = GetMaxBlockProcedure.execute(world, x, y, z);
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == TruedarknessModItems.CURSED_MIRROR.get()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == TruedarknessModItems.CURSED_MIRROR.get()) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal((Component.translatable("item.truedarkness.corrupted_ritual_knife.desc_1").getString() + "\u00A75" + Math.round(new Object() {
						public double getValue(LevelAccessor world, BlockPos pos, String tag) {
							BlockEntity blockEntity = world.getBlockEntity(pos);
							if (blockEntity != null)
								return blockEntity.getPersistentData().getDouble(tag);
							return -1;
						}
					}.getValue(world, BlockPos.containing(x, y, z), "Preys")) + "\u00A7f/\u00A75" + Math.round(max))), true);
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown(TruedarknessModItems.CURSED_MIRROR.get(), 20);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.lodestone_compass.lock")), SoundSource.BLOCKS, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.lodestone_compass.lock")), SoundSource.BLOCKS, 1, 1, false);
					}
				}
			} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == TruedarknessModItems.BUBBLE_ROD.get()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == TruedarknessModItems.BUBBLE_ROD.get()) {
				if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == TruedarknessModBlocks.BLOOD_CONTAINER.get() || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == TruedarknessModBlocks.CURSED_CAULDRON.get()
						|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == TruedarknessModBlocks.CURSED_PIPE.get()) {
					if (entity.isShiftKeyDown()) {
						if (new Object() {
							public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
								BlockEntity blockEntity = world.getBlockEntity(pos);
								if (blockEntity != null)
									return blockEntity.getPersistentData().getBoolean(tag);
								return false;
							}
						}.getValue(world, BlockPos.containing(x, y, z), "Contains")) {
							if (entity instanceof Player _player && !_player.level().isClientSide())
								_player.displayClientMessage(Component.literal((Component.translatable("block.truedarkness.cursed_pipe.add_1").getString())), true);
						} else {
							if (entity instanceof Player _player && !_player.level().isClientSide())
								_player.displayClientMessage(Component.literal((Component.translatable("block.truedarkness.cursed_pipe.add").getString())), true);
						}
					} else {
						if (new Object() {
							public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
								BlockEntity blockEntity = world.getBlockEntity(pos);
								if (blockEntity != null)
									return blockEntity.getPersistentData().getBoolean(tag);
								return false;
							}
						}.getValue(world, BlockPos.containing(x, y, z), "Contains")) {
							if (!world.isClientSide()) {
								BlockPos _bp = BlockPos.containing(x, y, z);
								BlockEntity _blockEntity = world.getBlockEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_blockEntity != null)
									_blockEntity.getPersistentData().putBoolean("Contains", false);
								if (world instanceof Level _level)
									_level.sendBlockUpdated(_bp, _bs, _bs, 3);
							}
							if (entity instanceof Player _player && !_player.level().isClientSide())
								_player.displayClientMessage(Component.literal((Component.translatable("block.truedarkness.cursed_pipe.add").getString())), true);
						} else {
							if (!world.isClientSide()) {
								BlockPos _bp = BlockPos.containing(x, y, z);
								BlockEntity _blockEntity = world.getBlockEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_blockEntity != null)
									_blockEntity.getPersistentData().putBoolean("Contains", true);
								if (world instanceof Level _level)
									_level.sendBlockUpdated(_bp, _bs, _bs, 3);
							}
							if (entity instanceof Player _player && !_player.level().isClientSide())
								_player.displayClientMessage(Component.literal((Component.translatable("block.truedarkness.cursed_pipe.add_1").getString())), true);
						}
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.lodestone.place")), SoundSource.BLOCKS, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.lodestone.place")), SoundSource.BLOCKS, 1, 1, false);
						}
					}
					if (entity instanceof Player _player)
						_player.getCooldowns().addCooldown(TruedarknessModItems.BUBBLE_ROD.get(), 20);
				}
			} else if (((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == TruedarknessModItems.BUCKET_BLOOD.get()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == TruedarknessModItems.BUCKET_BLOOD.get()) && new Object() {
						public double getValue(LevelAccessor world, BlockPos pos, String tag) {
							BlockEntity blockEntity = world.getBlockEntity(pos);
							if (blockEntity != null)
								return blockEntity.getPersistentData().getDouble(tag);
							return -1;
						}
					}.getValue(world, BlockPos.containing(x, y, z), "Preys") + 100 <= max) {
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putDouble("Preys", (new Object() {
							public double getValue(LevelAccessor world, BlockPos pos, String tag) {
								BlockEntity blockEntity = world.getBlockEntity(pos);
								if (blockEntity != null)
									return blockEntity.getPersistentData().getDouble(tag);
								return -1;
							}
						}.getValue(world, BlockPos.containing(x, y, z), "Preys") + 100));
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.bucket.empty_powder_snow")), SoundSource.BLOCKS, (float) 0.6, (float) 0.6);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.bucket.empty_powder_snow")), SoundSource.BLOCKS, (float) 0.6, (float) 0.6, false);
					}
				}
				if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == TruedarknessModItems.BUCKET_BLOOD.get()) {
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == TruedarknessModItems.BUCKET_BLOOD.get()) {
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.OFF_HAND, true);
				}
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == TruedarknessModItems.BUCKET_BLOOD.get()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack = new ItemStack(TruedarknessModItems.BUCKET_BLOOD.get()).copy();
							_setstack.setCount((int) ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount() - 1));
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == TruedarknessModItems.BUCKET_BLOOD.get()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack = new ItemStack(TruedarknessModItems.BUCKET_BLOOD.get()).copy();
							_setstack.setCount((int) ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getCount() - 1));
							_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(Items.BUCKET));
						entityToSpawn.setPickUpDelay(0);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("truedarkness:cursed_tools")))
					&& (((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getString("Tale3")).equals("blood")
							|| ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getString("Tale2")).equals("blood")
							|| ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getString("Tale1")).equals("blood")
							|| ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getString("Tale3")).equals("steal")
							|| ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getString("Tale2")).equals("steal")
							|| ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getString("Tale1")).equals("steal"))
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("truedarkness:cursed_tools")))
							&& (((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getOrCreateTag().getString("Tale3")).equals("blood")
									|| ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getOrCreateTag().getString("Tale2")).equals("blood")
									|| ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getOrCreateTag().getString("Tale1")).equals("blood")
									|| ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getOrCreateTag().getString("Tale3")).equals("steal")
									|| ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getOrCreateTag().getString("Tale2")).equals("steal")
									|| ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getOrCreateTag().getString("Tale1")).equals("steal"))
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == TruedarknessModItems.CURSED_EGG.get()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == TruedarknessModItems.CURSED_EGG.get()) {
				if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == TruedarknessModItems.CURSED_EGG.get()
						|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("truedarkness:cursed_tools")))
								&& (((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getString("Tale3")).equals("blood")
										|| ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getString("Tale2")).equals("blood")
										|| ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getString("Tale1")).equals("blood")
										|| ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getString("Tale3")).equals("steal")
										|| ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getString("Tale2")).equals("steal")
										|| ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getString("Tale1")).equals("steal"))) {
					ritual_knife = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).copy();
					right_hand = true;
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == TruedarknessModItems.CURSED_EGG.get()
						|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("truedarkness:cursed_tools")))
								&& (((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getOrCreateTag().getString("Tale3")).equals("blood")
										|| ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getOrCreateTag().getString("Tale2")).equals("blood")
										|| ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getOrCreateTag().getString("Tale1")).equals("blood")
										|| ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getOrCreateTag().getString("Tale3")).equals("steal")
										|| ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getOrCreateTag().getString("Tale2")).equals("steal")
										|| ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getOrCreateTag().getString("Tale1")).equals("steal"))) {
					ritual_knife = (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).copy();
					right_hand = false;
				}
				if (((ritual_knife.getOrCreateTag().getString("Tale3")).equals("blood") || (ritual_knife.getOrCreateTag().getString("Tale2")).equals("blood") || (ritual_knife.getOrCreateTag().getString("Tale1")).equals("blood"))
						&& !((ritual_knife.getOrCreateTag().getString("Tale3")).equals("steal") || (ritual_knife.getOrCreateTag().getString("Tale2")).equals("steal") || (ritual_knife.getOrCreateTag().getString("Tale1")).equals("steal"))
						|| ((ritual_knife.getOrCreateTag().getString("Tale3")).equals("steal") || (ritual_knife.getOrCreateTag().getString("Tale2")).equals("steal") || (ritual_knife.getOrCreateTag().getString("Tale1")).equals("steal"))
								&& !((ritual_knife.getOrCreateTag().getString("Tale3")).equals("blood") || (ritual_knife.getOrCreateTag().getString("Tale2")).equals("blood") || (ritual_knife.getOrCreateTag().getString("Tale1")).equals("blood"))) {
					if ((ritual_knife.getOrCreateTag().getString("Tale3")).equals("blood") || (ritual_knife.getOrCreateTag().getString("Tale2")).equals("blood") || (ritual_knife.getOrCreateTag().getString("Tale1")).equals("blood")) {
						if (ritual_knife.getOrCreateTag().getDouble("Typing") > 0 && new Object() {
							public double getValue(LevelAccessor world, BlockPos pos, String tag) {
								BlockEntity blockEntity = world.getBlockEntity(pos);
								if (blockEntity != null)
									return blockEntity.getPersistentData().getDouble(tag);
								return -1;
							}
						}.getValue(world, BlockPos.containing(x, y, z), "Preys") + ritual_knife.getOrCreateTag().getDouble("Typing") <= max && ritual_knife.getOrCreateTag().getDouble("Prey") > 0) {
							ritual_knife.getOrCreateTag().putDouble("Prey", (ritual_knife.getOrCreateTag().getDouble("Prey") - ritual_knife.getOrCreateTag().getDouble("Typing")));
							if (!world.isClientSide()) {
								BlockPos _bp = BlockPos.containing(x, y, z);
								BlockEntity _blockEntity = world.getBlockEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_blockEntity != null)
									_blockEntity.getPersistentData().putDouble("Preys", (new Object() {
										public double getValue(LevelAccessor world, BlockPos pos, String tag) {
											BlockEntity blockEntity = world.getBlockEntity(pos);
											if (blockEntity != null)
												return blockEntity.getPersistentData().getDouble(tag);
											return -1;
										}
									}.getValue(world, BlockPos.containing(x, y, z), "Preys") + ritual_knife.getOrCreateTag().getDouble("Typing")));
								if (world instanceof Level _level)
									_level.sendBlockUpdated(_bp, _bs, _bs, 3);
							}
							if (ritual_knife.getOrCreateTag().getDouble("Prey") >= 1) {
								if (ritual_knife.getOrCreateTag().getDouble("Prey") < 1000 && ritual_knife.getOrCreateTag().getDouble("Typing") == 1000) {
									ritual_knife.getOrCreateTag().putDouble("Typing", 500);
								}
								if (ritual_knife.getOrCreateTag().getDouble("Prey") < 500 && ritual_knife.getOrCreateTag().getDouble("Typing") == 500) {
									ritual_knife.getOrCreateTag().putDouble("Typing", 100);
								}
								if (ritual_knife.getOrCreateTag().getDouble("Prey") < 100 && ritual_knife.getOrCreateTag().getDouble("Typing") == 100) {
									ritual_knife.getOrCreateTag().putDouble("Typing", 50);
								}
								if (ritual_knife.getOrCreateTag().getDouble("Prey") < 50 && ritual_knife.getOrCreateTag().getDouble("Typing") == 50) {
									ritual_knife.getOrCreateTag().putDouble("Typing", 10);
								}
								if (ritual_knife.getOrCreateTag().getDouble("Prey") < 10 && ritual_knife.getOrCreateTag().getDouble("Typing") == 10) {
									ritual_knife.getOrCreateTag().putDouble("Typing", 5);
								}
								if (ritual_knife.getOrCreateTag().getDouble("Prey") < 5 && ritual_knife.getOrCreateTag().getDouble("Typing") == 5) {
									ritual_knife.getOrCreateTag().putDouble("Typing", 1);
								}
							} else {
								ritual_knife.getOrCreateTag().putDouble("Typing", 0);
							}
							if (entity instanceof Player _player && !_player.level().isClientSide())
								_player.displayClientMessage(Component.literal(("\u00A75-" + Math.round(ritual_knife.getOrCreateTag().getDouble("Typing")))), true);
							if (ritual_knife.getItem() == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()) {
								if (entity instanceof LivingEntity _entity)
									_entity.swing(InteractionHand.MAIN_HAND, true);
							} else if (ritual_knife.getItem() == (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem()) {
								if (entity instanceof LivingEntity _entity)
									_entity.swing(InteractionHand.OFF_HAND, true);
							}
							if (entity instanceof Player _player)
								_player.getCooldowns().addCooldown(ritual_knife.getItem(), 10);
						}
					} else if ((ritual_knife.getOrCreateTag().getString("Tale3")).equals("steal") || (ritual_knife.getOrCreateTag().getString("Tale2")).equals("steal") || (ritual_knife.getOrCreateTag().getString("Tale1")).equals("steal")) {
						if (ritual_knife.getOrCreateTag().getDouble("Typing") > 0 && new Object() {
							public double getValue(LevelAccessor world, BlockPos pos, String tag) {
								BlockEntity blockEntity = world.getBlockEntity(pos);
								if (blockEntity != null)
									return blockEntity.getPersistentData().getDouble(tag);
								return -1;
							}
						}.getValue(world, BlockPos.containing(x, y, z), "Preys") >= ritual_knife.getOrCreateTag().getDouble("Typing") && ritual_knife.getOrCreateTag().getDouble("Prey") > 0) {
							ritual_knife.getOrCreateTag().putDouble("Prey", (ritual_knife.getOrCreateTag().getDouble("Prey") + ritual_knife.getOrCreateTag().getDouble("Typing")));
							if (!world.isClientSide()) {
								BlockPos _bp = BlockPos.containing(x, y, z);
								BlockEntity _blockEntity = world.getBlockEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_blockEntity != null)
									_blockEntity.getPersistentData().putDouble("Preys", ((new Object() {
										public double getValue(LevelAccessor world, BlockPos pos, String tag) {
											BlockEntity blockEntity = world.getBlockEntity(pos);
											if (blockEntity != null)
												return blockEntity.getPersistentData().getDouble(tag);
											return -1;
										}
									}.getValue(world, BlockPos.containing(x, y, z), "Preys")) - ritual_knife.getOrCreateTag().getDouble("Typing")));
								if (world instanceof Level _level)
									_level.sendBlockUpdated(_bp, _bs, _bs, 3);
							}
							if (entity instanceof Player _player && !_player.level().isClientSide())
								_player.displayClientMessage(Component.literal(("\u00A75+" + Math.round(ritual_knife.getOrCreateTag().getDouble("Typing")))), true);
							if (ritual_knife.getItem() == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()) {
								if (entity instanceof LivingEntity _entity)
									_entity.swing(InteractionHand.MAIN_HAND, true);
							} else if (ritual_knife.getItem() == (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem()) {
								if (entity instanceof LivingEntity _entity)
									_entity.swing(InteractionHand.OFF_HAND, true);
							}
							if (entity instanceof Player _player)
								_player.getCooldowns().addCooldown(ritual_knife.getItem(), 10);
						}
					}
				} else {
					if (entity.isShiftKeyDown()) {
						if (ritual_knife.getOrCreateTag().getDouble("Typing") > 0 && new Object() {
							public double getValue(LevelAccessor world, BlockPos pos, String tag) {
								BlockEntity blockEntity = world.getBlockEntity(pos);
								if (blockEntity != null)
									return blockEntity.getPersistentData().getDouble(tag);
								return -1;
							}
						}.getValue(world, BlockPos.containing(x, y, z), "Preys") >= ritual_knife.getOrCreateTag().getDouble("Typing") && ritual_knife.getOrCreateTag().getDouble("Prey") > 0) {
							ritual_knife.getOrCreateTag().putDouble("Prey", (ritual_knife.getOrCreateTag().getDouble("Prey") + ritual_knife.getOrCreateTag().getDouble("Typing")));
							if (!world.isClientSide()) {
								BlockPos _bp = BlockPos.containing(x, y, z);
								BlockEntity _blockEntity = world.getBlockEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_blockEntity != null)
									_blockEntity.getPersistentData().putDouble("Preys", ((new Object() {
										public double getValue(LevelAccessor world, BlockPos pos, String tag) {
											BlockEntity blockEntity = world.getBlockEntity(pos);
											if (blockEntity != null)
												return blockEntity.getPersistentData().getDouble(tag);
											return -1;
										}
									}.getValue(world, BlockPos.containing(x, y, z), "Preys")) - ritual_knife.getOrCreateTag().getDouble("Typing")));
								if (world instanceof Level _level)
									_level.sendBlockUpdated(_bp, _bs, _bs, 3);
							}
							if (entity instanceof Player _player && !_player.level().isClientSide())
								_player.displayClientMessage(Component.literal(("\u00A75+" + Math.round(ritual_knife.getOrCreateTag().getDouble("Typing")))), true);
							if (ritual_knife.getItem() == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()) {
								if (entity instanceof LivingEntity _entity)
									_entity.swing(InteractionHand.MAIN_HAND, true);
							} else if (ritual_knife.getItem() == (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem()) {
								if (entity instanceof LivingEntity _entity)
									_entity.swing(InteractionHand.OFF_HAND, true);
							}
							if (entity instanceof Player _player)
								_player.getCooldowns().addCooldown(ritual_knife.getItem(), 10);
						}
					} else {
						if (ritual_knife.getOrCreateTag().getDouble("Typing") > 0 && new Object() {
							public double getValue(LevelAccessor world, BlockPos pos, String tag) {
								BlockEntity blockEntity = world.getBlockEntity(pos);
								if (blockEntity != null)
									return blockEntity.getPersistentData().getDouble(tag);
								return -1;
							}
						}.getValue(world, BlockPos.containing(x, y, z), "Preys") + ritual_knife.getOrCreateTag().getDouble("Typing") <= max && ritual_knife.getOrCreateTag().getDouble("Prey") > 0) {
							ritual_knife.getOrCreateTag().putDouble("Prey", (ritual_knife.getOrCreateTag().getDouble("Prey") - ritual_knife.getOrCreateTag().getDouble("Typing")));
							if (!world.isClientSide()) {
								BlockPos _bp = BlockPos.containing(x, y, z);
								BlockEntity _blockEntity = world.getBlockEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_blockEntity != null)
									_blockEntity.getPersistentData().putDouble("Preys", (new Object() {
										public double getValue(LevelAccessor world, BlockPos pos, String tag) {
											BlockEntity blockEntity = world.getBlockEntity(pos);
											if (blockEntity != null)
												return blockEntity.getPersistentData().getDouble(tag);
											return -1;
										}
									}.getValue(world, BlockPos.containing(x, y, z), "Preys") + ritual_knife.getOrCreateTag().getDouble("Typing")));
								if (world instanceof Level _level)
									_level.sendBlockUpdated(_bp, _bs, _bs, 3);
							}
							if (ritual_knife.getOrCreateTag().getDouble("Prey") >= 1) {
								if (ritual_knife.getOrCreateTag().getDouble("Prey") < 1000 && ritual_knife.getOrCreateTag().getDouble("Typing") == 1000) {
									ritual_knife.getOrCreateTag().putDouble("Typing", 500);
								}
								if (ritual_knife.getOrCreateTag().getDouble("Prey") < 500 && ritual_knife.getOrCreateTag().getDouble("Typing") == 500) {
									ritual_knife.getOrCreateTag().putDouble("Typing", 100);
								}
								if (ritual_knife.getOrCreateTag().getDouble("Prey") < 100 && ritual_knife.getOrCreateTag().getDouble("Typing") == 100) {
									ritual_knife.getOrCreateTag().putDouble("Typing", 50);
								}
								if (ritual_knife.getOrCreateTag().getDouble("Prey") < 50 && ritual_knife.getOrCreateTag().getDouble("Typing") == 50) {
									ritual_knife.getOrCreateTag().putDouble("Typing", 10);
								}
								if (ritual_knife.getOrCreateTag().getDouble("Prey") < 10 && ritual_knife.getOrCreateTag().getDouble("Typing") == 10) {
									ritual_knife.getOrCreateTag().putDouble("Typing", 5);
								}
								if (ritual_knife.getOrCreateTag().getDouble("Prey") < 5 && ritual_knife.getOrCreateTag().getDouble("Typing") == 5) {
									ritual_knife.getOrCreateTag().putDouble("Typing", 1);
								}
							} else {
								ritual_knife.getOrCreateTag().putDouble("Typing", 0);
							}
							if (entity instanceof Player _player && !_player.level().isClientSide())
								_player.displayClientMessage(Component.literal(("\u00A75-" + Math.round(ritual_knife.getOrCreateTag().getDouble("Typing")))), true);
							if (ritual_knife.getItem() == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()) {
								if (entity instanceof LivingEntity _entity)
									_entity.swing(InteractionHand.MAIN_HAND, true);
							} else if (ritual_knife.getItem() == (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem()) {
								if (entity instanceof LivingEntity _entity)
									_entity.swing(InteractionHand.OFF_HAND, true);
							}
							if (entity instanceof Player _player)
								_player.getCooldowns().addCooldown(ritual_knife.getItem(), 10);
						}
					}
				}
				if (right_hand) {
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = ritual_knife.copy();
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
				} else {
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = ritual_knife.copy();
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
				}
			} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.BUCKET
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == Items.BUCKET) {
				if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == TruedarknessModBlocks.BLOOD_CONTAINER.get() && new Object() {
					public double getValue(LevelAccessor world, BlockPos pos, String tag) {
						BlockEntity blockEntity = world.getBlockEntity(pos);
						if (blockEntity != null)
							return blockEntity.getPersistentData().getDouble(tag);
						return -1;
					}
				}.getValue(world, BlockPos.containing(x, y, z), "Preys") > 0) {
					if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
						if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.BUCKET) {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack = new ItemStack(Items.BUCKET).copy();
								_setstack.setCount((int) ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount() - 1));
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == Items.BUCKET) {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack = new ItemStack(Items.BUCKET).copy();
								_setstack.setCount((int) ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getCount() - 1));
								_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						}
					}
					add_item = new ItemStack(TruedarknessModItems.BUCKET_BLOOD.get()).copy();
					if ((new Object() {
						public double getValue(LevelAccessor world, BlockPos pos, String tag) {
							BlockEntity blockEntity = world.getBlockEntity(pos);
							if (blockEntity != null)
								return blockEntity.getPersistentData().getDouble(tag);
							return -1;
						}
					}.getValue(world, BlockPos.containing(x, y, z), "Preys")) - 100 >= 0) {
						add_item.getOrCreateTag().putDouble("Prey", 100);
						if (!world.isClientSide()) {
							BlockPos _bp = BlockPos.containing(x, y, z);
							BlockEntity _blockEntity = world.getBlockEntity(_bp);
							BlockState _bs = world.getBlockState(_bp);
							if (_blockEntity != null)
								_blockEntity.getPersistentData().putDouble("Preys", ((new Object() {
									public double getValue(LevelAccessor world, BlockPos pos, String tag) {
										BlockEntity blockEntity = world.getBlockEntity(pos);
										if (blockEntity != null)
											return blockEntity.getPersistentData().getDouble(tag);
										return -1;
									}
								}.getValue(world, BlockPos.containing(x, y, z), "Preys")) - 100));
							if (world instanceof Level _level)
								_level.sendBlockUpdated(_bp, _bs, _bs, 3);
						}
					} else {
						ritual_knife.getOrCreateTag().putDouble("Prey", (new Object() {
							public double getValue(LevelAccessor world, BlockPos pos, String tag) {
								BlockEntity blockEntity = world.getBlockEntity(pos);
								if (blockEntity != null)
									return blockEntity.getPersistentData().getDouble(tag);
								return -1;
							}
						}.getValue(world, BlockPos.containing(x, y, z), "Preys")));
						if (!world.isClientSide()) {
							BlockPos _bp = BlockPos.containing(x, y, z);
							BlockEntity _blockEntity = world.getBlockEntity(_bp);
							BlockState _bs = world.getBlockState(_bp);
							if (_blockEntity != null)
								_blockEntity.getPersistentData().putDouble("Preys", 0);
							if (world instanceof Level _level)
								_level.sendBlockUpdated(_bp, _bs, _bs, 3);
						}
					}
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, ritual_knife);
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			}
		}
	}
}
