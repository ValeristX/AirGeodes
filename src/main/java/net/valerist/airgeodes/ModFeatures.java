package net.valerist.airgeodes;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.GeodeConfiguration;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.valerist.airgeodes.worldgen.AirGeodeFeature;

public class ModFeatures {
    public static final DeferredRegister<Feature<?>> FEATURES =
            DeferredRegister.create(Registries.FEATURE, AirGeodes.MODID);
    public static final RegistryObject<AirGeodeFeature> AIR_GEODE =
            FEATURES.register("geode", () -> new AirGeodeFeature(GeodeConfiguration.CODEC));
}
