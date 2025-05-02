package exp.fluffynuar.truedarkness.procedures;

import org.joml.Vector3f;
import org.joml.Quaternionf;

import org.checkerframework.checker.units.qual.g;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.client.event.RenderLevelStageEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;
import net.minecraft.client.renderer.ShaderInstance;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.Minecraft;
import net.minecraft.client.Camera;

import javax.annotation.Nullable;

import com.mojang.blaze3d.vertex.VertexFormatElement;
import com.mojang.blaze3d.vertex.VertexFormat;
import com.mojang.blaze3d.vertex.VertexBuffer;
import com.mojang.blaze3d.vertex.Tesselator;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.DefaultVertexFormat;
import com.mojang.blaze3d.vertex.BufferUploader;
import com.mojang.blaze3d.vertex.BufferBuilder;
import com.mojang.blaze3d.systems.RenderSystem;

@Mod.EventBusSubscriber(value = {Dist.CLIENT})
public class RenderValuableBlocksHighlightProcedureProcedure {
	private static RenderLevelStageEvent _provider = null;
	private static boolean _usingBuffers = false;
	private static VertexBuffer _debuglinestripBuffer = null;
	private static VertexBuffer _debuglineBuffer = null;
	private static VertexBuffer _quadBuffer = null;
	private static VertexBuffer _textureBuffer = null;
	private static VertexBuffer _trianglefanBuffer = null;
	private static VertexBuffer _trianglestripBuffer = null;
	private static VertexBuffer _triangleBuffer = null;
	private static BufferBuilder _bufferBuilder = null;
	private static int _skyLevel = 240;
	private static int _blockLevel = 240;

	private static void begin(int type) {
		if (_bufferBuilder == null) {
			_bufferBuilder = Tesselator.getInstance().getBuilder();
			switch (type) {
				case 0 :
					_bufferBuilder.begin(VertexFormat.Mode.DEBUG_LINE_STRIP, DefaultVertexFormat.POSITION_COLOR_LIGHTMAP);
					break;
				case 1 :
					_bufferBuilder.begin(VertexFormat.Mode.DEBUG_LINES, DefaultVertexFormat.POSITION_COLOR_LIGHTMAP);
					break;
				case 2 :
					_bufferBuilder.begin(VertexFormat.Mode.QUADS, DefaultVertexFormat.POSITION_COLOR_LIGHTMAP);
					break;
				case 3 :
					_bufferBuilder.begin(VertexFormat.Mode.QUADS, DefaultVertexFormat.POSITION_COLOR_TEX_LIGHTMAP);
					break;
				case 4 :
					_bufferBuilder.begin(VertexFormat.Mode.TRIANGLE_FAN, DefaultVertexFormat.POSITION_COLOR_LIGHTMAP);
					break;
				case 5 :
					_bufferBuilder.begin(VertexFormat.Mode.TRIANGLE_STRIP, DefaultVertexFormat.POSITION_COLOR_LIGHTMAP);
					break;
				case 6 :
					_bufferBuilder.begin(VertexFormat.Mode.TRIANGLES, DefaultVertexFormat.POSITION_COLOR_LIGHTMAP);
					break;
			}
		}
	}

	private static void vertex(double x, double y, double z, int color) {
		vertex(x, y, z, color, 0.0F, 0.0F);
	}

	private static void vertex(double x, double y, double z, int color, float u, float v) {
		if (_bufferBuilder != null && _bufferBuilder.building()) {
			if (_bufferBuilder.currentElement().getUsage() == VertexFormatElement.Usage.POSITION) {
				if (_usingBuffers) {
					_bufferBuilder.vertex(x, y, z);
				} else {
					Vec3 camPos = _provider.getCamera().getPosition();
					_bufferBuilder.vertex(x - camPos.x(), y - camPos.y(), z - camPos.z());
				}
			}
			if (_bufferBuilder.currentElement().getUsage() == VertexFormatElement.Usage.COLOR) {
				_bufferBuilder.color(color);
			}
			if (_bufferBuilder.currentElement().getType() == VertexFormatElement.Type.FLOAT && _bufferBuilder.currentElement().getUsage() == VertexFormatElement.Usage.UV) {
				_bufferBuilder.uv(u, v);
			}
			if (_bufferBuilder.currentElement().getType() == VertexFormatElement.Type.SHORT && _bufferBuilder.currentElement().getUsage() == VertexFormatElement.Usage.UV) {
				_bufferBuilder.uv2(_skyLevel, _blockLevel);
			}
			_bufferBuilder.endVertex();
		}
	}

