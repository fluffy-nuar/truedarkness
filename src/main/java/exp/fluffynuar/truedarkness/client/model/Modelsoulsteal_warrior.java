package exp.fluffynuar.truedarkness.client.model;

import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.11.0
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelsoulsteal_warrior<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("truedarkness", "modelsoulsteal_warrior"), "main");
	public final ModelPart LeftLeg;
	public final ModelPart RightLeg;
	public final ModelPart LeftArm;
	public final ModelPart RightArm;
	public final ModelPart Body;
	public final ModelPart Head;

	public Modelsoulsteal_warrior(ModelPart root) {
		this.LeftLeg = root.getChild("LeftLeg");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftArm = root.getChild("LeftArm");
		this.RightArm = root.getChild("RightArm");
		this.Body = root.getChild("Body");
		this.Head = root.getChild("Head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(20, 16).mirror().addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false).texOffs(32, 112).mirror()
				.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.2F)).mirror(false), PartPose.offsetAndRotation(1.9F, 12.0F, 0.0F, -0.1745F, 0.0F, -0.0349F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(20, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(-0.2F)).texOffs(32, 112).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-1.9F, 12.0F, 0.0F, 0.192F, 0.0F, 0.0349F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(0, 98).addBox(-0.8723F, -2.4698F, -0.7921F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(4.0F, 3.0F, 0.0F));
		PartDefinition LeftArmArmor = LeftArm.addOrReplaceChild("LeftArmArmor", CubeListBuilder.create().texOffs(211, 97).mirror().addBox(1.0F, -23.0F, -2.0F, 6.0F, 12.0F, 4.0F, new CubeDeformation(0.5F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, 21.0F, 0.0F, 0.0F, 0.0F, -0.1745F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(0, 98).addBox(-2.1285F, -2.4764F, -1.1736F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.0F, 3.0F, 0.0F));
		PartDefinition Item = RightArm.addOrReplaceChild("Item",
				CubeListBuilder.create().texOffs(168, 32).addBox(-3.0F, 5.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(160, 34).addBox(-1.0F, 6.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(164, 34)
						.addBox(-2.0F, 6.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(168, 34).addBox(-3.0F, 6.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(172, 34)
						.addBox(-4.0F, 6.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(164, 32).addBox(-2.0F, 5.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(172, 32)
						.addBox(-4.0F, 5.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(164, 36).addBox(-2.0F, 7.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(160, 36)
						.addBox(-1.0F, 7.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 36).addBox(0.0F, 7.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(116, 62)
						.addBox(10.0F, 20.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(120, 62).addBox(9.0F, 20.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(112, 60)
						.addBox(11.0F, 19.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(116, 60).addBox(10.0F, 19.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(120, 60)
						.addBox(9.0F, 19.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(124, 58).addBox(8.0F, 18.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(120, 58)
						.addBox(9.0F, 18.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(116, 58).addBox(10.0F, 18.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(112, 58)
						.addBox(11.0F, 18.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(140, 56).addBox(4.0F, 17.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(128, 56)
						.addBox(7.0F, 17.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(124, 56).addBox(8.0F, 17.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(120, 56)
						.addBox(9.0F, 17.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 56).addBox(3.0F, 17.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(148, 54)
						.addBox(2.0F, 16.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 54).addBox(3.0F, 16.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(124, 54)
						.addBox(8.0F, 16.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(128, 54).addBox(7.0F, 16.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(132, 54)
						.addBox(6.0F, 16.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(136, 54).addBox(5.0F, 16.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(140, 54)
						.addBox(4.0F, 16.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(148, 52).addBox(2.0F, 15.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 52)
						.addBox(3.0F, 15.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(128, 52).addBox(7.0F, 15.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(132, 52)
						.addBox(6.0F, 15.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(136, 52).addBox(5.0F, 15.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(140, 52)
						.addBox(4.0F, 15.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(140, 50).addBox(4.0F, 14.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(136, 50)
						.addBox(5.0F, 14.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(132, 50).addBox(6.0F, 14.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(128, 50)
						.addBox(7.0F, 14.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 50).addBox(3.0F, 14.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(140, 48)
						.addBox(4.0F, 13.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(136, 48).addBox(5.0F, 13.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(132, 48)
						.addBox(6.0F, 13.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(128, 48).addBox(7.0F, 13.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(124, 48)
						.addBox(8.0F, 13.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 48).addBox(3.0F, 13.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(148, 48)
						.addBox(2.0F, 13.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(152, 46).addBox(1.0F, 12.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(148, 46)
						.addBox(2.0F, 12.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 46).addBox(3.0F, 12.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(124, 46)
						.addBox(8.0F, 12.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(128, 46).addBox(7.0F, 12.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(132, 46)
						.addBox(6.0F, 12.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(136, 46).addBox(5.0F, 12.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(140, 46)
						.addBox(4.0F, 12.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 44).addBox(0.0F, 11.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(152, 44)
						.addBox(1.0F, 11.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(148, 44).addBox(2.0F, 11.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 44)
						.addBox(3.0F, 11.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(128, 44).addBox(7.0F, 11.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(132, 44)
						.addBox(6.0F, 11.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(140, 44).addBox(4.0F, 11.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 42)
						.addBox(3.0F, 10.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(148, 42).addBox(2.0F, 10.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(152, 42)
						.addBox(1.0F, 10.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 42).addBox(0.0F, 10.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(160, 42)
						.addBox(-1.0F, 10.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(148, 40).addBox(2.0F, 9.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(152, 40)
						.addBox(1.0F, 9.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 40).addBox(0.0F, 9.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(160, 40)
						.addBox(-1.0F, 9.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(164, 40).addBox(-2.0F, 9.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(168, 38)
						.addBox(-3.0F, 8.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(164, 38).addBox(-2.0F, 8.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(160, 38)
						.addBox(-1.0F, 8.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 38).addBox(0.0F, 8.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(152, 38)
						.addBox(1.0F, 8.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(172, 36).addBox(-4.0F, 7.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(168, 36)
						.addBox(-3.0F, 7.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.0F, -17.0F, 1.5708F, -0.6981F, -1.5708F));
		PartDefinition RightArmArmor = RightArm.addOrReplaceChild("RightArmArmor", CubeListBuilder.create().texOffs(211, 97).addBox(-6.0F, -23.0F, -2.0F, 6.0F, 12.0F, 4.0F, new CubeDeformation(0.5F)),
				PartPose.offsetAndRotation(0.0F, 21.0F, 0.0F, 0.0F, 0.0F, 0.1745F));
		PartDefinition CrystalGroupD = RightArm.addOrReplaceChild("CrystalGroupD", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9F, 9.5F, -5.0F, 1.1743F, -0.2417F, -1.3823F));
		PartDefinition Crystal_r1 = CrystalGroupD.addOrReplaceChild("Crystal_r1", CubeListBuilder.create().texOffs(58, 75).addBox(-1.0F, -3.0F, -1.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -1.0F, 0.0F, -0.4326F, 0.2149F, 0.4326F));
		PartDefinition CrystalGroupE = RightArm.addOrReplaceChild("CrystalGroupE", CubeListBuilder.create().texOffs(59, 67).addBox(-1.0F, -5.0F, -1.0F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.1F, 5.5F, -1.0F, -2.1709F, -0.7619F, -0.0194F));
		PartDefinition CrystalGroupF = RightArm.addOrReplaceChild("CrystalGroupF", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.1F, -0.5F, 2.0F, 1.0866F, -0.2068F, -0.1701F));
		PartDefinition Crystal_r2 = CrystalGroupF.addOrReplaceChild("Crystal_r2", CubeListBuilder.create().texOffs(72, 66).addBox(-2.0F, -4.0F, -1.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -1.0F, -2.0F, -0.4326F, 0.2149F, 0.4326F));
		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(176, 76).addBox(-4.0F, -2.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.2F)).texOffs(16, 25).addBox(-4.0F, 8.0F, -2.0F, 8.0F, 3.0F, 4.0F, new CubeDeformation(-0.2F)),
				PartPose.offset(0.0F, 1.0F, 0.0F));
		PartDefinition CrystalGroupB = Body.addOrReplaceChild("CrystalGroupB", CubeListBuilder.create(), PartPose.offset(0.9F, 6.5F, 2.0F));
		PartDefinition CrystalGroupBA = CrystalGroupB.addOrReplaceChild("CrystalGroupBA", CubeListBuilder.create().texOffs(72, 66).addBox(-3.0F, -2.0F, -3.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -7.0F, 1.0F, 0.188F, 0.3442F, -0.8717F));
		PartDefinition CrystalGroupBB = CrystalGroupB.addOrReplaceChild("CrystalGroupBB", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.4608F, 0.4662F, 0.044F));
		PartDefinition Crystal_r3 = CrystalGroupBB.addOrReplaceChild("Crystal_r3", CubeListBuilder.create().texOffs(59, 67).addBox(-1.0F, -5.0F, -1.0F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -1.0F, -0.1309F, 0.0F, -0.6109F));
		PartDefinition CrystalGroupBC = CrystalGroupB.addOrReplaceChild("CrystalGroupBC", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0F, 4.0F, -4.0F, -1.0095F, -0.8673F, 0.8516F));
		PartDefinition Crystal_r4 = CrystalGroupBC.addOrReplaceChild("Crystal_r4", CubeListBuilder.create().texOffs(58, 75).addBox(-1.0F, -3.0F, -1.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -5.0F, 2.0F, -0.4326F, 0.2149F, 0.4326F));
		PartDefinition CrystalGroupC = Body.addOrReplaceChild("CrystalGroupC", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9F, 4.5F, -3.0F, 2.2503F, 1.3037F, 0.5271F));
		PartDefinition Crystal_r5 = CrystalGroupC.addOrReplaceChild("Crystal_r5", CubeListBuilder.create().texOffs(58, 75).addBox(-1.0F, -3.0F, -1.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -1.0F, 0.0F, -0.4326F, 0.2149F, 0.4326F));
		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(176, 96).addBox(-4.0F, -8.9945F, -4.1045F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(184, 112).addBox(-4.0F, -0.9945F, -4.1045F, 8.0F, 5.0F, 0.0F, new CubeDeformation(0.0F))
						.texOffs(176, 117).addBox(-4.0F, -8.9945F, -4.1045F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.4F)).texOffs(176, 133).addBox(-4.0F, -8.9945F, -4.1045F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.6F)),
				PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, -0.1047F, 0.0873F, 0.0F));
		PartDefinition CrystalGroupA = Head.addOrReplaceChild("CrystalGroupA", CubeListBuilder.create(), PartPose.offsetAndRotation(3.9F, -7.5F, -2.0F, 1.0866F, -0.2068F, -0.1701F));
		PartDefinition Crystal_r6 = CrystalGroupA.addOrReplaceChild("Crystal_r6", CubeListBuilder.create().texOffs(72, 66).addBox(-2.0F, -4.0F, -1.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -1.0F, -2.0F, -0.4326F, 0.2149F, 0.4326F));
		return LayerDefinition.create(meshdefinition, 240, 240);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}
