package com.grass.phyturgy.Item;

import com.grass.phyturgy.Phyturgy;
import com.grass.phyturgy.block.ModBlocks;
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
            Phyturgy.MOD_ID
    );

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

    public static final Supplier<CreativeModeTab> PHYTURGY_TAB = CREATIVE_MODE_TABS.register("phyturgy", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup." + Phyturgy.MOD_ID))
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
