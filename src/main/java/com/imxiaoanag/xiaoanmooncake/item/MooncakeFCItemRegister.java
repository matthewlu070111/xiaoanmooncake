package com.imxiaoanag.xiaoanmooncake.item;

import com.imxiaoanag.xiaoanmooncake.XiaoansMooncakeFever;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class MooncakeFCItemRegister {

    // Tools
    public static final Item USED_MOONCAKE_MODELS = regItem("used_mooncake_models", new UsedModelsItem(new Item.Settings()));

    // Materials
    public static final Item LOTUS_SEED = regItem("lotus_seed", new Item(new Item.Settings()));

    // Unbaked Mooncakes
    public static final Item UNBAKED_LOTUS_SEED_PASTE_MOONCAKE = regItem("unbaked_lotus_seed_paste_mooncake", new UnbakedItem(new Item.Settings()));

    // Mooncakes
    public static final Item LOTUS_SEED_PASTE_MOONCAKE = regItem("lotus_seed_paste_mooncake", new Item(new Item.Settings()));

    public static Item regItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(XiaoansMooncakeFever.MOD_ID, name), item);
    }

    public static void initialize() {
        ItemGroupEvents.modifyEntriesEvent(MooncakeFCItemGroupRegister.XIAOAN_MOONCAKE).register(((itemGroup) -> itemGroup.add(UNBAKED_LOTUS_SEED_PASTE_MOONCAKE)));
        ItemGroupEvents.modifyEntriesEvent(MooncakeFCItemGroupRegister.XIAOAN_MOONCAKE).register(((itemGroup) -> itemGroup.add(LOTUS_SEED_PASTE_MOONCAKE)));
        ItemGroupEvents.modifyEntriesEvent(MooncakeFCItemGroupRegister.XIAOAN_MOONCAKE).register((itemGroup) -> itemGroup.add(LOTUS_SEED));
        XiaoansMooncakeFever.LOGGER.info("Items registration succeed!");
    }
}
