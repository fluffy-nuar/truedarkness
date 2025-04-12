
package exp.fluffynuar.truedarkness.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class DealCooldownMobEffect extends MobEffect {
	public DealCooldownMobEffect() {
		super(MobEffectCategory.NEUTRAL, -4141093);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
