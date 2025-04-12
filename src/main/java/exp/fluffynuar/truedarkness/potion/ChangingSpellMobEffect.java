
package exp.fluffynuar.truedarkness.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import exp.fluffynuar.truedarkness.procedures.ChangingSpellPriIstiechieniiEffiektaProcedure;
import exp.fluffynuar.truedarkness.procedures.ChangingSpellKazhdyiTikVoVriemiaEffiektaProcedure;

public class ChangingSpellMobEffect extends MobEffect {
	public ChangingSpellMobEffect() {
		super(MobEffectCategory.NEUTRAL, -1);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		ChangingSpellKazhdyiTikVoVriemiaEffiektaProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		ChangingSpellPriIstiechieniiEffiektaProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
