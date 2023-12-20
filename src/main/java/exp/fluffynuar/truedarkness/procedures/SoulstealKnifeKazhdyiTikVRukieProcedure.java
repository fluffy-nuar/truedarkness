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
import net.minecraft.world.InteractionHand;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import exp.fluffynuar.truedarkness.init.TruedarknessModMobEffects;
import exp.fluffynuar.truedarkness.init.TruedarknessModItems;
import exp.fluffynuar.truedarkness.TruedarknessMod;

public class SoulstealKnifeKazhdyiTikVRukieProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(TruedarknessModMobEffects.HARP_ECHO.get())
				&& (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == TruedarknessModItems.SOULSTEAL_KNIFE.get()) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DARKNESS, 60, 0, false, false));
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.SCULK_SOUL, x, y, z, 10, 0.1, 0.1, 0.1, 0.2);
			TruedarknessMod.queueServerWork(20, () -> {
				if (entity instanceof LivingEntity _livEnt5 && _livEnt5.hasEffect(TruedarknessModMobEffects.HARP_ECHO.get())
						&& (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == TruedarknessModItems.SOULSTEAL_KNIFE.get()) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.sculk.charge")), SoundSource.PLAYERS, 1, (float) 0.2);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.sculk.charge")), SoundSource.PLAYERS, 1, (float) 0.2, false);
						}
					}
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(TruedarknessModItems.ECHO_KNIFE.get());
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
					if (entity instanceof LivingEntity _entity)
						_entity.removeEffect(TruedarknessModMobEffects.HARP_ECHO.get());
				}
			});
		}
	}
}
