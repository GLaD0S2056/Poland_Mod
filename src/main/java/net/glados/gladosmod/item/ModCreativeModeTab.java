package net.glados.gladosmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

import java.lang.annotation.Inherited;

public class ModCreativeModeTab {
    public static final CreativeModeTab POLISHMOD_TAB = new CreativeModeTab("polishmodtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.PIEROGI_SER.get());
        }

    };
}
