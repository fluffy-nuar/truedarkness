
package exp.fluffynuar.truedarkness.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class GrimniteItem extends Item {
	public GrimniteItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.RARE));
	}
}
