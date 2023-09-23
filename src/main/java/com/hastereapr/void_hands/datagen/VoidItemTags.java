package com.hastereapr.void_hands.datagen;

import com.hastereapr.void_hands.void_hands;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class VoidItemTags  extends ItemTagsProvider {

    public VoidItemTags(DataGenerator generator, BlockTagsProvider blockTags, ExistingFileHelper helper){
        super(generator, blockTags, void_hands.MODID, helper);
    }

    @Override
    protected void addTags(){

    }

    @Override
    public String getName() { return "Void Hand Tags"; }
}
