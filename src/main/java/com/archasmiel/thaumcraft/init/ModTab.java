package com.archasmiel.thaumcraft.init;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;

public class ModTab extends CreativeModeTab {

    public ModTab(String label) {
        super(label);
    }

    @Override
    public @NotNull ItemStack makeIcon() {
        return new ItemStack(ModItems.THAUMONOMICON.get());
    }
}
