
package exp.fluffynuar.truedarkness.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import exp.fluffynuar.truedarkness.procedures.ReactorRadientPriNalozhieniiEffiektaProcedure;
import exp.fluffynuar.truedarkness.procedures.ReactorRadientKazhdyiTikVoVriemiaEffiektaProcedure;

public class ReactorRadientMobEffect extends MobEffect {
	public ReactorRadientMobEffect() {
		super(MobEffectCategory.NEUTRAL, -8121926);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		ReactorRadientKazhdyiTikVoVriemiaEffiektaProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		ReactorRadientPriNalozhieniiEffiektaProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
