package com.NovumScientiaTeam.novumscientia.registry;

import com.EmosewaPixel.pixellib.materialSystem.MaterialRegistry;

public class NSMaterialRegistry {
    //Material Tags
    public static final String DECOMPOSABLE = "decomposable";
    public static final String DISABLE_FACTORY_COMPONENTS = "disable_factory_components";
    public static final String NOT_REACTIVE = "not_reactive";
    public static final String SUPER_ORE = "super_ore";

    static {
        MaterialRegistry.BRICK.addTags(DISABLE_FACTORY_COMPONENTS);
        MaterialRegistry.NETHER_BRICK.addTags(DISABLE_FACTORY_COMPONENTS);
        MaterialRegistry.DIAMOND.addTags(NOT_REACTIVE);
    }
}