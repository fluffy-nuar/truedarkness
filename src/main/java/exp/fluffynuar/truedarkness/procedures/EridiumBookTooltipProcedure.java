package exp.fluffynuar.truedarkness.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.Screen;

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
		if (itemstack.is(ItemTags.create(new ResourceLocation("truedarkness:shiny_eridium")))) {
			tooltip.add(1, Component.literal(""));
			tooltip.add(2,
					Component.literal(("\u00A77" + Component.translatable(("item.truedarkness.shiny_eridium_" + ShinyEridiumGetTypeProcedure.execute(itemstack) + ".desc")).getString() + " "
							+ ((itemstack.getOrCreateTag().getDouble("ActiveStage") == 0 ? "I" : "") + "" + (itemstack.getOrCreateTag().getDouble("ActiveStage") == 1 ? "II" : "")
									+ (itemstack.getOrCreateTag().getDouble("ActiveStage") == 2 ? "III" : "") + (itemstack.getOrCreateTag().getDouble("ActiveStage") == 3 ? "IV" : "")
									+ (itemstack.getOrCreateTag().getDouble("ActiveStage") == 4 ? "V" : "")))));
		}
		if (itemstack.getItem() == TruedarknessModItems.ERIDIUM_BOOK.get()) {
			add = 0;
			if (Screen.hasControlDown()) {
				tooltip.add(1, Component.literal(("\u00A77" + Component.translatable("item.truedarkness.eridium_book_layer.1").getString())));
				for (int index0 = 0; index0 < (int) (itemstack.getOrCreateTag().getDouble("ActiveStage") + 2); index0++) {
					tooltip.add((int) (add + 2),
							Component.literal(((itemstack.getOrCreateTag().getDouble("SelectedLine") == add ? "\u00A7d" : "\u00A75") + "["
									+ Component.translatable(("item.truedarkness.shiny_eridium_" + itemstack.getOrCreateTag().getString(("Line" + Math.round(add))) + ".desc")).getString() + "] \u00A77"
									+ (!(itemstack.getOrCreateTag().getString(("Line" + Math.round(add)))).equals("")
											? (itemstack.getOrCreateTag().getDouble(("Line" + Math.round(add) + "Tier")) == 0 ? "I" : "") + "" + (itemstack.getOrCreateTag().getDouble(("Line" + Math.round(add) + "Tier")) == 1 ? "II" : "")
													+ (itemstack.getOrCreateTag().getDouble(("Line" + Math.round(add) + "Tier")) == 2 ? "III" : "") + (itemstack.getOrCreateTag().getDouble(("Line" + Math.round(add) + "Tier")) == 3 ? "IV" : "")
													+ (itemstack.getOrCreateTag().getDouble(("Line" + Math.round(add) + "Tier")) == 4 ? "V" : "")
											: ""))));
					add = add + 1;
				}
			} else {
				tooltip.add(1,
						Component.literal(("\u00A77" + Component.translatable("item.truedarkness.eridium_book_layer.1").getString() + "\u00A75["
								+ Component.translatable(("item.truedarkness.shiny_eridium_" + itemstack.getOrCreateTag().getString(("Line" + Math.round(itemstack.getOrCreateTag().getDouble("SelectedLine")))) + ".desc")).getString() + "] "
								+ (!(itemstack.getOrCreateTag().getString(("Line" + Math.round(add + 1)))).equals("")
										? (itemstack.getOrCreateTag().getDouble(("Line" + Math.round(itemstack.getOrCreateTag().getDouble("SelectedLine")) + "Tier")) == 0 ? "\u00A77I" : "") + ""
												+ (itemstack.getOrCreateTag().getDouble(("Line" + Math.round(itemstack.getOrCreateTag().getDouble("SelectedLine")) + "Tier")) == 1 ? "\u00A77II" : "")
												+ (itemstack.getOrCreateTag().getDouble(("Line" + Math.round(itemstack.getOrCreateTag().getDouble("SelectedLine")) + "Tier")) == 2 ? "\u00A77III" : "")
												+ (itemstack.getOrCreateTag().getDouble(("Line" + Math.round(itemstack.getOrCreateTag().getDouble("SelectedLine")) + "Tier")) == 3 ? "\u00A77IV" : "")
												+ (itemstack.getOrCreateTag().getDouble(("Line" + Math.round(itemstack.getOrCreateTag().getDouble("SelectedLine")) + "Tier")) == 4 ? "\u00A77V" : "")
										: ""))));
				tooltip.add(2, Component.literal(("\u00A77" + Component.translatable("item.truedarkness.eridium_book_layer.2").getString() + "\u00A75["
						+ Component.translatable(("item.truedarkness.eridium_book.secondary." + itemstack.getOrCreateTag().getString("SecondAbility"))).getString() + "]")));
				tooltip.add(3, Component.literal(("\u00A77" + Component.translatable("item.truedarkness.eridium_book_layer.3").getString() + "\u00A75["
						+ Component.translatable(("item.truedarkness.eridium_book.passive." + itemstack.getOrCreateTag().getString("PassiveSkill"))).getString() + "]")));
				tooltip.add(4,
						Component.literal(("\u00A77" + Component.translatable("item.truedarkness.eridium_book_layer.4").getString() + "\u00A75["
								+ Component.translatable(("item.truedarkness.eridium_book.addon." + itemstack.getOrCreateTag().getString("BookAddon"))).getString() + "] "
								+ (((itemstack.getOrCreateTag().getString("BookAddon")).equals("armor") && itemstack.getOrCreateTag().getDouble("BookAddonLevel") == 0 ? "\u00A77I" : "") + ""
										+ ((itemstack.getOrCreateTag().getString("BookAddon")).equals("armor") && itemstack.getOrCreateTag().getDouble("BookAddonLevel") == 1 ? "\u00A77II" : "")
										+ ((itemstack.getOrCreateTag().getString("BookAddon")).equals("armor") && itemstack.getOrCreateTag().getDouble("BookAddonLevel") == 2 ? "\u00A77III" : "")
										+ ((itemstack.getOrCreateTag().getString("BookAddon")).equals("armor") && itemstack.getOrCreateTag().getDouble("BookAddonLevel") == 3 ? "\u00A77IV" : "")))));
			}
		}
	}
}
