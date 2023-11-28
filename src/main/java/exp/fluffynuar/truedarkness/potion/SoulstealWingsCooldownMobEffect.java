
package exp.fluffynuar.truedarkness.potion;

import net.minecraftforge.client.extensions.common.IClientMobEffectExtensions;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class SoulstealWingsCooldownMobEffect extends MobEffect {
	public SoulstealWingsCooldownMobEffect() {
		super(MobEffectCategory.NEUTRAL, -15788518);
	}

	@Override
	public String getDescriptionId() {
		return "effect.truedarkness.soulsteal_wings_cooldown";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}

	@Override
	public void initializeClient(java.util.function.Consumer<IClientMobEffectExtensions> consumer) {
		consumer.accept(new IClientMobEffectExtensions() {
			@Override
			public boolean isVisibleInGui(MobEffectInstance effect) {
				return false;
			}
		});
	}
}
