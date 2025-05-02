
package exp.fluffynuar.truedarkness.potion;

import net.minecraftforge.common.ForgeMod;

import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class ToxicVapourMobEffect extends MobEffect {
	public ToxicVapourMobEffect() {
		super(MobEffectCategory.NEUTRAL, -11855506);
		this.addAttributeModifier(Attributes.KNOCKBACK_RESISTANCE, "a3339a06-e47f-3de3-b25c-8fb6006ad34b", -0.03, AttributeModifier.Operation.MULTIPLY_BASE);
		this.addAttributeModifier(ForgeMod.ENTITY_REACH.get(), "11a45e95-fac0-3466-9009-c7286736c840", -0.03, AttributeModifier.Operation.MULTIPLY_BASE);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
