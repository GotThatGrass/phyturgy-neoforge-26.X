package com.grass.phyturgy.datagen;

import com.grass.phyturgy.Phyturgy;
import com.grass.phyturgy.tags.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.ItemTagsProvider;

import java.util.concurrent.CompletableFuture;

public class ModItemTagsProvider extends ItemTagsProvider {
    public ModItemTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider, Phyturgy.MOD_ID);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(ModTags.Items.BIOMATTER)
                .addTag(Tags.Items.MUSHROOMS)
                .addTag(Tags.Items.CROPS)
                .addTag(Tags.Items.FLOWERS)
                .addTag(Tags.Items.SEEDS)
                .addTag(Tags.Items.FOODS_FRUIT)
                .addTag(Tags.Items.FOODS_VEGETABLE)
                .addTag(Tags.Items.FOODS_BERRY);
    }
}
