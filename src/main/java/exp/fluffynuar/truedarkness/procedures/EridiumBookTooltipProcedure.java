package exp.fluffynuar.truedarkness.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.network.chat.Component;

import javax.annotation.Nullable;

import java.util.List;

import exp.fluffynuar.truedarkness.init.TruedarknessModItems;

@Mod.EventBusSubscriber
public class EridiumBookTooltipProcedure {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void onItemTooltip(ItemTooltipEvent event) {
		execute(event, event.getItemStack(), event.getToolTip());
	}

	public static void execute(ItemStack itemstack, List<Component> tooltip) {
		execute(null, itemstack, tooltip);
	}

	private static void execute(@Nullable Event event, ItemStack itemstack, List<Component> tooltip) {
		if (tooltip == null)
			return;
		double add = 0;
		if (itemstack.getItem() == TruedarknessModItems.ERIDIUM_BOOK.get()) {
			tooltip.add(1, Component.literal(("\u00A77" + (itemstack.getOrCreateTag().getDouble("SelectedLine") == 1 ? "\u00A7e> " : "") + "["
					+ Component.translatable(("item.truedarkness.shiny_eridium_" + itemstack.getOrCreateTag().getString("Line1") + ".desc")).getString() + "] " + Math.round(itemstack.getOrCreateTag().getDouble("Line1Tier")))));
			tooltip.add(2, Component.literal(("\u00A77" + (itemstack.getOrCreateTag().getDouble("SelectedLine") == 2 ? "\u00A7e> " : "") + "["
					+ Component.translatable(("item.truedarkness.shiny_eridium_" + itemstack.getOrCreateTag().getString("Line2") + ".desc")).getString() + "] " + Math.round(itemstack.getOrCreateTag().getDouble("Line2Tier")))));
			add = 2;
			for (int index0 = 0; index0 < (int) itemstack.getOrCreateTag().getDouble("ActiveStage"); index0++) {
				if (itemstack.getOrCreateTag().getDouble("ActiveStage") + 2 >= add + 1) {
					tooltip.add((int) (add + 1), Component.literal(("\u00A77" + (itemstack.getOrCreateTag().getDouble("SelectedLine") == add + 1 ? "\u00A7e> " : "") + "["
							+ Component.translatable(("item.truedarkness.shiny_eridium_" + itemstack.getOrCreateTag().getString(("Line" + Math.round(add + 1))) + ".desc")).getString() + "] "
							+ (!(itemstack.getOrCreateTag().getString(("Line" + Math.round(add + 1)))).equals("")
									? (itemstack.getOrCreateTag().getDouble(("Line" + Math.round(add + 1) + "Tier")) == 0 ? "I" : "") + "" + (itemstack.getOrCreateTag().getDouble(("Line" + Math.round(add + 1) + "Tier")) == 1 ? "II" : "")
											+ (itemstack.getOrCreateTag().getDouble(("Line" + Math.round(add + 1) + "Tier")) == 2 ? "III" : "") + (itemstack.getOrCreateTag().getDouble(("Line" + Math.round(add + 1) + "Tier")) == 3 ? "IV" : "")
											+ (itemstack.getOrCreateTag().getDouble(("Line" + Math.round(add + 1) + "Tier")) == 4 ? "V" : "") + (itemstack.getOrCreateTag().getDouble(("Line" + Math.round(add + 1) + "Tier")) == 5 ? "VI" : "")
											+ (itemstack.getOrCreateTag().getDouble(("Line" + Math.round(add + 1) + "Tier")) == 6 ? "VII" : "") + (itemstack.getOrCreateTag().getDouble(("Line" + Math.round(add + 1) + "Tier")) == 7 ? "VIII" : "")
											+ (itemstack.getOrCreateTag().getDouble(("Line" + Math.round(add + 1) + "Tier")) == 8 ? "IX" : "")
									: ""))));
					add = add + 1;
				}
			}
		}
	}
}
