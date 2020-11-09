package com.telepathicgrunt.repurposedstructures.modinit;

import com.telepathicgrunt.repurposedstructures.RepurposedStructures;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.MutableRegistry;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.feature.ConfiguredStructureFeature;
import net.minecraft.world.gen.feature.DefaultFeatureConfig;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.StructureFeature;


public class RSConfiguredStructures {

    public static ConfiguredStructureFeature<DefaultFeatureConfig, ? extends StructureFeature<DefaultFeatureConfig>> BIRCH_MINESHAFT = RSStructures.BIRCH_MINESHAFT.configure(FeatureConfig.DEFAULT);
    public static ConfiguredStructureFeature<DefaultFeatureConfig, ? extends StructureFeature<DefaultFeatureConfig>> DESERT_MINESHAFT = RSStructures.DESERT_MINESHAFT.configure(FeatureConfig.DEFAULT);
    public static ConfiguredStructureFeature<DefaultFeatureConfig, ? extends StructureFeature<DefaultFeatureConfig>> END_MINESHAFT = RSStructures.END_MINESHAFT.configure(FeatureConfig.DEFAULT);
    public static ConfiguredStructureFeature<DefaultFeatureConfig, ? extends StructureFeature<DefaultFeatureConfig>> NETHER_MINESHAFT = RSStructures.NETHER_MINESHAFT.configure(FeatureConfig.DEFAULT);
    public static ConfiguredStructureFeature<DefaultFeatureConfig, ? extends StructureFeature<DefaultFeatureConfig>> ICY_MINESHAFT = RSStructures.ICY_MINESHAFT.configure(FeatureConfig.DEFAULT);
    public static ConfiguredStructureFeature<DefaultFeatureConfig, ? extends StructureFeature<DefaultFeatureConfig>> JUNGLE_MINESHAFT = RSStructures.JUNGLE_MINESHAFT.configure(FeatureConfig.DEFAULT);
    public static ConfiguredStructureFeature<DefaultFeatureConfig, ? extends StructureFeature<DefaultFeatureConfig>> OCEAN_MINESHAFT = RSStructures.OCEAN_MINESHAFT.configure(FeatureConfig.DEFAULT);
    public static ConfiguredStructureFeature<DefaultFeatureConfig, ? extends StructureFeature<DefaultFeatureConfig>> SAVANNA_MINESHAFT = RSStructures.SAVANNA_MINESHAFT.configure(FeatureConfig.DEFAULT);
    public static ConfiguredStructureFeature<DefaultFeatureConfig, ? extends StructureFeature<DefaultFeatureConfig>> STONE_MINESHAFT = RSStructures.STONE_MINESHAFT.configure(FeatureConfig.DEFAULT);
    public static ConfiguredStructureFeature<DefaultFeatureConfig, ? extends StructureFeature<DefaultFeatureConfig>> SWAMP_OR_DARK_FOREST_MINESHAFT = RSStructures.SWAMP_OR_DARK_FOREST_MINESHAFT.configure(FeatureConfig.DEFAULT);
    public static ConfiguredStructureFeature<DefaultFeatureConfig, ? extends StructureFeature<DefaultFeatureConfig>> TAIGA_MINESHAFT = RSStructures.TAIGA_MINESHAFT.configure(FeatureConfig.DEFAULT);

    public static ConfiguredStructureFeature<DefaultFeatureConfig, ? extends StructureFeature<DefaultFeatureConfig>> STONEBRICK_STRONGHOLD = RSStructures.STONEBRICK_STRONGHOLD.configure(FeatureConfig.DEFAULT);
    public static ConfiguredStructureFeature<DefaultFeatureConfig, ? extends StructureFeature<DefaultFeatureConfig>> NETHER_STRONGHOLD = RSStructures.NETHER_STRONGHOLD.configure(FeatureConfig.DEFAULT);

    public static ConfiguredStructureFeature<DefaultFeatureConfig, ? extends StructureFeature<DefaultFeatureConfig>> JUNGLE_FORTRESS = RSStructures.JUNGLE_FORTRESS.configure(FeatureConfig.DEFAULT);
    public static ConfiguredStructureFeature<DefaultFeatureConfig, ? extends StructureFeature<DefaultFeatureConfig>> GRASSY_IGLOO = RSStructures.GRASSY_IGLOO.configure(FeatureConfig.DEFAULT);
    public static ConfiguredStructureFeature<DefaultFeatureConfig, ? extends StructureFeature<DefaultFeatureConfig>> STONE_IGLOO = RSStructures.STONE_IGLOO.configure(FeatureConfig.DEFAULT);

