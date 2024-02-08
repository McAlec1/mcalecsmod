
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcalec.mcalecs.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcalec.mcalecs.client.renderer.McalecsVilagerRenderer;
import net.mcalec.mcalecs.client.renderer.McAlecPersonRenderer;
import net.mcalec.mcalecs.client.renderer.BoykisserRenderer;
import net.mcalec.mcalecs.client.renderer.BoykisserMaidRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class McalecsModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(McalecsModEntities.MC_ALEC_PERSON.get(), McAlecPersonRenderer::new);
		event.registerEntityRenderer(McalecsModEntities.BOYKISSER_MAID.get(), BoykisserMaidRenderer::new);
		event.registerEntityRenderer(McalecsModEntities.MCALECS_VILAGER.get(), McalecsVilagerRenderer::new);
		event.registerEntityRenderer(McalecsModEntities.BOYKISSER.get(), BoykisserRenderer::new);
	}
}