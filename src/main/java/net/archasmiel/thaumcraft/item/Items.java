package net.archasmiel.thaumcraft.item;

import net.archasmiel.thaumcraft.Thaumcraft;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Items {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Thaumcraft.MOD_ID);

    public static RegistryObject<Item> THAUMONOMICON;
    public static RegistryObject<Item> THAUMONOMICON_CHEAT;
    public static RegistryObject<Item> CRIMSON_RITES;














    private static void registerBooks() {
        THAUMONOMICON = ITEMS.register("thaumonomicon", () -> new Item(new Item.Properties().tab(Thaumcraft.MOD_TAB)));
        THAUMONOMICON_CHEAT = ITEMS.register("thaumonomicon_cheat", () -> new Item(new Item.Properties().tab(Thaumcraft.MOD_TAB)));
        CRIMSON_RITES = ITEMS.register("crimson_rites", () -> new Item(new Item.Properties().tab(Thaumcraft.MOD_TAB)));
    }



    public static void register(IEventBus eventBus) {
        registerBooks();
        ITEMS.register(eventBus);
    }

}
