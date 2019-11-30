package com.scientianovateam.scientianova.registry

import com.emosewapixel.pixellib.materialsystem.addition.BaseElements
import com.emosewapixel.pixellib.materialsystem.addition.BaseMaterials
import com.emosewapixel.pixellib.materialsystem.addition.BaseTextureTypes
import com.emosewapixel.pixellib.materialsystem.annotations.MaterialRegistry
import com.emosewapixel.pixellib.materialsystem.builders.*
import com.emosewapixel.pixellib.materialsystem.main.Material
import com.emosewapixel.pixellib.materialsystem.properties.TransitionProperties

@MaterialRegistry
object NSBaseMaterials {
    //Element Materials
    @JvmField
    val HYDROGEN: Material
    @JvmField
    var HYDROGEN_GAS: Material? = null
    @JvmField
    val DEUTERIUM: Material
    @JvmField
    var DEUTERIUM_GAS: Material? = null
    @JvmField
    val TRITIUM: Material
    @JvmField
    var TRITIUM_GAS: Material? = null
    @JvmField
    val HELIUM: Material
    @JvmField
    val HELIUM_3: Material
    @JvmField
    val LITHIUM: Material
    //@JvmField
    //val BERYLLIUM: Material
    @JvmField
    val BORON: Material
    @JvmField
    val CARBON: Material
    @JvmField
    val NITROGEN: Material
    @JvmField
    var NITROGEN_GAS: Material? = null
    @JvmField
    val OXYGEN: Material
    @JvmField
    var OXYGEN_GAS: Material? = null
    @JvmField
    val FLUORINE: Material
    @JvmField
    var FLUORINE_GAS: Material? = null
    @JvmField
    val NEON: Material
    @JvmField
    val SODIUM: Material
    @JvmField
    val MAGNESIUM: Material
    @JvmField
    val ALUMINIUM: Material
    @JvmField
    val SILICON: Material
    @JvmField
    val PHOSPHORUS: Material
    @JvmField
    val SULFUR: Material
    //@JvmField
    //val CHLORINE: Material
    //@JvmField
    //val CHLORINE_GAS: Material
    //@JvmField
    //val ARGON: Material
    //@JvmField
    //val POTASSIUM: Material
    //@JvmField
    //val CALCIUM: Material
    //@JvmField
    //val SCANDIUM: Material
    //@JvmField
    //val TITANIUM: Material
    //@JvmField
    //val VANADIUM: Material
    //@JvmField
    //val CHROMIUM: Material
    //@JvmField
    //val MANGANESE: Material
    //@JvmField
    //val COBALT: Material
    //@JvmField
    //val NICKEL: Material
    @JvmField
    val COPPER: Material
    //@JvmField
    //val ZINC: Material
    //@JvmField
    //val GALLIUM: Material
    //@JvmField
    //val GERMANIUM: Material
    //@JvmField
    //val ARSENIC: Material
    //@JvmField
    //val BROMINE: Material
    //@JvmField
    //val BROMINE_GAS: Material
    //@JvmField
    //val KRYPTON: Material
    //@JvmField

    //Compound Materials
    @JvmField
    val SULFUR_DIOXIDE: Material
    @JvmField
    val SILICON_MONOXIDE: Material

    //Group Materials
    @JvmField
    val HYDROXIDE: Material
    @JvmField
    val SULFATE: Material
    @JvmField
    val PHOSPHATE: Material
    @JvmField
    val METASILICATE: Material

    //Ore Materials
    @JvmField
    val MAGNETITE: Material
    @JvmField
    val HEMATITE: Material
    @JvmField
    val PYRITE: Material
    @JvmField
    val CHALCOPYRITE: Material
    @JvmField
    val CHALCOCITE: Material
    @JvmField
    val CUPRITE: Material
    //@JvmField
    //val TETRAHEDRITE: Material
    //@JvmField
    //val ROCK_SALT: Material
    //@JvmField
    //val SYLVITE: Material
    @JvmField
    val KAOLINITE: Material

    //Alloy Materials


