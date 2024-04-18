package net.glados.gladosmod.item;

import net.glados.gladosmod.GLaDOSmod;
import net.glados.gladosmod.item.custom.BursztynArmorItem;
import net.glados.gladosmod.item.custom.HusariaArmorItem;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.UseAnim;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, GLaDOSmod.MOD_ID);
    //food
    public static final RegistryObject<Item> PIEROGI_SER = ITEMS.register("pierogi_ser",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.POLISHMOD_TAB).food(Foods.PIEROGI_SER)));
    public static final RegistryObject<Item> PIEROGI_MIESO = ITEMS.register("pierogi_mieso",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.POLISHMOD_TAB).food(Foods.PIEROGI_MIESO)));
    public static final RegistryObject<Item> PIEROGI_KAPUSTA = ITEMS.register("pierogi_kapusta",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.POLISHMOD_TAB).food(Foods.PIEROGI_KAPUSTA)));
    public static final RegistryObject<Item> PIEROGI_JAGODY = ITEMS.register("pierogi_jagody",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.POLISHMOD_TAB).food(Foods.PIEROGI_JAGODY)));
    public static final RegistryObject<Item> PIEROGI_RUSKIE = ITEMS.register("pierogi_ruskie",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.POLISHMOD_TAB).food(Foods.PIEROGI_RUSKIE)));
    public static final RegistryObject<Item> BIGOS = ITEMS.register("bigos",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.POLISHMOD_TAB).food(Foods.BIGOS)));
    public static final RegistryObject<Item> PIWO_Z = ITEMS.register("piwo_z",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.POLISHMOD_TAB).food(Foods.PIWO_Z)));
    //items
    public static final RegistryObject<Item> BURSZTYN = ITEMS.register("bursztyn",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.POLISHMOD_TAB)));
    //armor
    public static final RegistryObject<ArmorItem> BURSZTYN_HELMET = ITEMS.register("bursztyn_helmet",
            () -> new ArmorItem(BursztynArmorItem.BURSZTYN, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeModeTab.POLISHMOD_TAB)));
    public static final RegistryObject<ArmorItem> BURSZTYN_CHESTPLATE = ITEMS.register("bursztyn_chestplate",
            () -> new ArmorItem(BursztynArmorItem.BURSZTYN, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeModeTab.POLISHMOD_TAB)));
    public static final RegistryObject<ArmorItem> BURSZTYN_LEGGINGS = ITEMS.register("bursztyn_leggings",
            () -> new ArmorItem(BursztynArmorItem.BURSZTYN, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeModeTab.POLISHMOD_TAB)));
    public static final RegistryObject<ArmorItem> BURSZTYN_BOOTS = ITEMS.register("bursztyn_boots",
            () -> new ArmorItem(BursztynArmorItem.BURSZTYN, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeModeTab.POLISHMOD_TAB)));

    public static final RegistryObject<ArmorItem> HUSARIA_HELMET = ITEMS.register("husaria_helmet",
            () -> new ArmorItem(HusariaArmorItem.HUSARIA, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeModeTab.POLISHMOD_TAB)));
    public static final RegistryObject<ArmorItem> HUSARIA_CHESTPLATE = ITEMS.register("husaria_chestplate",
            () -> new ArmorItem(HusariaArmorItem.HUSARIA, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeModeTab.POLISHMOD_TAB)));
    public static final RegistryObject<ArmorItem> HUSARIA_LEGGINGS = ITEMS.register("husaria_leggings",
            () -> new ArmorItem(HusariaArmorItem.HUSARIA, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeModeTab.POLISHMOD_TAB)));
    public static final RegistryObject<ArmorItem> HUSARIA_BOOTS = ITEMS.register("husaria_boots",
            () -> new ArmorItem(HusariaArmorItem.HUSARIA, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeModeTab.POLISHMOD_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
    public static class Foods {
        public static final FoodProperties PIEROGI_SER = new FoodProperties.Builder()
                .nutrition(4)
                .saturationMod(0.6f)
                .alwaysEat()
                .fast()
                .build();
        public static final FoodProperties PIEROGI_MIESO = new FoodProperties.Builder()
                .nutrition(4)
                .saturationMod(0.6f)
                .alwaysEat()
                .fast()
                .build();
        public static final FoodProperties PIEROGI_KAPUSTA = new FoodProperties.Builder()
                .nutrition(4)
                .saturationMod(0.6f)
                .alwaysEat()
                .fast()
                .build();
        public static final FoodProperties PIEROGI_JAGODY = new FoodProperties.Builder()
                .nutrition(4)
                .saturationMod(0.6f)
                .alwaysEat()
                .fast()
                .build();
        public static final FoodProperties PIEROGI_RUSKIE = new FoodProperties.Builder()
                .nutrition(4)
                .saturationMod(0.6f)
                .alwaysEat()
                .fast()
                .build();
        public static final FoodProperties BIGOS = new FoodProperties.Builder()
                .nutrition(10)
                .saturationMod(0.7f)
                .alwaysEat()
                .build();
        public static final FoodProperties PIWO_Z = new FoodProperties.Builder()
                .nutrition(2)
                .saturationMod(1f)
                .alwaysEat()
                .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 100, 1), 1f)
                .effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 1200, 1), 1f)
                .build();


        public UseAnim getUseAnimation(ItemStack itemStack) {
            return UseAnim.DRINK;
            }
        }
    }