    public static ConfiguredStructureFeature<DefaultFeatureConfig, ? extends StructureFeature<DefaultFeatureConfig>> NETHER_WASTELAND_TEMPLE = RSStructures.NETHER_WASTELAND_TEMPLE.configure(FeatureConfig.DEFAULT);
    public static ConfiguredStructureFeature<DefaultFeatureConfig, ? extends StructureFeature<DefaultFeatureConfig>> NETHER_BASALT_TEMPLE = RSStructures.NETHER_BASALT_TEMPLE.configure(FeatureConfig.DEFAULT);
    public static ConfiguredStructureFeature<DefaultFeatureConfig, ? extends StructureFeature<DefaultFeatureConfig>> NETHER_WARPED_TEMPLE = RSStructures.NETHER_WARPED_TEMPLE.configure(FeatureConfig.DEFAULT);
    public static ConfiguredStructureFeature<DefaultFeatureConfig, ? extends StructureFeature<DefaultFeatureConfig>> NETHER_CRIMSON_TEMPLE = RSStructures.NETHER_CRIMSON_TEMPLE.configure(FeatureConfig.DEFAULT);
    public static ConfiguredStructureFeature<DefaultFeatureConfig, ? extends StructureFeature<DefaultFeatureConfig>> NETHER_SOUL_TEMPLE = RSStructures.NETHER_SOUL_TEMPLE.configure(FeatureConfig.DEFAULT);

    public static ConfiguredStructureFeature<DefaultFeatureConfig, ? extends StructureFeature<DefaultFeatureConfig>> NETHER_BRICK_OUTPOST = RSStructures.NETHER_BRICK_OUTPOST.configure(FeatureConfig.DEFAULT);
    public static ConfiguredStructureFeature<DefaultFeatureConfig, ? extends StructureFeature<DefaultFeatureConfig>> WARPED_OUTPOST = RSStructures.WARPED_OUTPOST.configure(FeatureConfig.DEFAULT);
    public static ConfiguredStructureFeature<DefaultFeatureConfig, ? extends StructureFeature<DefaultFeatureConfig>> CRIMSON_OUTPOST = RSStructures.CRIMSON_OUTPOST.configure(FeatureConfig.DEFAULT);

    public static ConfiguredStructureFeature<DefaultFeatureConfig, ? extends StructureFeature<DefaultFeatureConfig>> NETHER_PYRAMID = RSStructures.NETHER_PYRAMID.configure(FeatureConfig.DEFAULT);
    public static ConfiguredStructureFeature<DefaultFeatureConfig, ? extends StructureFeature<DefaultFeatureConfig>> BADLANDS_PYRAMID = RSStructures.BADLANDS_PYRAMID.configure(FeatureConfig.DEFAULT);

    public static ConfiguredStructureFeature<DefaultFeatureConfig, ? extends StructureFeature<DefaultFeatureConfig>> END_SHIPWRECK = RSStructures.END_SHIPWRECK.configure(FeatureConfig.DEFAULT);
    public static ConfiguredStructureFeature<DefaultFeatureConfig, ? extends StructureFeature<DefaultFeatureConfig>> NETHER_BRICKS_SHIPWRECK = RSStructures.NETHER_BRICKS_SHIPWRECK.configure(FeatureConfig.DEFAULT);
    public static ConfiguredStructureFeature<DefaultFeatureConfig, ? extends StructureFeature<DefaultFeatureConfig>> CRIMSON_SHIPWRECK = RSStructures.CRIMSON_SHIPWRECK.configure(FeatureConfig.DEFAULT);
    public static ConfiguredStructureFeature<DefaultFeatureConfig, ? extends StructureFeature<DefaultFeatureConfig>> WARPED_SHIPWRECK = RSStructures.WARPED_SHIPWRECK.configure(FeatureConfig.DEFAULT);

