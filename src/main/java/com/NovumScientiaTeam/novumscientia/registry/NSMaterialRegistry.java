package com.NovumScientiaTeam.novumscientia.registry;

import com.EmosewaPixel.pixellib.materialsystem.element.Elements;
import com.EmosewaPixel.pixellib.materialsystem.materials.*;
import com.EmosewaPixel.pixellib.materialsystem.materials.utility.GroupMaterial;
import com.EmosewaPixel.pixellib.materialsystem.materials.utility.TransitionMaterial;

import static com.EmosewaPixel.pixellib.materialsystem.MaterialRegistry.*;

public class NSMaterialRegistry {
    //Material Tags
    public static final String DECOMPOSABLE = "decomposable";
    public static final String DISABLE_FACTORY_COMPONENTS = "disable_factory_components";
    public static final String NOT_REACTIVE = "not_reactive";
    public static final String SUPER_ORE = "super_ore";
    public static final String IS_ACID = "is_acid";

    //Element Materials
    public static Material HYDROGEN, HYDROGEN_GAS, DEUTERIUM, DEUTERIUM_GAS, TRITIUM, TRITIUM_GAS, HELIUM, HELIUM_3, LITHIUM, BERYLLIUM, BORON, CARBON, NITROGEN, NITROGEN_GAS, OXYGEN, OXYGEN_GAS, FLUORINE, FLUORINE_GAS, NEON, SODIUM, MAGNESIUM, ALUMINIUM, SILICON, PHOSPHORUS, SULFUR, CHLORINE, CHLORINE_GAS, ARGON, POTASSIUM, CALCIUM, SCANDIUM, TITANIUM, VANADIUM, CHROMIUM, MANGANESE, COBALT, NICKEL, COPPER, ZINC, GALLIUM, GERMANIUM, ARSENIC, BROMINE, BROMINE_GAS, KRYPTON;

    //Compound Materials
    public static Material SULFUR_DIOXIDE, SILICON_MONOXIDE;

    //Group Materials
    public static Material HYDROXIDE, SULFATE, PHOSPHATE, METASILICATE;

    //Ore Materials
    public static Material MAGNETITE, HEMATITE, PYRITE, CHALCOPYRITE, CHALCOCITE, CUPRITE, TETRAHEDRITE, ROCK_SALT, SYLVITE, KAOLINITE;


    //Alloy Materials


