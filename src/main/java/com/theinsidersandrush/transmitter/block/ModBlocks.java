package com.theinsidersandrush.transmitter.block;

import com.theinsidersandrush.transmitter.Transmitter;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    // Hard code to think at all.
    public static final Block TRANSMITTER_BLOCK = registerBlock("transmitter_block",
        new Block(FabricBlockSettings.of(Material.METAL).strength(4f).resistance(4.0f)), null);
        public static final Block TRANSMITTER_ANTENNA = registerBlock("transmitter_antenna",
        new Block(FabricBlockSettings.of(Material.METAL).strength(5f).resistance(5.0f)), null);
        public static final Block RADIO = registerBlock("radio",
        new Block(FabricBlockSettings.of(Material.METAL).strength(2.5f).resistance(3.0f)), null);
        public static final Block EXTERNAL_ANTENNA = registerBlock("external_antenna",
        new Block(FabricBlockSettings.of(Material.METAL).strength(2.5f).resistance(3.0f)), null);
        public static final Block ANTENNA_CABLE = registerBlock("antenna_cable",
        new Block(FabricBlockSettings.of(Material.METAL).strength(2.5f).resistance(3.0f)), null);






    private static Block registerBlock(String name, Block block, ItemGroup tab){
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(Transmitter.MOD_ID, name), block);
    }
   
   private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
    return Registry.register(Registry.ITEM, new Identifier(Transmitter.MOD_ID, name),
    new BlockItem(block, new FabricItemSettings().group(tab)));
   }
    
   
    public static void registerModBlocks(){
        Transmitter.LOGGER.debug("Registering blocks for " + Transmitter.MOD_ID);
    }
}
