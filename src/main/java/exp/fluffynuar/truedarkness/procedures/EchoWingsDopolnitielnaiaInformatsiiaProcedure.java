package exp.fluffynuar.truedarkness.procedures;

import net.minecraftforge.registries.ForgeRegistries;
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
public class EchoWingsDopolnitielnaiaInformatsiiaProcedure {
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
		if (itemstack.getItem() == TruedarknessModItems.ECHO_WINGS.get()) {
			if (Screen.hasShiftDown()) {
				if ((itemstack.getOrCreateTag().getString("desc")).equals(ForgeRegistries.ITEMS.getKey(itemstack.getItem()).toString())) {
					tooltip.add(1, Component.literal((Component.translatable(("item." + (ForgeRegistries.ITEMS.getKey(itemstack.getItem()).toString()).replace(":", ".") + ".desc")).getString())));
				} else {
					tooltip.add(1, Component.literal((Component.translatable("item.truedarkness.metenite_crystal.desc").getString())));
				}
			} else {
				if (itemstack.getOrCreateTag().getDouble("upCount") == 0) {
					tooltip.add(1, Component.literal((Component.translatable("item.truedarkness.echo_wings.up").getString() + "\u00A7a"
							+ Component.translatable((Component.translatable("item.truedarkness.spell_").getString() + "" + itemstack.getOrCreateTag().getString("upTag") + ".desc")).getString())));
				} else {
					tooltip.add(1, Component.literal((Component.translatable("item.truedarkness.echo_wings.up").getString() + "" + (itemstack.getOrCreateTag().getDouble("upCount") == 2 ? "\u00A7c" : "\u00A7b")
							+ Component.translatable((Component.translatable("item.truedarkness.spell_").getString() + "" + itemstack.getOrCreateTag().getString("upTag") + ".desc")).getString())));
				}
				if (itemstack.getOrCreateTag().getDouble("sideCount") == 0) {
					tooltip.add(2, Component.literal((Component.translatable("item.truedarkness.echo_wings.side").getString() + "\u00A7a"
							+ Component.translatable((Component.translatable("item.truedarkness.spell_").getString() + "" + itemstack.getOrCreateTag().getString("sideTag") + ".desc")).getString())));
				} else {
					tooltip.add(2, Component.literal((Component.translatable("item.truedarkness.echo_wings.side").getString() + "" + (itemstack.getOrCreateTag().getDouble("sideCount") == 2 ? "\u00A7c" : "\u00A7b")
							+ Component.translatable((Component.translatable("item.truedarkness.spell_").getString() + "" + itemstack.getOrCreateTag().getString("sideTag") + ".desc")).getString())));
				}
				if (itemstack.getOrCreateTag().getDouble("downCount") == 0) {
					tooltip.add(3, Component.literal((Component.translatable("item.truedarkness.echo_wings.down").getString() + "\u00A7a"
							+ Component.translatable((Component.translatable("item.truedarkness.spell_").getString() + "" + itemstack.getOrCreateTag().getString("downTag") + ".desc")).getString())));
				} else {
					tooltip.add(3, Component.literal((Component.translatable("item.truedarkness.echo_wings.down").getString() + "" + (itemstack.getOrCreateTag().getDouble("downCount") == 2 ? "\u00A7c" : "\u00A7b")
							+ Component.translatable((Component.translatable("item.truedarkness.spell_").getString() + "" + itemstack.getOrCreateTag().getString("downTag") + ".desc")).getString())));
				}
				tooltip.add(4, Component.literal((Component.translatable("item.truedarkness.echo_wings.type").getString() + ""
						+ Component.translatable((Component.translatable("item.truedarkness.echo_reel_").getString() + "" + Math.round(itemstack.getOrCreateTag().getDouble("trimsTag")) + ".desc")).getString())));
			}
		}
		if (itemstack.getItem() == TruedarknessModItems.GENERAL_HEART.get()) {
			if ((itemstack.getOrCreateTag().getString("desc")).equals(ForgeRegistries.ITEMS.getKey(itemstack.getItem()).toString())) {
				tooltip.add(1, Component.literal((Component.translatable(("item." + (ForgeRegistries.ITEMS.getKey(itemstack.getItem()).toString()).replace(":", ".") + ".desc")).getString())));
			} else {
				tooltip.add(1, Component.literal((Component.translatable("item.truedarkness.metenite_crystal.desc").getString())));
			}
		}
		if (itemstack.is(ItemTags.create(new ResourceLocation("truedarkness:spell")))) {
			if (!Screen.hasShiftDown()) {
				if (itemstack.getOrCreateTag().getDouble("Legend") == 2) {
					tooltip.add(1, Component.literal(("\u00A77[" + Component.translatable("item.truedarkness.spell.legend").getString() + "\u00A77]")));
				} else if (itemstack.getOrCreateTag().getDouble("Legend") == 1) {
					tooltip.add(1, Component.literal(("\u00A77[" + Component.translatable("item.truedarkness.spell.rare").getString() + "\u00A77]")));
				} else {
					tooltip.add(1, Component.literal(("\u00A77[" + Component.translatable("item.truedarkness.spell.common").getString() + "\u00A77]")));
				}
			}
		}
	}
}
