// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelgloomer<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "gloomer"), "main");
	private final ModelPart Head;
	private final ModelPart Body;
	private final ModelPart RightArm;
	private final ModelPart LeftArm;
	private final ModelPart RightLeg;
	private final ModelPart LeftLeg;

	public Modelgloomer(ModelPart root) {
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

		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(0, 16)
						.addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(16, 16)
						.addBox(-8.0F, -7.0F, -8.0F, 16.0F, 1.0F, 16.0F, new CubeDeformation(0.5F)).texOffs(24, 34)
						.addBox(-6.0F, -9.0F, -6.0F, 12.0F, 2.0F, 12.0F, new CubeDeformation(0.5F)).texOffs(33, 51)
						.addBox(-7.0F, -17.0F, 0.0F, 15.0F, 13.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(32, 35)
						.addBox(0.0F, -17.0F, -8.0F, 0.0F, 13.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(65, 16)
						.addBox(-3.0F, -3.0F, -4.0F, 6.0F, 14.0F, 0.0F, new CubeDeformation(0.2F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(46, 5)
						.addBox(-3.0F, 0.0F, -2.0F, 6.0F, 8.0F, 3.0F, new CubeDeformation(0.5F)).texOffs(0, 48)
						.addBox(-4.0F, 1.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 80)
						.addBox(-4.0F, 1.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.2F)),
				PartPose.offset(0.0F, -1.0F, 0.0F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(0, 64)
				.addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition bone2 = RightArm.addOrReplaceChild("bone2",
				CubeListBuilder.create().texOffs(16, 64).addBox(-2.0F, -1.0F, 2.0F, 4.0F, 5.0F, 7.0F,
						new CubeDeformation(0.75F)),
				PartPose.offsetAndRotation(-2.0F, -4.0F, 0.0F, 0.0F, -1.5708F, -1.309F));

		PartDefinition item = RightArm.addOrReplaceChild("item", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-2.0F, 14.0F, 2.0F, 1.1781F, 0.0F, 0.0F));

		PartDefinition item2 = item.addOrReplaceChild("item2", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 15.0F));

		PartDefinition bone3 = item2.addOrReplaceChild("bone3",
				CubeListBuilder.create().texOffs(0, 126)
						.addBox(0.5F, -1.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 126)
						.addBox(0.5F, -1.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 126)
						.addBox(0.5F, -1.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 126)
						.addBox(0.5F, -1.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 124)
						.addBox(0.5F, -2.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 124)
						.addBox(0.5F, -2.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 124)
						.addBox(0.5F, -2.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 124)
						.addBox(0.5F, -2.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 122)
						.addBox(0.5F, -3.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 122)
						.addBox(0.5F, -3.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 122)
						.addBox(0.5F, -3.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 122)
						.addBox(0.5F, -3.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 120)
						.addBox(0.5F, -4.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 120)
						.addBox(0.5F, -4.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 120)
						.addBox(0.5F, -4.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 120)
						.addBox(0.5F, -4.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, -8.0F));

		PartDefinition bone4 = bone3.addOrReplaceChild("bone4",
				CubeListBuilder.create().texOffs(0, 126)
						.addBox(0.5F, -1.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 126)
						.addBox(0.5F, -1.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 126)
						.addBox(0.5F, -1.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 126)
						.addBox(0.5F, -1.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 124)
						.addBox(0.5F, -2.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 124)
						.addBox(0.5F, -2.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 124)
						.addBox(0.5F, -2.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 124)
						.addBox(0.5F, -2.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 122)
						.addBox(0.5F, -3.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 122)
						.addBox(0.5F, -3.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 122)
						.addBox(0.5F, -3.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 122)
						.addBox(0.5F, -3.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 120)
						.addBox(0.5F, -4.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 120)
						.addBox(0.5F, -4.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 120)
						.addBox(0.5F, -4.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 120)
						.addBox(0.5F, -4.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone5 = item2.addOrReplaceChild("bone5",
				CubeListBuilder.create().texOffs(16, 126)
						.addBox(0.5F, -1.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 126)
						.addBox(0.5F, -1.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 126)
						.addBox(0.5F, -1.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 126)
						.addBox(0.5F, -1.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 124)
						.addBox(0.5F, -2.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 124)
						.addBox(0.5F, -2.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 124)
						.addBox(0.5F, -2.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 124)
						.addBox(0.5F, -2.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 122)
						.addBox(0.5F, -3.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 122)
						.addBox(0.5F, -3.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 122)
						.addBox(0.5F, -3.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 122)
						.addBox(0.5F, -3.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 120)
						.addBox(0.5F, -4.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 120)
						.addBox(0.5F, -4.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 120)
						.addBox(0.5F, -4.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 120)
						.addBox(0.5F, -4.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, -12.0F));

		PartDefinition bone6 = item2.addOrReplaceChild("bone6",
				CubeListBuilder.create().texOffs(32, 126)
						.addBox(0.5F, -1.8132F, -3.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 126)
						.addBox(0.5F, -1.8132F, -4.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 126)
						.addBox(0.5F, -1.8132F, -5.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 126)
						.addBox(0.5F, -1.8132F, -6.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 124)
						.addBox(0.5F, -2.8132F, -3.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 124)
						.addBox(0.5F, -2.8132F, -4.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 124)
						.addBox(0.5F, -2.8132F, -5.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 124)
						.addBox(0.5F, -2.8132F, -6.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 122)
						.addBox(0.5F, -3.8132F, -3.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 122)
						.addBox(0.5F, -3.8132F, -4.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 122)
						.addBox(0.5F, -3.8132F, -5.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 122)
						.addBox(0.5F, -3.8132F, -6.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 120)
						.addBox(0.5F, -4.8132F, -3.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 120)
						.addBox(0.5F, -4.8132F, -4.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 120)
						.addBox(0.5F, -4.8132F, -5.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 120)
						.addBox(0.5F, -4.8132F, -6.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, -12.0F));

		PartDefinition bone7 = item2.addOrReplaceChild("bone7",
				CubeListBuilder.create().texOffs(48, 126)
						.addBox(0.5F, -1.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 126)
						.addBox(0.5F, -1.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 126)
						.addBox(0.5F, -1.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 126)
						.addBox(0.5F, -1.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 124)
						.addBox(0.5F, -2.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 124)
						.addBox(0.5F, -2.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 124)
						.addBox(0.5F, -2.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 124)
						.addBox(0.5F, -2.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 122)
						.addBox(0.5F, -3.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 122)
						.addBox(0.5F, -3.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 122)
						.addBox(0.5F, -3.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 122)
						.addBox(0.5F, -3.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 120)
						.addBox(0.5F, -4.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 120)
						.addBox(0.5F, -4.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 120)
						.addBox(0.5F, -4.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 120)
						.addBox(0.5F, -4.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, -12.0F));

		PartDefinition bone8 = item2.addOrReplaceChild("bone8",
				CubeListBuilder.create().texOffs(0, 118)
						.addBox(0.5F, -5.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 118)
						.addBox(0.5F, -5.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 118)
						.addBox(0.5F, -5.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 118)
						.addBox(0.5F, -5.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 116)
						.addBox(0.5F, -6.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 116)
						.addBox(0.5F, -6.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 116)
						.addBox(0.5F, -6.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 116)
						.addBox(0.5F, -6.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 114)
						.addBox(0.5F, -7.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 114)
						.addBox(0.5F, -7.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 114)
						.addBox(0.5F, -7.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 114)
						.addBox(0.5F, -7.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 112)
						.addBox(0.5F, -8.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 112)
						.addBox(0.5F, -8.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 112)
						.addBox(0.5F, -8.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 112)
						.addBox(0.5F, -8.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, -8.0F));

		PartDefinition bone9 = bone8.addOrReplaceChild("bone9",
				CubeListBuilder.create().texOffs(0, 118)
						.addBox(0.5F, -5.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 118)
						.addBox(0.5F, -5.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 118)
						.addBox(0.5F, -5.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 118)
						.addBox(0.5F, -5.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 116)
						.addBox(0.5F, -6.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 116)
						.addBox(0.5F, -6.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 116)
						.addBox(0.5F, -6.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 116)
						.addBox(0.5F, -6.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 114)
						.addBox(0.5F, -7.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 114)
						.addBox(0.5F, -7.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 114)
						.addBox(0.5F, -7.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 114)
						.addBox(0.5F, -7.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 112)
						.addBox(0.5F, -8.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 112)
						.addBox(0.5F, -8.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 112)
						.addBox(0.5F, -8.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 112)
						.addBox(0.5F, -8.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone10 = item2.addOrReplaceChild("bone10",
				CubeListBuilder.create().texOffs(16, 118)
						.addBox(0.5F, -5.8132F, -3.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 118)
						.addBox(0.5F, -5.8132F, -4.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 118)
						.addBox(0.5F, -5.8132F, -5.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 118)
						.addBox(0.5F, -5.8132F, -6.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 116)
						.addBox(0.5F, -6.8132F, -3.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 116)
						.addBox(0.5F, -6.8132F, -4.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 116)
						.addBox(0.5F, -6.8132F, -5.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 116)
						.addBox(0.5F, -6.8132F, -6.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 114)
						.addBox(0.5F, -7.8132F, -3.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 114)
						.addBox(0.5F, -7.8132F, -4.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 114)
						.addBox(0.5F, -7.8132F, -5.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 114)
						.addBox(0.5F, -7.8132F, -6.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 112)
						.addBox(0.5F, -8.8132F, -3.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 112)
						.addBox(0.5F, -8.8132F, -4.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 112)
						.addBox(0.5F, -8.8132F, -5.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 112)
						.addBox(0.5F, -8.8132F, -6.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, -8.0F));

		PartDefinition bone11 = bone10.addOrReplaceChild("bone11",
				CubeListBuilder.create().texOffs(16, 118)
						.addBox(0.5F, -5.8132F, -3.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 118)
						.addBox(0.5F, -5.8132F, -4.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 118)
						.addBox(0.5F, -5.8132F, -5.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 118)
						.addBox(0.5F, -5.8132F, -6.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 116)
						.addBox(0.5F, -6.8132F, -3.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 116)
						.addBox(0.5F, -6.8132F, -4.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 116)
						.addBox(0.5F, -6.8132F, -5.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 116)
						.addBox(0.5F, -6.8132F, -6.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 114)
						.addBox(0.5F, -7.8132F, -3.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 114)
						.addBox(0.5F, -7.8132F, -4.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 114)
						.addBox(0.5F, -7.8132F, -5.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 114)
						.addBox(0.5F, -7.8132F, -6.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 112)
						.addBox(0.5F, -8.8132F, -3.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 112)
						.addBox(0.5F, -8.8132F, -4.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 112)
						.addBox(0.5F, -8.8132F, -5.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 112)
						.addBox(0.5F, -8.8132F, -6.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone12 = item2.addOrReplaceChild("bone12",
				CubeListBuilder.create().texOffs(32, 118)
						.addBox(0.5F, -5.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 118)
						.addBox(0.5F, -5.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 118)
						.addBox(0.5F, -5.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 118)
						.addBox(0.5F, -5.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 116)
						.addBox(0.5F, -6.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 116)
						.addBox(0.5F, -6.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 116)
						.addBox(0.5F, -6.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 116)
						.addBox(0.5F, -6.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 114)
						.addBox(0.5F, -7.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 114)
						.addBox(0.5F, -7.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 114)
						.addBox(0.5F, -7.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 114)
						.addBox(0.5F, -7.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 112)
						.addBox(0.5F, -8.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 112)
						.addBox(0.5F, -8.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 112)
						.addBox(0.5F, -8.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 112)
						.addBox(0.5F, -8.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, -8.0F));

		PartDefinition bone13 = bone12.addOrReplaceChild("bone13",
				CubeListBuilder.create().texOffs(32, 118)
						.addBox(0.5F, -5.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 118)
						.addBox(0.5F, -5.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 118)
						.addBox(0.5F, -5.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 118)
						.addBox(0.5F, -5.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 116)
						.addBox(0.5F, -6.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 116)
						.addBox(0.5F, -6.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 116)
						.addBox(0.5F, -6.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 116)
						.addBox(0.5F, -6.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 114)
						.addBox(0.5F, -7.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 114)
						.addBox(0.5F, -7.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 114)
						.addBox(0.5F, -7.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 114)
						.addBox(0.5F, -7.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 112)
						.addBox(0.5F, -8.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 112)
						.addBox(0.5F, -8.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 112)
						.addBox(0.5F, -8.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 112)
						.addBox(0.5F, -8.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone14 = bone12.addOrReplaceChild("bone14",
				CubeListBuilder.create().texOffs(32, 118)
						.addBox(0.5F, -5.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 118)
						.addBox(0.5F, -5.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 118)
						.addBox(0.5F, -5.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 118)
						.addBox(0.5F, -5.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 116)
						.addBox(0.5F, -6.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 116)
						.addBox(0.5F, -6.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 116)
						.addBox(0.5F, -6.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 116)
						.addBox(0.5F, -6.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 114)
						.addBox(0.5F, -7.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 114)
						.addBox(0.5F, -7.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 114)
						.addBox(0.5F, -7.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 114)
						.addBox(0.5F, -7.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 112)
						.addBox(0.5F, -8.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 112)
						.addBox(0.5F, -8.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 112)
						.addBox(0.5F, -8.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 112)
						.addBox(0.5F, -8.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone15 = bone14.addOrReplaceChild("bone15",
				CubeListBuilder.create().texOffs(32, 118)
						.addBox(0.5F, -5.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 118)
						.addBox(0.5F, -5.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 118)
						.addBox(0.5F, -5.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 118)
						.addBox(0.5F, -5.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 116)
						.addBox(0.5F, -6.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 116)
						.addBox(0.5F, -6.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 116)
						.addBox(0.5F, -6.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 116)
						.addBox(0.5F, -6.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 114)
						.addBox(0.5F, -7.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 114)
						.addBox(0.5F, -7.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 114)
						.addBox(0.5F, -7.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 114)
						.addBox(0.5F, -7.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 112)
						.addBox(0.5F, -8.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 112)
						.addBox(0.5F, -8.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 112)
						.addBox(0.5F, -8.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 112)
						.addBox(0.5F, -8.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone16 = item2.addOrReplaceChild("bone16",
				CubeListBuilder.create().texOffs(48, 118)
						.addBox(0.5F, -5.8132F, -11.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 118)
						.addBox(0.5F, -5.8132F, -12.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 118)
						.addBox(0.5F, -5.8132F, -13.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 118)
						.addBox(0.5F, -5.8132F, -14.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 116)
						.addBox(0.5F, -6.8132F, -11.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 116)
						.addBox(0.5F, -6.8132F, -12.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 116)
						.addBox(0.5F, -6.8132F, -13.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 116)
						.addBox(0.5F, -6.8132F, -14.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 114)
						.addBox(0.5F, -7.8132F, -11.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 114)
						.addBox(0.5F, -7.8132F, -12.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 114)
						.addBox(0.5F, -7.8132F, -13.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 114)
						.addBox(0.5F, -7.8132F, -14.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 112)
						.addBox(0.5F, -8.8132F, -11.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 112)
						.addBox(0.5F, -8.8132F, -12.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 112)
						.addBox(0.5F, -8.8132F, -13.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 112)
						.addBox(0.5F, -8.8132F, -14.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, -8.0F));

		PartDefinition bone17 = bone16.addOrReplaceChild("bone17",
				CubeListBuilder.create().texOffs(48, 118)
						.addBox(0.5F, -5.8132F, -11.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 118)
						.addBox(0.5F, -5.8132F, -12.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 118)
						.addBox(0.5F, -5.8132F, -13.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 118)
						.addBox(0.5F, -5.8132F, -14.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 116)
						.addBox(0.5F, -6.8132F, -11.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 116)
						.addBox(0.5F, -6.8132F, -12.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 116)
						.addBox(0.5F, -6.8132F, -13.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 116)
						.addBox(0.5F, -6.8132F, -14.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 114)
						.addBox(0.5F, -7.8132F, -11.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 114)
						.addBox(0.5F, -7.8132F, -12.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 114)
						.addBox(0.5F, -7.8132F, -13.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 114)
						.addBox(0.5F, -7.8132F, -14.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 112)
						.addBox(0.5F, -8.8132F, -11.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 112)
						.addBox(0.5F, -8.8132F, -12.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 112)
						.addBox(0.5F, -8.8132F, -13.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 112)
						.addBox(0.5F, -8.8132F, -14.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition item3 = item.addOrReplaceChild("item3", CubeListBuilder.create(),
				PartPose.offset(0.0F, -8.0F, 15.0F));

		PartDefinition bone18 = item3.addOrReplaceChild("bone18",
				CubeListBuilder.create().texOffs(0, 110)
						.addBox(0.5F, -1.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 110)
						.addBox(0.5F, -1.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 110)
						.addBox(0.5F, -1.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 110)
						.addBox(0.5F, -1.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 108)
						.addBox(0.5F, -2.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 108)
						.addBox(0.5F, -2.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 108)
						.addBox(0.5F, -2.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 108)
						.addBox(0.5F, -2.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 106)
						.addBox(0.5F, -3.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 106)
						.addBox(0.5F, -3.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 106)
						.addBox(0.5F, -3.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 106)
						.addBox(0.5F, -3.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 104)
						.addBox(0.5F, -4.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 104)
						.addBox(0.5F, -4.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 104)
						.addBox(0.5F, -4.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 104)
						.addBox(0.5F, -4.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, -8.0F));

		PartDefinition bone19 = bone18.addOrReplaceChild("bone19",
				CubeListBuilder.create().texOffs(0, 110)
						.addBox(0.5F, -1.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 110)
						.addBox(0.5F, -1.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 110)
						.addBox(0.5F, -1.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 110)
						.addBox(0.5F, -1.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 108)
						.addBox(0.5F, -2.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 108)
						.addBox(0.5F, -2.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 108)
						.addBox(0.5F, -2.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 108)
						.addBox(0.5F, -2.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 106)
						.addBox(0.5F, -3.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 106)
						.addBox(0.5F, -3.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 106)
						.addBox(0.5F, -3.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 106)
						.addBox(0.5F, -3.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 104)
						.addBox(0.5F, -4.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 104)
						.addBox(0.5F, -4.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 104)
						.addBox(0.5F, -4.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 104)
						.addBox(0.5F, -4.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone20 = item3.addOrReplaceChild("bone20",
				CubeListBuilder.create().texOffs(16, 110)
						.addBox(0.5F, -1.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 110)
						.addBox(0.5F, -1.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 110)
						.addBox(0.5F, -1.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 110)
						.addBox(0.5F, -1.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 108)
						.addBox(0.5F, -2.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 108)
						.addBox(0.5F, -2.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 108)
						.addBox(0.5F, -2.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 108)
						.addBox(0.5F, -2.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 106)
						.addBox(0.5F, -3.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 106)
						.addBox(0.5F, -3.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 106)
						.addBox(0.5F, -3.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 106)
						.addBox(0.5F, -3.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 104)
						.addBox(0.5F, -4.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 104)
						.addBox(0.5F, -4.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 104)
						.addBox(0.5F, -4.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 104)
						.addBox(0.5F, -4.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, -12.0F));

		PartDefinition bone21 = item3.addOrReplaceChild("bone21",
				CubeListBuilder.create().texOffs(32, 110)
						.addBox(0.5F, -1.8132F, -3.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 110)
						.addBox(0.5F, -1.8132F, -4.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 110)
						.addBox(0.5F, -1.8132F, -5.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 110)
						.addBox(0.5F, -1.8132F, -6.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 108)
						.addBox(0.5F, -2.8132F, -3.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 108)
						.addBox(0.5F, -2.8132F, -4.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 108)
						.addBox(0.5F, -2.8132F, -5.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 108)
						.addBox(0.5F, -2.8132F, -6.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 106)
						.addBox(0.5F, -3.8132F, -3.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 106)
						.addBox(0.5F, -3.8132F, -4.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 106)
						.addBox(0.5F, -3.8132F, -5.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 106)
						.addBox(0.5F, -3.8132F, -6.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 104)
						.addBox(0.5F, -4.8132F, -3.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 104)
						.addBox(0.5F, -4.8132F, -4.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 104)
						.addBox(0.5F, -4.8132F, -5.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 104)
						.addBox(0.5F, -4.8132F, -6.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, -12.0F));

		PartDefinition bone22 = item3.addOrReplaceChild("bone22",
				CubeListBuilder.create().texOffs(48, 110)
						.addBox(0.5F, -1.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 110)
						.addBox(0.5F, -1.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 110)
						.addBox(0.5F, -1.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 110)
						.addBox(0.5F, -1.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 108)
						.addBox(0.5F, -2.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 108)
						.addBox(0.5F, -2.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 108)
						.addBox(0.5F, -2.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 108)
						.addBox(0.5F, -2.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 106)
						.addBox(0.5F, -3.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 106)
						.addBox(0.5F, -3.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 106)
						.addBox(0.5F, -3.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 106)
						.addBox(0.5F, -3.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 104)
						.addBox(0.5F, -4.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 104)
						.addBox(0.5F, -4.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 104)
						.addBox(0.5F, -4.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 104)
						.addBox(0.5F, -4.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, -12.0F));

		PartDefinition bone23 = item3.addOrReplaceChild("bone23",
				CubeListBuilder.create().texOffs(0, 102)
						.addBox(0.5F, -5.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 102)
						.addBox(0.5F, -5.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 102)
						.addBox(0.5F, -5.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 102)
						.addBox(0.5F, -5.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 100)
						.addBox(0.5F, -6.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 100)
						.addBox(0.5F, -6.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 100)
						.addBox(0.5F, -6.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 100)
						.addBox(0.5F, -6.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 98)
						.addBox(0.5F, -7.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 98)
						.addBox(0.5F, -7.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 98)
						.addBox(0.5F, -7.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 98)
						.addBox(0.5F, -7.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 96)
						.addBox(0.5F, -8.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 96)
						.addBox(0.5F, -8.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 96)
						.addBox(0.5F, -8.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 96)
						.addBox(0.5F, -8.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, -8.0F));

		PartDefinition bone24 = bone23.addOrReplaceChild("bone24",
				CubeListBuilder.create().texOffs(0, 102)
						.addBox(0.5F, -5.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 102)
						.addBox(0.5F, -5.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 102)
						.addBox(0.5F, -5.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 102)
						.addBox(0.5F, -5.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 100)
						.addBox(0.5F, -6.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 100)
						.addBox(0.5F, -6.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 100)
						.addBox(0.5F, -6.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 100)
						.addBox(0.5F, -6.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 98)
						.addBox(0.5F, -7.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 98)
						.addBox(0.5F, -7.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 98)
						.addBox(0.5F, -7.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 98)
						.addBox(0.5F, -7.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 96)
						.addBox(0.5F, -8.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 96)
						.addBox(0.5F, -8.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 96)
						.addBox(0.5F, -8.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 96)
						.addBox(0.5F, -8.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone25 = item3.addOrReplaceChild("bone25",
				CubeListBuilder.create().texOffs(16, 102)
						.addBox(0.5F, -5.8132F, -3.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 102)
						.addBox(0.5F, -5.8132F, -4.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 102)
						.addBox(0.5F, -5.8132F, -5.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 102)
						.addBox(0.5F, -5.8132F, -6.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 100)
						.addBox(0.5F, -6.8132F, -3.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 100)
						.addBox(0.5F, -6.8132F, -4.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 100)
						.addBox(0.5F, -6.8132F, -5.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 100)
						.addBox(0.5F, -6.8132F, -6.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 98)
						.addBox(0.5F, -7.8132F, -3.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 98)
						.addBox(0.5F, -7.8132F, -4.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 98)
						.addBox(0.5F, -7.8132F, -5.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 98)
						.addBox(0.5F, -7.8132F, -6.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 96)
						.addBox(0.5F, -8.8132F, -3.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 96)
						.addBox(0.5F, -8.8132F, -4.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 96)
						.addBox(0.5F, -8.8132F, -5.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 96)
						.addBox(0.5F, -8.8132F, -6.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, -8.0F));

		PartDefinition bone26 = bone25.addOrReplaceChild("bone26",
				CubeListBuilder.create().texOffs(16, 102)
						.addBox(0.5F, -5.8132F, -3.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 102)
						.addBox(0.5F, -5.8132F, -4.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 102)
						.addBox(0.5F, -5.8132F, -5.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 102)
						.addBox(0.5F, -5.8132F, -6.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 100)
						.addBox(0.5F, -6.8132F, -3.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 100)
						.addBox(0.5F, -6.8132F, -4.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 100)
						.addBox(0.5F, -6.8132F, -5.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 100)
						.addBox(0.5F, -6.8132F, -6.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 98)
						.addBox(0.5F, -7.8132F, -3.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 98)
						.addBox(0.5F, -7.8132F, -4.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 98)
						.addBox(0.5F, -7.8132F, -5.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 98)
						.addBox(0.5F, -7.8132F, -6.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 96)
						.addBox(0.5F, -8.8132F, -3.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 96)
						.addBox(0.5F, -8.8132F, -4.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 96)
						.addBox(0.5F, -8.8132F, -5.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 96)
						.addBox(0.5F, -8.8132F, -6.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone27 = item3.addOrReplaceChild("bone27",
				CubeListBuilder.create().texOffs(32, 102)
						.addBox(0.5F, -5.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 102)
						.addBox(0.5F, -5.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 102)
						.addBox(0.5F, -5.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 102)
						.addBox(0.5F, -5.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 100)
						.addBox(0.5F, -6.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 100)
						.addBox(0.5F, -6.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 100)
						.addBox(0.5F, -6.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 100)
						.addBox(0.5F, -6.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 98)
						.addBox(0.5F, -7.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 98)
						.addBox(0.5F, -7.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 98)
						.addBox(0.5F, -7.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 98)
						.addBox(0.5F, -7.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 96)
						.addBox(0.5F, -8.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 96)
						.addBox(0.5F, -8.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 96)
						.addBox(0.5F, -8.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 96)
						.addBox(0.5F, -8.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, -8.0F));

		PartDefinition bone28 = bone27.addOrReplaceChild("bone28",
				CubeListBuilder.create().texOffs(32, 102)
						.addBox(0.5F, -5.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 102)
						.addBox(0.5F, -5.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 102)
						.addBox(0.5F, -5.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 102)
						.addBox(0.5F, -5.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 100)
						.addBox(0.5F, -6.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 100)
						.addBox(0.5F, -6.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 100)
						.addBox(0.5F, -6.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 100)
						.addBox(0.5F, -6.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 98)
						.addBox(0.5F, -7.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 98)
						.addBox(0.5F, -7.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 98)
						.addBox(0.5F, -7.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 98)
						.addBox(0.5F, -7.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 96)
						.addBox(0.5F, -8.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 96)
						.addBox(0.5F, -8.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 96)
						.addBox(0.5F, -8.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 96)
						.addBox(0.5F, -8.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone29 = bone27.addOrReplaceChild("bone29",
				CubeListBuilder.create().texOffs(32, 102)
						.addBox(0.5F, -5.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 102)
						.addBox(0.5F, -5.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 102)
						.addBox(0.5F, -5.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 102)
						.addBox(0.5F, -5.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 100)
						.addBox(0.5F, -6.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 100)
						.addBox(0.5F, -6.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 100)
						.addBox(0.5F, -6.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 100)
						.addBox(0.5F, -6.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 98)
						.addBox(0.5F, -7.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 98)
						.addBox(0.5F, -7.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 98)
						.addBox(0.5F, -7.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 98)
						.addBox(0.5F, -7.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 96)
						.addBox(0.5F, -8.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 96)
						.addBox(0.5F, -8.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 96)
						.addBox(0.5F, -8.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 96)
						.addBox(0.5F, -8.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone30 = bone29.addOrReplaceChild("bone30",
				CubeListBuilder.create().texOffs(32, 102)
						.addBox(0.5F, -5.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 102)
						.addBox(0.5F, -5.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 102)
						.addBox(0.5F, -5.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 102)
						.addBox(0.5F, -5.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 100)
						.addBox(0.5F, -6.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 100)
						.addBox(0.5F, -6.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 100)
						.addBox(0.5F, -6.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 100)
						.addBox(0.5F, -6.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 98)
						.addBox(0.5F, -7.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 98)
						.addBox(0.5F, -7.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 98)
						.addBox(0.5F, -7.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 98)
						.addBox(0.5F, -7.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 96)
						.addBox(0.5F, -8.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 96)
						.addBox(0.5F, -8.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 96)
						.addBox(0.5F, -8.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 96)
						.addBox(0.5F, -8.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone31 = item3.addOrReplaceChild("bone31",
				CubeListBuilder.create().texOffs(48, 102)
						.addBox(0.5F, -5.8132F, -11.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 102)
						.addBox(0.5F, -5.8132F, -12.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 102)
						.addBox(0.5F, -5.8132F, -13.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 102)
						.addBox(0.5F, -5.8132F, -14.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 100)
						.addBox(0.5F, -6.8132F, -11.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 100)
						.addBox(0.5F, -6.8132F, -12.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 100)
						.addBox(0.5F, -6.8132F, -13.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 100)
						.addBox(0.5F, -6.8132F, -14.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 98)
						.addBox(0.5F, -7.8132F, -11.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 98)
						.addBox(0.5F, -7.8132F, -12.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 98)
						.addBox(0.5F, -7.8132F, -13.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 98)
						.addBox(0.5F, -7.8132F, -14.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 96)
						.addBox(0.5F, -8.8132F, -11.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 96)
						.addBox(0.5F, -8.8132F, -12.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 96)
						.addBox(0.5F, -8.8132F, -13.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 96)
						.addBox(0.5F, -8.8132F, -14.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, -8.0F));

		PartDefinition bone32 = bone31.addOrReplaceChild("bone32",
				CubeListBuilder.create().texOffs(48, 102)
						.addBox(0.5F, -5.8132F, -11.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 102)
						.addBox(0.5F, -5.8132F, -12.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 102)
						.addBox(0.5F, -5.8132F, -13.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 102)
						.addBox(0.5F, -5.8132F, -14.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 100)
						.addBox(0.5F, -6.8132F, -11.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 100)
						.addBox(0.5F, -6.8132F, -12.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 100)
						.addBox(0.5F, -6.8132F, -13.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 100)
						.addBox(0.5F, -6.8132F, -14.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 98)
						.addBox(0.5F, -7.8132F, -11.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 98)
						.addBox(0.5F, -7.8132F, -12.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 98)
						.addBox(0.5F, -7.8132F, -13.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 98)
						.addBox(0.5F, -7.8132F, -14.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 96)
						.addBox(0.5F, -8.8132F, -11.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 96)
						.addBox(0.5F, -8.8132F, -12.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 96)
						.addBox(0.5F, -8.8132F, -13.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 96)
						.addBox(0.5F, -8.8132F, -14.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(0, 64).mirror()
						.addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(5.0F, 2.0F, 0.0F));

		PartDefinition bone = LeftArm.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(39, 64).addBox(-2.0F, -1.0F, -9.0F, 4.0F, 5.0F, 7.0F,
						new CubeDeformation(0.75F)),
				PartPose.offsetAndRotation(2.0F, -4.0F, 0.0F, 0.0F, -1.5708F, 1.309F));

		PartDefinition shield = LeftArm.addOrReplaceChild("shield",
				CubeListBuilder.create().texOffs(65, 81).addBox(3.0F, -13.0F, -1.0F, 1.0F, 32.0F, 15.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 16.0F, -2.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(0, 32).mirror()
						.addBox(-4.0F, -1.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(25, 3).mirror().addBox(-4.1F, 3.0F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.2F))
						.mirror(false),
				PartPose.offsetAndRotation(0.1F, 13.0F, 0.0F, 0.0F, 0.0F, 0.0349F));

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(0, 32)
						.addBox(-2.0F, -1.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(25, 3)
						.addBox(-1.9F, 3.0F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(1.9F, 13.0F, 0.0F, 0.0F, 0.0F, -0.0349F));

		return LayerDefinition.create(meshdefinition, 112, 128);
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
		this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}