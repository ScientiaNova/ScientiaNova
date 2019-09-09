package com.novumscientiateam.novumscientia.api.materialproperties.transfer

import com.emosewapixel.pixellib.materialsystem.materials.Material

import java.util.HashMap

class EnergyTransferProperties private constructor(energyCapacity: Int, FEPerTick: Int) : TransferProperties(energyCapacity, FEPerTick) {
    companion object {
        private val energyTransferMap = HashMap<Material, EnergyTransferProperties>()

        fun setMaterialProperties(mat: Material, itemCapacity: Int, itemsPerTick: Int) {
            energyTransferMap[mat] = EnergyTransferProperties(itemCapacity, itemsPerTick)
        }

        fun getPropertiesForMaterial(mat: Material) = energyTransferMap[mat]
    }
}