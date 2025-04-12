package exp.fluffynuar.truedarkness.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.Items;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;

import exp.fluffynuar.truedarkness.entity.GloomerWarriorEntity;
import exp.fluffynuar.truedarkness.entity.GloomerElderEntity;
import exp.fluffynuar.truedarkness.entity.GloomerCraftsmanEntity;
import exp.fluffynuar.truedarkness.entity.GloomerChillerEntity;

public class GloomerCraftsmanPriNachalnomPrizyvieSushchnostiProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof GloomerWarriorEntity) {
			entity.getPersistentData().putDouble("gloomer_price", (Mth.nextInt(RandomSource.create(), 11, 22)));
			entity.getPersistentData().putString("gloomer_trade",
					(ForgeRegistries.ITEMS.getKey((ForgeRegistries.ITEMS.tags().getTag(ItemTags.create(new ResourceLocation("truedarkness:warrior_trades"))).getRandomElement(RandomSource.create()).orElseGet(() -> Items.AIR))).toString()));
		}
		if (entity instanceof GloomerCraftsmanEntity) {
			entity.getPersistentData().putDouble("gloomer_price", (Mth.nextInt(RandomSource.create(), 17, 26)));
			entity.getPersistentData().putString("gloomer_trade",
					(ForgeRegistries.ITEMS.getKey((ForgeRegistries.ITEMS.tags().getTag(ItemTags.create(new ResourceLocation("truedarkness:craftsman_trades"))).getRandomElement(RandomSource.create()).orElseGet(() -> Items.AIR))).toString()));
		}
		if (entity instanceof GloomerElderEntity) {
			entity.getPersistentData().putDouble("gloomer_price", (Mth.nextInt(RandomSource.create(), 16, 29)));
			entity.getPersistentData().putString("gloomer_trade",
					(ForgeRegistries.ITEMS.getKey((ForgeRegistries.ITEMS.tags().getTag(ItemTags.create(new ResourceLocation("truedarkness:elder_trades"))).getRandomElement(RandomSource.create()).orElseGet(() -> Items.AIR))).toString()));
		}
		if (entity instanceof GloomerChillerEntity) {
			entity.getPersistentData().putDouble("gloomer_price", (Mth.nextInt(RandomSource.create(), 9, 15)));
			entity.getPersistentData().putString("gloomer_trade",
					(ForgeRegistries.ITEMS.getKey((ForgeRegistries.ITEMS.tags().getTag(ItemTags.create(new ResourceLocation("truedarkness:chiller_trades"))).getRandomElement(RandomSource.create()).orElseGet(() -> Items.AIR))).toString()));
		}
	}
}
