package com.telepathicgrunt.repurposedstructures.world.structures;

import com.telepathicgrunt.repurposedstructures.RepurposedStructures;
import com.telepathicgrunt.repurposedstructures.world.structures.pieces.RSStrongholdPieces;
import net.minecraft.structure.StructureManager;
import net.minecraft.structure.StructurePiece;
import net.minecraft.structure.StructureStart;
import net.minecraft.util.math.BlockBox;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.registry.DynamicRegistryManager;
import net.minecraft.world.WorldView;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.source.BiomeSource;
import net.minecraft.world.gen.ChunkRandom;
import net.minecraft.world.gen.StructureAccessor;
import net.minecraft.world.gen.chunk.ChunkGenerator;
import net.minecraft.world.gen.chunk.StructureConfig;
import net.minecraft.world.gen.feature.DefaultFeatureConfig;
import net.minecraft.world.gen.feature.StrongholdFeature;
import net.minecraft.world.gen.feature.StructureFeature;

import java.util.List;
import java.util.Random;


public class RSStonebrickStrongholdStructure extends StrongholdFeature {
    public RSStonebrickStrongholdStructure() {
        super(DefaultFeatureConfig.CODEC);
    }

    // Thickness of rings:      1,536  (96 chunks)
    // Distance between rings:  1,536  (96 chunks)
    // Distance to first ring:  1,280  (80 chunks)
    // Vanilla has 8 rings

    @Override
    protected boolean shouldStartAt(ChunkGenerator chunkGenerator, BiomeSource biomeSource, long seed, ChunkRandom chunkRandom, int xChunk, int zChunk, Biome biome, ChunkPos chunkPos, DefaultFeatureConfig featureConfig) {
        int ringThickness = 96;
        int distanceToFirstRing = 80;

        int chunkDistance = (int) Math.sqrt((xChunk * xChunk) + (zChunk * zChunk));

        // Offset the distance so that the first ring is closer to spawn
        int shiftedChunkDistance = Math.max(chunkDistance + (ringThickness - distanceToFirstRing), 0);

        // Determine which ring we are in.
        // non-stronghold rings are even number ringSection
        // stronghold rings are odd number ringSection.
        int ringSection = shiftedChunkDistance / ringThickness;

        // Would mimic vanilla's 8 ring result
        // if(ringSection > 16) return false;

        // Only spawn strongholds on odd number sections
        return ringSection % 2 == 1;
    }

    @Override
    public BlockPos locateStructure(WorldView worldView, StructureAccessor structureAccessor, BlockPos blockPos, int radius, boolean skipExistingChunks, long seed, StructureConfig structureConfig) {
        return AbstractBaseStructure.locateStructureFast(worldView, structureAccessor, blockPos, radius, skipExistingChunks, seed, structureConfig, this);
    }

    @Override
    public StructureFeature.StructureStartFactory<DefaultFeatureConfig> getStructureStartFactory() {
        return RSStonebrickStrongholdStructure.Start::new;
    }


    public static class Start extends StructureStart<DefaultFeatureConfig> {
        public Start(StructureFeature<DefaultFeatureConfig> structureIn, int chunkX, int chunkZ, BlockBox mutableBoundingBox, int referenceIn, long seedIn) {
            super(structureIn, chunkX, chunkZ, mutableBoundingBox, referenceIn, seedIn);
        }


