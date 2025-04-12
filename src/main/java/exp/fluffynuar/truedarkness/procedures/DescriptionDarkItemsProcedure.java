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

import javax.annotation.Nullable;

import java.util.List;

@Mod.EventBusSubscriber
public class DescriptionDarkItemsProcedure {
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
		if (itemstack.is(ItemTags.create(new ResourceLocation("truedarkness:dark_addons"))) && !itemstack.is(ItemTags.create(new ResourceLocation("truedarkness:without_desc")))) {
			if ((itemstack.getOrCreateTag().getString("desc")).equals(ForgeRegistries.ITEMS.getKey(itemstack.getItem()).toString()) && itemstack.is(ItemTags.create(new ResourceLocation("corrupted_food")))) {
				tooltip.add(1, Component.literal(("\u00A77" + Component.translatable("item.truedarkness.corrupted_soup.desc").getString())));
			} else if ((itemstack.getOrCreateTag().getString("desc")).equals(ForgeRegistries.ITEMS.getKey(itemstack.getItem()).toString()) && !itemstack.is(ItemTags.create(new ResourceLocation("corrupted_food")))) {
				tooltip.add(1, Component.literal((Component.translatable(("item." + (ForgeRegistries.ITEMS.getKey(itemstack.getItem()).toString()).replace(":", ".") + ".desc")).getString())));
			} else {
				tooltip.add(1, Component.literal((Component.translatable("item.truedarkness.dark_crystal.desc").getString())));
			}
		}
	}
}
