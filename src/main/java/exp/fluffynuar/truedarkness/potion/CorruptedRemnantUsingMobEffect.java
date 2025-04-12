
package exp.fluffynuar.truedarkness.potion;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import java.util.List;
import java.util.ArrayList;

import exp.fluffynuar.truedarkness.procedures.CorruptedRemnantUsingPriNalozhieniiEffiektaProcedure;
import exp.fluffynuar.truedarkness.procedures.CorruptedRemnantUsingPriIstiechieniiEffiektaProcedure;
import exp.fluffynuar.truedarkness.procedures.CorruptedRemnantUsingKazhdyiTikVoVriemiaEffiektaProcedure;

public class CorruptedRemnantUsingMobEffect extends MobEffect {
	public CorruptedRemnantUsingMobEffect() {
		super(MobEffectCategory.NEUTRAL, -11847346);
	}

	@Override
	public List<ItemStack> getCurativeItems() {
		ArrayList<ItemStack> cures = new ArrayList<ItemStack>();
		return cures;
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.addAttributeModifiers(entity, attributeMap, amplifier);
		CorruptedRemnantUsingPriNalozhieniiEffiektaProcedure.execute(entity.level(), entity);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		CorruptedRemnantUsingKazhdyiTikVoVriemiaEffiektaProcedure.execute(entity.level(), entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		CorruptedRemnantUsingPriIstiechieniiEffiektaProcedure.execute(entity.level(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
