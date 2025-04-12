
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package exp.fluffynuar.truedarkness.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import exp.fluffynuar.truedarkness.client.model.Modelwaste_runner;
import exp.fluffynuar.truedarkness.client.model.Modelwarm_clothes;
import exp.fluffynuar.truedarkness.client.model.Modelunformed_corrupted_remnant;
import exp.fluffynuar.truedarkness.client.model.Modeltear_sword;
import exp.fluffynuar.truedarkness.client.model.Modelsoulsteal_warrior;
import exp.fluffynuar.truedarkness.client.model.Modelsoul_remnants;
import exp.fluffynuar.truedarkness.client.model.Modelskyfall_armor;
import exp.fluffynuar.truedarkness.client.model.Modelnatural_armor;
import exp.fluffynuar.truedarkness.client.model.Modelminer;
import exp.fluffynuar.truedarkness.client.model.Modeliridiumoviy_Golem;
import exp.fluffynuar.truedarkness.client.model.Modelhex;
import exp.fluffynuar.truedarkness.client.model.Modelglow_bug;
import exp.fluffynuar.truedarkness.client.model.Modelgloomer_warrior;
import exp.fluffynuar.truedarkness.client.model.Modelgloomer_elder;
import exp.fluffynuar.truedarkness.client.model.Modelgloomer_craftsman;
import exp.fluffynuar.truedarkness.client.model.Modelgloomer_chiller;
import exp.fluffynuar.truedarkness.client.model.Modelgloomer;
import exp.fluffynuar.truedarkness.client.model.Modelgeneral_armor;
import exp.fluffynuar.truedarkness.client.model.Modelgeneral;
import exp.fluffynuar.truedarkness.client.model.Modelfungun;
import exp.fluffynuar.truedarkness.client.model.Modelflow;
import exp.fluffynuar.truedarkness.client.model.Modelfirenite_armor;
import exp.fluffynuar.truedarkness.client.model.Modelfantal_armor;
import exp.fluffynuar.truedarkness.client.model.Modeleye;
import exp.fluffynuar.truedarkness.client.model.Modeleridium_zombie;
import exp.fluffynuar.truedarkness.client.model.Modeleridium_book;
import exp.fluffynuar.truedarkness.client.model.Modelcustom_model;
import exp.fluffynuar.truedarkness.client.model.Modelcryer;
import exp.fluffynuar.truedarkness.client.model.Modelcrown;
import exp.fluffynuar.truedarkness.client.model.Modelcorrupted_skeleton;
import exp.fluffynuar.truedarkness.client.model.Modelcorrupted_necromancer;
import exp.fluffynuar.truedarkness.client.model.Modelcorrupted_mage;
import exp.fluffynuar.truedarkness.client.model.Modelcorrupted_knight;
import exp.fluffynuar.truedarkness.client.model.Modelcorrupted_human;
import exp.fluffynuar.truedarkness.client.model.Modelcorrupted_hand;
import exp.fluffynuar.truedarkness.client.model.Modelcorrupted_assassin_aggresive;
import exp.fluffynuar.truedarkness.client.model.Modelbelt;
import exp.fluffynuar.truedarkness.client.model.Modelaxolotl_hat;
import exp.fluffynuar.truedarkness.client.model.Modelarmor;
import exp.fluffynuar.truedarkness.client.model.Modelarfin;
import exp.fluffynuar.truedarkness.client.model.Modelamulet;
import exp.fluffynuar.truedarkness.client.model.Modelalex;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class TruedarknessModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelcorrupted_assassin_aggresive.LAYER_LOCATION, Modelcorrupted_assassin_aggresive::createBodyLayer);
		event.registerLayerDefinition(Modeliridiumoviy_Golem.LAYER_LOCATION, Modeliridiumoviy_Golem::createBodyLayer);
		event.registerLayerDefinition(Modelarfin.LAYER_LOCATION, Modelarfin::createBodyLayer);
		event.registerLayerDefinition(Modeleridium_book.LAYER_LOCATION, Modeleridium_book::createBodyLayer);
		event.registerLayerDefinition(Modelcorrupted_knight.LAYER_LOCATION, Modelcorrupted_knight::createBodyLayer);
		event.registerLayerDefinition(Modelaxolotl_hat.LAYER_LOCATION, Modelaxolotl_hat::createBodyLayer);
		event.registerLayerDefinition(Modelgloomer.LAYER_LOCATION, Modelgloomer::createBodyLayer);
		event.registerLayerDefinition(Modelamulet.LAYER_LOCATION, Modelamulet::createBodyLayer);
		event.registerLayerDefinition(Modelwarm_clothes.LAYER_LOCATION, Modelwarm_clothes::createBodyLayer);
		event.registerLayerDefinition(Modelalex.LAYER_LOCATION, Modelalex::createBodyLayer);
		event.registerLayerDefinition(Modelfungun.LAYER_LOCATION, Modelfungun::createBodyLayer);
		event.registerLayerDefinition(Modelnatural_armor.LAYER_LOCATION, Modelnatural_armor::createBodyLayer);
		event.registerLayerDefinition(Modelhex.LAYER_LOCATION, Modelhex::createBodyLayer);
		event.registerLayerDefinition(Modelcorrupted_human.LAYER_LOCATION, Modelcorrupted_human::createBodyLayer);
		event.registerLayerDefinition(Modelminer.LAYER_LOCATION, Modelminer::createBodyLayer);
		event.registerLayerDefinition(Modelgloomer_craftsman.LAYER_LOCATION, Modelgloomer_craftsman::createBodyLayer);
		event.registerLayerDefinition(Modelgloomer_chiller.LAYER_LOCATION, Modelgloomer_chiller::createBodyLayer);
		event.registerLayerDefinition(Modelcrown.LAYER_LOCATION, Modelcrown::createBodyLayer);
		event.registerLayerDefinition(Modelfirenite_armor.LAYER_LOCATION, Modelfirenite_armor::createBodyLayer);
		event.registerLayerDefinition(Modelgloomer_warrior.LAYER_LOCATION, Modelgloomer_warrior::createBodyLayer);
		event.registerLayerDefinition(Modelcryer.LAYER_LOCATION, Modelcryer::createBodyLayer);
		event.registerLayerDefinition(Modeltear_sword.LAYER_LOCATION, Modeltear_sword::createBodyLayer);
		event.registerLayerDefinition(Modelsoul_remnants.LAYER_LOCATION, Modelsoul_remnants::createBodyLayer);
		event.registerLayerDefinition(Modelbelt.LAYER_LOCATION, Modelbelt::createBodyLayer);
		event.registerLayerDefinition(Modelcorrupted_skeleton.LAYER_LOCATION, Modelcorrupted_skeleton::createBodyLayer);
		event.registerLayerDefinition(Modelgeneral.LAYER_LOCATION, Modelgeneral::createBodyLayer);
		event.registerLayerDefinition(Modelunformed_corrupted_remnant.LAYER_LOCATION, Modelunformed_corrupted_remnant::createBodyLayer);
		event.registerLayerDefinition(Modelgeneral_armor.LAYER_LOCATION, Modelgeneral_armor::createBodyLayer);
		event.registerLayerDefinition(Modelflow.LAYER_LOCATION, Modelflow::createBodyLayer);
		event.registerLayerDefinition(Modeleridium_zombie.LAYER_LOCATION, Modeleridium_zombie::createBodyLayer);
		event.registerLayerDefinition(Modelskyfall_armor.LAYER_LOCATION, Modelskyfall_armor::createBodyLayer);
		event.registerLayerDefinition(Modelarmor.LAYER_LOCATION, Modelarmor::createBodyLayer);
		event.registerLayerDefinition(Modeleye.LAYER_LOCATION, Modeleye::createBodyLayer);
		event.registerLayerDefinition(Modelcorrupted_hand.LAYER_LOCATION, Modelcorrupted_hand::createBodyLayer);
		event.registerLayerDefinition(Modelgloomer_elder.LAYER_LOCATION, Modelgloomer_elder::createBodyLayer);
		event.registerLayerDefinition(Modelwaste_runner.LAYER_LOCATION, Modelwaste_runner::createBodyLayer);
		event.registerLayerDefinition(Modelcustom_model.LAYER_LOCATION, Modelcustom_model::createBodyLayer);
		event.registerLayerDefinition(Modelfantal_armor.LAYER_LOCATION, Modelfantal_armor::createBodyLayer);
		event.registerLayerDefinition(Modelsoulsteal_warrior.LAYER_LOCATION, Modelsoulsteal_warrior::createBodyLayer);
		event.registerLayerDefinition(Modelcorrupted_necromancer.LAYER_LOCATION, Modelcorrupted_necromancer::createBodyLayer);
		event.registerLayerDefinition(Modelglow_bug.LAYER_LOCATION, Modelglow_bug::createBodyLayer);
		event.registerLayerDefinition(Modelcorrupted_mage.LAYER_LOCATION, Modelcorrupted_mage::createBodyLayer);
	}
}
