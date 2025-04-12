
package exp.fluffynuar.truedarkness.item;

import top.theillusivec4.curios.api.type.capability.ICurioItem;
import top.theillusivec4.curios.api.SlotContext;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import exp.fluffynuar.truedarkness.procedures.DDDSneakyFangsBaubleIsUnequippedProcedure;
import exp.fluffynuar.truedarkness.procedures.DDDSneakyFangsBaubleIsEquippedProcedure;

public class CreepyFangsItem extends Item implements ICurioItem {
	public CreepyFangsItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public void onEquip(SlotContext slotContext, ItemStack prevStack, ItemStack stack) {
		DDDSneakyFangsBaubleIsEquippedProcedure.execute(slotContext.entity(), stack);
	}

	@Override
	public void onUnequip(SlotContext slotContext, ItemStack newStack, ItemStack stack) {
		DDDSneakyFangsBaubleIsUnequippedProcedure.execute(slotContext.entity());
	}
}
