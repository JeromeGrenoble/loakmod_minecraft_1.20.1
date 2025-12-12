package net.Skin0oz.loakmod.entity.client;// Made with Blockbench 5.0.5
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.world.entity.Entity;

public class model<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	private final ModelPart Rammus;
	private final ModelPart corps;
	private final ModelPart Tete;
	private final ModelPart torse;
	private final ModelPart carapacepique;
	private final ModelPart carapace;
	private final ModelPart pique;
	private final ModelPart pique6;
	private final ModelPart pique9;
	private final ModelPart pique14;
	private final ModelPart pique7;
	private final ModelPart pique13;
	private final ModelPart pique11;
	private final ModelPart pique8;
	private final ModelPart pique12;
	private final ModelPart pique10;
	private final ModelPart pique2;
	private final ModelPart pique3;
	private final ModelPart pique4;
	private final ModelPart pique16;
	private final ModelPart pique18;
	private final ModelPart pique15;
	private final ModelPart pique17;
	private final ModelPart pique5;
	private final ModelPart Brasdroit;
	private final ModelPart Canne;
	private final ModelPart corde;
	private final ModelPart brasgauche2;
	private final ModelPart JambeDroite;
	private final ModelPart pieddroit;
	private final ModelPart JambeGauche;
	private final ModelPart piedgauche;

	public model(ModelPart root) {
		this.Rammus = root.getChild("Rammus");
		this.corps = this.Rammus.getChild("corps");
		this.Tete = this.corps.getChild("Tete");
		this.torse = this.corps.getChild("torse");
		this.carapacepique = this.corps.getChild("carapacepique");
		this.carapace = this.carapacepique.getChild("carapace");
		this.pique = this.carapacepique.getChild("pique");
		this.pique6 = this.carapacepique.getChild("pique6");
		this.pique9 = this.carapacepique.getChild("pique9");
		this.pique14 = this.carapacepique.getChild("pique14");
		this.pique7 = this.carapacepique.getChild("pique7");
		this.pique13 = this.carapacepique.getChild("pique13");
		this.pique11 = this.carapacepique.getChild("pique11");
		this.pique8 = this.carapacepique.getChild("pique8");
		this.pique12 = this.carapacepique.getChild("pique12");
		this.pique10 = this.carapacepique.getChild("pique10");
		this.pique2 = this.carapacepique.getChild("pique2");
		this.pique3 = this.carapacepique.getChild("pique3");
		this.pique4 = this.carapacepique.getChild("pique4");
		this.pique16 = this.carapacepique.getChild("pique16");
		this.pique18 = this.carapacepique.getChild("pique18");
		this.pique15 = this.carapacepique.getChild("pique15");
		this.pique17 = this.carapacepique.getChild("pique17");
		this.pique5 = this.carapacepique.getChild("pique5");
		this.Brasdroit = this.Rammus.getChild("Brasdroit");
		this.Canne = this.Brasdroit.getChild("Canne");
		this.corde = this.Canne.getChild("corde");
		this.brasgauche2 = this.Rammus.getChild("brasgauche2");
		this.JambeDroite = this.Rammus.getChild("JambeDroite");
		this.pieddroit = this.JambeDroite.getChild("pieddroit");
		this.JambeGauche = this.Rammus.getChild("JambeGauche");
		this.piedgauche = this.JambeGauche.getChild("piedgauche");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Rammus = partdefinition.addOrReplaceChild("Rammus", CubeListBuilder.create(), PartPose.offset(2.4733F, 16.7099F, -0.3282F));

		PartDefinition corps = Rammus.addOrReplaceChild("corps", CubeListBuilder.create(), PartPose.offset(0.5428F, 1.7898F, -0.3129F));

		PartDefinition Tete = corps.addOrReplaceChild("Tete", CubeListBuilder.create().texOffs(-3, -3).addBox(-3.0F, -2.0F, -1.5F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.0161F, -4.4997F, -0.3588F));

		PartDefinition torse = corps.addOrReplaceChild("torse", CubeListBuilder.create().texOffs(-11, -8).addBox(3.0F, -6.0F, -4.0F, 8.0F, 9.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(-5, -6).addBox(2.0F, -2.0F, -3.0F, 4.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(-8.0161F, 0.5003F, -0.3588F));

		PartDefinition carapacepique = corps.addOrReplaceChild("carapacepique", CubeListBuilder.create().texOffs(-4, 1).addBox(-0.0483F, 9.5009F, 3.9235F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-6.9678F, -15.0006F, 0.7177F));

		PartDefinition carapace = carapacepique.addOrReplaceChild("carapace", CubeListBuilder.create().texOffs(-7, 0).addBox(6.0F, -7.0F, 5.0F, 1.0F, 10.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(-6, 1).addBox(3.0F, -6.0F, 7.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.02F))
		.texOffs(-6, 1).addBox(4.0F, -6.0F, 7.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.02F))
		.texOffs(-6, 1).addBox(2.0F, -6.0F, 7.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.02F))
		.texOffs(-6, 1).addBox(1.0F, -6.0F, 7.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.02F))
		.texOffs(-7, 1).addBox(-2.0F, -6.0F, 7.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.02F))
		.texOffs(-6, 1).addBox(-3.0F, -6.0F, 6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.02F))
		.texOffs(-6, 1).addBox(0.0F, -6.0F, 7.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.02F))
		.texOffs(-6, 1).addBox(5.0F, -6.0F, 7.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.02F))
		.texOffs(-2, 1).addBox(-2.0F, -7.0F, 6.0F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 1).addBox(1.0F, -8.0F, 5.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(-6, 1).addBox(7.0F, -7.0F, 5.0F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(-12, -6).addBox(8.0F, -6.0F, -3.0F, 1.0F, 8.0F, 8.0F, new CubeDeformation(-0.01F))
		.texOffs(-10, -4).addBox(8.0F, -7.0F, -2.0F, 1.0F, 10.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(-13, -6).addBox(6.0F, -8.0F, -3.0F, 2.0F, 11.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(-13, -6).addBox(-6.0F, -8.0F, -3.0F, 12.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(-8, -1).addBox(-6.0F, -7.0F, 3.0F, 12.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(-10, -4).addBox(-5.0F, -9.0F, -2.0F, 11.0F, 1.0F, 6.0F, new CubeDeformation(0.01F))
		.texOffs(-9, -2).addBox(-6.0F, -9.0F, -1.0F, 13.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(-12, -4).addBox(-7.0F, -8.0F, -2.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(-7, 0).addBox(-7.0F, -7.0F, 3.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(-7, 0).addBox(-7.0F, -7.0F, -3.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(-8, -1).addBox(-6.0F, -7.0F, -4.0F, 12.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(-4, 1).addBox(-4.0F, -6.0F, -4.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(-2, 1).addBox(-2.0F, -7.0F, -5.0F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 1).addBox(1.0F, -8.0F, -4.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(-7, 0).addBox(6.0F, -7.0F, -5.0F, 1.0F, 10.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(-6, 1).addBox(7.0F, -7.0F, -4.0F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(-6, 1).addBox(3.0F, -6.0F, -6.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.02F))
		.texOffs(-6, 1).addBox(1.0F, -6.0F, -6.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.02F))
		.texOffs(-7, 1).addBox(-2.0F, -6.0F, -6.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.02F))
		.texOffs(-6, 1).addBox(-3.0F, -6.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.02F))
		.texOffs(-6, 1).addBox(0.0F, -6.0F, -6.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.02F))
		.texOffs(-6, 1).addBox(2.0F, -6.0F, -6.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.02F))
		.texOffs(-6, 1).addBox(4.0F, -6.0F, -6.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.02F))
		.texOffs(-7, 0).addBox(5.0F, -6.0F, -6.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.02F)), PartPose.offset(3.9517F, 15.5009F, -1.0765F));

		PartDefinition pique = carapacepique.addOrReplaceChild("pique", CubeListBuilder.create().texOffs(-6, 0).addBox(-1.0047F, 3.5F, -1.0765F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.0436F));

		PartDefinition cube_r1 = pique.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(-4, 1).addBox(-0.5F, 0.5F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r2 = pique.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(-4, 1).addBox(-0.9384F, 1.5F, -0.9544F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.0663F, 0.0F, 0.6279F, 0.0F, -0.8727F, 0.0F));

		PartDefinition cube_r3 = pique.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(-6, 0).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.0047F, 5.0F, -0.0765F, 0.0F, -0.8727F, 0.0F));

		PartDefinition pique6 = carapacepique.addOrReplaceChild("pique6", CubeListBuilder.create().texOffs(-6, 0).addBox(-1.0047F, 3.5F, -1.0765F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(1.0F, 3.0F, -5.0F, 0.48F, 0.0F, -0.0436F));

		PartDefinition cube_r4 = pique6.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(-4, 1).addBox(-0.5F, 0.5F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r5 = pique6.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(-4, 1).addBox(-0.9384F, 1.5F, -0.9544F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.0663F, 0.0F, 0.6279F, 0.0F, -0.8727F, 0.0F));

		PartDefinition cube_r6 = pique6.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(-6, 0).addBox(-1.0F, -2.5F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.0047F, 5.0F, -0.0765F, 0.0F, -0.8727F, 0.0F));

		PartDefinition pique9 = carapacepique.addOrReplaceChild("pique9", CubeListBuilder.create().texOffs(-6, 0).addBox(-1.0047F, 3.5F, -1.0765F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(1.0F, 3.0F, -5.0F, 0.48F, 0.0F, -0.0436F));

		PartDefinition cube_r7 = pique9.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(-4, 1).addBox(-0.5F, 0.5F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r8 = pique9.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(-4, 1).addBox(-0.9384F, 1.5F, -0.9544F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.0663F, 0.0F, 0.6279F, 0.0F, -0.8727F, 0.0F));

		PartDefinition cube_r9 = pique9.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(-6, 0).addBox(-1.0F, -2.5F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.0047F, 5.0F, -0.0765F, 0.0F, -0.8727F, 0.0F));

		PartDefinition pique14 = carapacepique.addOrReplaceChild("pique14", CubeListBuilder.create().texOffs(-6, 0).addBox(-1.0047F, 3.5F, -0.9235F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(1.0F, 3.0F, 4.847F, -0.48F, -0.2618F, -0.0436F));

		PartDefinition cube_r10 = pique14.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(-4, 1).addBox(-0.5F, 0.5F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube_r11 = pique14.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(-4, 1).addBox(-0.9384F, 1.5F, -0.0456F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.0663F, 0.0F, -0.6279F, 0.0F, 0.8727F, 0.0F));

		PartDefinition cube_r12 = pique14.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(-6, 0).addBox(-1.0F, -2.5F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.0047F, 5.0F, 0.0765F, 0.0F, 0.8727F, 0.0F));

		PartDefinition pique7 = carapacepique.addOrReplaceChild("pique7", CubeListBuilder.create().texOffs(-6, 0).addBox(-1.0023F, -0.25F, -1.0383F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(7.1435F, 6.3409F, -3.3024F, 0.7418F, -0.1745F, -0.2182F));

		PartDefinition cube_r13 = pique7.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(-4, 1).addBox(-0.5F, 0.5F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0023F, -3.75F, 0.0383F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r14 = pique7.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(-4, 1).addBox(-0.9384F, 1.5F, -0.9544F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.064F, -3.75F, 0.6662F, 0.0F, -0.8727F, 0.0F));

		PartDefinition cube_r15 = pique7.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(-6, 0).addBox(-1.0F, -2.5F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.0023F, 1.25F, -0.0383F, 0.0F, -0.8727F, 0.0F));

		PartDefinition pique13 = carapacepique.addOrReplaceChild("pique13", CubeListBuilder.create().texOffs(-6, 0).addBox(-1.0023F, -0.25F, -0.9617F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(7.1435F, 6.3409F, 3.1494F, -0.7418F, 0.1745F, -0.2182F));

		PartDefinition cube_r16 = pique13.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(-4, 1).addBox(-0.5F, 0.5F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0023F, -3.75F, -0.0383F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube_r17 = pique13.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(-4, 1).addBox(-0.9384F, 1.5F, -0.0456F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.064F, -3.75F, -0.6662F, 0.0F, 0.8727F, 0.0F));

		PartDefinition cube_r18 = pique13.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(-6, 0).addBox(-1.0F, -2.5F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.0023F, 1.25F, 0.0383F, 0.0F, 0.8727F, 0.0F));

		PartDefinition pique11 = carapacepique.addOrReplaceChild("pique11", CubeListBuilder.create().texOffs(-6, 0).addBox(-1.0023F, -0.25F, -1.0383F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(7.1435F, 6.3409F, -3.3024F, 0.7418F, -0.1745F, -0.2182F));

		PartDefinition cube_r19 = pique11.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(-4, 1).addBox(-0.5F, 0.5F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0023F, -3.75F, 0.0383F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r20 = pique11.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(-4, 1).addBox(-0.9384F, 1.5F, -0.9544F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.064F, -3.75F, 0.6662F, 0.0F, -0.8727F, 0.0F));

		PartDefinition cube_r21 = pique11.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(-6, 0).addBox(-1.0F, -2.5F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.0023F, 1.25F, -0.0383F, 0.0F, -0.8727F, 0.0F));

		PartDefinition pique8 = carapacepique.addOrReplaceChild("pique8", CubeListBuilder.create().texOffs(-6, 0).addBox(-1.0024F, -0.25F, -1.0383F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(11.1435F, 7.3409F, -3.3024F, 1.0472F, -0.9599F, -0.3491F));

		PartDefinition cube_r22 = pique8.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(-4, 1).addBox(-0.5F, 0.5F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0023F, -3.75F, 0.0383F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r23 = pique8.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(-4, 1).addBox(-0.9384F, 1.5F, -0.9544F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.064F, -3.75F, 0.6662F, 0.0F, -0.8727F, 0.0F));

		PartDefinition cube_r24 = pique8.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(-6, 0).addBox(-1.0F, -2.5F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.0024F, 1.25F, -0.0383F, 0.0F, -0.8727F, 0.0F));

		PartDefinition pique12 = carapacepique.addOrReplaceChild("pique12", CubeListBuilder.create().texOffs(-6, 0).addBox(-1.0024F, -0.25F, -0.9617F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(11.1435F, 7.3409F, 3.1494F, -1.0472F, 0.9599F, -0.3491F));

		PartDefinition cube_r25 = pique12.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(-4, 1).addBox(-0.5F, 0.5F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0023F, -3.75F, -0.0383F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube_r26 = pique12.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(-4, 1).addBox(-0.9384F, 1.5F, -0.0456F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.064F, -3.75F, -0.6662F, 0.0F, 0.8727F, 0.0F));

		PartDefinition cube_r27 = pique12.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(-6, 0).addBox(-1.0F, -2.5F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.0024F, 1.25F, 0.0383F, 0.0F, 0.8727F, 0.0F));

		PartDefinition pique10 = carapacepique.addOrReplaceChild("pique10", CubeListBuilder.create().texOffs(-6, 0).addBox(-1.0024F, -0.25F, -1.0383F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(11.1435F, 7.3409F, -3.3024F, 1.0472F, -0.9599F, -0.3491F));

		PartDefinition cube_r28 = pique10.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(-4, 1).addBox(-0.5F, 0.5F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0023F, -3.75F, 0.0383F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r29 = pique10.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(-4, 1).addBox(-0.9384F, 1.5F, -0.9544F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.064F, -3.75F, 0.6662F, 0.0F, -0.8727F, 0.0F));

		PartDefinition cube_r30 = pique10.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(-6, 0).addBox(-1.0F, -2.5F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.0024F, 1.25F, -0.0383F, 0.0F, -0.8727F, 0.0F));

		PartDefinition pique2 = carapacepique.addOrReplaceChild("pique2", CubeListBuilder.create().texOffs(-6, 0).addBox(-1.0023F, -4.75F, -1.0383F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(4.8467F, 8.2471F, -0.031F, 0.0F, 0.5672F, 0.0873F));

		PartDefinition cube_r31 = pique2.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(-4, 1).addBox(-0.5F, 1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0023F, -8.25F, 0.0382F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r32 = pique2.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(-4, 1).addBox(-0.9384F, 0.5F, -0.9544F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.064F, -8.25F, 0.6662F, 0.0F, -0.8727F, 0.0F));

		PartDefinition cube_r33 = pique2.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(-6, 0).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.0023F, -3.25F, -0.0383F, 0.0F, -0.8727F, 0.0F));

		PartDefinition pique3 = carapacepique.addOrReplaceChild("pique3", CubeListBuilder.create().texOffs(-6, 0).addBox(-1.0023F, -0.75F, -1.0383F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(10.3774F, 5.5516F, -0.031F, 0.0F, 0.0873F, 0.3927F));

		PartDefinition cube_r34 = pique3.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(-4, 1).addBox(-0.5F, 0.5F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0023F, -4.25F, 0.0382F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r35 = pique3.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(-4, 1).addBox(-0.9384F, 1.5F, -0.9544F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.064F, -4.25F, 0.6662F, 0.0F, -0.8727F, 0.0F));

		PartDefinition cube_r36 = pique3.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(-6, 0).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.0023F, 0.75F, -0.0383F, 0.0F, -0.8727F, 0.0F));

		PartDefinition pique4 = carapacepique.addOrReplaceChild("pique4", CubeListBuilder.create().texOffs(-6, 0).addBox(-1.0023F, -0.75F, -1.0383F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(13.3774F, 8.5516F, -0.031F, 0.0F, 0.0873F, 0.9163F));

		PartDefinition cube_r37 = pique4.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(-4, 1).addBox(-0.5F, 0.5F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0023F, -4.25F, 0.0382F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r38 = pique4.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(-4, 1).addBox(-0.9384F, 1.5F, -0.9544F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.064F, -4.25F, 0.6662F, 0.0F, -0.8727F, 0.0F));

		PartDefinition cube_r39 = pique4.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(-6, 0).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.0023F, 0.75F, -0.0383F, 0.0F, -0.8727F, 0.0F));

		PartDefinition pique16 = carapacepique.addOrReplaceChild("pique16", CubeListBuilder.create().texOffs(-6, 0).addBox(-1.0023F, -0.75F, -1.0383F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(13.3774F, 10.5516F, 2.969F, -0.1745F, 0.0873F, 1.3526F));

		PartDefinition cube_r40 = pique16.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(-4, 1).addBox(-0.5F, 1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0023F, -4.25F, 0.0382F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r41 = pique16.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(-4, 1).addBox(-0.9384F, 2.5F, -0.9544F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.064F, -4.25F, 0.6662F, 0.0F, -0.8727F, 0.0F));

		PartDefinition cube_r42 = pique16.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(-6, 0).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.0023F, 0.75F, -0.0383F, 0.0F, -0.8727F, 0.0F));

		PartDefinition pique18 = carapacepique.addOrReplaceChild("pique18", CubeListBuilder.create().texOffs(-6, 0).addBox(-1.0023F, -0.75F, -0.9617F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(13.3774F, 10.5516F, -4.122F, 0.1745F, -0.0873F, 1.3526F));

		PartDefinition cube_r43 = pique18.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(-4, 1).addBox(-0.5F, 1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0023F, -4.25F, -0.0382F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube_r44 = pique18.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(-4, 1).addBox(-0.9384F, 2.5F, -0.0456F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.064F, -4.25F, -0.6662F, 0.0F, 0.8727F, 0.0F));

		PartDefinition cube_r45 = pique18.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(-6, 0).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.0023F, 0.75F, 0.0383F, 0.0F, 0.8727F, 0.0F));

		PartDefinition pique15 = carapacepique.addOrReplaceChild("pique15", CubeListBuilder.create().texOffs(-6, 0).addBox(-1.0023F, -0.75F, -1.0383F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(13.3774F, 15.5516F, 2.969F, -0.3054F, 0.2618F, 1.4835F));

		PartDefinition cube_r46 = pique15.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(-4, 1).addBox(-0.5F, 1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0023F, -4.25F, 0.0382F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r47 = pique15.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(-4, 1).addBox(-0.9384F, 2.5F, -0.9544F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.064F, -4.25F, 0.6662F, 0.0F, -0.8727F, 0.0F));

		PartDefinition cube_r48 = pique15.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(-6, 0).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.0023F, 0.75F, -0.0383F, 0.0F, -0.8727F, 0.0F));

		PartDefinition pique17 = carapacepique.addOrReplaceChild("pique17", CubeListBuilder.create().texOffs(-6, 0).addBox(-1.0023F, -0.75F, -0.9617F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(13.3774F, 15.5516F, -4.122F, 0.3054F, -0.2618F, 1.4835F));

		PartDefinition cube_r49 = pique17.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(-4, 1).addBox(-0.5F, 1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0023F, -4.25F, -0.0382F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube_r50 = pique17.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(-4, 1).addBox(-0.9384F, 2.5F, -0.0456F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.064F, -4.25F, -0.6662F, 0.0F, 0.8727F, 0.0F));

		PartDefinition cube_r51 = pique17.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(-6, 0).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.0023F, 0.75F, 0.0383F, 0.0F, 0.8727F, 0.0F));

		PartDefinition pique5 = carapacepique.addOrReplaceChild("pique5", CubeListBuilder.create().texOffs(-6, 0).addBox(-1.0023F, 0.25F, -1.0383F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(13.3774F, 13.5516F, -0.031F, 0.0F, 0.0873F, 1.4399F));

		PartDefinition cube_r52 = pique5.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(-4, 1).addBox(-0.5F, 0.5F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0023F, -4.25F, 0.0382F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r53 = pique5.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(-4, 1).addBox(-0.9384F, 1.5F, -0.9544F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.064F, -4.25F, 0.6662F, 0.0F, -0.8727F, 0.0F));

		PartDefinition cube_r54 = pique5.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(-6, 0).addBox(-1.0F, -1.5F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.0023F, 0.75F, -0.0383F, 0.0F, -0.8727F, 0.0F));

		PartDefinition Brasdroit = Rammus.addOrReplaceChild("Brasdroit", CubeListBuilder.create(), PartPose.offset(-0.1229F, -2.1601F, 6.3282F));

		PartDefinition cube_r55 = Brasdroit.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(-6, 1).addBox(-1.9142F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-5.7751F, 4.9606F, 1.5F, 0.0F, -0.4363F, -0.7854F));

		PartDefinition cube_r56 = Brasdroit.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(-6, 1).addBox(-1.9142F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-4.3608F, 6.3748F, 1.5F, 0.0F, -0.48F, -0.6109F));

		PartDefinition cube_r57 = Brasdroit.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(-6, 1).addBox(-3.9142F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(-4.7941F, 6.6782F, 2.4768F, 0.0F, -1.0472F, -0.6109F));

		PartDefinition cube_r58 = Brasdroit.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(-6, 1).addBox(-2.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(-6.8138F, 5.9994F, 0.9811F, 0.0F, -1.2217F, -0.7854F));

		PartDefinition cube_r59 = Brasdroit.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(-7, 1).addBox(-1.1789F, -1.1993F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-5.4215F, 4.1928F, -0.5F, 0.0F, -0.6545F, 0.4363F));

		PartDefinition cube_r60 = Brasdroit.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(-3, -1).addBox(-8.0F, -1.0F, -2.5F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(-3, 0).addBox(-4.0F, -0.5F, -2.0F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3504F, -0.0498F, 0.0F, 0.0F, 0.3491F, -0.7854F));

		PartDefinition Canne = Brasdroit.addOrReplaceChild("Canne", CubeListBuilder.create().texOffs(-6, 0).addBox(-0.4288F, -2.2088F, -1.2503F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-7.7573F, 4.9332F, -1.3631F, 0.2618F, 0.0F, -0.9599F));

		PartDefinition cube_r61 = Canne.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(-4, 1).addBox(-0.712F, 1.2912F, -1.0736F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0023F, -13.5F, 0.0383F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r62 = Canne.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(-4, 1).addBox(-0.7321F, 5.2912F, -1.5301F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.064F, -13.5F, 0.6662F, 0.0F, -0.8727F, 0.0F));

		PartDefinition cube_r63 = Canne.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(-6, 0).addBox(-0.7937F, -1.7088F, -1.5757F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.0023F, 0.5F, -0.0383F, 0.0F, -0.8727F, 0.0F));

		PartDefinition corde = Canne.addOrReplaceChild("corde", CubeListBuilder.create(), PartPose.offset(0.5068F, -11.22F, -0.1369F));

		PartDefinition cube_r64 = corde.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(3, 2).addBox(0.5F, -6.0F, 1.0F, 1.0F, 12.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.9989F, 2.2777F, -1.8916F, -0.1618F, 0.038F, 0.9278F));

		PartDefinition brasgauche2 = Rammus.addOrReplaceChild("brasgauche2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4733F, -2.2099F, -4.6718F, -0.2182F, -0.1309F, 0.0F));

		PartDefinition cube_r65 = brasgauche2.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(-3, 0).addBox(-4.0F, -1.5F, -1.0F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition cube_r66 = brasgauche2.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(-6, 1).addBox(-3.9142F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(-5.4102F, 6.6984F, -1.3949F, 0.0F, 1.0472F, -0.6109F));

		PartDefinition cube_r67 = brasgauche2.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(-6, 1).addBox(-1.9142F, -0.5F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-5.0104F, 6.4246F, -0.5F, 0.0F, 0.48F, -0.6109F));

		PartDefinition cube_r68 = brasgauche2.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(-6, 1).addBox(-1.9142F, -0.5F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-6.4246F, 5.0104F, -0.5F, 0.0F, 0.4363F, -0.7854F));

		PartDefinition cube_r69 = brasgauche2.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(-6, 1).addBox(-2.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(-7.4391F, 6.0179F, 0.1031F, 0.0F, 1.2217F, -0.7854F));

		PartDefinition cube_r70 = brasgauche2.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(-7, 1).addBox(-2.1789F, -1.1993F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-6.0711F, 4.2426F, 0.5F, 0.0F, 0.3927F, 0.0436F));

		PartDefinition cube_r71 = brasgauche2.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(-9, -1).addBox(-8.8F, -2.5F, -2.0F, 5.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.1309F, -0.7854F));

		PartDefinition JambeDroite = Rammus.addOrReplaceChild("JambeDroite", CubeListBuilder.create(), PartPose.offset(0.0267F, 1.2901F, 3.3282F));

		PartDefinition cube_r72 = JambeDroite.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(-5, 0).addBox(-3.5F, -1.5F, -1.0F, 7.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.5F, 2.0F, 0.0F, 0.0F, -1.5708F));

		PartDefinition pieddroit = JambeDroite.addOrReplaceChild("pieddroit", CubeListBuilder.create(), PartPose.offset(0.5F, 5.0F, 1.5F));

		PartDefinition cube_r73 = pieddroit.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(-4, 1).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-3.0F, 0.5F, -1.0F, -0.2618F, 0.0F, -1.5708F));

		PartDefinition cube_r74 = pieddroit.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(-4, 1).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-3.0F, 0.5F, 1.0F, 0.1309F, 0.0F, -1.5708F));

		PartDefinition cube_r75 = pieddroit.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(-6, -1).addBox(-3.5F, -3.5F, -2.0F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.5F, -2.5F, 0.5F, 0.0F, 0.0F, -1.5708F));

		PartDefinition JambeGauche = Rammus.addOrReplaceChild("JambeGauche", CubeListBuilder.create(), PartPose.offset(0.0267F, 1.2901F, -4.6718F));

		PartDefinition cube_r76 = JambeGauche.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(-5, 0).addBox(-3.5F, -1.5F, -1.0F, 7.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.5F, 0.0F, 0.0F, 0.0F, -1.5708F));

		PartDefinition piedgauche = JambeGauche.addOrReplaceChild("piedgauche", CubeListBuilder.create(), PartPose.offset(0.0F, 5.0F, 0.5F));

		PartDefinition cube_r77 = piedgauche.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(-4, 1).addBox(-0.5F, -2.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-2.0F, 0.5F, -1.0F, -0.1309F, 0.0F, -1.5708F));

		PartDefinition cube_r78 = piedgauche.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(-6, -1).addBox(-1.0F, -3.0F, -1.5F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r79 = piedgauche.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(-4, 1).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-2.5F, 0.5F, 1.0F, 0.1745F, 0.0F, -1.5708F));

		return LayerDefinition.create(meshdefinition, 16, 16);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Rammus.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}