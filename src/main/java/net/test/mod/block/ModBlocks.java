package net.test.mod.block;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.test.mod.TutorialMod;

public class ModBlocks {

    private static void reisterBlockItem(String name, Block block){
        Registry.register(Registries.ITEM, Identifier.of(TutorialMod.MOD_ID,name),
                new BlockItem(block, new Item.Settings()));
    }


    public static void  registerModBlocks(){
        TutorialMod.LOGGER.info("Registering Mod Blocks for: " + TutorialMod.MOD_ID);
    }
}
