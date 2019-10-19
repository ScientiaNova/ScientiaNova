package com.scientianovateam.scientianova.registry

import com.emosewapixel.pixellib.materialsystem.addition.*
import com.emosewapixel.pixellib.materialsystem.addition.BaseMaterials.HAS_ORE
import com.emosewapixel.pixellib.materialsystem.addition.BaseMaterials.IS_GAS
import com.emosewapixel.pixellib.materialsystem.elements.BaseElements
import com.emosewapixel.pixellib.materialsystem.materials.IngotMaterial
import com.emosewapixel.pixellib.materialsystem.materials.Material

@MaterialRegistry
object NSBaseMaterials {
    //Material Tags
    const val DECOMPOSABLE = "decomposable"
    const val DISABLE_FACTORY_COMPONENTS = "disable_factory_components"
    const val NOT_REACTIVE = "not_reactive"
    const val SUPER_ORE = "super_ore"

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
        HYDROGEN = transitionMaterial("hydrogen", { HYDROGEN_GAS!! }, 2) {
            element = BaseElements.HYDROGEN
        }

        HYDROGEN_GAS = fluidMaterial("hydrogen_gas", BaseMaterials.FLUID_TT, 0x31219e) {
            materialTags += IS_GAS
            composition = listOf(HYDROGEN * 2)
        }
        DEUTERIUM = transitionMaterial("deuterium", { DEUTERIUM_GAS!! }, 2) {
            element = BaseElements.DEUTERIUM
        }
        DEUTERIUM_GAS = fluidMaterial("deuterium_gas", BaseMaterials.FLUID_TT, 0xfffdbf) {
            materialTags += IS_GAS
            composition = listOf(DEUTERIUM * 2)
        }
        TRITIUM = transitionMaterial("tritium", { TRITIUM_GAS!! }, 2) {
            element = BaseElements.DEUTERIUM
        }
        TRITIUM_GAS = fluidMaterial("tritium_gas", BaseMaterials.FLUID_TT, 0xfffc9e) {
            materialTags += IS_GAS
            composition = listOf(TRITIUM * 2)
        }
        HELIUM = fluidMaterial("helium", BaseMaterials.FLUID_TT, 0xeebe21) {
            materialTags += IS_GAS
            element = BaseElements.HELIUM
        }
        HELIUM_3 = fluidMaterial("helium_3", BaseMaterials.FLUID_TT, 0xf60d0b) {
            materialTags += IS_GAS
            element = BaseElements.HELIUM_3
        }
        LITHIUM = ingotMaterial("lithium", BaseMaterials.REGULAR, 0xa9afac, 1) {
            element = BaseElements.LITHIUM
            meltingTemperature = 453
            boilingTemperature = 1603
        }

        BORON = ingotMaterial("boron", BaseMaterials.SHINY, 0x727272, 1) {
            element = BaseElements.BORON
            meltingTemperature = 2349
            boilingTemperature = 4200
        }
        CARBON = ingotMaterial("carbon", BaseMaterials.REGULAR, 0x474747, 1) {
            element = BaseElements.CARBON
            meltingTemperature = 3915
            boilingTemperature = 3915
        }
        NITROGEN = transitionMaterial("nitrogen", { NITROGEN_GAS!! }, 2) {
            element = BaseElements.NITROGEN
        }
        NITROGEN_GAS = fluidMaterial("nitrogen_gas", BaseMaterials.FLUID_TT, 0x8f8fff) {
            materialTags += IS_GAS
            element = BaseElements.NITROGEN
        }
        OXYGEN = transitionMaterial("oxygen", { OXYGEN_GAS!! }, 2) {
            element = BaseElements.OXYGEN
        }
        OXYGEN_GAS = fluidMaterial("oxygen_gas", BaseMaterials.FLUID_TT, 0x56badd) {
            materialTags += IS_GAS
            composition = listOf(OXYGEN * 2)
        }
        FLUORINE = transitionMaterial("fluorine", { FLUORINE_GAS!! }, 2) {
            element = BaseElements.FLUORINE
        }
        FLUORINE_GAS = fluidMaterial("fluorine_gas", BaseMaterials.FLUID_TT, 0xdee67f) {
            materialTags += IS_GAS
            element = BaseElements.FLUORINE
        }
        NEON = fluidMaterial("neon", BaseMaterials.FLUID_TT, 0xb3e3f5) {
            materialTags += IS_GAS
            element = BaseElements.NEON
        }
        SODIUM = ingotMaterial("sodium", BaseMaterials.SHINY, 0x525252, 1) {
            element = BaseElements.SODIUM
            meltingTemperature = 371
            boilingTemperature = 1156
        }
        MAGNESIUM = ingotMaterial("magnesium", BaseMaterials.SHINY, 0x8a8a8a, 1) {
            element = BaseElements.MAGNESIUM
            meltingTemperature = 923
            boilingTemperature = 1363
        }
        ALUMINIUM = ingotMaterial("aluminium", BaseMaterials.REGULAR, 0x96a4b0, 1) {
            secondName = "aluminum"
            element = BaseElements.ALUMINUM
            meltingTemperature = 933
            boilingTemperature = 2743
        }
        SILICON = ingotMaterial("silicon", BaseMaterials.REGULAR, 0x121315, 1) {
            element = BaseElements.SILICON
            meltingTemperature = 1687
            boilingTemperature = 3538
        }
        PHOSPHORUS = dustMaterial("phosphorus", BaseMaterials.FINE, 0xf50b0b, 1) {
            element = BaseElements.PHOSPHORUS
        }
        SULFUR = dustMaterial("sulfur", BaseMaterials.FINE, 0xfff70c, 1) {
            element = BaseElements.SULFUR
        }

