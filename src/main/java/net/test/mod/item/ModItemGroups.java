package net.test.mod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.test.mod.TutorialMod;
import net.test.mod.block.ModBlocks;
import net.test.mod.item.custom.ChiselItem;

public class ModItemGroups {
    public static final ItemGroup PINK_GARNET_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID,"pink_garnet_items"),
            FabricItemGroup.builder().icon(()->new ItemStack(ModItems.PINK_GARNET))
                    .displayName(Text.translatable("itemgroup.tutorial.pink_garnet_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.PINK_GARNET);
                        entries.add(ModItems.RAW_PINK_GARNET);

                        entries.add(ModItems.CHISEL);
                    }).build());
    public static final ItemGroup PINK_GARNET_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID,"pink_garnet_blocks"),
            FabricItemGroup.builder().icon(()->new ItemStack(ModBlocks.PINK_GARNET_BLOCK))
                    .displayName(Text.translatable("itemgroup.tutorial.pink_garnet_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.PINK_GARNET_BLOCK);
                        entries.add(ModBlocks.RAW_PINK_GARNET_BLOCK);
                        entries.add(ModBlocks.PINK_GARNET_ORE);
                        entries.add(ModBlocks.PINK_GARNET_DEEPSLATE_ORE);
                        entries.add(ModBlocks.MAGIC_BLOCK);
                        entries.add(ModItems.CAULIFLOWER);
                        entries.add(ModItems.STARLIGHT_ASHES);
                    }).build());
    public static final ItemGroup  CUSTOM_BLOCKS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID,"custom_blocks"),
            FabricItemGroup.builder().icon(()->new ItemStack(ModBlocks.GREEN_GEM_BLOCK))
                    .displayName(Text.translatable("itemgroup.tutorial.custom_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.GREEN_GEM_BLOCK);
                        entries.add(ModItems.BRANCH_FLOWER);
                        entries.add(ModItems.BLUE_GARNET);
                        entries.add(ModBlocks.JVREX);
                        entries.add(ModBlocks.MARCIN);
                        entries.add(ModItems.RAW_GREEN_GEM);
                        entries.add(ModItems.GREEN_GEM);
                        entries.add((ModBlocks.GREEN_GEM_ORE));
                        entries.add(ModItems.FRIED_EGG);

                    }).build());


    public static void registerItemGroups(){
        TutorialMod.LOGGER.info("Registering Item Groups for "+ TutorialMod.MOD_ID);
    }



}
