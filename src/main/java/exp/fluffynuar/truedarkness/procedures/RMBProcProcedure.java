package exp.fluffynuar.truedarkness.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ExperienceOrb;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
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
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.arguments.EntityAnchorArgument;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import javax.annotation.Nullable;

import exp.fluffynuar.truedarkness.init.TruedarknessModMobEffects;
import exp.fluffynuar.truedarkness.init.TruedarknessModItems;
import exp.fluffynuar.truedarkness.entity.MinerEntity;
import exp.fluffynuar.truedarkness.entity.GloomerElderEntity;

@Mod.EventBusSubscriber
public class RMBProcProcedure {
	@SubscribeEvent
	public static void onRightClickEntity(PlayerInteractEvent.EntityInteract event) {
		if (event.getHand() != event.getEntity().getUsedItemHand())
			return;
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getTarget(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		execute(null, world, x, y, z, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (sourceentity instanceof Player && !(sourceentity instanceof LivingEntity _livEnt1 && _livEnt1.hasEffect(TruedarknessModMobEffects.DEAL_COOLDOWN.get())) && entity instanceof MinerEntity
				&& !(entity instanceof LivingEntity _livEnt3 && _livEnt3.hasEffect(TruedarknessModMobEffects.DEAL_COOLDOWN.get()))
				&& ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == TruedarknessModItems.CVETALIY_GRAIN.get()
						|| (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == TruedarknessModItems.CVETALIT_SHARD.get()
						|| (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == TruedarknessModItems.CVETALIY.get())) {
			if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == TruedarknessModItems.CVETALIY_GRAIN.get() && Mth.nextInt(RandomSource.create(), 1, 100) <= 10) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, (y + 1), z,
							new ItemStack((ForgeRegistries.ITEMS.tags().getTag(ItemTags.create(new ResourceLocation("truedarkness:miner_trades"))).getRandomElement(RandomSource.create()).orElseGet(() -> Items.AIR))));
					entityToSpawn.setPickUpDelay(0);
					_level.addFreshEntity(entityToSpawn);
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("truedarkness:entity.miner.trade.succes")), SoundSource.HOSTILE, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("truedarkness:entity.miner.trade.succes")), SoundSource.HOSTILE, 1, 1, false);
					}
				}
				if (world instanceof ServerLevel _level)
					_level.addFreshEntity(new ExperienceOrb(_level, (entity.getX()), (entity.getY()), (entity.getZ()), Mth.nextInt(RandomSource.create(), 1, 8)));
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(TruedarknessModMobEffects.DEAL_COOLDOWN.get(), 60, 0, false, false));
				if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(TruedarknessModMobEffects.DEAL_COOLDOWN.get(), 60, 0, false, false));
				entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((sourceentity.getX()), (sourceentity.getY() + 1), (sourceentity.getZ())));
				if (sourceentity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("truedarkness:another_level_advancement"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						for (String criteria : _ap.getRemainingCriteria())
							_player.getAdvancements().award(_adv, criteria);
					}
				}
			} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == TruedarknessModItems.CVETALIT_SHARD.get() && Mth.nextInt(RandomSource.create(), 1, 100) <= 50) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, (y + 1), z,
							new ItemStack((ForgeRegistries.ITEMS.tags().getTag(ItemTags.create(new ResourceLocation("truedarkness:miner_trades"))).getRandomElement(RandomSource.create()).orElseGet(() -> Items.AIR))));
					entityToSpawn.setPickUpDelay(0);
					_level.addFreshEntity(entityToSpawn);
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("truedarkness:entity.miner.trade.succes")), SoundSource.HOSTILE, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("truedarkness:entity.miner.trade.succes")), SoundSource.HOSTILE, 1, 1, false);
					}
				}
				if (world instanceof ServerLevel _level)
					_level.addFreshEntity(new ExperienceOrb(_level, (entity.getX()), (entity.getY()), (entity.getZ()), Mth.nextInt(RandomSource.create(), 1, 8)));
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(TruedarknessModMobEffects.DEAL_COOLDOWN.get(), 60, 0, false, false));
				if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(TruedarknessModMobEffects.DEAL_COOLDOWN.get(), 60, 0, false, false));
				entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((sourceentity.getX()), (sourceentity.getY() + 1), (sourceentity.getZ())));
				if (sourceentity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("truedarkness:another_level_advancement"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						for (String criteria : _ap.getRemainingCriteria())
							_player.getAdvancements().award(_adv, criteria);
					}
				}
			} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == TruedarknessModItems.CVETALIY.get()) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, (y + 1), z,
							new ItemStack((ForgeRegistries.ITEMS.tags().getTag(ItemTags.create(new ResourceLocation("truedarkness:miner_trades"))).getRandomElement(RandomSource.create()).orElseGet(() -> Items.AIR))));
					entityToSpawn.setPickUpDelay(0);
					_level.addFreshEntity(entityToSpawn);
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("truedarkness:entity.miner.trade.succes")), SoundSource.HOSTILE, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("truedarkness:entity.miner.trade.succes")), SoundSource.HOSTILE, 1, 1, false);
					}
				}
				if (world instanceof ServerLevel _level)
					_level.addFreshEntity(new ExperienceOrb(_level, (entity.getX()), (entity.getY()), (entity.getZ()), Mth.nextInt(RandomSource.create(), 1, 8)));
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(TruedarknessModMobEffects.DEAL_COOLDOWN.get(), 60, 0, false, false));
				if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(TruedarknessModMobEffects.DEAL_COOLDOWN.get(), 60, 0, false, false));
				entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((sourceentity.getX()), (sourceentity.getY() + 1), (sourceentity.getZ())));
				if (sourceentity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("truedarkness:another_level_advancement"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						for (String criteria : _ap.getRemainingCriteria())
							_player.getAdvancements().award(_adv, criteria);
					}
				}
			} else {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("truedarkness:entity.miner.traid.fail")), SoundSource.HOSTILE, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("truedarkness:entity.miner.traid.fail")), SoundSource.HOSTILE, 1, 1, false);
					}
				}
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.SQUID_INK, (entity.getX()), (entity.getY() + 1), (entity.getZ()), 8, 0.2, 0.2, 0.2, 0.01);
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(TruedarknessModMobEffects.DEAL_COOLDOWN.get(), 40, 0, false, false));
				if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(TruedarknessModMobEffects.DEAL_COOLDOWN.get(), 40, 0, false, false));
				entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((sourceentity.getX()), (sourceentity.getY() + 1), (sourceentity.getZ())));
			}
			if (sourceentity instanceof LivingEntity _entity) {
				ItemStack _setstack = (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).copy();
				_setstack.setCount((int) ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount() - 1));
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		}
		if (sourceentity instanceof Player && !(sourceentity instanceof LivingEntity _livEnt79 && _livEnt79.hasEffect(TruedarknessModMobEffects.DEAL_COOLDOWN.get()))
				&& entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("truedarkness:gloomer"))) && !(entity instanceof LivingEntity _livEnt81 && _livEnt81.hasEffect(TruedarknessModMobEffects.DEAL_COOLDOWN.get()))) {
			if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == TruedarknessModItems.REINFORCED_SHELL.get()
					&& (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount() >= entity.getPersistentData().getDouble("gloomer_price") && !sourceentity.isShiftKeyDown()) {
				if (sourceentity instanceof LivingEntity _entity) {
					ItemStack _setstack = (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).copy();
					_setstack.setCount((int) ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount() - entity.getPersistentData().getDouble("gloomer_price")));
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()),
							new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation(((entity.getPersistentData().getString("gloomer_trade"))).toLowerCase(java.util.Locale.ENGLISH)))));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("truedarkness:entity.gloomer.ambient")), SoundSource.HOSTILE, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("truedarkness:entity.gloomer.ambient")), SoundSource.HOSTILE, 1, 1, false);
					}
				}
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(TruedarknessModMobEffects.DEAL_COOLDOWN.get(), 60, 0, false, false));
				if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(TruedarknessModMobEffects.DEAL_COOLDOWN.get(), 60, 0, false, false));
				entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((sourceentity.getX()), (sourceentity.getY() + 1), (sourceentity.getZ())));
				if (sourceentity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("truedarkness:be_quiet_advancement"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						for (String criteria : _ap.getRemainingCriteria())
							_player.getAdvancements().award(_adv, criteria);
					}
				}
			} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == TruedarknessModItems.LETTER.get() && entity instanceof GloomerElderEntity && !sourceentity.isShiftKeyDown()) {
				if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == TruedarknessModItems.REINFORCED_SHELL.get()
						&& (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getCount() >= 32) {
					if (sourceentity instanceof LivingEntity _entity) {
						ItemStack _setstack = (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).copy();
						_setstack.setCount((int) ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount() - 1));
						_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
					if (sourceentity instanceof LivingEntity _entity) {
						ItemStack _setstack = (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).copy();
						_setstack.setCount((int) ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getCount() - 32));
						_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(TruedarknessModItems.EMPTY_SPELL.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("truedarkness:entity.gloomer.ambient")), SoundSource.HOSTILE, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("truedarkness:entity.gloomer.ambient")), SoundSource.HOSTILE, 1, 1, false);
						}
					}
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(TruedarknessModMobEffects.DEAL_COOLDOWN.get(), 60, 0, false, false));
					if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(TruedarknessModMobEffects.DEAL_COOLDOWN.get(), 60, 0, false, false));
					entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((sourceentity.getX()), (sourceentity.getY() + 1), (sourceentity.getZ())));
				} else {
					if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getCount() >= 32) {
						if (sourceentity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal((Component.translatable("entity.truedarkness.gloomer_craftsman.deal").getString() + "" + Component.translatable("item.truedarkness.empty_spell").getString())), true);
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(TruedarknessModMobEffects.DEAL_COOLDOWN.get(), 20, 0, false, false));
						if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(TruedarknessModMobEffects.DEAL_COOLDOWN.get(), 20, 0, false, false));
					} else {
						if (sourceentity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal((Component.translatable("entity.truedarkness.gloomer_craftsman.deal").getString() + "" + Component.translatable("item.truedarkness.empty_spell").getString()
									+ Component.translatable("entity.truedarkness.gloomer_craftsman.deal_1").getString() + Math.round(32 - (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getCount()) + " "
									+ Component.translatable("item.truedarkness.reinforced_shell").getString())), true);
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(TruedarknessModMobEffects.DEAL_COOLDOWN.get(), 20, 0, false, false));
						if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(TruedarknessModMobEffects.DEAL_COOLDOWN.get(), 20, 0, false, false));
					}
				}
			} else {
				if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount() >= entity.getPersistentData().getDouble("gloomer_price")) {
					if (sourceentity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal(
								(Component.translatable("entity.truedarkness.gloomer_craftsman.deal").getString() + "" + Component.translatable(("item." + (entity.getPersistentData().getString("gloomer_trade")).replace(":", "."))).getString())),
								true);
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(TruedarknessModMobEffects.DEAL_COOLDOWN.get(), 20, 0, false, false));
					if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(TruedarknessModMobEffects.DEAL_COOLDOWN.get(), 20, 0, false, false));
				} else {
					if (sourceentity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal((Component.translatable("entity.truedarkness.gloomer_craftsman.deal").getString() + ""
								+ Component.translatable(("item." + (entity.getPersistentData().getString("gloomer_trade")).replace(":", "."))).getString() + Component.translatable("entity.truedarkness.gloomer_craftsman.deal_1").getString()
								+ Math.round(entity.getPersistentData().getDouble("gloomer_price") - (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount()) + " "
								+ Component.translatable("item.truedarkness.reinforced_shell").getString())), true);
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(TruedarknessModMobEffects.DEAL_COOLDOWN.get(), 20, 0, false, false));
					if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(TruedarknessModMobEffects.DEAL_COOLDOWN.get(), 20, 0, false, false));
				}
			}
		}
	}
}