	private static void end(int type) {
		if (_bufferBuilder != null && _bufferBuilder.building()) {
			RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
			switch (type) {
				case 0 :
					endDebuglinestrip();
					break;
				case 1 :
					endDebuglines();
					break;
				case 2 :
					endQuads();
					break;
				case 3 :
					endTexture();
					break;
				case 4 :
					endTrianglefan();
					break;
				case 5 :
					endTrianglestrip();
					break;
				case 6 :
					endTriangles();
					break;
			}
			_bufferBuilder = null;
		}
	}

	private static void endDebuglinestrip() {
		if (_debuglinestripBuffer != null)
			_debuglinestripBuffer.close();
		_debuglinestripBuffer = new VertexBuffer(VertexBuffer.Usage.STATIC);
		_debuglinestripBuffer.bind();
		_debuglinestripBuffer.upload(_bufferBuilder.end());
		if (_usingBuffers) {
			VertexBuffer.unbind();
		} else {
			RenderSystem.setShader(GameRenderer::getPositionColorLightmapShader);
			_debuglinestripBuffer.drawWithShader(_provider.getPoseStack().last().pose(), _provider.getProjectionMatrix(), GameRenderer.getPositionColorLightmapShader());
			_debuglinestripBuffer.close();
		}
	}

	private static void endDebuglines() {
		if (_debuglineBuffer != null)
			_debuglineBuffer.close();
		_debuglineBuffer = new VertexBuffer(VertexBuffer.Usage.STATIC);
		_debuglineBuffer.bind();
		_debuglineBuffer.upload(_bufferBuilder.end());
		if (_usingBuffers) {
			VertexBuffer.unbind();
		} else {
			RenderSystem.setShader(GameRenderer::getPositionColorLightmapShader);
			_debuglineBuffer.drawWithShader(_provider.getPoseStack().last().pose(), _provider.getProjectionMatrix(), GameRenderer.getPositionColorLightmapShader());
			_debuglineBuffer.close();
		}
	}

	private static void endQuads() {
		if (_quadBuffer != null)
			_quadBuffer.close();
		_quadBuffer = new VertexBuffer(VertexBuffer.Usage.STATIC);
		_quadBuffer.bind();
		_quadBuffer.upload(_bufferBuilder.end());
		if (_usingBuffers) {
			VertexBuffer.unbind();
		} else {
			RenderSystem.setShader(GameRenderer::getPositionColorLightmapShader);
			_quadBuffer.drawWithShader(_provider.getPoseStack().last().pose(), _provider.getProjectionMatrix(), GameRenderer.getPositionColorLightmapShader());
			_quadBuffer.close();
		}
	}

	private static void endTexture() {
		if (_textureBuffer != null)
			_textureBuffer.close();
		_textureBuffer = new VertexBuffer(VertexBuffer.Usage.STATIC);
		_textureBuffer.bind();
		_textureBuffer.upload(_bufferBuilder.end());
		if (_usingBuffers) {
			VertexBuffer.unbind();
		} else {
			RenderSystem.setShader(GameRenderer::getPositionColorTexLightmapShader);
			_textureBuffer.drawWithShader(_provider.getPoseStack().last().pose(), _provider.getProjectionMatrix(), GameRenderer.getPositionColorTexLightmapShader());
			_textureBuffer.close();
		}
	}

	private static void endTrianglefan() {
		if (_trianglefanBuffer != null)
			_trianglefanBuffer.close();
		_trianglefanBuffer = new VertexBuffer(VertexBuffer.Usage.STATIC);
		_trianglefanBuffer.bind();
		_trianglefanBuffer.upload(_bufferBuilder.end());
		if (_usingBuffers) {
			VertexBuffer.unbind();
		} else {
			RenderSystem.setShader(GameRenderer::getPositionColorLightmapShader);
			_trianglefanBuffer.drawWithShader(_provider.getPoseStack().last().pose(), _provider.getProjectionMatrix(), GameRenderer.getPositionColorLightmapShader());
			_trianglefanBuffer.close();
		}
	}

