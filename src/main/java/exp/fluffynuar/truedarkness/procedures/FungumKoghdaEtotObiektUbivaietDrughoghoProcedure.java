package exp.fluffynuar.truedarkness.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerLevel;

import java.util.Calendar;

import exp.fluffynuar.truedarkness.init.TruedarknessModItems;

public class FungumKoghdaEtotObiektUbivaietDrughoghoProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity sourceentity) {
		if (sourceentity == null)
			return;
		if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.CONFUSION, (int) (20 * 60 * 6), 0, false, false));
		if (Calendar.getInstance().get(Calendar.DAY_OF_MONTH) == 22 && Calendar.getInstance().get(Calendar.MONTH) == 2 || Calendar.getInstance().get(Calendar.DAY_OF_MONTH) == 25 && Calendar.getInstance().get(Calendar.MONTH) == 12) {
			if (world instanceof ServerLevel _level) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(TruedarknessModItems.NEGLECTED_INGOT.get()));
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
		}
	}
}
