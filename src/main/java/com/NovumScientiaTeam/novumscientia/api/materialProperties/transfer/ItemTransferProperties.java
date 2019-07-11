package com.NovumScientiaTeam.novumscientia.api.materialProperties.transfer;

import com.EmosewaPixel.pixellib.materialsystem.materials.Material;

import java.util.HashMap;
import java.util.Map;

public class ItemTransferProperties extends TransferProperties {
    private static final Map<Material, ItemTransferProperties> itemTransferMap = new HashMap<>();

    public static void setMaterialProperties(Material mat, int itemCapacity, int itemsPerTick) {
        itemTransferMap.put(mat, new ItemTransferProperties(itemCapacity, itemsPerTick));
    }

    public static ItemTransferProperties getPropertiesForMaterial(Material mat) {
        return itemTransferMap.get(mat);
    }

    private ItemTransferProperties(int itemCapacity, int itemsPerTick) {
        super(itemCapacity, itemsPerTick);
    }
}