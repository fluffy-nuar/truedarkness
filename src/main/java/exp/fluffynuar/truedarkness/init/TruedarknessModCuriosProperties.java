package exp.fluffynuar.truedarkness.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.item.ItemProperties;

import exp.fluffynuar.truedarkness.procedures.ShinyEridiumDashZnachieniieSvoistvaProcedure;
import exp.fluffynuar.truedarkness.procedures.EridiumBookZnachieniieSvoistvaProcedure;
import exp.fluffynuar.truedarkness.procedures.EchoWingsZnachieniieSvoistvaProcedure;
import exp.fluffynuar.truedarkness.procedures.CursedLeatherZnachieniieSvoistvaProcedure;
import exp.fluffynuar.truedarkness.procedures.CursedEggZnachieniieSvoistvaProcedure;
import exp.fluffynuar.truedarkness.procedures.BlinkEridium2ZnachieniieSvoistvaProcedure;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class TruedarknessModCuriosProperties {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			ItemProperties.register(TruedarknessModItems.ECHO_WINGS.get(), new ResourceLocation("truedarkness:echo_wings_trim"),
					(itemStackToRender, clientWorld, entity, itemEntityId) -> (float) EchoWingsZnachieniieSvoistvaProcedure.execute(itemStackToRender));
			ItemProperties.register(TruedarknessModItems.ALIVE_CORE.get(), new ResourceLocation("truedarkness:alive_core_active"),
					(itemStackToRender, clientWorld, entity, itemEntityId) -> (float) BlinkEridium2ZnachieniieSvoistvaProcedure.execute(entity));
			ItemProperties.register(TruedarknessModItems.CURSED_SCROLL.get(), new ResourceLocation("truedarkness:cursed_scroll_type"),
					(itemStackToRender, clientWorld, entity, itemEntityId) -> (float) BlinkEridium2ZnachieniieSvoistvaProcedure.execute(entity));
			ItemProperties.register(TruedarknessModItems.CORRUPTED_CATALYST.get(), new ResourceLocation("truedarkness:corrupted_catalyst_active"),
					(itemStackToRender, clientWorld, entity, itemEntityId) -> (float) BlinkEridium2ZnachieniieSvoistvaProcedure.execute(entity));
			ItemProperties.register(TruedarknessModItems.SHINY_ERIDIUM_STREAM.get(), new ResourceLocation("truedarkness:shiny_eridium_stream_eridium_stage"),
					(itemStackToRender, clientWorld, entity, itemEntityId) -> (float) ShinyEridiumDashZnachieniieSvoistvaProcedure.execute(entity, itemStackToRender));
			ItemProperties.register(TruedarknessModItems.CURSED_EGG.get(), new ResourceLocation("truedarkness:cursed_egg_active_status"),
					(itemStackToRender, clientWorld, entity, itemEntityId) -> (float) CursedEggZnachieniieSvoistvaProcedure.execute(itemStackToRender));
			ItemProperties.register(TruedarknessModItems.STEEL_FANGS.get(), new ResourceLocation("truedarkness:steel_fangs_active"),
					(itemStackToRender, clientWorld, entity, itemEntityId) -> (float) BlinkEridium2ZnachieniieSvoistvaProcedure.execute(entity));
			ItemProperties.register(TruedarknessModItems.CURSED_SANDGLASS.get(), new ResourceLocation("truedarkness:cursed_sandglass_active"),
					(itemStackToRender, clientWorld, entity, itemEntityId) -> (float) BlinkEridium2ZnachieniieSvoistvaProcedure.execute(entity));
			ItemProperties.register(TruedarknessModItems.SNEAKY_FANGS.get(), new ResourceLocation("truedarkness:sneaky_fangs_active"),
					(itemStackToRender, clientWorld, entity, itemEntityId) -> (float) BlinkEridium2ZnachieniieSvoistvaProcedure.execute(entity));
			ItemProperties.register(TruedarknessModItems.WITHERED_FANGS.get(), new ResourceLocation("truedarkness:withered_fangs_active"),
					(itemStackToRender, clientWorld, entity, itemEntityId) -> (float) BlinkEridium2ZnachieniieSvoistvaProcedure.execute(entity));
			ItemProperties.register(TruedarknessModItems.HARD_FANGS.get(), new ResourceLocation("truedarkness:hard_fangs_active"),
					(itemStackToRender, clientWorld, entity, itemEntityId) -> (float) BlinkEridium2ZnachieniieSvoistvaProcedure.execute(entity));
			ItemProperties.register(TruedarknessModItems.CREEPY_FANGS.get(), new ResourceLocation("truedarkness:creepy_fangs_active"),
					(itemStackToRender, clientWorld, entity, itemEntityId) -> (float) BlinkEridium2ZnachieniieSvoistvaProcedure.execute(entity));
			ItemProperties.register(TruedarknessModItems.MOONLIGHT_FANGS.get(), new ResourceLocation("truedarkness:moonlight_fangs_active"),
					(itemStackToRender, clientWorld, entity, itemEntityId) -> (float) BlinkEridium2ZnachieniieSvoistvaProcedure.execute(entity));
			ItemProperties.register(TruedarknessModItems.SHINY_ERIDIUM_SEER.get(), new ResourceLocation("truedarkness:shiny_eridium_seer_eridium_stage"),
					(itemStackToRender, clientWorld, entity, itemEntityId) -> (float) ShinyEridiumDashZnachieniieSvoistvaProcedure.execute(entity, itemStackToRender));
			ItemProperties.register(TruedarknessModItems.SHINY_ERIDIUM_UNDYING.get(), new ResourceLocation("truedarkness:shiny_eridium_undying_eridium_stage"),
					(itemStackToRender, clientWorld, entity, itemEntityId) -> (float) ShinyEridiumDashZnachieniieSvoistvaProcedure.execute(entity, itemStackToRender));
			ItemProperties.register(TruedarknessModItems.SHINY_ERIDIUM_RUNE.get(), new ResourceLocation("truedarkness:shiny_eridium_rune_eridium_stage"),
					(itemStackToRender, clientWorld, entity, itemEntityId) -> (float) ShinyEridiumDashZnachieniieSvoistvaProcedure.execute(entity, itemStackToRender));
			ItemProperties.register(TruedarknessModItems.SHINY_ERIDIUM_TREAD.get(), new ResourceLocation("truedarkness:shiny_eridium_tread_eridium_stage"),
					(itemStackToRender, clientWorld, entity, itemEntityId) -> (float) ShinyEridiumDashZnachieniieSvoistvaProcedure.execute(entity, itemStackToRender));
			ItemProperties.register(TruedarknessModItems.SHINY_ERIDIUM_ECHO.get(), new ResourceLocation("truedarkness:shiny_eridium_echo_eridium_stage"),
					(itemStackToRender, clientWorld, entity, itemEntityId) -> (float) ShinyEridiumDashZnachieniieSvoistvaProcedure.execute(entity, itemStackToRender));
			ItemProperties.register(TruedarknessModItems.CURSED_LEATHER.get(), new ResourceLocation("truedarkness:cursed_leather_type"),
					(itemStackToRender, clientWorld, entity, itemEntityId) -> (float) CursedLeatherZnachieniieSvoistvaProcedure.execute(itemStackToRender));
			ItemProperties.register(TruedarknessModItems.CURSED_MAGNIFIER.get(), new ResourceLocation("truedarkness:cursed_magnifier_active"),
					(itemStackToRender, clientWorld, entity, itemEntityId) -> (float) BlinkEridium2ZnachieniieSvoistvaProcedure.execute(entity));
			ItemProperties.register(TruedarknessModItems.ERIDIUM_GLASS_SHARD.get(), new ResourceLocation("truedarkness:eridium_glass_shard_active"),
					(itemStackToRender, clientWorld, entity, itemEntityId) -> (float) BlinkEridium2ZnachieniieSvoistvaProcedure.execute(entity));
			ItemProperties.register(TruedarknessModItems.ERIDIUM_BOOK.get(), new ResourceLocation("truedarkness:eridium_book_vitanomicon"),
					(itemStackToRender, clientWorld, entity, itemEntityId) -> (float) EridiumBookZnachieniieSvoistvaProcedure.execute(itemStackToRender));
			ItemProperties.register(TruedarknessModItems.SHINY_ERIDIUM_SMELT.get(), new ResourceLocation("truedarkness:shiny_eridium_smelt_eridium_stage"),
					(itemStackToRender, clientWorld, entity, itemEntityId) -> (float) ShinyEridiumDashZnachieniieSvoistvaProcedure.execute(entity, itemStackToRender));
			ItemProperties.register(TruedarknessModItems.SHINY_ERIDIUM_TOOL.get(), new ResourceLocation("truedarkness:shiny_eridium_tool_eridium_stage"),
					(itemStackToRender, clientWorld, entity, itemEntityId) -> (float) ShinyEridiumDashZnachieniieSvoistvaProcedure.execute(entity, itemStackToRender));
			ItemProperties.register(TruedarknessModItems.SHINY_ERIDIUM_SKULL.get(), new ResourceLocation("truedarkness:shiny_eridium_skull_eridium_stage"),
					(itemStackToRender, clientWorld, entity, itemEntityId) -> (float) ShinyEridiumDashZnachieniieSvoistvaProcedure.execute(entity, itemStackToRender));
			ItemProperties.register(TruedarknessModItems.SHINY_ERIDIUM_LIGHT.get(), new ResourceLocation("truedarkness:shiny_eridium_light_eridium_stage"),
					(itemStackToRender, clientWorld, entity, itemEntityId) -> (float) ShinyEridiumDashZnachieniieSvoistvaProcedure.execute(entity, itemStackToRender));
		});
	}
}
