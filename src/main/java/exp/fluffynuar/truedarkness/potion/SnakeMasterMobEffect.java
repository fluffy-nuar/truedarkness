
package exp.fluffynuar.truedarkness.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import exp.fluffynuar.truedarkness.procedures.SnakeMasterKazhdyiTikVoVriemiaEffiektaProcedure;

public class SnakeMasterMobEffect extends MobEffect {
	public SnakeMasterMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -14651821);
	}

	@Override
	public String getDescriptionId() {
		return "effect.truedarkness.snake_master";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		SnakeMasterKazhdyiTikVoVriemiaEffiektaProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
