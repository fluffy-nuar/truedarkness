
package exp.fluffynuar.truedarkness.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionResult;

import exp.fluffynuar.truedarkness.procedures.SoulstealHeartPriShchielchkiePKMPoBlokuProcedure;
import exp.fluffynuar.truedarkness.procedures.SoulstealHeartKazhdyiTikVRukieProcedure;

public class SoulstealHeartItem extends Item {
	public SoulstealHeartItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		SoulstealHeartPriShchielchkiePKMPoBlokuProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getPlayer());
		return InteractionResult.SUCCESS;
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		if (selected)
			SoulstealHeartKazhdyiTikVRukieProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity);
	}
}
