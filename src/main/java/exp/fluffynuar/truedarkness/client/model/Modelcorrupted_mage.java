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

// Made with Blockbench 4.11.0
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelcorrupted_mage<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("truedarkness", "modelcorrupted_mage"), "main");
	public final ModelPart Head;
	public final ModelPart Body;
	public final ModelPart RightArm;
	public final ModelPart LeftArm;
	public final ModelPart RightLeg;
	public final ModelPart LeftLeg;

	public Modelcorrupted_mage(ModelPart root) {
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
		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 80).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, 0.0F, 0.0F, -0.3054F));
		PartDefinition AnotherHead = Head.addOrReplaceChild("AnotherHead", CubeListBuilder.create().texOffs(32, 80).addBox(-1.0F, -6.0F, -3.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 0.0F, -1.0F, -0.2121F, -0.3843F, 0.5214F));
		PartDefinition CloakHead = Head.addOrReplaceChild("CloakHead",
				CubeListBuilder.create().texOffs(0, 158).addBox(-7.0F, -6.7F, -1.0F, 8.0F, 10.0F, 8.0F, new CubeDeformation(0.7F)).texOffs(0, 176).addBox(-7.0F, -6.7F, -1.0F, 8.0F, 10.0F, 8.0F, new CubeDeformation(1.0F)),
				PartPose.offsetAndRotation(-3.0F, -1.0F, 3.0F, 0.0F, 3.1416F, 0.0F));
		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(48, 131).addBox(-4.0F, 5.0F, -2.0F, 8.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(-0.5F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition CloakBody = Body.addOrReplaceChild("CloakBody",
				CubeListBuilder.create().texOffs(48, 159).addBox(-4.0F, 0.25F, -4.0F, 8.0F, 13.0F, 4.0F, new CubeDeformation(0.2F)).texOffs(48, 142).addBox(-4.0F, 0.25F, -4.0F, 8.0F, 13.0F, 4.0F, new CubeDeformation(0.5F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -2.0F, 0.0F, 3.1416F, 0.0F));
		PartDefinition CrystalGroupG = Body.addOrReplaceChild("CrystalGroupG", CubeListBuilder.create().texOffs(59, 67).addBox(-1.0F, -5.0F, -1.0F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.1F, 8.5F, -1.0F, 0.6553F, -0.3029F, 0.2307F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(18, 17).mirror().addBox(-3.5F, -1.0F, -1.5F, 3.0F, 12.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(32, 159).addBox(-4.0F, -2.0F, -2.0F, 4.0F, 13.0F, 4.0F, new CubeDeformation(0.2F)),
				PartPose.offset(-4.0F, 3.0F, 0.0F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(32, 159).mirror().addBox(0.0F, -1.5F, -2.0F, 4.0F, 13.0F, 4.0F, new CubeDeformation(0.2F)).mirror(false).texOffs(58, 75).addBox(-0.1F, -0.5F, -4.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, 3.0F, 0.0F, 0.0F, -0.2182F, 0.0F));
		PartDefinition LeftArmLantern = LeftArm.addOrReplaceChild("LeftArmLantern", CubeListBuilder.create().texOffs(0, 98).addBox(0.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -1.0F, -1.7453F, 0.0F, 0.0F));
		PartDefinition CrystalGroupA = LeftArmLantern.addOrReplaceChild("CrystalGroupA", CubeListBuilder.create().texOffs(59, 67).addBox(-1.0F, -5.0F, -1.0F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.9F, 8.5F, 0.0F, 1.8954F, 0.4662F, 0.044F));
		PartDefinition Lantern = LeftArmLantern.addOrReplaceChild("Lantern", CubeListBuilder.create().texOffs(123, 163).addBox(-2.0F, 3.0F, -2.0F, 6.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(112, 163)
				.addBox(-1.0F, 1.0F, -1.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(125, 158).addBox(1.0F, -1.0F, -0.5F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 10.0F, 2.0F, 1.7453F, 0.0F, 0.0F));
		PartDefinition CrystalGroupB = Lantern.addOrReplaceChild("CrystalGroupB", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9F, -1.5F, 2.0F, -0.2755F, 0.3728F, 0.2202F));
		PartDefinition Crystal_r1 = CrystalGroupB.addOrReplaceChild("Crystal_r1", CubeListBuilder.create().texOffs(58, 75).addBox(-1.0F, -3.0F, -1.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -1.0F, 0.0F, -0.4326F, 0.2149F, 0.4326F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(18, 17).mirror().addBox(-1.35F, 0.0F, -1.5F, 3.0F, 12.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false).texOffs(16, 97).mirror()
				.addBox(-1.35F, 0.0F, -1.5F, 3.0F, 12.0F, 3.0F, new CubeDeformation(0.1F)).mirror(false), PartPose.offset(-1.9F, 11.5F, 0.0F));
		PartDefinition CrystalGroupF = RightLeg.addOrReplaceChild("CrystalGroupF", CubeListBuilder.create().texOffs(58, 75).addBox(-1.0F, -3.0F, -1.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.2F, 8.0F, 0.0F, -0.6328F, -0.0373F, -0.7661F));
		PartDefinition CrystalGroupE = RightLeg.addOrReplaceChild("CrystalGroupE", CubeListBuilder.create().texOffs(59, 67).addBox(-1.0F, -5.0F, -1.0F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.2F, 6.0F, 0.0F, 0.637F, 0.6356F, -0.191F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(18, 17).addBox(-1.65F, 0.0F, -1.5F, 3.0F, 12.0F, 3.0F, new CubeDeformation(-0.1F)).texOffs(16, 97).addBox(-1.65F, 0.0F, -1.5F, 3.0F, 12.0F, 3.0F, new CubeDeformation(0.1F)),
				PartPose.offset(1.9F, 11.5F, 0.0F));
		PartDefinition CrystalGroupD = LeftLeg.addOrReplaceChild("CrystalGroupD", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 9.0F, 0.0F, -0.2755F, 0.3728F, 0.2202F));
		PartDefinition Crystal_r2 = CrystalGroupD.addOrReplaceChild("Crystal_r2", CubeListBuilder.create().texOffs(58, 75).addBox(-1.0F, -3.0F, -1.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -1.0F, 0.0F, -0.4326F, 0.2149F, 0.4326F));
		PartDefinition CrystalGroupC = LeftLeg.addOrReplaceChild("CrystalGroupC", CubeListBuilder.create().texOffs(59, 67).addBox(-1.0F, -5.0F, -1.0F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 6.0F, 0.0F, -0.4608F, 0.4662F, 0.044F));
		return LayerDefinition.create(meshdefinition, 240, 240);
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
