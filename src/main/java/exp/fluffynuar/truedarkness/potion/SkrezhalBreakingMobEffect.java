
package exp.fluffynuar.truedarkness.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class SkrezhalBreakingMobEffect extends MobEffect {
	public SkrezhalBreakingMobEffect() {
		super(MobEffectCategory.NEUTRAL, -15917563);
	}

	@Override
	public String getDescriptionId() {
		return "effect.truedarkness.skrezhal_breaking";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
