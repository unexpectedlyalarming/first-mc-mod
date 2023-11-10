package unexpectedlyalarming.firstmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

import net.minecraft.util.Identifier;
import unexpectedlyalarming.firstmod.FirstMod;

public class ModItems {
    public static final Item SUPER_SWORD = registerItem("super_sword", new Item(new FabricItemSettings()));

    // Creative mode tab
    private static void addItemsToCreativeTab(FabricItemGroupEntries entries) {
        entries.add(SUPER_SWORD);

    }
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(FirstMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        FirstMod.LOGGER.info("Registering mod items for" + FirstMod.MOD_ID);


        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(ModItems::addItemsToCreativeTab);

    }
}
