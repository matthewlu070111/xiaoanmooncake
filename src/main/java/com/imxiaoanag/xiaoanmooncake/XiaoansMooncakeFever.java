package com.imxiaoanag.xiaoanmooncake;

import com.imxiaoanag.xiaoanmooncake.item.MFItemGroups;
import com.imxiaoanag.xiaoanmooncake.item.MFItems;
import com.imxiaoanag.xiaoanmooncake.item.MFRemainderItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class XiaoansMooncakeFever implements ModInitializer {
	public static final String MOD_ID = "xiaoanmooncake";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Xiaoan's Mooncake Fever Loaded!");

		MFItems.initialize();
		MFItemGroups.initialize();
		MFRemainderItems.initialize();
	}
}