package com.novumscientiateam.novumscientia.api.materialproperties

import com.emosewapixel.pixellib.PixelLib
import net.minecraft.block.material.Material

object MaterialByproducts {
    private val firstByProducts = hashMapOf<Material, Material>()
    private val secondByProducts = hashMapOf<Material, Material>()
    private val thirdByProducts = hashMapOf<Material, Material>()

    fun addByproduct(mat: Material, tier: Int, byproduct: Material) {
        when (tier) {
            1 -> firstByProducts[mat] = byproduct
            2 -> secondByProducts[mat] = byproduct
            3 -> thirdByProducts[mat] = byproduct
            else -> PixelLib.LOGGER.warn("Materials don't have a ${tier}th byproduct")
        }
    }

    fun getMaterialByproduct(mat: Material, tier: Int) = when (tier) {
        1 -> firstByProducts[mat] ?: mat
        2 -> secondByProducts[mat] ?: mat
        3 -> thirdByProducts[mat] ?: mat
        else -> {
            PixelLib.LOGGER.warn("Materials don't have a ${tier}th byproduct")
            mat
        }
    }
}