package com.clarkster.animated_armor.item;

import com.clarkster.animated_armor.AnimatedArmorMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import com.clarkster.animated_armor.item.custom.*;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item LIVING_HELMET = registerItem("living_helmet",
            new LivingArmorItem(ModArmorMaterials.LIVING, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ItemGroup.COMBAT)));
    public static final Item LIVING_CHESTPLATE = registerItem("living_chestplate",
            new LivingArmorItem(ModArmorMaterials.LIVING, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ItemGroup.COMBAT)));
    public static final Item LIVING_LEGGINGS = registerItem("living_leggings",
            new LivingArmorItem(ModArmorMaterials.LIVING, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ItemGroup.COMBAT)));
    public static final Item LIVING_BOOTS = registerItem("living_boots",
            new LivingArmorItem(ModArmorMaterials.LIVING, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ItemGroup.COMBAT)));
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(AnimatedArmorMod.MOD_ID, name), item);
    }
    public static void registerModItems() {
        AnimatedArmorMod.LOGGER.debug("Registering Mod Items for " + AnimatedArmorMod.MOD_ID);
    }
}
