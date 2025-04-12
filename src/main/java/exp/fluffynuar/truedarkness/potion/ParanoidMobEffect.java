
package exp.fluffynuar.truedarkness.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import exp.fluffynuar.truedarkness.procedures.ParanoidKazhdyiTikVoVriemiaEffiektaProcedure;

public class ParanoidMobEffect extends MobEffect {
	public ParanoidMobEffect() {
		super(MobEffectCategory.NEUTRAL, -7433063);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		ParanoidKazhdyiTikVoVriemiaEffiektaProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
