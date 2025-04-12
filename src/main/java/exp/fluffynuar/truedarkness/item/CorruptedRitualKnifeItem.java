
package exp.fluffynuar.truedarkness.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import exp.fluffynuar.truedarkness.procedures.FangPickaxeKazhdyiTikVRukieProcedure;
import exp.fluffynuar.truedarkness.procedures.CursedSwordPriUdariePoSushchnostiInstrumientomProcedure;
import exp.fluffynuar.truedarkness.procedures.CorruptedRitualKnifePriShchielchkiePKMProcedure;
import exp.fluffynuar.truedarkness.init.TruedarknessModItems;

public class CorruptedRitualKnifeItem extends SwordItem {
	public CorruptedRitualKnifeItem() {
		super(new Tier() {
			public int getUses() {
				return 1561;
			}

			public float getSpeed() {
				return 6f;
			}

			public float getAttackDamageBonus() {
				return 1f;
			}

			public int getLevel() {
				return 3;
			}

			public int getEnchantmentValue() {
				return 1;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(TruedarknessModItems.CORRUPTED_HAND_FANGS.get()));
			}
		}, 3, -2f, new Item.Properties());
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		CursedSwordPriUdariePoSushchnostiInstrumientomProcedure.execute(entity, sourceentity);
		return retval;
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		CorruptedRitualKnifePriShchielchkiePKMProcedure.execute(entity, ar.getObject());
		return ar;
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		if (selected)
			FangPickaxeKazhdyiTikVRukieProcedure.execute(entity, itemstack);
	}
}
