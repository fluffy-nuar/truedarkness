
package exp.fluffynuar.truedarkness.item;

import top.theillusivec4.curios.api.type.capability.ICurioItem;
import top.theillusivec4.curios.api.SlotContext;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import exp.fluffynuar.truedarkness.procedures.SoulMarkBaubleIsEquippedProcedure;

public class SoulMarkItem extends Item implements ICurioItem {
	public SoulMarkItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.RARE));
	}

	@Override
	public void curioTick(SlotContext slotContext, ItemStack stack) {
		SoulMarkBaubleIsEquippedProcedure.execute(slotContext.entity());
	}
}
