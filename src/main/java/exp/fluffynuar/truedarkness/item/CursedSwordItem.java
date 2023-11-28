
package exp.fluffynuar.truedarkness.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import exp.fluffynuar.truedarkness.init.TruedarknessModItems;

public class CursedSwordItem extends SwordItem {
	public CursedSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 1031;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 4f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(TruedarknessModItems.CORRUPTED_HAND_FANGS.get()));
			}
		}, 3, -2.5f, new Item.Properties());
	}
}
