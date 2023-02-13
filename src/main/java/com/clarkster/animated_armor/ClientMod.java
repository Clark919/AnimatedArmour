package com.clarkster.animated_armor;

import com.clarkster.animated_armor.entity.client.armor.LivingArmorRenderer;
import com.clarkster.animated_armor.item.ModItems;
import net.fabricmc.api.ClientModInitializer;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class ClientMod implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        GeoArmorRenderer.registerArmorRenderer(new LivingArmorRenderer(), ModItems.LIVING_HELMET, ModItems.LIVING_CHESTPLATE, ModItems.LIVING_LEGGINGS, ModItems.LIVING_BOOTS);
    }
}