	private static void endTrianglestrip() {
		if (_trianglestripBuffer != null)
			_trianglestripBuffer.close();
		_trianglestripBuffer = new VertexBuffer(VertexBuffer.Usage.STATIC);
		_trianglestripBuffer.bind();
		_trianglestripBuffer.upload(_bufferBuilder.end());
		if (_usingBuffers) {
			VertexBuffer.unbind();
		} else {
			RenderSystem.setShader(GameRenderer::getPositionColorLightmapShader);
			_trianglestripBuffer.drawWithShader(_provider.getPoseStack().last().pose(), _provider.getProjectionMatrix(), GameRenderer.getPositionColorLightmapShader());
			_trianglestripBuffer.close();
		}
	}

	private static void endTriangles() {
		if (_triangleBuffer != null)
			_triangleBuffer.close();
		_triangleBuffer = new VertexBuffer(VertexBuffer.Usage.STATIC);
		_triangleBuffer.bind();
		_triangleBuffer.upload(_bufferBuilder.end());
		if (_usingBuffers) {
			VertexBuffer.unbind();
		} else {
			RenderSystem.setShader(GameRenderer::getPositionColorLightmapShader);
			_triangleBuffer.drawWithShader(_provider.getPoseStack().last().pose(), _provider.getProjectionMatrix(), GameRenderer.getPositionColorLightmapShader());
			_triangleBuffer.close();
		}
	}

	private static void renderBuffer(VertexBuffer vertexBuffer, double x, double y, double z, int color) {
		renderBuffer(vertexBuffer, x, y, z, 0.0F, 0.0F, 0.0F, color);
	}

	private static void renderBuffer(VertexBuffer vertexBuffer, double x, double y, double z, float yaw, float pitch, float roll, int color) {
		renderBuffer(vertexBuffer, x, y, z, 1.0F, 1.0F, 1.0F, yaw, pitch, roll, color);
	}

	private static void renderBuffer(VertexBuffer vertexBuffer, double x, double y, double z, float scaleX, float scaleY, float scaleZ, float yaw, float pitch, float roll, int color) {
		if (_usingBuffers && vertexBuffer != null) {
			Vec3 camPos = _provider.getCamera().getPosition();
			PoseStack poseStack = _provider.getPoseStack();
			poseStack.pushPose();
			poseStack.translate(x - camPos.x(), y - camPos.y(), z - camPos.z());
			poseStack.mulPose(com.mojang.math.Axis.YN.rotationDegrees(yaw));
			poseStack.mulPose(com.mojang.math.Axis.XP.rotationDegrees(pitch));
			poseStack.mulPose(com.mojang.math.Axis.ZN.rotationDegrees(roll));
			poseStack.scale(scaleX, scaleY, scaleZ);
			RenderSystem.setShaderColor((color >> 16 & 255) / 255.0F, (color >> 8 & 255) / 255.0F, (color & 255) / 255.0F, (color >>> 24) / 255.0F);
			vertexBuffer.bind();
			ShaderInstance shaderInstance = GameRenderer.getPositionShader();
			if (vertexBuffer.getFormat() == DefaultVertexFormat.POSITION_COLOR_LIGHTMAP) {
				shaderInstance = GameRenderer.getPositionColorLightmapShader();
			} else if (vertexBuffer.getFormat() == DefaultVertexFormat.POSITION_COLOR_TEX_LIGHTMAP) {
				shaderInstance = GameRenderer.getPositionColorTexLightmapShader();
			}
			vertexBuffer.drawWithShader(poseStack.last().pose(), _provider.getProjectionMatrix(), shaderInstance);
			VertexBuffer.unbind();
			RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
			poseStack.popPose();
		}
	}

