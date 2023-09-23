package com.hastereapr.void_hands.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import com.hastereapr.void_hands.void_hands;

public class VoidBlockTags extends BlockTagsProvider {

    public VoidBlockTags(DataGenerator generator, ExistingFileHelper helper){
        super(generator, void_hands.MODID, helper);
    }

    @Override
    protected void addTags(){

    }

    @Override
    public String getName(){ return "Void Hand Tags"; }
}
