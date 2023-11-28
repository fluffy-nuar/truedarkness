// Made with Blockbench 4.3.1
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelflow<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "flow"), "main");
	private final ModelPart stem;

	public Modelflow(ModelPart root) {
		this.stem = root.getChild("stem");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition stem = partdefinition.addOrReplaceChild("stem",
				CubeListBuilder.create().texOffs(0, 34)
						.addBox(-3.0F, -2.0F, -3.0F, 6.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(28, 51)
						.addBox(-6.0F, -13.0F, 0.0F, 13.0F, 13.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition head = stem.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(0.0F, -9.0F, 0.0F, 1.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(0.0F, -3.0F, -6.0F, 1.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(0.0F, -3.0F, 0.0F, 1.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(0.0F, -9.0F, -6.0F, 1.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.0F, -20.0F, 0.0F));

		PartDefinition flow = head.addOrReplaceChild("flow", CubeListBuilder.create().texOffs(14, 0).addBox(-1.0F,
				-6.0F, -3.0F, 2.0F, 6.0F, 6.0F, new CubeDeformation(0.25F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition a2 = head.addOrReplaceChild("a2", CubeListBuilder.create().texOffs(0, 0).addBox(1.0F, -6.0F,
				2.0F, 1.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition a3 = head
				.addOrReplaceChild("a3",
						CubeListBuilder.create().texOffs(0, 0).addBox(1.0F, -6.0F, 2.0F, 1.0F, 6.0F, 6.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, -3.0F, 3.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition a = head
				.addOrReplaceChild("a",
						CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -6.0F, 2.0F, 1.0F, 6.0F, 6.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition a4 = head
				.addOrReplaceChild("a4",
						CubeListBuilder.create().texOffs(0, 0).addBox(1.0F, -6.0F, -8.0F, 1.0F, 6.0F, 6.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, -3.0F, 3.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition mouth_uo = head.addOrReplaceChild("mouth_uo", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = mouth_uo
				.addOrReplaceChild("cube_r1",
						CubeListBuilder.create().texOffs(34, -1).addBox(3.0F, -5.0F, -3.0F, 0.0F, 3.0F, 6.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2182F));

		PartDefinition mouth_down = head.addOrReplaceChild("mouth_down", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r2 = mouth_down
				.addOrReplaceChild("cube_r2",
						CubeListBuilder.create().texOffs(34, 3).addBox(2.0F, -2.0F, -3.0F, 0.0F, 3.0F, 6.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3054F));

		PartDefinition bone1 = stem
				.addOrReplaceChild("bone1",
						CubeListBuilder.create().texOffs(28, 51).addBox(-6.0F, -13.0F, 0.0F, 13.0F, 13.0F, 0.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition stem2 = stem
				.addOrReplaceChild("stem2",
						CubeListBuilder.create().texOffs(19, 51).addBox(-3.0F, -22.0F, -1.0F, 2.0F, 11.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(-4.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.3054F));

		PartDefinition stem1 = stem
				.addOrReplaceChild("stem1",
						CubeListBuilder.create().texOffs(0, 51).addBox(-2.0F, -11.0F, -2.0F, 4.0F, 9.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3054F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		stem.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.stem.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
	}
}