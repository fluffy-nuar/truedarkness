
package exp.fluffynuar.truedarkness.item;

import top.theillusivec4.curios.api.type.capability.ICurioItem;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class EchoPapryrusItem extends Item implements ICurioItem {
	public EchoPapryrusItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON));
	}
}
