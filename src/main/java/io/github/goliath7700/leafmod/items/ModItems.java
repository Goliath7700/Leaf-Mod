package io.github.goliath7700.leafmod.items;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.*;

import java.util.function.Function;

public class ModItems {
    public static void initialize() {
    }

    public static final Item GLITCHED_MATTER = register(ModItemsIds.GLITCHED_MATTER, Item::new, new Item.Properties().rarity(Rarity.UNCOMMON));
    public static final Item AMETHYST_STAFF = register(ModItemsIds.AMETHYST_STAFF, Item::new, new Item.Properties().rarity(Rarity.UNCOMMON));

    public static Item register(ResourceKey<Item> itemKey, Function<Item.Properties, Item> itemFactory, Item.Properties settings) {
        // Create the item instance.
        Item item = itemFactory.apply(settings.setId(itemKey));

        // Register the item.
        Registry.register(BuiltInRegistries.ITEM, itemKey, item);

        return item;
    }
}
