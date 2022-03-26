package com.archasmiel.thaumcraft.init.item;

import com.archasmiel.thaumcraft.Thaumcraft;
import com.archasmiel.thaumcraft.init.Register;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.RegistryObject;

public class Caps {

    public static final RegistryObject<Item> CAP_COPPER
            = Register.ITEMS.register(
            "cap/cap_copper",
            () -> new Item(new Item.Properties().tab(Thaumcraft.MOD_TAB))
    );

    public static final RegistryObject<Item> CAP_GOLD
            = Register.ITEMS.register(
            "cap/cap_gold",
            () -> new Item(new Item.Properties().tab(Thaumcraft.MOD_TAB))
    );

    public static final RegistryObject<Item> CAP_IRON
            = Register.ITEMS.register(
            "cap/cap_iron",
            () -> new Item(new Item.Properties().tab(Thaumcraft.MOD_TAB))
    );

    public static final RegistryObject<Item> CAP_SILVER_INERT
            = Register.ITEMS.register(
            "cap/cap_silver_inert",
            () -> new Item(new Item.Properties().tab(Thaumcraft.MOD_TAB))
    );

    public static final RegistryObject<Item> CAP_SILVER
            = Register.ITEMS.register(
            "cap/cap_silver",
            () -> new Item(new Item.Properties().tab(Thaumcraft.MOD_TAB))
    );

    public static final RegistryObject<Item> CAP_THAUMIUM_INERT
            = Register.ITEMS.register(
            "cap/cap_thaumium_inert",
            () -> new Item(new Item.Properties().tab(Thaumcraft.MOD_TAB))
    );

    public static final RegistryObject<Item> CAP_THAUMIUM
            = Register.ITEMS.register(
            "cap/cap_thaumium",
            () -> new Item(new Item.Properties().tab(Thaumcraft.MOD_TAB))
    );

    public static final RegistryObject<Item> CAP_VOID_INERT
            = Register.ITEMS.register(
            "cap/cap_void_inert",
            () -> new Item(new Item.Properties().tab(Thaumcraft.MOD_TAB))
    );

    public static final RegistryObject<Item> CAP_VOID
            = Register.ITEMS.register(
            "cap/cap_void",
            () -> new Item(new Item.Properties().tab(Thaumcraft.MOD_TAB))
    );

    public static void register() {}

}
