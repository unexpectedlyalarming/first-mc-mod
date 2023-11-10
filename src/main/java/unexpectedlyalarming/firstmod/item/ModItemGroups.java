package unexpectedlyalarming.firstmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import unexpectedlyalarming.firstmod.FirstMod;
import unexpectedlyalarming.firstmod.block.ModBlocks;


public class ModItemGroups {
    public static final ItemGroup MOD_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(FirstMod.MOD_ID, "mod"),
            FabricItemGroup.builder().displayName(Text.translatable("ItemGroup.mod"))
                    .icon(() -> new ItemStack(ModItems.SUPER_SWORD)).entries((displayContext, entries) -> {
                        entries.add(ModItems.SUPER_SWORD);
                        entries.add(ModBlocks.FIONA_BLOCK);
    }).build());

    public static void registerItemGroups() {
        FirstMod.LOGGER.info("Registering mod item groups for " + FirstMod.MOD_ID);



    }
}
