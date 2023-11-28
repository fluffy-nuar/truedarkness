
package exp.fluffynuar.truedarkness.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class MusicDiscTurquoiseFlowerItem extends RecordItem {
	public MusicDiscTurquoiseFlowerItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("truedarkness:music.turquoise_flower")), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 1620);
	}
}
