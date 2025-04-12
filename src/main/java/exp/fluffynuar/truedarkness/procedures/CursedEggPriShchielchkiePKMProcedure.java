package exp.fluffynuar.truedarkness.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;

public class CursedEggPriShchielchkiePKMProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (entity.isShiftKeyDown()) {
			if (itemstack.getOrCreateTag().getDouble("Typing") == 1 && itemstack.getOrCreateTag().getDouble("Prey") >= 5) {
				itemstack.getOrCreateTag().putDouble("Typing", 5);
			} else if (itemstack.getOrCreateTag().getDouble("Typing") == 5 && itemstack.getOrCreateTag().getDouble("Prey") >= 10) {
				itemstack.getOrCreateTag().putDouble("Typing", 10);
			} else if (itemstack.getOrCreateTag().getDouble("Typing") == 10 && itemstack.getOrCreateTag().getDouble("Prey") >= 50) {
				itemstack.getOrCreateTag().putDouble("Typing", 50);
			} else if (itemstack.getOrCreateTag().getDouble("Typing") == 50 && itemstack.getOrCreateTag().getDouble("Prey") >= 100) {
				itemstack.getOrCreateTag().putDouble("Typing", 100);
			} else if (itemstack.getOrCreateTag().getDouble("Typing") == 100 && itemstack.getOrCreateTag().getDouble("Prey") >= 500) {
				itemstack.getOrCreateTag().putDouble("Typing", 500);
			} else if (itemstack.getOrCreateTag().getDouble("Typing") == 500 && itemstack.getOrCreateTag().getDouble("Prey") >= 1000) {
				itemstack.getOrCreateTag().putDouble("Typing", 1000);
			} else {
				itemstack.getOrCreateTag().putDouble("Typing", 1);
			}
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack.getItem(), 2);
			if (itemstack.getItem() == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()) {
				if (entity instanceof LivingEntity _entity)
					_entity.swing(InteractionHand.MAIN_HAND, true);
			} else if (itemstack.getItem() == (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem()) {
				if (entity instanceof LivingEntity _entity)
					_entity.swing(InteractionHand.OFF_HAND, true);
			}
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(("\u00A75" + Math.round(itemstack.getOrCreateTag().getDouble("Typing")))), true);
		} else {
			if (itemstack.getOrCreateTag().getBoolean("Extract") != true) {
				itemstack.getOrCreateTag().putBoolean("Extract", true);
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown(itemstack.getItem(), 8);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("truedarkness:player.corrupted.teleport.eradicated")), SoundSource.PLAYERS, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("truedarkness:player.corrupted.teleport.eradicated")), SoundSource.PLAYERS, 1, 1, false);
					}
				}
			} else {
				itemstack.getOrCreateTag().putBoolean("Extract", false);
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown(itemstack.getItem(), 8);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("truedarkness:player.corrupted.teleport.eradicated")), SoundSource.PLAYERS, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("truedarkness:player.corrupted.teleport.eradicated")), SoundSource.PLAYERS, 1, 1, false);
					}
				}
			}
		}
	}
}
