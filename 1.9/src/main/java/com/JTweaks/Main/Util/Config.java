package com.JTweaks.Main.Util;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public final class Config {

    private static Configuration forgeConfiguration;

    public static boolean enableTinkersIntegration = true;

    public static void loadConfiguration(File configurationFile) {
        forgeConfiguration = new Configuration(configurationFile);

        forgeConfiguration.load();

        enableTinkersIntegration = forgeConfiguration.get("Integration", "Tinkers", true, "When false, nothing will be integrated with Tinkers /*not yet complete*/").getBoolean();

        forgeConfiguration.save();
    }
}