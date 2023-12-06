
package exp.fluffynuar.truedarkness.item;

import top.theillusivec4.curios.api.type.capability.ICurioItem;
import top.theillusivec4.curios.api.SlotContext;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import exp.fluffynuar.truedarkness.procedures.GeneralHeartKazhdyiTikVInvientarieProcedure;

public class GeneralHeartItem extends Item implements ICurioItem {
	public GeneralHeartItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public void curioTick(SlotContext slotContext, ItemStack stack) {
		GeneralHeartKazhdyiTikVInvientarieProcedure.execute(slotContext.entity());
	}
}
