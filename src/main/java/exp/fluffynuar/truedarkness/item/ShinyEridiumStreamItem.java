
package exp.fluffynuar.truedarkness.item;

import top.theillusivec4.curios.api.type.capability.ICurioItem;
import top.theillusivec4.curios.api.SlotContext;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import exp.fluffynuar.truedarkness.procedures.ShinyEridiumDashBaubleIsEquippedProcedure;

public class ShinyEridiumStreamItem extends Item implements ICurioItem {
	public ShinyEridiumStreamItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.UNCOMMON));
	}

	@Override
	public void onEquip(SlotContext slotContext, ItemStack prevStack, ItemStack stack) {
		ShinyEridiumDashBaubleIsEquippedProcedure.execute(slotContext.entity(), stack);
	}
}
