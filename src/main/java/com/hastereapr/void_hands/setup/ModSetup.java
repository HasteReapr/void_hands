package com.hastereapr.void_hands.setup;

import com.hastereapr.void_hands.entity.custom.VoidHandEntity;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

public class ModSetup {

    public static void setup(){
        IEventBus bus = MinecraftForge.EVENT_BUS;

    }

    public static void init(FMLCommonSetupEvent event){

    }

    @SubscribeEvent
    public static void onAttributeCreate(EntityAttributeCreationEvent event){
        event.put(EntityRegistration.VOIDHAND.get(), VoidHandEntity.setAttributes());
    }
}
