package com.novumscientiateam.novumscientia.api.materialproperties

import com.emosewapixel.pixellib.materialsystem.materials.Material

var Material.firstByproduct: Material
    get() = extraProperties["byproduct"] as? Material ?: this
    set(value) {
        extraProperties["byproduct"] = value
    }

var Material.secondByproduct: Material
    get() = extraProperties["secondByproduct"] as? Material ?: this
    set(value) {
        extraProperties["secondByproduct"] = value
    }

var Material.thirdByproduct: Material
    get() = extraProperties["thirdByproduct"] as? Material ?: this
    set(value) {
        extraProperties["thirdByproduct"] = value
    }