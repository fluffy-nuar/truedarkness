package exp.fluffynuar.truedarkness.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;

import exp.fluffynuar.truedarkness.network.TruedarknessModVariables;
import exp.fluffynuar.truedarkness.init.TruedarknessModMobEffects;

public class ActiveAbility2PriNazhatiiKlavishiProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean find = false;
		double add_count = 0;
		Entity entity_1 = null;
		ItemStack eridium_redact = ItemStack.EMPTY;
		ItemStack metenite = ItemStack.EMPTY;
		if (((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Faction).equals("corrupt")
				&& !(((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).PerkItem).getOrCreateTag().getString("SecondAbility")).equals("")
				&& entity instanceof LivingEntity _livEnt1 && _livEnt1.hasEffect(TruedarknessModMobEffects.CORRUPTED_REMNANT_USING.get())) {
			if ((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Fatigue_second > 0) {
				if (find) {
					if (entity instanceof LivingEntity _entity)
						_entity.removeEffect(TruedarknessModMobEffects.CORRUPTED_REMNANT_USING.get());
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(TruedarknessModMobEffects.STOP_RESTORING.get(), 40, 0, false, false));
					{
						double _setval = (entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Fatigue_second - 1;
						entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Fatigue_second = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
			} else {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal((Component.translatable("item.truedarkness.alive_core.active_denied").getString())), true);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("truedarkness:player.corrupted.teleport.eradicated")), SoundSource.PLAYERS, 1, (float) 0.8);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("truedarkness:player.corrupted.teleport.eradicated")), SoundSource.PLAYERS, 1, (float) 0.8, false);
					}
				}
			}
		}
	}
}
