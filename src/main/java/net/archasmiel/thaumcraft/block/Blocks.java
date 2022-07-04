package net.archasmiel.thaumcraft.block;

import net.archasmiel.thaumcraft.Thaumcraft;
import net.archasmiel.thaumcraft.block.blocks.ArcaneWorkbench;
import net.archasmiel.thaumcraft.block.blocks.DeconstructionTable;
import net.archasmiel.thaumcraft.block.blocks.Table;
import net.archasmiel.thaumcraft.item.Items;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class Blocks {

    public static final BlockBehaviour.Properties WOODEN_BLOCK_SETTINGS = BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD);

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Thaumcraft.MOD_ID);

    public static RegistryObject<Block> TABLE;
    public static RegistryObject<Block> ARCANE_WORKBENCH;
    public static RegistryObject<Block> DECONSTRUCTION_TABLE;














    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        return Items.registerItem(
            name,
            () -> new BlockItem(block.get(), new Item.Properties().tab(tab))
        );
    }





    private static void registerBlocks() {
        TABLE = registerBlock("table", () -> new Table(WOODEN_BLOCK_SETTINGS), Thaumcraft.MOD_TAB);
        ARCANE_WORKBENCH = registerBlock("arcane_workbench", () -> new ArcaneWorkbench(WOODEN_BLOCK_SETTINGS), Thaumcraft.MOD_TAB);
        DECONSTRUCTION_TABLE = registerBlock("deconstruction_table", () -> new DeconstructionTable(WOODEN_BLOCK_SETTINGS), Thaumcraft.MOD_TAB);
    }





    public static void register(IEventBus eventBus) {
        registerBlocks();
        BLOCKS.register(eventBus);
    }

}
