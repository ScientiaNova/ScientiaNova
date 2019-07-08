package com.NovumScientiaTeam.novumscientia.api.materialProperties.transfer;

import com.EmosewaPixel.pixellib.materialSystem.materials.Material;

import java.util.HashMap;
import java.util.Map;

public class EnergyTransferProperties extends TransferProperties {
    private static final Map<Material, EnergyTransferProperties> energyTransferMap = new HashMap<>();

    public static void setMaterialProperties(Material mat, int itemCapacity, int itemsPerTick) {
        energyTransferMap.put(mat, new EnergyTransferProperties(itemCapacity, itemsPerTick));
    }

    public static EnergyTransferProperties getPropertiesForMaterial(Material mat) {
        return energyTransferMap.get(mat);
    }

    private EnergyTransferProperties(int energyCapacity, int FEPerTick) {
        super(energyCapacity, FEPerTick);
    }
}