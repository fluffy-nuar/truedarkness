package exp.fluffynuar.truedarkness.procedures;

import top.theillusivec4.curios.api.CuriosApi;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.monster.warden.Warden;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.ItemTags;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.SimpleParticleType;

import javax.annotation.Nullable;

import exp.fluffynuar.truedarkness.network.TruedarknessModVariables;
import exp.fluffynuar.truedarkness.init.TruedarknessModParticleTypes;
import exp.fluffynuar.truedarkness.init.TruedarknessModMobEffects;
import exp.fluffynuar.truedarkness.init.TruedarknessModItems;

@Mod.EventBusSubscriber
public class DeathProcProcedure {
	@SubscribeEvent
	public static void onEntityDeath(LivingDeathEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity(), event.getSource().getEntity());
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		execute(null, world, x, y, z, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == TruedarknessModItems.EMPTY_SPELL.get()
				|| (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == TruedarknessModItems.EMPTY_SPELL.get()) {
			if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == TruedarknessModItems.EMPTY_SPELL.get()) {
				(sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putDouble("tagKills",
						((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("tagKills") + 1));
				if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("truedarkness:light_kills")))) {
					(sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putDouble("tagLight",
							((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("tagLight") + 1));
				}
			}
			if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == TruedarknessModItems.EMPTY_SPELL.get()) {
				(sourceentity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getOrCreateTag().putDouble("tagKills",
						((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("tagKills") + 1));
				if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("truedarkness:light_kills")))) {
					(sourceentity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getOrCreateTag().putDouble("tagLight",
							((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("tagLight") + 1));
				}
			}
		}
		if ((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).corrupt_first != 0
				|| (entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).corrupt_second != 0) {
			{
				double _setval = 0;
				entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.corrupt_second = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 0;
				entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.corrupt_first = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if (((sourceentity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Faction).equals("corrupt")) {
			if (!(entity instanceof LivingEntity _livEnt26 && _livEnt26.getMobType() == MobType.UNDEAD) && !(sourceentity instanceof LivingEntity _livEnt27 && _livEnt27.hasEffect(TruedarknessModMobEffects.REACTOR_RADIENT.get()))) {
				if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("truedarkness:cursed_tools")))
						&& (((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getString("Tale3")).equals("blood")
								|| ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getString("Tale2")).equals("blood")
								|| ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getString("Tale1")).equals("blood"))) {
					if (sourceentity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(TruedarknessModItems.ALIVE_CORE.get(), lv).isPresent() : false) {
						(sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putDouble("Prey",
								((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("Prey") + Mth.nextInt(RandomSource.create(), 1, 3)
										+ ((entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) * (entity instanceof Warden ? Mth.nextDouble(RandomSource.create(), 0.01, 0.02) : Mth.nextDouble(RandomSource.create(), 0.1, 0.2))) / 3
										+ (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(Enchantments.MOB_LOOTING)));
						if (world instanceof ServerLevel _level)
							_level.sendParticles((SimpleParticleType) (TruedarknessModParticleTypes.BLOOD_PARTICLE.get()), x, (y + 0.75), z, 15, 0.2, 0.2, 0.2, 0.01);
					} else {
						if (sourceentity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal((Component.translatable("item.truedarkness.blink_eridium.need").getString() + " " + Component.translatable("item.truedarkness.alive_core").getString())), true);
						if (sourceentity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(TruedarknessModItems.ERIDIUM_GLASS_SHARD.get(), lv).isPresent() : false) {
							{
								double _setval = (sourceentity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Active_prey_count
										+ Mth.nextInt(RandomSource.create(), 2, 3)
										+ ((entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) * (entity instanceof Warden ? Mth.nextDouble(RandomSource.create(), 0.02, 0.04) : Mth.nextDouble(RandomSource.create(), 0.2, 0.4))) / 3;
								sourceentity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.Active_prey_count = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(TruedarknessModMobEffects.DEAL_COOLDOWN.get(), 35, 0, false, false));
							if (world instanceof ServerLevel _level)
								_level.sendParticles((SimpleParticleType) (TruedarknessModParticleTypes.BLOOD_PARTICLE.get()), x, (y + 0.75), z, 15, 0.2, 0.2, 0.2, 0.01);
						} else {
							{
								double _setval = (sourceentity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Active_prey_count
										+ Mth.nextInt(RandomSource.create(), 1, 2)
										+ ((entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) * (entity instanceof Warden ? Mth.nextDouble(RandomSource.create(), 0.01, 0.02) : Mth.nextDouble(RandomSource.create(), 0.1, 0.2))) / 3;
								sourceentity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.Active_prey_count = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(TruedarknessModMobEffects.DEAL_COOLDOWN.get(), 35, 0, false, false));
							if (world instanceof ServerLevel _level)
								_level.sendParticles((SimpleParticleType) (TruedarknessModParticleTypes.BLOOD_PARTICLE.get()), x, (y + 0.75), z, 15, 0.2, 0.2, 0.2, 0.01);
						}
					}
				} else {
					if (sourceentity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(TruedarknessModItems.ERIDIUM_GLASS_SHARD.get(), lv).isPresent() : false) {
						{
							double _setval = (sourceentity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Active_prey_count + Mth.nextInt(RandomSource.create(), 2, 3)
									+ ((entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) * (entity instanceof Warden ? Mth.nextDouble(RandomSource.create(), 0.02, 0.04) : Mth.nextDouble(RandomSource.create(), 0.2, 0.4))) / 3;
							sourceentity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.Active_prey_count = _setval;
								capability.syncPlayerVariables(sourceentity);
							});
						}
						if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(TruedarknessModMobEffects.DEAL_COOLDOWN.get(), 35, 0, false, false));
						if (world instanceof ServerLevel _level)
							_level.sendParticles((SimpleParticleType) (TruedarknessModParticleTypes.BLOOD_PARTICLE.get()), x, (y + 0.75), z, 15, 0.2, 0.2, 0.2, 0.01);
					} else {
						{
							double _setval = (sourceentity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Active_prey_count + Mth.nextInt(RandomSource.create(), 1, 2)
									+ ((entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) * (entity instanceof Warden ? Mth.nextDouble(RandomSource.create(), 0.01, 0.02) : Mth.nextDouble(RandomSource.create(), 0.1, 0.2))) / 3;
							sourceentity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.Active_prey_count = _setval;
								capability.syncPlayerVariables(sourceentity);
							});
						}
						if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(TruedarknessModMobEffects.DEAL_COOLDOWN.get(), 35, 0, false, false));
						if (world instanceof ServerLevel _level)
							_level.sendParticles((SimpleParticleType) (TruedarknessModParticleTypes.BLOOD_PARTICLE.get()), x, (y + 0.75), z, 15, 0.2, 0.2, 0.2, 0.01);
					}
				}
			}
		}
		if (sourceentity instanceof LivingEntity _livEnt82 && _livEnt82.hasEffect(TruedarknessModMobEffects.TRIAL.get())) {
			if ((sourceentity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Trial_category == 2
					&& (sourceentity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Trial_progress < (sourceentity
							.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Trial_count) {
				{
					double _setval = (sourceentity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Trial_progress + 1;
					sourceentity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Trial_progress = _setval;
						capability.syncPlayerVariables(sourceentity);
					});
				}
			}
		}
	}
}
