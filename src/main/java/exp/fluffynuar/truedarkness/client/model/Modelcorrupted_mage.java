package exp.fluffynuar.truedarkness.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.9.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelcorrupted_mage<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("truedarkness", "modelcorrupted_mage"), "main");
	public final ModelPart Head;
	public final ModelPart Body;
	public final ModelPart RightArm;
	public final ModelPart LeftArm;
	public final ModelPart RightLeg;
	public final ModelPart LeftLeg;

	public Modelcorrupted_mage(ModelPart root) {
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
		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 64).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.2F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(16, 96).addBox(-4.0F, -1.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.2F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cloth = Body.addOrReplaceChild("cloth", CubeListBuilder.create().texOffs(16, 126).addBox(-5.0F, -23.0F, -3.0F, 10.0F, 14.0F, 6.0F, new CubeDeformation(-0.7F)),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, 3.1416F, 0.0F));
		PartDefinition matle = Body.addOrReplaceChild("matle", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -3.0F, 2.8362F, 0.0F, 3.1416F));
		PartDefinition bone = matle.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(64, 160).addBox(-4.0F, 11.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.4F)), PartPose.offsetAndRotation(0.0F, 35.0F, 1.0F, 0.0F, 0.0F, -3.1416F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(0, 98).mirror().addBox(-2.0F, -1.0F, -1.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.2F)).mirror(false).texOffs(32, 160).addBox(-4.0F, -2.0F, -2.0F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-4.0F, 2.0F, 0.0F));
		PartDefinition item = RightArm.addOrReplaceChild("item", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0F, 17.0F, 1.0F, 1.1781F, 0.0F, 0.0F));
		PartDefinition item2 = item.addOrReplaceChild("item2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 15.0F));
		PartDefinition bone2 = item2.addOrReplaceChild("bone2",
				CubeListBuilder.create().texOffs(112, 158).addBox(0.3715F, -1.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(116, 158).addBox(0.3715F, -1.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(120, 158).addBox(0.3715F, -1.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(124, 158).addBox(0.3715F, -1.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(112, 156)
						.addBox(0.3715F, -2.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(116, 156).addBox(0.3715F, -2.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(120, 156)
						.addBox(0.3715F, -2.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(124, 156).addBox(0.3715F, -2.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(112, 154)
						.addBox(0.3715F, -3.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(116, 154).addBox(0.3715F, -3.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(120, 154)
						.addBox(0.3715F, -3.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(124, 154).addBox(0.3715F, -3.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(112, 152)
						.addBox(0.3715F, -4.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(116, 152).addBox(0.3715F, -4.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(120, 152)
						.addBox(0.3715F, -4.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(124, 152).addBox(0.3715F, -4.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, -8.0F));
		PartDefinition bone3 = bone2.addOrReplaceChild("bone3",
				CubeListBuilder.create().texOffs(112, 158).addBox(0.3715F, -1.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(116, 158).addBox(0.3715F, -1.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(120, 158).addBox(0.3715F, -1.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(124, 158).addBox(0.3715F, -1.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(112, 156)
						.addBox(0.3715F, -2.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(116, 156).addBox(0.3715F, -2.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(120, 156)
						.addBox(0.3715F, -2.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(124, 156).addBox(0.3715F, -2.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(112, 154)
						.addBox(0.3715F, -3.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(116, 154).addBox(0.3715F, -3.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(120, 154)
						.addBox(0.3715F, -3.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(124, 154).addBox(0.3715F, -3.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(112, 152)
						.addBox(0.3715F, -4.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(116, 152).addBox(0.3715F, -4.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(120, 152)
						.addBox(0.3715F, -4.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(124, 152).addBox(0.3715F, -4.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bone4 = item2.addOrReplaceChild("bone4",
				CubeListBuilder.create().texOffs(128, 158).addBox(0.3715F, -1.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(132, 158).addBox(0.3715F, -1.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(136, 158).addBox(0.3715F, -1.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(140, 158).addBox(0.3715F, -1.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(128, 156)
						.addBox(0.3715F, -2.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(132, 156).addBox(0.3715F, -2.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(136, 156)
						.addBox(0.3715F, -2.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(140, 156).addBox(0.3715F, -2.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(128, 154)
						.addBox(0.3715F, -3.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(132, 154).addBox(0.3715F, -3.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(136, 154)
						.addBox(0.3715F, -3.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(140, 154).addBox(0.3715F, -3.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(128, 152)
						.addBox(0.3715F, -4.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(132, 152).addBox(0.3715F, -4.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(136, 152)
						.addBox(0.3715F, -4.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(140, 152).addBox(0.3715F, -4.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, -12.0F));
		PartDefinition bone5 = item2.addOrReplaceChild("bone5",
				CubeListBuilder.create().texOffs(144, 158).addBox(0.3715F, -1.8132F, -3.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(148, 158).addBox(0.3715F, -1.8132F, -4.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(152, 158).addBox(0.3715F, -1.8132F, -5.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 158).addBox(0.3715F, -1.8132F, -6.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 156)
						.addBox(0.3715F, -2.8132F, -3.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(148, 156).addBox(0.3715F, -2.8132F, -4.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(152, 156)
						.addBox(0.3715F, -2.8132F, -5.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 156).addBox(0.3715F, -2.8132F, -6.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 154)
						.addBox(0.3715F, -3.8132F, -3.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(148, 154).addBox(0.3715F, -3.8132F, -4.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(152, 154)
						.addBox(0.3715F, -3.8132F, -5.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 154).addBox(0.3715F, -3.8132F, -6.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 152)
						.addBox(0.3715F, -4.8132F, -3.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(148, 152).addBox(0.3715F, -4.8132F, -4.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(152, 152)
						.addBox(0.3715F, -4.8132F, -5.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 152).addBox(0.3715F, -4.8132F, -6.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, -12.0F));
		PartDefinition bone6 = item2.addOrReplaceChild("bone6",
				CubeListBuilder.create().texOffs(160, 158).addBox(0.3715F, -1.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(164, 158).addBox(0.3715F, -1.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(168, 158).addBox(0.3715F, -1.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(172, 158).addBox(0.3715F, -1.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(160, 156)
						.addBox(0.3715F, -2.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(164, 156).addBox(0.3715F, -2.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(168, 156)
						.addBox(0.3715F, -2.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(172, 156).addBox(0.3715F, -2.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(160, 154)
						.addBox(0.3715F, -3.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(164, 154).addBox(0.3715F, -3.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(168, 154)
						.addBox(0.3715F, -3.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(172, 154).addBox(0.3715F, -3.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(160, 152)
						.addBox(0.3715F, -4.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(164, 152).addBox(0.3715F, -4.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(168, 152)
						.addBox(0.3715F, -4.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(172, 152).addBox(0.3715F, -4.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, -12.0F));
		PartDefinition bone7 = item2.addOrReplaceChild("bone7",
				CubeListBuilder.create().texOffs(112, 150).addBox(0.3715F, -5.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(116, 150).addBox(0.3715F, -5.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(120, 150).addBox(0.3715F, -5.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(124, 150).addBox(0.3715F, -5.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(112, 148)
						.addBox(0.3715F, -6.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(116, 148).addBox(0.3715F, -6.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(120, 148)
						.addBox(0.3715F, -6.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(124, 148).addBox(0.3715F, -6.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(112, 146)
						.addBox(0.3715F, -7.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(116, 146).addBox(0.3715F, -7.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(120, 146)
						.addBox(0.3715F, -7.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(124, 146).addBox(0.3715F, -7.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(112, 144)
						.addBox(0.3715F, -8.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(116, 144).addBox(0.3715F, -8.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(120, 144)
						.addBox(0.3715F, -8.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(124, 144).addBox(0.3715F, -8.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, -8.0F));
		PartDefinition bone8 = bone7.addOrReplaceChild("bone8",
				CubeListBuilder.create().texOffs(112, 150).addBox(0.3715F, -5.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(116, 150).addBox(0.3715F, -5.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(120, 150).addBox(0.3715F, -5.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(124, 150).addBox(0.3715F, -5.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(112, 148)
						.addBox(0.3715F, -6.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(116, 148).addBox(0.3715F, -6.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(120, 148)
						.addBox(0.3715F, -6.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(124, 148).addBox(0.3715F, -6.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(112, 146)
						.addBox(0.3715F, -7.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(116, 146).addBox(0.3715F, -7.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(120, 146)
						.addBox(0.3715F, -7.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(124, 146).addBox(0.3715F, -7.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(112, 144)
						.addBox(0.3715F, -8.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(116, 144).addBox(0.3715F, -8.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(120, 144)
						.addBox(0.3715F, -8.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(124, 144).addBox(0.3715F, -8.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bone9 = item2.addOrReplaceChild("bone9",
				CubeListBuilder.create().texOffs(128, 150).addBox(0.3715F, -5.8132F, -3.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(132, 150).addBox(0.3715F, -5.8132F, -4.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(136, 150).addBox(0.3715F, -5.8132F, -5.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(140, 150).addBox(0.3715F, -5.8132F, -6.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(128, 148)
						.addBox(0.3715F, -6.8132F, -3.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(132, 148).addBox(0.3715F, -6.8132F, -4.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(136, 148)
						.addBox(0.3715F, -6.8132F, -5.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(140, 148).addBox(0.3715F, -6.8132F, -6.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(128, 146)
						.addBox(0.3715F, -7.8132F, -3.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(132, 146).addBox(0.3715F, -7.8132F, -4.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(136, 146)
						.addBox(0.3715F, -7.8132F, -5.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(140, 146).addBox(0.3715F, -7.8132F, -6.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(128, 144)
						.addBox(0.3715F, -8.8132F, -3.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(132, 144).addBox(0.3715F, -8.8132F, -4.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(136, 144)
						.addBox(0.3715F, -8.8132F, -5.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(140, 144).addBox(0.3715F, -8.8132F, -6.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, -8.0F));
		PartDefinition bone10 = bone9.addOrReplaceChild("bone10",
				CubeListBuilder.create().texOffs(128, 150).addBox(0.3715F, -5.8132F, -3.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(132, 150).addBox(0.3715F, -5.8132F, -4.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(136, 150).addBox(0.3715F, -5.8132F, -5.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(140, 150).addBox(0.3715F, -5.8132F, -6.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(128, 148)
						.addBox(0.3715F, -6.8132F, -3.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(132, 148).addBox(0.3715F, -6.8132F, -4.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(136, 148)
						.addBox(0.3715F, -6.8132F, -5.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(140, 148).addBox(0.3715F, -6.8132F, -6.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(128, 146)
						.addBox(0.3715F, -7.8132F, -3.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(132, 146).addBox(0.3715F, -7.8132F, -4.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(136, 146)
						.addBox(0.3715F, -7.8132F, -5.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(140, 146).addBox(0.3715F, -7.8132F, -6.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(128, 144)
						.addBox(0.3715F, -8.8132F, -3.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(132, 144).addBox(0.3715F, -8.8132F, -4.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(136, 144)
						.addBox(0.3715F, -8.8132F, -5.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(140, 144).addBox(0.3715F, -8.8132F, -6.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bone11 = item2.addOrReplaceChild("bone11",
				CubeListBuilder.create().texOffs(144, 150).addBox(0.3715F, -5.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(148, 150).addBox(0.3715F, -5.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(152, 150).addBox(0.3715F, -5.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 150).addBox(0.3715F, -5.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 148)
						.addBox(0.3715F, -6.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(148, 148).addBox(0.3715F, -6.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(152, 148)
						.addBox(0.3715F, -6.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 148).addBox(0.3715F, -6.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 146)
						.addBox(0.3715F, -7.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(148, 146).addBox(0.3715F, -7.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(152, 146)
						.addBox(0.3715F, -7.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 146).addBox(0.3715F, -7.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 144)
						.addBox(0.3715F, -8.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(148, 144).addBox(0.3715F, -8.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(152, 144)
						.addBox(0.3715F, -8.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 144).addBox(0.3715F, -8.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, -8.0F));
		PartDefinition bone12 = bone11.addOrReplaceChild("bone12",
				CubeListBuilder.create().texOffs(144, 150).addBox(0.3715F, -5.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(148, 150).addBox(0.3715F, -5.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(152, 150).addBox(0.3715F, -5.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 150).addBox(0.3715F, -5.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 148)
						.addBox(0.3715F, -6.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(148, 148).addBox(0.3715F, -6.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(152, 148)
						.addBox(0.3715F, -6.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 148).addBox(0.3715F, -6.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 146)
						.addBox(0.3715F, -7.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(148, 146).addBox(0.3715F, -7.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(152, 146)
						.addBox(0.3715F, -7.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 146).addBox(0.3715F, -7.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 144)
						.addBox(0.3715F, -8.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(148, 144).addBox(0.3715F, -8.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(152, 144)
						.addBox(0.3715F, -8.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 144).addBox(0.3715F, -8.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bone13 = bone11.addOrReplaceChild("bone13",
				CubeListBuilder.create().texOffs(144, 150).addBox(0.3715F, -5.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(148, 150).addBox(0.3715F, -5.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(152, 150).addBox(0.3715F, -5.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 150).addBox(0.3715F, -5.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 148)
						.addBox(0.3715F, -6.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(148, 148).addBox(0.3715F, -6.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(152, 148)
						.addBox(0.3715F, -6.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 148).addBox(0.3715F, -6.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 146)
						.addBox(0.3715F, -7.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(148, 146).addBox(0.3715F, -7.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(152, 146)
						.addBox(0.3715F, -7.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 146).addBox(0.3715F, -7.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 144)
						.addBox(0.3715F, -8.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(148, 144).addBox(0.3715F, -8.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(152, 144)
						.addBox(0.3715F, -8.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 144).addBox(0.3715F, -8.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bone14 = bone13.addOrReplaceChild("bone14",
				CubeListBuilder.create().texOffs(144, 150).addBox(0.3715F, -5.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(148, 150).addBox(0.3715F, -5.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(152, 150).addBox(0.3715F, -5.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 150).addBox(0.3715F, -5.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 148)
						.addBox(0.3715F, -6.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(148, 148).addBox(0.3715F, -6.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(152, 148)
						.addBox(0.3715F, -6.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 148).addBox(0.3715F, -6.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 146)
						.addBox(0.3715F, -7.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(148, 146).addBox(0.3715F, -7.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(152, 146)
						.addBox(0.3715F, -7.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 146).addBox(0.3715F, -7.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 144)
						.addBox(0.3715F, -8.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(148, 144).addBox(0.3715F, -8.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(152, 144)
						.addBox(0.3715F, -8.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 144).addBox(0.3715F, -8.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bone15 = item2.addOrReplaceChild("bone15",
				CubeListBuilder.create().texOffs(160, 150).addBox(0.3715F, -5.8132F, -11.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(164, 150).addBox(0.3715F, -5.8132F, -12.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(168, 150).addBox(0.3715F, -5.8132F, -13.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(172, 150).addBox(0.3715F, -5.8132F, -14.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(160, 148)
						.addBox(0.3715F, -6.8132F, -11.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(164, 148).addBox(0.3715F, -6.8132F, -12.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(168, 148)
						.addBox(0.3715F, -6.8132F, -13.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(172, 148).addBox(0.3715F, -6.8132F, -14.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(160, 146)
						.addBox(0.3715F, -7.8132F, -11.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(164, 146).addBox(0.3715F, -7.8132F, -12.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(168, 146)
						.addBox(0.3715F, -7.8132F, -13.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(172, 146).addBox(0.3715F, -7.8132F, -14.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(160, 144)
						.addBox(0.3715F, -8.8132F, -11.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(164, 144).addBox(0.3715F, -8.8132F, -12.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(168, 144)
						.addBox(0.3715F, -8.8132F, -13.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(172, 144).addBox(0.3715F, -8.8132F, -14.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, -8.0F));
		PartDefinition bone16 = bone15.addOrReplaceChild("bone16",
				CubeListBuilder.create().texOffs(160, 150).addBox(0.3715F, -5.8132F, -11.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(164, 150).addBox(0.3715F, -5.8132F, -12.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(168, 150).addBox(0.3715F, -5.8132F, -13.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(172, 150).addBox(0.3715F, -5.8132F, -14.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(160, 148)
						.addBox(0.3715F, -6.8132F, -11.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(164, 148).addBox(0.3715F, -6.8132F, -12.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(168, 148)
						.addBox(0.3715F, -6.8132F, -13.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(172, 148).addBox(0.3715F, -6.8132F, -14.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(160, 146)
						.addBox(0.3715F, -7.8132F, -11.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(164, 146).addBox(0.3715F, -7.8132F, -12.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(168, 146)
						.addBox(0.3715F, -7.8132F, -13.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(172, 146).addBox(0.3715F, -7.8132F, -14.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(160, 144)
						.addBox(0.3715F, -8.8132F, -11.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(164, 144).addBox(0.3715F, -8.8132F, -12.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(168, 144)
						.addBox(0.3715F, -8.8132F, -13.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(172, 144).addBox(0.3715F, -8.8132F, -14.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition item3 = item.addOrReplaceChild("item3", CubeListBuilder.create(), PartPose.offset(0.0F, -8.0F, 15.0F));
		PartDefinition bone17 = item3.addOrReplaceChild("bone17",
				CubeListBuilder.create().texOffs(112, 142).addBox(0.3715F, -1.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(116, 142).addBox(0.3715F, -1.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(120, 142).addBox(0.3715F, -1.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(124, 142).addBox(0.3715F, -1.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(112, 140)
						.addBox(0.3715F, -2.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(116, 140).addBox(0.3715F, -2.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(120, 140)
						.addBox(0.3715F, -2.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(124, 140).addBox(0.3715F, -2.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(112, 138)
						.addBox(0.3715F, -3.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(116, 138).addBox(0.3715F, -3.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(120, 138)
						.addBox(0.3715F, -3.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(124, 138).addBox(0.3715F, -3.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(112, 136)
						.addBox(0.3715F, -4.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(116, 136).addBox(0.3715F, -4.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(120, 136)
						.addBox(0.3715F, -4.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(124, 136).addBox(0.3715F, -4.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, -8.0F));
		PartDefinition bone18 = bone17.addOrReplaceChild("bone18",
				CubeListBuilder.create().texOffs(112, 142).addBox(0.3715F, -1.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(116, 142).addBox(0.3715F, -1.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(120, 142).addBox(0.3715F, -1.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(124, 142).addBox(0.3715F, -1.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(112, 140)
						.addBox(0.3715F, -2.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(116, 140).addBox(0.3715F, -2.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(120, 140)
						.addBox(0.3715F, -2.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(124, 140).addBox(0.3715F, -2.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(112, 138)
						.addBox(0.3715F, -3.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(116, 138).addBox(0.3715F, -3.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(120, 138)
						.addBox(0.3715F, -3.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(124, 138).addBox(0.3715F, -3.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(112, 136)
						.addBox(0.3715F, -4.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(116, 136).addBox(0.3715F, -4.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(120, 136)
						.addBox(0.3715F, -4.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(124, 136).addBox(0.3715F, -4.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bone19 = item3.addOrReplaceChild("bone19",
				CubeListBuilder.create().texOffs(128, 142).addBox(0.3715F, -1.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(132, 142).addBox(0.3715F, -1.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(136, 142).addBox(0.3715F, -1.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(140, 142).addBox(0.3715F, -1.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(128, 140)
						.addBox(0.3715F, -2.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(132, 140).addBox(0.3715F, -2.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(136, 140)
						.addBox(0.3715F, -2.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(140, 140).addBox(0.3715F, -2.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(128, 138)
						.addBox(0.3715F, -3.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(132, 138).addBox(0.3715F, -3.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(136, 138)
						.addBox(0.3715F, -3.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(140, 138).addBox(0.3715F, -3.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(128, 136)
						.addBox(0.3715F, -4.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(132, 136).addBox(0.3715F, -4.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(136, 136)
						.addBox(0.3715F, -4.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(140, 136).addBox(0.3715F, -4.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, -12.0F));
		PartDefinition bone20 = item3.addOrReplaceChild("bone20",
				CubeListBuilder.create().texOffs(144, 142).addBox(0.3715F, -1.8132F, -3.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(148, 142).addBox(0.3715F, -1.8132F, -4.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(152, 142).addBox(0.3715F, -1.8132F, -5.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 142).addBox(0.3715F, -1.8132F, -6.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 140)
						.addBox(0.3715F, -2.8132F, -3.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(148, 140).addBox(0.3715F, -2.8132F, -4.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(152, 140)
						.addBox(0.3715F, -2.8132F, -5.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 140).addBox(0.3715F, -2.8132F, -6.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 138)
						.addBox(0.3715F, -3.8132F, -3.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(148, 138).addBox(0.3715F, -3.8132F, -4.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(152, 138)
						.addBox(0.3715F, -3.8132F, -5.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 138).addBox(0.3715F, -3.8132F, -6.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 136)
						.addBox(0.3715F, -4.8132F, -3.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(148, 136).addBox(0.3715F, -4.8132F, -4.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(152, 136)
						.addBox(0.3715F, -4.8132F, -5.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 136).addBox(0.3715F, -4.8132F, -6.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, -12.0F));
		PartDefinition bone21 = item3.addOrReplaceChild("bone21",
				CubeListBuilder.create().texOffs(160, 142).addBox(0.3715F, -1.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(164, 142).addBox(0.3715F, -1.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(168, 142).addBox(0.3715F, -1.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(172, 142).addBox(0.3715F, -1.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(160, 140)
						.addBox(0.3715F, -2.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(164, 140).addBox(0.3715F, -2.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(168, 140)
						.addBox(0.3715F, -2.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(172, 140).addBox(0.3715F, -2.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(160, 138)
						.addBox(0.3715F, -3.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(164, 138).addBox(0.3715F, -3.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(168, 138)
						.addBox(0.3715F, -3.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(172, 138).addBox(0.3715F, -3.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(160, 136)
						.addBox(0.3715F, -4.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(164, 136).addBox(0.3715F, -4.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(168, 136)
						.addBox(0.3715F, -4.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(172, 136).addBox(0.3715F, -4.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, -12.0F));
		PartDefinition bone22 = item3.addOrReplaceChild("bone22",
				CubeListBuilder.create().texOffs(112, 134).addBox(0.3715F, -5.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(116, 134).addBox(0.3715F, -5.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(120, 134).addBox(0.3715F, -5.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(124, 134).addBox(0.3715F, -5.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(112, 132)
						.addBox(0.3715F, -6.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(116, 132).addBox(0.3715F, -6.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(120, 132)
						.addBox(0.3715F, -6.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(124, 132).addBox(0.3715F, -6.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(112, 130)
						.addBox(0.3715F, -7.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(116, 130).addBox(0.3715F, -7.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(120, 130)
						.addBox(0.3715F, -7.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(124, 130).addBox(0.3715F, -7.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(112, 128)
						.addBox(0.3715F, -8.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(116, 128).addBox(0.3715F, -8.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(120, 128)
						.addBox(0.3715F, -8.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(124, 128).addBox(0.3715F, -8.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, -8.0F));
		PartDefinition bone23 = bone22.addOrReplaceChild("bone23",
				CubeListBuilder.create().texOffs(112, 134).addBox(0.3715F, -5.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(116, 134).addBox(0.3715F, -5.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(120, 134).addBox(0.3715F, -5.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(124, 134).addBox(0.3715F, -5.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(112, 132)
						.addBox(0.3715F, -6.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(116, 132).addBox(0.3715F, -6.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(120, 132)
						.addBox(0.3715F, -6.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(124, 132).addBox(0.3715F, -6.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(112, 130)
						.addBox(0.3715F, -7.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(116, 130).addBox(0.3715F, -7.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(120, 130)
						.addBox(0.3715F, -7.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(124, 130).addBox(0.3715F, -7.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(112, 128)
						.addBox(0.3715F, -8.8132F, 0.5676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(116, 128).addBox(0.3715F, -8.8132F, -0.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(120, 128)
						.addBox(0.3715F, -8.8132F, -1.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(124, 128).addBox(0.3715F, -8.8132F, -2.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bone24 = item3.addOrReplaceChild("bone24",
				CubeListBuilder.create().texOffs(128, 134).addBox(0.3715F, -5.8132F, -3.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(132, 134).addBox(0.3715F, -5.8132F, -4.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(136, 134).addBox(0.3715F, -5.8132F, -5.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(140, 134).addBox(0.3715F, -5.8132F, -6.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(128, 132)
						.addBox(0.3715F, -6.8132F, -3.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(132, 132).addBox(0.3715F, -6.8132F, -4.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(136, 132)
						.addBox(0.3715F, -6.8132F, -5.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(140, 132).addBox(0.3715F, -6.8132F, -6.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(128, 130)
						.addBox(0.3715F, -7.8132F, -3.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(132, 130).addBox(0.3715F, -7.8132F, -4.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(136, 130)
						.addBox(0.3715F, -7.8132F, -5.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(140, 130).addBox(0.3715F, -7.8132F, -6.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(128, 128)
						.addBox(0.3715F, -8.8132F, -3.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(132, 128).addBox(0.3715F, -8.8132F, -4.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(136, 128)
						.addBox(0.3715F, -8.8132F, -5.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(140, 128).addBox(0.3715F, -8.8132F, -6.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, -8.0F));
		PartDefinition bone25 = bone24.addOrReplaceChild("bone25",
				CubeListBuilder.create().texOffs(128, 134).addBox(0.3715F, -5.8132F, -3.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(132, 134).addBox(0.3715F, -5.8132F, -4.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(136, 134).addBox(0.3715F, -5.8132F, -5.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(140, 134).addBox(0.3715F, -5.8132F, -6.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(128, 132)
						.addBox(0.3715F, -6.8132F, -3.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(132, 132).addBox(0.3715F, -6.8132F, -4.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(136, 132)
						.addBox(0.3715F, -6.8132F, -5.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(140, 132).addBox(0.3715F, -6.8132F, -6.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(128, 130)
						.addBox(0.3715F, -7.8132F, -3.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(132, 130).addBox(0.3715F, -7.8132F, -4.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(136, 130)
						.addBox(0.3715F, -7.8132F, -5.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(140, 130).addBox(0.3715F, -7.8132F, -6.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(128, 128)
						.addBox(0.3715F, -8.8132F, -3.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(132, 128).addBox(0.3715F, -8.8132F, -4.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(136, 128)
						.addBox(0.3715F, -8.8132F, -5.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(140, 128).addBox(0.3715F, -8.8132F, -6.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bone26 = item3.addOrReplaceChild("bone26",
				CubeListBuilder.create().texOffs(144, 134).addBox(0.3715F, -5.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(148, 134).addBox(0.3715F, -5.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(152, 134).addBox(0.3715F, -5.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 134).addBox(0.3715F, -5.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 132)
						.addBox(0.3715F, -6.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(148, 132).addBox(0.3715F, -6.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(152, 132)
						.addBox(0.3715F, -6.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 132).addBox(0.3715F, -6.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 130)
						.addBox(0.3715F, -7.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(148, 130).addBox(0.3715F, -7.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(152, 130)
						.addBox(0.3715F, -7.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 130).addBox(0.3715F, -7.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 128)
						.addBox(0.3715F, -8.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(148, 128).addBox(0.3715F, -8.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(152, 128)
						.addBox(0.3715F, -8.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 128).addBox(0.3715F, -8.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, -8.0F));
		PartDefinition bone27 = bone26.addOrReplaceChild("bone27",
				CubeListBuilder.create().texOffs(144, 134).addBox(0.3715F, -5.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(148, 134).addBox(0.3715F, -5.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(152, 134).addBox(0.3715F, -5.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 134).addBox(0.3715F, -5.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 132)
						.addBox(0.3715F, -6.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(148, 132).addBox(0.3715F, -6.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(152, 132)
						.addBox(0.3715F, -6.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 132).addBox(0.3715F, -6.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 130)
						.addBox(0.3715F, -7.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(148, 130).addBox(0.3715F, -7.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(152, 130)
						.addBox(0.3715F, -7.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 130).addBox(0.3715F, -7.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 128)
						.addBox(0.3715F, -8.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(148, 128).addBox(0.3715F, -8.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(152, 128)
						.addBox(0.3715F, -8.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 128).addBox(0.3715F, -8.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bone28 = bone26.addOrReplaceChild("bone28",
				CubeListBuilder.create().texOffs(144, 134).addBox(0.3715F, -5.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(148, 134).addBox(0.3715F, -5.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(152, 134).addBox(0.3715F, -5.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 134).addBox(0.3715F, -5.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 132)
						.addBox(0.3715F, -6.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(148, 132).addBox(0.3715F, -6.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(152, 132)
						.addBox(0.3715F, -6.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 132).addBox(0.3715F, -6.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 130)
						.addBox(0.3715F, -7.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(148, 130).addBox(0.3715F, -7.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(152, 130)
						.addBox(0.3715F, -7.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 130).addBox(0.3715F, -7.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 128)
						.addBox(0.3715F, -8.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(148, 128).addBox(0.3715F, -8.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(152, 128)
						.addBox(0.3715F, -8.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 128).addBox(0.3715F, -8.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bone29 = bone28.addOrReplaceChild("bone29",
				CubeListBuilder.create().texOffs(144, 134).addBox(0.3715F, -5.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(148, 134).addBox(0.3715F, -5.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(152, 134).addBox(0.3715F, -5.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 134).addBox(0.3715F, -5.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 132)
						.addBox(0.3715F, -6.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(148, 132).addBox(0.3715F, -6.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(152, 132)
						.addBox(0.3715F, -6.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 132).addBox(0.3715F, -6.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 130)
						.addBox(0.3715F, -7.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(148, 130).addBox(0.3715F, -7.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(152, 130)
						.addBox(0.3715F, -7.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 130).addBox(0.3715F, -7.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 128)
						.addBox(0.3715F, -8.8132F, -7.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(148, 128).addBox(0.3715F, -8.8132F, -8.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(152, 128)
						.addBox(0.3715F, -8.8132F, -9.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(156, 128).addBox(0.3715F, -8.8132F, -10.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bone30 = item3.addOrReplaceChild("bone30",
				CubeListBuilder.create().texOffs(160, 134).addBox(0.3715F, -5.8132F, -11.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(164, 134).addBox(0.3715F, -5.8132F, -12.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(168, 134).addBox(0.3715F, -5.8132F, -13.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(172, 134).addBox(0.3715F, -5.8132F, -14.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(160, 132)
						.addBox(0.3715F, -6.8132F, -11.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(164, 132).addBox(0.3715F, -6.8132F, -12.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(168, 132)
						.addBox(0.3715F, -6.8132F, -13.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(172, 132).addBox(0.3715F, -6.8132F, -14.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(160, 130)
						.addBox(0.3715F, -7.8132F, -11.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(164, 130).addBox(0.3715F, -7.8132F, -12.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(168, 130)
						.addBox(0.3715F, -7.8132F, -13.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(172, 130).addBox(0.3715F, -7.8132F, -14.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(160, 128)
						.addBox(0.3715F, -8.8132F, -11.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(164, 128).addBox(0.3715F, -8.8132F, -12.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(168, 128)
						.addBox(0.3715F, -8.8132F, -13.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(172, 128).addBox(0.3715F, -8.8132F, -14.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, -8.0F));
		PartDefinition bone31 = bone30.addOrReplaceChild("bone31",
				CubeListBuilder.create().texOffs(160, 134).addBox(0.3715F, -5.8132F, -11.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(164, 134).addBox(0.3715F, -5.8132F, -12.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(168, 134).addBox(0.3715F, -5.8132F, -13.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(172, 134).addBox(0.3715F, -5.8132F, -14.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(160, 132)
						.addBox(0.3715F, -6.8132F, -11.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(164, 132).addBox(0.3715F, -6.8132F, -12.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(168, 132)
						.addBox(0.3715F, -6.8132F, -13.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(172, 132).addBox(0.3715F, -6.8132F, -14.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(160, 130)
						.addBox(0.3715F, -7.8132F, -11.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(164, 130).addBox(0.3715F, -7.8132F, -12.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(168, 130)
						.addBox(0.3715F, -7.8132F, -13.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(172, 130).addBox(0.3715F, -7.8132F, -14.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(160, 128)
						.addBox(0.3715F, -8.8132F, -11.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(164, 128).addBox(0.3715F, -8.8132F, -12.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(168, 128)
						.addBox(0.3715F, -8.8132F, -13.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(172, 128).addBox(0.3715F, -8.8132F, -14.4324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(0, 98).addBox(0.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.2F)).texOffs(32, 160).mirror().addBox(0.0F, -2.0F, -2.0F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(4.0F, 2.0F, 0.0F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(8, 98).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.4F)),
				PartPose.offsetAndRotation(-1.9F, 11.5F, 0.0F, 0.0F, 0.0F, 0.0349F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(0, 98).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.4F)),
				PartPose.offsetAndRotation(1.9F, 11.5F, 0.0F, 0.0F, 0.0F, -0.0349F));
		return LayerDefinition.create(meshdefinition, 176, 176);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}
