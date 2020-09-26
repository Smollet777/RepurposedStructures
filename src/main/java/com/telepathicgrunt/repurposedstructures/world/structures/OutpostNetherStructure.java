package com.telepathicgrunt.repurposedstructures.world.structures;

import com.google.common.collect.Lists;
import com.telepathicgrunt.repurposedstructures.RSStructures;
import com.telepathicgrunt.repurposedstructures.world.structures.pieces.GeneralJigsawGenerator;
import net.minecraft.entity.EntityType;
import net.minecraft.structure.StructureManager;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockBox;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.DynamicRegistryManager;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.SpawnSettings;
import net.minecraft.world.gen.chunk.ChunkGenerator;
import net.minecraft.world.gen.feature.DefaultFeatureConfig;
import net.minecraft.world.gen.feature.StructureFeature;

import java.util.List;


public class OutpostNetherStructure extends StructureFeature<DefaultFeatureConfig> {
    private final Identifier START_POOL;
    private static final List<SpawnSettings.SpawnEntry> MONSTER_SPAWNS = Lists.newArrayList(new SpawnSettings.SpawnEntry(EntityType.PIGLIN, 10, 1, 1));

    public OutpostNetherStructure(Identifier pieceRL) {
        super(DefaultFeatureConfig.CODEC);
        START_POOL = pieceRL;
        RSStructures.RS_STRUCTURE_START_PIECES.add(START_POOL);
    }

    @Override
    public StructureStartFactory<DefaultFeatureConfig> getStructureStartFactory() {
        return OutpostNetherStructure.Start::new;
    }

    @Override
    public List<SpawnSettings.SpawnEntry> getMonsterSpawns() {
        return MONSTER_SPAWNS;
    }

    public class Start extends AbstractNetherStructure.AbstractStart{
        public Start(StructureFeature<DefaultFeatureConfig> structureFeature, int x, int z, BlockBox blockBox, int referenceIn, long seed) {
            super(structureFeature, x, z, blockBox, referenceIn, seed);
        }

        public void init(DynamicRegistryManager dynamicRegistryManager, ChunkGenerator chunkGenerator, StructureManager structureManager, int x, int z, Biome biome, DefaultFeatureConfig defaultFeatureConfig) {
            BlockPos blockPos = new BlockPos(x * 16, 0, z * 16);
            GeneralJigsawGenerator.addPieces(dynamicRegistryManager, chunkGenerator, structureManager, blockPos, this.children, this.random, dynamicRegistryManager.get(Registry.TEMPLATE_POOL_WORLDGEN).get(START_POOL), 11);
            this.setBoundingBoxFromChildren();

            BlockPos lowestLandPos = getHighestLand(chunkGenerator);
            if (lowestLandPos.getY() >= 108 || lowestLandPos.getY() <= 37) {
                this.method_14976(this.random, 19, 20);
            }
            else {
                this.method_14976(this.random, lowestLandPos.getY()-15, lowestLandPos.getY()-14);
            }
        }
    }
}