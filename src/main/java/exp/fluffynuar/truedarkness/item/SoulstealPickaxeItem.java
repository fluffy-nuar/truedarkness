
package exp.fluffynuar.truedarkness.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import exp.fluffynuar.truedarkness.init.TruedarknessModItems;

public class SoulstealPickaxeItem extends PickaxeItem {
	public SoulstealPickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 2031;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 2f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(TruedarknessModItems.SOULSTEAL_INGOT.get()));
			}
		}, 1, -2.8f, new Item.Properties());
	}
}
