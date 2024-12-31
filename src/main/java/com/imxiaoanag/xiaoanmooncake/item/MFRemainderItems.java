package com.imxiaoanag.xiaoanmooncake.item;

import com.imxiaoanag.xiaoanfc.item.FCItemGroups;
import com.imxiaoanag.xiaoanfc.util.FCUtilRegister;
import com.imxiaoanag.xiaoanmooncake.XiaoansMooncakeFever;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;

public class MFRemainderItems {

    public static final Item MOONCAKE_MODELS = regMFItem("mooncake_models", new Item(new Item.Settings().recipeRemainder(MFItems.USED_MOONCAKE_MODELS)));

    private static Item regMFItem(String name, Item item) {
        return FCUtilRegister.regItem(name, item, XiaoansMooncakeFever.MOD_ID);
    }

    public static void initialize() {
        ItemGroupEvents.modifyEntriesEvent(FCItemGroups.XIAOANFC_TOOLS).register((itemGroup) -> itemGroup.add(MOONCAKE_MODELS));
        XiaoansMooncakeFever.LOGGER.info("The items need remainder's registration succeed!");
    }
}
