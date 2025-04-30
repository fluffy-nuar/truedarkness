
package exp.fluffynuar.truedarkness.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import exp.fluffynuar.truedarkness.procedures.CrystalTravelingEffectPriIstiechieniiEffiektaProcedure;

public class CrystalTravelingEffectMobEffect extends MobEffect {
	public CrystalTravelingEffectMobEffect() {
		super(MobEffectCategory.NEUTRAL, -1);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		CrystalTravelingEffectPriIstiechieniiEffiektaProcedure.execute();
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
