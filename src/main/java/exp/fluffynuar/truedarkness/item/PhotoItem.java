
package exp.fluffynuar.truedarkness.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class PhotoItem extends Item {
	public PhotoItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.RARE));
	}
}
