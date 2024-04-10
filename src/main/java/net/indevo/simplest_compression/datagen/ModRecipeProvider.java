package net.indevo.simplest_compression.datagen;

import net.indevo.simplest_compression.block.ModBlocks;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> p_251297_) {
        //BLOCKS

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.Compressed_Cobblestone.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', Items.COBBLESTONE)
                .unlockedBy("has_cobblestone", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.COBBLESTONE).build()))
                .save(p_251297_);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.Compressed_Blackstone.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', Items.BLACKSTONE)
                .unlockedBy("has_blackstone", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.BLACKSTONE).build()))
                .save(p_251297_);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.Compressed_Cobbled_Deepslate.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', Items.COBBLED_DEEPSLATE)
                .unlockedBy("has_cobbled_deepslate", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.COBBLED_DEEPSLATE).build()))
                .save(p_251297_);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.Compressed_Basalt.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', Items.BASALT)
                .unlockedBy("has_basalt", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.BASALT).build()))
                .save(p_251297_);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.Compressed_Calcite.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', Items.CALCITE)
                .unlockedBy("has_calcite", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.CALCITE).build()))
                .save(p_251297_);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.Compressed_Clay.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', Items.CLAY)
                .unlockedBy("has_clay", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.CLAY).build()))
                .save(p_251297_);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.Compressed_Diorite.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', Items.DIORITE)
                .unlockedBy("has_diorite", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.DIORITE).build()))
                .save(p_251297_);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.Compressed_Dirt.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', Items.DIRT)
                .unlockedBy("has_dirt", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.DIRT).build()))
                .save(p_251297_);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.Compressed_Dripstone_Block.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', Items.DRIPSTONE_BLOCK)
                .unlockedBy("has_dripstone_block", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.DRIPSTONE_BLOCK).build()))
                .save(p_251297_);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.Compressed_End_Stone.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', Items.END_STONE)
                .unlockedBy("has_end_stone", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.END_STONE).build()))
                .save(p_251297_);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.Compressed_Granite.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', Items.GRANITE)
                .unlockedBy("has_granite", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.GRANITE).build()))
                .save(p_251297_);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.Compressed_Gravel.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', Items.GRAVEL)
                .unlockedBy("has_gravel", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.GRAVEL).build()))
                .save(p_251297_);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.Compressed_Netherrack.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', Items.NETHERRACK)
                .unlockedBy("has_netherrack", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.NETHERRACK).build()))
                .save(p_251297_);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.Compressed_Sand.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', Items.SAND)
                .unlockedBy("has_sand", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.SAND).build()))
                .save(p_251297_);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.Compressed_Tuff.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', Items.TUFF)
                .unlockedBy("has_tuff", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.TUFF).build()))
                .save(p_251297_);
    }
}