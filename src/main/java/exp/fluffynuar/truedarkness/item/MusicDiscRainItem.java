
package exp.fluffynuar.truedarkness.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class MusicDiscRainItem extends RecordItem {
	public MusicDiscRainItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("truedarkness:music.rain")), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 1620);
	}
}
