
package exp.fluffynuar.truedarkness.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class DealCooldownMobEffect extends MobEffect {
	public DealCooldownMobEffect() {
		super(MobEffectCategory.NEUTRAL, -8923206);
	}

	@Override
	public String getDescriptionId() {
		return "effect.truedarkness.deal_cooldown";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
