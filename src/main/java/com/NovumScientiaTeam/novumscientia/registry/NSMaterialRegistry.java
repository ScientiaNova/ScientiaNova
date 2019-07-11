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
    public static Material HYDROGEN, HYDROGEN_GAS, DEUTERIUM, DEUTERIUM_GAS, TRITIUM, TRITIUM_GAS, HELIUM, HELIUM_3, LITHIUM, BERYLLIUM, BORON, CARBON, NITROGEN, NITROGEN_GAS, OXYGEN, OXYGEN_GAS, FLUORINE, FLUORINE_GAS, NEON, SODIUDM, MAGNESIUM, ALUMINIUM, SILICON, PHOSPHORUS, SULFUR, CHLORINE, CHLORINE_GAS, ARGON;

    //Compound Materials
    public static Material SULFUR_DIOXIDE;

    //Group Materials
    public static Material HYDROXIDE, SULFATE;

    //Ore Materials
    public static Material MAGNETITE, HEMATITE, PYRITE, CHALCOPYRITE, CHALCOCITE, TETRAHEDRITE, CUPRITE, ROCK_SALT, SYLVITE, KAOLINITE;


    //Alloy Materials


    static {
        BRICK.addTags(DISABLE_FACTORY_COMPONENTS);
        NETHER_BRICK.addTags(DISABLE_FACTORY_COMPONENTS);
        DIAMOND.addTags(NOT_REACTIVE);

        HYDROGEN = new TransitionMaterial("hydrogen", HYDROGEN_GAS, 2).setElement(Elements.HYDROGEN).build();
        HYDROGEN_GAS = new FluidMaterial("hydrogen_has", TRANSPARENT_FLUID, 0x31219e).addTags(IS_GAS).setComposition(new MaterialStack(HYDROGEN, 2)).build();

        HELIUM = new FluidMaterial("helium", TRANSPARENT_FLUID, 0xeebe21).addTags(IS_GAS).setElement(Elements.HELIUM).build();

        LITHIUM = new IngotMaterial("lithium", REGULAR, 0xa9afac, 1).setElement(Elements.LITHIUM).setMeltingTemperature(453).setBoilingTemperature(1603).build();


        OXYGEN = new TransitionMaterial("oxygen", OXYGEN_GAS, 2).setElement(Elements.OXYGEN).build();
        OXYGEN_GAS = new FluidMaterial("oxygen_gas", TRANSPARENT_FLUID, 0x56badd).addTags(IS_GAS).setComposition(new MaterialStack(OXYGEN, 2)).build();

        ALUMINIUM = new IngotMaterial("aluminium", REGULAR, 0x96a4b0, 1).setSecondName("aluminum").setElement(Elements.ALUMINUM).setMeltingTemperature(933).setBoilingTemperature(2743).build();
        SILICON = new IngotMaterial("silicon", REGULAR, 0x121315, 1).setElement(Elements.SILICON).setMeltingTemperature(1687).setBoilingTemperature(3538).build();

        SULFUR = new DustMaterial("sulfur", FINE, 0xfff70c, 1).setElement(Elements.SULFUR).build();


        SULFUR_DIOXIDE = new FluidMaterial("sulfur_dioxide", TRANSPARENT_FLUID, 0xf8d34d).addTags(IS_GAS, DECOMPOSABLE).setComposition(new MaterialStack(SULFUR), new MaterialStack(OXYGEN_GAS)).build();

        HYDROXIDE = new GroupMaterial("hydroxide").setComposition(new MaterialStack(HYDROGEN), new MaterialStack(OXYGEN)).build();
        SULFATE = new GroupMaterial("sulfate").setComposition(new MaterialStack(SULFUR_DIOXIDE), new MaterialStack(OXYGEN_GAS)).build();


        MAGNETITE = new DustMaterial("magnetite", FINE, 0x1f1e1c, 1).setRefinedMaterial((IngotMaterial) IRON).setComposition(new MaterialStack(IRON, 3), new MaterialStack(OXYGEN_GAS, 2)).build();


        KAOLINITE = new DustMaterial("kaolinite", FINE, 0xe7c9c0, 1).setComposition(new MaterialStack(ALUMINIUM, 2), new MaterialStack(SILICON, 2), new MaterialStack(OXYGEN, 5), new MaterialStack(HYDROXIDE, 4)).addTags(DECOMPOSABLE).build();

    }
}