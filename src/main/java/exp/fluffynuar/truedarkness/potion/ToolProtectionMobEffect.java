
package exp.fluffynuar.truedarkness.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class ToolProtectionMobEffect extends MobEffect {
	public ToolProtectionMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -6037252);
	}

	@Override
	public String getDescriptionId() {
		return "effect.truedarkness.tool_protection";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
