package com.novumscientiateam.novumscientia.api.materialproperties.transfer

import com.emosewapixel.pixellib.materialsystem.materials.Material

import java.util.HashMap

class FluidTransferProperties private constructor(fluidCapacity: Int, mbsPerTick: Int) : TransferProperties(fluidCapacity, mbsPerTick) {
    companion object {
        private val itemTransferMap = HashMap<Material, FluidTransferProperties>()

        fun setMaterialProperties(mat: Material, fluidCapacity: Int, mbsPerTick: Int) {
            itemTransferMap[mat] = FluidTransferProperties(fluidCapacity, mbsPerTick)
        }

        fun getPropertiesForMaterial(mat: Material) = itemTransferMap[mat]
    }
}