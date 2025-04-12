
package exp.fluffynuar.truedarkness.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class LootTableItem extends Item {
	public LootTableItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.EPIC));
	}
}
