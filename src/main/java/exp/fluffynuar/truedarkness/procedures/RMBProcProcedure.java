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
import net.minecraft.tags.ItemTags;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.arguments.EntityAnchorArgument;

import javax.annotation.Nullable;

import exp.fluffynuar.truedarkness.network.TruedarknessModVariables;
import exp.fluffynuar.truedarkness.init.TruedarknessModMobEffects;
import exp.fluffynuar.truedarkness.init.TruedarknessModItems;
import exp.fluffynuar.truedarkness.entity.MinerEntity;

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
			if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == TruedarknessModItems.CVETALIY_GRAIN.get() && Mth.nextInt(RandomSource.create(), 1, 10) >= 9) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, (y + 1), z,
							new ItemStack((ForgeRegistries.ITEMS.tags().getTag(ItemTags.create(new ResourceLocation("forge:miner_trade_loot"))).getRandomElement(RandomSource.create()).orElseGet(() -> Items.AIR))));
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
			} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == TruedarknessModItems.CVETALIT_SHARD.get() && Mth.nextInt(RandomSource.create(), 1, 10) >= 6) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, (y + 1), z,
							new ItemStack((ForgeRegistries.ITEMS.tags().getTag(ItemTags.create(new ResourceLocation("forge:miner_trade_loot"))).getRandomElement(RandomSource.create()).orElseGet(() -> Items.AIR))));
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
			} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == TruedarknessModItems.CVETALIY.get()) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, (y + 1), z,
							new ItemStack((ForgeRegistries.ITEMS.tags().getTag(ItemTags.create(new ResourceLocation("forge:miner_trade_loot"))).getRandomElement(RandomSource.create()).orElseGet(() -> Items.AIR))));
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
				ItemStack _setstack = (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
				_setstack.setCount((int) ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount() - 1));
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		}
		if ((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Trade == false && sourceentity instanceof Player
				&& !(sourceentity instanceof LivingEntity _livEnt76 && _livEnt76.hasEffect(TruedarknessModMobEffects.DEAL_COOLDOWN.get())) && entity instanceof MinerEntity
				&& !(entity instanceof LivingEntity _livEnt78 && _livEnt78.hasEffect(TruedarknessModMobEffects.DEAL_COOLDOWN.get()))) {
			if ((sourceentity.getStringUUID()).equals("052ef8444947452c867d902c8fa1cd94")) {
				if (sourceentity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal((Component.translatable("entity.truedarkness.miner.trade.gridexpert").getString())), false);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.bucket.fill_axolotl")), SoundSource.HOSTILE, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.bucket.fill_axolotl")), SoundSource.HOSTILE, 1, 1, false);
					}
				}
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, (y + 1), z, new ItemStack(TruedarknessModItems.AXOLOTL_HAT.get()));
					entityToSpawn.setPickUpDelay(0);
					_level.addFreshEntity(entityToSpawn);
				}
				{
					boolean _setval = true;
					entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Trade = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if ((sourceentity.getStringUUID()).equals("6b22607f71d3413d8735d9f5558fe704")) {
				if (sourceentity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal((Component.translatable("entity.truedarkness.miner.trade.demasfen_").getString())), false);
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, (y + 1), z, new ItemStack(TruedarknessModItems.FROZEN_STEAL_KEY.get()));
					entityToSpawn.setPickUpDelay(0);
					_level.addFreshEntity(entityToSpawn);
				}
				{
					boolean _setval = true;
					entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Trade = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
	}
}
