package com.hastereapr.void_hands.datagen;

import com.hastereapr.void_hands.void_hands;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class VoidLanguageProvider extends LanguageProvider {

    public VoidLanguageProvider(DataGenerator gen, String locale) {
        super(gen, void_hands.MODID, locale);
    }

    @Override
    protected  void addTranslations(){

    }
}