    static {
        HYDROGEN = new TransitionMaterial("hydrogen", () -> HYDROGEN_GAS, 2).setElement(Elements.HYDROGEN).build();
        HYDROGEN_GAS = new FluidMaterial("hydrogen_has", TRANSPARENT_FLUID, 0x31219e).addTags(IS_GAS).setComposition(new MaterialStack(HYDROGEN, 2)).build();
        DEUTERIUM = new TransitionMaterial("deuterium", () -> DEUTERIUM_GAS, 2).setElement(Elements.DEUTERIUM).build();
        DEUTERIUM_GAS = new FluidMaterial("deuterium_gas", TRANSPARENT_FLUID, 0xfffdbf).addTags(IS_GAS).setComposition(new MaterialStack(DEUTERIUM, 2)).build();
        TRITIUM = new TransitionMaterial("tritium", () -> TRITIUM_GAS, 2).setElement(Elements.DEUTERIUM).build();
        TRITIUM_GAS = new FluidMaterial("tritium_gas", TRANSPARENT_FLUID, 0xfffc9e).addTags(IS_GAS).setComposition(new MaterialStack(TRITIUM, 2)).build();
        HELIUM = new FluidMaterial("helium", TRANSPARENT_FLUID, 0xeebe21).addTags(IS_GAS).setElement(Elements.HELIUM).build();
        HELIUM_3 = new FluidMaterial("helium_3", TRANSPARENT_FLUID, 0xf60d0b).addTags(IS_GAS).setElement(Elements.HELIUM_3).build();
        LITHIUM = new IngotMaterial("lithium", REGULAR, 0xa9afac, 1).setElement(Elements.LITHIUM).setMeltingTemperature(453).setBoilingTemperature(1603).build();
//        BERYLLIUM = new
        BORON = new IngotMaterial("boron", SHINY, 0x727272, 1).setElement(Elements.BORON).setMeltingTemperature(2349).setBoilingTemperature(4200).build();
        CARBON = new IngotMaterial("carbon", REGULAR, 0x474747 , 1).setElement(Elements.CARBON).setMeltingTemperature(3915).setBoilingTemperature(3915).build();
        NITROGEN = new TransitionMaterial("nitrogen", () -> NITROGEN_GAS, 2).setElement(Elements.NITROGEN).build();
        NITROGEN_GAS = new FluidMaterial("nitrogen_gas", TRANSPARENT_FLUID, 0x8f8fff).addTags(IS_GAS).setElement(Elements.NITROGEN).build();
        OXYGEN = new TransitionMaterial("oxygen", () -> OXYGEN_GAS, 2).setElement(Elements.OXYGEN).build();
        OXYGEN_GAS = new FluidMaterial("oxygen_gas", TRANSPARENT_FLUID, 0x56badd).addTags(IS_GAS).setComposition(new MaterialStack(OXYGEN, 2)).build();
        FLUORINE = new TransitionMaterial("fluorine", () -> FLUORINE_GAS, 2).setElement(Elements.FLUORINE).build();
        FLUORINE_GAS = new FluidMaterial("fluorine_gas", OPAQUE_FLUID, 0xdee67f).addTags(IS_GAS).setElement(Elements.FLUORINE).build();
        NEON = new FluidMaterial("neon", TRANSPARENT_FLUID, 0xb3e3f5).addTags(IS_GAS).setElement(Elements.NEON).build();
        SODIUM = new IngotMaterial("sodium", SHINY, 0x525252, 1).setElement(Elements.SODIUM).setMeltingTemperature(371).setBoilingTemperature(1156).build();
        MAGNESIUM = new IngotMaterial("magnesium", SHINY, 0x8a8a8a,1).setElement(Elements.MAGNESIUM).setMeltingTemperature(923).setBoilingTemperature(1363).build();
        ALUMINIUM = new IngotMaterial("aluminium", REGULAR, 0x96a4b0, 1).setSecondName("aluminum").setElement(Elements.ALUMINUM).setMeltingTemperature(933).setBoilingTemperature(2743).build();
        SILICON = new IngotMaterial("silicon", REGULAR, 0x121315, 1).setElement(Elements.SILICON).setMeltingTemperature(1687).setBoilingTemperature(3538).build();
        PHOSPHORUS = new DustMaterial("phosphorus", FINE, 0xf50b0b, 1).setElement(Elements.PHOSPHORUS).build();
        SULFUR = new DustMaterial("sulfur", FINE, 0xfff70c, 1).setElement(Elements.SULFUR).build();

        COPPER = new IngotMaterial("copper", SHINY, 0xca7966, 1).setElement(Elements.COPPER).setMeltingTemperature(1358).setBoilingTemperature(2835).build();

        SULFUR_DIOXIDE = new FluidMaterial("sulfur_dioxide", TRANSPARENT_FLUID, 0xf8d34d).addTags(IS_GAS, DECOMPOSABLE).setComposition(new MaterialStack(SULFUR), new MaterialStack(OXYGEN_GAS)).build();
        SILICON_MONOXIDE = new DustMaterial("silicon_monoxide", FINE, 0x2b2b2a, 1).addTags(DECOMPOSABLE).setComposition(new MaterialStack(SILICON), new MaterialStack(OXYGEN)).build();


        HYDROXIDE = new GroupMaterial("hydroxide").setComposition(new MaterialStack(HYDROGEN), new MaterialStack(OXYGEN)).build();
        SULFATE = new GroupMaterial("sulfate").setComposition(new MaterialStack(SULFUR_DIOXIDE), new MaterialStack(OXYGEN_GAS)).build();
        PHOSPHATE = new GroupMaterial("phosphate").setComposition(new MaterialStack(PHOSPHORUS), new MaterialStack(OXYGEN_GAS, 2)).build();
        METASILICATE = new GroupMaterial("metasilicate").setComposition(new MaterialStack(SILICON_MONOXIDE), new MaterialStack(OXYGEN_GAS)).build();


        MAGNETITE = new DustMaterial("magnetite", FINE, 0x1f1e1c, 1).addTags(HAS_ORE).setRefinedMaterial((IngotMaterial) IRON).setComposition(new MaterialStack(IRON, 3), new MaterialStack(OXYGEN_GAS, 2)).build();
        HEMATITE = new DustMaterial("hematite", FINE, 0x444138, 1).addTags(HAS_ORE).setRefinedMaterial((IngotMaterial) IRON).setComposition(new MaterialStack(IRON, 2), new MaterialStack(OXYGEN, 3)).build();
        PYRITE = new DustMaterial("pyrite", FINE, 0xc0a368, 1).addTags(HAS_ORE).setRefinedMaterial((IngotMaterial) IRON).setComposition(new MaterialStack(IRON), new MaterialStack(SULFUR, 2)).build();
        CHALCOPYRITE = new DustMaterial("chalcopyrite", FINE, 0x9d8851, 1).addTags(HAS_ORE).setRefinedMaterial((IngotMaterial) COPPER).setComposition(new MaterialStack(COPPER), new MaterialStack(IRON), new MaterialStack(SULFUR)).build();
        CHALCOCITE = new DustMaterial("chalcocite", FINE, 0xa1ba81, 1).addTags(HAS_ORE).setRefinedMaterial((IngotMaterial) COPPER).setComposition(new MaterialStack(COPPER, 2), new MaterialStack(SULFUR)).build();
        CUPRITE = new DustMaterial("cuprite", FINE, 0x458a77, 1).addTags(HAS_ORE).setRefinedMaterial((IngotMaterial) COPPER).setComposition(new MaterialStack(COPPER, 2), new MaterialStack(OXYGEN)).build();

        KAOLINITE = new DustMaterial("kaolinite", FINE, 0xe7c9c0, 1).setComposition(new MaterialStack(ALUMINIUM, 2), new MaterialStack(SILICON, 2), new MaterialStack(OXYGEN, 5), new MaterialStack(HYDROXIDE, 4)).addTags(DECOMPOSABLE).build();

        BRICK.addTags(DISABLE_FACTORY_COMPONENTS);
        NETHER_BRICK.addTags(DISABLE_FACTORY_COMPONENTS);
        DIAMOND.addTags(NOT_REACTIVE);
        WATER.setComposition(new MaterialStack(HYDROGEN_GAS), new MaterialStack(OXYGEN));
        QUARTZ.setComposition(new MaterialStack(SILICON), new MaterialStack(OXYGEN_GAS));
    }
}