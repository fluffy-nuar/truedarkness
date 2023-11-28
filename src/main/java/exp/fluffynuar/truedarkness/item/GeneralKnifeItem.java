
package exp.fluffynuar.truedarkness.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;

import exp.fluffynuar.truedarkness.procedures.GeneralKnifePriUdariePoSushchnostiInstrumientomProcedure;
import exp.fluffynuar.truedarkness.init.TruedarknessModItems;

public class GeneralKnifeItem extends SwordItem {
	public GeneralKnifeItem() {
		super(new Tier() {
			public int getUses() {
				return 1061;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return -1f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(TruedarknessModItems.GENERAL_SCALE.get()));
			}
		}, 3, -1f, new Item.Properties());
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		GeneralKnifePriUdariePoSushchnostiInstrumientomProcedure.execute(entity);
		return retval;
	}
}
