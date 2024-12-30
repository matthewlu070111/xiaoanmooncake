package com.imxiaoanag.xiaoanmooncake.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;

import java.util.List;

public class UsedModelsItem extends Item {
    public UsedModelsItem(Settings settings) {
        super(settings);
    }

    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        tooltip.add(Text.translatable("itemTooltip.xiaoanmooncake.used_mooncake_models"));
    }
}
