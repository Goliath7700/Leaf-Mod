package io.github.goliath7700.leafmod.items;

import io.github.goliath7700.leafmod.LeafMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;

public class ModItemsIds {

    public static final ResourceKey<Item> GLITCHED_MATTER = create("glitched_matter");

    public static ResourceKey<Item> create(String name) {
        // Create the item key.
        return ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(LeafMod.MOD_ID, name));
    }
}
