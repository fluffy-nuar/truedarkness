package exp.fluffynuar.truedarkness.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.GameType;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.ExperienceOrb;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.client.Minecraft;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import exp.fluffynuar.truedarkness.init.TruedarknessModItems;
import exp.fluffynuar.truedarkness.init.TruedarknessModGameRules;
import exp.fluffynuar.truedarkness.init.TruedarknessModBlocks;

public class SandRemnantProcProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!(new Object() {
			public boolean checkGamemode(Entity _ent) {
				if (_ent instanceof ServerPlayer _serverPlayer) {
					return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.CREATIVE;
				} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
					return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null && Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.CREATIVE;
				}
				return false;
			}
		}.checkGamemode(entity))) {
			if (world instanceof ServerLevel _level) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.BOWL));
				entityToSpawn.setPickUpDelay(0);
				_level.addFreshEntity(entityToSpawn);
			}
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(TruedarknessModItems.SAND_REMNANTS.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.brush.brushing.sand.complete")), SoundSource.PLAYERS, 1, 1);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.brush.brushing.sand.complete")), SoundSource.PLAYERS, 1, 1, false);
			}
		}
		if (Mth.nextInt(RandomSource.create(), 1, 100) <= (world.getLevelData().getGameRules().getInt(TruedarknessModGameRules.SANDREMNANTSSUCCES))) {
			if (entity instanceof ServerPlayer _player) {
				Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("truedarkness:sand_remnants_adv"));
				AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
				if (!_ap.isDone()) {
					for (String criteria : _ap.getRemainingCriteria())
						_player.getAdvancements().award(_adv, criteria);
				}
			}
			if (Mth.nextInt(RandomSource.create(), 1, 500) <= 45) {
				if (Mth.nextInt(RandomSource.create(), 1, 500) <= 45) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("truedarkness:sand_remnants_adv_2"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
					if (Mth.nextInt(RandomSource.create(), 1, 500) >= 250) {
						if (Mth.nextInt(RandomSource.create(), 1, 500) >= 250) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(TruedarknessModItems.REEL.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
						} else {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(TruedarknessModItems.LETTER.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else {
						if (Mth.nextInt(RandomSource.create(), 1, 500) >= 250) {
							if (Mth.nextInt(RandomSource.create(), 1, 500) >= 250) {
								if (Mth.nextInt(RandomSource.create(), 1, 500) >= 250) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(TruedarknessModItems.ELDER_TEAR.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
								} else {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(TruedarknessModItems.SANDGLASS.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							} else {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(TruedarknessModItems.ANCIENT_PAPYRUS.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						} else {
							if (Mth.nextInt(RandomSource.create(), 1, 500) >= 250) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(TruedarknessModItems.CROWN_HELMET.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							} else {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(TruedarknessModItems.PHOTO.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						}
					}
				} else {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("truedarkness:sand_remnants_adv_3"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
					if (Mth.nextInt(RandomSource.create(), 1, 500) >= 250) {
						if (Mth.nextInt(RandomSource.create(), 1, 500) >= 250) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(TruedarknessModItems.CVETALIY_GRAIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
						} else {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(TruedarknessModItems.METENITE_SHARD.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else {
						if (Mth.nextInt(RandomSource.create(), 1, 500) >= 250) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(TruedarknessModItems.AQUAMARINE_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
						} else {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(TruedarknessModItems.SOULSTEAL_SHARD.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				}
			} else {
				if (Mth.nextInt(RandomSource.create(), 1, 500) <= 100) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("truedarkness:sand_remnants_adv_1"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
					if (Mth.nextInt(RandomSource.create(), 1, 500) >= 250) {
						if (Mth.nextInt(RandomSource.create(), 1, 500) >= 250) {
							if (Mth.nextInt(RandomSource.create(), 1, 500) >= 250) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(TruedarknessModItems.CHISELED_GLASS_SHARD.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							} else {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(TruedarknessModItems.CHISELED_GLASS_SHARD_1.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						} else {
							if (Mth.nextInt(RandomSource.create(), 1, 500) >= 250) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(TruedarknessModItems.CHISELED_GLASS_SHARD_2.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							} else {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(TruedarknessModItems.CHISELED_GLASS_SHARD_3.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						}
					} else {
						if (Mth.nextInt(RandomSource.create(), 1, 500) >= 250) {
							if (Mth.nextInt(RandomSource.create(), 1, 500) >= 250) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(TruedarknessModItems.CHISELED_GLASS_SHARD_4.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							} else {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(TruedarknessModItems.CHISELED_ANCIENT_GLASS_SHARD.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						} else {
							if (Mth.nextInt(RandomSource.create(), 1, 500) >= 250) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(TruedarknessModItems.MUSIC_DISC_HUMILITY.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							} else {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(TruedarknessModItems.MUSIC_DISC_FOREST_NIGHT.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						}
					}
				} else {
					if (Mth.nextInt(RandomSource.create(), 1, 500) >= 250) {
						if (Mth.nextInt(RandomSource.create(), 1, 500) >= 250) {
							if (Mth.nextInt(RandomSource.create(), 1, 500) >= 250) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.BONE));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							} else {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.BONE_MEAL));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						} else {
							if (Mth.nextInt(RandomSource.create(), 1, 500) >= 250) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(TruedarknessModBlocks.SWAMP_TALL_GRASS.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							} else {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(TruedarknessModBlocks.SWAMP_BUSH.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						}
					} else {
						if (Mth.nextInt(RandomSource.create(), 1, 500) >= 250) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(TruedarknessModBlocks.SANDSTONE_OF_MISSING.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
						} else {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(TruedarknessModBlocks.SWAMP_SAND.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				}
			}
			if (world instanceof ServerLevel _level)
				_level.addFreshEntity(new ExperienceOrb(_level, x, y, z, Mth.nextInt(RandomSource.create(), 3, 6)));
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(("\u00A77" + Component.translatable("item.truedarkness.sand_remnants.success").getString())), true);
		} else {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(("\u00A77" + Component.translatable("item.truedarkness.sand_remnants.nothing").getString())), true);
		}
	}
}
