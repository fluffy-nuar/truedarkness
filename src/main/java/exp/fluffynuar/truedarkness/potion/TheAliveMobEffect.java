
package exp.fluffynuar.truedarkness.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import exp.fluffynuar.truedarkness.procedures.TheAliveKoghdaEffiektNachatprimienienProcedure;

public class TheAliveMobEffect extends MobEffect {
	public TheAliveMobEffect() {
		super(MobEffectCategory.NEUTRAL, -15527659);
	}

	@Override
	public String getDescriptionId() {
		return "effect.truedarkness.corrupting";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		TheAliveKoghdaEffiektNachatprimienienProcedure.execute(entity.level(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
