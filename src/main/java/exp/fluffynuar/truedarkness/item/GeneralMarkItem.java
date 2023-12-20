
package exp.fluffynuar.truedarkness.item;

import top.theillusivec4.curios.api.type.capability.ICurioItem;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class GeneralMarkItem extends Item implements ICurioItem {
	public GeneralMarkItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.RARE));
	}
}