	private static void renderParticle(float size, double x, double y, double z, float angles, int color) {
		Camera camera = Minecraft.getInstance().gameRenderer.getMainCamera();
		Vec3 camPos = camera.getPosition();
		Vector3f pos0 = new Vector3f(0.5F, 0.5F, 0.0F);
		Vector3f pos1 = new Vector3f(0.5F, -0.5F, 0.0F);
		Vector3f pos2 = new Vector3f(-0.5F, -0.5F, 0.0F);
		Vector3f pos3 = new Vector3f(-0.5F, 0.5F, 0.0F);
		Quaternionf quaternionf = camera.rotation();
		pos0.rotate(quaternionf);
		pos1.rotate(quaternionf);
		pos2.rotate(quaternionf);
		pos3.rotate(quaternionf);
		pos0.mul(size);
		pos1.mul(size);
		pos2.mul(size);
		pos3.mul(size);
		pos0.add((float) (x - camPos.x()), (float) (y - camPos.y()), (float) (z - camPos.z()));
		pos1.add((float) (x - camPos.x()), (float) (y - camPos.y()), (float) (z - camPos.z()));
		pos2.add((float) (x - camPos.x()), (float) (y - camPos.y()), (float) (z - camPos.z()));
		pos3.add((float) (x - camPos.x()), (float) (y - camPos.y()), (float) (z - camPos.z()));
		RenderSystem.setShaderColor((color >> 16 & 255) / 255.0F, (color >> 8 & 255) / 255.0F, (color & 255) / 255.0F, (color >>> 24) / 255.0F);
		RenderSystem.setShader(GameRenderer::getPositionTexColorShader);
		BufferBuilder bufferBuilder = Tesselator.getInstance().getBuilder();
		bufferBuilder.begin(VertexFormat.Mode.QUADS, DefaultVertexFormat.POSITION_TEX_COLOR);
		bufferBuilder.vertex(pos0.x(), pos0.y(), pos0.z()).uv(0.0F, 0.0F).color(255, 255, 255, 255).endVertex();
		bufferBuilder.vertex(pos1.x(), pos1.y(), pos1.z()).uv(0.0F, 1.0F).color(255, 255, 255, 255).endVertex();
		bufferBuilder.vertex(pos2.x(), pos2.y(), pos2.z()).uv(1.0F, 1.0F).color(255, 255, 255, 255).endVertex();
		bufferBuilder.vertex(pos3.x(), pos3.y(), pos3.z()).uv(1.0F, 0.0F).color(255, 255, 255, 255).endVertex();
		BufferUploader.drawWithShader(bufferBuilder.end());
		RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
	}

