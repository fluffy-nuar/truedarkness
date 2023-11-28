
package exp.fluffynuar.truedarkness.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;

import exp.fluffynuar.truedarkness.procedures.DarkCrystalSwordKoghdaZhivaiaSushchnostPopadaietSPomoshchiuInstrumientaProcedure;

public class DarkCrystalPickaxeItem extends PickaxeItem {
	public DarkCrystalPickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 2031;
			}

			public float getSpeed() {
				return 11f;
			}

			public float getAttackDamageBonus() {
				return 2f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 0;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of();
			}
		}, 1, -2.8f, new Item.Properties());
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		DarkCrystalSwordKoghdaZhivaiaSushchnostPopadaietSPomoshchiuInstrumientaProcedure.execute(entity);
		return retval;
	}
}
