package com.archasmiel.thaumcraft.init;

import com.archasmiel.thaumcraft.Thaumcraft;
import com.archasmiel.thaumcraft.init.item.Caps;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {


    public static final RegistryObject<Item> THAUMONOMICON
            = Register.ITEMS.register(
                "thaumonomicon",
                () -> new Item(new Item.Properties().tab(Thaumcraft.MOD_TAB))
            );

    public static final RegistryObject<Item> PRIMAL_CHARM
            = Register.ITEMS.register(
                "primal_charm",
                () -> new Item(new Item.Properties().tab(Thaumcraft.MOD_TAB))
            );



    public static void register() {
        Caps.register();
    }

}
