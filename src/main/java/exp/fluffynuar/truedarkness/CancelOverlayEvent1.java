package exp.fluffynuar.truedarkness;
 // <- Твой путь к этому элементу, оставить как при создании элемента

import net.minecraftforge.client.event.RenderGuiOverlayEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.gui.overlay.VanillaGuiOverlay;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.client.Minecraft;

import exp.fluffynuar.truedarkness.procedures.ExpirienceHideBarProcedure; // <<< Твоя процедура с условием для отмены рендера

									// vvv Твой id вставить сюда
@Mod.EventBusSubscriber(modid = "truedarkness", bus = Mod.EventBusSubscriber.Bus.FORGE)
public class CancelOverlayEvent1{ // <<< Название твоего кастомного элемента, куда добавлен этот код

    @SubscribeEvent
    public static void CancelOverlay(RenderGuiOverlayEvent.Pre event) { // << Тут пофиг какое название, но лучше со смыслом

    	// vvv Добавил переменные игрока, мира, координат игрока для возможного использования в процедуре с условием отмены, если требуется
    	Level world = null;
		double x = 0;
		double y = 0;
		double z = 0;
    	Player entity = Minecraft.getInstance().player;
    	if (entity != null) {
			world = entity.level();
			x = entity.getX();
			y = entity.getY();
			z = entity.getZ();
    	}

		// Переменная boolean с условием отмены, получает значение от внейшей процедуры.
		// Она должна возвращать сюда boolean (true или false), можно предоставить упомянутые выше:
		// entity (это игрок - Player), world, x, y, z в качестве входных данных для некоторых условий проверки
		// vvv
    	boolean cancel_condition = ExpirienceHideBarProcedure.execute(entity); // <<< Название твоей процедуры, MCreator всегда добавляет 'Procedure' в конце после твоего реального названия, можешь создать 'CancelExperienceOverlayRenderingCondition'

															/// vvv Целевой Overlay
        if (event.getOverlay().id() == VanillaGuiOverlay.FOOD_LEVEL.id()) { // <<< Сравнение id с ванильным слоем
        								// ^^^ Можно посмотреть на список ванильных слоёв в этом классе - нажми сюда Ctrl + ЛКМ
        								//     Будет много названий капсом, например, VIGNETTE, SPYGLASS, HELMET и другие
            event.setCanceled(cancel_condition);
        }
    }
}

// Удачи!