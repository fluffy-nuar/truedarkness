package exp.fluffynuar.truedarkness.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.client.gui.screens.Screen;

import javax.annotation.Nullable;

import java.util.List;

import exp.fluffynuar.truedarkness.init.TruedarknessModItems;

@Mod.EventBusSubscriber
public class SkrezhalPartOceanTextProcedure {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void onItemTooltip(ItemTooltipEvent event) {
		execute(event, event.getEntity(), event.getItemStack(), event.getToolTip());
	}

	public static void execute(Entity entity, ItemStack itemstack, List<Component> tooltip) {
		execute(null, entity, itemstack, tooltip);
	}

	private static void execute(@Nullable Event event, Entity entity, ItemStack itemstack, List<Component> tooltip) {
		if (entity == null || tooltip == null)
			return;
		if (itemstack.getItem() == TruedarknessModItems.TABLET_OCEAN.get() || itemstack.getItem() == TruedarknessModItems.TABLET_CAVE.get()) {
			if (Screen.hasShiftDown()) {
				tooltip.add(1, Component.literal((Component.translatable(("item." + (ForgeRegistries.ITEMS.getKey(itemstack.getItem()).toString()).replace(":", ".") + ".desc_1")).getString())));
			} else {
				tooltip.add(1, Component.literal((Component.translatable(("item." + (ForgeRegistries.ITEMS.getKey(itemstack.getItem()).toString()).replace(":", ".") + ".desc")).getString())));
			}
		}
		if (itemstack.getItem() == TruedarknessModItems.TABLET.get()) {
			if (Screen.hasShiftDown()) {
				if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("truedarkness:yteria"))) {
					tooltip.add(1, Component.literal(("\u00A77" + Component.translatable("item.truedarkness.tablet.desc_2").getString())));
				} else {
					tooltip.add(1, Component.literal(("\u00A77" + Component.translatable("item.truedarkness.tablet.desc_1").getString())));
				}
				if (itemstack.getOrCreateTag().getBoolean("Tablet_accept") == true && itemstack.getOrCreateTag().getBoolean("Tablet_accept_OW") == true
						&& !((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("truedarkness:yteria")))) {
					tooltip.add(2,
							Component.literal(("\u00A77[\u00A7bX\u00A77]=\u00A7b" + Math.round(itemstack.getOrCreateTag().getDouble("Tablet_X")) + "\u00A77(\u00A7a" + Math.round(itemstack.getOrCreateTag().getDouble("Tablet_X_OW")) + "\u00A77)")));
					tooltip.add(3,
							Component.literal(("\u00A77[\u00A7bY\u00A77]=\u00A7b" + Math.round(itemstack.getOrCreateTag().getDouble("Tablet_Y")) + "\u00A77(\u00A7a" + Math.round(itemstack.getOrCreateTag().getDouble("Tablet_Y_OW")) + "\u00A77)")));
					tooltip.add(4,
							Component.literal(("\u00A77[\u00A7bZ\u00A77]=\u00A7b" + Math.round(itemstack.getOrCreateTag().getDouble("Tablet_Z")) + "\u00A77(\u00A7a" + Math.round(itemstack.getOrCreateTag().getDouble("Tablet_Z_OW")) + "\u00A77)")));
				} else if (itemstack.getOrCreateTag().getBoolean("Tablet_accept") == true && itemstack.getOrCreateTag().getBoolean("Tablet_accept_OW") == true
						&& (entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("truedarkness:yteria"))) {
					tooltip.add(2,
							Component.literal(("\u00A77[\u00A7aX\u00A77]=\u00A7a" + Math.round(itemstack.getOrCreateTag().getDouble("Tablet_X_OW")) + "\u00A77(\u00A7b" + Math.round(itemstack.getOrCreateTag().getDouble("Tablet_X")) + "\u00A77)")));
					tooltip.add(3,
							Component.literal(("\u00A77[\u00A7aY\u00A77]=\u00A7a" + Math.round(itemstack.getOrCreateTag().getDouble("Tablet_Y_OW")) + "\u00A77(\u00A7b" + Math.round(itemstack.getOrCreateTag().getDouble("Tablet_Y")) + "\u00A77)")));
					tooltip.add(4,
							Component.literal(("\u00A77[\u00A7aZ\u00A77]=\u00A7a" + Math.round(itemstack.getOrCreateTag().getDouble("Tablet_Z_OW")) + "\u00A77(\u00A7b" + Math.round(itemstack.getOrCreateTag().getDouble("Tablet_Z")) + "\u00A77)")));
				} else if (itemstack.getOrCreateTag().getBoolean("Tablet_accept") == true && itemstack.getOrCreateTag().getBoolean("Tablet_accept_OW") == false) {
					tooltip.add(2, Component.literal(("\u00A77[\u00A7bX\u00A77]=\u00A7b" + Math.round(itemstack.getOrCreateTag().getDouble("Tablet_X")))));
					tooltip.add(3, Component.literal(("\u00A77[\u00A7bY\u00A77]=\u00A7b" + Math.round(itemstack.getOrCreateTag().getDouble("Tablet_Y")))));
					tooltip.add(4, Component.literal(("\u00A77[\u00A7bZ\u00A77]=\u00A7b" + Math.round(itemstack.getOrCreateTag().getDouble("Tablet_Z")))));
				} else if (itemstack.getOrCreateTag().getBoolean("Tablet_accept") == false && itemstack.getOrCreateTag().getBoolean("Tablet_accept_OW") == true) {
					tooltip.add(2, Component.literal(("\u00A77[\u00A7aX\u00A77]=\u00A7a" + Math.round(itemstack.getOrCreateTag().getDouble("Tablet_X_OW")))));
					tooltip.add(3, Component.literal(("\u00A77[\u00A7aY\u00A77]=\u00A7a" + Math.round(itemstack.getOrCreateTag().getDouble("Tablet_Y_OW")))));
					tooltip.add(4, Component.literal(("\u00A77[\u00A7aZ\u00A77]=\u00A7a" + Math.round(itemstack.getOrCreateTag().getDouble("Tablet_Z_OW")))));
				}
			} else {
				tooltip.add(1, Component.literal((Component.translatable(("item." + (ForgeRegistries.ITEMS.getKey(itemstack.getItem()).toString()).replace(":", ".") + ".desc")).getString())));
				tooltip.add(2, Component.literal((Component.translatable(("item." + (ForgeRegistries.ITEMS.getKey(itemstack.getItem()).toString()).replace(":", ".") + ".desc.1")).getString())));
				tooltip.add(3, Component.literal((Component.translatable(("item." + (ForgeRegistries.ITEMS.getKey(itemstack.getItem()).toString()).replace(":", ".") + ".desc.2")).getString())));
				tooltip.add(4, Component.literal((Component.translatable(("item." + (ForgeRegistries.ITEMS.getKey(itemstack.getItem()).toString()).replace(":", ".") + ".desc.3")).getString())));
			}
		}
	}
}
