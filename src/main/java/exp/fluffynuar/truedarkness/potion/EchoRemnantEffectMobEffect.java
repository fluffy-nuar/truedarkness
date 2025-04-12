
package exp.fluffynuar.truedarkness.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import exp.fluffynuar.truedarkness.procedures.EchoRemnantEffectPriIstiechieniiEffiektaProcedure;
import exp.fluffynuar.truedarkness.procedures.EchoRemnantEffectKazhdyiTikVoVriemiaEffiektaProcedure;

public class EchoRemnantEffectMobEffect extends MobEffect {
	public EchoRemnantEffectMobEffect() {
		super(MobEffectCategory.NEUTRAL, -1);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		EchoRemnantEffectKazhdyiTikVoVriemiaEffiektaProcedure.execute();
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		EchoRemnantEffectPriIstiechieniiEffiektaProcedure.execute();
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
