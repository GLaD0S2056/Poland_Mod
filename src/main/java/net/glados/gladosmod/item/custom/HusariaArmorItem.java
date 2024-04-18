package net.glados.gladosmod.item.custom;

import net.glados.gladosmod.GLaDOSmod;
import net.glados.gladosmod.item.ModItems;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.MinecartItem;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.function.Supplier;

public enum HusariaArmorItem implements ArmorMaterial{

    HUSARIA("husaria", 30, new int[]{ 3, 6, 8, 3 }, 25,
            SoundEvents.ARMOR_EQUIP_GENERIC, 2f, 1.5f, () -> Ingredient.of(Items.IRON_INGOT));

    private static final int[] MAX_DAMAGE_ARRAY = new int[] { 11, 16, 15, 13};
    private final String name;
    private final int maxDamageFactor;
    private final int[] damageReductionAmountArray;
    private final int enchantability;
    private final SoundEvent soundEvent;
    private final float toughness;
    private final Supplier<Ingredient> repairMaterial;
    private final float knockbackResistance;

    HusariaArmorItem(String name, int maxDamageFactor, int[] damageReductionAmountArray, int enchantability, SoundEvent soundEvent, float v, float toughness, Supplier<Ingredient> repairMaterial) {
        this.name = name;
        this.maxDamageFactor = maxDamageFactor;
        this.damageReductionAmountArray = damageReductionAmountArray;
        this.enchantability = enchantability;
        this.soundEvent = soundEvent;
        this.toughness = toughness;
        this.repairMaterial = repairMaterial;
        knockbackResistance = 0;
    }

    ;

    @Override
    public int getDurabilityForSlot(EquipmentSlot equipmentSlot) {

        return MAX_DAMAGE_ARRAY[equipmentSlot.getIndex()] * this.maxDamageFactor;
    }

    @Override
    public int getDefenseForSlot(EquipmentSlot equipmentSlot) {

        return this.damageReductionAmountArray[equipmentSlot.getIndex()];
    }

    @Override
    public int getEnchantmentValue() {

        return this.enchantability;
    }

    @Override
    public SoundEvent getEquipSound() {

        return this.soundEvent;
    }

    @Override
    public Ingredient getRepairIngredient() {

        return this.repairMaterial.get();
    }
    @OnlyIn(Dist.CLIENT)

    @Override
    public String getName() {

        return GLaDOSmod.MOD_ID + ":" + this.name;
    }

    @Override
    public float getToughness() {

        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {

        return this.knockbackResistance;
    }

    public SoundEvent getSoundEvent() {
        return soundEvent;
    };




}
