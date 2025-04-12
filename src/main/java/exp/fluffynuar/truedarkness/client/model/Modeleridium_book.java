package exp.fluffynuar.truedarkness.client.model;

import org.jline.reader.Binding;

import net.minecraft.world.entity.Entity;
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

// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modeleridium_book<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("truedarkness", "modeleridium_book"), "main");
	public final ModelPart Book;
	public final ModelPart BookPages;
	public final ModelPart Binding;
	public final ModelPart Title;

	public Modeleridium_book(ModelPart root) {
		this.Book = root.getChild("Book");
		this.BookPages = this.Book.getChild("BookPages");
		this.Binding = this.Book.getChild("Binding");
		this.Title = this.Book.getChild("Title");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Book = partdefinition.addOrReplaceChild("Book", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.0F, 11.0F, 3.0F, 1.5708F, 0.0F, 1.7453F));
		PartDefinition BookPages = Book.addOrReplaceChild("BookPages", CubeListBuilder.create().texOffs(28, 30).addBox(-0.5F, -8.0F, 0.25F, 6.0F, 8.0F, 1.0F, new CubeDeformation(0.4F)).texOffs(0, 11)
				.addBox(-0.5F, -8.0F, -1.0F, 6.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 11).addBox(-0.5F, -8.0F, 0.0F, 6.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Binding = Book.addOrReplaceChild("Binding", CubeListBuilder.create().texOffs(24, 0).addBox(-1.0F, -8.5F, -1.0F, 1.0F, 9.0F, 2.0F, new CubeDeformation(-0.25F)).texOffs(38, 8)
				.addBox(-1.0F, -7.5F, -1.5F, 1.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(34, 2).addBox(2.0F, -5.5F, -1.5F, 4.0F, 3.0F, 3.0F, new CubeDeformation(-0.05F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Title = Book.addOrReplaceChild("Title",
				CubeListBuilder.create().texOffs(7, 1).addBox(-1.0F, -8.5F, -1.5F, 7.0F, 9.0F, 1.0F, new CubeDeformation(-0.25F)).texOffs(6, 39).addBox(-1.0F, -8.5F, -1.5F, 7.0F, 9.0F, 1.0F, new CubeDeformation(-0.2F)).texOffs(7, 1)
						.addBox(-1.0F, -8.5F, 0.5F, 7.0F, 9.0F, 1.0F, new CubeDeformation(-0.25F)).texOffs(6, 39).addBox(-1.0F, -8.5F, 0.5F, 7.0F, 9.0F, 1.0F, new CubeDeformation(-0.2F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 80, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Book.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
