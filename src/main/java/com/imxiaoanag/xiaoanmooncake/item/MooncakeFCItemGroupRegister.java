package com.imxiaoanag.xiaoanmooncake.item;

import com.imxiaoanag.xiaoanmooncake.XiaoansMooncakeFever;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class MooncakeFCItemGroupRegister {

    public static final RegistryKey<ItemGroup> XIAOAN_MOONCAKE = RegistryKey.of(RegistryKeys.ITEM_GROUP,
            Identifier.of(XiaoansMooncakeFever.MOD_ID, "xiaoan_mooncake"));

    public static void regMooncakesGroup(){
        Registry.register(Registries.ITEM_GROUP, XIAOAN_MOONCAKE, FabricItemGroup.builder().displayName(Text.translatable("itemGroup.xiaoanmooncake.xiaoan_mooncake"))
                .icon(() -> new ItemStack(MooncakeFCItemRegister.LOTUS_SEED)).build());
    }

    public static void initialize() {
        regMooncakesGroup();

        XiaoansMooncakeFever.LOGGER.info("Item group registration succeed!");
    }
}
