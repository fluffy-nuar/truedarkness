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

// Made with Blockbench 4.6.5
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modeliridiumoviy_Golem<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("truedarkness", "modeliridiumoviy_golem"), "main");
	public final ModelPart Head;
	public final ModelPart body;
	public final ModelPart right_arm;
	public final ModelPart left_arm;
	public final ModelPart left_leg;
	public final ModelPart right_leg;

	public Modeliridiumoviy_Golem(ModelPart root) {
		this.Head = root.getChild("Head");
		this.body = root.getChild("body");
		this.right_arm = root.getChild("right_arm");
		this.left_arm = root.getChild("left_arm");
		this.left_leg = root.getChild("left_leg");
		this.right_leg = root.getChild("right_leg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 0).addBox(-6.0F, -4.0F, -9.0F, 12.0F, 5.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -24.0F, -9.0F));
		PartDefinition bone2 = Head.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(0, 14).addBox(-6.0F, 1.0F, -9.0F, 12.0F, 9.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3491F, 0.0F, 0.0F));
		PartDefinition cube_r1 = bone2.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(185, 0).addBox(0.0F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 1.0F, -9.0F, 0.4363F, 0.1745F, 0.0F));
		PartDefinition cube_r2 = bone2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(185, 0).addBox(0.0F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, 1.0F, -9.0F, 0.3491F, 0.4363F, 0.0F));
		PartDefinition cube_r3 = bone2.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(185, 0).addBox(0.0F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0F, 1.0F, -7.0F, 0.3491F, 1.2217F, 0.0F));
		PartDefinition cube_r4 = bone2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(185, 0).addBox(0.0F, -2.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0F, 1.0F, -9.0F, 0.3491F, 0.7854F, 0.0F));
		PartDefinition cube_r5 = bone2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(185, 0).addBox(-1.0F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 1.0F, -9.0F, 0.4363F, -0.1309F, 0.0F));
		PartDefinition cube_r6 = bone2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(185, 0).addBox(-1.0F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, 1.0F, -9.0F, 0.3491F, -0.4363F, 0.0F));
		PartDefinition cube_r7 = bone2.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(185, 0).addBox(-1.0F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0F, 1.0F, -7.0F, 0.3491F, -1.2217F, 0.0F));
		PartDefinition cube_r8 = bone2.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(185, 0).addBox(-1.0F, -2.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0F, 1.0F, -9.0F, 0.3491F, -0.7854F, 0.0F));
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 68).addBox(-11.0F, -33.0F, -4.0F, 22.0F, 7.0F, 9.0F, new CubeDeformation(0.01F)), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition bone6 = body.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offset(0.0F, -34.0F, -4.0F));
		PartDefinition cube_r9 = bone6.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(63, 69).addBox(-2.0F, -4.0F, 3.0F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, 0.2618F, 0.0F, 0.4363F));
		PartDefinition cube_r10 = bone6.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(63, 77).addBox(-2.0F, -5.0F, 4.0F, 3.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, 0.2618F, 0.0F, -0.3491F));
		PartDefinition cube_r11 = bone6.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(232, 0).addBox(-1.0F, -3.0F, -10.0F, 2.0F, 3.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -24.0F, 3.0F, 0.48F, 0.0F, 0.0F));
		PartDefinition cube_r12 = bone6.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(200, 0).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 3.0F, 27.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -24.0F, 2.0F, -1.3526F, 0.0F, 0.0F));
		PartDefinition cube_r13 = bone6.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 35).addBox(-7.0F, -23.0F, 0.0F, 14.0F, 24.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, 0.288F, 0.0F, 0.0F));
		PartDefinition cube_r14 = bone6.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(46, 35).mirror().addBox(0.0F, -21.0F, -4.0F, 12.0F, 24.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-11.0F, 1.0F, 4.0F, 0.2618F, 0.0916F, -0.3491F));
		PartDefinition cube_r15 = bone6.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(46, 2).addBox(-12.0F, -21.0F, -4.0F, 12.0F, 24.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(11.0F, 1.0F, 4.0F, 0.2618F, -0.0916F, 0.3491F));
		PartDefinition bone8 = body.addOrReplaceChild("bone8", CubeListBuilder.create().texOffs(196, 22).addBox(-7.0F, -34.0F, 4.0F, 13.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r16 = bone8.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(207, 11).addBox(-2.0F, -2.0F, 4.0F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -32.0F, 0.0F, 0.0F, -0.3491F, 0.3491F));
		PartDefinition cube_r17 = bone8.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(208, 12).addBox(-2.0F, -2.0F, 4.0F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -32.0F, 0.0F, 0.0F, -0.0436F, -1.0472F));
		PartDefinition cube_r18 = bone8.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(207, 11).addBox(-2.0F, -2.0F, 4.0F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -32.0F, 0.0F, 0.3491F, 0.2182F, -0.3927F));
		PartDefinition cube_r19 = bone8.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(187, 12).addBox(-1.0F, -2.0F, 4.0F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -32.0F, 0.0F, -0.2182F, 0.2618F, -0.3491F));
		PartDefinition cube_r20 = bone8.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(185, 12).addBox(-1.0F, -3.0F, 4.0F, 3.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -32.0F, 0.0F, 0.1745F, -0.0436F, 0.48F));
		PartDefinition cube_r21 = bone8.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(188, 13).addBox(-1.0F, -2.0F, 4.0F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -32.0F, 0.0F, 0.3491F, 0.1745F, -2.1817F));
		PartDefinition cube_r22 = bone8.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(187, 12).addBox(-1.0F, -2.0F, 4.0F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -32.0F, 0.0F, -0.2182F, 0.2618F, -2.4871F));
		PartDefinition bone9 = body.addOrReplaceChild("bone9", CubeListBuilder.create().texOffs(196, 22).addBox(-7.0F, -2.0F, 4.0F, 13.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -44.0F, -3.0F, 0.2182F, 0.3927F, -1.0036F));
		PartDefinition cube_r23 = bone9.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(207, 11).addBox(-2.0F, -2.0F, 4.0F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3491F, 0.3491F));
		PartDefinition cube_r24 = bone9.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(208, 12).addBox(-2.0F, -2.0F, 4.0F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.0436F, -1.0472F));
		PartDefinition cube_r25 = bone9.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(207, 11).addBox(-2.0F, -2.0F, 4.0F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3491F, 0.2182F, -0.3927F));
		PartDefinition cube_r26 = bone9.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(187, 12).addBox(-1.0F, -2.0F, 4.0F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2182F, 0.2618F, -0.3491F));
		PartDefinition cube_r27 = bone9.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(185, 12).addBox(-1.0F, -3.0F, 4.0F, 3.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1745F, -0.0436F, 0.48F));
		PartDefinition cube_r28 = bone9.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(188, 13).addBox(-1.0F, -2.0F, 4.0F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3491F, 0.1745F, -2.1817F));
		PartDefinition cube_r29 = bone9.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(187, 12).addBox(-1.0F, -2.0F, 4.0F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2182F, 0.2618F, -2.4871F));
		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create().texOffs(80, 63).addBox(-2.0F, -4.0F, -4.0F, 7.0F, 24.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-17.0F, -28.0F, -4.0F, 0.0F, -0.0436F, 0.1745F));
		PartDefinition bone5 = right_arm.addOrReplaceChild("bone5", CubeListBuilder.create().texOffs(80, 95).addBox(-2.0F, 0.0F, -4.0F, 7.0F, 25.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 20.0F, 0.0F, -0.1309F, 0.0F, -0.2182F));
		PartDefinition bone10 = right_arm.addOrReplaceChild("bone10", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0F, 21.0F, 4.0F, 0.0F, -0.4363F, -0.3491F));
		PartDefinition cube_r30 = bone10.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(207, 11).addBox(-2.0F, -2.0F, 4.0F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 0.0F, -6.0F, 0.0F, -0.3491F, 0.3491F));
		PartDefinition cube_r31 = bone10.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(208, 12).addBox(-2.0F, -2.0F, 4.0F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 0.0F, -6.0F, 0.0F, -0.1309F, -0.9599F));
		PartDefinition cube_r32 = bone10.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(207, 11).addBox(-2.0F, -2.0F, 4.0F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 0.0F, -6.0F, 0.3491F, 0.1745F, -0.3927F));
		PartDefinition cube_r33 = bone10.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(187, 12).addBox(-1.0F, -2.0F, 4.0F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 0.0F, -6.0F, -0.2182F, 0.2618F, -0.3491F));
		PartDefinition cube_r34 = bone10.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(185, 12).addBox(-1.0F, -3.0F, 4.0F, 3.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 0.0F, -6.0F, 0.1745F, -0.1745F, 0.48F));
		PartDefinition cube_r35 = bone10.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(188, 13).addBox(-1.0F, -2.0F, 4.0F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 0.0F, -6.0F, -0.1309F, 0.2618F, -2.1817F));
		PartDefinition cube_r36 = bone10.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(187, 12).addBox(-1.0F, -2.0F, 4.0F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 0.0F, -6.0F, -0.1309F, -0.0436F, -2.4871F));
		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create().texOffs(98, 0).addBox(-5.0F, -4.0F, -4.0F, 7.0F, 24.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(17.0F, -28.0F, -4.0F, 0.0F, 0.0436F, -0.1745F));
		PartDefinition bone7 = left_arm.addOrReplaceChild("bone7", CubeListBuilder.create().texOffs(98, 32).addBox(-5.0F, 0.0F, -4.0F, 7.0F, 25.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 20.0F, 0.0F, -0.1309F, 0.0F, 0.2182F));
		PartDefinition bone12 = bone7.addOrReplaceChild("bone12", CubeListBuilder.create().texOffs(196, 22).addBox(-9.0F, -2.0F, 0.0F, 13.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 17.0F, 0.0F, 0.7418F, 0.3054F, 1.5708F));
		PartDefinition cube_r37 = bone12.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(207, 11).addBox(-2.0F, -2.0F, 4.0F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 0.0F, -4.0F, 0.0F, -0.3491F, 0.3491F));
		PartDefinition cube_r38 = bone12.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(208, 12).addBox(-2.0F, -2.0F, 4.0F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 0.0F, -4.0F, 0.0F, -0.0436F, -1.0472F));
		PartDefinition cube_r39 = bone12.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(207, 11).addBox(-2.0F, -2.0F, 4.0F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 0.0F, -4.0F, 0.3491F, 0.2182F, -0.3927F));
		PartDefinition cube_r40 = bone12.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(187, 12).addBox(-1.0F, -2.0F, 4.0F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 0.0F, -4.0F, -0.2182F, 0.2618F, -0.3491F));
		PartDefinition cube_r41 = bone12.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(185, 12).addBox(-1.0F, -3.0F, 4.0F, 3.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 0.0F, -4.0F, 0.1745F, -0.0436F, 0.48F));
		PartDefinition cube_r42 = bone12.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(188, 13).addBox(-1.0F, -2.0F, 4.0F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 0.0F, -4.0F, 0.3491F, 0.1745F, -2.1817F));
		PartDefinition cube_r43 = bone12.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(187, 12).addBox(-1.0F, -2.0F, 4.0F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 0.0F, -4.0F, -0.2182F, 0.2618F, -2.4871F));
		PartDefinition bone11 = left_arm.addOrReplaceChild("bone11", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, -2.0F, -1.0F, 2.7489F, -0.6545F, 0.0F));
		PartDefinition cube_r44 = bone11.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(207, 11).addBox(-2.0F, -2.0F, 5.0F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 0.0F, -5.0F, 0.0F, -0.3491F, 0.3491F));
		PartDefinition cube_r45 = bone11.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(208, 12).addBox(-2.0F, -2.0F, 5.0F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 0.0F, -5.0F, 0.0F, -0.0436F, -1.0472F));
		PartDefinition cube_r46 = bone11.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(207, 11).addBox(-2.0F, -2.0F, 5.0F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 0.0F, -5.0F, 0.3491F, 0.2182F, -0.3927F));
		PartDefinition cube_r47 = bone11.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(187, 12).addBox(-1.0F, -2.0F, 5.0F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 0.0F, -5.0F, -0.2182F, 0.2618F, -0.3491F));
		PartDefinition cube_r48 = bone11.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(185, 12).addBox(-1.0F, -3.0F, 5.0F, 3.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 0.0F, -5.0F, 0.1745F, -0.0436F, 0.48F));
		PartDefinition cube_r49 = bone11.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(188, 13).addBox(-1.0F, -2.0F, 5.0F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 0.0F, -5.0F, 0.3491F, 0.1745F, -2.1817F));
		PartDefinition cube_r50 = bone11.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(187, 12).addBox(-1.0F, -2.0F, 5.0F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 0.0F, -5.0F, -0.2182F, 0.2618F, -2.4871F));
		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(0, 84).addBox(-4.0F, 0.0F, -4.0F, 9.0F, 13.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0F, -2.0F, 0.0F, -0.0873F, 0.0F, 0.0F));
		PartDefinition bone3 = left_leg.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(0, 106).addBox(-4.0F, 0.0F, -4.0F, 9.0F, 13.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 13.0F, 0.0F, 0.0873F, 0.0F, 0.0F));
		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(36, 84).addBox(-6.0F, -1.0F, -4.0F, 9.0F, 13.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, -1.0F, 0.0F, -0.0873F, 0.0F, 0.0F));
		PartDefinition bone4 = right_leg.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(36, 106).addBox(-5.0F, 0.0F, -4.0F, 9.0F, 13.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 12.0F, 0.0F, 0.0873F, 0.0F, 0.0F));
		PartDefinition bone13 = right_leg.addOrReplaceChild("bone13", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 12.0F, -1.0F, 2.7925F, -0.1309F, 0.0F));
		PartDefinition cube_r51 = bone13.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(207, 11).addBox(-2.0F, -2.0F, 5.0F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 0.0F, -5.0F, 0.0F, -0.3491F, 0.3491F));
		PartDefinition cube_r52 = bone13.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(208, 12).addBox(-2.0F, -2.0F, 5.0F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 0.0F, -5.0F, 0.0F, -0.0436F, -1.0472F));
		PartDefinition cube_r53 = bone13.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(207, 11).addBox(-2.0F, -2.0F, 5.0F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 0.0F, -5.0F, 0.3491F, 0.2182F, -0.3927F));
		PartDefinition cube_r54 = bone13.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(187, 12).addBox(-1.0F, -2.0F, 5.0F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 0.0F, -5.0F, -0.2182F, 0.2618F, -0.3491F));
		PartDefinition cube_r55 = bone13.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(185, 12).addBox(-1.0F, -3.0F, 5.0F, 3.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 0.0F, -5.0F, 0.1745F, -0.0436F, 0.48F));
		PartDefinition cube_r56 = bone13.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(188, 13).addBox(-1.0F, -2.0F, 5.0F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 0.0F, -5.0F, 0.3491F, 0.1745F, -2.1817F));
		PartDefinition cube_r57 = bone13.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(187, 12).addBox(-1.0F, -2.0F, 5.0F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 0.0F, -5.0F, -0.2182F, 0.2618F, -2.4871F));
		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.right_arm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.left_leg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.left_arm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.right_leg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}
