
package exp.fluffynuar.truedarkness.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class CutedAppleItem extends Item {
	public CutedAppleItem() {
		super(new Item.Properties().stacksTo(16).rarity(Rarity.COMMON));
	}
}
