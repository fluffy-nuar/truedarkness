
package exp.fluffynuar.truedarkness.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class LetterItem extends Item {
	public LetterItem() {
		super(new Item.Properties().stacksTo(16).rarity(Rarity.RARE));
	}
}
