
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package exp.fluffynuar.truedarkness.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import exp.fluffynuar.truedarkness.client.model.Modelwaster;
import exp.fluffynuar.truedarkness.client.model.Modeliridiumoviy_Golem;
import exp.fluffynuar.truedarkness.client.model.Modelgeneral_armor;
import exp.fluffynuar.truedarkness.client.model.Modelgeneral;
import exp.fluffynuar.truedarkness.client.model.Modelfungun;
import exp.fluffynuar.truedarkness.client.model.Modelflow;
import exp.fluffynuar.truedarkness.client.model.Modeleye;
import exp.fluffynuar.truedarkness.client.model.Modeleridium_zombie;
import exp.fluffynuar.truedarkness.client.model.Modeleridium_helmet_with_feather;
import exp.fluffynuar.truedarkness.client.model.Modelcustom_model;
import exp.fluffynuar.truedarkness.client.model.Modelcryer;
import exp.fluffynuar.truedarkness.client.model.Modelcrown;
import exp.fluffynuar.truedarkness.client.model.Modelcorrupted_knight;
import exp.fluffynuar.truedarkness.client.model.Modelcorrupted_hand;
import exp.fluffynuar.truedarkness.client.model.Modelbelt;
import exp.fluffynuar.truedarkness.client.model.Modelarmor;
import exp.fluffynuar.truedarkness.client.model.Modelarfin;
import exp.fluffynuar.truedarkness.client.model.Modelamulet;
import exp.fluffynuar.truedarkness.client.model.Modelalex;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class TruedarknessModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelcrown.LAYER_LOCATION, Modelcrown::createBodyLayer);
		event.registerLayerDefinition(Modeliridiumoviy_Golem.LAYER_LOCATION, Modeliridiumoviy_Golem::createBodyLayer);
		event.registerLayerDefinition(Modelarfin.LAYER_LOCATION, Modelarfin::createBodyLayer);
		event.registerLayerDefinition(Modelcryer.LAYER_LOCATION, Modelcryer::createBodyLayer);
		event.registerLayerDefinition(Modelwaster.LAYER_LOCATION, Modelwaster::createBodyLayer);
		event.registerLayerDefinition(Modelbelt.LAYER_LOCATION, Modelbelt::createBodyLayer);
		event.registerLayerDefinition(Modelgeneral.LAYER_LOCATION, Modelgeneral::createBodyLayer);
		event.registerLayerDefinition(Modelgeneral_armor.LAYER_LOCATION, Modelgeneral_armor::createBodyLayer);
		event.registerLayerDefinition(Modelflow.LAYER_LOCATION, Modelflow::createBodyLayer);
		event.registerLayerDefinition(Modelcorrupted_knight.LAYER_LOCATION, Modelcorrupted_knight::createBodyLayer);
		event.registerLayerDefinition(Modeleridium_zombie.LAYER_LOCATION, Modeleridium_zombie::createBodyLayer);
		event.registerLayerDefinition(Modelamulet.LAYER_LOCATION, Modelamulet::createBodyLayer);
		event.registerLayerDefinition(Modelarmor.LAYER_LOCATION, Modelarmor::createBodyLayer);
		event.registerLayerDefinition(Modelalex.LAYER_LOCATION, Modelalex::createBodyLayer);
		event.registerLayerDefinition(Modelfungun.LAYER_LOCATION, Modelfungun::createBodyLayer);
		event.registerLayerDefinition(Modeleye.LAYER_LOCATION, Modeleye::createBodyLayer);
		event.registerLayerDefinition(Modelcorrupted_hand.LAYER_LOCATION, Modelcorrupted_hand::createBodyLayer);
		event.registerLayerDefinition(Modelcustom_model.LAYER_LOCATION, Modelcustom_model::createBodyLayer);
		event.registerLayerDefinition(Modeleridium_helmet_with_feather.LAYER_LOCATION, Modeleridium_helmet_with_feather::createBodyLayer);
	}
}