    public static ConfiguredStructureFeature<DefaultFeatureConfig, ? extends StructureFeature<DefaultFeatureConfig>> BADLANDS_VILLAGE = RSStructures.BADLANDS_VILLAGE.configure(FeatureConfig.DEFAULT);
    public static ConfiguredStructureFeature<DefaultFeatureConfig, ? extends StructureFeature<DefaultFeatureConfig>> BIRCH_VILLAGE = RSStructures.BIRCH_VILLAGE.configure(FeatureConfig.DEFAULT);
    public static ConfiguredStructureFeature<DefaultFeatureConfig, ? extends StructureFeature<DefaultFeatureConfig>> DARK_FOREST_VILLAGE = RSStructures.DARK_FOREST_VILLAGE.configure(FeatureConfig.DEFAULT);
    public static ConfiguredStructureFeature<DefaultFeatureConfig, ? extends StructureFeature<DefaultFeatureConfig>> JUNGLE_VILLAGE = RSStructures.JUNGLE_VILLAGE.configure(FeatureConfig.DEFAULT);
    public static ConfiguredStructureFeature<DefaultFeatureConfig, ? extends StructureFeature<DefaultFeatureConfig>> SWAMP_VILLAGE = RSStructures.SWAMP_VILLAGE.configure(FeatureConfig.DEFAULT);
    public static ConfiguredStructureFeature<DefaultFeatureConfig, ? extends StructureFeature<DefaultFeatureConfig>> MOUNTAINS_VILLAGE = RSStructures.MOUNTAINS_VILLAGE.configure(FeatureConfig.DEFAULT);
    public static ConfiguredStructureFeature<DefaultFeatureConfig, ? extends StructureFeature<DefaultFeatureConfig>> GIANT_TAIGA_VILLAGE = RSStructures.GIANT_TAIGA_VILLAGE.configure(FeatureConfig.DEFAULT);
    public static ConfiguredStructureFeature<DefaultFeatureConfig, ? extends StructureFeature<DefaultFeatureConfig>> CRIMSON_VILLAGE = RSStructures.CRIMSON_VILLAGE.configure(FeatureConfig.DEFAULT);
    public static ConfiguredStructureFeature<DefaultFeatureConfig, ? extends StructureFeature<DefaultFeatureConfig>> WARPED_VILLAGE = RSStructures.WARPED_VILLAGE.configure(FeatureConfig.DEFAULT);

    public static ConfiguredStructureFeature<DefaultFeatureConfig, ? extends StructureFeature<DefaultFeatureConfig>> RUINED_PORTAL_END = RSStructures.RUINED_PORTAL_END.configure(FeatureConfig.DEFAULT);

    public static void registerConfiguredStructures() {
        MutableRegistry<ConfiguredStructureFeature<?, ?>> registry = (MutableRegistry<ConfiguredStructureFeature<?, ?>>) BuiltinRegistries.CONFIGURED_STRUCTURE_FEATURE;

        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "birch_mineshaft"), BIRCH_MINESHAFT);
        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "desert_mineshaft"), DESERT_MINESHAFT);
        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "end_mineshaft"), END_MINESHAFT);
        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "nether_mineshaft"), NETHER_MINESHAFT);
        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "icy_mineshaft"), ICY_MINESHAFT);
        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "jungle_mineshaft"), JUNGLE_MINESHAFT);
        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "ocean_mineshaft"), OCEAN_MINESHAFT);
        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "savanna_mineshaft"), SAVANNA_MINESHAFT);
        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "stone_mineshaft"), STONE_MINESHAFT);
        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "swamp_or_dark_forest_mineshaft"), SWAMP_OR_DARK_FOREST_MINESHAFT);
        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "taiga_mineshaft"), TAIGA_MINESHAFT);

        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "stonebrick_stronghold"), STONEBRICK_STRONGHOLD);
        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "nether_stronghold"), NETHER_STRONGHOLD);

        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "jungle_fortress"), JUNGLE_FORTRESS);
        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "grassy_igloo"), GRASSY_IGLOO);
        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "stone_igloo"), STONE_IGLOO);

        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "nether_wasteland_temple"), NETHER_WASTELAND_TEMPLE);
        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "nether_basalt_temple"), NETHER_BASALT_TEMPLE);
        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "nether_warped_temple"), NETHER_WARPED_TEMPLE);
        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "nether_crimson_temple"), NETHER_CRIMSON_TEMPLE);
        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "nether_soul_temple"), NETHER_SOUL_TEMPLE);

        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "nether_brick_outpost"), NETHER_BRICK_OUTPOST);
        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "warped_outpost"), WARPED_OUTPOST);
        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "crimson_outpost"), CRIMSON_OUTPOST);

        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "nether_pyramid"), NETHER_PYRAMID);
        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "badlands_temple"), BADLANDS_PYRAMID);

        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "end_shipwreck"), END_SHIPWRECK);
        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "nether_bricks_shipwreck"), NETHER_BRICKS_SHIPWRECK);
        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "crimson_shipwreck"), CRIMSON_SHIPWRECK);
        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "warped_shipwreck"), WARPED_SHIPWRECK);

        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "badlands_village"), BADLANDS_VILLAGE);
        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "birch_village"), BIRCH_VILLAGE);
        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "dark_forest_village"), DARK_FOREST_VILLAGE);
        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "jungle_village"), JUNGLE_VILLAGE);
        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "swamp_village"), SWAMP_VILLAGE);
        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "mountains_village"), MOUNTAINS_VILLAGE);
        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "giant_taiga_village"), GIANT_TAIGA_VILLAGE);
        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "crimson_village"), CRIMSON_VILLAGE);
        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "warped_village"), WARPED_VILLAGE);

        Registry.register(registry, new Identifier(RepurposedStructures.MODID, "ruined_portal_end"), RUINED_PORTAL_END);
    }
}
