// Made with Blockbench 4.9.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelcorrupted_soulsteal<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "corrupted_soulsteal"), "main");
	private final ModelPart Head;
	private final ModelPart Body;
	private final ModelPart RightArm;
	private final ModelPart LeftArm;
	private final ModelPart RightLeg;
	private final ModelPart LeftLeg;

	public Modelcorrupted_soulsteal(ModelPart root) {
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

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1047F, 0.0873F, 0.0F));

		PartDefinition bone = Head
				.addOrReplaceChild("bone",
						CubeListBuilder.create().texOffs(0, 80).addBox(-4.0F, -8.9945F, -4.1045F, 8.0F, 8.0F, 8.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(64, 144)
						.addBox(-4.0F, -2.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.2F)).texOffs(64, 137)
						.addBox(-4.0F, 8.0F, -2.0F, 8.0F, 3.0F, 4.0F, new CubeDeformation(-0.2F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cloth = Body.addOrReplaceChild("cloth",
				CubeListBuilder.create().texOffs(48, 76).addBox(-4.0F, -12.9945F, -3.1045F, 10.0F, 12.0F, 6.0F,
						new CubeDeformation(0.5F)),
				PartPose.offsetAndRotation(5.0F, 12.0F, 0.0F, 3.0919F, -0.6599F, 2.8691F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(88, 144)
				.addBox(-4.1285F, -2.9764F, -2.1736F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 98)
				.addBox(-2.1285F, -2.4764F, -1.1736F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, 2.0F, 0.0F, -0.1731F, 0.0227F, 0.1289F));

		PartDefinition item = RightArm.addOrReplaceChild("item", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-2.0F, 15.0F, 2.0F, 1.1781F, 0.0F, 0.0F));

		PartDefinition item2 = item.addOrReplaceChild("item2", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 15.0F));

		PartDefinition bone2 = item2.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(48, 126)
				.addBox(0.3715F, -1.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 126)
				.addBox(0.3715F, -1.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 126)
				.addBox(0.3715F, -1.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 126)
				.addBox(0.3715F, -1.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 124)
				.addBox(0.3715F, -2.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 124)
				.addBox(0.3715F, -2.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 124)
				.addBox(0.3715F, -2.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 124)
				.addBox(0.3715F, -2.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 122)
				.addBox(0.3715F, -3.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 122)
				.addBox(0.3715F, -3.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 122)
				.addBox(0.3715F, -3.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 122)
				.addBox(0.3715F, -3.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 120)
				.addBox(0.3715F, -4.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 120)
				.addBox(0.3715F, -4.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 120)
				.addBox(0.3715F, -4.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 120)
				.addBox(0.3715F, -4.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, -8.0F));

		PartDefinition bone3 = bone2.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(48, 126)
				.addBox(0.3715F, -1.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 126)
				.addBox(0.3715F, -1.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 126)
				.addBox(0.3715F, -1.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 126)
				.addBox(0.3715F, -1.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 124)
				.addBox(0.3715F, -2.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 124)
				.addBox(0.3715F, -2.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 124)
				.addBox(0.3715F, -2.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 124)
				.addBox(0.3715F, -2.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 122)
				.addBox(0.3715F, -3.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 122)
				.addBox(0.3715F, -3.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 122)
				.addBox(0.3715F, -3.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 122)
				.addBox(0.3715F, -3.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 120)
				.addBox(0.3715F, -4.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 120)
				.addBox(0.3715F, -4.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 120)
				.addBox(0.3715F, -4.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 120)
				.addBox(0.3715F, -4.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone4 = item2.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(64, 126)
				.addBox(0.3715F, -1.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 126)
				.addBox(0.3715F, -1.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(72, 126)
				.addBox(0.3715F, -1.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(76, 126)
				.addBox(0.3715F, -1.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(64, 124)
				.addBox(0.3715F, -2.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 124)
				.addBox(0.3715F, -2.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(72, 124)
				.addBox(0.3715F, -2.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(76, 124)
				.addBox(0.3715F, -2.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(64, 122)
				.addBox(0.3715F, -3.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 122)
				.addBox(0.3715F, -3.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(72, 122)
				.addBox(0.3715F, -3.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(76, 122)
				.addBox(0.3715F, -3.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(64, 120)
				.addBox(0.3715F, -4.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 120)
				.addBox(0.3715F, -4.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(72, 120)
				.addBox(0.3715F, -4.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(76, 120)
				.addBox(0.3715F, -4.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, -12.0F));

		PartDefinition bone5 = item2.addOrReplaceChild("bone5", CubeListBuilder.create().texOffs(80, 126)
				.addBox(0.3715F, -1.8132F, -3.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(84, 126)
				.addBox(0.3715F, -1.8132F, -4.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(88, 126)
				.addBox(0.3715F, -1.8132F, -5.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(92, 126)
				.addBox(0.3715F, -1.8132F, -6.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(80, 124)
				.addBox(0.3715F, -2.8132F, -3.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(84, 124)
				.addBox(0.3715F, -2.8132F, -4.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(88, 124)
				.addBox(0.3715F, -2.8132F, -5.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(92, 124)
				.addBox(0.3715F, -2.8132F, -6.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(80, 122)
				.addBox(0.3715F, -3.8132F, -3.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(84, 122)
				.addBox(0.3715F, -3.8132F, -4.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(88, 122)
				.addBox(0.3715F, -3.8132F, -5.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(92, 122)
				.addBox(0.3715F, -3.8132F, -6.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(80, 120)
				.addBox(0.3715F, -4.8132F, -3.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(84, 120)
				.addBox(0.3715F, -4.8132F, -4.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(88, 120)
				.addBox(0.3715F, -4.8132F, -5.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(92, 120)
				.addBox(0.3715F, -4.8132F, -6.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, -12.0F));

		PartDefinition bone6 = item2.addOrReplaceChild("bone6", CubeListBuilder.create().texOffs(96, 126)
				.addBox(0.3715F, -1.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(100, 126)
				.addBox(0.3715F, -1.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(104, 126)
				.addBox(0.3715F, -1.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(108, 126)
				.addBox(0.3715F, -1.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(96, 124)
				.addBox(0.3715F, -2.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(100, 124)
				.addBox(0.3715F, -2.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(104, 124)
				.addBox(0.3715F, -2.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(108, 124)
				.addBox(0.3715F, -2.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(96, 122)
				.addBox(0.3715F, -3.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(100, 122)
				.addBox(0.3715F, -3.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(104, 122)
				.addBox(0.3715F, -3.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(108, 122)
				.addBox(0.3715F, -3.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(96, 120)
				.addBox(0.3715F, -4.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(100, 120)
				.addBox(0.3715F, -4.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(104, 120)
				.addBox(0.3715F, -4.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(108, 120)
				.addBox(0.3715F, -4.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, -12.0F));

		PartDefinition bone7 = item2.addOrReplaceChild("bone7", CubeListBuilder.create().texOffs(48, 118)
				.addBox(0.3715F, -5.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 118)
				.addBox(0.3715F, -5.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 118)
				.addBox(0.3715F, -5.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 118)
				.addBox(0.3715F, -5.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 116)
				.addBox(0.3715F, -6.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 116)
				.addBox(0.3715F, -6.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 116)
				.addBox(0.3715F, -6.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 116)
				.addBox(0.3715F, -6.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 114)
				.addBox(0.3715F, -7.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 114)
				.addBox(0.3715F, -7.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 114)
				.addBox(0.3715F, -7.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 114)
				.addBox(0.3715F, -7.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 112)
				.addBox(0.3715F, -8.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 112)
				.addBox(0.3715F, -8.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 112)
				.addBox(0.3715F, -8.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 112)
				.addBox(0.3715F, -8.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, -8.0F));

		PartDefinition bone8 = bone7.addOrReplaceChild("bone8", CubeListBuilder.create().texOffs(48, 118)
				.addBox(0.3715F, -5.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 118)
				.addBox(0.3715F, -5.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 118)
				.addBox(0.3715F, -5.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 118)
				.addBox(0.3715F, -5.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 116)
				.addBox(0.3715F, -6.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 116)
				.addBox(0.3715F, -6.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 116)
				.addBox(0.3715F, -6.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 116)
				.addBox(0.3715F, -6.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 114)
				.addBox(0.3715F, -7.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 114)
				.addBox(0.3715F, -7.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 114)
				.addBox(0.3715F, -7.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 114)
				.addBox(0.3715F, -7.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 112)
				.addBox(0.3715F, -8.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 112)
				.addBox(0.3715F, -8.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 112)
				.addBox(0.3715F, -8.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 112)
				.addBox(0.3715F, -8.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone9 = item2.addOrReplaceChild("bone9", CubeListBuilder.create().texOffs(64, 118)
				.addBox(0.3715F, -5.8132F, -3.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 118)
				.addBox(0.3715F, -5.8132F, -4.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(72, 118)
				.addBox(0.3715F, -5.8132F, -5.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(76, 118)
				.addBox(0.3715F, -5.8132F, -6.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(64, 116)
				.addBox(0.3715F, -6.8132F, -3.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 116)
				.addBox(0.3715F, -6.8132F, -4.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(72, 116)
				.addBox(0.3715F, -6.8132F, -5.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(76, 116)
				.addBox(0.3715F, -6.8132F, -6.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(64, 114)
				.addBox(0.3715F, -7.8132F, -3.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 114)
				.addBox(0.3715F, -7.8132F, -4.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(72, 114)
				.addBox(0.3715F, -7.8132F, -5.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(76, 114)
				.addBox(0.3715F, -7.8132F, -6.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(64, 112)
				.addBox(0.3715F, -8.8132F, -3.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 112)
				.addBox(0.3715F, -8.8132F, -4.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(72, 112)
				.addBox(0.3715F, -8.8132F, -5.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(76, 112)
				.addBox(0.3715F, -8.8132F, -6.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, -8.0F));

		PartDefinition bone10 = bone9.addOrReplaceChild("bone10", CubeListBuilder.create().texOffs(64, 118)
				.addBox(0.3715F, -5.8132F, -3.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 118)
				.addBox(0.3715F, -5.8132F, -4.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(72, 118)
				.addBox(0.3715F, -5.8132F, -5.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(76, 118)
				.addBox(0.3715F, -5.8132F, -6.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(64, 116)
				.addBox(0.3715F, -6.8132F, -3.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 116)
				.addBox(0.3715F, -6.8132F, -4.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(72, 116)
				.addBox(0.3715F, -6.8132F, -5.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(76, 116)
				.addBox(0.3715F, -6.8132F, -6.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(64, 114)
				.addBox(0.3715F, -7.8132F, -3.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 114)
				.addBox(0.3715F, -7.8132F, -4.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(72, 114)
				.addBox(0.3715F, -7.8132F, -5.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(76, 114)
				.addBox(0.3715F, -7.8132F, -6.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(64, 112)
				.addBox(0.3715F, -8.8132F, -3.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 112)
				.addBox(0.3715F, -8.8132F, -4.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(72, 112)
				.addBox(0.3715F, -8.8132F, -5.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(76, 112)
				.addBox(0.3715F, -8.8132F, -6.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone11 = item2.addOrReplaceChild("bone11", CubeListBuilder.create().texOffs(80, 118)
				.addBox(0.3715F, -5.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(84, 118)
				.addBox(0.3715F, -5.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(88, 118)
				.addBox(0.3715F, -5.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(92, 118)
				.addBox(0.3715F, -5.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(80, 116)
				.addBox(0.3715F, -6.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(84, 116)
				.addBox(0.3715F, -6.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(88, 116)
				.addBox(0.3715F, -6.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(92, 116)
				.addBox(0.3715F, -6.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(80, 114)
				.addBox(0.3715F, -7.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(84, 114)
				.addBox(0.3715F, -7.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(88, 114)
				.addBox(0.3715F, -7.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(92, 114)
				.addBox(0.3715F, -7.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(80, 112)
				.addBox(0.3715F, -8.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(84, 112)
				.addBox(0.3715F, -8.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(88, 112)
				.addBox(0.3715F, -8.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(92, 112)
				.addBox(0.3715F, -8.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, -8.0F));

		PartDefinition bone12 = bone11.addOrReplaceChild("bone12", CubeListBuilder.create().texOffs(80, 118)
				.addBox(0.3715F, -5.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(84, 118)
				.addBox(0.3715F, -5.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(88, 118)
				.addBox(0.3715F, -5.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(92, 118)
				.addBox(0.3715F, -5.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(80, 116)
				.addBox(0.3715F, -6.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(84, 116)
				.addBox(0.3715F, -6.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(88, 116)
				.addBox(0.3715F, -6.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(92, 116)
				.addBox(0.3715F, -6.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(80, 114)
				.addBox(0.3715F, -7.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(84, 114)
				.addBox(0.3715F, -7.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(88, 114)
				.addBox(0.3715F, -7.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(92, 114)
				.addBox(0.3715F, -7.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(80, 112)
				.addBox(0.3715F, -8.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(84, 112)
				.addBox(0.3715F, -8.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(88, 112)
				.addBox(0.3715F, -8.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(92, 112)
				.addBox(0.3715F, -8.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone13 = bone11.addOrReplaceChild("bone13", CubeListBuilder.create().texOffs(80, 118)
				.addBox(0.3715F, -5.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(84, 118)
				.addBox(0.3715F, -5.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(88, 118)
				.addBox(0.3715F, -5.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(92, 118)
				.addBox(0.3715F, -5.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(80, 116)
				.addBox(0.3715F, -6.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(84, 116)
				.addBox(0.3715F, -6.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(88, 116)
				.addBox(0.3715F, -6.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(92, 116)
				.addBox(0.3715F, -6.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(80, 114)
				.addBox(0.3715F, -7.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(84, 114)
				.addBox(0.3715F, -7.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(88, 114)
				.addBox(0.3715F, -7.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(92, 114)
				.addBox(0.3715F, -7.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(80, 112)
				.addBox(0.3715F, -8.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(84, 112)
				.addBox(0.3715F, -8.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(88, 112)
				.addBox(0.3715F, -8.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(92, 112)
				.addBox(0.3715F, -8.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone14 = bone13.addOrReplaceChild("bone14", CubeListBuilder.create().texOffs(80, 118)
				.addBox(0.3715F, -5.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(84, 118)
				.addBox(0.3715F, -5.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(88, 118)
				.addBox(0.3715F, -5.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(92, 118)
				.addBox(0.3715F, -5.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(80, 116)
				.addBox(0.3715F, -6.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(84, 116)
				.addBox(0.3715F, -6.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(88, 116)
				.addBox(0.3715F, -6.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(92, 116)
				.addBox(0.3715F, -6.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(80, 114)
				.addBox(0.3715F, -7.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(84, 114)
				.addBox(0.3715F, -7.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(88, 114)
				.addBox(0.3715F, -7.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(92, 114)
				.addBox(0.3715F, -7.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(80, 112)
				.addBox(0.3715F, -8.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(84, 112)
				.addBox(0.3715F, -8.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(88, 112)
				.addBox(0.3715F, -8.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(92, 112)
				.addBox(0.3715F, -8.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone15 = item2.addOrReplaceChild("bone15", CubeListBuilder.create().texOffs(96, 118)
				.addBox(0.3715F, -5.8132F, -11.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(100, 118)
				.addBox(0.3715F, -5.8132F, -12.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(104, 118)
				.addBox(0.3715F, -5.8132F, -13.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(108, 118)
				.addBox(0.3715F, -5.8132F, -14.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(96, 116)
				.addBox(0.3715F, -6.8132F, -11.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(100, 116)
				.addBox(0.3715F, -6.8132F, -12.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(104, 116)
				.addBox(0.3715F, -6.8132F, -13.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(108, 116)
				.addBox(0.3715F, -6.8132F, -14.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(96, 114)
				.addBox(0.3715F, -7.8132F, -11.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(100, 114)
				.addBox(0.3715F, -7.8132F, -12.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(104, 114)
				.addBox(0.3715F, -7.8132F, -13.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(108, 114)
				.addBox(0.3715F, -7.8132F, -14.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(96, 112)
				.addBox(0.3715F, -8.8132F, -11.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(100, 112)
				.addBox(0.3715F, -8.8132F, -12.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(104, 112)
				.addBox(0.3715F, -8.8132F, -13.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(108, 112)
				.addBox(0.3715F, -8.8132F, -14.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, -8.0F));

		PartDefinition bone16 = bone15.addOrReplaceChild("bone16", CubeListBuilder.create().texOffs(96, 118)
				.addBox(0.3715F, -5.8132F, -11.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(100, 118)
				.addBox(0.3715F, -5.8132F, -12.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(104, 118)
				.addBox(0.3715F, -5.8132F, -13.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(108, 118)
				.addBox(0.3715F, -5.8132F, -14.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(96, 116)
				.addBox(0.3715F, -6.8132F, -11.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(100, 116)
				.addBox(0.3715F, -6.8132F, -12.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(104, 116)
				.addBox(0.3715F, -6.8132F, -13.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(108, 116)
				.addBox(0.3715F, -6.8132F, -14.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(96, 114)
				.addBox(0.3715F, -7.8132F, -11.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(100, 114)
				.addBox(0.3715F, -7.8132F, -12.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(104, 114)
				.addBox(0.3715F, -7.8132F, -13.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(108, 114)
				.addBox(0.3715F, -7.8132F, -14.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(96, 112)
				.addBox(0.3715F, -8.8132F, -11.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(100, 112)
				.addBox(0.3715F, -8.8132F, -12.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(104, 112)
				.addBox(0.3715F, -8.8132F, -13.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(108, 112)
				.addBox(0.3715F, -8.8132F, -14.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition item3 = item.addOrReplaceChild("item3", CubeListBuilder.create(),
				PartPose.offset(0.0F, -8.0F, 15.0F));

		PartDefinition bone17 = item3.addOrReplaceChild("bone17", CubeListBuilder.create().texOffs(48, 110)
				.addBox(0.3715F, -1.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 110)
				.addBox(0.3715F, -1.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 110)
				.addBox(0.3715F, -1.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 110)
				.addBox(0.3715F, -1.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 108)
				.addBox(0.3715F, -2.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 108)
				.addBox(0.3715F, -2.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 108)
				.addBox(0.3715F, -2.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 108)
				.addBox(0.3715F, -2.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 106)
				.addBox(0.3715F, -3.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 106)
				.addBox(0.3715F, -3.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 106)
				.addBox(0.3715F, -3.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 106)
				.addBox(0.3715F, -3.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 104)
				.addBox(0.3715F, -4.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 104)
				.addBox(0.3715F, -4.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 104)
				.addBox(0.3715F, -4.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 104)
				.addBox(0.3715F, -4.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, -8.0F));

		PartDefinition bone18 = bone17.addOrReplaceChild("bone18", CubeListBuilder.create().texOffs(48, 110)
				.addBox(0.3715F, -1.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 110)
				.addBox(0.3715F, -1.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 110)
				.addBox(0.3715F, -1.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 110)
				.addBox(0.3715F, -1.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 108)
				.addBox(0.3715F, -2.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 108)
				.addBox(0.3715F, -2.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 108)
				.addBox(0.3715F, -2.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 108)
				.addBox(0.3715F, -2.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 106)
				.addBox(0.3715F, -3.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 106)
				.addBox(0.3715F, -3.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 106)
				.addBox(0.3715F, -3.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 106)
				.addBox(0.3715F, -3.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 104)
				.addBox(0.3715F, -4.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 104)
				.addBox(0.3715F, -4.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 104)
				.addBox(0.3715F, -4.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 104)
				.addBox(0.3715F, -4.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone19 = item3.addOrReplaceChild("bone19", CubeListBuilder.create().texOffs(64, 110)
				.addBox(0.3715F, -1.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 110)
				.addBox(0.3715F, -1.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(72, 110)
				.addBox(0.3715F, -1.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(76, 110)
				.addBox(0.3715F, -1.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(64, 108)
				.addBox(0.3715F, -2.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 108)
				.addBox(0.3715F, -2.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(72, 108)
				.addBox(0.3715F, -2.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(76, 108)
				.addBox(0.3715F, -2.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(64, 106)
				.addBox(0.3715F, -3.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 106)
				.addBox(0.3715F, -3.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(72, 106)
				.addBox(0.3715F, -3.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(76, 106)
				.addBox(0.3715F, -3.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(64, 104)
				.addBox(0.3715F, -4.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 104)
				.addBox(0.3715F, -4.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(72, 104)
				.addBox(0.3715F, -4.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(76, 104)
				.addBox(0.3715F, -4.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, -12.0F));

		PartDefinition bone20 = item3.addOrReplaceChild("bone20", CubeListBuilder.create().texOffs(80, 110)
				.addBox(0.3715F, -1.8132F, -3.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(84, 110)
				.addBox(0.3715F, -1.8132F, -4.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(88, 110)
				.addBox(0.3715F, -1.8132F, -5.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(92, 110)
				.addBox(0.3715F, -1.8132F, -6.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(80, 108)
				.addBox(0.3715F, -2.8132F, -3.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(84, 108)
				.addBox(0.3715F, -2.8132F, -4.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(88, 108)
				.addBox(0.3715F, -2.8132F, -5.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(92, 108)
				.addBox(0.3715F, -2.8132F, -6.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(80, 106)
				.addBox(0.3715F, -3.8132F, -3.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(84, 106)
				.addBox(0.3715F, -3.8132F, -4.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(88, 106)
				.addBox(0.3715F, -3.8132F, -5.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(92, 106)
				.addBox(0.3715F, -3.8132F, -6.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(80, 104)
				.addBox(0.3715F, -4.8132F, -3.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(84, 104)
				.addBox(0.3715F, -4.8132F, -4.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(88, 104)
				.addBox(0.3715F, -4.8132F, -5.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(92, 104)
				.addBox(0.3715F, -4.8132F, -6.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, -12.0F));

		PartDefinition bone21 = item3.addOrReplaceChild("bone21", CubeListBuilder.create().texOffs(96, 110)
				.addBox(0.3715F, -1.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(100, 110)
				.addBox(0.3715F, -1.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(104, 110)
				.addBox(0.3715F, -1.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(108, 110)
				.addBox(0.3715F, -1.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(96, 108)
				.addBox(0.3715F, -2.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(100, 108)
				.addBox(0.3715F, -2.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(104, 108)
				.addBox(0.3715F, -2.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(108, 108)
				.addBox(0.3715F, -2.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(96, 106)
				.addBox(0.3715F, -3.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(100, 106)
				.addBox(0.3715F, -3.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(104, 106)
				.addBox(0.3715F, -3.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(108, 106)
				.addBox(0.3715F, -3.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(96, 104)
				.addBox(0.3715F, -4.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(100, 104)
				.addBox(0.3715F, -4.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(104, 104)
				.addBox(0.3715F, -4.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(108, 104)
				.addBox(0.3715F, -4.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, -12.0F));

		PartDefinition bone22 = item3.addOrReplaceChild("bone22", CubeListBuilder.create().texOffs(48, 102)
				.addBox(0.3715F, -5.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 102)
				.addBox(0.3715F, -5.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 102)
				.addBox(0.3715F, -5.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 102)
				.addBox(0.3715F, -5.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 100)
				.addBox(0.3715F, -6.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 100)
				.addBox(0.3715F, -6.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 100)
				.addBox(0.3715F, -6.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 100)
				.addBox(0.3715F, -6.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 98)
				.addBox(0.3715F, -7.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 98)
				.addBox(0.3715F, -7.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 98)
				.addBox(0.3715F, -7.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 98)
				.addBox(0.3715F, -7.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 96)
				.addBox(0.3715F, -8.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 96)
				.addBox(0.3715F, -8.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 96)
				.addBox(0.3715F, -8.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 96)
				.addBox(0.3715F, -8.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, -8.0F));

		PartDefinition bone23 = bone22.addOrReplaceChild("bone23", CubeListBuilder.create().texOffs(48, 102)
				.addBox(0.3715F, -5.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 102)
				.addBox(0.3715F, -5.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 102)
				.addBox(0.3715F, -5.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 102)
				.addBox(0.3715F, -5.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 100)
				.addBox(0.3715F, -6.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 100)
				.addBox(0.3715F, -6.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 100)
				.addBox(0.3715F, -6.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 100)
				.addBox(0.3715F, -6.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 98)
				.addBox(0.3715F, -7.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 98)
				.addBox(0.3715F, -7.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 98)
				.addBox(0.3715F, -7.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 98)
				.addBox(0.3715F, -7.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 96)
				.addBox(0.3715F, -8.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 96)
				.addBox(0.3715F, -8.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 96)
				.addBox(0.3715F, -8.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 96)
				.addBox(0.3715F, -8.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone24 = item3.addOrReplaceChild("bone24", CubeListBuilder.create().texOffs(64, 102)
				.addBox(0.3715F, -5.8132F, -3.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 102)
				.addBox(0.3715F, -5.8132F, -4.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(72, 102)
				.addBox(0.3715F, -5.8132F, -5.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(76, 102)
				.addBox(0.3715F, -5.8132F, -6.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(64, 100)
				.addBox(0.3715F, -6.8132F, -3.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 100)
				.addBox(0.3715F, -6.8132F, -4.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(72, 100)
				.addBox(0.3715F, -6.8132F, -5.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(76, 100)
				.addBox(0.3715F, -6.8132F, -6.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(64, 98)
				.addBox(0.3715F, -7.8132F, -3.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 98)
				.addBox(0.3715F, -7.8132F, -4.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(72, 98)
				.addBox(0.3715F, -7.8132F, -5.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(76, 98)
				.addBox(0.3715F, -7.8132F, -6.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(64, 96)
				.addBox(0.3715F, -8.8132F, -3.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 96)
				.addBox(0.3715F, -8.8132F, -4.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(72, 96)
				.addBox(0.3715F, -8.8132F, -5.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(76, 96)
				.addBox(0.3715F, -8.8132F, -6.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, -8.0F));

		PartDefinition bone25 = bone24.addOrReplaceChild("bone25", CubeListBuilder.create().texOffs(64, 102)
				.addBox(0.3715F, -5.8132F, -3.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 102)
				.addBox(0.3715F, -5.8132F, -4.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(72, 102)
				.addBox(0.3715F, -5.8132F, -5.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(76, 102)
				.addBox(0.3715F, -5.8132F, -6.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(64, 100)
				.addBox(0.3715F, -6.8132F, -3.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 100)
				.addBox(0.3715F, -6.8132F, -4.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(72, 100)
				.addBox(0.3715F, -6.8132F, -5.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(76, 100)
				.addBox(0.3715F, -6.8132F, -6.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(64, 98)
				.addBox(0.3715F, -7.8132F, -3.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 98)
				.addBox(0.3715F, -7.8132F, -4.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(72, 98)
				.addBox(0.3715F, -7.8132F, -5.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(76, 98)
				.addBox(0.3715F, -7.8132F, -6.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(64, 96)
				.addBox(0.3715F, -8.8132F, -3.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 96)
				.addBox(0.3715F, -8.8132F, -4.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(72, 96)
				.addBox(0.3715F, -8.8132F, -5.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(76, 96)
				.addBox(0.3715F, -8.8132F, -6.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone26 = item3.addOrReplaceChild("bone26", CubeListBuilder.create().texOffs(80, 102)
				.addBox(0.3715F, -5.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(84, 102)
				.addBox(0.3715F, -5.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(88, 102)
				.addBox(0.3715F, -5.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(92, 102)
				.addBox(0.3715F, -5.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(80, 100)
				.addBox(0.3715F, -6.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(84, 100)
				.addBox(0.3715F, -6.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(88, 100)
				.addBox(0.3715F, -6.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(92, 100)
				.addBox(0.3715F, -6.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(80, 98)
				.addBox(0.3715F, -7.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(84, 98)
				.addBox(0.3715F, -7.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(88, 98)
				.addBox(0.3715F, -7.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(92, 98)
				.addBox(0.3715F, -7.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(80, 96)
				.addBox(0.3715F, -8.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(84, 96)
				.addBox(0.3715F, -8.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(88, 96)
				.addBox(0.3715F, -8.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(92, 96)
				.addBox(0.3715F, -8.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, -8.0F));

		PartDefinition bone27 = bone26.addOrReplaceChild("bone27", CubeListBuilder.create().texOffs(80, 102)
				.addBox(0.3715F, -5.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(84, 102)
				.addBox(0.3715F, -5.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(88, 102)
				.addBox(0.3715F, -5.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(92, 102)
				.addBox(0.3715F, -5.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(80, 100)
				.addBox(0.3715F, -6.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(84, 100)
				.addBox(0.3715F, -6.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(88, 100)
				.addBox(0.3715F, -6.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(92, 100)
				.addBox(0.3715F, -6.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(80, 98)
				.addBox(0.3715F, -7.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(84, 98)
				.addBox(0.3715F, -7.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(88, 98)
				.addBox(0.3715F, -7.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(92, 98)
				.addBox(0.3715F, -7.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(80, 96)
				.addBox(0.3715F, -8.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(84, 96)
				.addBox(0.3715F, -8.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(88, 96)
				.addBox(0.3715F, -8.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(92, 96)
				.addBox(0.3715F, -8.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone28 = bone26.addOrReplaceChild("bone28", CubeListBuilder.create().texOffs(80, 102)
				.addBox(0.3715F, -5.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(84, 102)
				.addBox(0.3715F, -5.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(88, 102)
				.addBox(0.3715F, -5.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(92, 102)
				.addBox(0.3715F, -5.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(80, 100)
				.addBox(0.3715F, -6.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(84, 100)
				.addBox(0.3715F, -6.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(88, 100)
				.addBox(0.3715F, -6.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(92, 100)
				.addBox(0.3715F, -6.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(80, 98)
				.addBox(0.3715F, -7.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(84, 98)
				.addBox(0.3715F, -7.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(88, 98)
				.addBox(0.3715F, -7.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(92, 98)
				.addBox(0.3715F, -7.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(80, 96)
				.addBox(0.3715F, -8.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(84, 96)
				.addBox(0.3715F, -8.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(88, 96)
				.addBox(0.3715F, -8.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(92, 96)
				.addBox(0.3715F, -8.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone29 = bone28.addOrReplaceChild("bone29", CubeListBuilder.create().texOffs(80, 102)
				.addBox(0.3715F, -5.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(84, 102)
				.addBox(0.3715F, -5.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(88, 102)
				.addBox(0.3715F, -5.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(92, 102)
				.addBox(0.3715F, -5.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(80, 100)
				.addBox(0.3715F, -6.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(84, 100)
				.addBox(0.3715F, -6.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(88, 100)
				.addBox(0.3715F, -6.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(92, 100)
				.addBox(0.3715F, -6.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(80, 98)
				.addBox(0.3715F, -7.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(84, 98)
				.addBox(0.3715F, -7.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(88, 98)
				.addBox(0.3715F, -7.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(92, 98)
				.addBox(0.3715F, -7.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(80, 96)
				.addBox(0.3715F, -8.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(84, 96)
				.addBox(0.3715F, -8.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(88, 96)
				.addBox(0.3715F, -8.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(92, 96)
				.addBox(0.3715F, -8.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone30 = item3.addOrReplaceChild("bone30", CubeListBuilder.create().texOffs(96, 102)
				.addBox(0.3715F, -5.8132F, -11.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(100, 102)
				.addBox(0.3715F, -5.8132F, -12.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(104, 102)
				.addBox(0.3715F, -5.8132F, -13.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(108, 102)
				.addBox(0.3715F, -5.8132F, -14.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(96, 100)
				.addBox(0.3715F, -6.8132F, -11.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(100, 100)
				.addBox(0.3715F, -6.8132F, -12.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(104, 100)
				.addBox(0.3715F, -6.8132F, -13.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(108, 100)
				.addBox(0.3715F, -6.8132F, -14.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(96, 98)
				.addBox(0.3715F, -7.8132F, -11.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(100, 98)
				.addBox(0.3715F, -7.8132F, -12.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(104, 98)
				.addBox(0.3715F, -7.8132F, -13.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(108, 98)
				.addBox(0.3715F, -7.8132F, -14.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(96, 96)
				.addBox(0.3715F, -8.8132F, -11.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(100, 96)
				.addBox(0.3715F, -8.8132F, -12.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(104, 96)
				.addBox(0.3715F, -8.8132F, -13.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(108, 96)
				.addBox(0.3715F, -8.8132F, -14.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, -8.0F));

		PartDefinition bone31 = bone30.addOrReplaceChild("bone31", CubeListBuilder.create().texOffs(96, 102)
				.addBox(0.3715F, -5.8132F, -11.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(100, 102)
				.addBox(0.3715F, -5.8132F, -12.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(104, 102)
				.addBox(0.3715F, -5.8132F, -13.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(108, 102)
				.addBox(0.3715F, -5.8132F, -14.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(96, 100)
				.addBox(0.3715F, -6.8132F, -11.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(100, 100)
				.addBox(0.3715F, -6.8132F, -12.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(104, 100)
				.addBox(0.3715F, -6.8132F, -13.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(108, 100)
				.addBox(0.3715F, -6.8132F, -14.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(96, 98)
				.addBox(0.3715F, -7.8132F, -11.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(100, 98)
				.addBox(0.3715F, -7.8132F, -12.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(104, 98)
				.addBox(0.3715F, -7.8132F, -13.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(108, 98)
				.addBox(0.3715F, -7.8132F, -14.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(96, 96)
				.addBox(0.3715F, -8.8132F, -11.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(100, 96)
				.addBox(0.3715F, -8.8132F, -12.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(104, 96)
				.addBox(0.3715F, -8.8132F, -13.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(108, 96)
				.addBox(0.3715F, -8.8132F, -14.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(0, 98).addBox(-0.8723F, -2.4698F, -0.7921F, 2.0F, 12.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, 2.0F, 0.0F, 0.2077F, 0.0271F, -0.1281F));

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(48, 128)
						.addBox(-2.0F, -1.0F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(-0.2F)).texOffs(48, 144)
						.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.4F)),
				PartPose.offsetAndRotation(-1.9F, 12.0F, 0.0F, 0.192F, 0.0F, 0.0349F));

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(48, 128)
				.addBox(-2.0F, -1.0F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(-0.2F)).texOffs(48, 144).mirror()
				.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.4F)).mirror(false),
				PartPose.offsetAndRotation(1.9F, 12.0F, 0.0F, -0.1745F, 0.0F, -0.0349F));

		return LayerDefinition.create(meshdefinition, 176, 176);
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