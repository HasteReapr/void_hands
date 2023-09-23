package com.hastereapr.void_hands;

import com.hastereapr.void_hands.entity.client.VoidHandRenderer;
import com.hastereapr.void_hands.setup.*;
import com.mojang.logging.LogUtils;
import mcjty.theoneprobe.rendering.ClientSetup;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DeferredWorkQueue;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import software.bernie.geckolib3.GeckoLib;

import java.util.stream.Collectors;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("void_hands")
public class void_hands
{
    // Directly reference a slf4j logger
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MODID = "void_hands";

    public void_hands()
    {
        GeckoLib.initialize();
        ModSetup.setup();

        // Register the setup method for modloading
        IEventBus modbus = FMLJavaModLoadingContext.get().getModEventBus();
        modbus.addListener(ModSetup::init);
        modbus.addListener(this::clientSetup);

        EntityRegistration.init(modbus);
        ItemRegistration.init(modbus);

        MinecraftForge.EVENT_BUS.register(this);

        //DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> () -> modbus.addListener(ModClientSetup::init));
    }

    private void clientSetup(final FMLClientSetupEvent event){
        EntityRenderers.register(EntityRegistration.VOIDHAND.get(), VoidHandRenderer::new);
    }
}
