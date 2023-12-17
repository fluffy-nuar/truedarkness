
package exp.fluffynuar.truedarkness.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;

import exp.fluffynuar.truedarkness.procedures.MedicinalHerbsIghrokZakanchivaietIspolzovaniiePriedmietaProcedure;

public class MedicinalHerbsItem extends Item {
	public MedicinalHerbsItem() {
		super(new Item.Properties().stacksTo(6).rarity(Rarity.COMMON));
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
