package com.grass.phyturgy.datagen;

import com.grass.phyturgy.Phyturgy;
import com.grass.phyturgy.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagsProvider extends BlockTagsProvider {
    public ModBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider, Phyturgy.PHYTURGY);
    }

    @Override
    protected void addTags(HolderLookup.Provider lookupProvider) {
        tag(BlockTags.MINEABLE_WITH_SHOVEL)
                .add(ModBlocks.PEAT_BLOCK.get());
    }
}
