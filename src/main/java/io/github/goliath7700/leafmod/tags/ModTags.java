package io.github.goliath7700.leafmod.tags;

import io.github.goliath7700.leafmod.LeafMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        private static TagKey<Block> createTag(String name) {
            return TagKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(LeafMod.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> FLOATING_ITEMS = createTag("floating_items");

        private static TagKey<Item> createTag(String name) {
            return TagKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(LeafMod.MOD_ID, name));
        }
    }
}
