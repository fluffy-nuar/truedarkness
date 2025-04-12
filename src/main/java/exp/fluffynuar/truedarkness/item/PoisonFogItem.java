
package exp.fluffynuar.truedarkness.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class PoisonFogItem extends Item {
	public PoisonFogItem() {
		super(new Item.Properties().stacksTo(16).rarity(Rarity.UNCOMMON));
	}
}
