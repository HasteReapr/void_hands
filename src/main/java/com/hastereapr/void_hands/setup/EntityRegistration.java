package com.hastereapr.void_hands.setup;

import com.hastereapr.void_hands.entity.custom.VoidHandEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.hastereapr.void_hands.void_hands.MODID;

public class EntityRegistration {

    public static DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES, MODID);

    // Entity Types
    public static final RegistryObject<EntityType<VoidHandEntity>> VOIDHAND = ENTITIES.register("voidhand", () -> EntityType.Builder.of(VoidHandEntity::new, MobCategory.MONSTER)
            .sized(0.5f, 7f)
            .clientTrackingRange(8)
            .setShouldReceiveVelocityUpdates(false)
            .build(new ResourceLocation(MODID, "voidhand").toString()));

    public static void init(IEventBus bus){
        ENTITIES.register(bus);
    }
}
