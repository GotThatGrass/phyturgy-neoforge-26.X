package com.grass.symbiosis.datagen;

import com.grass.symbiosis.Symbiosis;
import com.grass.symbiosis.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagsProvider extends BlockTagsProvider {
    public ModBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider, Symbiosis.MOD_ID);
    }

    @Override
    protected void addTags(HolderLookup.Provider lookupProvider) {
        tag(BlockTags.MINEABLE_WITH_SHOVEL)
                .add(ModBlocks.PEAT_BLOCK.get());
    }
}
