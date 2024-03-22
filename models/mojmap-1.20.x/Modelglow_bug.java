// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelglow_bug<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "glow_bug"), "main");
	private final ModelPart body;
	private final ModelPart head;
	private final ModelPart legs;

	public Modelglow_bug(ModelPart root) {
		this.body = root.getChild("body");
		this.head = root.getChild("head");
		this.legs = root.getChild("legs");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 10).addBox(
				-3.0F, 0.0F, -5.0F, 6.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 20.0F, 0.0F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(20, 0).addBox(
				-2.0F, -3.0F, -2.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, -5.0F));

		PartDefinition bone = head
				.addOrReplaceChild("bone",
						CubeListBuilder.create().texOffs(-8, 0).addBox(-4.0F, -1.0F, -10.0F, 8.0F, 0.0F, 10.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, -9.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition legs = partdefinition.addOrReplaceChild("legs",
				CubeListBuilder.create().texOffs(16, 10).addBox(-6.0F, -1.0F, -3.0F, 4.0F, 0.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 20.0F, 0.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition legs_r2 = legs.addOrReplaceChild("legs_r2", CubeListBuilder.create().texOffs(0, 18).addBox(1.0F,
				2.0F, -3.0F, 0.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legs.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
	}
}