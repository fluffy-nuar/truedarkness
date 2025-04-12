package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.InteractionHand;
import net.minecraft.network.chat.Component;

import exp.fluffynuar.truedarkness.network.TruedarknessModVariables;
import exp.fluffynuar.truedarkness.init.TruedarknessModMobEffects;

public class CrystalTravelingEffectKazhdyiTikVoVriemiaEffiektaProcedure {
	public static void execute(double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		ItemStack Metenite_shard = ItemStack.EMPTY;
		ItemStack eridium = ItemStack.EMPTY;
		double x_cluster = 0;
		double y_cluster = 0;
		double z_cluster = 0;
		double un_selected = 0;
		double selected = 0;
		if (entity.isShiftKeyDown() && entity instanceof LivingEntity _livEnt1 && _livEnt1.hasEffect(TruedarknessModMobEffects.CRYSTAL_TRAVELING_EFFECT.get())) {
			Metenite_shard = ((entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TruedarknessModVariables.PlayerVariables())).Metenite_shard).copy();
			un_selected = Metenite_shard.getOrCreateTag().getDouble("Maximum") + 2;
			while (!(Metenite_shard.getOrCreateTag().getString(("Line" + Math.round(un_selected)))).equals("") && !(un_selected >= 7)) {
				un_selected = un_selected + 1;
			}
			Metenite_shard.getOrCreateTag().putDouble("Maximum", (un_selected - 2));
			if (Metenite_shard.getOrCreateTag().getDouble("SelectedLine") + 1 <= Metenite_shard.getOrCreateTag().getDouble("Maximum") + 2) {
				Metenite_shard.getOrCreateTag().putDouble("SelectedLine", (Metenite_shard.getOrCreateTag().getDouble("SelectedLine") + 1));
				if (entity instanceof LivingEntity _entity)
					_entity.swing(InteractionHand.MAIN_HAND, true);
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal((!(Metenite_shard.getOrCreateTag().getString(("Line" + Math.round(Metenite_shard.getOrCreateTag().getDouble("SelectedLine"))))).equals("")
							? Metenite_shard.getOrCreateTag().getString(("Line" + Math.round(Metenite_shard.getOrCreateTag().getDouble("SelectedLine"))))
							: Component.translatable("item.truedarkness.general_heart.empty_slot").getString())), true);
			} else {
				Metenite_shard.getOrCreateTag().putDouble("SelectedLine", 1);
				if (entity instanceof LivingEntity _entity)
					_entity.swing(InteractionHand.MAIN_HAND, true);
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal((!(Metenite_shard.getOrCreateTag().getString(("Line" + Math.round(Metenite_shard.getOrCreateTag().getDouble("SelectedLine"))))).equals("")
							? Metenite_shard.getOrCreateTag().getString(("Line" + Math.round(Metenite_shard.getOrCreateTag().getDouble("SelectedLine"))))
							: Component.translatable("item.truedarkness.general_heart.empty_slot").getString())), true);
			}
			{
				ItemStack _setval = Metenite_shard;
				entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Metenite_shard = _setval.copy();
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (!entity.isShiftKeyDown() && entity instanceof LivingEntity _livEnt25 && _livEnt25.hasEffect(TruedarknessModMobEffects.CRYSTAL_TRAVELING_EFFECT.get())) {
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(TruedarknessModMobEffects.CRYSTAL_TRAVELING_EFFECT.get());
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.DARKNESS);
		} else {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(TruedarknessModMobEffects.CRYSTAL_TRAVELING_EFFECT.get(), 9999999, 0, false, false));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DARKNESS, 9999999, 0, false, false));
			{
				double _setval = x;
				entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Using_crystal_x = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = y;
				entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Using_crystal_y = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = z;
				entity.getCapability(TruedarknessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Using_crystal_z = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
