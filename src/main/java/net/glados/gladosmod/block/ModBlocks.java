package net.glados.gladosmod.block;

import net.glados.gladosmod.GLaDOSmod;
import net.glados.gladosmod.item.ModCreativeModeTab;
import net.glados.gladosmod.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, GLaDOSmod.MOD_ID);
    public static final RegistryObject<Block> BURSZTYN_BLOCK = registerBlock("bursztyn_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.AMETHYST)
                    .strength(1).requiresCorrectToolForDrops().sound(SoundType.AMETHYST).destroyTime(1)), ModCreativeModeTab.POLISHMOD_TAB);
    public static final RegistryObject<Block> BURSZTYN_ORE = registerBlock("bursztyn_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2).requiresCorrectToolForDrops().destroyTime(1),
                    UniformInt.of(3,7)), ModCreativeModeTab.POLISHMOD_TAB);

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }
    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
