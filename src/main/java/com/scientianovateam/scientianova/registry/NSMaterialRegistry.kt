package com.scientianovateam.scientianova.registry

import com.emosewapixel.pixellib.materialsystem.addition.*
import com.emosewapixel.pixellib.materialsystem.addition.MaterialRegistry.HAS_ORE
import com.emosewapixel.pixellib.materialsystem.addition.MaterialRegistry.IS_GAS
import com.emosewapixel.pixellib.materialsystem.elements.ElementRegistry
import com.emosewapixel.pixellib.materialsystem.materials.IngotMaterial
import com.emosewapixel.pixellib.materialsystem.materials.Material
import com.emosewapixel.pixellib.materialsystem.materials.utility.MaterialStack

@MaterialRegistryClass
object NSMaterialRegistry {
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
            element = ElementRegistry.HYDROGEN
        }

        HYDROGEN_GAS = fluidMaterial("hydrogen_gas", MaterialRegistry.FLUID_TT, 0x31219e) {
            materialTags += IS_GAS
            composition = listOf(MaterialStack(HYDROGEN, 2))
        }
        DEUTERIUM = transitionMaterial("deuterium", { DEUTERIUM_GAS!! }, 2) {
            element = ElementRegistry.DEUTERIUM
        }
        DEUTERIUM_GAS = fluidMaterial("deuterium_gas", MaterialRegistry.FLUID_TT, 0xfffdbf) {
            materialTags += IS_GAS
            composition = listOf(MaterialStack(DEUTERIUM, 2))
        }
        TRITIUM = transitionMaterial("tritium", { TRITIUM_GAS!! }, 2) {
            element = ElementRegistry.DEUTERIUM
        }
        TRITIUM_GAS = fluidMaterial("tritium_gas", MaterialRegistry.FLUID_TT, 0xfffc9e) {
            materialTags += IS_GAS
            composition = listOf(MaterialStack(TRITIUM, 2))
        }
        HELIUM = fluidMaterial("helium", MaterialRegistry.FLUID_TT, 0xeebe21) {
            materialTags += IS_GAS
            element = ElementRegistry.HELIUM
        }
        HELIUM_3 = fluidMaterial("helium_3", MaterialRegistry.FLUID_TT, 0xf60d0b) {
            materialTags += IS_GAS
            element = ElementRegistry.HELIUM_3
        }
        LITHIUM = ingotMaterial("lithium", MaterialRegistry.REGULAR, 0xa9afac, 1) {
            element = ElementRegistry.LITHIUM
            meltingTemperature = 453
            boilingTemperature = 1603
        }

        BORON = ingotMaterial("boron", MaterialRegistry.SHINY, 0x727272, 1) {
            element = ElementRegistry.BORON
            meltingTemperature = 2349
            boilingTemperature = 4200
        }
        CARBON = ingotMaterial("carbon", MaterialRegistry.REGULAR, 0x474747, 1) {
            element = ElementRegistry.CARBON
            meltingTemperature = 3915
            boilingTemperature = 3915
        }
        NITROGEN = transitionMaterial("nitrogen", { NITROGEN_GAS!! }, 2) {
            element = ElementRegistry.NITROGEN
        }
        NITROGEN_GAS = fluidMaterial("nitrogen_gas", MaterialRegistry.FLUID_TT, 0x8f8fff) {
            materialTags += IS_GAS
            element = ElementRegistry.NITROGEN
        }
        OXYGEN = transitionMaterial("oxygen", { OXYGEN_GAS!! }, 2) {
            element = ElementRegistry.OXYGEN
        }
        OXYGEN_GAS = fluidMaterial("oxygen_gas", MaterialRegistry.FLUID_TT, 0x56badd) {
            materialTags += IS_GAS
            composition = listOf(MaterialStack(OXYGEN, 2))
        }
        FLUORINE = transitionMaterial("fluorine", { FLUORINE_GAS!! }, 2) {
            element = ElementRegistry.FLUORINE
        }
        FLUORINE_GAS = fluidMaterial("fluorine_gas", MaterialRegistry.FLUID_TT, 0xdee67f) {
            materialTags += IS_GAS
            element = ElementRegistry.FLUORINE
        }
        NEON = fluidMaterial("neon", MaterialRegistry.FLUID_TT, 0xb3e3f5) {
            materialTags += IS_GAS
            element = ElementRegistry.NEON
        }
        SODIUM = ingotMaterial("sodium", MaterialRegistry.SHINY, 0x525252, 1) {
            element = ElementRegistry.SODIUM
            meltingTemperature = 371
            boilingTemperature = 1156
        }
        MAGNESIUM = ingotMaterial("magnesium", MaterialRegistry.SHINY, 0x8a8a8a, 1) {
            element = ElementRegistry.MAGNESIUM
            meltingTemperature = 923
            boilingTemperature = 1363
        }
        ALUMINIUM = ingotMaterial("aluminium", MaterialRegistry.REGULAR, 0x96a4b0, 1) {
            secondName = "aluminum"
            element = ElementRegistry.ALUMINUM
            meltingTemperature = 933
            boilingTemperature = 2743
        }
        SILICON = ingotMaterial("silicon", MaterialRegistry.REGULAR, 0x121315, 1) {
            element = ElementRegistry.SILICON
            meltingTemperature = 1687
            boilingTemperature = 3538
        }
        PHOSPHORUS = dustMaterial("phosphorus", MaterialRegistry.FINE, 0xf50b0b, 1) {
            element = ElementRegistry.PHOSPHORUS
        }
        SULFUR = dustMaterial("sulfur", MaterialRegistry.FINE, 0xfff70c, 1) {
            element = ElementRegistry.SULFUR
        }

        COPPER = ingotMaterial("copper", MaterialRegistry.SHINY, 0xca7966, 1) {
            element = ElementRegistry.COPPER
            meltingTemperature = 1358
            boilingTemperature = 2835
        }


        SULFUR_DIOXIDE = fluidMaterial("sulfur_dioxide", MaterialRegistry.FLUID_TT, 0xf8d34d) {
            materialTags += listOf(IS_GAS, DECOMPOSABLE)
            composition = listOf(MaterialStack(SULFUR), MaterialStack(OXYGEN_GAS!!))
        }
        SILICON_MONOXIDE = dustMaterial("silicon_monoxide", MaterialRegistry.FINE, 0x2b2b2a, 1) {
            materialTags += DECOMPOSABLE
            composition = listOf(MaterialStack(SILICON), MaterialStack(OXYGEN))
        }


        HYDROXIDE = groupMaterial("hydroxide") {
            composition = listOf(MaterialStack(OXYGEN), MaterialStack(HYDROGEN))
        }
        SULFATE = groupMaterial("sulfate") {
            composition = listOf(MaterialStack(SULFUR_DIOXIDE), MaterialStack(OXYGEN_GAS!!))
        }
        PHOSPHATE = groupMaterial("phosphate") {
            composition = listOf(MaterialStack(PHOSPHORUS), MaterialStack(OXYGEN_GAS!!, 2))
        }
        METASILICATE = groupMaterial("metasilicate") {
            composition = listOf(MaterialStack(SILICON_MONOXIDE), MaterialStack(OXYGEN_GAS!!))
        }


        MAGNETITE = dustMaterial("magnetite", MaterialRegistry.FINE, 0x1f1e1c, 1) {
            materialTags += HAS_ORE
            refinedMaterial = MaterialRegistry.IRON as IngotMaterial
            composition = listOf(MaterialStack(MaterialRegistry.IRON, 3), MaterialStack(OXYGEN_GAS!!, 2))
        }
        HEMATITE = dustMaterial("hematite", MaterialRegistry.FINE, 0x444138, 1) {
            materialTags += HAS_ORE
            refinedMaterial = MaterialRegistry.IRON as IngotMaterial
            composition = listOf(MaterialStack(MaterialRegistry.IRON, 2), MaterialStack(OXYGEN, 3))
        }
        PYRITE = dustMaterial("pyrite", MaterialRegistry.FINE, 0xc0a368, 1) {
            materialTags += HAS_ORE
            refinedMaterial = MaterialRegistry.IRON as IngotMaterial
            composition = listOf(MaterialStack(MaterialRegistry.IRON), MaterialStack(SULFUR, 2))
        }
        CHALCOPYRITE = dustMaterial("chalcopyrite", MaterialRegistry.FINE, 0x9d8851, 1) {
            materialTags += HAS_ORE
            refinedMaterial = COPPER as IngotMaterial
            composition = listOf(MaterialStack(COPPER), MaterialStack(MaterialRegistry.IRON), MaterialStack(SULFUR))
        }
        CHALCOCITE = dustMaterial("chalcocite", MaterialRegistry.FINE, 0xa1ba81, 1) {
            materialTags += HAS_ORE
            refinedMaterial = COPPER as IngotMaterial
            composition = listOf(MaterialStack(COPPER, 2), MaterialStack(SULFUR))
        }
        CUPRITE = dustMaterial("cuprite", MaterialRegistry.FINE, 0x458a77, 1) {
            materialTags += HAS_ORE
            refinedMaterial = COPPER as IngotMaterial
            composition = listOf(MaterialStack(COPPER, 2), MaterialStack(OXYGEN))
        }


        KAOLINITE = dustMaterial("kaolinite", MaterialRegistry.FINE, 0xe7c9c0, 1) {
            composition = listOf(MaterialStack(ALUMINIUM, 2), MaterialStack(SILICON, 2), MaterialStack(OXYGEN, 5), MaterialStack(HYDROXIDE, 4))
            materialTags += DECOMPOSABLE
        }


        MaterialRegistry.BRICK.materialTags += DISABLE_FACTORY_COMPONENTS
        MaterialRegistry.NETHER_BRICK.materialTags += DISABLE_FACTORY_COMPONENTS
        MaterialRegistry.DIAMOND.materialTags += NOT_REACTIVE
        MaterialRegistry.WATER.composition = listOf(MaterialStack(HYDROGEN_GAS!!), MaterialStack(OXYGEN))
        MaterialRegistry.QUARTZ.composition = listOf(MaterialStack(SILICON), MaterialStack(OXYGEN_GAS!!))
    }
}