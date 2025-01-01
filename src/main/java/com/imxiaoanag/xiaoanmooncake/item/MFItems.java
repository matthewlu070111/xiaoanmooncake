package com.imxiaoanag.xiaoanmooncake.item;

import com.imxiaoanag.xiaoanfc.util.FCUtilRegister;
import com.imxiaoanag.xiaoanmooncake.XiaoansMooncakeFever;
import com.imxiaoanag.xiaoanmooncake.item.custom.LotusSeedItem;
import com.imxiaoanag.xiaoanmooncake.util.UnbakedItem;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;

public class MFItems {

    // Tools
    public static final Item USED_MOONCAKE_MODELS = regMFUsedItem("used_mooncake_models", "wash");

    // Materials
    public static final Item LOTUS_SEED = regMFItem("lotus_seed", new LotusSeedItem(new Item.Settings().food(MFFoodComponents.LOTUS_SEED)));

    // Unbaked Mooncakes
    public static final Item UNBAKED_LOTUS_SEED_PASTE_MOONCAKE = regMFItem("unbaked_lotus_seed_paste_mooncake", new UnbakedItem(new Item.Settings().food(MFFoodComponents.MOONCAKE_LESS)));
    public static final Item UNBAKED_DOUBLE_YOLK_LOTUS_SEED_PASTE_MOONCAKE = regMFItem("unbaked_double_yolk_lotus_seed_paste_mooncake", new UnbakedItem(new Item.Settings().food(MFFoodComponents.MOONCAKE_NORMAL)));

    // Mooncakes
    public static final Item LOTUS_SEED_PASTE_MOONCAKE = regMFItem("lotus_seed_paste_mooncake", new Item(new Item.Settings()));
    public static final Item DOUBLE_YOLK_LOTUS_SEED_PASTE_MOONCAKE = regMFItem("double_yolk_lotus_seed_paste_mooncake", new Item(new Item.Settings()));

    // Function regItem
    private static Item regMFItem(String name, Item item) {
        return FCUtilRegister.regItem(name, item, XiaoansMooncakeFever.MOD_ID);
    }

    // Function regItem but used
    private static Item regMFUsedItem(String name, String how) {
        return FCUtilRegister.regUsedItem(name, XiaoansMooncakeFever.MOD_ID, how);
    }

    public static void initialize() {
        ItemGroupEvents.modifyEntriesEvent(MFItemGroups.XIAOAN_MOONCAKE).register((itemGroup) -> itemGroup.add(LOTUS_SEED));
        ItemGroupEvents.modifyEntriesEvent(MFItemGroups.XIAOAN_MOONCAKE).register(((itemGroup) -> itemGroup.add(UNBAKED_LOTUS_SEED_PASTE_MOONCAKE)));
        ItemGroupEvents.modifyEntriesEvent(MFItemGroups.XIAOAN_MOONCAKE).register(((itemGroup) -> itemGroup.add(LOTUS_SEED_PASTE_MOONCAKE)));
        ItemGroupEvents.modifyEntriesEvent(MFItemGroups.XIAOAN_MOONCAKE).register(((itemGroup) -> itemGroup.add(UNBAKED_DOUBLE_YOLK_LOTUS_SEED_PASTE_MOONCAKE)));
        ItemGroupEvents.modifyEntriesEvent(MFItemGroups.XIAOAN_MOONCAKE).register(((itemGroup) -> itemGroup.add(DOUBLE_YOLK_LOTUS_SEED_PASTE_MOONCAKE)));
        XiaoansMooncakeFever.LOGGER.info("Items registration succeed!");
    }
}
