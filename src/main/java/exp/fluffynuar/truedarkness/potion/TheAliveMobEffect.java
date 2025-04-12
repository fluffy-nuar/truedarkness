
package exp.fluffynuar.truedarkness.potion;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import java.util.List;
import java.util.ArrayList;

import exp.fluffynuar.truedarkness.procedures.TheAlivePriIstiechieniiEffiektaProcedure;
import exp.fluffynuar.truedarkness.procedures.TheAliveKazhdyiTikVoVriemiaEffiektaProcedure;

public class TheAliveMobEffect extends MobEffect {
	public TheAliveMobEffect() {
		super(MobEffectCategory.NEUTRAL, -15527659);
	}

	@Override
	public List<ItemStack> getCurativeItems() {
		ArrayList<ItemStack> cures = new ArrayList<ItemStack>();
		return cures;
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		TheAliveKazhdyiTikVoVriemiaEffiektaProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		TheAlivePriIstiechieniiEffiektaProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
