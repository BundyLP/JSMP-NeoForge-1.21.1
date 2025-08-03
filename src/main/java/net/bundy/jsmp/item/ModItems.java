package net.bundy.jsmp.item;

import net.bundy.jsmp.JSmp;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(JSmp.MOD_ID);

    public static final DeferredItem<Item> WOOD_SHEET = ITEMS.register("wood_sheet", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> WOODEN_COGWHEEL = ITEMS.register("wooden_cogwheel", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> LEAF_WIRE = ITEMS.register("leaf_wire", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CHROMATSIUM = ITEMS.register("chromatsium", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CHROMATSIUM_WIRE = ITEMS.register("chromatsium_wire", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CHROMATSIUM_COGWHEEL = ITEMS.register("chromatsium_cogwheel", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> WOODEN_TOOL = ITEMS.register("wooden_tool", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CHROMATSIUM_TOOL = ITEMS.register("chromatsium_tool", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
