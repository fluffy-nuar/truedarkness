package exp.fluffynuar.truedarkness.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ExperienceOrb;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.InteractionHand;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.ItemTags;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import java.util.List;
import java.util.Comparator;

import exp.fluffynuar.truedarkness.network.TruedarknessModVariables;
import exp.fluffynuar.truedarkness.init.TruedarknessModParticleTypes;
import exp.fluffynuar.truedarkness.init.TruedarknessModMobEffects;
import exp.fluffynuar.truedarkness.init.TruedarknessModEntities;
import exp.fluffynuar.truedarkness.TruedarknessMod;

public class MagicEridiumProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		String Active_skill = "";
		Entity entity_1 = null;
		ItemStack tool_hand = ItemStack.EMPTY;
		boolean find = false;
		boolean cooldown_logic = false;
		boolean smelted = false;
		double add_count = 0;
		double Active_stage = 0;
		double Active_time = 0;
		double tool_count_hand = 0;
		double fangs = 0;
		double count = 0;
		double x_add = 0;
		double y_add = 0;
		double player = 0;
		double z_add = 0;
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(TruedarknessModMobEffects.CORRUPTED_REMNANT_USING.get())) {
			if ((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Fatigue_second > 0) {
				if (((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).PerkItem).is(ItemTags.create(new ResourceLocation("truedarkness:shiny_eridium")))) {
					Active_stage = ((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).PerkItem).getOrCreateTag().getDouble("ActiveStage") + 1;
					Active_skill = ShinyEridiumGetTypeProcedure.execute((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).PerkItem);
				} else if (((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).PerkItem).is(ItemTags.create(new ResourceLocation("truedarkness:manuals")))) {
					Active_stage = ((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).PerkItem).getOrCreateTag()
							.getDouble(("Line" + Math.round((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).SelectedLine) + "Tier"));
					Active_skill = ((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).PerkItem).getOrCreateTag()
							.getString(("Line" + Math.round((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).SelectedLine)));
				}
				if ((entity instanceof Player _plrCldRem7
						? _plrCldRem7.getCooldowns().getCooldownPercent(ForgeRegistries.ITEMS.getValue(new ResourceLocation((("truedarkness:shiny_eridium_" + Active_skill)).toLowerCase(java.util.Locale.ENGLISH))), 0f) * 100
						: 0) == 0) {
					find = true;
					if ((Active_skill).equals("stream")) {
						if (!(entity instanceof LivingEntity _livEnt8 && _livEnt8.hasEffect(TruedarknessModMobEffects.BLOODSHED.get()))) {
							if (entity.onGround()) {
								entity.setDeltaMovement(new Vec3(
										(entity.getLookAngle().x * (6.5 + 0.1 * Active_stage)
												* ((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).ProgressBar / 100)),
										0.9, (entity.getLookAngle().z * (6.5 + 0.1 * Active_stage)
												* ((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).ProgressBar / 100))));
								if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
									_entity.addEffect(new MobEffectInstance(TruedarknessModMobEffects.FALLING_EFFECT.get(), 60, 0, false, false));
							} else {
								find = false;
							}
						}
					} else if ((Active_skill).equals("smelt")) {
						if (!(entity instanceof LivingEntity _livEnt14 && _livEnt14.hasEffect(TruedarknessModMobEffects.BLOODSHED.get()))) {
							smelted = false;
							{
								final Vec3 _center = new Vec3(x, y, z);
								List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(6 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
								for (Entity entityiterator : _entfound) {
									if (!((world instanceof Level _lvlSmeltResult
											? _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING, new SimpleContainer((entityiterator instanceof ItemEntity _itemEnt ? _itemEnt.getItem() : ItemStack.EMPTY)), _lvlSmeltResult)
													.map(recipe -> recipe.getResultItem(_lvlSmeltResult.registryAccess()).copy()).orElse(ItemStack.EMPTY)
											: ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) && entityiterator instanceof ItemEntity) {
										smelted = true;
										if (add_count <= 1 + Active_stage) {
											add_count = add_count + 1;
											if (world instanceof ServerLevel _level)
												_level.sendParticles(ParticleTypes.SMOKE, (entityiterator.getX()), (entityiterator.getY() + 0.25), (entityiterator.getZ()), 11, 0.1, 0.1, 0.1, 0.01);
											for (int index0 = 0; index0 < Mth.nextInt(RandomSource.create(), 3, 8); index0++) {
												world.addParticle(ParticleTypes.FLAME, (Mth.nextDouble(RandomSource.create(), -0.2, 0.2) + entityiterator.getX()), (Mth.nextDouble(RandomSource.create(), -0.2, 0.2) + entityiterator.getY() + 0.25),
														(Mth.nextDouble(RandomSource.create(), -0.2, 0.2) + entityiterator.getZ()), 0, 0.02, 0);
											}
											if (world instanceof ServerLevel _level)
												_level.addFreshEntity(new ExperienceOrb(_level, (entityiterator.getX()), (entityiterator.getY() + 0.25), (entityiterator.getZ()), Mth.nextInt(RandomSource.create(), 1, 5)));
											tool_count_hand = (entityiterator instanceof ItemEntity _itemEnt ? _itemEnt.getItem() : ItemStack.EMPTY).getCount();
											if (world instanceof ServerLevel _level)
												_level.getServer().getCommands().performPrefixedCommand(
														new CommandSourceStack(CommandSource.NULL, new Vec3((entityiterator.getX()), (entityiterator.getY() + 0.25), (entityiterator.getZ())), Vec2.ZERO, _level, 4, "", Component.literal(""),
																_level.getServer(), null).withSuppressedOutput(),
														("summon item ~ ~ ~ {Item:{id:\"" + "" + (ForgeRegistries.ITEMS.getKey((entityiterator instanceof ItemEntity _itemEnt ? _itemEnt.getItem() : ItemStack.EMPTY).getItem()).toString()) + "\",Count:"
																+ Math.round((entityiterator instanceof ItemEntity _itemEnt ? _itemEnt.getItem() : ItemStack.EMPTY).getCount() - (3 + Math.round(Active_stage * 5
																		* ((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).ProgressBar / 100))) >= 0
																				? (entityiterator instanceof ItemEntity _itemEnt ? _itemEnt.getItem() : ItemStack.EMPTY).getCount() - (3 + Math.round(Active_stage * 5
																						* ((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).ProgressBar / 100)))
																				: 0)
																+ "}}"));
											if (world instanceof ServerLevel _level)
												_level.getServer().getCommands()
														.performPrefixedCommand(
																new CommandSourceStack(CommandSource.NULL, new Vec3((entityiterator.getX()), (entityiterator.getY() + 0.25), (entityiterator.getZ())), Vec2.ZERO, _level, 4, "", Component
																		.literal(""), _level.getServer(), null).withSuppressedOutput(),
																("summon item ~ ~ ~ {Item:{id:\"" + ""
																		+ (ForgeRegistries.ITEMS
																				.getKey((world instanceof Level _lvlSmeltResult
																						? _lvlSmeltResult
																								.getRecipeManager()
																								.getRecipeFor(
																										RecipeType.SMELTING, new SimpleContainer((entityiterator instanceof ItemEntity _itemEnt ? _itemEnt.getItem() : ItemStack.EMPTY)), _lvlSmeltResult)
																								.map(recipe -> recipe.getResultItem(_lvlSmeltResult.registryAccess()).copy()).orElse(ItemStack.EMPTY)
																						: ItemStack.EMPTY).getItem())
																				.toString())
																		+ "\",Count:"
																		+ Math.round((entityiterator instanceof ItemEntity _itemEnt ? _itemEnt.getItem() : ItemStack.EMPTY).getCount() - (3 + Math.round(Active_stage * 5
																				* ((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).ProgressBar / 100))) >= 0
																						? 3 + Math.round(Active_stage * 5
																								* ((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).ProgressBar
																										/ 100))
																						: (world instanceof Level _lvlSmeltResult
																								? _lvlSmeltResult.getRecipeManager()
																										.getRecipeFor(RecipeType.SMELTING, new SimpleContainer((entityiterator instanceof ItemEntity _itemEnt ? _itemEnt.getItem() : ItemStack.EMPTY)),
																												_lvlSmeltResult)
																										.map(recipe -> recipe.getResultItem(_lvlSmeltResult.registryAccess()).copy()).orElse(ItemStack.EMPTY)
																								: ItemStack.EMPTY).getCount())
																		+ "}}"));
											if (!entityiterator.level().isClientSide())
												entityiterator.discard();
										}
									}
								}
							}
							if (smelted) {
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.firecharge.use")), SoundSource.PLAYERS, (float) 0.8, (float) 0.8);
									} else {
										_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.firecharge.use")), SoundSource.PLAYERS, (float) 0.8, (float) 0.8, false);
									}
								}
							}
							find = smelted;
						}
					} else if ((Active_skill).equals("tread")) {
						if (!(entity instanceof LivingEntity _livEnt63 && _livEnt63.hasEffect(TruedarknessModMobEffects.BLOODSHED.get()))) {
							add_count = 1;
							find = false;
							while (add_count < 10 + 60 * Active_stage * ((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).ProgressBar / 100)) {
								{
									final Vec3 _center = new Vec3((entity.getLookAngle().x * add_count * 0.3 + entity.getX()), (entity.getLookAngle().y * add_count * 0.3 + entity.getY() + 1.7),
											(entity.getLookAngle().z * add_count * 0.3 + entity.getZ()));
									List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(1.5 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
											.toList();
									for (Entity entityiterator : _entfound) {
										if (!(entity == entityiterator) && !entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("truedarkness:disallow_teleport")))) {
											{
												double _setval = entityiterator.getX();
												entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
													capability.Remnant_2_x = _setval;
													capability.syncPlayerVariables(entity);
												});
											}
											{
												double _setval = entityiterator.getY();
												entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
													capability.Remnant_2_y = _setval;
													capability.syncPlayerVariables(entity);
												});
											}
											{
												double _setval = entityiterator.getZ();
												entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
													capability.Remnant_2_z = _setval;
													capability.syncPlayerVariables(entity);
												});
											}
											find = true;
											entity_1 = entityiterator;
											add_count = add_count + 999999;
											if (world instanceof Level _level) {
												if (!_level.isClientSide()) {
													_level.playSound(null,
															BlockPos.containing((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Remnant_2_x,
																	(entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Remnant_2_y,
																	(entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Remnant_2_z),
															ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("truedarkness:player.corrupted.teleport.casting")), SoundSource.PLAYERS, 4, (float) 0.9);
												} else {
													_level.playLocalSound(((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Remnant_2_x),
															((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Remnant_2_y),
															((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Remnant_2_z),
															ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("truedarkness:player.corrupted.teleport.casting")), SoundSource.PLAYERS, 4, (float) 0.9, false);
												}
											}
											{
												Entity _ent = entity;
												_ent.teleportTo(((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Remnant_2_x),
														((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Remnant_2_y),
														((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Remnant_2_z));
												if (_ent instanceof ServerPlayer _serverPlayer)
													_serverPlayer.connection.teleport(((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Remnant_2_x),
															((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Remnant_2_y),
															((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Remnant_2_z), _ent.getYRot(), _ent.getXRot());
											}
											{
												Entity _ent = entity;
												_ent.setYRot(entityiterator.getYRot());
												_ent.setXRot(entityiterator.getXRot());
												_ent.setYBodyRot(_ent.getYRot());
												_ent.setYHeadRot(_ent.getYRot());
												_ent.yRotO = _ent.getYRot();
												_ent.xRotO = _ent.getXRot();
												if (_ent instanceof LivingEntity _entity) {
													_entity.yBodyRotO = _entity.getYRot();
													_entity.yHeadRotO = _entity.getYRot();
												}
											}
											break;
										}
										continue;
									}
								}
								add_count = add_count + 1;
							}
						}
					} else if ((Active_skill).equals("seer")) {
						if (!(entity instanceof LivingEntity _livEnt81 && _livEnt81.hasEffect(TruedarknessModMobEffects.BLOODSHED.get()))) {
							find = false;
							{
								final Vec3 _center = new Vec3(((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Remnant_x),
										((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Remnant_y),
										((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Remnant_z));
								List<Entity> _entfound = world.getEntitiesOfClass(Entity.class,
										new AABB(_center, _center).inflate(
												(80 + Active_stage * 9 + (entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).ProgressBar / 100) / 2d),
										e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
								for (Entity entityiterator : _entfound) {
									if (!(entityiterator == entity)) {
										if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
											_entity.addEffect(new MobEffectInstance(MobEffects.GLOWING, (int) (60 + Active_stage * 20), 0, false, false));
										find = true;
									}
								}
							}
							if (find) {
								if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
									_entity.addEffect(new MobEffectInstance(MobEffects.DARKNESS, (int) (60 + Active_stage * 20), 0, false, false));
								if (entity instanceof LivingEntity _entity)
									_entity.swing(InteractionHand.MAIN_HAND, true);
								if (world instanceof ServerLevel _level)
									_level.sendParticles((SimpleParticleType) (TruedarknessModParticleTypes.CORRUPTED_SOUL.get()), (entity.getX()), (entity.getY()), (entity.getZ()), 15, 0.1, 0.1, 0.1, 0.1);
							}
						}
					} else if ((Active_skill).equals("shot")) {
						if (!(entity instanceof LivingEntity _livEnt91 && _livEnt91.hasEffect(TruedarknessModMobEffects.BLOODSHED.get()))) {
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("truedarkness:player.corrupted.teleport.casting")),
											SoundSource.PLAYERS, 4, (float) 0.9);
								} else {
									_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("truedarkness:player.corrupted.teleport.casting")), SoundSource.PLAYERS, 4,
											(float) 0.9, false);
								}
							}
							TruedarknessMod.queueServerWork(16, () -> {
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.warden.sonic_boom")), SoundSource.PLAYERS,
												(float) 0.9, (float) 0.9);
									} else {
										_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.warden.sonic_boom")), SoundSource.PLAYERS, (float) 0.9, (float) 0.9,
												false);
									}
								}
							});
							while (!(add_count >= 12 + 4 * Active_stage * ((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).ProgressBar / 100))) {
								if (world instanceof ServerLevel _level)
									_level.sendParticles((SimpleParticleType) (TruedarknessModParticleTypes.CURSED_EXPLODE.get()),
											((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Remnant_vx * add_count
													+ (entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Remnant_x),
											((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Remnant_vy * add_count
													+ (entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Remnant_y + 1.7),
											((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Remnant_vz * add_count
													+ (entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Remnant_z),
											1, 0, 0, 0, 0);
								WardenStrikeCursedCupProcProcedure.execute(world,
										(entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Remnant_vx * add_count * 1.5
												+ (entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Remnant_x,
										(entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Remnant_vy * add_count * 1.5
												+ (entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Remnant_y + 1.7,
										(entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Remnant_vz * add_count * 1.5
												+ (entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Remnant_z,
										entity);
								add_count = add_count + 1;
							}
							if (entity instanceof LivingEntity _entity)
								_entity.removeEffect(MobEffects.DARKNESS);
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 40, 3, false, false));
						}
					} else if ((Active_skill).equals("lightning")) {
						if (!(entity instanceof LivingEntity _livEnt104 && _livEnt104.hasEffect(TruedarknessModMobEffects.BLOODSHED.get()))) {
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.ENCHANT, ((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Remnant_x),
										((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Remnant_y + 1),
										((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Remnant_z), 20, 0, 0, 0, 1.5);
							BooboohProcedure.execute(world, entity, (entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Remnant_x,
									(entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Remnant_y,
									(entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Remnant_z);
							if (entity instanceof LivingEntity _entity)
								_entity.removeEffect(MobEffects.DARKNESS);
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 40, 3, false, false));
						}
					} else if ((Active_skill).equals("ringing")) {
						if (!(entity instanceof LivingEntity _livEnt108 && _livEnt108.hasEffect(TruedarknessModMobEffects.BLOODSHED.get()))) {
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.warden.sonic_charge")), SoundSource.PLAYERS, 1, (float) 1.5);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.warden.sonic_charge")), SoundSource.PLAYERS, 1, (float) 1.5, false);
								}
							}
							TruedarknessMod.queueServerWork(24, () -> {
								{
									final Vec3 _center = new Vec3((entity.getX()), (entity.getY() + 7), (entity.getZ()));
									List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(10 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
											.toList();
									for (Entity entityiterator : _entfound) {
										entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MAGIC)), 3);
									}
								}
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.trident.return")), SoundSource.NEUTRAL, 2, (float) 1.5);
									} else {
										_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.trident.return")), SoundSource.NEUTRAL, 2, (float) 1.5, false);
									}
								}
								if (world instanceof ServerLevel _level)
									_level.sendParticles(ParticleTypes.FLASH, (entity.getX()), (entity.getY() + 7), (entity.getZ()), 5, 5, 5, 5, 0.1);
							});
							if ((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).ProgressBar >= 25) {
								TruedarknessMod.queueServerWork(34, () -> {
									{
										final Vec3 _center = new Vec3((entity.getX()), (entity.getY() + 7), (entity.getZ()));
										List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(10 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
												.toList();
										for (Entity entityiterator : _entfound) {
											entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MAGIC)), 7);
										}
									}
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.trident.return")), SoundSource.NEUTRAL, 2,
													(float) 1.5);
										} else {
											_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.trident.return")), SoundSource.NEUTRAL, 2, (float) 1.5, false);
										}
									}
									if (world instanceof ServerLevel _level)
										_level.sendParticles(ParticleTypes.FLASH, (entity.getX()), (entity.getY() + 7), (entity.getZ()), 5, 5, 5, 5, 0.1);
								});
							}
							if ((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).ProgressBar >= 50) {
								TruedarknessMod.queueServerWork(44, () -> {
									{
										final Vec3 _center = new Vec3((entity.getX()), (entity.getY() + 7), (entity.getZ()));
										List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(10 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
												.toList();
										for (Entity entityiterator : _entfound) {
											entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MAGIC)), 15);
										}
									}
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.trident.return")), SoundSource.NEUTRAL, 2,
													(float) 1.5);
										} else {
											_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.trident.return")), SoundSource.NEUTRAL, 2, (float) 1.5, false);
										}
									}
									if (world instanceof ServerLevel _level)
										_level.sendParticles(ParticleTypes.FLASH, (entity.getX()), (entity.getY() + 7), (entity.getZ()), 5, 5, 5, 5, 0.1);
								});
							}
							if ((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).ProgressBar >= 75) {
								TruedarknessMod.queueServerWork(54, () -> {
									{
										final Vec3 _center = new Vec3((entity.getX()), (entity.getY() + 7), (entity.getZ()));
										List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(10 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
												.toList();
										for (Entity entityiterator : _entfound) {
											entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MAGIC)), 19);
										}
									}
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.trident.return")), SoundSource.NEUTRAL, 2,
													(float) 1.5);
										} else {
											_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.trident.return")), SoundSource.NEUTRAL, 2, (float) 1.5, false);
										}
									}
									if (world instanceof ServerLevel _level)
										_level.sendParticles(ParticleTypes.FLASH, (entity.getX()), (entity.getY() + 7), (entity.getZ()), 5, 5, 5, 5, 0.1);
								});
							}
							if ((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).ProgressBar >= 100) {
								TruedarknessMod.queueServerWork(64, () -> {
									{
										final Vec3 _center = new Vec3((entity.getX()), (entity.getY() + 7), (entity.getZ()));
										List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(10 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
												.toList();
										for (Entity entityiterator : _entfound) {
											entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MAGIC)), 23);
										}
									}
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.trident.return")), SoundSource.NEUTRAL, 2,
													(float) 1.5);
										} else {
											_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.trident.return")), SoundSource.NEUTRAL, 2, (float) 1.5, false);
										}
									}
									if (world instanceof ServerLevel _level)
										_level.sendParticles(ParticleTypes.FLASH, (entity.getX()), (entity.getY() + 7), (entity.getZ()), 5, 5, 5, 5, 0.1);
								});
							}
						}
					} else if ((Active_skill).equals("fangs")) {
						if (!(entity instanceof LivingEntity _livEnt185 && _livEnt185.hasEffect(TruedarknessModMobEffects.BLOODSHED.get()))) {
							add_count = 0;
							fangs = 0;
							while (add_count <= 16 + 3 * Active_stage) {
								add_count = add_count + 1;
								if (Math.sqrt(Math.pow(entity.getX() - (entity.getX() + entity.getLookAngle().x * add_count), 2) + Math.pow(entity.getZ() - (entity.getZ() + entity.getLookAngle().z * add_count), 2)) > 2) {
									if (world instanceof ServerLevel _level) {
										Entity entityToSpawn = EntityType.EVOKER_FANGS.spawn(_level,
												BlockPos.containing(entity.getX() + entity.getLookAngle().x * add_count,
														y + (!world.getBlockState(BlockPos.containing(entity.getX() + entity.getLookAngle().x * add_count, y - 1, entity.getZ() + entity.getLookAngle().z * add_count)).canOcclude()
																&& world.getBlockState(BlockPos.containing(entity.getX() + entity.getLookAngle().x * add_count, y - 2, entity.getZ() + entity.getLookAngle().z * add_count)).canOcclude() ? -1 : 0)
																+ (!world.getBlockState(BlockPos.containing(entity.getX() + entity.getLookAngle().x * add_count, y + 1, entity.getZ() + entity.getLookAngle().z * add_count)).canOcclude()
																		&& world.getBlockState(BlockPos.containing(entity.getX() + entity.getLookAngle().x * add_count, y, entity.getZ() + entity.getLookAngle().z * add_count)).canOcclude() ? 1 : 0),
														entity.getZ() + entity.getLookAngle().z * add_count),
												MobSpawnType.MOB_SUMMONED);
										if (entityToSpawn != null) {
											entityToSpawn.setDeltaMovement(0, 0, 0);
										}
									}
									fangs = fangs + 1;
									continue;
								}
								continue;
							}
							if (fangs > 0) {
								find = true;
							} else {
								find = false;
							}
						}
					} else if ((Active_skill).equals("undead")) {
						if (!(entity instanceof LivingEntity _livEnt217 && _livEnt217.hasEffect(TruedarknessModMobEffects.BLOODSHED.get()))) {
							while (add_count < 50 && fangs <= 5) {
								x_add = (entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Remnant_x + Mth.nextInt(RandomSource.create(), -5, 5);
								y_add = (entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Remnant_y + Mth.nextInt(RandomSource.create(), -2, 2);
								z_add = (entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Remnant_z + Mth.nextInt(RandomSource.create(), -5, 5);
								add_count = add_count + 1;
								if (!world.getBlockState(BlockPos.containing(x_add, y_add + 2, z_add)).canOcclude() && !world.getBlockState(BlockPos.containing(x_add, y_add + 1, z_add)).canOcclude()
										&& world.getBlockState(BlockPos.containing(x_add, y_add, z_add)).canOcclude()) {
									if (Mth.nextDouble(RandomSource.create(), 0, 1) >= 0.5) {
										if (world instanceof ServerLevel _level) {
											Entity entityToSpawn = TruedarknessModEntities.CORRUPTED_SKELETON.get().spawn(_level, BlockPos.containing(x_add, y_add - 0.8, z_add), MobSpawnType.MOB_SUMMONED);
											if (entityToSpawn != null) {
												entityToSpawn.setDeltaMovement(0, 0, 0);
												if (entityToSpawn instanceof TamableAnimal _toTame && entity instanceof Player _owner) {
													_toTame.tame(_owner);
												}
											}
										}
									} else {
										if (world instanceof ServerLevel _level) {
											Entity entityToSpawn = TruedarknessModEntities.CORRUPTED_UNFORMED_REMNANTS.get().spawn(_level, BlockPos.containing(x_add, y_add - 0.8, z_add), MobSpawnType.MOB_SUMMONED);
											if (entityToSpawn != null) {
												entityToSpawn.setDeltaMovement(0, 0, 0);
												if (entityToSpawn instanceof TamableAnimal _toTame && entity instanceof Player _owner) {
													_toTame.tame(_owner);
												}
											}
										}
									}
									{
										final Vec3 _center = new Vec3(x_add, (y_add - 0.8), z_add);
										List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(40 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
												.toList();
										for (Entity entityiterator : _entfound) {
											if (entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("truedarkness:undead_corrupted")))
													&& (entityiterator instanceof TamableAnimal _tamIsTamedBy && entity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false)) {
												if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
													_entity.addEffect(new MobEffectInstance(TruedarknessModMobEffects.BLOODSHED.get(),
															(int) (600
																	+ 300 * Active_stage * ((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).ProgressBar / 100)),
															0, false, false));
											}
										}
									}
									if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
										_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 30, 0, false, false));
									if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
										_entity.addEffect(new MobEffectInstance(TruedarknessModMobEffects.HUNTING.get(), 600, 0, false, false));
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.evoker.prepare_summon")), SoundSource.HOSTILE, (float) 1.8, (float) 0.8);
										} else {
											_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.evoker.prepare_summon")), SoundSource.HOSTILE, (float) 1.8, (float) 0.8, false);
										}
									}
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("particle.soul_escape")), SoundSource.HOSTILE, (float) 1.2, (float) 0.8);
										} else {
											_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("particle.soul_escape")), SoundSource.HOSTILE, (float) 1.2, (float) 0.8, false);
										}
									}
									if (world instanceof ServerLevel _level)
										_level.sendParticles(ParticleTypes.WITCH, x, (y + 1), z, 15, 0.1, 0.1, 0.1, 0.1);
									fangs = fangs + 1;
									continue;
								}
								continue;
							}
							if (fangs == 0) {
								find = false;
							}
						}
					} else if ((Active_skill).equals("greed")) {
						if (!(entity instanceof LivingEntity _livEnt234 && _livEnt234.hasEffect(TruedarknessModMobEffects.BLOODSHED.get()))) {
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(TruedarknessModMobEffects.SHINY_RUSH.get(),
										(int) (600 * ((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).ProgressBar / 100)), (int) Active_stage));
						}
					} else {
						find = false;
					}
					if (find == true) {
						if (entity instanceof Player _player)
							_player.getCooldowns().addCooldown(ForgeRegistries.ITEMS.getValue(new ResourceLocation((("truedarkness:shiny_eridium_" + Active_skill)).toLowerCase(java.util.Locale.ENGLISH))),
									(int) (20 * (CooldownShinyEridiumProcedure.execute(Active_skill) + Active_stage)
											* (((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).ProgressBar < 20
													? (entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).ProgressBar
													: 20) / 100)));
						((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).PerkItem).getOrCreateTag().putDouble(
								("Line" + Math.round((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).SelectedLine) + "Cooldown"),
								(20 * (CooldownShinyEridiumProcedure.execute(Active_skill) + Active_stage)
										* (((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).ProgressBar < 20
												? (entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).ProgressBar
												: 20) / 100)));
						{
							double _setval = 0;
							entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.Fatigue_first = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							double _setval = (entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Fatigue_second - 1;
							entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.Fatigue_second = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(TruedarknessModMobEffects.STOP_RESTORING.get(), 20, 0, false, false));
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(TruedarknessModMobEffects.BLOODSHED.get(), 60, 0, false, false));
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("truedarkness:player.corrupted.teleport.use")), SoundSource.PLAYERS, 1, (float) 0.8);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("truedarkness:player.corrupted.teleport.use")), SoundSource.PLAYERS, 1, (float) 0.8, false);
							}
						}
					} else {
						if (entity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal((Component.translatable("item.truedarkness.alive_core.active_denied").getString())), true);
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("truedarkness:player.corrupted.teleport.eradicated")), SoundSource.PLAYERS, 1, (float) 0.8);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("truedarkness:player.corrupted.teleport.eradicated")), SoundSource.PLAYERS, 1, (float) 0.8, false);
							}
						}
					}
				}
			} else {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal((Component.translatable("item.truedarkness.alive_core.active_denied").getString())), true);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("truedarkness:player.corrupted.teleport.eradicated")), SoundSource.PLAYERS, 1, (float) 0.8);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("truedarkness:player.corrupted.teleport.eradicated")), SoundSource.PLAYERS, 1, (float) 0.8, false);
					}
				}
			}
		}
	}
}
