
package exp.fluffynuar.truedarkness.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import exp.fluffynuar.truedarkness.procedures.CalmKoghdaNachatProcedure;

public class CalmMobEffect extends MobEffect {
	public CalmMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -2515470);
	}

	@Override
	public String getDescriptionId() {
		return "effect.truedarkness.calm";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		CalmKoghdaNachatProcedure.execute(entity.level(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
