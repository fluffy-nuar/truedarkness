
package exp.fluffynuar.truedarkness.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class ToxicVapourMobEffect extends MobEffect {
	public ToxicVapourMobEffect() {
		super(MobEffectCategory.NEUTRAL, -11855506);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
