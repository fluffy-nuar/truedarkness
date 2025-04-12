// Made with Blockbench 4.11.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelunformed_corrupted_remnant<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "unformed_corrupted_remnant"), "main");
	private final ModelPart Head;
	private final ModelPart Mouth;
	private final ModelPart Body;
	private final ModelPart RightArm;
	private final ModelPart LeftArm;
	private final ModelPart LeftLeg;
	private final ModelPart RightLeg;

	public Modelunformed_corrupted_remnant(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Mouth = root.getChild("Mouth");
		this.Body = root.getChild("Body");
		this.RightArm = root.getChild("RightArm");
		this.LeftArm = root.getChild("LeftArm");
		this.LeftLeg = root.getChild("LeftLeg");
		this.RightLeg = root.getChild("RightLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(160, 16).addBox(
				-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.4F)), PartPose.offset(0.0F, 9.0F, -2.0F));

		PartDefinition Crystals = Head.addOrReplaceChild("Crystals", CubeListBuilder.create(),
				PartPose.offset(2.0F, -7.0F, -3.0F));

		PartDefinition CrystalsA = Crystals.addOrReplaceChild("CrystalsA",
				CubeListBuilder.create().texOffs(100, 9).addBox(-2.0F, -3.0F, -1.0F, 3.0F, 3.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.4295F, -0.3093F, 0.5865F));

		PartDefinition CrystalsB = Crystals.addOrReplaceChild("CrystalsB",
				CubeListBuilder.create().texOffs(101, 1).addBox(-2.0F, -5.0F, -1.0F, 3.0F, 5.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 0.0F, 0.0F, 0.3054F, 0.0F, -0.2618F));

		PartDefinition CrystalsC = Crystals.addOrReplaceChild("CrystalsC",
				CubeListBuilder.create().texOffs(114, 0).addBox(-3.0F, -4.0F, -1.0F, 4.0F, 4.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, 4.0F, 0.0F, 0.5742F, 0.2213F, -0.3271F));

		PartDefinition CrystalsD = Crystals.addOrReplaceChild("CrystalsD",
				CubeListBuilder.create().texOffs(101, 1).addBox(-2.0F, -5.0F, -1.0F, 3.0F, 5.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, 0.0F, 5.0F, -0.5236F, 0.0F, -0.2618F));

		PartDefinition CrystalsE = Crystals.addOrReplaceChild("CrystalsE",
				CubeListBuilder.create().texOffs(114, 0).addBox(-3.0F, -4.0F, -1.0F, 4.0F, 4.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 0.0F, 4.0F, 0.5661F, 0.5033F, 1.0047F));

		PartDefinition Mouth = partdefinition.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(160, 0)
				.addBox(-4.0F, -12.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 13.0F, -2.0F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(55, 56).addBox(
				-4.0F, -4.5F, 1.0F, 8.0F, 3.0F, 4.0F, new CubeDeformation(-0.7F)), PartPose.offset(0.0F, 19.0F, -3.0F));

		PartDefinition Bone = Body
				.addOrReplaceChild("Bone",
						CubeListBuilder.create().texOffs(93, 35).addBox(-4.0F, -12.0F, -1.0F, 8.0F, 12.0F, 4.0F,
								new CubeDeformation(-0.8F)),
						PartPose.offsetAndRotation(0.0F, 1.0F, 3.0F, 0.3054F, 0.0F, 0.0F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create(),
				PartPose.offset(-4.0F, 11.0F, -2.0F));

		PartDefinition SmallBone = RightArm.addOrReplaceChild("SmallBone",
				CubeListBuilder.create().texOffs(29, 51).mirror()
						.addBox(-1.0F, -2.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, -1.0F, -1.3963F, 0.0F, 0.0F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create(),
				PartPose.offset(4.0F, 11.0F, -3.0F));

		PartDefinition AnotherSmallBone = LeftArm.addOrReplaceChild("AnotherSmallBone",
				CubeListBuilder.create().texOffs(29, 51).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 8.0F, 2.0F,
						new CubeDeformation(-0.25F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -1.0F, -1.3963F, 0.0F, 0.0F));

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(29, 62)
				.addBox(-1.5F, -1.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(-0.25F)),
				PartPose.offset(2.0F, 17.0F, 0.0F));

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(29, 62).mirror()
						.addBox(-0.5F, -1.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false),
				PartPose.offset(-2.0F, 17.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 256, 80);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Mouth.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.Head.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.Mouth.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Mouth.xRot = headPitch / (180F / (float) Math.PI);
	}
}