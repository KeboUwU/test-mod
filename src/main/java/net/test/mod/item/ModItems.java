package net.test.mod.item;


import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.test.mod.TutorialMod;
import net.test.mod.item.custom.ChiselItem;


public class ModItems {

    public static final Item PINK_GARNET = registerItem("pink_garnet", new Item(new Item.Settings()));
    public static final Item RAW_PINK_GARNET = registerItem("raw_pink_garnet", new Item(new Item.Settings()));
    public static final Item BLUE_GARNET = registerItem("blue_garnet", new Item(new Item.Settings()));
    public static final Item BRANCH_FLOWER = registerItem("branch_flower", new Item(new Item.Settings()));
    public static final Item RAW_GREEN_GEM = registerItem("raw_green_gem", new Item(new Item.Settings()));
    public static final Item GREEN_GEM = registerItem("green_gem", new Item(new Item.Settings()));

    public static final Item CHISEL = registerItem("chisel",new ChiselItem(new Item.Settings().maxDamage(32)));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(TutorialMod.MOD_ID, name),item);
    }

    public static void registerModItems(){
        TutorialMod.LOGGER.info("Registering Mod Items for " + TutorialMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries ->{
           entries.add(PINK_GARNET);
           entries.add(RAW_PINK_GARNET);
           entries.add(BLUE_GARNET);
           entries.add(BRANCH_FLOWER);
           entries.add(RAW_GREEN_GEM);
           entries.add(GREEN_GEM);
           entries.add(CHISEL);

        });
    }
}
