package exp.fluffynuar.truedarkness.procedures;

import top.theillusivec4.curios.api.CuriosApi;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import exp.fluffynuar.truedarkness.network.TruedarknessModVariables;
import exp.fluffynuar.truedarkness.init.TruedarknessModMobEffects;
import exp.fluffynuar.truedarkness.init.TruedarknessModItems;
import exp.fluffynuar.truedarkness.TruedarknessMod;

public class RestoringFatigueProcProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (!(entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(TruedarknessModMobEffects.STOP_RESTORING.get()))) {
			if ((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Fatigue_second <= 4
					+ (entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Corrupt_stage) {
				if ((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Fatigue_first >= 100) {
					if ((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Fatigue_second < 5
							+ (entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Corrupt_stage) {
						{
							double _setval = 0;
							entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.Fatigue_first = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							double _setval = (entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Fatigue_second + 1;
							entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.Fatigue_second = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						RestoringFatigueProcProcedure.execute(world, entity);
					}
				} else {
					if (entity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(TruedarknessModItems.CORRUPTED_CATALYST.get(), lv).isPresent() : false) {
						if (entity instanceof LivingEntity _livEnt2 && _livEnt2.hasEffect(TruedarknessModMobEffects.REACTOR_RADIENT.get())) {
							TruedarknessMod.queueServerWork((int) (2 + Math.floor((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Active_corrupt_stage / 2)),
									() -> {
										if ((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Fatigue_second < 6
												+ (entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Corrupt_stage) {
											if (!(entity instanceof LivingEntity _livEnt3 && _livEnt3.hasEffect(TruedarknessModMobEffects.STOP_RESTORING.get()))) {
												{
													double _setval = (entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Fatigue_first + 2;
													entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
														capability.Fatigue_first = _setval;
														capability.syncPlayerVariables(entity);
													});
												}
												RestoringFatigueProcProcedure.execute(world, entity);
											}
										}
									});
						} else {
							TruedarknessMod.queueServerWork(2, () -> {
								if ((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Fatigue_second < 6
										+ (entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Corrupt_stage) {
									if (!(entity instanceof LivingEntity _livEnt5 && _livEnt5.hasEffect(TruedarknessModMobEffects.STOP_RESTORING.get()))) {
										{
											double _setval = (entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Fatigue_first + 2;
											entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
												capability.Fatigue_first = _setval;
												capability.syncPlayerVariables(entity);
											});
										}
										RestoringFatigueProcProcedure.execute(world, entity);
									}
								}
							});
						}
					} else {
						if (entity instanceof LivingEntity _livEnt7 && _livEnt7.hasEffect(TruedarknessModMobEffects.REACTOR_RADIENT.get())) {
							TruedarknessMod.queueServerWork((int) (4 + Math.floor((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Active_corrupt_stage / 2)),
									() -> {
										if ((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Fatigue_second < 6
												+ (entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Corrupt_stage) {
											if (!(entity instanceof LivingEntity _livEnt8 && _livEnt8.hasEffect(TruedarknessModMobEffects.STOP_RESTORING.get()))) {
												{
													double _setval = (entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Fatigue_first + 2;
													entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
														capability.Fatigue_first = _setval;
														capability.syncPlayerVariables(entity);
													});
												}
												RestoringFatigueProcProcedure.execute(world, entity);
											}
										}
									});
						} else {
							TruedarknessMod.queueServerWork(4, () -> {
								if ((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Fatigue_second < 6
										+ (entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Corrupt_stage) {
									if (!(entity instanceof LivingEntity _livEnt10 && _livEnt10.hasEffect(TruedarknessModMobEffects.STOP_RESTORING.get()))) {
										{
											double _setval = (entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Fatigue_first + 2;
											entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
												capability.Fatigue_first = _setval;
												capability.syncPlayerVariables(entity);
											});
										}
										RestoringFatigueProcProcedure.execute(world, entity);
									}
								}
							});
						}
					}
				}
			}
		}
	}
}
