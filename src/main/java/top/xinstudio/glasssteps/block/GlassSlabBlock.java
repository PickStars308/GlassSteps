package top.xinstudio.glasssteps.block;

import net.minecraft.block.BlockState;
import net.minecraft.block.SlabBlock;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

public class GlassSlabBlock extends SlabBlock {

    public GlassSlabBlock(Settings settings) {
        super(settings);
    }

    @Override
    public boolean isTransparent(BlockState state, BlockView world, BlockPos pos) {
        return true;
    }

    @Override
    public int getOpacity(BlockState state, BlockView world, BlockPos pos) {
        return 0;
    }

    @Override
    public float getAmbientOcclusionLightLevel(BlockState state, BlockView world, BlockPos pos) {
        return 1.0F;
    }

}