package exp.fluffynuar.truedarkness.client.model;

import net.minecraft.world.entity.Entity;
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
public class Modelhex<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("truedarkness", "modelhex"), "main");
	public final ModelPart Head;
	public final ModelPart BigCrystal;
	public final ModelPart BodyFirst;
	public final ModelPart CrystalGroupB;
	public final ModelPart BodySecond;
	public final ModelPart CrystalGroupA;

	public Modelhex(ModelPart root) {
		this.Head = root.getChild("Head");
		this.BigCrystal = root.getChild("BigCrystal");
		this.BodyFirst = root.getChild("BodyFirst");
		this.CrystalGroupB = root.getChild("CrystalGroupB");
		this.BodySecond = root.getChild("BodySecond");
		this.CrystalGroupA = root.getChild("CrystalGroupA");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(32, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.5F)),
				PartPose.offset(0.0F, 7.0F, 0.0F));
		PartDefinition BigCrystal = partdefinition.addOrReplaceChild("BigCrystal", CubeListBuilder.create().texOffs(0, 34).addBox(-7.0F, -7.0F, 0.0F, 7.0F, 7.0F, 7.0F, new CubeDeformation(-0.6F)),
				PartPose.offsetAndRotation(0.0F, 18.0F, -1.0F, 0.9419F, 0.3059F, 0.6106F));
		PartDefinition BodyFirst = partdefinition.addOrReplaceChild("BodyFirst",
				CubeListBuilder.create().texOffs(12, 24).addBox(5.0F, -5.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(12, 24).addBox(-8.0F, -5.0F, -4.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(12, 24)
						.addBox(-1.0F, -3.0F, -9.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(12, 24).addBox(-1.0F, -1.0F, 5.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 10.0F, 0.0F));
		PartDefinition CrystalGroupB = partdefinition.addOrReplaceChild("CrystalGroupB", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition CrystalGroupBA = CrystalGroupB.addOrReplaceChild("CrystalGroupBA", CubeListBuilder.create().texOffs(0, 24).addBox(-2.0F, -3.0F, 1.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -3.0F, -10.0F, -0.3123F, -0.1586F, -0.4549F));
		PartDefinition CrystalGroupBB = CrystalGroupB.addOrReplaceChild("CrystalGroupBB", CubeListBuilder.create().texOffs(0, 16).addBox(-2.0F, -2.0F, -1.0F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.0F, 3.0F, -0.3762F, 0.1153F, 0.2835F));
		PartDefinition CrystalGroupBC = CrystalGroupB.addOrReplaceChild("CrystalGroupBC", CubeListBuilder.create().texOffs(12, 16).addBox(-6.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -4.0F, -3.0F, 0.3054F, 0.0F, -0.2618F));
		PartDefinition CrystalGroupBD = CrystalGroupB.addOrReplaceChild("CrystalGroupBD", CubeListBuilder.create().texOffs(0, 24).addBox(-2.0F, -3.0F, -1.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, -3.0F, -2.0F, -0.3123F, -0.1586F, -0.4549F));
		PartDefinition BodySecond = partdefinition.addOrReplaceChild("BodySecond",
				CubeListBuilder.create().texOffs(12, 24).addBox(3.0F, -4.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(12, 24).addBox(-6.0F, -4.0F, -4.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(12, 24)
						.addBox(-1.0F, -3.0F, -7.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(12, 24).addBox(-2.0F, -1.0F, 2.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 21.0F, 0.0F));
		PartDefinition CrystalGroupA = partdefinition.addOrReplaceChild("CrystalGroupA", CubeListBuilder.create(), PartPose.offset(0.0F, 13.0F, 0.0F));
		PartDefinition CrystalGroupAA = CrystalGroupA.addOrReplaceChild("CrystalGroupAA", CubeListBuilder.create().texOffs(0, 24).addBox(-2.0F, -3.0F, 1.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 0.0F, 3.0F, -0.3123F, -0.1586F, -0.4549F));
		PartDefinition CrystalGroupAB = CrystalGroupA.addOrReplaceChild("CrystalGroupAB", CubeListBuilder.create().texOffs(0, 16).addBox(-2.0F, -2.0F, -1.0F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0F, -4.0F, 0.0F, -0.3762F, 0.1153F, 0.2835F));
		PartDefinition CrystalGroupAC = CrystalGroupA.addOrReplaceChild("CrystalGroupAC", CubeListBuilder.create().texOffs(12, 16).addBox(-6.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, -5.0F, -3.0F, 0.3054F, 0.0F, -0.2618F));
		PartDefinition CrystalGroupAD = CrystalGroupA.addOrReplaceChild("CrystalGroupAD", CubeListBuilder.create().texOffs(0, 24).addBox(-2.0F, -3.0F, -1.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.0F, -3.0F, -2.0F, -0.3123F, -0.1586F, -0.4549F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		BigCrystal.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		BodyFirst.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		CrystalGroupB.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		BodySecond.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		CrystalGroupA.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.BodyFirst.yRot = ageInTicks / 20.f;
		this.BodySecond.yRot = ageInTicks / 20.f;
		this.CrystalGroupA.yRot = ageInTicks / 20.f;
		this.CrystalGroupB.yRot = ageInTicks / 20.f;
	}
}
