
package exp.fluffynuar.truedarkness.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class MusicDiscLapisItem extends RecordItem {
	public MusicDiscLapisItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("truedarkness:record.lapis")), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 1620);
	}
}
