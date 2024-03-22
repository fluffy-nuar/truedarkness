package exp.fluffynuar.truedarkness.procedures;

import top.theillusivec4.curios.api.CuriosApi;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.GameType;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.InteractionHand;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.client.Minecraft;

import exp.fluffynuar.truedarkness.init.TruedarknessModMobEffects;
import exp.fluffynuar.truedarkness.init.TruedarknessModItems;
import exp.fluffynuar.truedarkness.init.TruedarknessModEnchantments;
import exp.fluffynuar.truedarkness.TruedarknessMod;

public class CupWaterPriShchielchkiePKMProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == TruedarknessModItems.MILK_CUP.get()
				|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == TruedarknessModItems.AMOGUS_MORS.get()
				|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == TruedarknessModItems.CUP_WATER.get()
				|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == TruedarknessModItems.POSSET.get()
				|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == TruedarknessModItems.KVASS.get()
				|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == TruedarknessModItems.MORS.get()
				|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == TruedarknessModItems.APPLE_JUICE.get()
				|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == TruedarknessModItems.LAVENDER_TEA.get()
				|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == TruedarknessModItems.FRUIT_TEA.get()
				|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == TruedarknessModItems.CACAO.get()) {
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem(), 26);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.witch.drink")), SoundSource.PLAYERS, (float) 0.8, (float) 0.8);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.witch.drink")), SoundSource.PLAYERS, (float) 0.8, (float) 0.8, false);
				}
			}
			TruedarknessMod.queueServerWork(25, () -> {
				if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == TruedarknessModItems.MILK_CUP.get()
						|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == TruedarknessModItems.AMOGUS_MORS.get()
						|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == TruedarknessModItems.CUP_WATER.get()
						|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == TruedarknessModItems.POSSET.get()
						|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == TruedarknessModItems.KVASS.get()
						|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == TruedarknessModItems.MORS.get()
						|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == TruedarknessModItems.APPLE_JUICE.get()
						|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == TruedarknessModItems.LAVENDER_TEA.get()
						|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == TruedarknessModItems.FRUIT_TEA.get()
						|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == TruedarknessModItems.CACAO.get()) {
					if (entity instanceof Player _player)
						_player.getCooldowns().addCooldown((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem(), 26);
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.witch.drink")), SoundSource.PLAYERS, (float) 0.8, (float) 0.8);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.witch.drink")), SoundSource.PLAYERS, (float) 0.8, (float) 0.8, false);
						}
					}
					TruedarknessMod.queueServerWork(25, () -> {
						if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == TruedarknessModItems.MILK_CUP.get()
								|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == TruedarknessModItems.CUP_WATER.get()
								|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == TruedarknessModItems.POSSET.get()
								|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == TruedarknessModItems.KVASS.get()
								|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == TruedarknessModItems.MORS.get()
								|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == TruedarknessModItems.APPLE_JUICE.get()
								|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == TruedarknessModItems.LAVENDER_TEA.get()
								|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == TruedarknessModItems.FRUIT_TEA.get()
								|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == TruedarknessModItems.CACAO.get()) {
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.witch.drink")), SoundSource.PLAYERS, (float) 0.8, (float) 0.8);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.witch.drink")), SoundSource.PLAYERS, (float) 0.8, (float) 0.8, false);
								}
							}
							if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == TruedarknessModItems.POSSET.get()) {
								if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
									_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, (int) (20 * 60 * 6), 2, false, true));
							}
							if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == TruedarknessModItems.KVASS.get()) {
								if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
									_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, (int) (20 * 60 * 2), 2, false, true));
								if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
									_entity.addEffect(new MobEffectInstance(TruedarknessModMobEffects.THE_ALIVE.get(), (int) (20 * 60 * 2), 0, false, true));
							}
							if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == TruedarknessModItems.MORS.get()) {
								if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
									_entity.addEffect(new MobEffectInstance(MobEffects.SATURATION, 2, 0, false, true));
							}
							if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == TruedarknessModItems.APPLE_JUICE.get()) {
								if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
									_entity.addEffect(new MobEffectInstance(MobEffects.SATURATION, 20, 2, false, false));
							}
							if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == TruedarknessModItems.LAVENDER_TEA.get()) {
								if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
									_entity.addEffect(new MobEffectInstance(TruedarknessModMobEffects.CALM.get(), (int) (20 * 60 * 3), 0, false, true));
							}
							if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == TruedarknessModItems.FRUIT_TEA.get()) {
								if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
									_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, (int) (20 * 60 * 6), 0, false, true));
							}
							if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == TruedarknessModItems.CACAO.get()) {
								if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
									_entity.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, (int) (20 * 60 * 6), 0, false, true));
							}
							if (EnchantmentHelper.getItemEnchantmentLevel(TruedarknessModEnchantments.BEST_VESSEL.get(), (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0) {
								if (entity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(TruedarknessModItems.POTHOLDERS.get(), lv).isPresent() : false) {
									if (entity instanceof Player _player)
										_player.getCooldowns().addCooldown((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem(), (int) (20 * 7));
								} else {
									if (Mth.nextInt(RandomSource.create(), 1, 100) >= 30) {
										if (entity instanceof LivingEntity _entity) {
											ItemStack _setstack = new ItemStack(TruedarknessModItems.CUP.get());
											_setstack.setCount(1);
											_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
											if (_entity instanceof Player _player)
												_player.getInventory().setChanged();
										}
									}
								}
							} else {
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
										ItemStack _setstack = new ItemStack(TruedarknessModItems.CUP.get());
										_setstack.setCount(1);
										_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
										if (_entity instanceof Player _player)
											_player.getInventory().setChanged();
									}
								}
							}
						}
						if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == TruedarknessModItems.AMOGUS_MORS.get()) {
							if (entity instanceof Player _player && !_player.level().isClientSide())
								_player.displayClientMessage(Component.literal("\u00A7cSUS"), true);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("truedarkness:item.amogus_mors.use")), SoundSource.PLAYERS, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("truedarkness:item.amogus_mors.use")), SoundSource.PLAYERS, 1, 1, false);
								}
							}
						}
					});
				}
			});
		}
	}
}