        @Override
        public void init(DynamicRegistryManager dynamicRegistryManager, ChunkGenerator chunkGenerator, StructureManager structureManager, int chunkX, int chunkZ, Biome biome, DefaultFeatureConfig defaultFeatureConfig) {
            RSStrongholdPieces.prepareStructurePieces();
            RSStrongholdPieces.EntranceStairs strongholdpieces$entrancestairs = new RSStrongholdPieces.EntranceStairs(this.random, (chunkX << 4) + 2, (chunkZ << 4) + 2, RSStrongholdPieces.Type.NORMAL);
            this.children.add(strongholdpieces$entrancestairs);
            strongholdpieces$entrancestairs.fillOpenings(strongholdpieces$entrancestairs, this.children, this.random);
            List<StructurePiece> list = strongholdpieces$entrancestairs.pendingChildren;

            while (!list.isEmpty()) {
                int i = this.random.nextInt(list.size());
                StructurePiece structurepiece = list.remove(i);
                structurepiece.fillOpenings(strongholdpieces$entrancestairs, this.children, this.random);
            }

            if (strongholdpieces$entrancestairs.strongholdPortalRoom == null) {
                BlockBox box = this.children.get(this.children.size() - 1).getBoundingBox();
                RSStrongholdPieces.Stronghold portalRoom = RSStrongholdPieces.PortalRoom.createPiece(this.children, this.random, box.minX, box.minY + 1, box.minZ, Direction.NORTH, RSStrongholdPieces.Type.NORMAL);
                this.children.add(portalRoom);
                strongholdpieces$entrancestairs.pendingChildren.add(portalRoom);
                list = strongholdpieces$entrancestairs.pendingChildren;

                while (!list.isEmpty()) {
                    int i = this.random.nextInt(list.size());
                    StructurePiece structurepiece = list.remove(i);
                    structurepiece.fillOpenings(strongholdpieces$entrancestairs, this.children, this.random);
                }
            }

            this.setBoundingBoxFromChildren();
            int lowestBounds = this.boundingBox.minY - 2;
            int maxYConfig = RepurposedStructures.RSAllConfig.RSStrongholdsConfig.stonebrick.stonebrickStrongholdMaxHeight;
            int minYConfig = RepurposedStructures.RSAllConfig.RSStrongholdsConfig.stonebrick.stonebrickStrongholdMinHeight;

            RSStonebrickStrongholdStructure.offsetStronghold(lowestBounds, maxYConfig, minYConfig, this.random, this.children, this.boundingBox, strongholdpieces$entrancestairs.strongholdPortalRoom);
        }
    }

    public static void offsetStronghold(int lowestBounds, int maxYConfig, int minYConfig, Random random, List<StructurePiece> pieces, BlockBox bounds, RSStrongholdPieces.PortalRoom strongholdPortalRoom) {
        int minimum = minYConfig;
        int maximum = Math.max(maxYConfig, minimum) + 1;

        // Sets stronghold's bottom most y to a random range between min and max y config.
        int offset = random.nextInt(maximum - minimum) + minimum;
        int offset2 = 0;

        //apply first offset to be able to do some calculations in next few lines
        bounds.move(0, offset - lowestBounds, 0);

        // If the stronghold's max y is over the config's max y, lower the stronghold as
        // much as possible without hitting bedrock.
        if (bounds.maxY > maxYConfig) {
            int heightDiff = maxYConfig - bounds.maxY;
            offset2 = bounds.minY + heightDiff < 2 ? 2 - bounds.minY : heightDiff;
        }

        // Apply the final offsets
        bounds.move(0, offset2, 0);
        int finalOffset = offset2;
        pieces.forEach(piece -> piece.translate(0, offset + finalOffset - lowestBounds, 0));

        int portalRoomY = strongholdPortalRoom.getBoundingBox().minY;

        // Now remove rooms that are above max y config if portal room is below it.
        if(portalRoomY < maxYConfig){
            pieces.removeIf(piece -> piece.getBoundingBox().minY > maxYConfig);
        }
        // Portal room too high, lower stronghold and delete rooms too low.
        else {
            int topDiff = strongholdPortalRoom.getBoundingBox().maxY - maxYConfig;
            pieces.forEach(piece -> piece.translate(0, -topDiff, 0));
            pieces.removeIf(piece -> piece.getBoundingBox().minY < Math.max(minYConfig, 4));
            bounds.move(0, -topDiff, 0);
        }
    }
}