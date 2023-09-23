package com.hastereapr.void_hands.setup;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.hastereapr.void_hands.void_hands.MODID;

public class ItemRegistration {

    public static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);

    // Item Types
    public static final Item.Properties EGG_PROPERTIES = new Item.Properties().tab(CreativeModeTab.TAB_MISC);

    public static final RegistryObject<Item> VOIDHAND_EGG = ITEMS.register("voidhand_spawn_egg", ()-> new ForgeSpawnEggItem(EntityRegistration.VOIDHAND, 0x0D0C0C, 0xBF0FDD, EGG_PROPERTIES));

    public static void init(IEventBus bus){
        //IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ITEMS.register(bus);
    }
}
