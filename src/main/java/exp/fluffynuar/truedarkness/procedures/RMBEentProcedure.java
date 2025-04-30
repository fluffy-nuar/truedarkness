package exp.fluffynuar.truedarkness.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;

import javax.annotation.Nullable;

import exp.fluffynuar.truedarkness.init.TruedarknessModMobEffects;

@Mod.EventBusSubscriber
public class RMBEentProcedure {
	@SubscribeEvent
	public static void onRightClickWithItem(PlayerInteractEvent.RightClickItem event) {
		String usehand = "";
		if (event.getHand() == InteractionHand.MAIN_HAND) {
			usehand = "mainhand";
		} else {
			usehand = "offhand";
		}
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getEntity(), event.getItemStack());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		execute(null, world, x, y, z, entity, itemstack);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(TruedarknessModMobEffects.CORRUPTED_REMNANT_USING.get())) {
			ActiveAbility2PriNazhatiiKlavishiProcedure.execute(world, x, y, z, entity);
			if (event != null && event.isCancelable()) {
				event.setCanceled(true);
			}
		} else {
			if (itemstack.is(ItemTags.create(new ResourceLocation("truedarkness:shiny_eridium")))) {
				if (itemstack.getOrCreateTag().getDouble("ActiveStage") < 4) {
					itemstack.getOrCreateTag().putDouble("ActiveStage", (itemstack.getOrCreateTag().getDouble("ActiveStage") + 1));
				} else {
					itemstack.getOrCreateTag().putDouble("ActiveStage", 0);
				}
			}
		}
	}
}
