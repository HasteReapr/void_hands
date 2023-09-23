package com.hastereapr.void_hands.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import com.hastereapr.void_hands.void_hands;

public class VoidItemModels  extends ItemModelProvider {

    public VoidItemModels(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, void_hands.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels(){

    }
}
