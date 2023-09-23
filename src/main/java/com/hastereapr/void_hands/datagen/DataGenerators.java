package com.hastereapr.void_hands.datagen;


import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import com.hastereapr.void_hands.void_hands;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = void_hands.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event){
        DataGenerator generator = event.getGenerator();
        if(event.includeServer()) {
            generator.addProvider(new VoidRecipes(generator));
            generator.addProvider(new VoidLootTables(generator));
            VoidBlockTags blockTags = new VoidBlockTags(generator, event.getExistingFileHelper());
            generator.addProvider(blockTags);
            generator.addProvider(new VoidItemTags(generator, blockTags, event.getExistingFileHelper()));
        }
        if(event.includeClient()){
            generator.addProvider(new VoidBlockStates(generator, event.getExistingFileHelper()));
            generator.addProvider(new VoidItemModels(generator, event.getExistingFileHelper()));
            generator.addProvider(new VoidLanguageProvider(generator, "en_us"));
        }
    }
}
