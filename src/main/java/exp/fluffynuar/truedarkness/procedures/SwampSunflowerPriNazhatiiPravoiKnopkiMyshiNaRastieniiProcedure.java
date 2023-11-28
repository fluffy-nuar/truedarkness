package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.GameType;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.client.Minecraft;

import exp.fluffynuar.truedarkness.init.TruedarknessModBlocks;

public class SwampSunflowerPriNazhatiiPravoiKnopkiMyshiNaRastieniiProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.BONE_MEAL) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 15, 1, 1, 1, 1);
			if (!(new Object() {
				public boolean checkGamemode(Entity _ent) {
					if (_ent instanceof ServerPlayer _serverPlayer) {
						return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.CREATIVE;
					} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
						return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
								&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.CREATIVE;
					}
					return false;
				}
			}.checkGamemode(entity))) {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(Items.BONE_MEAL);
					_setstack.setCount((int) ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount() - 1));
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				if (!((!((entity.level().dimension()) == Level.OVERWORLD) || !((entity.level().dimension()) == Level.END)) && y < 113)) {
					if (Mth.nextInt(RandomSource.create(), 1, 10) < 3) {
						if (Mth.nextInt(RandomSource.create(), 1, 10) < 5) {
							if (Mth.nextInt(RandomSource.create(), 1, 10) < 5) {
								if (Mth.nextInt(RandomSource.create(), 1, 10) < 5) {
									if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == TruedarknessModBlocks.SWAMP_SUNFLOWER.get()) {
										if (world instanceof ServerLevel _serverworld) {
											StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("truedarkness", "swamp_flower1"));
											if (template != null) {
												template.placeInWorld(_serverworld, BlockPos.containing(x - 1, y - 1, z - 1), BlockPos.containing(x - 1, y - 1, z - 1),
														new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
											}
										}
										if (world instanceof ServerLevel _level)
											_level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, (y - 1), z, 15, 1, 1, 1, 1);
									} else {
										if (world instanceof ServerLevel _serverworld) {
											StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("truedarkness", "swamp_flower1"));
											if (template != null) {
												template.placeInWorld(_serverworld, BlockPos.containing(x - 1, y, z - 1), BlockPos.containing(x - 1, y, z - 1),
														new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
											}
										}
										if (world instanceof ServerLevel _level)
											_level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 15, 1, 1, 1, 1);
									}
								}
							} else {
								if (Mth.nextInt(RandomSource.create(), 1, 10) < 5) {
									if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == TruedarknessModBlocks.SWAMP_SUNFLOWER.get()) {
										if (world instanceof ServerLevel _serverworld) {
											StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("truedarkness", "swamp_flower2"));
											if (template != null) {
												template.placeInWorld(_serverworld, BlockPos.containing(x - 1, y - 1, z - 1), BlockPos.containing(x - 1, y - 1, z - 1),
														new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
											}
										}
										if (world instanceof ServerLevel _level)
											_level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, (y - 1), z, 15, 1, 1, 1, 1);
									} else {
										if (world instanceof ServerLevel _serverworld) {
											StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("truedarkness", "swamp_flower2"));
											if (template != null) {
												template.placeInWorld(_serverworld, BlockPos.containing(x - 1, y, z - 1), BlockPos.containing(x - 1, y, z - 1),
														new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
											}
										}
										if (world instanceof ServerLevel _level)
											_level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 15, 1, 1, 1, 1);
									}
								}
							}
						} else {
							if (Mth.nextInt(RandomSource.create(), 1, 10) < 5) {
								if (Mth.nextInt(RandomSource.create(), 1, 10) < 5) {
									if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == TruedarknessModBlocks.SWAMP_SUNFLOWER.get()) {
										if (world instanceof ServerLevel _serverworld) {
											StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("truedarkness", "swamp_flower3"));
											if (template != null) {
												template.placeInWorld(_serverworld, BlockPos.containing(x - 1, y - 1, z - 1), BlockPos.containing(x - 1, y - 1, z - 1),
														new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
											}
										}
										if (world instanceof ServerLevel _level)
											_level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, (y - 1), z, 15, 1, 1, 1, 1);
									} else {
										if (world instanceof ServerLevel _serverworld) {
											StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("truedarkness", "swamp_flower3"));
											if (template != null) {
												template.placeInWorld(_serverworld, BlockPos.containing(x - 1, y, z - 1), BlockPos.containing(x - 1, y, z - 1),
														new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
											}
										}
										if (world instanceof ServerLevel _level)
											_level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 15, 1, 1, 1, 1);
									}
								}
							} else {
								if (Mth.nextInt(RandomSource.create(), 1, 10) < 5) {
									if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == TruedarknessModBlocks.SWAMP_SUNFLOWER.get()) {
										if (world instanceof ServerLevel _serverworld) {
											StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("truedarkness", "swamp_flower"));
											if (template != null) {
												template.placeInWorld(_serverworld, BlockPos.containing(x - 1, y - 1, z - 1), BlockPos.containing(x - 1, y - 1, z - 1),
														new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
											}
										}
										if (world instanceof ServerLevel _level)
											_level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, (y - 1), z, 15, 1, 1, 1, 1);
									} else {
										if (world instanceof ServerLevel _serverworld) {
											StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("truedarkness", "swamp_flower"));
											if (template != null) {
												template.placeInWorld(_serverworld, BlockPos.containing(x - 1, y, z - 1), BlockPos.containing(x - 1, y, z - 1),
														new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
											}
										}
										if (world instanceof ServerLevel _level)
											_level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 15, 1, 1, 1, 1);
									}
								}
							}
						}
					}
				}
			} else {
				if (Mth.nextInt(RandomSource.create(), 1, 10) < 6) {
					if (Mth.nextInt(RandomSource.create(), 1, 10) < 5) {
						if (Mth.nextInt(RandomSource.create(), 1, 10) < 5) {
							if (Mth.nextInt(RandomSource.create(), 1, 10) < 5) {
								if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == TruedarknessModBlocks.SWAMP_SUNFLOWER.get()) {
									if (world instanceof ServerLevel _serverworld) {
										StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("truedarkness", "swamp_flower1"));
										if (template != null) {
											template.placeInWorld(_serverworld, BlockPos.containing(x - 1, y - 1, z - 1), BlockPos.containing(x - 1, y - 1, z - 1),
													new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
										}
									}
									if (world instanceof ServerLevel _level)
										_level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, (y - 1), z, 15, 1, 1, 1, 1);
								} else {
									if (world instanceof ServerLevel _serverworld) {
										StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("truedarkness", "swamp_flower1"));
										if (template != null) {
											template.placeInWorld(_serverworld, BlockPos.containing(x - 1, y, z - 1), BlockPos.containing(x - 1, y, z - 1),
													new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
										}
									}
									if (world instanceof ServerLevel _level)
										_level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 15, 1, 1, 1, 1);
								}
							}
						} else {
							if (Mth.nextInt(RandomSource.create(), 1, 10) < 5) {
								if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == TruedarknessModBlocks.SWAMP_SUNFLOWER.get()) {
									if (world instanceof ServerLevel _serverworld) {
										StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("truedarkness", "swamp_flower2"));
										if (template != null) {
											template.placeInWorld(_serverworld, BlockPos.containing(x - 1, y - 1, z - 1), BlockPos.containing(x - 1, y - 1, z - 1),
													new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
										}
									}
									if (world instanceof ServerLevel _level)
										_level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, (y - 1), z, 15, 1, 1, 1, 1);
								} else {
									if (world instanceof ServerLevel _serverworld) {
										StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("truedarkness", "swamp_flower2"));
										if (template != null) {
											template.placeInWorld(_serverworld, BlockPos.containing(x - 1, y, z - 1), BlockPos.containing(x - 1, y, z - 1),
													new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
										}
									}
									if (world instanceof ServerLevel _level)
										_level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 15, 1, 1, 1, 1);
								}
							}
						}
					} else {
						if (Mth.nextInt(RandomSource.create(), 1, 10) < 5) {
							if (Mth.nextInt(RandomSource.create(), 1, 10) < 5) {
								if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == TruedarknessModBlocks.SWAMP_SUNFLOWER.get()) {
									if (world instanceof ServerLevel _serverworld) {
										StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("truedarkness", "swamp_flower3"));
										if (template != null) {
											template.placeInWorld(_serverworld, BlockPos.containing(x - 1, y - 1, z - 1), BlockPos.containing(x - 1, y - 1, z - 1),
													new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
										}
									}
									if (world instanceof ServerLevel _level)
										_level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, (y - 1), z, 15, 1, 1, 1, 1);
								} else {
									if (world instanceof ServerLevel _serverworld) {
										StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("truedarkness", "swamp_flower3"));
										if (template != null) {
											template.placeInWorld(_serverworld, BlockPos.containing(x - 1, y, z - 1), BlockPos.containing(x - 1, y, z - 1),
													new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
										}
									}
									if (world instanceof ServerLevel _level)
										_level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 15, 1, 1, 1, 1);
								}
							}
						} else {
							if (Mth.nextInt(RandomSource.create(), 1, 10) < 5) {
								if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == TruedarknessModBlocks.SWAMP_SUNFLOWER.get()) {
									if (world instanceof ServerLevel _serverworld) {
										StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("truedarkness", "swamp_flower"));
										if (template != null) {
											template.placeInWorld(_serverworld, BlockPos.containing(x - 1, y - 1, z - 1), BlockPos.containing(x - 1, y - 1, z - 1),
													new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
										}
									}
									if (world instanceof ServerLevel _level)
										_level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, (y - 1), z, 15, 1, 1, 1, 1);
								} else {
									if (world instanceof ServerLevel _serverworld) {
										StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("truedarkness", "swamp_flower"));
										if (template != null) {
											template.placeInWorld(_serverworld, BlockPos.containing(x - 1, y, z - 1), BlockPos.containing(x - 1, y, z - 1),
													new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
										}
									}
									if (world instanceof ServerLevel _level)
										_level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 15, 1, 1, 1, 1);
								}
							}
						}
					}
				}
			}
		}
	}
}
