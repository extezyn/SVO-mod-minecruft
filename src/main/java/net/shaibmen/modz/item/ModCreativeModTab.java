package net.shaibmen.modz.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModTab {

    public static final CreativeModeTab METEORIT_TAB = new CreativeModeTab("Meteorite tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.METEORIT.get());
        }
    };
}
