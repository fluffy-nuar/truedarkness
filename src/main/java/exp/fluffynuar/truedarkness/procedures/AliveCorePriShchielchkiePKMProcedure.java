package exp.fluffynuar.truedarkness.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import exp.fluffynuar.truedarkness.network.TruedarknessModVariables;

public class AliveCorePriShchielchkiePKMProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (!((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Faction).equals("corrupt")) {
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack.getItem(), 120);
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DARKNESS, 60, 1, false, false));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 60, 1, false, false));
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.PORTAL, x, y, z, 25, 0.1, 0.1, 0.1, 0.1);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("truedarkness:ambient.corrupted_bell")), SoundSource.PLAYERS, (float) 0.8, (float) 0.8);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("truedarkness:ambient.corrupted_bell")), SoundSource.PLAYERS, (float) 0.8, (float) 0.8, false);
				}
			}
			{
				double _setval = 0;
				entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.CorruptionStage = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 5;
				entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Fatigue_second = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 0;
				entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.SculkedMana = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 0;
				entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Preys = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 0;
				entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Prays = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 0;
				entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Fatigue_first = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				String _setval = "corrupt";
				entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Faction = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (!(entity instanceof ServerPlayer _plr6 && _plr6.level() instanceof ServerLevel
					&& _plr6.getAdvancements().getOrStartProgress(_plr6.server.getAdvancements().getAdvancement(new ResourceLocation("truedarkness:lost_advancement"))).isDone())) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("truedarkness:lost_advancement"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						for (String criteria : _ap.getRemainingCriteria())
							_player.getAdvancements().award(_adv, criteria);
					}
				}
			}
		} else {
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack.getItem(), 120);
			{
				double _setval = 0;
				entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Fatigue_first = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 0;
				entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Preys = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 0;
				entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Prays = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 0;
				entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.SculkedMana = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 0;
				entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Fatigue_first = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 0;
				entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Fatigue_second = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 0;
				entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.CorruptionStage = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.PORTAL, x, y, z, 25, 0.1, 0.1, 0.1, 0.1);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.zombie_villager.converted")), SoundSource.PLAYERS, (float) 0.8, (float) 0.8);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.zombie_villager.converted")), SoundSource.PLAYERS, (float) 0.8, (float) 0.8, false);
				}
			}
			{
				String _setval = "";
				entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Faction = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
