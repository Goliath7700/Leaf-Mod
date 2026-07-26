package io.github.goliath7700.leafmod.client.datagen;

import io.github.goliath7700.leafmod.items.ModItems;
import io.github.goliath7700.leafmod.items.ModItemsIds;
import io.github.goliath7700.leafmod.tags.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class ModItemTagsProvider extends FabricTagsProvider.ItemTagsProvider {
    public ModItemTagsProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider registries) {
        builder(ModTags.Items.FLOATING_ITEMS)
                .add(ModItemsIds.GLITCHED_MATTER);
    }
}
