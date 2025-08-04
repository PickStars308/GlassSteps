package top.xinstudio.glasssteps.item;

import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import top.xinstudio.glasssteps.GlassSteps;
import top.xinstudio.glasssteps.block.ModBlocks;

public class ModItemGroups {

    public static final ItemGroup GLASSSTEPS_GROUP = Registry.register(Registries.ITEM_GROUP, Identifier.of(GlassSteps.MOD_ID, "glasssteps_group"),
            ItemGroup.create(null, -1).displayName(Text.translatable("itemGroup.glasssteps_group"))
                    .icon(() -> new ItemStack(ModBlocks.GLASS_SLAB_BLOCK))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.GLASS_SLAB_BLOCK);
                    }).build());
    // 初始化方法
    public static void registerModItemGroups() {
        GlassSteps.LOGGER.info("Registering Item Groups");
    }
}