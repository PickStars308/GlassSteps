package top.xinstudio.glasssteps.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import top.xinstudio.glasssteps.block.ModBlocks;

public class GlassStepsClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        // 设置玻璃台阶的渲染层为透明层
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GLASS_SLAB_BLOCK, RenderLayer.getTranslucent());
    }
}
