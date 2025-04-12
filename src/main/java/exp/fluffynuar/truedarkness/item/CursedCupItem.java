
package exp.fluffynuar.truedarkness.item;

import top.theillusivec4.curios.api.type.capability.ICurioItem;
import top.theillusivec4.curios.api.SlotContext;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import exp.fluffynuar.truedarkness.procedures.CursedCupWhileBaubleIsEquippedTickProcedure;

public class CursedCupItem extends Item implements ICurioItem {
	public CursedCupItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public void curioTick(SlotContext slotContext, ItemStack stack) {
		CursedCupWhileBaubleIsEquippedTickProcedure.execute(slotContext.entity().level(), slotContext.entity());
	}
}
