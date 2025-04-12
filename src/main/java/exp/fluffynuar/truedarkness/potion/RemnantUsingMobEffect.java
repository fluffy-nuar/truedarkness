
package exp.fluffynuar.truedarkness.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import exp.fluffynuar.truedarkness.procedures.RemnantUsingPriNalozhieniiEffiektaProcedure;
import exp.fluffynuar.truedarkness.procedures.RemnantUsingPriIstiechieniiEffiektaProcedure;
import exp.fluffynuar.truedarkness.procedures.RemnantUsingKazhdyiTikVoVriemiaEffiektaProcedure;

public class RemnantUsingMobEffect extends MobEffect {
	public RemnantUsingMobEffect() {
		super(MobEffectCategory.NEUTRAL, -13395457);
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.addAttributeModifiers(entity, attributeMap, amplifier);
		RemnantUsingPriNalozhieniiEffiektaProcedure.execute(entity.level(), entity);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		RemnantUsingKazhdyiTikVoVriemiaEffiektaProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		RemnantUsingPriIstiechieniiEffiektaProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
