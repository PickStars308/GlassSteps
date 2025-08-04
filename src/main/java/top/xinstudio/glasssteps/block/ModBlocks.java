package top.xinstudio.glasssteps.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import top.xinstudio.glasssteps.GlassSteps;

public class ModBlocks {

    public static final Block GLASS_SLAB_BLOCK = register("glass_slab_block", new GlassSlabBlock(AbstractBlock.Settings.copy(Blocks.GLASS)));

    public static void registerBlockItems(String id, Block block) {
        Item item = Registry.register(Registries.ITEM, Identifier.of(GlassSteps.MOD_ID, id), new BlockItem(block, new Item.Settings()));
        if (item instanceof BlockItem) {
            ((BlockItem) item).appendBlocks(Item.BLOCK_ITEMS, item);
        }
    }

    public static Block register(String id, Block block) {
        registerBlockItems(id, block);
        return Registry.register(Registries.BLOCK, Identifier.of(GlassSteps.MOD_ID, id), block);
    }

    public static void registerModBlocks() {
        GlassSteps.LOGGER.info("Registering ModBlocks for " + GlassSteps.MOD_ID);
    }

}
