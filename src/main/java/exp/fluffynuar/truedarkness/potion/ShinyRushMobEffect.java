
package exp.fluffynuar.truedarkness.potion;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import java.util.List;
import java.util.ArrayList;

import exp.fluffynuar.truedarkness.procedures.ShinyRushKazhdyiTikVoVriemiaEffiektaProcedure;

public class ShinyRushMobEffect extends MobEffect {
	public ShinyRushMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -2697828);
		this.addAttributeModifier(Attributes.MOVEMENT_SPEED, "e0e01546-c495-3449-b4dc-4e1807ba918a", -0.25, AttributeModifier.Operation.MULTIPLY_BASE);
	}

	@Override
	public List<ItemStack> getCurativeItems() {
		ArrayList<ItemStack> cures = new ArrayList<ItemStack>();
		cures.add(new ItemStack(Items.TOTEM_OF_UNDYING));
		return cures;
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		ShinyRushKazhdyiTikVoVriemiaEffiektaProcedure.execute(entity.level(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
