
package exp.fluffynuar.truedarkness.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;

import exp.fluffynuar.truedarkness.procedures.CocoaKoghdaPriedmietVInvientarieProcedure;

public class CocoaItem extends Item {
	public CocoaItem() {
		super(new Item.Properties().stacksTo(6).rarity(Rarity.COMMON));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		CocoaKoghdaPriedmietVInvientarieProcedure.execute(entity);
	}
}
