package com.novumscientiateam.novumscientia.api.machinetiers


import com.emosewapixel.pixellib.materialsystem.materials.Material

class MachineTier(override val name: String,
                  val energyPerTick: Int,
                  val mainMaterial: Material,
                  override val color: Int = mainMaterial.color,
                  val conductorMaterial: Material,
                  val magneticMaterial: Material,
                  val heatingMaterial: Material,
                  val softMaterial: Material
) : com.emosewapixel.pixellib.machinetiers.MachineTier