
package exp.fluffynuar.truedarkness.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import exp.fluffynuar.truedarkness.procedures.ReducedVisibilityKoghdaEffiektNachatprimienienProcedure;

public class ReducedVisibilityMobEffect extends MobEffect {
	public ReducedVisibilityMobEffect() {
		super(MobEffectCategory.HARMFUL, -13421773);
	}

	@Override
	public String getDescriptionId() {
		return "effect.truedarkness.reduced_visibility";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		ReducedVisibilityKoghdaEffiektNachatprimienienProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
