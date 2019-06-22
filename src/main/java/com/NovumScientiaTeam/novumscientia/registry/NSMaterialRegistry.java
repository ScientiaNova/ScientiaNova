package com.NovumScientiaTeam.novumscientia.registry;

import com.EmosewaPixel.pixellib.materialSystem.MaterialRegistry;

public class NSMaterialRegistry {
    //Material Tags
    public static String DECOMPOSITION_BY_ELECTROLYZING = "electrolyzable";
    public static String DECOMPOSITION_BY_CENTRIFUGING = "centrifugable";
    public static String DISABLE_FACTORYCOMPONENTS = "disable_factory_components";
    public static String NOT_REACTIVE = "not_reactive";

    static {
        MaterialRegistry.BRICK.addTags(DISABLE_FACTORYCOMPONENTS);
        MaterialRegistry.NETHER_BRICK.addTags(DISABLE_FACTORYCOMPONENTS);
        MaterialRegistry.DIAMOND.addTags(NOT_REACTIVE);
    }
}
