package top.xinstudio.glasssteps;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import top.xinstudio.glasssteps.block.ModBlocks;
import top.xinstudio.glasssteps.item.ModItemGroups;
import top.xinstudio.glasssteps.item.ModItems;


public class GlassSteps implements ModInitializer {

    public static final String MOD_ID = "glasssteps";

    //LOGGER
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {

        ModBlocks.registerModBlocks();
//        ModItems.registerModItems();
        ModItemGroups.registerModItemGroups();
    }


}
