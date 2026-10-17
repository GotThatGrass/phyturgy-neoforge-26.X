package com.grass.symbiosis.datagen;

import com.grass.symbiosis.Item.ModItems;
import com.grass.symbiosis.Symbiosis;
import com.grass.symbiosis.block.ModBlocks;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.data.PackOutput;

public class ModModelProvider extends ModelProvider {
    public ModModelProvider(PackOutput output) {
        super(output, Symbiosis.MOD_ID);
    }

    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {
        itemModels.generateFlatItem(ModItems.FIELD_JOURNAL.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.PINECONE.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.PEAT.get(), ModelTemplates.FLAT_ITEM);

        blockModels.createTrivialCube(ModBlocks.PEAT_BLOCK.get());
    }
}
