
package exp.fluffynuar.truedarkness.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class PhantomProtectionMobEffect extends MobEffect {
	public PhantomProtectionMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -2753025);
	}

	@Override
	public String getDescriptionId() {
		return "effect.truedarkness.phantom_protection";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
