
package exp.fluffynuar.truedarkness.potion;

import net.minecraftforge.client.extensions.common.IClientMobEffectExtensions;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import java.util.List;
import java.util.ArrayList;

public class HuntingMobEffect extends MobEffect {
	public HuntingMobEffect() {
		super(MobEffectCategory.NEUTRAL, -10924693);
	}

	@Override
	public List<ItemStack> getCurativeItems() {
		ArrayList<ItemStack> cures = new ArrayList<ItemStack>();
		return cures;
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
