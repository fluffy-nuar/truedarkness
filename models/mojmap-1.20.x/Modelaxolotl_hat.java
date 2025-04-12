// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelaxolotl_hat<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "axolotl_hat"), "main");
	private final ModelPart Head;

	public Modelaxolotl_hat(ModelPart root) {
		this.Head = root.getChild("Head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(32, 48).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F,
						new CubeDeformation(0.75F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1047F, 0.0873F, 0.0F));

		PartDefinition root = Head.addOrReplaceChild("root", CubeListBuilder.create(),
				PartPose.offset(0.0F, 26.0F, 0.0F));

		PartDefinition body = root.addOrReplaceChild("body", CubeListBuilder.create(),
				PartPose.offset(0.0F, -7.0F, 4.0F));

		PartDefinition body_r1 = body.addOrReplaceChild("body_r1", CubeListBuilder.create().texOffs(2, 17)
				.addBox(-0.3486F, -34.741F, -11.156F, 0.0F, 5.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 11)
				.addBox(-4.3486F, -32.741F, -12.156F, 8.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.0F, -4.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition right_leg = body.addOrReplaceChild("right_leg",
				CubeListBuilder.create().texOffs(2, 13).addBox(-1.7226F, 0.3486F, -28.2467F, 3.0F, 5.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, 2.0F, 0.0F, 0.0F, 1.5708F, 1.5708F));

		PartDefinition left_leg = body.addOrReplaceChild("left_leg", CubeListBuilder.create(),
				PartPose.offsetAndRotation(4.0F, 2.0F, 0.0F, 0.0F, -1.5708F, -1.5708F));

		PartDefinition left_leg_r1 = left_leg.addOrReplaceChild("left_leg_r1",
				CubeListBuilder.create().texOffs(2, 13).addBox(2.7226F, -11.2822F, -21.3293F, 3.0F, 5.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, 1.0F, -4.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition tail = body.addOrReplaceChild("tail",
				CubeListBuilder.create().texOffs(2, 19).addBox(-1.3627F, -29.6425F, 2.0809F, 0.0F, 5.0F, 12.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0F, -2.0F, -8.0F, -0.3491F, -0.5236F, 0.0F));

		PartDefinition head2 = body.addOrReplaceChild("head2",
				CubeListBuilder.create().texOffs(0, 1).addBox(-4.2872F, -34.9101F, -4.2292F, 8.0F, 5.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, 1.0F, 2.0F, 0.3463F, 0.0447F, -0.1231F));

		PartDefinition left_gills = head2.addOrReplaceChild("left_gills", CubeListBuilder.create().texOffs(11, 40)
				.addBox(-0.2872F, -36.9101F, 0.7708F, 3.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(4.0F, 0.0F, -1.0F));

		PartDefinition right_gills = head2.addOrReplaceChild("right_gills", CubeListBuilder.create().texOffs(0, 40)
				.addBox(-3.2872F, -36.9101F, 0.7708F, 3.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-4.0F, 0.0F, -1.0F));

		PartDefinition top_gills = head2.addOrReplaceChild("top_gills", CubeListBuilder.create().texOffs(3, 37)
				.addBox(-4.2872F, -34.9101F, 0.7708F, 8.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -3.0F, -1.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
	}
}