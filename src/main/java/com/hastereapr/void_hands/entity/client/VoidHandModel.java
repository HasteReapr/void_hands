package com.hastereapr.void_hands.entity.client;

import com.hastereapr.void_hands.entity.custom.VoidHandEntity;
import com.hastereapr.void_hands.void_hands;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.model.provider.data.EntityModelData;

public class VoidHandModel extends AnimatedGeoModel<VoidHandEntity> {
    @Override
    public ResourceLocation getModelLocation(VoidHandEntity voidHandEntity) {
        return new ResourceLocation(void_hands.MODID, "geo/voidhand.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(VoidHandEntity voidHandEntity) {
        return new ResourceLocation(void_hands.MODID, "textures/entity/voidhand/voidhand.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(VoidHandEntity voidHandEntity) {
        return new ResourceLocation(void_hands.MODID, "animations/voidhand.animation.json");
    }
}
