package exp.fluffynuar.truedarkness.client.model;

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

// Made with Blockbench 4.11.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelcorrupted_necromancer<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("truedarkness", "modelcorrupted_necromancer"), "main");
	public final ModelPart Head;
	public final ModelPart Body;
	public final ModelPart RightArm;
	public final ModelPart LeftArm;
	public final ModelPart RightLeg;
	public final ModelPart LeftLeg;

	public Modelcorrupted_necromancer(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Body = root.getChild("Body");
		this.RightArm = root.getChild("RightArm");
		this.LeftArm = root.getChild("LeftArm");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(52, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(60, 16)
				.addBox(-4.0F, 0.0F, -4.0F, 8.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(52, 19).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(-0.3F)), PartPose.offset(0.0F, 1.0F, 0.0F));
		PartDefinition Cloth = Head.addOrReplaceChild("Cloth", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 12.0F, 8.0F, new CubeDeformation(0.4F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition CrystalGroupB = Head.addOrReplaceChild("CrystalGroupB", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1F, -8.5F, 0.0F, -0.2657F, 0.5207F, 0.1792F));
		PartDefinition CrystalGroupBB = CrystalGroupB.addOrReplaceChild("CrystalGroupBB", CubeListBuilder.create().texOffs(101, 1).addBox(-1.0F, -5.0F, -1.0F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, 0.0F, 0.0F));
		PartDefinition CrystalGroupBA = CrystalGroupB.addOrReplaceChild("CrystalGroupBA", CubeListBuilder.create().texOffs(100, 9).addBox(0.0F, -3.0F, -1.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.111F, -0.1791F, 0.5494F));
		PartDefinition CrystalGroupBC = CrystalGroupB.addOrReplaceChild("CrystalGroupBC", CubeListBuilder.create().texOffs(114, 0).addBox(-2.0F, -4.0F, -1.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, 0.4363F, 0.0F, -0.829F));
		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(52, 35).addBox(-4.0F, -13.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(-0.7F)).texOffs(93, 35).addBox(-4.0F, -13.0F, -2.0F, 8.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 51)
						.addBox(-4.0F, -11.0F, -2.0F, 8.0F, 9.0F, 4.0F, new CubeDeformation(0.2F)).texOffs(55, 56).addBox(-4.0F, -3.0F, -2.0F, 8.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 12.0F, 0.0F));
		PartDefinition RightAddHead = Body.addOrReplaceChild("RightAddHead", CubeListBuilder.create().texOffs(84, 0).addBox(-1.0F, -4.0F, -1.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 0)
				.addBox(-1.5F, -4.5F, -1.5F, 5.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(84, 8).addBox(-1.0F, -4.0F, -1.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(-0.4F)),
				PartPose.offsetAndRotation(-6.0F, -14.0F, -1.0F, 0.0F, 0.0F, -0.4363F));
		PartDefinition RightAdd = RightAddHead.addOrReplaceChild("RightAdd", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 0.0F, 4.0F, 0.0F, 0.0F, 0.4363F));
		PartDefinition RightAddHeadCloth = RightAdd.addOrReplaceChild("RightAddHeadCloth", CubeListBuilder.create().texOffs(70, 65).addBox(0.0F, -3.0F, 0.0F, 3.0F, 12.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 2.3126F, 0.0F));
		PartDefinition RightAddHeadSecond = RightAddHead.addOrReplaceChild("RightAddHeadSecond", CubeListBuilder.create().texOffs(84, 0).addBox(-1.0F, -4.0F, -1.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 0)
				.addBox(-1.5F, -4.5F, -1.5F, 5.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(84, 8).addBox(-1.0F, -4.0F, -1.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-1.0F, 3.0F, 1.0F, 0.0F, 0.0F, -0.4363F));
		PartDefinition RightAddSecond = RightAddHeadSecond.addOrReplaceChild("RightAddSecond", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0F, 1.0F, 4.0F, 0.0F, 0.0F, 0.8727F));
		PartDefinition RightAddHeadClothSecond = RightAddSecond.addOrReplaceChild("RightAddHeadClothSecond", CubeListBuilder.create().texOffs(70, 65).addBox(1.0F, -3.0F, 0.0F, 3.0F, 12.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 0.0F, 0.0F, 0.0F, 2.3126F, 0.0F));
		PartDefinition LeftAddHead = Body.addOrReplaceChild(
				"LeftAddHead", CubeListBuilder.create().texOffs(84, 0).mirror().addBox(-1.0F, -4.0F, -1.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(32, 0).mirror()
						.addBox(-1.5F, -4.5F, -1.5F, 5.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(84, 8).mirror().addBox(-1.0F, -4.0F, -1.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(-0.4F)).mirror(false),
				PartPose.offsetAndRotation(4.0F, -15.0F, -1.0F, 0.0F, 0.0F, 0.4363F));
		PartDefinition LeftAdd = LeftAddHead.addOrReplaceChild("LeftAdd", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 0.0F, 4.0F, 0.0F, 0.0F, -0.4363F));
		PartDefinition LeftAddHeadCloth = LeftAdd.addOrReplaceChild("LeftAddHeadCloth", CubeListBuilder.create().texOffs(58, 65).addBox(0.0F, -3.0F, 0.0F, 3.0F, 12.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 2.3126F, 0.0F));
		PartDefinition LeftAddHeadSecond = LeftAddHead.addOrReplaceChild(
				"LeftAddHeadSecond", CubeListBuilder.create().texOffs(84, 0).mirror().addBox(-1.0F, -4.0F, -1.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(32, 0).mirror()
						.addBox(-1.5F, -4.5F, -1.5F, 5.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(84, 8).mirror().addBox(-1.0F, -4.0F, -1.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(-0.4F)).mirror(false),
				PartPose.offsetAndRotation(1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.4363F));
		PartDefinition LeftAddSecond = LeftAddHeadSecond.addOrReplaceChild("LeftAddSecond", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 0.0F, 4.0F, 0.0F, 0.0F, -0.8727F));
		PartDefinition LeftAddHeadClothSecond = LeftAddSecond.addOrReplaceChild("LeftAddHeadClothSecond", CubeListBuilder.create().texOffs(58, 65).addBox(1.0F, -1.0F, 0.0F, 3.0F, 12.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 2.3126F, 0.0F));
		PartDefinition CrystalGroupD = Body.addOrReplaceChild("CrystalGroupD", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.1F, -5.5F, 0.0F, -0.2657F, 0.5207F, 0.1792F));
		PartDefinition CrystalGroupDB = CrystalGroupD.addOrReplaceChild("CrystalGroupDB", CubeListBuilder.create().texOffs(101, 1).addBox(-1.0F, -5.0F, -1.0F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 0.0F, 0.0F, 0.5775F, -0.7574F, 0.8119F));
		PartDefinition CrystalGroupDA = CrystalGroupD.addOrReplaceChild("CrystalGroupDA", CubeListBuilder.create().texOffs(100, 9).addBox(0.0F, -3.0F, -1.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.94F, -0.1791F, 0.5494F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create(), PartPose.offset(-5.0F, 2.0F, 0.0F));
		PartDefinition Bone = RightArm.addOrReplaceChild("Bone",
				CubeListBuilder.create().texOffs(52, 35).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(-0.5F)).texOffs(76, 35).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(-0.2F)),
				PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, -1.4876F, -0.1643F, 0.8591F));
		PartDefinition CrystalGroupC = Bone.addOrReplaceChild("CrystalGroupC", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.1F, 8.5F, 0.0F, -0.2657F, 0.5207F, 0.1792F));
		PartDefinition CrystalGroupCB = CrystalGroupC.addOrReplaceChild("CrystalGroupCB", CubeListBuilder.create().texOffs(101, 1).addBox(-1.0F, -5.0F, -1.0F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, -1.0F, 0.0F, 0.6208F, 0.7254F, -1.9336F));
		PartDefinition CrystalGroupCA = CrystalGroupC.addOrReplaceChild("CrystalGroupCA", CubeListBuilder.create().texOffs(100, 9).addBox(0.0F, -3.0F, -1.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -3.0F, 0.0F, 1.111F, -0.1791F, 0.5494F));
		PartDefinition Lantern = RightArm.addOrReplaceChild("Lantern", CubeListBuilder.create().texOffs(93, 67).addBox(-2.0F, 3.0F, -2.0F, 6.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(82, 67)
				.addBox(-1.0F, 1.0F, -1.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(95, 62).addBox(1.0F, -1.0F, -0.5F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 3.0F, -10.0F, 0.0436F, 0.0F, 0.0F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(52, 35).mirror().addBox(-2.0F, -1.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(-0.5F)).mirror(false).texOffs(76, 35).mirror()
				.addBox(-2.0F, -1.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offset(5.0F, 2.0F, 0.0F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(47, 51).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, 12.0F, 0.0F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(47, 51).mirror().addBox(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(2.0F, 12.0F, 0.0F));
		PartDefinition CrystalGroupA = LeftLeg.addOrReplaceChild("CrystalGroupA", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.1F, 9.5F, 0.0F, -0.2657F, 0.5207F, 0.1792F));
		PartDefinition CrystalGroupAB = CrystalGroupA.addOrReplaceChild("CrystalGroupAB", CubeListBuilder.create().texOffs(101, 1).addBox(-1.0F, -5.0F, -1.0F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, 0.0F, 0.0F));
		PartDefinition CrystalGroupAA = CrystalGroupA.addOrReplaceChild("CrystalGroupAA", CubeListBuilder.create().texOffs(100, 9).addBox(0.0F, -3.0F, -1.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.111F, -0.1791F, 0.5494F));
		return LayerDefinition.create(meshdefinition, 256, 80);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}
