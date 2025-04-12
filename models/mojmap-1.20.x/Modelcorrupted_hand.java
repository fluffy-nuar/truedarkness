// Made with Blockbench 4.11.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelcorrupted_hand<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "corrupted_hand"), "main");
	private final ModelPart Platform;
	private final ModelPart Hand;

	public Modelcorrupted_hand(ModelPart root) {
		this.Platform = root.getChild("Platform");
		this.Hand = root.getChild("Hand");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Platform = partdefinition.addOrReplaceChild("Platform", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-8.0F, -10.0F, -8.0F, 16.0F, 10.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition chains = Platform.addOrReplaceChild("chains",
				CubeListBuilder.create().texOffs(70, 90)
						.addBox(-1.5F, 8.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(70, 88)
						.addBox(-1.5F, 7.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(66, 86)
						.addBox(-0.5F, 6.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 90)
						.addBox(0.5F, 8.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 88)
						.addBox(0.5F, 7.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(70, 84)
						.addBox(-1.5F, 5.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(70, 82)
						.addBox(-1.5F, 4.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 84)
						.addBox(0.5F, 5.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 82)
						.addBox(0.5F, 4.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(66, 80)
						.addBox(-0.5F, 3.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(70, 78)
						.addBox(-1.5F, 2.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(70, 76)
						.addBox(-1.5F, 1.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 78)
						.addBox(0.5F, 2.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 76)
						.addBox(0.5F, 1.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(66, 74)
						.addBox(-0.5F, 0.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(70, 72)
						.addBox(-1.5F, -1.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(70, 70)
						.addBox(-1.5F, -2.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 72)
						.addBox(0.5F, -1.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 70)
						.addBox(0.5F, -2.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(66, 68)
						.addBox(-0.5F, -3.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(70, 66)
						.addBox(-1.5F, -4.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(70, 64)
						.addBox(-1.5F, -5.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 66)
						.addBox(0.5F, -4.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 64)
						.addBox(0.5F, -5.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(70, 90)
						.addBox(-1.5F, 23.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(70, 88)
						.addBox(-1.5F, 22.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(66, 86)
						.addBox(-0.5F, 21.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 90)
						.addBox(0.5F, 23.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 88)
						.addBox(0.5F, 22.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(70, 84)
						.addBox(-1.5F, 20.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(70, 82)
						.addBox(-1.5F, 19.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 84)
						.addBox(0.5F, 20.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 82)
						.addBox(0.5F, 19.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(66, 80)
						.addBox(-0.5F, 18.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(70, 78)
						.addBox(-1.5F, 17.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(70, 76)
						.addBox(-1.5F, 16.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 78)
						.addBox(0.5F, 17.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 76)
						.addBox(0.5F, 16.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(66, 74)
						.addBox(-0.5F, 15.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(70, 72)
						.addBox(-1.5F, 14.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(70, 70)
						.addBox(-1.5F, 13.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 72)
						.addBox(0.5F, 14.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 70)
						.addBox(0.5F, 13.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(66, 68)
						.addBox(-0.5F, 12.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(70, 66)
						.addBox(-1.5F, 11.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(70, 64)
						.addBox(-1.5F, 10.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 66)
						.addBox(0.5F, 11.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 64)
						.addBox(0.5F, 10.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(62, 92)
						.addBox(-0.5F, 24.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(62, 92)
						.addBox(-0.5F, 9.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -24.0F, 24.0F, 0.6981F, 0.0F, 0.0F));

		PartDefinition Head = Platform.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(224, 39)
						.addBox(-7.0F, -8.0F, -1.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(192, 39)
						.addBox(-7.0F, -8.0F, -1.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.4F)),
				PartPose.offsetAndRotation(10.0F, 0.0F, -7.0F, 0.0F, -0.829F, 0.0F));

		PartDefinition Hand = partdefinition.addOrReplaceChild("Hand", CubeListBuilder.create(),
				PartPose.offset(0.0F, 14.0F, 0.0F));

		PartDefinition LayerFirst = Hand.addOrReplaceChild("LayerFirst",
				CubeListBuilder.create().texOffs(160, 0)
						.addBox(-6.0F, -27.0F, -6.0F, 12.0F, 27.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(208, 0)
						.addBox(-6.0F, -27.0F, -6.0F, 12.0F, 27.0F, 12.0F, new CubeDeformation(0.4F)).texOffs(208, 0)
						.addBox(-6.0F, -26.0F, -6.0F, 12.0F, 27.0F, 12.0F, new CubeDeformation(0.9F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition CrystalGroupB = LayerFirst.addOrReplaceChild("CrystalGroupB", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-7.0F, -23.0F, -2.0F, 0.7025F, 0.2615F, -0.2964F));

		PartDefinition CrystalGroupBA = CrystalGroupB.addOrReplaceChild(
				"CrystalGroupBA", CubeListBuilder.create().texOffs(130, 37).addBox(-2.0F, -3.0F, -2.0F, 3.0F, 3.0F,
						3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0036F));

		PartDefinition CrystalGroupBB = CrystalGroupB.addOrReplaceChild("CrystalGroupBB",
				CubeListBuilder.create().texOffs(131, 29).addBox(0.0F, -5.0F, -2.0F, 3.0F, 5.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, -1.0F, -4.0F, -2.9656F, -0.5161F, 2.9041F));

		PartDefinition CrystalGroupBC = CrystalGroupB.addOrReplaceChild(
				"CrystalGroupBC", CubeListBuilder.create().texOffs(144, 28).addBox(-2.0F, -4.0F, -2.0F, 4.0F, 4.0F,
						4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 6.0F, 1.0F, 0.0F, 0.0F, -0.48F));

		PartDefinition CrystalGroupA = LayerFirst.addOrReplaceChild("CrystalGroupA", CubeListBuilder.create(),
				PartPose.offsetAndRotation(7.0F, 0.0F, -5.0F, 0.7025F, 0.2615F, -0.2964F));

		PartDefinition CrystalGroupAA = CrystalGroupA.addOrReplaceChild(
				"CrystalGroupAA", CubeListBuilder.create().texOffs(130, 37).addBox(-2.0F, -3.0F, -2.0F, 3.0F, 3.0F,
						3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.48F));

		PartDefinition CrystalGroupAB = CrystalGroupA.addOrReplaceChild("CrystalGroupAB",
				CubeListBuilder.create().texOffs(131, 29).addBox(0.0F, -5.0F, -2.0F, 3.0F, 5.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 0.0F, 1.0F, 0.5864F, -0.6248F, 0.7219F));

		PartDefinition CrystalGroupAC = CrystalGroupA.addOrReplaceChild(
				"CrystalGroupAC", CubeListBuilder.create().texOffs(144, 28).addBox(-2.0F, -4.0F, -2.0F, 4.0F, 4.0F,
						4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 0.0F, 2.0F, 0.0F, 0.0F, 1.309F));

		PartDefinition chains2 = LayerFirst.addOrReplaceChild("chains2",
				CubeListBuilder.create().texOffs(70, 90)
						.addBox(8.5F, 8.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(70, 88)
						.addBox(8.5F, 7.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(66, 86)
						.addBox(9.5F, 6.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 90)
						.addBox(10.5F, 8.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 88)
						.addBox(10.5F, 7.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(70, 84)
						.addBox(8.5F, 5.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(70, 82)
						.addBox(8.5F, 4.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 84)
						.addBox(10.5F, 5.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 82)
						.addBox(10.5F, 4.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(66, 80)
						.addBox(9.5F, 3.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(70, 78)
						.addBox(8.5F, 2.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(70, 76)
						.addBox(8.5F, 1.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 78)
						.addBox(10.5F, 2.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 76)
						.addBox(10.5F, 1.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(66, 74)
						.addBox(9.5F, 0.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(70, 72)
						.addBox(8.5F, -1.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(70, 70)
						.addBox(8.5F, -2.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 72)
						.addBox(10.5F, -1.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 70)
						.addBox(10.5F, -2.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(66, 68)
						.addBox(9.5F, -3.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(70, 66)
						.addBox(8.5F, -4.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(70, 64)
						.addBox(8.5F, -5.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 66)
						.addBox(10.5F, -4.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 64)
						.addBox(10.5F, -5.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(70, 90)
						.addBox(8.5F, 23.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(70, 88)
						.addBox(8.5F, 22.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(70, 82)
						.addBox(8.5F, 25.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 82)
						.addBox(10.5F, 25.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(66, 86)
						.addBox(9.5F, 27.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 84)
						.addBox(10.5F, 26.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(70, 84)
						.addBox(8.5F, 26.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 88)
						.addBox(10.5F, 28.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 90)
						.addBox(10.5F, 29.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(62, 92)
						.addBox(9.5F, 30.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(70, 90)
						.addBox(8.5F, 29.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(70, 88)
						.addBox(8.5F, 28.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(66, 86)
						.addBox(9.5F, 21.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 90)
						.addBox(10.5F, 23.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 88)
						.addBox(10.5F, 22.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(70, 84)
						.addBox(8.5F, 20.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(70, 82)
						.addBox(8.5F, 19.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 84)
						.addBox(10.5F, 20.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 82)
						.addBox(10.5F, 19.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(66, 80)
						.addBox(9.5F, 18.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(70, 78)
						.addBox(8.5F, 17.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(70, 76)
						.addBox(8.5F, 16.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 78)
						.addBox(10.5F, 17.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 76)
						.addBox(10.5F, 16.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(66, 74)
						.addBox(9.5F, 15.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(70, 72)
						.addBox(8.5F, 14.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(70, 70)
						.addBox(8.5F, 13.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 72)
						.addBox(10.5F, 14.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 70)
						.addBox(10.5F, 13.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(66, 68)
						.addBox(9.5F, 12.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(70, 66)
						.addBox(8.5F, 11.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(70, 64)
						.addBox(8.5F, 10.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 66)
						.addBox(10.5F, 11.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 64)
						.addBox(10.5F, 10.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(62, 92)
						.addBox(9.5F, 24.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(62, 92)
						.addBox(9.5F, 9.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-11.0F, -5.0F, 19.0F, -0.2443F, 0.2094F, 0.4712F));

		PartDefinition LayerSecond = LayerFirst.addOrReplaceChild("LayerSecond",
				CubeListBuilder.create().texOffs(0, 109)
						.addBox(-7.0F, -65.0F, -5.0F, 12.0F, 30.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 47)
						.addBox(-7.0F, -65.0F, -5.0F, 12.0F, 22.0F, 10.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.0F, 7.0F, 19.0F, 1.5708F, -1.1345F, -1.5708F));

		PartDefinition LayerThird = LayerSecond.addOrReplaceChild("LayerThird",
				CubeListBuilder.create().texOffs(0, 80)
						.addBox(-19.0F, -10.0F, -8.0F, 21.0F, 13.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 26)
						.addBox(-19.0F, -10.0F, -8.0F, 21.0F, 4.0F, 16.0F, new CubeDeformation(0.3F)),
				PartPose.offsetAndRotation(-4.0F, -63.0F, 0.0F, 0.0F, 0.0F, 0.6981F));

		PartDefinition decor = LayerThird.addOrReplaceChild("decor",
				CubeListBuilder.create().texOffs(77, 57).addBox(-20.0F, -10.5F, -9.0F, 16.0F, 0.0F, 21.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0F, 0.0F, 12.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition LayerFourth = LayerThird.addOrReplaceChild("LayerFourth", CubeListBuilder.create(),
				PartPose.offset(-19.0F, -3.0F, 0.0F));

		PartDefinition CrystalGroupD = LayerFourth.addOrReplaceChild("CrystalGroupD", CubeListBuilder.create(),
				PartPose.offsetAndRotation(6.0F, -9.0F, 1.0F, 0.7025F, 0.2615F, -0.2964F));

		PartDefinition CrystalGroupDA = CrystalGroupD.addOrReplaceChild("CrystalGroupDA",
				CubeListBuilder.create().texOffs(130, 37).addBox(-2.0F, -3.0F, -2.0F, 3.0F, 3.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, 4.0F, 1.0F, -0.1309F, 0.0F, 0.2182F));

		PartDefinition CrystalGroupDB = CrystalGroupD.addOrReplaceChild("CrystalGroupDB",
				CubeListBuilder.create().texOffs(131, 29).addBox(0.0F, -5.0F, -2.0F, 3.0F, 5.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, 5.0F, 1.0F, -0.9133F, -0.2968F, 1.046F));

		PartDefinition CrystalGroupDC = CrystalGroupD.addOrReplaceChild("CrystalGroupDC",
				CubeListBuilder.create().texOffs(144, 28).addBox(-2.0F, -4.0F, -2.0F, 4.0F, 4.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 4.0F, 2.0F, -1.2217F, 0.7418F, -1.8326F));

		PartDefinition FingerFirst = LayerFourth.addOrReplaceChild("FingerFirst",
				CubeListBuilder.create().texOffs(101, 25)
						.addBox(-3.0F, -1.0F, -1.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(1.0F)).texOffs(128, 0)
						.addBox(-3.0F, -1.0F, -1.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(1.5F)),
				PartPose.offsetAndRotation(8.0F, 2.0F, 8.0F, 0.5495F, -0.5467F, -0.692F));

		PartDefinition item = FingerFirst.addOrReplaceChild("item",
				CubeListBuilder.create().texOffs(8, 252)
						.addBox(5.0F, -11.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 252)
						.addBox(4.0F, -11.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 250)
						.addBox(3.0F, -12.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 250)
						.addBox(4.0F, -12.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 250)
						.addBox(5.0F, -12.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 248)
						.addBox(2.0F, -13.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 248)
						.addBox(3.0F, -13.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 248)
						.addBox(4.0F, -13.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 246)
						.addBox(-6.0F, -14.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 246)
						.addBox(3.0F, -14.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 246)
						.addBox(2.0F, -14.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 246)
						.addBox(1.0F, -14.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 244)
						.addBox(-7.0F, -15.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 244)
						.addBox(-6.0F, -15.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 244)
						.addBox(-5.0F, -15.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 244)
						.addBox(2.0F, -15.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 244)
						.addBox(1.0F, -15.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 244)
						.addBox(0.0F, -15.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 242)
						.addBox(0.0F, -16.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 242)
						.addBox(1.0F, -16.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 242)
						.addBox(-1.0F, -16.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 242)
						.addBox(-5.0F, -16.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 242)
						.addBox(-6.0F, -16.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 242)
						.addBox(-7.0F, -16.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 240)
						.addBox(0.0F, -17.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 240)
						.addBox(-1.0F, -17.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 240)
						.addBox(-2.0F, -17.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 240)
						.addBox(-5.0F, -17.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 240)
						.addBox(-6.0F, -17.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 240)
						.addBox(-7.0F, -17.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 238)
						.addBox(-7.0F, -18.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 238)
						.addBox(-6.0F, -18.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 238)
						.addBox(-5.0F, -18.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 238)
						.addBox(-3.0F, -18.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 238)
						.addBox(-2.0F, -18.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 238)
						.addBox(-1.0F, -18.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 236)
						.addBox(-7.0F, -19.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 236)
						.addBox(-6.0F, -19.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 236)
						.addBox(-5.0F, -19.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 236)
						.addBox(-4.0F, -19.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 236)
						.addBox(-3.0F, -19.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 236)
						.addBox(-2.0F, -19.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 234)
						.addBox(-3.0F, -20.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 234)
						.addBox(-4.0F, -20.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 234)
						.addBox(-5.0F, -20.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 234)
						.addBox(-6.0F, -20.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 232)
						.addBox(0.0F, -21.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 232)
						.addBox(1.0F, -21.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 232)
						.addBox(-1.0F, -21.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 232)
						.addBox(-2.0F, -21.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 232)
						.addBox(-3.0F, -21.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 232)
						.addBox(-4.0F, -21.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 232)
						.addBox(-5.0F, -21.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 232)
						.addBox(-6.0F, -21.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 230)
						.addBox(-6.0F, -22.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 230)
						.addBox(-5.0F, -22.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 230)
						.addBox(-4.0F, -22.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 230)
						.addBox(-3.0F, -22.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 230)
						.addBox(-2.0F, -22.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 230)
						.addBox(-1.0F, -22.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 230)
						.addBox(2.0F, -22.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 230)
						.addBox(1.0F, -22.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 230)
						.addBox(0.0F, -22.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 228)
						.addBox(-3.0F, -23.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 228)
						.addBox(-2.0F, -23.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 228)
						.addBox(-1.0F, -23.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 228)
						.addBox(1.0F, -23.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 228)
						.addBox(0.0F, -23.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(11.0F, 8.0F, 2.5F, 0.0F, 0.0F, -2.0944F));

		PartDefinition FingerSecond = LayerFourth.addOrReplaceChild("FingerSecond",
				CubeListBuilder.create().texOffs(94, 25)
						.addBox(-3.0F, -1.0F, -1.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(1.0F)).texOffs(144, 0)
						.addBox(-3.0F, -1.0F, -1.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(1.5F)),
				PartPose.offsetAndRotation(14.0F, 2.0F, -11.0F, -0.2805F, 0.5521F, -0.9901F));

		PartDefinition Item2 = FingerSecond.addOrReplaceChild("Item2",
				CubeListBuilder.create().texOffs(0, 222)
						.addBox(7.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 222)
						.addBox(6.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 222)
						.addBox(5.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 220)
						.addBox(7.0F, -2.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 220)
						.addBox(6.0F, -2.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 220)
						.addBox(5.0F, -2.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 218)
						.addBox(4.0F, -3.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 218)
						.addBox(5.0F, -3.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 218)
						.addBox(6.0F, -3.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 218)
						.addBox(7.0F, -3.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 216)
						.addBox(0.0F, -4.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 216)
						.addBox(1.0F, -4.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 216)
						.addBox(3.0F, -4.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 216)
						.addBox(4.0F, -4.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 216)
						.addBox(5.0F, -4.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 214)
						.addBox(-1.0F, -5.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 214)
						.addBox(4.0F, -5.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 214)
						.addBox(3.0F, -5.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 214)
						.addBox(2.0F, -5.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 214)
						.addBox(1.0F, -5.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 214)
						.addBox(0.0F, -5.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 212)
						.addBox(3.0F, -6.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 212)
						.addBox(2.0F, -6.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 212)
						.addBox(1.0F, -6.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 212)
						.addBox(0.0F, -6.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 210)
						.addBox(0.0F, -7.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 210)
						.addBox(1.0F, -7.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 210)
						.addBox(2.0F, -7.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 210)
						.addBox(3.0F, -7.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 210)
						.addBox(4.0F, -7.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 210)
						.addBox(-1.0F, -7.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 208)
						.addBox(0.0F, -8.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 208)
						.addBox(1.0F, -8.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 208)
						.addBox(2.0F, -8.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 208)
						.addBox(3.0F, -8.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 208)
						.addBox(4.0F, -8.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 208)
						.addBox(-1.0F, -8.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 208)
						.addBox(-2.0F, -8.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 206)
						.addBox(-3.0F, -9.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 206)
						.addBox(-2.0F, -9.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 206)
						.addBox(-1.0F, -9.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 206)
						.addBox(3.0F, -9.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 206)
						.addBox(1.0F, -9.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 206)
						.addBox(0.0F, -9.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 204)
						.addBox(-4.0F, -10.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 204)
						.addBox(-3.0F, -10.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 204)
						.addBox(-2.0F, -10.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 204)
						.addBox(-1.0F, -10.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 204)
						.addBox(0.0F, -10.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 202)
						.addBox(-1.0F, -11.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 202)
						.addBox(-2.0F, -11.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 202)
						.addBox(-3.0F, -11.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 202)
						.addBox(-4.0F, -11.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 202)
						.addBox(-5.0F, -11.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 200)
						.addBox(-2.0F, -12.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 200)
						.addBox(-3.0F, -12.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 200)
						.addBox(-4.0F, -12.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 200)
						.addBox(-5.0F, -12.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 200)
						.addBox(-6.0F, -12.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 198)
						.addBox(-7.0F, -13.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 198)
						.addBox(-6.0F, -13.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 198)
						.addBox(-5.0F, -13.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 198)
						.addBox(-4.0F, -13.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 198)
						.addBox(-3.0F, -13.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 196)
						.addBox(-8.0F, -14.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 196)
						.addBox(-7.0F, -14.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 196)
						.addBox(-6.0F, -14.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 196)
						.addBox(-5.0F, -14.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 196)
						.addBox(-4.0F, -14.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 194)
						.addBox(-5.0F, -15.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 194)
						.addBox(-6.0F, -15.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 194)
						.addBox(-7.0F, -15.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 194)
						.addBox(-8.0F, -15.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 192)
						.addBox(-6.0F, -16.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 192)
						.addBox(-7.0F, -16.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 192)
						.addBox(-8.0F, -16.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 14.0F, 1.0F, 0.5199F, -0.0653F, -1.4573F));

		PartDefinition FingerThird = LayerFourth.addOrReplaceChild("FingerThird",
				CubeListBuilder.create().texOffs(94, 25)
						.addBox(-3.0F, -1.0F, -1.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(1.0F)).texOffs(120, 12)
						.addBox(-7.0F, -1.0F, -1.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(1.5F)),
				PartPose.offsetAndRotation(1.0F, 2.0F, -4.0F, -2.5198F, 0.1616F, -1.8683F));

		PartDefinition FingerFourth = FingerThird.addOrReplaceChild("FingerFourth",
				CubeListBuilder.create().texOffs(94, 25)
						.addBox(-3.0F, -12.0F, -1.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(1.0F)).texOffs(144, 0)
						.mirror().addBox(-3.0F, -12.0F, -1.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(1.4F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, 1.5903F, -0.951F, 2.0857F));

		PartDefinition CrystalGroupC = FingerThird.addOrReplaceChild("CrystalGroupC", CubeListBuilder.create(),
				PartPose.offsetAndRotation(5.0F, 3.0F, 1.0F, 0.7025F, 0.2615F, -0.2964F));

		PartDefinition CrystalGroupCA = CrystalGroupC.addOrReplaceChild("CrystalGroupCA",
				CubeListBuilder.create().texOffs(130, 37).addBox(-2.0F, -3.0F, -2.0F, 3.0F, 3.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.3526F, 0.0F, -0.48F));

		PartDefinition CrystalGroupCB = CrystalGroupC.addOrReplaceChild("CrystalGroupCB",
				CubeListBuilder.create().texOffs(131, 29).addBox(0.0F, -5.0F, -2.0F, 3.0F, 5.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 0.0F, 1.0F, 0.9863F, -0.9328F, 0.9567F));

		PartDefinition CrystalGroupCC = CrystalGroupC.addOrReplaceChild("CrystalGroupCC",
				CubeListBuilder.create().texOffs(144, 28).addBox(-2.0F, -4.0F, -2.0F, 4.0F, 4.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 0.0F, 2.0F, -0.4363F, 0.0F, 2.8362F));

		PartDefinition FingerFiveth = LayerFourth.addOrReplaceChild("FingerFiveth",
				CubeListBuilder.create().texOffs(94, 25)
						.addBox(-3.0F, -1.0F, -1.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(1.0F)).texOffs(128, 0)
						.mirror().addBox(-3.0F, -1.0F, -1.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(1.5F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 2.0F, 6.0F, 0.4768F, 0.3081F, 0.2498F));

		PartDefinition item3 = FingerFiveth.addOrReplaceChild("item3",
				CubeListBuilder.create().texOffs(8, 188)
						.addBox(5.0F, -11.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 188)
						.addBox(4.0F, -11.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 186)
						.addBox(3.0F, -12.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 186)
						.addBox(4.0F, -12.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 186)
						.addBox(5.0F, -12.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 184)
						.addBox(2.0F, -13.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 184)
						.addBox(3.0F, -13.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 184)
						.addBox(4.0F, -13.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 182)
						.addBox(3.0F, -14.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 182)
						.addBox(2.0F, -14.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 182)
						.addBox(1.0F, -14.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 180)
						.addBox(2.0F, -15.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 180)
						.addBox(1.0F, -15.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 180)
						.addBox(0.0F, -15.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 178)
						.addBox(0.0F, -16.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 178)
						.addBox(1.0F, -16.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 178)
						.addBox(-1.0F, -16.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 176)
						.addBox(0.0F, -17.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 176)
						.addBox(-1.0F, -17.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 176)
						.addBox(-2.0F, -17.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 174)
						.addBox(-3.0F, -18.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 174)
						.addBox(-2.0F, -18.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 174)
						.addBox(-1.0F, -18.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 172)
						.addBox(-5.0F, -19.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 172)
						.addBox(-4.0F, -19.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 172)
						.addBox(-3.0F, -19.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 172)
						.addBox(-2.0F, -19.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 170)
						.addBox(-3.0F, -20.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 170)
						.addBox(-4.0F, -20.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 170)
						.addBox(-5.0F, -20.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 170)
						.addBox(-6.0F, -20.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 168)
						.addBox(-2.0F, -21.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 168)
						.addBox(-3.0F, -21.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 168)
						.addBox(-4.0F, -21.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 168)
						.addBox(-5.0F, -21.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 168)
						.addBox(-6.0F, -21.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 166)
						.addBox(-6.0F, -22.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 166)
						.addBox(-5.0F, -22.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 166)
						.addBox(-4.0F, -22.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 166)
						.addBox(-3.0F, -22.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 166)
						.addBox(-2.0F, -22.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 166)
						.addBox(-1.0F, -22.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 166)
						.addBox(0.0F, -22.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 164)
						.addBox(-3.0F, -23.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 164)
						.addBox(-2.0F, -23.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 164)
						.addBox(-1.0F, -23.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 164)
						.addBox(1.0F, -23.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 164)
						.addBox(0.0F, -23.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 162)
						.addBox(0.0F, -24.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 162)
						.addBox(-1.0F, -24.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 162)
						.addBox(-2.0F, -24.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(11.0F, 20.0F, 1.5F, 0.0F, 0.0F, -0.829F));

		PartDefinition chains4 = LayerThird.addOrReplaceChild("chains4",
				CubeListBuilder.create().texOffs(70, 90)
						.addBox(-1.5F, -82.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(70, 88)
						.addBox(-1.5F, -83.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(66, 86)
						.addBox(-0.5F, -84.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 90)
						.addBox(0.5F, -82.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 88)
						.addBox(0.5F, -83.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(70, 84)
						.addBox(-1.5F, -85.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(70, 82)
						.addBox(-1.5F, -86.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 84)
						.addBox(0.5F, -85.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 82)
						.addBox(0.5F, -86.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(66, 80)
						.addBox(-0.5F, -87.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(70, 78)
						.addBox(-1.5F, -88.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(70, 76)
						.addBox(-1.5F, -89.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 78)
						.addBox(0.5F, -88.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 76)
						.addBox(0.5F, -89.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(66, 74)
						.addBox(-0.5F, -90.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(70, 72)
						.addBox(-1.5F, -91.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(70, 70)
						.addBox(-1.5F, -92.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 72)
						.addBox(0.5F, -91.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 70)
						.addBox(0.5F, -92.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(66, 68)
						.addBox(-0.5F, -93.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(70, 66)
						.addBox(-1.5F, -94.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(70, 64)
						.addBox(-1.5F, -95.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 66)
						.addBox(0.5F, -94.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 64)
						.addBox(0.5F, -95.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 78)
						.addBox(0.5F, -73.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 76)
						.addBox(0.5F, -74.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(66, 74)
						.addBox(-0.5F, -75.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(70, 72)
						.addBox(-1.5F, -76.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(70, 70)
						.addBox(-1.5F, -77.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 70)
						.addBox(0.5F, -77.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(66, 68)
						.addBox(-0.5F, -78.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(70, 66)
						.addBox(-1.5F, -79.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 66)
						.addBox(0.5F, -79.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 64)
						.addBox(0.5F, -80.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(62, 92)
						.addBox(-0.5F, -81.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(59.0F, 66.0F, -12.0F, 0.0F, 0.0F, -0.829F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Platform.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Hand.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.Hand.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
	}
}