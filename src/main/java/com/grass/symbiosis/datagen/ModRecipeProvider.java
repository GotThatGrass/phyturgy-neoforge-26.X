package com.grass.symbiosis.datagen;

import com.grass.symbiosis.Item.ModItems;
import com.grass.symbiosis.Symbiosis;
import com.grass.symbiosis.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.neoforged.neoforge.common.PercentageAttribute;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider {
    protected ModRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
        super(registries, output);
    }

    @Override
    protected void buildRecipes() {
        shaped(RecipeCategory.MISC, ModBlocks.PEAT_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.PEAT.get())
                .unlockedBy("has_item", has(ModItems.PEAT.get()))
                .group("peat")
                .save(output);

        shapeless(RecipeCategory.MISC, ModItems.PEAT.get(), 9)
                .requires(ModBlocks.PEAT_BLOCK.get())
                .unlockedBy("has_item", has(ModBlocks.PEAT_BLOCK.get()))
                .group("peat")
                .save(output);
    }

    public static class Runner extends RecipeProvider.Runner {
        public Runner(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
            super(output, lookupProvider);
        }

        @Override
        protected RecipeProvider createRecipeProvider(HolderLookup.Provider provider, RecipeOutput output) {
            return new ModRecipeProvider(provider, output);
        }

        @Override
        public String getName() {
            return "Symbiosis Recipes";
        }
    }
}
