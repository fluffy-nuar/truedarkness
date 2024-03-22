
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package exp.fluffynuar.truedarkness.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.WandererTradesEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.npc.VillagerProfession;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class TruedarknessModTrades {
	@SubscribeEvent
	public static void registerWanderingTrades(WandererTradesEvent event) {
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD, 11),

				new ItemStack(TruedarknessModItems.SWEET_HERBS.get()), 3, 5, 0.06f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD, 11),

				new ItemStack(TruedarknessModItems.MEDICINAL_HERBS.get()), 3, 5, 0.06f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD, 11),

				new ItemStack(TruedarknessModItems.SOOTHING_HERBS.get()), 3, 5, 0.06f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD, 11),

				new ItemStack(TruedarknessModItems.FRUITS_AND_BERRIES.get()), 3, 5, 0.06f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD, 15),

				new ItemStack(TruedarknessModItems.POTHOLDERS.get()), 1, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD, 20),

				new ItemStack(TruedarknessModItems.AQUAMARINE_COIN.get()), 3, 5, 0.05f));
	}

	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == VillagerProfession.LIBRARIAN) {
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD, 3), new ItemStack(Items.PAPER, 3), new ItemStack(TruedarknessModItems.DRINK_RECIPE.get()), 10, 5, 0.06f));
		}
		if (event.getType() == VillagerProfession.LIBRARIAN) {
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD, 5), new ItemStack(Items.PAPER, 3), new ItemStack(TruedarknessModItems.ELDER_DOCUMENT.get()), 10, 5, 0.06f));
		}
		if (event.getType() == VillagerProfession.LIBRARIAN) {
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(TruedarknessModItems.LETTER.get()),

					new ItemStack(Items.EMERALD, 7), 4, 5, 0.05f));
		}
		if (event.getType() == VillagerProfession.MASON) {
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD, 2),

					new ItemStack(TruedarknessModBlocks.DARKNITE.get(), 12), 30, 5, 0.05f));
		}
		if (event.getType() == VillagerProfession.ARMORER) {
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD, 3),

					new ItemStack(TruedarknessModItems.GRAMITE_SHARD.get()), 14, 5, 0.05f));
		}
	}
}