        COPPER = ingotMaterial("copper", BaseMaterials.SHINY, 0xca7966, 1) {
            element = BaseElements.COPPER
            meltingTemperature = 1358
            boilingTemperature = 2835
        }


        SULFUR_DIOXIDE = fluidMaterial("sulfur_dioxide", BaseMaterials.FLUID_TT, 0xf8d34d) {
            materialTags += listOf(IS_GAS, DECOMPOSABLE)
            composition = listOf(SULFUR * 1, OXYGEN_GAS!! * 1)
        }
        SILICON_MONOXIDE = dustMaterial("silicon_monoxide", BaseMaterials.FINE, 0x2b2b2a, 1) {
            materialTags += DECOMPOSABLE
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


        MAGNETITE = dustMaterial("magnetite", BaseMaterials.FINE, 0x1f1e1c, 1) {
            materialTags += HAS_ORE
            refinedMaterial = BaseMaterials.IRON as IngotMaterial
            composition = listOf(BaseMaterials.IRON * 3, OXYGEN_GAS!! * 2)
        }
        HEMATITE = dustMaterial("hematite", BaseMaterials.FINE, 0x444138, 1) {
            materialTags += HAS_ORE
            refinedMaterial = BaseMaterials.IRON as IngotMaterial
            composition = listOf(BaseMaterials.IRON * 2, OXYGEN * 3)
        }
        PYRITE = dustMaterial("pyrite", BaseMaterials.FINE, 0xc0a368, 1) {
            materialTags += HAS_ORE
            refinedMaterial = BaseMaterials.IRON as IngotMaterial
            composition = listOf(BaseMaterials.IRON * 1, SULFUR * 2)
        }
        CHALCOPYRITE = dustMaterial("chalcopyrite", BaseMaterials.FINE, 0x9d8851, 1) {
            materialTags += HAS_ORE
            refinedMaterial = COPPER as IngotMaterial
            composition = listOf(COPPER * 1, BaseMaterials.IRON * 1, SULFUR * 1)
        }
        CHALCOCITE = dustMaterial("chalcocite", BaseMaterials.FINE, 0xa1ba81, 1) {
            materialTags += HAS_ORE
            refinedMaterial = COPPER as IngotMaterial
            composition = listOf(COPPER * 2, SULFUR * 1)
        }
        CUPRITE = dustMaterial("cuprite", BaseMaterials.FINE, 0x458a77, 1) {
            materialTags += HAS_ORE
            refinedMaterial = COPPER as IngotMaterial
            composition = listOf(COPPER * 2, OXYGEN * 1)
        }


        KAOLINITE = dustMaterial("kaolinite", BaseMaterials.FINE, 0xe7c9c0, 1) {
            composition = listOf(ALUMINIUM * 2, SILICON * 2, OXYGEN * 5, HYDROXIDE * 4)
            materialTags += DECOMPOSABLE
        }


        BaseMaterials.BRICK.materialTags += DISABLE_FACTORY_COMPONENTS
        BaseMaterials.NETHER_BRICK.materialTags += DISABLE_FACTORY_COMPONENTS
        BaseMaterials.DIAMOND.materialTags += NOT_REACTIVE
        BaseMaterials.WATER.composition = listOf(HYDROGEN_GAS!! * 1, OXYGEN * 1)
        BaseMaterials.QUARTZ.composition = listOf(SILICON * 1, OXYGEN_GAS!! * 1)
    }
}