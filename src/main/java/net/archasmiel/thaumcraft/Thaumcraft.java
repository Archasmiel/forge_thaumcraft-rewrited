package net.archasmiel.thaumcraft;

import com.mojang.logging.LogUtils;
import net.archasmiel.thaumcraft.block.Blocks;
import net.archasmiel.thaumcraft.item.Items;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;

@Mod(Thaumcraft.MOD_ID)
public class Thaumcraft
{

    public static final String MOD_NAME = "Thaumcraft 4 Rewrited";
    public static final String MOD_ID = "thaumcraft";
    private static final Logger LOGGER = LogUtils.getLogger();

    public static final CreativeModeTab MOD_TAB = new CreativeModeTab("thaumcraftTab") {
        @Override
        public @NotNull ItemStack makeIcon() {
            return new ItemStack(Items.THAUMONOMICON.get());
        }
    };


    public Thaumcraft() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::setup);

        Items.register(modEventBus);
        Blocks.register(modEventBus);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        LOGGER.info(MOD_NAME + " setup started!");
    }

}
