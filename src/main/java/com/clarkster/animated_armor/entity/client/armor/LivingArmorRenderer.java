package com.clarkster.animated_armor.entity.client.armor;

import com.clarkster.animated_armor.item.custom.LivingArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class LivingArmorRenderer extends GeoArmorRenderer<LivingArmorItem> {

    public LivingArmorRenderer() {
        super(new LivingArmorModel());

        this.headBone = "armorHead";
        this.bodyBone = "armorBody";
        this.rightArmBone = "armorRightArm";
        this.leftArmBone = "armorLeftArm";
        this.rightLegBone = "armorLeftLeg";
        this.leftLegBone = "armorRightLeg";
        this.rightBootBone = "armorLeftBoot";
        this.leftBootBone = "armorRightBoot";
    }
}
