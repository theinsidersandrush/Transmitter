package com.theinsidersandrush.transmitter.item;

import com.theinsidersandrush.transmitter.Transmitter;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ModItems {
    
     public static final Item SMALL_ANTENNA = registerItem("small_antenna",
     new Item(new FabricItemSettings().group(ItemGroup.REDSTONE).maxCount(64)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Transmitter.MOD_ID, name), item);
    }



    public static void registerModItems(){
        Transmitter.LOGGER.debug("Registering items for Transmitter mod...");
    }
}
