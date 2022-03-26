package com.archasmiel.thaumcraft;

import com.archasmiel.thaumcraft.init.ModItems;
import com.archasmiel.thaumcraft.init.ModTab;
import com.archasmiel.thaumcraft.init.Register;
import com.mojang.logging.LogUtils;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Thaumcraft.MOD_ID)
public class Thaumcraft
{

    private static final Logger LOGGER = LogUtils.getLogger();

    public static final String MOD_ID = "thaumcraft";
    public static final String MOD_NAME = "Thaumcraft";

    public static final CreativeModeTab MOD_TAB = new ModTab(MOD_ID);


    public Thaumcraft()
    {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        IEventBus forgeBus = MinecraftForge.EVENT_BUS;

        Register.register(eventBus);
        ModItems.register();

        eventBus.addListener(this::setup);

        forgeBus.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        // some preinit code
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }

}
