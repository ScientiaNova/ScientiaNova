package com.NovumScientiaTeam.novumscientia.api.materialProperties;

import com.NovumScientiaTeam.novumscientia.NovumScientia;
import net.minecraft.block.material.Material;

import java.util.HashMap;
import java.util.Map;

public class MaterialByproducts {
    private static Map<Material, Material> firstByProducts = new HashMap<>();
    private static Map<Material, Material> secondByProducts = new HashMap<>();
    private static Map<Material, Material> thirdByProducts = new HashMap<>();

    public static void addByproduct(Material mat, int tier, Material byproduct) {
        switch (tier) {
            case 1:
                firstByProducts.put(mat, byproduct);
            case 2:
                secondByProducts.put(mat, byproduct);
            case 3:
                thirdByProducts.put(mat, byproduct);
            default:
                NovumScientia.LOGGER.warn("Materials don't have a " + tier + "th byproduct");
        }
    }

    public static Material getMaterialByproduct(Material mat, int tier) {
        switch (tier) {
            case 1:
                return firstByProducts.get(mat) != null ? firstByProducts.get(mat) : mat;
            case 2:
                return secondByProducts.get(mat) != null ? secondByProducts.get(mat) : mat;
            case 3:
                return thirdByProducts.get(mat) != null ? thirdByProducts.get(mat) : mat;
            default:
                NovumScientia.LOGGER.warn("Materials don't have a " + tier + "th byproduct");
                return mat;
        }
    }
}