    init {
        HYDROGEN = material("hydrogen") {
            transitionProperties = TransitionProperties(2) { HYDROGEN_GAS!! }
            element = BaseElements.HYDROGEN
        }

        HYDROGEN_GAS = fluidMaterial("hydrogen_gas") {
            isGas = true
            color = 0x31219e
            composition = listOf(HYDROGEN * 2)
        }
        DEUTERIUM = material("deuterium") {
            transitionProperties = TransitionProperties(2) { DEUTERIUM_GAS!! }
            element = BaseElements.DEUTERIUM
        }
        DEUTERIUM_GAS = fluidMaterial("deuterium_gas") {
            isGas = true
            color = 0xfffdbf
            composition = listOf(DEUTERIUM * 2)
        }
        TRITIUM = material("tritium") {
            transitionProperties = TransitionProperties(2) { TRITIUM_GAS!! }
            element = BaseElements.DEUTERIUM
        }
        TRITIUM_GAS = fluidMaterial("tritium_gas") {
            isGas = true
            color = 0xfffc9e
            composition = listOf(TRITIUM * 2)
        }
        HELIUM = fluidMaterial("helium") {
            isGas = true
            color = 0xeebe21
            element = BaseElements.HELIUM
        }
        HELIUM_3 = fluidMaterial("helium_3") {
            isGas = true
            color = 0xf60d0b
            element = BaseElements.HELIUM_3
        }
        LITHIUM = ingotMaterial("lithium") {
            color = 0xa9afac
            element = BaseElements.LITHIUM
            fluidTemperature = 453
            boilingTemperature = 1603
        }

        BORON = ingotMaterial("boron") {
            color = 0x727272
            textureType = BaseTextureTypes.SHINY
            element = BaseElements.BORON
            fluidTemperature = 2349
            boilingTemperature = 4200
        }
        CARBON = ingotMaterial("carbon") {
            color = 0x474747
            element = BaseElements.CARBON
            fluidTemperature = 3915
            boilingTemperature = 3915
        }
        NITROGEN = material("nitrogen") {
            transitionProperties = TransitionProperties(2) { NITROGEN_GAS!! }
            element = BaseElements.NITROGEN
        }
        NITROGEN_GAS = fluidMaterial("nitrogen_gas") {
            isGas = true
            color = 0x8f8fff
            element = BaseElements.NITROGEN
        }
        OXYGEN = material("oxygen") {
            transitionProperties = TransitionProperties(2) { OXYGEN_GAS!! }
            element = BaseElements.OXYGEN
        }
        OXYGEN_GAS = fluidMaterial("oxygen_gas") {
            isGas = true
            color = 0x56badd
            composition = listOf(OXYGEN * 2)
        }
        FLUORINE = material("fluorine") {
            transitionProperties = TransitionProperties(2) { FLUORINE_GAS!! }
            element = BaseElements.FLUORINE
        }
        FLUORINE_GAS = fluidMaterial("fluorine_gas") {
            isGas = true
            color = 0xdee67f
            element = BaseElements.FLUORINE
        }
        NEON = fluidMaterial("neon") {
            isGas = true
            color = 0xb3e3f5
            element = BaseElements.NEON
        }
        SODIUM = ingotMaterial("sodium") {
            color = 0x525252
            textureType = BaseTextureTypes.SHINY
            element = BaseElements.SODIUM
            fluidTemperature = 371
            boilingTemperature = 1156
        }
        MAGNESIUM = ingotMaterial("magnesium") {
            color = 0x8a8a8a
            textureType = BaseTextureTypes.SHINY
            element = BaseElements.MAGNESIUM
            fluidTemperature = 923
            boilingTemperature = 1363
        }
        ALUMINIUM = ingotMaterial("aluminium", "aluminum") {
            color = 0x96a4b0
            element = BaseElements.ALUMINUM
            fluidTemperature = 933
            boilingTemperature = 2743
        }
        SILICON = ingotMaterial("silicon") {
            color = 0x121315
            element = BaseElements.SILICON
            fluidTemperature = 1687
            boilingTemperature = 3538
        }
        PHOSPHORUS = dustMaterial("phosphorus") {
            color = 0xf50b0b
            textureType = BaseTextureTypes.FINE
            element = BaseElements.PHOSPHORUS
        }
        SULFUR = dustMaterial("sulfur") {
            color = 0xfff70c
            textureType = BaseTextureTypes.FINE
            element = BaseElements.SULFUR
        }

        COPPER = ingotMaterial("copper") {
            color = 0xca7966
            textureType = BaseTextureTypes.SHINY
            element = BaseElements.COPPER
            fluidTemperature = 1358
            boilingTemperature = 2835
        }


        SULFUR_DIOXIDE = fluidMaterial("sulfur_dioxide") {
            color = 0xf8d34d
            isGas = true
            isSeparable = true
            composition = listOf(SULFUR * 1, OXYGEN_GAS!! * 1)
        }
        SILICON_MONOXIDE = dustMaterial("silicon_monoxide") {
            color = 0x2b2b2a
            textureType = BaseTextureTypes.FINE
            isSeparable = true
            composition = listOf(SILICON * 1, OXYGEN * 1)
        }


        HYDROXIDE = groupMaterial("hydroxide") {
            composition = listOf(OXYGEN * 1, HYDROGEN * 1)
        }
        SULFATE = groupMaterial("sulfate") {
            composition = listOf(SULFUR_DIOXIDE * 1, OXYGEN_GAS!! * 1)
        }
        PHOSPHATE = groupMaterial("phosphate") {
            composition = listOf(PHOSPHORUS * 1, OXYGEN_GAS!! * 2)
        }
        METASILICATE = groupMaterial("metasilicate") {
            composition = listOf(SILICON_MONOXIDE * 1, OXYGEN_GAS!! * 1)
        }


        MAGNETITE = dustMaterial("magnetite") {
            hasOre = true
            color = 0x1f1e1c
            textureType = BaseTextureTypes.FINE
            refinedMaterial = BaseMaterials.IRON
            composition = listOf(BaseMaterials.IRON * 3, OXYGEN_GAS!! * 2)
        }
        HEMATITE = dustMaterial("hematite") {
            hasOre = true
            color = 0x444138
            textureType = BaseTextureTypes.FINE
            refinedMaterial = BaseMaterials.IRON
            composition = listOf(BaseMaterials.IRON * 2, OXYGEN * 3)
        }
        PYRITE = dustMaterial("pyrite") {
            hasOre = true
            color = 0xc0a368
            textureType = BaseTextureTypes.FINE
            refinedMaterial = BaseMaterials.IRON
            composition = listOf(BaseMaterials.IRON * 1, SULFUR * 2)
        }
        CHALCOPYRITE = dustMaterial("chalcopyrite") {
            hasOre = true
            color = 0x9d8851
            textureType = BaseTextureTypes.FINE
            refinedMaterial = COPPER
            composition = listOf(COPPER * 1, BaseMaterials.IRON * 1, SULFUR * 1)
        }
        CHALCOCITE = dustMaterial("chalcocite") {
            hasOre = true
            color = 0xa1ba81
            textureType = BaseTextureTypes.FINE
            refinedMaterial = COPPER
            composition = listOf(COPPER * 2, SULFUR * 1)
        }
        CUPRITE = dustMaterial("cuprite") {
            hasOre = true
            color = 0x458a77
            textureType = BaseTextureTypes.FINE
            refinedMaterial = COPPER
            composition = listOf(COPPER * 2, OXYGEN * 1)
        }


        KAOLINITE = dustMaterial("kaolinite") {
            color = 0xe7c9c0
            isSeparable = true
            textureType = BaseTextureTypes.FINE
            composition = listOf(ALUMINIUM * 2, SILICON * 2, OXYGEN * 5, HYDROXIDE * 4)
        }


        BaseMaterials.BRICK.hasFactoryComponents = false
        BaseMaterials.NETHER_BRICK.hasFactoryComponents = false
        BaseMaterials.DIAMOND.isReactive = false
        BaseMaterials.WATER.composition = listOf(HYDROGEN_GAS!! * 1, OXYGEN * 1)
        BaseMaterials.QUARTZ.composition = listOf(SILICON * 1, OXYGEN_GAS!! * 1)
    }
}