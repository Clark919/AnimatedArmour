package com.clarkster.animated_armor.entity.client.armor;
import com.clarkster.animated_armor.AnimatedArmorMod;
import com.clarkster.animated_armor.item.custom.*;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class LivingArmorModel extends AnimatedGeoModel<LivingArmorItem> {
    @Override
    public Identifier getModelResource(LivingArmorItem object) {
        return new Identifier(AnimatedArmorMod.MOD_ID, "geo/living_armor.geo.json");
    }

    @Override
    public Identifier getTextureResource(LivingArmorItem object) {
        return new Identifier(AnimatedArmorMod.MOD_ID, "textures/models/armor/living_armor_texture.png");
    }

    @Override
    public Identifier getAnimationResource(LivingArmorItem animatable) {
        return new Identifier(AnimatedArmorMod.MOD_ID, "animations/living_armor.animation.json");
    }
}
