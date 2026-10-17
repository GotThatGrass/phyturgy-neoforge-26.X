package com.grass.symbiosis.Item;

import com.grass.symbiosis.Symbiosis;
import com.grass.symbiosis.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(
            Registries.CREATIVE_MODE_TAB,
            Symbiosis.MOD_ID
    );

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

    public static final Supplier<CreativeModeTab> SYMBIOSIS_TAB = CREATIVE_MODE_TABS.register("symbiosis", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup." + Symbiosis.MOD_ID))
            .icon(() -> new ItemStack(Items.FERN))
            .displayItems((params, output) -> {
                output.accept(ModItems.FIELD_JOURNAL.get());
                output.accept(ModItems.PINECONE.get());
                output.accept(ModItems.PEAT.get());

                output.accept(ModBlocks.PEAT_BLOCK.get());
            })
            .build()
    );
}
