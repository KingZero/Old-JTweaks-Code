package com.JTweaks.Main.Util;

import com.JTweaks.Main.*;
import net.minecraft.util.*;
import net.minecraft.util.text.translation.I18n;

import java.util.Locale;
import java.util.logging.Logger;

public class Reference {
    private Reference() {}
    
	public static final String MODID = "JTweaks";
	public static final String VERSION = "0.0.2";
    public static final String ClientProxy = "com.JTweaks.Main.Util.ClientProxy";
    public static final String ServerProxy = "com.JTweaks.Main.Util.CommonProxy";

/*    public static final String RESOURCE = MODID.toLowerCase(Locale.US);

    public static String resource(String res) {
        return String.format("%s:%s", RESOURCE, res);
    }

    public static ResourceLocation getResource(String res) {
        return new ResourceLocation(RESOURCE, res);
    }

    public static String prefix(String name) {
        return String.format("%s.%s", RESOURCE, name.toLowerCase(Locale.US));
    }

    public static String makeLocString(String unclean) {
        return unclean.toLowerCase(Locale.US).replaceAll(" ", "");
    }

    public static String translateRecursive(String key, Object params) {
        return I18n.translateToLocal(I18n.translateToLocalFormatted(key, params));
    } */
}