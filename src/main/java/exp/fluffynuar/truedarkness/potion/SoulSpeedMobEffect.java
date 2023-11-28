
package exp.fluffynuar.truedarkness.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class SoulSpeedMobEffect extends MobEffect {
	public SoulSpeedMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -11026953);
	}

	@Override
	public String getDescriptionId() {
		return "effect.truedarkness.soul_speed";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
