package com.NovumScientiaTeam.novumscientia.api.machineTiers;


import com.EmosewaPixel.pixellib.materialsystem.materials.Material;

public class MachineTier extends com.EmosewaPixel.pixellib.machinetiers.MachineTier {
    private int energyPerTick;
    private Material mainMaterial; //The Material used for the casing
    private Material conductorMaterial; //The material that the cables of which are used in recipes
    private Material magneticMaterial; //The material used in recipes for magnet-based machines
    private Material heatingMaterial; //The material used in recipes for heat-based machines
    private Material softMaterial; //The rubber/polymer used

    public MachineTier(String name, int energyPerTick, Material mainMaterial, Material conductorMaterial, Material magneticMaterial, Material heatingMaterial, Material softMaterial) {
        super(name, mainMaterial.getColor());
        this.energyPerTick = energyPerTick;
        this.mainMaterial = mainMaterial;
        this.conductorMaterial = conductorMaterial;
        this.magneticMaterial = magneticMaterial;
        this.heatingMaterial = heatingMaterial;
        this.softMaterial = softMaterial;
    }

    public int getEnergyPerTick() {
        return energyPerTick;
    }

    public Material getMainMaterial() {
        return mainMaterial;
    }

    public Material getConductorMaterial() {
        return conductorMaterial;
    }

    public Material getMagneticMaterial() {
        return magneticMaterial;
    }

    public Material getHeatingMaterial() {
        return heatingMaterial;
    }

    public Material getSoftMaterial() {
        return softMaterial;
    }
}