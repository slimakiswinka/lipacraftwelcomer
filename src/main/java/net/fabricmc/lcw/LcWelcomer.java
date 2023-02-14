package net.fabricmc.lcw;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LcWelcomer implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("lcwelcomer");

	@Override
	public void onInitialize() {
    ClientPlayConnectionEvents.JOIN.register((handler, sender, client) -> {
        ITextComponent msg = new StringTextComponent("Hello!");
UUID testuuid = Minecraft.getInstance().player.getUniqueID();
Minecraft.getInstance().player.sendMessage(msg,testuuid);
    });
}
	
}
