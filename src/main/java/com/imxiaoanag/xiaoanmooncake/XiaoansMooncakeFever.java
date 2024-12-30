package com.imxiaoanag.xiaoanmooncake;

import com.imxiaoanag.xiaoanmooncake.item.MooncakeFCItemGroupRegister;
import com.imxiaoanag.xiaoanmooncake.item.MooncakeFCItemRegister;
import com.imxiaoanag.xiaoanmooncake.item.MooncakeFCItemRemainderNeeded;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class XiaoansMooncakeFever implements ModInitializer {
	public static final String MOD_ID = "xiaoanmooncake";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Xiaoan's Mooncake Fever Loaded!");

		MooncakeFCItemRegister.initialize();
		MooncakeFCItemGroupRegister.initialize();

		MooncakeFCItemRemainderNeeded.initialize();
	}
}