// Made with Blockbench 4.11.0
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelwaste_runner<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "waste_runner"), "main");
	private final ModelPart Body;
	private final ModelPart RightLeg;
	private final ModelPart LeftLeg;
	private final ModelPart Head;
	private final ModelPart RightArm;
	private final ModelPart LeftArm;

	public Modelwaste_runner(ModelPart root) {
		this.Body = root.getChild("Body");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
		this.Head = root.getChild("Head");
		this.RightArm = root.getChild("RightArm");
		this.LeftArm = root.getChild("LeftArm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(192, 16)
						.addBox(-4.0F, 1.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(176, 48)
						.addBox(-4.0F, 1.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -2.0F, 0.3491F, 0.0F, 0.0F));

		PartDefinition CrystalGroupA = Body.addOrReplaceChild("CrystalGroupA", CubeListBuilder.create(),
				PartPose.offsetAndRotation(4.9F, 4.5F, 1.0F, 1.0866F, -0.2068F, -0.1701F));

		PartDefinition Crystal_r1 = CrystalGroupA.addOrReplaceChild("Crystal_r1",
				CubeListBuilder.create().texOffs(72, 66).addBox(-2.0F, -4.0F, -1.0F, 4.0F, 4.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -1.0F, -2.0F, -0.4326F, 0.2149F, 0.4326F));

		PartDefinition CrystalGroupB = Body.addOrReplaceChild("CrystalGroupB",
				CubeListBuilder.create().texOffs(59, 67).addBox(-1.0F, -5.0F, -1.0F, 3.0F, 5.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.9F, 3.5F, 0.0F, -1.0769F, 0.3419F, 0.6555F));

		PartDefinition CrystalGroupC = Body.addOrReplaceChild("CrystalGroupC", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.9F, 8.5F, 1.0F, -0.1788F, -0.2068F, -0.1701F));

		PartDefinition Crystal_r2 = CrystalGroupC.addOrReplaceChild("Crystal_r2",
				CubeListBuilder.create().texOffs(58, 75).addBox(-1.0F, -3.0F, -1.0F, 3.0F, 3.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -1.0F, 0.0F, -0.4326F, 0.2149F, 0.4326F));

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(176, 16)
				.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.0F, 12.0F, 2.0F));

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(176, 16).mirror()
						.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(2.0F, 12.0F, 2.0F));

		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(176, 0)
						.addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(208, 0)
						.addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.0F, 1.0F, -1.0F, 0.0F, 0.0F, -0.2182F));

		PartDefinition ChainHead_r1 = Head.addOrReplaceChild("ChainHead_r1",
				CubeListBuilder.create().texOffs(208, 32).addBox(-5.5F, -24.0F, -2.0F, 0.0F, 9.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 23.0F, -3.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition Hat = Head.addOrReplaceChild("Hat",
				CubeListBuilder.create().texOffs(176, 16)
						.addBox(1.0F, -24.0F, -9.0F, 0.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(176, 32)
						.addBox(-8.0F, -24.0F, -1.0F, 16.0F, 16.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.48F));

		PartDefinition CrystalGroupD = Head.addOrReplaceChild("CrystalGroupD", CubeListBuilder.create(),
				PartPose.offsetAndRotation(2.9F, -3.5F, -4.0F, -0.3708F, 1.0699F, -0.5359F));

		PartDefinition Crystal_r3 = CrystalGroupD.addOrReplaceChild("Crystal_r3",
				CubeListBuilder.create().texOffs(58, 75).addBox(-1.0F, -3.0F, -1.0F, 3.0F, 3.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -1.0F, 0.0F, -0.4326F, 0.2149F, 0.4326F));

		PartDefinition CrystalGroupE = Head.addOrReplaceChild("CrystalGroupE", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.9F, -7.5F, -1.0F, 1.0866F, -0.2068F, -0.1701F));

		PartDefinition Crystal_r4 = CrystalGroupE.addOrReplaceChild("Crystal_r4",
				CubeListBuilder.create().texOffs(72, 66).addBox(-2.0F, -4.0F, -1.0F, 4.0F, 4.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -1.0F, -2.0F, -0.4326F, 0.2149F, 0.4326F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(216, 16)
						.addBox(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(208, 32)
						.addBox(0.0F, 4.0F, 0.0F, 0.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-4.5F, 3.0F, 0.0F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(224, 16).mirror()
						.addBox(-0.5F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(4.0F, 4.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 240, 240);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
	}
}