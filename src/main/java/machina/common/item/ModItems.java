package machina.common.item;

import machina.api.internal.ModItemGroup;
import machina.setup.Registration;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;

public class ModItems {
    public static final RegistryObject<Item> TITANIUM_INGOT = Registration.ITEMS.register("titanium_ingot", () ->
            new Item(new Item.Properties().tab(ModItemGroup.MACHINA)));

    public static final RegistryObject<Item> TITANIUM_CHUNK = Registration.ITEMS.register("titanium_chunk", () ->
            new Item(new Item.Properties().tab(ModItemGroup.MACHINA)));

    public static void register() {}
}
