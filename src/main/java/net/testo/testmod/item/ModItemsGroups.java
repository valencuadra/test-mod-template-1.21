package net.testo.testmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.testo.testmod.TestMod;
import net.testo.testmod.block.ModBlocks;

public class ModItemsGroups {

    public static final ItemGroup SHIT_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TestMod.MOD_ID, "shit_items"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModItems.CACA))
                    .displayName(Text.translatable("itemgroup.testmod.shit_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.CACA);
                        entries.add(ModBlocks.SHIT_BLOCK);
                    })
                    .build());

    public static void registerItemGroups(){

    }
}
