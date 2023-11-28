
package exp.fluffynuar.truedarkness.item;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;

import exp.fluffynuar.truedarkness.procedures.SwampSlimyPriNazhatiiPravoiKnopkoiMyshiProcedure;

public class SwampSlimyItem extends Item {
	public SwampSlimyItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.UNCOMMON));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		SwampSlimyPriNazhatiiPravoiKnopkoiMyshiProcedure.execute(context.getPlayer());
		return InteractionResult.SUCCESS;
	}
}
