
package exp.fluffynuar.truedarkness.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;

import exp.fluffynuar.truedarkness.procedures.SoulstealHammerKazhdyiTikVRukieProcedure;
import exp.fluffynuar.truedarkness.init.TruedarknessModItems;

public class SoulstealHammerItem extends PickaxeItem {
	public SoulstealHammerItem() {
		super(new Tier() {
			public int getUses() {
				return 2031;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 12f;
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
		}, 1, -3.7f, new Item.Properties());
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		if (selected)
			SoulstealHammerKazhdyiTikVRukieProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity);
	}
}
