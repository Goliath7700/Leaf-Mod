package io.github.goliath7700.leafmod.client.datagen;

import io.github.goliath7700.leafmod.items.ModItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ItemModelUtils;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.client.renderer.item.ItemModel;
import net.minecraft.client.renderer.item.properties.select.DisplayContext;
import net.minecraft.client.resources.model.cuboid.ItemModelGenerator;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemDisplayContext;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricPackOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockModelGenerators) {

    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {
        itemModelGenerators.generateFlatItem(ModItems.GLITCHED_MATTER, ModelTemplates.FLAT_ITEM);

        ArrayList<ItemDisplayContext> useFlatDisplay = new ArrayList<>();
        useFlatDisplay.add(ItemDisplayContext.GUI);
        useFlatDisplay.add(ItemDisplayContext.GROUND);
        useFlatDisplay.add(ItemDisplayContext.FIXED);
        useFlatDisplay.add(ItemDisplayContext.ON_SHELF);

        ItemModel.Unbaked amethystStaffFlat = ItemModelUtils.plainModel(itemModelGenerators.createFlatItemModel(ModItems.AMETHYST_STAFF, ModelTemplates.FLAT_ITEM));
        ItemModel.Unbaked amethystStaffInHand = ItemModelUtils.plainModel(itemModelGenerators.createFlatItemModel(ModItems.AMETHYST_STAFF, "_in_hand", ModelTemplates.SPEAR_IN_HAND));

        itemModelGenerators.itemModelOutput.accept(
                ModItems.AMETHYST_STAFF,
                ItemModelUtils.select(new DisplayContext(),
                        amethystStaffInHand,
                        ItemModelUtils.when(useFlatDisplay, amethystStaffFlat)
                )
        );
    }
}
