package net.extezyn.modz.block;

import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.extezyn.modz.ModZ;
import net.extezyn.modz.item.ModCreativeModTab;
import net.extezyn.modz.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public  static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, ModZ.MOD_ID);


    public static final RegistryObject<Block> METEORIT_BLOCK = registryBlock("meteorit_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2.5f).requiresCorrectToolForDrops()), ModCreativeModTab.METEORIT_TAB);

    public static final RegistryObject<Block> METEORIT_ORE = registryBlock("meteorit_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.DIRT)
                    .strength(2.5f, 18).requiresCorrectToolForDrops(),
                    UniformInt.of(3, 7)), ModCreativeModTab.METEORIT_TAB);

    public static <T extends Block> RegistryObject<T> registryBlock(String name, Supplier<T> block, CreativeModeTab tab){
        RegistryObject<T> toReturns = BLOCKS.register(name, block);
        registryBlockItem(name, toReturns, tab);
        return toReturns;
    }

    public static <T extends  Block> RegistryObject<Item> registryBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab){
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
