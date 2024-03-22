
package exp.fluffynuar.truedarkness.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionResult;
import net.minecraft.network.chat.Component;

import java.util.List;

import exp.fluffynuar.truedarkness.procedures.GiftDemasfenTextProcedure;
import exp.fluffynuar.truedarkness.procedures.FrozenStealKeyPriShchielchkiePKMPoBlokuProcedure;

public class FrozenStealKeyItem extends Item {
	public FrozenStealKeyItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.EPIC));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		Entity entity = itemstack.getEntityRepresentation();
		double x = entity != null ? entity.getX() : 0.0;
		double y = entity != null ? entity.getY() : 0.0;
		double z = entity != null ? entity.getZ() : 0.0;
		list.add(Component.literal(GiftDemasfenTextProcedure.execute()));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		FrozenStealKeyPriShchielchkiePKMPoBlokuProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getPlayer());
		return InteractionResult.SUCCESS;
	}
}
