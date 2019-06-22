package com.NovumScientiaTeam.novumscientia.api.materialProperties;

import com.EmosewaPixel.pixellib.materialSystem.materials.Material;

import java.util.HashMap;
import java.util.Map;

public class FluidTransferProperties extends TransferProperties {
    private static Map<Material, FluidTransferProperties> itemTransferMap = new HashMap<>();

    public static void setMaterialProperties(Material mat, int fluidCapacity, int mbsPerTick) {
        itemTransferMap.put(mat, new FluidTransferProperties(fluidCapacity, mbsPerTick));
    }

    public static FluidTransferProperties getPropertiesForMaterial(Material mat) {
        return itemTransferMap.get(mat);
    }

    private FluidTransferProperties(int fluidCapacity, int mbsPerTick) {
        super(fluidCapacity, mbsPerTick);
    }
}