package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.GameType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.client.Minecraft;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import exp.fluffynuar.truedarkness.network.TruedarknessModVariables;
import exp.fluffynuar.truedarkness.init.TruedarknessModMobEffects;
import exp.fluffynuar.truedarkness.TruedarknessMod;

public class TheAliveKoghdaEffiektNachatprimienienProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		TruedarknessMod.queueServerWork(
				(int) (20 + 20 * (4 - (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(TruedarknessModMobEffects.CORRUPTING.get()) ? _livEnt.getEffect(TruedarknessModMobEffects.CORRUPTING.get()).getDuration() : 0))), () -> {
					if ((world instanceof Level _lvl ? _lvl.dimension() : Level.OVERWORLD) == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("truedarkness:yteria")))) {
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
						}.checkGamemode(entity)) && !(new Object() {
							public boolean checkGamemode(Entity _ent) {
								if (_ent instanceof ServerPlayer _serverPlayer) {
									return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.SPECTATOR;
								} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
									return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
											&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.SPECTATOR;
								}
								return false;
							}
						}.checkGamemode(entity))) {
							if ((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).corrupt_first < 8) {
								if ((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).corrupt_second >= 10) {
									if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
										_entity.addEffect(new MobEffectInstance(MobEffects.HARM, 9999999, 78, false, false));
								}
								if (entity instanceof ServerPlayer _player) {
									Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("truedarkness:corruption_advancement"));
									AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
									if (!_ap.isDone()) {
										for (String criteria : _ap.getRemainingCriteria())
											_player.getAdvancements().award(_adv, criteria);
									}
								}
								if (entity instanceof LivingEntity _livEnt8 && _livEnt8.hasEffect(TruedarknessModMobEffects.CORRUPTING.get())) {
									TruedarknessMod.queueServerWork(1, () -> {
										TheAliveKoghdaEffiektNachatprimienienProcedure.execute(world, entity);
									});
								}
								{
									double _setval = (entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).corrupt_first + 1;
									entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.corrupt_first = _setval;
										capability.syncPlayerVariables(entity);
									});
								}
							} else if ((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).corrupt_first >= 8) {
								{
									double _setval = 0;
									entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.corrupt_first = _setval;
										capability.syncPlayerVariables(entity);
									});
								}
								if (entity instanceof LivingEntity _livEnt10 && _livEnt10.hasEffect(TruedarknessModMobEffects.CORRUPTING.get())) {
									TruedarknessMod.queueServerWork(1, () -> {
										TheAliveKoghdaEffiektNachatprimienienProcedure.execute(world, entity);
									});
								}
								if ((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).corrupt_second >= 10) {
									if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
										_entity.addEffect(new MobEffectInstance(MobEffects.HARM, 9999999, 78, false, false));
								} else {
									{
										double _setval = (entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).corrupt_second + 1;
										entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
											capability.corrupt_second = _setval;
											capability.syncPlayerVariables(entity);
										});
									}
								}
							}
						}
					}
				});
	}
}
