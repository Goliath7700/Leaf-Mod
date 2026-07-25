package io.github.goliath7700.leafmod.itemGroups;

import io.github.goliath7700.leafmod.LeafMod;
import io.github.goliath7700.leafmod.items.ModItems;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.component.ItemLore;

import java.util.List;

public class ModCreativeModeTabs {
    public static void initialize() {
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, CUSTOM_CREATIVE_TAB_KEY, CUSTOM_CREATIVE_TAB);
    }

    public static final ResourceKey<CreativeModeTab> CUSTOM_CREATIVE_TAB_KEY = ResourceKey.create(
            BuiltInRegistries.CREATIVE_MODE_TAB.key(), Identifier.fromNamespaceAndPath(LeafMod.MOD_ID, "creative_tab")
    );
    public static final CreativeModeTab CUSTOM_CREATIVE_TAB = FabricCreativeModeTab.builder()
            .icon(() -> new ItemStack(ModItems.GLITCHED_MATTER))
            .title(Component.translatable("leafmod.itemGroup.leafmod"))
            .displayItems((params, output) -> {
                output.accept(ModItems.GLITCHED_MATTER);
                output.accept(ModItems.AMETHYST_STAFF);

                // The tab builder also accepts Blocks
                //output.accept(ModBlocks.CONDENSED_DIRT);
                //output.accept(ModBlocks.CONDENSED_OAK_LOG);

                // And custom ItemStacks
                ItemStack stack = new ItemStack(Items.DIAMOND);
                stack.set(DataComponents.ITEM_NAME, Component.literal("Normal Diamond"));
                stack.set(DataComponents.LORE, new ItemLore(List.of(Component.literal("I'm a normal diamond"))));
                output.accept(stack);
            })
            .build();
}
