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
public class Modelminer<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("truedarkness", "modelminer"), "main");
	public final ModelPart Head;
	public final ModelPart Body;
	public final ModelPart RightArm;
	public final ModelPart LeftArm;
	public final ModelPart RightLeg;
	public final ModelPart LeftLeg;

	public Modelminer(ModelPart root) {
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
		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(32, 0)
				.addBox(-4.0F, -7.6F, -4.0F, 8.0F, 6.0F, 8.0F, new CubeDeformation(0.5F)).texOffs(0, 16).addBox(-4.0F, -16.0F, -1.0F, 8.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1047F, 0.0873F, 0.0F));
		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 32)
				.addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)).texOffs(104, 63).addBox(-6.9F, 0.5F, -3.0F, 6.0F, 10.0F, 6.0F, new CubeDeformation(0.25F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(40, 32).addBox(-1.5F, -1.0F, -1.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.0F, 2.0F, 0.0F));
		PartDefinition item = RightArm.addOrReplaceChild("item", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 14.0F, 0.0F, 0.7854F, 0.0F, 0.0F));
		PartDefinition item2 = item.addOrReplaceChild("item2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 15.0F));
		PartDefinition bone2 = item2.addOrReplaceChild("bone2",
				CubeListBuilder.create().texOffs(64, 46).addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 46).addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(72, 46)
						.addBox(0.0F, -1.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(76, 46).addBox(0.0F, -1.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(64, 44)
						.addBox(0.0F, -2.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 44).addBox(0.0F, -2.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(72, 44)
						.addBox(0.0F, -2.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(76, 44).addBox(0.0F, -2.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(64, 42)
						.addBox(0.0F, -3.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 42).addBox(0.0F, -3.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(72, 42)
						.addBox(0.0F, -3.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(76, 42).addBox(0.0F, -3.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(64, 40)
						.addBox(0.0F, -4.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 40).addBox(0.0F, -4.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(72, 40)
						.addBox(0.0F, -4.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(76, 40).addBox(0.0F, -4.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, -8.0F));
		PartDefinition bone3 = bone2.addOrReplaceChild("bone3",
				CubeListBuilder.create().texOffs(64, 46).addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 46).addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(72, 46)
						.addBox(0.0F, -1.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(76, 46).addBox(0.0F, -1.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(64, 44)
						.addBox(0.0F, -2.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 44).addBox(0.0F, -2.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(72, 44)
						.addBox(0.0F, -2.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(76, 44).addBox(0.0F, -2.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(64, 42)
						.addBox(0.0F, -3.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 42).addBox(0.0F, -3.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(72, 42)
						.addBox(0.0F, -3.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(76, 42).addBox(0.0F, -3.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(64, 40)
						.addBox(0.0F, -4.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 40).addBox(0.0F, -4.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(72, 40)
						.addBox(0.0F, -4.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(76, 40).addBox(0.0F, -4.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bone4 = item2.addOrReplaceChild("bone4",
				CubeListBuilder.create().texOffs(80, 46).addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(84, 46).addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(88, 46)
						.addBox(0.0F, -1.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(92, 46).addBox(0.0F, -1.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(80, 44)
						.addBox(0.0F, -2.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(84, 44).addBox(0.0F, -2.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(88, 44)
						.addBox(0.0F, -2.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(92, 44).addBox(0.0F, -2.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(80, 42)
						.addBox(0.0F, -3.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(84, 42).addBox(0.0F, -3.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(88, 42)
						.addBox(0.0F, -3.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(92, 42).addBox(0.0F, -3.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(80, 40)
						.addBox(0.0F, -4.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(84, 40).addBox(0.0F, -4.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(88, 40)
						.addBox(0.0F, -4.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(92, 40).addBox(0.0F, -4.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, -12.0F));
		PartDefinition bone5 = item2.addOrReplaceChild("bone5",
				CubeListBuilder.create().texOffs(96, 46).addBox(0.0F, -1.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(100, 46).addBox(0.0F, -1.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(104, 46)
						.addBox(0.0F, -1.0F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(108, 46).addBox(0.0F, -1.0F, -7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(96, 44)
						.addBox(0.0F, -2.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(100, 44).addBox(0.0F, -2.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(104, 44)
						.addBox(0.0F, -2.0F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(108, 44).addBox(0.0F, -2.0F, -7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(96, 42)
						.addBox(0.0F, -3.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(100, 42).addBox(0.0F, -3.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(104, 42)
						.addBox(0.0F, -3.0F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(108, 42).addBox(0.0F, -3.0F, -7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(96, 40)
						.addBox(0.0F, -4.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(100, 40).addBox(0.0F, -4.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(104, 40)
						.addBox(0.0F, -4.0F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(108, 40).addBox(0.0F, -4.0F, -7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, -12.0F));
		PartDefinition bone6 = item2.addOrReplaceChild("bone6",
				CubeListBuilder.create().texOffs(112, 46).addBox(0.0F, -1.0F, -8.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(116, 46).addBox(0.0F, -1.0F, -9.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(120, 46)
						.addBox(0.0F, -1.0F, -10.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(124, 46).addBox(0.0F, -1.0F, -11.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(112, 44)
						.addBox(0.0F, -2.0F, -8.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(116, 44).addBox(0.0F, -2.0F, -9.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(120, 44)
						.addBox(0.0F, -2.0F, -10.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(124, 44).addBox(0.0F, -2.0F, -11.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(112, 42)
						.addBox(0.0F, -3.0F, -8.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(116, 42).addBox(0.0F, -3.0F, -9.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(120, 42)
						.addBox(0.0F, -3.0F, -10.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(124, 42).addBox(0.0F, -3.0F, -11.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(112, 40)
						.addBox(0.0F, -4.0F, -8.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(116, 40).addBox(0.0F, -4.0F, -9.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(120, 40)
						.addBox(0.0F, -4.0F, -10.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(124, 40).addBox(0.0F, -4.0F, -11.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, -12.0F));
		PartDefinition bone7 = item2.addOrReplaceChild("bone7",
				CubeListBuilder.create().texOffs(64, 38).addBox(0.0F, -5.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 38).addBox(0.0F, -5.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(72, 38)
						.addBox(0.0F, -5.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(76, 38).addBox(0.0F, -5.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(64, 36)
						.addBox(0.0F, -6.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 36).addBox(0.0F, -6.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(72, 36)
						.addBox(0.0F, -6.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(76, 36).addBox(0.0F, -6.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(64, 34)
						.addBox(0.0F, -7.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 34).addBox(0.0F, -7.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(72, 34)
						.addBox(0.0F, -7.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(76, 34).addBox(0.0F, -7.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(64, 32)
						.addBox(0.0F, -8.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 32).addBox(0.0F, -8.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(72, 32)
						.addBox(0.0F, -8.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(76, 32).addBox(0.0F, -8.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, -8.0F));
		PartDefinition bone8 = bone7.addOrReplaceChild("bone8",
				CubeListBuilder.create().texOffs(64, 38).addBox(0.0F, -5.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 38).addBox(0.0F, -5.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(72, 38)
						.addBox(0.0F, -5.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(76, 38).addBox(0.0F, -5.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(64, 36)
						.addBox(0.0F, -6.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 36).addBox(0.0F, -6.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(72, 36)
						.addBox(0.0F, -6.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(76, 36).addBox(0.0F, -6.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(64, 34)
						.addBox(0.0F, -7.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 34).addBox(0.0F, -7.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(72, 34)
						.addBox(0.0F, -7.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(76, 34).addBox(0.0F, -7.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(64, 32)
						.addBox(0.0F, -8.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 32).addBox(0.0F, -8.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(72, 32)
						.addBox(0.0F, -8.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(76, 32).addBox(0.0F, -8.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bone9 = item2.addOrReplaceChild("bone9",
				CubeListBuilder.create().texOffs(80, 38).addBox(0.0F, -5.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(84, 38).addBox(0.0F, -5.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(88, 38)
						.addBox(0.0F, -5.0F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(92, 38).addBox(0.0F, -5.0F, -7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(80, 36)
						.addBox(0.0F, -6.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(84, 36).addBox(0.0F, -6.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(88, 36)
						.addBox(0.0F, -6.0F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(92, 36).addBox(0.0F, -6.0F, -7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(80, 34)
						.addBox(0.0F, -7.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(84, 34).addBox(0.0F, -7.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(88, 34)
						.addBox(0.0F, -7.0F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(92, 34).addBox(0.0F, -7.0F, -7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(80, 32)
						.addBox(0.0F, -8.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(84, 32).addBox(0.0F, -8.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(88, 32)
						.addBox(0.0F, -8.0F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(92, 32).addBox(0.0F, -8.0F, -7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, -8.0F));
		PartDefinition bone10 = bone9.addOrReplaceChild("bone10",
				CubeListBuilder.create().texOffs(80, 38).addBox(0.0F, -5.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(84, 38).addBox(0.0F, -5.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(88, 38)
						.addBox(0.0F, -5.0F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(92, 38).addBox(0.0F, -5.0F, -7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(80, 36)
						.addBox(0.0F, -6.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(84, 36).addBox(0.0F, -6.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(88, 36)
						.addBox(0.0F, -6.0F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(92, 36).addBox(0.0F, -6.0F, -7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(80, 34)
						.addBox(0.0F, -7.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(84, 34).addBox(0.0F, -7.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(88, 34)
						.addBox(0.0F, -7.0F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(92, 34).addBox(0.0F, -7.0F, -7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(80, 32)
						.addBox(0.0F, -8.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(84, 32).addBox(0.0F, -8.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(88, 32)
						.addBox(0.0F, -8.0F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(92, 32).addBox(0.0F, -8.0F, -7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bone11 = item2.addOrReplaceChild("bone11",
				CubeListBuilder.create().texOffs(96, 38).addBox(0.0F, -5.0F, -8.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(100, 38).addBox(0.0F, -5.0F, -9.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(104, 38)
						.addBox(0.0F, -5.0F, -10.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(108, 38).addBox(0.0F, -5.0F, -11.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(96, 36)
						.addBox(0.0F, -6.0F, -8.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(100, 36).addBox(0.0F, -6.0F, -9.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(104, 36)
						.addBox(0.0F, -6.0F, -10.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(108, 36).addBox(0.0F, -6.0F, -11.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(96, 34)
						.addBox(0.0F, -7.0F, -8.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(100, 34).addBox(0.0F, -7.0F, -9.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(104, 34)
						.addBox(0.0F, -7.0F, -10.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(108, 34).addBox(0.0F, -7.0F, -11.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(96, 32)
						.addBox(0.0F, -8.0F, -8.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(100, 32).addBox(0.0F, -8.0F, -9.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(104, 32)
						.addBox(0.0F, -8.0F, -10.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(108, 32).addBox(0.0F, -8.0F, -11.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, -8.0F));
		PartDefinition bone12 = bone11.addOrReplaceChild("bone12",
				CubeListBuilder.create().texOffs(96, 38).addBox(0.0F, -5.0F, -8.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(100, 38).addBox(0.0F, -5.0F, -9.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(104, 38)
						.addBox(0.0F, -5.0F, -10.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(108, 38).addBox(0.0F, -5.0F, -11.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(96, 36)
						.addBox(0.0F, -6.0F, -8.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(100, 36).addBox(0.0F, -6.0F, -9.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(104, 36)
						.addBox(0.0F, -6.0F, -10.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(108, 36).addBox(0.0F, -6.0F, -11.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(96, 34)
						.addBox(0.0F, -7.0F, -8.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(100, 34).addBox(0.0F, -7.0F, -9.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(104, 34)
						.addBox(0.0F, -7.0F, -10.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(108, 34).addBox(0.0F, -7.0F, -11.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(96, 32)
						.addBox(0.0F, -8.0F, -8.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(100, 32).addBox(0.0F, -8.0F, -9.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(104, 32)
						.addBox(0.0F, -8.0F, -10.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(108, 32).addBox(0.0F, -8.0F, -11.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bone13 = bone11.addOrReplaceChild("bone13",
				CubeListBuilder.create().texOffs(96, 38).addBox(0.0F, -5.0F, -8.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(100, 38).addBox(0.0F, -5.0F, -9.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(104, 38)
						.addBox(0.0F, -5.0F, -10.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(108, 38).addBox(0.0F, -5.0F, -11.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(96, 36)
						.addBox(0.0F, -6.0F, -8.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(100, 36).addBox(0.0F, -6.0F, -9.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(104, 36)
						.addBox(0.0F, -6.0F, -10.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(108, 36).addBox(0.0F, -6.0F, -11.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(96, 34)
						.addBox(0.0F, -7.0F, -8.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(100, 34).addBox(0.0F, -7.0F, -9.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(104, 34)
						.addBox(0.0F, -7.0F, -10.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(108, 34).addBox(0.0F, -7.0F, -11.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(96, 32)
						.addBox(0.0F, -8.0F, -8.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(100, 32).addBox(0.0F, -8.0F, -9.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(104, 32)
						.addBox(0.0F, -8.0F, -10.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(108, 32).addBox(0.0F, -8.0F, -11.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bone14 = bone13.addOrReplaceChild("bone14",
				CubeListBuilder.create().texOffs(96, 38).addBox(0.0F, -5.0F, -8.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(100, 38).addBox(0.0F, -5.0F, -9.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(104, 38)
						.addBox(0.0F, -5.0F, -10.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(108, 38).addBox(0.0F, -5.0F, -11.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(96, 36)
						.addBox(0.0F, -6.0F, -8.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(100, 36).addBox(0.0F, -6.0F, -9.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(104, 36)
						.addBox(0.0F, -6.0F, -10.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(108, 36).addBox(0.0F, -6.0F, -11.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(96, 34)
						.addBox(0.0F, -7.0F, -8.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(100, 34).addBox(0.0F, -7.0F, -9.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(104, 34)
						.addBox(0.0F, -7.0F, -10.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(108, 34).addBox(0.0F, -7.0F, -11.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(96, 32)
						.addBox(0.0F, -8.0F, -8.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(100, 32).addBox(0.0F, -8.0F, -9.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(104, 32)
						.addBox(0.0F, -8.0F, -10.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(108, 32).addBox(0.0F, -8.0F, -11.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bone15 = item2.addOrReplaceChild("bone15",
				CubeListBuilder.create().texOffs(112, 38).addBox(0.0F, -5.0F, -12.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(116, 38).addBox(0.0F, -5.0F, -13.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(120, 38)
						.addBox(0.0F, -5.0F, -14.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(124, 38).addBox(0.0F, -5.0F, -15.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(112, 36)
						.addBox(0.0F, -6.0F, -12.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(116, 36).addBox(0.0F, -6.0F, -13.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(120, 36)
						.addBox(0.0F, -6.0F, -14.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(124, 36).addBox(0.0F, -6.0F, -15.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(112, 34)
						.addBox(0.0F, -7.0F, -12.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(116, 34).addBox(0.0F, -7.0F, -13.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(120, 34)
						.addBox(0.0F, -7.0F, -14.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(124, 34).addBox(0.0F, -7.0F, -15.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(112, 32)
						.addBox(0.0F, -8.0F, -12.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(116, 32).addBox(0.0F, -8.0F, -13.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(120, 32)
						.addBox(0.0F, -8.0F, -14.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(124, 32).addBox(0.0F, -8.0F, -15.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, -8.0F));
		PartDefinition bone16 = bone15.addOrReplaceChild("bone16",
				CubeListBuilder.create().texOffs(112, 38).addBox(0.0F, -5.0F, -12.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(116, 38).addBox(0.0F, -5.0F, -13.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(120, 38)
						.addBox(0.0F, -5.0F, -14.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(124, 38).addBox(0.0F, -5.0F, -15.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(112, 36)
						.addBox(0.0F, -6.0F, -12.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(116, 36).addBox(0.0F, -6.0F, -13.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(120, 36)
						.addBox(0.0F, -6.0F, -14.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(124, 36).addBox(0.0F, -6.0F, -15.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(112, 34)
						.addBox(0.0F, -7.0F, -12.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(116, 34).addBox(0.0F, -7.0F, -13.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(120, 34)
						.addBox(0.0F, -7.0F, -14.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(124, 34).addBox(0.0F, -7.0F, -15.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(112, 32)
						.addBox(0.0F, -8.0F, -12.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(116, 32).addBox(0.0F, -8.0F, -13.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(120, 32)
						.addBox(0.0F, -8.0F, -14.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(124, 32).addBox(0.0F, -8.0F, -15.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition item3 = item.addOrReplaceChild("item3", CubeListBuilder.create(), PartPose.offset(0.0F, -8.0F, 15.0F));
		PartDefinition bone17 = item3.addOrReplaceChild("bone17",
				CubeListBuilder.create().texOffs(64, 30).addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 30).addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(72, 30)
						.addBox(0.0F, -1.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(76, 30).addBox(0.0F, -1.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(64, 28)
						.addBox(0.0F, -2.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 28).addBox(0.0F, -2.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(72, 28)
						.addBox(0.0F, -2.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(76, 28).addBox(0.0F, -2.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(64, 26)
						.addBox(0.0F, -3.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 26).addBox(0.0F, -3.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(72, 26)
						.addBox(0.0F, -3.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(76, 26).addBox(0.0F, -3.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(64, 24)
						.addBox(0.0F, -4.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 24).addBox(0.0F, -4.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(72, 24)
						.addBox(0.0F, -4.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(76, 24).addBox(0.0F, -4.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, -8.0F));
		PartDefinition bone18 = bone17.addOrReplaceChild("bone18",
				CubeListBuilder.create().texOffs(64, 30).addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 30).addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(72, 30)
						.addBox(0.0F, -1.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(76, 30).addBox(0.0F, -1.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(64, 28)
						.addBox(0.0F, -2.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 28).addBox(0.0F, -2.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(72, 28)
						.addBox(0.0F, -2.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(76, 28).addBox(0.0F, -2.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(64, 26)
						.addBox(0.0F, -3.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 26).addBox(0.0F, -3.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(72, 26)
						.addBox(0.0F, -3.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(76, 26).addBox(0.0F, -3.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(64, 24)
						.addBox(0.0F, -4.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 24).addBox(0.0F, -4.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(72, 24)
						.addBox(0.0F, -4.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(76, 24).addBox(0.0F, -4.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bone19 = item3.addOrReplaceChild("bone19",
				CubeListBuilder.create().texOffs(80, 30).addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(84, 30).addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(88, 30)
						.addBox(0.0F, -1.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(92, 30).addBox(0.0F, -1.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(80, 28)
						.addBox(0.0F, -2.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(84, 28).addBox(0.0F, -2.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(88, 28)
						.addBox(0.0F, -2.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(92, 28).addBox(0.0F, -2.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(80, 26)
						.addBox(0.0F, -3.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(84, 26).addBox(0.0F, -3.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(88, 26)
						.addBox(0.0F, -3.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(92, 26).addBox(0.0F, -3.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(80, 24)
						.addBox(0.0F, -4.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(84, 24).addBox(0.0F, -4.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(88, 24)
						.addBox(0.0F, -4.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(92, 24).addBox(0.0F, -4.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, -12.0F));
		PartDefinition bone20 = item3.addOrReplaceChild("bone20",
				CubeListBuilder.create().texOffs(96, 30).addBox(0.0F, -1.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(100, 30).addBox(0.0F, -1.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(104, 30)
						.addBox(0.0F, -1.0F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(108, 30).addBox(0.0F, -1.0F, -7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(96, 28)
						.addBox(0.0F, -2.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(100, 28).addBox(0.0F, -2.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(104, 28)
						.addBox(0.0F, -2.0F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(108, 28).addBox(0.0F, -2.0F, -7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(96, 26)
						.addBox(0.0F, -3.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(100, 26).addBox(0.0F, -3.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(104, 26)
						.addBox(0.0F, -3.0F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(108, 26).addBox(0.0F, -3.0F, -7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(96, 24)
						.addBox(0.0F, -4.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(100, 24).addBox(0.0F, -4.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(104, 24)
						.addBox(0.0F, -4.0F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(108, 24).addBox(0.0F, -4.0F, -7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, -12.0F));
		PartDefinition bone21 = item3.addOrReplaceChild("bone21",
				CubeListBuilder.create().texOffs(112, 30).addBox(0.0F, -1.0F, -8.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(116, 30).addBox(0.0F, -1.0F, -9.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(120, 30)
						.addBox(0.0F, -1.0F, -10.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(124, 30).addBox(0.0F, -1.0F, -11.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(112, 28)
						.addBox(0.0F, -2.0F, -8.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(116, 28).addBox(0.0F, -2.0F, -9.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(120, 28)
						.addBox(0.0F, -2.0F, -10.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(124, 28).addBox(0.0F, -2.0F, -11.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(112, 26)
						.addBox(0.0F, -3.0F, -8.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(116, 26).addBox(0.0F, -3.0F, -9.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(120, 26)
						.addBox(0.0F, -3.0F, -10.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(124, 26).addBox(0.0F, -3.0F, -11.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(112, 24)
						.addBox(0.0F, -4.0F, -8.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(116, 24).addBox(0.0F, -4.0F, -9.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(120, 24)
						.addBox(0.0F, -4.0F, -10.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(124, 24).addBox(0.0F, -4.0F, -11.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, -12.0F));
		PartDefinition bone22 = item3.addOrReplaceChild("bone22",
				CubeListBuilder.create().texOffs(64, 22).addBox(0.0F, -5.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 22).addBox(0.0F, -5.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(72, 22)
						.addBox(0.0F, -5.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(76, 22).addBox(0.0F, -5.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(64, 20)
						.addBox(0.0F, -6.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 20).addBox(0.0F, -6.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(72, 20)
						.addBox(0.0F, -6.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(76, 20).addBox(0.0F, -6.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(64, 18)
						.addBox(0.0F, -7.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 18).addBox(0.0F, -7.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(72, 18)
						.addBox(0.0F, -7.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(76, 18).addBox(0.0F, -7.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(64, 16)
						.addBox(0.0F, -8.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 16).addBox(0.0F, -8.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(72, 16)
						.addBox(0.0F, -8.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(76, 16).addBox(0.0F, -8.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, -8.0F));
		PartDefinition bone23 = bone22.addOrReplaceChild("bone23",
				CubeListBuilder.create().texOffs(64, 22).addBox(0.0F, -5.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 22).addBox(0.0F, -5.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(72, 22)
						.addBox(0.0F, -5.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(76, 22).addBox(0.0F, -5.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(64, 20)
						.addBox(0.0F, -6.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 20).addBox(0.0F, -6.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(72, 20)
						.addBox(0.0F, -6.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(76, 20).addBox(0.0F, -6.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(64, 18)
						.addBox(0.0F, -7.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 18).addBox(0.0F, -7.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(72, 18)
						.addBox(0.0F, -7.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(76, 18).addBox(0.0F, -7.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(64, 16)
						.addBox(0.0F, -8.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 16).addBox(0.0F, -8.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(72, 16)
						.addBox(0.0F, -8.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(76, 16).addBox(0.0F, -8.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bone24 = item3.addOrReplaceChild("bone24",
				CubeListBuilder.create().texOffs(80, 22).addBox(0.0F, -5.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(84, 22).addBox(0.0F, -5.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(88, 22)
						.addBox(0.0F, -5.0F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(92, 22).addBox(0.0F, -5.0F, -7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(80, 20)
						.addBox(0.0F, -6.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(84, 20).addBox(0.0F, -6.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(88, 20)
						.addBox(0.0F, -6.0F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(92, 20).addBox(0.0F, -6.0F, -7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(80, 18)
						.addBox(0.0F, -7.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(84, 18).addBox(0.0F, -7.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(88, 18)
						.addBox(0.0F, -7.0F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(92, 18).addBox(0.0F, -7.0F, -7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(80, 16)
						.addBox(0.0F, -8.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(84, 16).addBox(0.0F, -8.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(88, 16)
						.addBox(0.0F, -8.0F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(92, 16).addBox(0.0F, -8.0F, -7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, -8.0F));
		PartDefinition bone25 = bone24.addOrReplaceChild("bone25",
				CubeListBuilder.create().texOffs(80, 22).addBox(0.0F, -5.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(84, 22).addBox(0.0F, -5.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(88, 22)
						.addBox(0.0F, -5.0F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(92, 22).addBox(0.0F, -5.0F, -7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(80, 20)
						.addBox(0.0F, -6.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(84, 20).addBox(0.0F, -6.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(88, 20)
						.addBox(0.0F, -6.0F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(92, 20).addBox(0.0F, -6.0F, -7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(80, 18)
						.addBox(0.0F, -7.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(84, 18).addBox(0.0F, -7.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(88, 18)
						.addBox(0.0F, -7.0F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(92, 18).addBox(0.0F, -7.0F, -7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(80, 16)
						.addBox(0.0F, -8.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(84, 16).addBox(0.0F, -8.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(88, 16)
						.addBox(0.0F, -8.0F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(92, 16).addBox(0.0F, -8.0F, -7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bone26 = item3.addOrReplaceChild("bone26",
				CubeListBuilder.create().texOffs(96, 22).addBox(0.0F, -5.0F, -8.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(100, 22).addBox(0.0F, -5.0F, -9.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(104, 22)
						.addBox(0.0F, -5.0F, -10.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(108, 22).addBox(0.0F, -5.0F, -11.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(96, 20)
						.addBox(0.0F, -6.0F, -8.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(100, 20).addBox(0.0F, -6.0F, -9.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(104, 20)
						.addBox(0.0F, -6.0F, -10.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(108, 20).addBox(0.0F, -6.0F, -11.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(96, 18)
						.addBox(0.0F, -7.0F, -8.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(100, 18).addBox(0.0F, -7.0F, -9.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(104, 18)
						.addBox(0.0F, -7.0F, -10.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(108, 18).addBox(0.0F, -7.0F, -11.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(96, 16)
						.addBox(0.0F, -8.0F, -8.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(100, 16).addBox(0.0F, -8.0F, -9.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(104, 16)
						.addBox(0.0F, -8.0F, -10.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(108, 16).addBox(0.0F, -8.0F, -11.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, -8.0F));
		PartDefinition bone27 = bone26.addOrReplaceChild("bone27",
				CubeListBuilder.create().texOffs(96, 22).addBox(0.0F, -5.0F, -8.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(100, 22).addBox(0.0F, -5.0F, -9.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(104, 22)
						.addBox(0.0F, -5.0F, -10.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(108, 22).addBox(0.0F, -5.0F, -11.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(96, 20)
						.addBox(0.0F, -6.0F, -8.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(100, 20).addBox(0.0F, -6.0F, -9.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(104, 20)
						.addBox(0.0F, -6.0F, -10.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(108, 20).addBox(0.0F, -6.0F, -11.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(96, 18)
						.addBox(0.0F, -7.0F, -8.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(100, 18).addBox(0.0F, -7.0F, -9.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(104, 18)
						.addBox(0.0F, -7.0F, -10.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(108, 18).addBox(0.0F, -7.0F, -11.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(96, 16)
						.addBox(0.0F, -8.0F, -8.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(100, 16).addBox(0.0F, -8.0F, -9.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(104, 16)
						.addBox(0.0F, -8.0F, -10.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(108, 16).addBox(0.0F, -8.0F, -11.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bone28 = bone26.addOrReplaceChild("bone28",
				CubeListBuilder.create().texOffs(96, 22).addBox(0.0F, -5.0F, -8.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(100, 22).addBox(0.0F, -5.0F, -9.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(104, 22)
						.addBox(0.0F, -5.0F, -10.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(108, 22).addBox(0.0F, -5.0F, -11.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(96, 20)
						.addBox(0.0F, -6.0F, -8.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(100, 20).addBox(0.0F, -6.0F, -9.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(104, 20)
						.addBox(0.0F, -6.0F, -10.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(108, 20).addBox(0.0F, -6.0F, -11.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(96, 18)
						.addBox(0.0F, -7.0F, -8.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(100, 18).addBox(0.0F, -7.0F, -9.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(104, 18)
						.addBox(0.0F, -7.0F, -10.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(108, 18).addBox(0.0F, -7.0F, -11.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(96, 16)
						.addBox(0.0F, -8.0F, -8.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(100, 16).addBox(0.0F, -8.0F, -9.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(104, 16)
						.addBox(0.0F, -8.0F, -10.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(108, 16).addBox(0.0F, -8.0F, -11.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bone29 = bone28.addOrReplaceChild("bone29",
				CubeListBuilder.create().texOffs(96, 22).addBox(0.0F, -5.0F, -8.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(100, 22).addBox(0.0F, -5.0F, -9.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(104, 22)
						.addBox(0.0F, -5.0F, -10.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(108, 22).addBox(0.0F, -5.0F, -11.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(96, 20)
						.addBox(0.0F, -6.0F, -8.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(100, 20).addBox(0.0F, -6.0F, -9.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(104, 20)
						.addBox(0.0F, -6.0F, -10.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(108, 20).addBox(0.0F, -6.0F, -11.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(96, 18)
						.addBox(0.0F, -7.0F, -8.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(100, 18).addBox(0.0F, -7.0F, -9.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(104, 18)
						.addBox(0.0F, -7.0F, -10.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(108, 18).addBox(0.0F, -7.0F, -11.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(96, 16)
						.addBox(0.0F, -8.0F, -8.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(100, 16).addBox(0.0F, -8.0F, -9.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(104, 16)
						.addBox(0.0F, -8.0F, -10.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(108, 16).addBox(0.0F, -8.0F, -11.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bone30 = item3.addOrReplaceChild("bone30",
				CubeListBuilder.create().texOffs(112, 22).addBox(0.0F, -5.0F, -12.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(116, 22).addBox(0.0F, -5.0F, -13.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(120, 22)
						.addBox(0.0F, -5.0F, -14.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(124, 22).addBox(0.0F, -5.0F, -15.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(112, 20)
						.addBox(0.0F, -6.0F, -12.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(116, 20).addBox(0.0F, -6.0F, -13.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(120, 20)
						.addBox(0.0F, -6.0F, -14.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(124, 20).addBox(0.0F, -6.0F, -15.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(112, 18)
						.addBox(0.0F, -7.0F, -12.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(116, 18).addBox(0.0F, -7.0F, -13.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(120, 18)
						.addBox(0.0F, -7.0F, -14.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(124, 18).addBox(0.0F, -7.0F, -15.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(112, 16)
						.addBox(0.0F, -8.0F, -12.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(116, 16).addBox(0.0F, -8.0F, -13.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(120, 16)
						.addBox(0.0F, -8.0F, -14.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(124, 16).addBox(0.0F, -8.0F, -15.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, -8.0F));
		PartDefinition bone31 = bone30.addOrReplaceChild("bone31",
				CubeListBuilder.create().texOffs(112, 22).addBox(0.0F, -5.0F, -12.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(116, 22).addBox(0.0F, -5.0F, -13.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(120, 22)
						.addBox(0.0F, -5.0F, -14.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(124, 22).addBox(0.0F, -5.0F, -15.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(112, 20)
						.addBox(0.0F, -6.0F, -12.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(116, 20).addBox(0.0F, -6.0F, -13.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(120, 20)
						.addBox(0.0F, -6.0F, -14.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(124, 20).addBox(0.0F, -6.0F, -15.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(112, 18)
						.addBox(0.0F, -7.0F, -12.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(116, 18).addBox(0.0F, -7.0F, -13.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(120, 18)
						.addBox(0.0F, -7.0F, -14.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(124, 18).addBox(0.0F, -7.0F, -15.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(112, 16)
						.addBox(0.0F, -8.0F, -12.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(116, 16).addBox(0.0F, -8.0F, -13.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(120, 16)
						.addBox(0.0F, -8.0F, -14.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(124, 16).addBox(0.0F, -8.0F, -15.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create(), PartPose.offset(3.0F, 2.0F, -1.0F));
		PartDefinition bone = LeftArm.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(64, 56).addBox(0.0F, 4.0F, -3.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.25F)).texOffs(29, 63).mirror()
				.addBox(3.0F, 2.0F, -2.0F, 0.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(40, 32).addBox(1.0F, -2.0F, -2.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.7453F, 0.0F, 0.0F));
		PartDefinition lantern = bone.addOrReplaceChild("lantern",
				CubeListBuilder.create().texOffs(56, 67).addBox(-1.0F, -1.0F, -5.0F, 6.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(45, 67).addBox(0.0F, -3.0F, -4.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(58, 65)
						.addBox(0.5F, -5.0F, -2.0F, 3.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(55, 62).addBox(2.0F, -5.0F, -3.5F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 7.0F, 3.0F, 1.7453F, 0.0F, 0.0F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(0, 32).addBox(0.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.9F, 12.0F, 0.0F, 0.0F, 0.0F, 0.0349F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(0, 32).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 48)
				.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)).texOffs(64, 56).addBox(-1.9F, 7.0F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.25F)), PartPose.offsetAndRotation(1.9F, 12.0F, 0.0F, 0.0F, 0.0F, -0.0349F));
		return LayerDefinition.create(meshdefinition, 128, 80);
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
