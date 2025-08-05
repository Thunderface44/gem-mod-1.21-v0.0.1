package net.thunder.gemmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.thunder.gemmod.GemMod;
import net.thunder.gemmod.block.ModBlocks;

import java.security.PublicKey;

import static net.thunder.gemmod.block.ModBlocks.AMBER_BLOCK;

public class ModItems {
    public static final Item AMBER_CRYSTAL = registerItem("amber_crystal", new Item(new Item.Settings()));
    public static final Item KYANITE_CRYSTAL = registerItem("kyanite_crystal", new Item(new Item.Settings()));
    public static final Item RHODONITE_CRYSTAL = registerItem("rhodonite_crystal", new Item(new Item.Settings()));
    public static final Item RUBY_CRYSTAL = registerItem("ruby_crystal", new Item(new Item.Settings()));
    public static final Item TEKTITE_CRYSTAL = registerItem("tektite_crystal", new Item(new Item.Settings()));




    private static Item registerItem(String name, Item item)  {
        return Registry.register(Registries.ITEM, Identifier.of(GemMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        GemMod.LOGGER.info("items :)");

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(AMBER_CRYSTAL);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(KYANITE_CRYSTAL);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(RHODONITE_CRYSTAL);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(RUBY_CRYSTAL);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(TEKTITE_CRYSTAL);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {
            entries.add(ModBlocks.AMBER_BLOCK);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {
            entries.add(ModBlocks.KYANITE_BLOCK);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {
            entries.add(ModBlocks.RHODONITE_BLOCK);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {
            entries.add(ModBlocks.RUBY_BLOCK);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {
            entries.add(ModBlocks.TEKTITE_BLOCK);
        });
    }
}
