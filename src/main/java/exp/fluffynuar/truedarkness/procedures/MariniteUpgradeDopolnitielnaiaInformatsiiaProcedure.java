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
public class MariniteUpgradeDopolnitielnaiaInformatsiiaProcedure {
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
		if (itemstack.getItem() == TruedarknessModItems.MARINITE_UPGRADE_SMITHING_TEMPLATE.get()) {
			tooltip.add(1, Component.literal(("\u00A77" + Component.translatable(("item." + (ForgeRegistries.ITEMS.getKey(itemstack.getItem()).toString()).replace(":", ".") + ".desc")).getString())));
			tooltip.add(2, Component.literal(" "));
			tooltip.add(3, Component.literal(("\u00A77" + Component.translatable("item.truedarkness.smithing_template_desc").getString())));
			tooltip.add(4, Component.literal(("\u00A79 " + Component.translatable("item.truedarkness.marinite_upgrade_smithing_template.desc.to").getString())));
			tooltip.add(5, Component.literal(("\u00A77" + Component.translatable("item.truedarkness.smithing_template_desc.1").getString())));
			tooltip.add(6, Component.literal(("\u00A79 " + Component.translatable("item.truedarkness.marinite_ingot").getString())));
		} else if (itemstack.getItem() == TruedarknessModItems.ERIDIUM_SHARD.get() && itemstack.getOrCreateTag().getBoolean("can_break")) {
			tooltip.add(1, Component
					.literal(("\u00A77" + Component.translatable("item.truedarkness.cursed_tale_blood.desc").getString() + "" + itemstack.getOrCreateTag().getString("Name") + ": \u00A7d" + Math.round(itemstack.getOrCreateTag().getDouble("Prey")))));
		}
		if (itemstack.getItem() == TruedarknessModItems.ENDER_SKYFALL_UPGRADE_SMITHING_TEMPLATE.get()) {
			tooltip.add(1, Component.literal(("\u00A77" + Component.translatable(("item." + (ForgeRegistries.ITEMS.getKey(itemstack.getItem()).toString()).replace(":", ".") + ".desc")).getString())));
			tooltip.add(2, Component.literal(" "));
			tooltip.add(3, Component.literal(("\u00A77" + Component.translatable("item.truedarkness.smithing_template_desc").getString())));
			tooltip.add(4, Component.literal(("\u00A79 " + Component.translatable("item.truedarkness.ender_skyfall_upgrade_smithing_template.desc.to").getString())));
			tooltip.add(5, Component.literal(("\u00A77" + Component.translatable("item.truedarkness.smithing_template_desc.1").getString())));
			tooltip.add(6, Component.literal(("\u00A79 " + Component.translatable("item.minecraft.ender_pearl").getString())));
		}
		if (itemstack.getItem() == TruedarknessModItems.MEMORY_ARMOR_TRIM_SMITHING_TEMPLATE.get()) {
			tooltip.add(1, Component.literal(("\u00A77" + Component.translatable("trim_pattern.truedarkness.memory").getString())));
			tooltip.add(2, Component.literal(" "));
			tooltip.add(3, Component.literal(("\u00A77" + Component.translatable("item.truedarkness.smithing_template_desc").getString())));
			tooltip.add(4, Component.literal(("\u00A79 " + Component.translatable("item.truedarkness.smithing_template_desc.armor").getString())));
			tooltip.add(5, Component.literal(("\u00A77" + Component.translatable("item.truedarkness.smithing_template_desc.1").getString())));
			tooltip.add(6, Component.literal(("\u00A79 " + Component.translatable("item.truedarkness.smithing_template_desc.materials").getString())));
		}
		if (itemstack.getItem() == TruedarknessModItems.METAMORPHOSIS_ARMOR_TRIM_SMITHING_TEMPLATE.get()) {
			tooltip.add(1, Component.literal(("\u00A77" + Component.translatable("trim_pattern.truedarkness.metamorphosis").getString())));
			tooltip.add(2, Component.literal(" "));
			tooltip.add(3, Component.literal(("\u00A77" + Component.translatable("item.truedarkness.smithing_template_desc").getString())));
			tooltip.add(4, Component.literal(("\u00A79 " + Component.translatable("item.truedarkness.smithing_template_desc.armor").getString())));
			tooltip.add(5, Component.literal(("\u00A77" + Component.translatable("item.truedarkness.smithing_template_desc.1").getString())));
			tooltip.add(6, Component.literal(("\u00A79 " + Component.translatable("item.truedarkness.smithing_template_desc.materials").getString())));
		}
		if (itemstack.getItem() == TruedarknessModItems.SPLIT_ARMOR_TRIM_SMITHING_TEMPLATE.get()) {
			tooltip.add(1, Component.literal(("\u00A77" + Component.translatable("trim_pattern.truedarkness.split").getString())));
			tooltip.add(2, Component.literal(" "));
			tooltip.add(3, Component.literal(("\u00A77" + Component.translatable("item.truedarkness.smithing_template_desc").getString())));
			tooltip.add(4, Component.literal(("\u00A79 " + Component.translatable("item.truedarkness.smithing_template_desc.armor").getString())));
			tooltip.add(5, Component.literal(("\u00A77" + Component.translatable("item.truedarkness.smithing_template_desc.1").getString())));
			tooltip.add(6, Component.literal(("\u00A79 " + Component.translatable("item.truedarkness.smithing_template_desc.materials").getString())));
		}
		if (itemstack.getItem() == TruedarknessModItems.SPIRIT_ARMOR_TRIM_SMITHING_TEMPLATE.get()) {
			tooltip.add(1, Component.literal(("\u00A77" + Component.translatable("trim_pattern.truedarkness.spirit").getString())));
			tooltip.add(2, Component.literal(" "));
			tooltip.add(3, Component.literal(("\u00A77" + Component.translatable("item.truedarkness.smithing_template_desc").getString())));
			tooltip.add(4, Component.literal(("\u00A79 " + Component.translatable("item.truedarkness.smithing_template_desc.armor").getString())));
			tooltip.add(5, Component.literal(("\u00A77" + Component.translatable("item.truedarkness.smithing_template_desc.1").getString())));
			tooltip.add(6, Component.literal(("\u00A79 " + Component.translatable("item.truedarkness.smithing_template_desc.materials").getString())));
		}
		if (itemstack.is(ItemTags.create(new ResourceLocation("truedarkness:cursed_tales")))) {
			tooltip.add(1, Component.literal((("\u00A77" + Component.translatable("item.truedarkness.cursed_tale.desc").getString() + "") + ""
					+ Component.translatable(("item." + (ForgeRegistries.ITEMS.getKey(itemstack.getItem()).toString()).replace(":", ".") + ".desc")).getString())));
			tooltip.add(2, Component.literal(""));
			tooltip.add(3, Component.literal(("\u00A77" + Component.translatable("item.truedarkness.smithing_template_desc").getString())));
			tooltip.add(4, Component.literal((" \u00A79" + Component.translatable("item.truedarkness.cursed_tale.desc.to").getString())));
		}
		if (itemstack.is(ItemTags.create(new ResourceLocation("truedarkness:cursed_tools")))) {
			tooltip.add(1, Component.literal(("\u00A77" + Component.translatable("item.truedarkness.fang_tool.desc").getString())));
			if (!(itemstack.getOrCreateTag().getString("Tale1")).equals("")) {
				tooltip.add(2,
						Component.literal((" \u00A77" + Component.translatable(("item.truedarkness.cursed_tale_" + itemstack.getOrCreateTag().getString("Tale1") + ".desc")).getString()
								+ ((itemstack.getOrCreateTag().getString("Tale1")).equals("blood") || (itemstack.getOrCreateTag().getString("Tale1")).equals("steal")
										&& !((itemstack.getOrCreateTag().getString("Tale1")).equals("blood") || (itemstack.getOrCreateTag().getString("Tale2")).equals("blood") || (itemstack.getOrCreateTag().getString("Tale3")).equals("blood"))
												? ": \u00A75" + Math.round(itemstack.getOrCreateTag().getDouble("Prey"))
												: ""))));
				if (!(itemstack.getOrCreateTag().getString("Tale2")).equals("")) {
					tooltip.add(3,
							Component.literal((" \u00A77" + Component.translatable(("item.truedarkness.cursed_tale_" + itemstack.getOrCreateTag().getString("Tale2") + ".desc")).getString()
									+ ((itemstack.getOrCreateTag().getString("Tale2")).equals("blood") || (itemstack.getOrCreateTag().getString("Tale2")).equals("steal")
											&& !((itemstack.getOrCreateTag().getString("Tale1")).equals("blood") || (itemstack.getOrCreateTag().getString("Tale2")).equals("blood") || (itemstack.getOrCreateTag().getString("Tale3")).equals("blood"))
													? ": \u00A75" + Math.round(itemstack.getOrCreateTag().getDouble("Prey"))
													: ""))));
					if (!(itemstack.getOrCreateTag().getString("Tale3")).equals("")) {
						tooltip.add(4, Component.literal((" \u00A77" + Component.translatable(("item.truedarkness.cursed_tale_" + itemstack.getOrCreateTag().getString("Tale3") + ".desc")).getString()
								+ ((itemstack.getOrCreateTag().getString("Tale3")).equals("blood") || (itemstack.getOrCreateTag().getString("Tale3")).equals("steal")
										&& !((itemstack.getOrCreateTag().getString("Tale1")).equals("blood") || (itemstack.getOrCreateTag().getString("Tale2")).equals("blood") || (itemstack.getOrCreateTag().getString("Tale3")).equals("blood"))
												? ": \u00A75" + Math.round(itemstack.getOrCreateTag().getDouble("Prey"))
												: ""))));
					}
				}
			}
		}
		if (itemstack.getOrCreateTag().getBoolean("CursedModify") && itemstack.getItem().isEdible()) {
			tooltip.add(1, Component.literal(("\u00A77" + Component.translatable("item.truedarkness.corrupted_meat.add_desc").getString())));
			if (!(itemstack.getOrCreateTag().getString("Layer0")).equals("")) {
				tooltip.add(2, Component.literal((" \u00A77" + Component.translatable(("item.truedarkness.corrupted_meat.add_desc." + itemstack.getOrCreateTag().getString("Layer0"))).getString())));
				if (!(itemstack.getOrCreateTag().getString("Layer1")).equals("")) {
					tooltip.add(3, Component.literal((" \u00A77" + Component.translatable(("item.truedarkness.corrupted_meat.add_desc." + itemstack.getOrCreateTag().getString("Layer1"))).getString())));
					if (!(itemstack.getOrCreateTag().getString("Layer2")).equals("")) {
						tooltip.add(4, Component.literal((" \u00A77" + Component.translatable(("item.truedarkness.corrupted_meat.add_desc." + itemstack.getOrCreateTag().getString("Layer2"))).getString())));
					}
				}
			}
		}
		if (itemstack.getItem() == TruedarknessModItems.CURSED_EGG.get()) {
			if (Screen.hasShiftDown()) {
				if ((itemstack.getOrCreateTag().getString("desc")).equals(ForgeRegistries.ITEMS.getKey(itemstack.getItem()).toString())) {
					tooltip.add(1, Component.literal((Component.translatable(("item." + (ForgeRegistries.ITEMS.getKey(itemstack.getItem()).toString()).replace(":", ".") + ".desc")).getString())));
				} else {
					tooltip.add(1, Component.literal(("\u00A77" + Component.translatable("item.truedarkness.metenite_crystal.desc").getString())));
				}
			} else {
				tooltip.add(1, Component.literal(("\u00A77" + Component.translatable("item.truedarkness.cursed_tale_blood.desc").getString() + ": \u00A7d" + Math.round(itemstack.getOrCreateTag().getDouble("Prey")))));
				tooltip.add(2, Component.literal(("\u00A77" + Component.translatable("item.truedarkness.cursed_egg.extract").getString()
						+ (itemstack.getOrCreateTag().getBoolean("Extract") ? Component.translatable("item.truedarkness.cursed_egg.extract.on").getString() : Component.translatable("item.truedarkness.cursed_egg.extract.off").getString()))));
			}
		}
	}
}
