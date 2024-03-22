
package exp.fluffynuar.truedarkness.item;

import top.theillusivec4.curios.api.type.capability.ICurioItem;
import top.theillusivec4.curios.api.SlotContext;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;
import net.minecraft.network.chat.Component;

import java.util.List;

import exp.fluffynuar.truedarkness.procedures.EchoWingsPriShchielchkiePKMProcedure;
import exp.fluffynuar.truedarkness.procedures.EchoWingsBaubleIsEquippedProcedure;

public class EchoWingsItem extends Item implements ICurioItem {
	public EchoWingsItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		EchoWingsPriShchielchkiePKMProcedure.execute(world, x, y, z, entity, itemstack);
		return ar;
	}

	@Override
	public void onEquip(SlotContext slotContext, ItemStack prevStack, ItemStack stack) {
		EchoWingsBaubleIsEquippedProcedure.execute(slotContext.entity(), stack);
	}
}
