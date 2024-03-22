
package exp.fluffynuar.truedarkness.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class TargetMobEffect extends MobEffect {
	public TargetMobEffect() {
		super(MobEffectCategory.NEUTRAL, -9690829);
	}

	@Override
	public String getDescriptionId() {
		return "effect.truedarkness.target";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
