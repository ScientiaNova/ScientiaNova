package com.scientianovateam.scientianova.registry

import com.emosewapixel.pixellib.extensions.toResLoc
import com.emosewapixel.pixellib.materialsystem.main.Material
import com.emosewapixel.pixellib.materialsystem.properties.MatProperty
import com.emosewapixel.pixellib.materialsystem.properties.merge

object NSProperties {
    val IS_SEPARABLE = MatProperty("scientianova:is_separable".toResLoc(), ::merge) { true }
    val HAS_FACTORY_COMPONENTS = MatProperty("scientianova:has_factory_components".toResLoc(), ::merge) { true }
    val IS_REACTIVE = MatProperty("scientianova:is_reactive".toResLoc(), ::merge) { true }
    val IS_SUPER_ORE = MatProperty("scientianova:is_super_ore".toResLoc(), ::merge) { false }
}

var Material.isSeparable
    get() = this[NSProperties.IS_SEPARABLE]
    set(value) {
        this[NSProperties.IS_SEPARABLE] = value
    }

var Material.hasFactoryComponents
    get() = this[NSProperties.HAS_FACTORY_COMPONENTS]
    set(value) {
        this[NSProperties.HAS_FACTORY_COMPONENTS] = value
    }

var Material.isReactive
    get() = this[NSProperties.IS_REACTIVE]
    set(value) {
        this[NSProperties.IS_REACTIVE] = value
    }

var Material.isSuperOre
    get() = this[NSProperties.IS_SUPER_ORE]
    set(value) {
        this[NSProperties.IS_SUPER_ORE] = value
    }