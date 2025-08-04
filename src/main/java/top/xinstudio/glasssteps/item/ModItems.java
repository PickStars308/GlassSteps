package top.xinstudio.glasssteps.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import top.xinstudio.glasssteps.GlassSteps;

public class ModItems {

//    public static final Item GLASS_STAIRS = registerItems("glass_stairs", new Item(new Item.Settings())); // 注册物品

    private static Item registerItems(String id, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(GlassSteps.MOD_ID, id), item);
    }
    private static void addItemToIG(FabricItemGroupEntries fabricItemGroupEntries){
//        fabricItemGroupEntries.add(GLASS_STAIRS);
    }
    // 初始化方法
    public static void registerModItems(){
//        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemToIG);
        GlassSteps.LOGGER.info("Registering Items");
    }

}