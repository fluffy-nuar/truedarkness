
package exp.fluffynuar.truedarkness.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import java.util.List;

import exp.fluffynuar.truedarkness.procedures.MedicinalHerbsIghrokZakanchivaietIspolzovaniiePriedmietaProcedure;
import exp.fluffynuar.truedarkness.procedures.Herbs3TextProcedure;

public class MedicinalHerbsItem extends Item {
	public MedicinalHerbsItem() {
		super(new Item.Properties().stacksTo(6).rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		Entity entity = itemstack.getEntityRepresentation();
		double x = entity != null ? entity.getX() : 0.0;
		double y = entity != null ? entity.getY() : 0.0;
		double z = entity != null ? entity.getZ() : 0.0;
		list.add(Component.literal(Herbs3TextProcedure.execute()));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		MedicinalHerbsIghrokZakanchivaietIspolzovaniiePriedmietaProcedure.execute(entity);
		return retval;
	}
}
