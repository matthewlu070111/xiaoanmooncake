package com.imxiaoanag.xiaoanmooncake.item;

import com.imxiaoanag.xiaoanfc.item.FarmingCoreItemGroupRegister;
import com.imxiaoanag.xiaoanmooncake.XiaoansMooncakeFever;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;

public class MooncakeFCItemRemainderNeeded {

    public static final Item MOONCAKE_MODELS = MooncakeFCItemRegister.regItem("mooncake_models", new Item(new Item.Settings().recipeRemainder(MooncakeFCItemRegister.USED_MOONCAKE_MODELS)));

    public static void initialize() {
        ItemGroupEvents.modifyEntriesEvent(FarmingCoreItemGroupRegister.XIAOANFC_TOOLS).register((itemGroup) -> itemGroup.add(MOONCAKE_MODELS));
        XiaoansMooncakeFever.LOGGER.info("The items need remainder's registration succeed!");
    }
}
