package net.shaibmen.modz.item;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.shaibmen.modz.ModZ;
import net.shaibmen.modz.base.ModArmorMaterial;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ModZ.MOD_ID);

    public static final RegistryObject<Item> METEORIT = ITEMS.register("meteorit_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.METEORIT_TAB)));
    public static final RegistryObject<Item> DONEMETEORIT = ITEMS.register("notdone_ore",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.METEORIT_TAB)));

    public static final RegistryObject<Item> AXE = ITEMS.register("axe",
            () -> new AxeItem(Tiers.EXAMPLE, 6, -3.1F, new Item.Properties().tab(ModCreativeModTab.METEORIT_TAB)));

    public static final RegistryObject<Item> HOE = ITEMS.register("hoe",
            () -> new HoeItem(Tiers.EXAMPLE, 0, -3.0F, new Item.Properties().tab(ModCreativeModTab.METEORIT_TAB)));

    public static final RegistryObject<Item> PICKAXE = ITEMS.register("pickaxe",
            () -> new PickaxeItem(Tiers.EXAMPLE, 1, -2.8F, new Item.Properties().tab(ModCreativeModTab.METEORIT_TAB)));

    public static final RegistryObject<Item> SHOVEL = ITEMS.register("shovel",
            () -> new ShovelItem(Tiers.EXAMPLE, 1.5F, -3.0F, new Item.Properties().tab(ModCreativeModTab.METEORIT_TAB)));

    public static final RegistryObject<Item> SWORD = ITEMS.register("sword",
            () -> new SwordItem(Tiers.EXAMPLE, 4, -2.4F, new Item.Properties().tab(ModCreativeModTab.METEORIT_TAB)));

    public static final RegistryObject<ArmorItem> METEORIT_HELMET = ITEMS.register("meteorit_helmet",
            () -> new ArmorItem(ArmorTier.EXAMPLE, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeModTab.METEORIT_TAB)));

    public static final RegistryObject<ArmorItem> METEORIT_CHESTPLATE = ITEMS.register("meteorit_chestplate",
            () -> new ArmorItem(ArmorTier.EXAMPLE, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeModTab.METEORIT_TAB)));

    public static final RegistryObject<ArmorItem> METEORIT_LEGGINGS = ITEMS.register("meteorit_leggings",
            () -> new ArmorItem(ArmorTier.EXAMPLE, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeModTab.METEORIT_TAB)));

    public static final RegistryObject<ArmorItem> METEORIT_BOOTS = ITEMS.register("meteorit_boots",
            () -> new ArmorItem(ArmorTier.EXAMPLE, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeModTab.METEORIT_TAB)));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
    public static class Tiers{
        public static final Tier EXAMPLE = new ForgeTier(2, 250, 6.0f, 2.0f, 14, null, () -> Ingredient.EMPTY);
    }

    public static class ArmorTier {
        public static final ArmorMaterial EXAMPLE = new ModArmorMaterial(
          "meteorit",
                439,
                new int[] {3,2,5,2},
                300,
                SoundEvents.ARMOR_EQUIP_GOLD,
                0.0f,
                0.0f,
                () -> Ingredient.EMPTY
        );
    }
}

