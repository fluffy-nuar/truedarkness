
package exp.fluffynuar.truedarkness.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class LoseHideMobEffect extends MobEffect {
	public LoseHideMobEffect() {
		super(MobEffectCategory.NEUTRAL, -13754051);
	}

	@Override
	public String getDescriptionId() {
		return "effect.truedarkness.lose_hide";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
