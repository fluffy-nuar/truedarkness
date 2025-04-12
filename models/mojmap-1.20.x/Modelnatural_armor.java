// Made with Blockbench 4.10.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelnatural_armor<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "natural_armor"), "main");
	private final ModelPart Head;
	private final ModelPart Bone;
	private final ModelPart EarRight;
	private final ModelPart LeftRight;
	private final ModelPart Body;
	private final ModelPart RightArm;
	private final ModelPart Fang2;
	private final ModelPart LeftArm;
	private final ModelPart Fang;
	private final ModelPart RightLeg;
	private final ModelPart LeftLeg;

	public Modelnatural_armor(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Bone = root.getChild("Bone");
		this.EarRight = root.getChild("EarRight");
		this.LeftRight = root.getChild("LeftRight");
		this.Body = root.getChild("Body");
		this.RightArm = root.getChild("RightArm");
		this.Fang2 = root.getChild("Fang2");
		this.LeftArm = root.getChild("LeftArm");
		this.Fang = root.getChild("Fang");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Bone = Head.addOrReplaceChild("Bone", CubeListBuilder.create(),
				PartPose.offset(0.0F, -5.0F, -2.5F));

		PartDefinition EarRight = Bone.addOrReplaceChild("EarRight",
				CubeListBuilder.create().texOffs(33, 1)
						.addBox(5.0F, -6.0F, -0.5F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 10)
						.addBox(5.0F, 1.0F, -0.5F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition LeftRight = Bone.addOrReplaceChild("LeftRight",
				CubeListBuilder.create().texOffs(44, 1)
						.addBox(5.0F, -6.0F, -0.5F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 10)
						.addBox(5.0F, 1.0F, -0.5F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.3562F, 0.0F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(44, 28).addBox(
				-2.0F, 0.0F, -2.0F, 6.0F, 8.0F, 4.0F, new CubeDeformation(0.4F)), PartPose.offset(0.0F, 1.0F, 0.0F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create(),
				PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition Fang2 = RightArm.addOrReplaceChild("Fang2", CubeListBuilder.create().texOffs(1, 1).mirror()
				.addBox(-2.25F, 9.0F, -2.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.3F)).mirror(false).texOffs(1, 1)
				.mirror().addBox(-2.25F, 9.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.3F)).mirror(false)
				.texOffs(2, 4).addBox(-3.25F, 7.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.3F)).texOffs(2, 4)
				.addBox(-3.25F, 7.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.3F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create(),
				PartPose.offset(5.0F, 2.0F, 0.0F));

		PartDefinition Fang = LeftArm.addOrReplaceChild("Fang",
				CubeListBuilder.create().texOffs(1, 1)
						.addBox(0.25F, 9.0F, -2.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.3F)).texOffs(1, 1)
						.addBox(0.25F, 9.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.3F)).texOffs(2, 4)
						.addBox(2.25F, 7.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.3F)).texOffs(2, 4)
						.addBox(2.25F, 7.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.3F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(17, 32)
						.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.3F)).texOffs(0, 32)
						.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.5F)),
				PartPose.offset(-1.9F, 12.0F, 0.0F));

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(17, 32).mirror()
						.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.3F)).mirror(false)
						.texOffs(0, 32).mirror()
						.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.5F)).mirror(false),
				PartPose.offset(1.9F, 12.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.Bone.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Bone.xRot = headPitch / (180F / (float) Math.PI);
	}
}