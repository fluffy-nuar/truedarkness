
package exp.fluffynuar.truedarkness.item;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;

import exp.fluffynuar.truedarkness.procedures.FirefliesbottlePriShchielchkiePravoiKnopkoiMyshiNaBlokieProcedure;

public class FirefliesbottleItem extends Item {
	public FirefliesbottleItem() {
		super(new Item.Properties().durability(100).rarity(Rarity.COMMON));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		FirefliesbottlePriShchielchkiePravoiKnopkoiMyshiNaBlokieProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getPlayer());
		return InteractionResult.SUCCESS;
	}
}
