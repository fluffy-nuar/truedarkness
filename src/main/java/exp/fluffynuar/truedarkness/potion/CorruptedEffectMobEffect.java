
package exp.fluffynuar.truedarkness.potion;

import net.minecraftforge.client.extensions.common.IClientMobEffectExtensions;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import exp.fluffynuar.truedarkness.procedures.CorruptedEffectKoghdaEffiektNachatprimienienProcedure;

public class CorruptedEffectMobEffect extends MobEffect {
	public CorruptedEffectMobEffect() {
		super(MobEffectCategory.HARMFUL, -14808011);
	}

	@Override
	public String getDescriptionId() {
		return "effect.truedarkness.the_alive";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		CorruptedEffectKoghdaEffiektNachatprimienienProcedure.execute(entity);
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
