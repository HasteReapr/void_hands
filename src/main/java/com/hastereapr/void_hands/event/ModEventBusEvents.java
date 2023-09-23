package com.hastereapr.void_hands.event;

import com.hastereapr.void_hands.entity.custom.VoidHandEntity;
import com.hastereapr.void_hands.setup.EntityRegistration;
import com.hastereapr.void_hands.void_hands;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = void_hands.MODID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void entityAttributeEvent(EntityAttributeCreationEvent event){
        event.put(EntityRegistration.VOIDHAND.get(), VoidHandEntity.setAttributes());
    }
}