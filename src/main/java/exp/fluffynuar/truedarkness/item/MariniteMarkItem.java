
package exp.fluffynuar.truedarkness.item;

import top.theillusivec4.curios.api.type.capability.ICurioItem;
import top.theillusivec4.curios.api.SlotContext;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import exp.fluffynuar.truedarkness.procedures.MariniteMarkWhileBaubleIsEquippedTickProcedure;

public class MariniteMarkItem extends Item implements ICurioItem {
	public MariniteMarkItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public void curioTick(SlotContext slotContext, ItemStack stack) {
		MariniteMarkWhileBaubleIsEquippedTickProcedure.execute(slotContext.entity());
	}
}
