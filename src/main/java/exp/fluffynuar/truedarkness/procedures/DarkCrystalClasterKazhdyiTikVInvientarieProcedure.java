package exp.fluffynuar.truedarkness.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.GameType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.tags.ItemTags;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;
import net.minecraft.client.Minecraft;

import exp.fluffynuar.truedarkness.network.TruedarknessModVariables;
import exp.fluffynuar.truedarkness.init.TruedarknessModItems;

public class DarkCrystalClasterKazhdyiTikVInvientarieProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if ((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).HoldAbility3
				&& (entity instanceof Player _plrCldRem1 ? _plrCldRem1.getCooldowns().getCooldownPercent(itemstack.getItem(), 0f) * 100 : 0) == 0) {
			if (!(((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getString("desc"))
					.equals(ForgeRegistries.ITEMS.getKey((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()).toString()))
					&& (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("truedarkness:dark_addons")))) {
				(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putString("desc",
						(ForgeRegistries.ITEMS.getKey((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()).toString()));
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
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(TruedarknessModItems.DARK_CRYSTAL.get());
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.end_portal_frame.fill")), SoundSource.PLAYERS, 1, (float) 0.5);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.end_portal_frame.fill")), SoundSource.PLAYERS, 1, (float) 0.5, false);
					}
				}
				if (entity instanceof LivingEntity _entity)
					_entity.swing(InteractionHand.MAIN_HAND, true);
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown(itemstack.getItem(), 40);
			} else if (!(((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getOrCreateTag().getString("desc"))
					.equals(ForgeRegistries.ITEMS.getKey((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem()).toString()))
					&& (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("truedarkness:dark_addons")))) {
				(entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getOrCreateTag().putString("desc",
						(ForgeRegistries.ITEMS.getKey((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem()).toString()));
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
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(TruedarknessModItems.DARK_CRYSTAL.get());
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.end_portal_frame.fill")), SoundSource.PLAYERS, 1, (float) 0.5);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.end_portal_frame.fill")), SoundSource.PLAYERS, 1, (float) 0.5, false);
					}
				}
				if (entity instanceof LivingEntity _entity)
					_entity.swing(InteractionHand.OFF_HAND, true);
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown(itemstack.getItem(), 40);
			}
		}
	}
}
