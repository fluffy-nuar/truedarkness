// Made with Blockbench 4.7.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelcorrupted_hand<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "corrupted_hand"), "main");
	private final ModelPart platform;
	private final ModelPart stem2;

	public Modelcorrupted_hand(ModelPart root) {
		this.platform = root.getChild("platform");
		this.stem2 = root.getChild("stem2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition platform = partdefinition.addOrReplaceChild("platform",
				CubeListBuilder.create().texOffs(0, 30)
						.addBox(-8.0F, -10.0F, -8.0F, 16.0F, 10.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(144, 31)
						.addBox(-16.0F, -19.0F, 1.0F, 10.0F, 11.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition chains = platform.addOrReplaceChild("chains",
				CubeListBuilder.create().texOffs(156, 106)
						.addBox(-1.5F, 8.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 104)
						.addBox(-1.5F, 7.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(152, 102)
						.addBox(-0.5F, 6.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 106)
						.addBox(0.5F, 8.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 104)
						.addBox(0.5F, 7.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 100)
						.addBox(-1.5F, 5.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 98)
						.addBox(-1.5F, 4.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 100)
						.addBox(0.5F, 5.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 98)
						.addBox(0.5F, 4.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(152, 96)
						.addBox(-0.5F, 3.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 94)
						.addBox(-1.5F, 2.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 92)
						.addBox(-1.5F, 1.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 94)
						.addBox(0.5F, 2.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 92)
						.addBox(0.5F, 1.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(152, 90)
						.addBox(-0.5F, 0.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 88)
						.addBox(-1.5F, -1.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 86)
						.addBox(-1.5F, -2.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 88)
						.addBox(0.5F, -1.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 86)
						.addBox(0.5F, -2.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(152, 84)
						.addBox(-0.5F, -3.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 82)
						.addBox(-1.5F, -4.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 80)
						.addBox(-1.5F, -5.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 82)
						.addBox(0.5F, -4.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 80)
						.addBox(0.5F, -5.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 106)
						.addBox(-1.5F, 23.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 104)
						.addBox(-1.5F, 22.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(152, 102)
						.addBox(-0.5F, 21.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 106)
						.addBox(0.5F, 23.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 104)
						.addBox(0.5F, 22.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 100)
						.addBox(-1.5F, 20.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 98)
						.addBox(-1.5F, 19.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 100)
						.addBox(0.5F, 20.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 98)
						.addBox(0.5F, 19.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(152, 96)
						.addBox(-0.5F, 18.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 94)
						.addBox(-1.5F, 17.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 92)
						.addBox(-1.5F, 16.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 94)
						.addBox(0.5F, 17.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 92)
						.addBox(0.5F, 16.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(152, 90)
						.addBox(-0.5F, 15.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 88)
						.addBox(-1.5F, 14.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 86)
						.addBox(-1.5F, 13.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 88)
						.addBox(0.5F, 14.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 86)
						.addBox(0.5F, 13.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(152, 84)
						.addBox(-0.5F, 12.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 82)
						.addBox(-1.5F, 11.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 80)
						.addBox(-1.5F, 10.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 82)
						.addBox(0.5F, 11.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 80)
						.addBox(0.5F, 10.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(148, 108)
						.addBox(-0.5F, 24.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(148, 108)
						.addBox(-0.5F, 9.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -24.0F, 24.0F, 0.6981F, 0.0F, 0.0F));

		PartDefinition stem2 = partdefinition.addOrReplaceChild("stem2", CubeListBuilder.create(),
				PartPose.offset(0.0F, 14.0F, 0.0F));

		PartDefinition bone = stem2
				.addOrReplaceChild("bone",
						CubeListBuilder.create().texOffs(52, 44).addBox(-6.0F, -27.0F, -6.0F, 12.0F, 27.0F, 12.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition stem3 = bone.addOrReplaceChild("stem3",
				CubeListBuilder.create().texOffs(0, 56).addBox(-7.0F, -65.0F, -5.0F, 12.0F, 30.0F, 10.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.0F, 25.0F, 1.5708F, -0.9163F, -1.5708F));

		PartDefinition cube_r1 = stem3.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(144, 31).addBox(12.0F, -55.0F, 1.0F, 10.0F, 11.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -25.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition arm = stem3.addOrReplaceChild("arm",
				CubeListBuilder.create().texOffs(1, 1).addBox(-19.0F, -10.0F, -8.0F, 21.0F, 13.0F, 16.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, -64.0F, 0.0F, 0.0F, 0.0F, 1.309F));

		PartDefinition bones = arm.addOrReplaceChild("bones",
				CubeListBuilder.create().texOffs(120, 52).addBox(-20.0F, -10.5F, -9.0F, 16.0F, 0.0F, 21.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0F, 0.0F, 12.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition fingers = arm.addOrReplaceChild("fingers",
				CubeListBuilder.create().texOffs(65, 18)
						.addBox(-16.0F, -8.0F, 9.0F, 8.0F, 8.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 96)
						.addBox(-16.0F, 0.0F, 17.0F, 8.0F, 8.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 0.0F, 9.0F, 0.0F, -0.8727F, 0.0F));

		PartDefinition bone5 = fingers.addOrReplaceChild("bone5",
				CubeListBuilder.create().texOffs(64, 18)
						.addBox(-20.0F, -8.0F, 14.0F, 8.0F, 8.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 96)
						.addBox(-20.0F, 0.0F, 22.0F, 8.0F, 8.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, 0.0F, 13.0F, 0.0F, -1.6144F, 0.0F));

		PartDefinition bone6 = fingers.addOrReplaceChild("bone6",
				CubeListBuilder.create().texOffs(64, 18)
						.addBox(-12.0F, -8.0F, 21.0F, 8.0F, 8.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 96)
						.addBox(-12.0F, 0.0F, 29.0F, 8.0F, 8.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0036F, 0.0F));

		PartDefinition bone8 = bone6.addOrReplaceChild("bone8",
				CubeListBuilder.create().texOffs(64, 18)
						.addBox(-3.0F, -8.0F, 17.0F, 8.0F, 8.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 96)
						.addBox(-3.0F, 0.0F, 25.0F, 8.0F, 8.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-18.0F, 0.0F, 3.0F, 0.0F, 1.4835F, 0.0F));

		PartDefinition bone7 = fingers.addOrReplaceChild("bone7",
				CubeListBuilder.create().texOffs(64, 18)
						.addBox(-4.0F, -8.0F, 22.0F, 8.0F, 8.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 96)
						.addBox(-4.0F, 0.0F, 30.0F, 8.0F, 8.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -2.0F, 0.0F, -0.829F, 0.0F));

		PartDefinition chains4 = arm.addOrReplaceChild("chains4",
				CubeListBuilder.create().texOffs(156, 106)
						.addBox(-1.5F, -82.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 104)
						.addBox(-1.5F, -83.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(152, 102)
						.addBox(-0.5F, -84.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 106)
						.addBox(0.5F, -82.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 104)
						.addBox(0.5F, -83.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 100)
						.addBox(-1.5F, -85.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 98)
						.addBox(-1.5F, -86.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 100)
						.addBox(0.5F, -85.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 98)
						.addBox(0.5F, -86.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(152, 96)
						.addBox(-0.5F, -87.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 94)
						.addBox(-1.5F, -88.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 92)
						.addBox(-1.5F, -89.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 94)
						.addBox(0.5F, -88.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 92)
						.addBox(0.5F, -89.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(152, 90)
						.addBox(-0.5F, -90.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 88)
						.addBox(-1.5F, -91.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 86)
						.addBox(-1.5F, -92.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 88)
						.addBox(0.5F, -91.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 86)
						.addBox(0.5F, -92.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(152, 84)
						.addBox(-0.5F, -93.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 82)
						.addBox(-1.5F, -94.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 80)
						.addBox(-1.5F, -95.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 82)
						.addBox(0.5F, -94.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 80)
						.addBox(0.5F, -95.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 94)
						.addBox(0.5F, -73.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 92)
						.addBox(0.5F, -74.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(152, 90)
						.addBox(-0.5F, -75.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 88)
						.addBox(-1.5F, -76.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 86)
						.addBox(-1.5F, -77.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 86)
						.addBox(0.5F, -77.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(152, 84)
						.addBox(-0.5F, -78.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 82)
						.addBox(-1.5F, -79.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 82)
						.addBox(0.5F, -79.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 80)
						.addBox(0.5F, -80.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(148, 108)
						.addBox(-0.5F, -81.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(55.0F, 68.0F, -22.0F, 0.0F, 0.0F, -0.829F));

		PartDefinition chains2 = bone.addOrReplaceChild("chains2",
				CubeListBuilder.create().texOffs(156, 106)
						.addBox(8.5F, 8.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 104)
						.addBox(8.5F, 7.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(152, 102)
						.addBox(9.5F, 6.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 106)
						.addBox(10.5F, 8.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 104)
						.addBox(10.5F, 7.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 100)
						.addBox(8.5F, 5.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 98)
						.addBox(8.5F, 4.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 100)
						.addBox(10.5F, 5.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 98)
						.addBox(10.5F, 4.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(152, 96)
						.addBox(9.5F, 3.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 94)
						.addBox(8.5F, 2.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 92)
						.addBox(8.5F, 1.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 94)
						.addBox(10.5F, 2.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 92)
						.addBox(10.5F, 1.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(152, 90)
						.addBox(9.5F, 0.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 88)
						.addBox(8.5F, -1.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 86)
						.addBox(8.5F, -2.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 88)
						.addBox(10.5F, -1.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 86)
						.addBox(10.5F, -2.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(152, 84)
						.addBox(9.5F, -3.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 82)
						.addBox(8.5F, -4.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 80)
						.addBox(8.5F, -5.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 82)
						.addBox(10.5F, -4.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 80)
						.addBox(10.5F, -5.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 106)
						.addBox(8.5F, 23.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 104)
						.addBox(8.5F, 22.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 98)
						.addBox(8.5F, 25.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 98)
						.addBox(10.5F, 25.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(152, 102)
						.addBox(9.5F, 27.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 100)
						.addBox(10.5F, 26.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 100)
						.addBox(8.5F, 26.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 104)
						.addBox(10.5F, 28.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 106)
						.addBox(10.5F, 29.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(148, 108)
						.addBox(9.5F, 30.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 106)
						.addBox(8.5F, 29.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 104)
						.addBox(8.5F, 28.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(152, 102)
						.addBox(9.5F, 21.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 106)
						.addBox(10.5F, 23.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 104)
						.addBox(10.5F, 22.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 100)
						.addBox(8.5F, 20.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 98)
						.addBox(8.5F, 19.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 100)
						.addBox(10.5F, 20.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 98)
						.addBox(10.5F, 19.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(152, 96)
						.addBox(9.5F, 18.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 94)
						.addBox(8.5F, 17.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 92)
						.addBox(8.5F, 16.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 94)
						.addBox(10.5F, 17.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 92)
						.addBox(10.5F, 16.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(152, 90)
						.addBox(9.5F, 15.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 88)
						.addBox(8.5F, 14.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 86)
						.addBox(8.5F, 13.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 88)
						.addBox(10.5F, 14.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 86)
						.addBox(10.5F, 13.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(152, 84)
						.addBox(9.5F, 12.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 82)
						.addBox(8.5F, 11.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 80)
						.addBox(8.5F, 10.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 82)
						.addBox(10.5F, 11.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 80)
						.addBox(10.5F, 10.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(148, 108)
						.addBox(9.5F, 24.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(148, 108)
						.addBox(9.5F, 9.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-11.0F, -5.0F, 19.0F, -0.2443F, 0.2094F, 0.4712F));

		PartDefinition chains3 = bone.addOrReplaceChild("chains3",
				CubeListBuilder.create().texOffs(156, 106)
						.addBox(-1.5F, -32.0F, -29.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 104)
						.addBox(-1.5F, -33.0F, -29.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(152, 102)
						.addBox(-0.5F, -34.0F, -29.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 106)
						.addBox(0.5F, -32.0F, -29.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 104)
						.addBox(0.5F, -33.0F, -29.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 100)
						.addBox(-1.5F, -35.0F, -29.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 98)
						.addBox(-1.5F, -36.0F, -29.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 100)
						.addBox(0.5F, -35.0F, -29.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 98)
						.addBox(0.5F, -36.0F, -29.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(152, 96)
						.addBox(-0.5F, -37.0F, -29.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 94)
						.addBox(-1.5F, -38.0F, -29.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 92)
						.addBox(-1.5F, -39.0F, -29.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 94)
						.addBox(0.5F, -38.0F, -29.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 92)
						.addBox(0.5F, -39.0F, -29.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(152, 90)
						.addBox(-0.5F, -40.0F, -29.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 88)
						.addBox(-1.5F, -41.0F, -29.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 86)
						.addBox(-1.5F, -42.0F, -29.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 88)
						.addBox(0.5F, -41.0F, -29.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 86)
						.addBox(0.5F, -42.0F, -29.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(152, 84)
						.addBox(-0.5F, -43.0F, -29.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 82)
						.addBox(-1.5F, -44.0F, -29.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 80)
						.addBox(-1.5F, -45.0F, -29.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 82)
						.addBox(0.5F, -44.0F, -29.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 80)
						.addBox(0.5F, -45.0F, -29.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 106)
						.addBox(-1.5F, -17.0F, -29.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 104)
						.addBox(-1.5F, -18.0F, -29.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(152, 102)
						.addBox(-0.5F, -19.0F, -29.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 106)
						.addBox(0.5F, -17.0F, -29.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 104)
						.addBox(0.5F, -18.0F, -29.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 100)
						.addBox(-1.5F, -20.0F, -29.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 98)
						.addBox(-1.5F, -21.0F, -29.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 100)
						.addBox(0.5F, -20.0F, -29.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 98)
						.addBox(0.5F, -21.0F, -29.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(152, 96)
						.addBox(-0.5F, -22.0F, -29.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 94)
						.addBox(-1.5F, -23.0F, -29.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 92)
						.addBox(-1.5F, -24.0F, -29.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 94)
						.addBox(0.5F, -23.0F, -29.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 92)
						.addBox(0.5F, -24.0F, -29.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(152, 90)
						.addBox(-0.5F, -25.0F, -29.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 88)
						.addBox(-1.5F, -26.0F, -29.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 86)
						.addBox(-1.5F, -27.0F, -29.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 88)
						.addBox(0.5F, -26.0F, -29.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 86)
						.addBox(0.5F, -27.0F, -29.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(152, 84)
						.addBox(-0.5F, -28.0F, -29.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 82)
						.addBox(-1.5F, -29.0F, -29.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 80)
						.addBox(-1.5F, -30.0F, -29.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 82)
						.addBox(0.5F, -29.0F, -29.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 80)
						.addBox(0.5F, -30.0F, -29.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(148, 108)
						.addBox(-0.5F, -16.0F, -29.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(148, 108)
						.addBox(-0.5F, -31.0F, -29.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -17.0F, 27.0F, 0.4363F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		platform.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		stem2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.stem2.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
	}
}