package com.imxiaoanag.xiaoanmooncake.item;

import com.imxiaoanag.xiaoanmooncake.XiaoansMooncakeFever;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class MooncakeFCItemRegister {

    public static Item regItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(XiaoansMooncakeFever.MOD_ID, name), item);
    }

    public static void initialize() {
        XiaoansMooncakeFever.LOGGER.info("Items registration succeed!");
    }
}
