package exp.fluffynuar.truedarkness.procedures;

import top.theillusivec4.curios.api.CuriosApi;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.GameType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.ItemTags;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.client.Minecraft;

import javax.annotation.Nullable;

import java.util.List;
import java.util.Comparator;

import exp.fluffynuar.truedarkness.network.TruedarknessModVariables;
import exp.fluffynuar.truedarkness.init.TruedarknessModMobEffects;
import exp.fluffynuar.truedarkness.init.TruedarknessModItems;

@Mod.EventBusSubscriber
public class AttackProcProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
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
		double add = 0;
		if (((sourceentity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Faction).equals("corrupt")) {
			if (sourceentity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(TruedarknessModMobEffects.CORRUPTED_REMNANT_USING.get())) {
				if (sourceentity instanceof LivingEntity _livEnt1 && _livEnt1.hasEffect(TruedarknessModMobEffects.HUNTING.get())) {
					{
						final Vec3 _center = new Vec3(x, y, z);
						List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(26 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
						for (Entity entityiterator : _entfound) {
							if (entityiterator instanceof TamableAnimal _tamIsTamedBy && sourceentity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false) {
								if (entityiterator instanceof Mob _entity && entity instanceof LivingEntity _ent)
									_entity.setTarget(_ent);
								if (entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("truedarkness:undead_corrupted")))) {
									if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
										_entity.addEffect(new MobEffectInstance(TruedarknessModMobEffects.BLOODSHED.get(), 600, 0, true, false));
									if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
										_entity.addEffect(new MobEffectInstance(MobEffects.GLOWING, 20, 0, true, false));
								}
							}
						}
					}
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.GLOWING, 30, 0, true, false));
					if (sourceentity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal((entity.getDisplayName().getString() + "" + Component.translatable("item.truedarkness.alive_core.attack").getString())), true);
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					}
				} else {
					if (((sourceentity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).WhitelistPlayer).getItem() == ItemStack.EMPTY.getItem()) {
						{
							ItemStack _setval = new ItemStack(TruedarknessModItems.EVOLUTION_ERIDIUM_SHARD.get());
							sourceentity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.WhitelistPlayer = _setval.copy();
								capability.syncPlayerVariables(sourceentity);
							});
						}
					}
					while (!(((sourceentity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).WhitelistPlayer).getOrCreateTag().getString(("Player" + Math.round(add))))
							.equals("")
							&& !(((sourceentity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).WhitelistPlayer).getOrCreateTag()
									.getString(("Player" + Math.round(add)))).equals(entity.getStringUUID())) {
						add = add + 1;
					}
					if ((((sourceentity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).WhitelistPlayer).getOrCreateTag().getString(("Player" + Math.round(add))))
							.equals(entity.getStringUUID())) {
						while (!(((sourceentity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).WhitelistPlayer).getOrCreateTag()
								.getString(("Player" + Math.round(add)))).equals("")) {
							((sourceentity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).WhitelistPlayer).getOrCreateTag().putString(("Player" + Math.round(add)),
									(((sourceentity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).WhitelistPlayer).getOrCreateTag()
											.getString(("Player" + Math.round(add + 1)))));
							add = add + 1;
						}
						if (sourceentity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal((entity.getDisplayName().getString() + "" + Component.translatable("item.truedarkness.alive_core.enemy").getString())), true);
					} else {
						((sourceentity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).WhitelistPlayer).getOrCreateTag().putString(("Player" + Math.round(add)),
								(entity.getStringUUID()));
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.GLOWING, 20, 0, true, false));
						if (sourceentity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal((entity.getDisplayName().getString() + "" + Component.translatable("item.truedarkness.alive_core.friend").getString())), true);
					}
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					}
				}
			} else {
				if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("truedarkness:cursed_tools")))
						&& (((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getString("Tale3")).equals("glowing")
								|| ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getString("Tale2")).equals("glowing")
								|| ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getString("Tale1")).equals("glowing"))) {
					if (sourceentity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(TruedarknessModItems.ALIVE_CORE.get(), lv).isPresent() : false) {
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.GLOWING, (int) (20 * 20), 0, true, false));
					} else {
						if (sourceentity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal((Component.translatable("item.truedarkness.blink_eridium.need").getString() + " " + Component.translatable("item.truedarkness.alive_core").getString())), false);
					}
				}
			}
		}
		if (((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Faction).equals("corrupt")) {
			if (entity instanceof LivingEntity _livEnt44 && _livEnt44.hasEffect(TruedarknessModMobEffects.REACTOR_RADIENT.get())) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 60, 0));
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 60, 0));
			} else {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 60, 0));
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.HUNGER, 60, 0));
			}
		}
		if (((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == TruedarknessModItems.TOTEM_OF_DYING.get()
				|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == TruedarknessModItems.TOTEM_OF_DYING.get()) && !(new Object() {
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
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.HARM, 1200, 5, false, false));
		}
	}
}
