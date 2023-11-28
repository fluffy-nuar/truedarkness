
package exp.fluffynuar.truedarkness.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.entity.Entity;

import exp.fluffynuar.truedarkness.procedures.GramiteDaggerKoghdaInstrumientVInvientarieProcedure;
import exp.fluffynuar.truedarkness.init.TruedarknessModItems;

public class GramiteBattleAxeItem extends AxeItem {
	public GramiteBattleAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 567;
			}

			public float getSpeed() {
				return 8f;
			}

			public float getAttackDamageBonus() {
				return 4f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 14;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(TruedarknessModItems.GRAMITE_SHARD.get()));
			}
		}, 1, -2f, new Item.Properties());
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		GramiteDaggerKoghdaInstrumientVInvientarieProcedure.execute(entity);
	}
}
