
package exp.fluffynuar.truedarkness.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import exp.fluffynuar.truedarkness.procedures.PhasmaSwordKoghdaInstrumientVInvientarieProcedure;
import exp.fluffynuar.truedarkness.procedures.CryPickaxeKoghdaBlokSlomanInstrumientomProcedure;
import exp.fluffynuar.truedarkness.init.TruedarknessModItems;

public class CryPickaxeItem extends PickaxeItem {
	public CryPickaxeItem() {
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
				return 3;
			}

			public int getEnchantmentValue() {
				return 0;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(TruedarknessModItems.CRY_INGOT.get()));
			}
		}, 1, -2.5f, new Item.Properties());
	}

	@Override
	public boolean mineBlock(ItemStack itemstack, Level world, BlockState blockstate, BlockPos pos, LivingEntity entity) {
		boolean retval = super.mineBlock(itemstack, world, blockstate, pos, entity);
		CryPickaxeKoghdaBlokSlomanInstrumientomProcedure.execute(entity);
		return retval;
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		PhasmaSwordKoghdaInstrumientVInvientarieProcedure.execute(entity);
	}
}
