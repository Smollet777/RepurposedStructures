package com.telepathicgrunt.repurposedstructures.world.features.structures;

import com.mojang.serialization.Codec;
import com.telepathicgrunt.repurposedstructures.RepurposedStructures;
import net.minecraft.structure.StructureManager;
import net.minecraft.structure.StructurePiece;
import net.minecraft.structure.StructureStart;
import net.minecraft.util.math.BlockBox;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.source.BiomeSource;
import net.minecraft.world.gen.ChunkRandom;
import net.minecraft.world.gen.chunk.ChunkGenerator;
import net.minecraft.world.gen.feature.DefaultFeatureConfig;
import net.minecraft.world.gen.feature.MineshaftFeatureConfig;
import net.minecraft.world.gen.feature.StructureFeature;


public class RSMineshaftDesertStructure extends AbstractMineshaftStructure {
    public RSMineshaftDesertStructure(Codec<DefaultFeatureConfig> config) {
        super(config);
    }

    public double getProbability() {
        return RepurposedStructures.RSAllConfig.RSMineshaftsConfig.spawnrate.desertMineshaftSpawnrate;
    }

    @Override
    public StructureFeature.StructureStartFactory<DefaultFeatureConfig> getStructureStartFactory() {
        return RSMineshaftDesertStructure.Start::new;
    }

    public static class Start extends AbstractStart {
        public Start(StructureFeature<DefaultFeatureConfig> structureIn, int chunkX, int chunkZ, BlockBox mutableBoundingBox, int referenceIn, long seedIn) {
            super(structureIn, chunkX, chunkZ, mutableBoundingBox, referenceIn, seedIn);
        }


        @Override
        public RSMineshaftPieces.Type getMineshaftType() {
            return RSMineshaftPieces.Type.DESERT;
        }
        @Override
        public int getMaxHeight() {
            return RepurposedStructures.RSAllConfig.RSMineshaftsConfig.maxHeight.desertMineshaftMaxHeight;
        }
        @Override
        public int getMinHeight() {
            return RepurposedStructures.RSAllConfig.RSMineshaftsConfig.minHeight.desertMineshaftMinHeight;
        }
    }

}
