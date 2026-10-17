package com.grass.phyturgy.datagen;

import com.grass.phyturgy.Item.ModItems;
import com.grass.phyturgy.Phyturgy;
import com.grass.phyturgy.block.ModBlocks;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.data.PackOutput;

public class ModModelProvider extends ModelProvider {
    public ModModelProvider(PackOutput output) {
        super(output, Phyturgy.MOD_ID);
    }

    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {
        itemModels.generateFlatItem(ModItems.FIELD_JOURNAL.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.PINECONE.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.PEAT.get(), ModelTemplates.FLAT_ITEM);

        blockModels.createTrivialCube(ModBlocks.PEAT_BLOCK.get());
    }
}
