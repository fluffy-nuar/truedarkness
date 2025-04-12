
package exp.fluffynuar.truedarkness.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import exp.fluffynuar.truedarkness.procedures.TargetPriNalozhieniiEffiektaProcedure;
import exp.fluffynuar.truedarkness.procedures.TargetPriIstiechieniiEffiektaProcedure;
import exp.fluffynuar.truedarkness.procedures.TargetKazhdyiTikVoVriemiaEffiektaProcedure;

public class TargetMobEffect extends MobEffect {
	public TargetMobEffect() {
		super(MobEffectCategory.NEUTRAL, -9690829);
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.addAttributeModifiers(entity, attributeMap, amplifier);
		TargetPriNalozhieniiEffiektaProcedure.execute(entity.level(), entity);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		TargetKazhdyiTikVoVriemiaEffiektaProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		TargetPriIstiechieniiEffiektaProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
