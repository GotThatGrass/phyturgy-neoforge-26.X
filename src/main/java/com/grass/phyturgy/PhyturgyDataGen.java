package com.grass.phyturgy;

import com.grass.phyturgy.datagen.ModBlockLootTableProvider;
import com.grass.phyturgy.datagen.ModBlockTagsProvider;
import com.grass.phyturgy.datagen.ModModelProvider;
import com.grass.phyturgy.datagen.ModRecipeProvider;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.List;
import java.util.Set;

@EventBusSubscriber(modid = Phyturgy.PHYTURGY)
public class PhyturgyDataGen {
    @SubscribeEvent
    public static void gatherClientData(GatherDataEvent.Client event) {

        event.createProvider(ModModelProvider::new);
        event.createProvider(ModBlockTagsProvider::new);
        event.createProvider(ModRecipeProvider.Runner::new);
        event.createProvider((output, lookupProvider) -> new LootTableProvider(
                output,
                Set.of(),
                List.of(
                        new LootTableProvider.SubProviderEntry(
                                ModBlockLootTableProvider::new,
                                LootContextParamSets.BLOCK
                        )
                ),
                lookupProvider
        ));
    }
}
