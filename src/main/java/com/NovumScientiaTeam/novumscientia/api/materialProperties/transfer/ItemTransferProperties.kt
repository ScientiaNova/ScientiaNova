package com.novumscientiateam.novumscientia.api.materialproperties.transfer

import com.emosewapixel.pixellib.materialsystem.materials.Material

import java.util.HashMap

class ItemTransferProperties private constructor(itemCapacity: Int, itemsPerTick: Int) : TransferProperties(itemCapacity, itemsPerTick) {
    companion object {
        private val itemTransferMap = HashMap<Material, ItemTransferProperties>()

        fun setMaterialProperties(mat: Material, itemCapacity: Int, itemsPerTick: Int) {
            itemTransferMap[mat] = ItemTransferProperties(itemCapacity, itemsPerTick)
        }

        fun getPropertiesForMaterial(mat: Material) = itemTransferMap[mat]
    }
}