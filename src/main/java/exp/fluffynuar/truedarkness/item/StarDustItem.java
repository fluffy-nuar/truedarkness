
package exp.fluffynuar.truedarkness.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class StarDustItem extends Item {
	public StarDustItem() {
		super(new Item.Properties().stacksTo(16).rarity(Rarity.COMMON));
	}
}
