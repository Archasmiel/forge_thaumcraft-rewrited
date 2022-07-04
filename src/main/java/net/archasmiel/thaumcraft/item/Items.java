package net.archasmiel.thaumcraft.item;

import net.archasmiel.thaumcraft.Thaumcraft;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class Items {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Thaumcraft.MOD_ID);

    public static RegistryObject<Item> THAUMONOMICON;
    public static RegistryObject<Item> THAUMONOMICON_CHEAT;
    public static RegistryObject<Item> CRIMSON_RITES;












    public static <T extends Item> RegistryObject<T> registerItem(String name, Supplier<T> item) {
        return ITEMS.register(name, item);
    }







    private static void registerBooks() {
        THAUMONOMICON = registerItem("thaumonomicon", () -> new Item(new Item.Properties().tab(Thaumcraft.MOD_TAB)));
        THAUMONOMICON_CHEAT = registerItem("thaumonomicon_cheat", () -> new Item(new Item.Properties().tab(Thaumcraft.MOD_TAB)));
        CRIMSON_RITES = registerItem("crimson_rites", () -> new Item(new Item.Properties().tab(Thaumcraft.MOD_TAB)));
    }

    public static void register(IEventBus eventBus) {
        registerBooks();
        ITEMS.register(eventBus);
    }

}
