package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.TagKey;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.Minecraft;

import java.util.List;
import java.util.Comparator;

import exp.fluffynuar.truedarkness.network.TruedarknessModVariables;
import exp.fluffynuar.truedarkness.init.TruedarknessModMobEffects;

public class CorruptedRemnantUsingKazhdyiTikVoVriemiaEffiektaProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double add_count = 0;
		Entity add_entity = null;
		if (entity instanceof Player && ((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Faction).equals("corrupt")) {
			if (!(entity instanceof LivingEntity _livEnt1 && _livEnt1.hasEffect(TruedarknessModMobEffects.BLOODSHED.get()))
					&& (entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).HoldAbility3) {
				if ((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).ProgressBar < 100) {
					{
						double _setval = (entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).ProgressBar + 1 + (new Object() {
							public boolean getValue() {
								boolean retBool = Minecraft.getInstance().options.keyUp.isDown();
								if (retBool) {
									if (Minecraft.getInstance().options.keyUp.getKeyModifier().toString().equals("SHIFT")) {
										retBool = Screen.hasShiftDown();
									} else if (Minecraft.getInstance().options.keyUp.getKeyModifier().toString().equals("CONTROL")) {
										retBool = Screen.hasControlDown();
									} else if (Minecraft.getInstance().options.keyUp.getKeyModifier().toString().equals("ALT")) {
										retBool = Screen.hasAltDown();
									}
								}
								return retBool;
							}
						}.getValue() && entity.isSprinting() ? -0.75 : 0) + (entity.isShiftKeyDown() ? 0.25 : 0);
						entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ProgressBar = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if (entity instanceof LivingEntity _livEnt5 && _livEnt5.hasEffect(TruedarknessModMobEffects.CORRUPTED_REMNANT_USING.get())
						&& (entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).HoldAbility3) {
					if ((((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).PerkItem).getOrCreateTag().getString("SecondAbility")).equals("remnant")) {
						if (Math.sqrt(Math.pow(entity.getX() - (entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Remnant_x, 2)
								+ Math.pow(entity.getY() - (entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Remnant_y, 2)
								+ Math.pow(entity.getZ() - (entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Remnant_z, 2)) <= 14) {
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.LARGE_SMOKE, ((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Remnant_x),
										((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Remnant_y + 0.5),
										((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Remnant_z), Mth.nextInt(RandomSource.create(), 0, 1), 0.1, 0.1, 0.1,
										0);
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.SMOKE, ((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Remnant_x),
										((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Remnant_y + 0.5),
										((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Remnant_z), Mth.nextInt(RandomSource.create(), 2, 5), 0.1, 0.1, 0.1,
										0);
						}
					}
					if ((((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).PerkItem).getOrCreateTag()
							.getString(("Line" + Math.round((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Active_skill_selected)))).equals("tread")
							|| (((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).PerkItem).getOrCreateTag()
									.getString(("Line" + Math.round((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Active_skill_selected))))
									.equals("undead")) {
						add_count = 1;
						while (add_count < 60 * ((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).PerkItem).getOrCreateTag()
								.getDouble(("Line" + Math.round((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Active_skill_selected) + "Tier"))) {
							{
								final Vec3 _center = new Vec3((entity.getLookAngle().x * add_count * 0.3 + entity.getX()), (entity.getLookAngle().y * add_count * 0.3 + entity.getY() + 1.7),
										(entity.getLookAngle().z * add_count * 0.3 + entity.getZ()));
								List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(1.5 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
								for (Entity entityiterator : _entfound) {
									if (!(entity == entityiterator) && !entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("truedarkness:disallow_teleport")))) {
										if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
											_entity.addEffect(new MobEffectInstance(MobEffects.GLOWING, 2, 0, false, false));
										add_count = add_count + 999999;
										break;
									}
									continue;
								}
							}
							add_count = add_count + 1;
						}
					}
					if ((((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).PerkItem).getOrCreateTag().getString("PassiveSkill")).equals("hunter")) {
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 0, false, false));
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 0, false, false));
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20, 0, false, false));
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.JUMP, 20, 0, false, false));
					} else {
						if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 5, 7, false, false));
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 5, 0, false, false));
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 5, 0, false, false));
							if (entity instanceof Player _player)
								_player.getCooldowns().addCooldown((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem(), 60);
							if (entity instanceof Player _player)
								_player.getCooldowns().addCooldown((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem(), 60);
						}
					}
					if ((((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).PerkItem).getOrCreateTag().getString("PassiveSkill")).equals("sneak")) {
						entity.setInvisible((entity.isShiftKeyDown()));
					}
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(TruedarknessModMobEffects.STOP_RESTORING.get(), 10, 0, false, false));
					if ((((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).PerkItem).getOrCreateTag().getString("PassiveSkill")).equals("vision")) {
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 210, 0, false, false));
					} else {
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.DARKNESS, 5, 0, false, false));
					}
					if ((((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).PerkItem).getOrCreateTag().getString("PassiveSkill")).equals("terror")) {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(24 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
							for (Entity entityiterator : _entfound) {
								if (!(entityiterator == entity)) {
									if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
										_entity.addEffect(new MobEffectInstance(TruedarknessModMobEffects.PARANOID.get(), 20, 0, false, false));
									if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
										_entity.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 20, 0, false, false));
									if (entityiterator.isPassenger()) {
										entityiterator.stopRiding();
									}
								}
							}
						}
					}
					if ((((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).PerkItem).getOrCreateTag().getString("PassiveSkill")).equals("wither")) {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(2 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
							for (Entity entityiterator : _entfound) {
								if (!(entityiterator == entity)) {
									if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
										_entity.addEffect(new MobEffectInstance(MobEffects.WITHER, 20, 0, false, false));
									if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
										_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 20, 1, false, false));
								}
							}
						}
						{
							final Vec3 _center = new Vec3(((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Remnant_x),
									((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Remnant_y + 0.5),
									((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Remnant_z));
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(0.2 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
							for (Entity entityiterator : _entfound) {
								if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
									_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 60, 0, false, false));
								if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
									_entity.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 60, 0, false, false));
								if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
									_entity.addEffect(new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 60, 0, false, false));
							}
						}
					}
					{
						boolean _setval = true;
						entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Remnant_logic = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if (!(entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).HoldAbility3 && entity instanceof LivingEntity _livEnt63
						&& _livEnt63.hasEffect(TruedarknessModMobEffects.CORRUPTED_REMNANT_USING.get())
						&& (entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Remnant_logic) {
					{
						boolean _setval = false;
						entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Remnant_logic = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof LivingEntity _entity)
						_entity.removeEffect(TruedarknessModMobEffects.CORRUPTED_REMNANT_USING.get());
				}
			} else {
				{
					boolean _setval = false;
					entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Remnant_logic = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(TruedarknessModMobEffects.CORRUPTED_REMNANT_USING.get());
			}
		}
	}
}
