package com.hastereapr.void_hands.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import com.hastereapr.void_hands.void_hands;

public class VoidBlockStates extends BlockStateProvider {

    public VoidBlockStates(DataGenerator gen, ExistingFileHelper helper){ super(gen, void_hands.MODID, helper); }

    @Override
    protected  void registerStatesAndModels(){

    }
}