	@SubscribeEvent
	public static void renderWorld(RenderLevelStageEvent event) {
		_provider = event;
		if (_provider.getStage() == RenderLevelStageEvent.Stage.AFTER_WEATHER) {
			ClientLevel level = Minecraft.getInstance().level;
			Entity entity = _provider.getCamera().getEntity();
			Vec3 entPos = entity.getPosition(_provider.getPartialTick());
			Minecraft.getInstance().gameRenderer.lightTexture().turnOnLightLayer();
			RenderSystem.depthMask(true);
			RenderSystem.enableBlend();
			RenderSystem.defaultBlendFunc();
			RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
			execute(_provider, level, entity);
			RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
			RenderSystem.colorMask(true, true, true, true);
			RenderSystem.enableCull();
			RenderSystem.enableDepthTest();
			RenderSystem.disableBlend();
			RenderSystem.depthMask(true);
			Minecraft.getInstance().gameRenderer.lightTexture().turnOffLightLayer();
		}
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double b = 0;
		double max_render_distance = 0;
		double distance = 0;
		double max_alpha = 0;
		double g = 0;
		double range = 0;
		double scale = 0;
		double x_pos = 0;
		double z_pos = 0;
		double r = 0;
		double halfScale = 0;
		double y_pos = 0;
		double min_render_distance = 0;
		double a = 0;
		double count = 0;
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(MobEffects.NIGHT_VISION)) {
			range = 16;
			y_pos = Math.floor(entity.getY()) - range;
			for (int index0 = 0; index0 < (int) (range * 2 + 1); index0++) {
				x_pos = Math.floor(entity.getX()) - range;
				for (int index1 = 0; index1 < (int) (range * 2 + 1); index1++) {
					z_pos = Math.floor(entity.getZ()) - range;
					for (int index2 = 0; index2 < (int) (range * 2 + 1); index2++) {
						if (count >= 10) {
							break;
						} else if ((world.getBlockState(BlockPos.containing(x_pos, y_pos, z_pos))).is(BlockTags.create(new ResourceLocation("truedarkness:valuable_blocks")))) {
							r = (int) (new Object() {
								public int get(LevelAccessor _world, BlockPos _blockPos) {
									return 255 << 24 | _world.getBlockState(_blockPos).getMapColor(_world, _blockPos).col;
								}
							}).get(world, BlockPos.containing(x_pos, y_pos, z_pos)) >> 16 & 255;
							g = (int) (new Object() {
								public int get(LevelAccessor _world, BlockPos _blockPos) {
									return 255 << 24 | _world.getBlockState(_blockPos).getMapColor(_world, _blockPos).col;
								}
							}).get(world, BlockPos.containing(x_pos, y_pos, z_pos)) >> 8 & 255;
							b = (int) (new Object() {
								public int get(LevelAccessor _world, BlockPos _blockPos) {
									return 255 << 24 | _world.getBlockState(_blockPos).getMapColor(_world, _blockPos).col;
								}
							}).get(world, BlockPos.containing(x_pos, y_pos, z_pos)) & 255;
							count = count + 1;
						} else {
							z_pos = z_pos + 1;
							continue;
						}
						r = Math.max(0, Math.min(255, r + Math.sin(entity.tickCount / (4 * Math.PI)) * 24));
						g = Math.max(0, Math.min(255, g + Math.sin(entity.tickCount / (4 * Math.PI)) * 24));
						b = Math.max(0, Math.min(255, b + Math.sin(entity.tickCount / (4 * Math.PI)) * 24));
						distance = Math.abs((Math.floor(x_pos) + 0.5) - Minecraft.getInstance().gameRenderer.getMainCamera().getPosition().x())
								+ Math.abs((Math.floor(y_pos) + 0.5) - Minecraft.getInstance().gameRenderer.getMainCamera().getPosition().y())
								+ Math.abs((Math.floor(z_pos) + 0.5) - Minecraft.getInstance().gameRenderer.getMainCamera().getPosition().z());
						max_alpha = 180;
						max_render_distance = 16;
						min_render_distance = 3;
						a = Math.max(0, (max_alpha - (distance * max_alpha) / max_render_distance) * Math.max(0, Math.min(1, distance - min_render_distance)));
						RenderSystem.disableDepthTest();
						int packedColor = ((int) a << 24) | ((int) r << 16) | ((int) g << 8) | (int) b;
						scale = 0.5 + Math.sin(entity.tickCount / (2 * Math.PI)) * 0.05;
						halfScale = scale * 0.5;
						x_pos = x_pos + 0.5;
						y_pos = y_pos + 0.5;
						z_pos = z_pos + 0.5;
						begin(2);
						// Верхня грань (Top, Y+)
						vertex(x_pos - halfScale, y_pos + halfScale, z_pos + halfScale, packedColor);
						vertex(x_pos + halfScale, y_pos + halfScale, z_pos + halfScale, packedColor);
						vertex(x_pos + halfScale, y_pos + halfScale, z_pos - halfScale, packedColor);
						vertex(x_pos - halfScale, y_pos + halfScale, z_pos - halfScale, packedColor);
						// Нижня грань (Bottom, Y-)
						vertex(x_pos - halfScale, y_pos - halfScale, z_pos - halfScale, packedColor);
						vertex(x_pos + halfScale, y_pos - halfScale, z_pos - halfScale, packedColor);
						vertex(x_pos + halfScale, y_pos - halfScale, z_pos + halfScale, packedColor);
						vertex(x_pos - halfScale, y_pos - halfScale, z_pos + halfScale, packedColor);
						// Передня грань (Front, Z+)
						vertex(x_pos - halfScale, y_pos - halfScale, z_pos + halfScale, packedColor);
						vertex(x_pos + halfScale, y_pos - halfScale, z_pos + halfScale, packedColor);
						vertex(x_pos + halfScale, y_pos + halfScale, z_pos + halfScale, packedColor);
						vertex(x_pos - halfScale, y_pos + halfScale, z_pos + halfScale, packedColor);
						// Задня грань (Back, Z-)
						vertex(x_pos - halfScale, y_pos + halfScale, z_pos - halfScale, packedColor);
						vertex(x_pos + halfScale, y_pos + halfScale, z_pos - halfScale, packedColor);
						vertex(x_pos + halfScale, y_pos - halfScale, z_pos - halfScale, packedColor);
						vertex(x_pos - halfScale, y_pos - halfScale, z_pos - halfScale, packedColor);
						// Ліва грань (Left, X-)
						vertex(x_pos - halfScale, y_pos - halfScale, z_pos - halfScale, packedColor);
						vertex(x_pos - halfScale, y_pos - halfScale, z_pos + halfScale, packedColor);
						vertex(x_pos - halfScale, y_pos + halfScale, z_pos + halfScale, packedColor);
						vertex(x_pos - halfScale, y_pos + halfScale, z_pos - halfScale, packedColor);
						// Права грань (Right, X+)
						vertex(x_pos + halfScale, y_pos + halfScale, z_pos - halfScale, packedColor);
						vertex(x_pos + halfScale, y_pos + halfScale, z_pos + halfScale, packedColor);
						vertex(x_pos + halfScale, y_pos - halfScale, z_pos + halfScale, packedColor);
						vertex(x_pos + halfScale, y_pos - halfScale, z_pos - halfScale, packedColor);
						end(2);
						begin(1);
						// Нижні ребра
						vertex(x_pos - halfScale, y_pos - halfScale, z_pos - halfScale, packedColor);
						vertex(x_pos + halfScale, y_pos - halfScale, z_pos - halfScale, packedColor);
						vertex(x_pos + halfScale, y_pos - halfScale, z_pos - halfScale, packedColor);
						vertex(x_pos + halfScale, y_pos - halfScale, z_pos + halfScale, packedColor);
						vertex(x_pos + halfScale, y_pos - halfScale, z_pos + halfScale, packedColor);
						vertex(x_pos - halfScale, y_pos - halfScale, z_pos + halfScale, packedColor);
						vertex(x_pos - halfScale, y_pos - halfScale, z_pos + halfScale, packedColor);
						vertex(x_pos - halfScale, y_pos - halfScale, z_pos - halfScale, packedColor);
						// Верхні ребра
						vertex(x_pos - halfScale, y_pos + halfScale, z_pos - halfScale, packedColor);
						vertex(x_pos + halfScale, y_pos + halfScale, z_pos - halfScale, packedColor);
						vertex(x_pos + halfScale, y_pos + halfScale, z_pos - halfScale, packedColor);
						vertex(x_pos + halfScale, y_pos + halfScale, z_pos + halfScale, packedColor);
						vertex(x_pos + halfScale, y_pos + halfScale, z_pos + halfScale, packedColor);
						vertex(x_pos - halfScale, y_pos + halfScale, z_pos + halfScale, packedColor);
						vertex(x_pos - halfScale, y_pos + halfScale, z_pos + halfScale, packedColor);
						vertex(x_pos - halfScale, y_pos + halfScale, z_pos - halfScale, packedColor);
						// Вертикальні ребра
						vertex(x_pos - halfScale, y_pos - halfScale, z_pos - halfScale, packedColor);
						vertex(x_pos - halfScale, y_pos + halfScale, z_pos - halfScale, packedColor);
						vertex(x_pos + halfScale, y_pos - halfScale, z_pos - halfScale, packedColor);
						vertex(x_pos + halfScale, y_pos + halfScale, z_pos - halfScale, packedColor);
						vertex(x_pos + halfScale, y_pos - halfScale, z_pos + halfScale, packedColor);
						vertex(x_pos + halfScale, y_pos + halfScale, z_pos + halfScale, packedColor);
						vertex(x_pos - halfScale, y_pos - halfScale, z_pos + halfScale, packedColor);
						vertex(x_pos - halfScale, y_pos + halfScale, z_pos + halfScale, packedColor);
						end(1);
						x_pos = x_pos - 0.5;
						y_pos = y_pos - 0.5;
						z_pos = z_pos - 0.5;
						z_pos = z_pos + 1;
					}
					x_pos = x_pos + 1;
				}
				y_pos = y_pos + 1;
			}
		}
	}
}
