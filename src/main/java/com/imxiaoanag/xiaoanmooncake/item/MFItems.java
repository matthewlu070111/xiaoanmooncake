package com.imxiaoanag.xiaoanmooncake.item;

import com.imxiaoanag.xiaoanfc.util.FCUtilRegister;
import com.imxiaoanag.xiaoanmooncake.XiaoansMooncakeFever;
import com.imxiaoanag.xiaoanfc.util.UnbakedItem;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;

public class MFItems {

    // Tools
    public static final Item USED_MOONCAKE_MODELS = regMFUsedItem("used_mooncake_models", "wash");


    // Unbaked Mooncakes
    public static final Item UNBAKED_LOTUS_SEED_PASTE_MOONCAKE = regMFItem("unbaked_lotus_seed_paste_mooncake", new UnbakedItem(new Item.Settings()));
    public static final Item UNBAKED_DOUBLE_YOLK_LOTUS_SEED_PASTE_MOONCAKE = regMFItem("unbaked_double_yolk_lotus_seed_paste_mooncake", new UnbakedItem(new Item.Settings()));
    public static final Item UNBAKED_MIXED_NUTS_MOONCAKE = regMFItem("unbaked_mixed_nuts_mooncake", new UnbakedItem(new Item.Settings()));
    public static final Item UNBAKED_RED_BEAN_PASTE_MOONCAKE = regMFItem("unbaked_red_bean_paste_mooncake", new UnbakedItem(new Item.Settings()));

    // Mooncakes
    public static final Item LOTUS_SEED_PASTE_MOONCAKE = regMFItem("lotus_seed_paste_mooncake", new Item(new Item.Settings().food(MFFoodComponents.MOONCAKE_LESS)));
    public static final Item DOUBLE_YOLK_LOTUS_SEED_PASTE_MOONCAKE = regMFItem("double_yolk_lotus_seed_paste_mooncake", new Item(new Item.Settings().food(MFFoodComponents.MOONCAKE_NORMAL)));
    public static final Item MIXED_NUTS_MOONCAKE = regMFItem("mixed_nuts_mooncake", new Item(new Item.Settings().food(MFFoodComponents.MOONCAKE_MORE)));
    public static final Item RED_BEAN_PASTE_MOONCAKE = regMFItem("red_bean_paste_mooncake", new Item(new Item.Settings().food(MFFoodComponents.MOONCAKE_LESS)));

    // Function regItem
    private static Item regMFItem(String name, Item item) {
        return FCUtilRegister.regItem(name, item, XiaoansMooncakeFever.MOD_ID);
    }

    // Function regItem but used
    private static Item regMFUsedItem(String name, String how) {
        return FCUtilRegister.regUsedItem(name, XiaoansMooncakeFever.MOD_ID, how);
    }

    public static void initialize() {
        ItemGroupEvents.modifyEntriesEvent(MFItemGroups.XIAOAN_MOONCAKE).register(((itemGroup) -> itemGroup.add(UNBAKED_LOTUS_SEED_PASTE_MOONCAKE)));
        ItemGroupEvents.modifyEntriesEvent(MFItemGroups.XIAOAN_MOONCAKE).register(((itemGroup) -> itemGroup.add(LOTUS_SEED_PASTE_MOONCAKE)));
        ItemGroupEvents.modifyEntriesEvent(MFItemGroups.XIAOAN_MOONCAKE).register(((itemGroup) -> itemGroup.add(UNBAKED_DOUBLE_YOLK_LOTUS_SEED_PASTE_MOONCAKE)));
        ItemGroupEvents.modifyEntriesEvent(MFItemGroups.XIAOAN_MOONCAKE).register(((itemGroup) -> itemGroup.add(DOUBLE_YOLK_LOTUS_SEED_PASTE_MOONCAKE)));
        ItemGroupEvents.modifyEntriesEvent(MFItemGroups.XIAOAN_MOONCAKE).register(((itemGroup) -> itemGroup.add(UNBAKED_MIXED_NUTS_MOONCAKE)));
        ItemGroupEvents.modifyEntriesEvent(MFItemGroups.XIAOAN_MOONCAKE).register(((itemGroup) -> itemGroup.add(MIXED_NUTS_MOONCAKE)));
        ItemGroupEvents.modifyEntriesEvent(MFItemGroups.XIAOAN_MOONCAKE).register(((itemGroup) -> itemGroup.add(UNBAKED_RED_BEAN_PASTE_MOONCAKE)));
        ItemGroupEvents.modifyEntriesEvent(MFItemGroups.XIAOAN_MOONCAKE).register(((itemGroup) -> itemGroup.add(RED_BEAN_PASTE_MOONCAKE)));

        XiaoansMooncakeFever.LOGGER.info("Items registration succeed!");
    }
}
