package net.ltxprogrammer.changed.world.features.structures.facility;

import net.ltxprogrammer.changed.world.features.structures.LootTables;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.random.WeightedEntry;
import net.minecraft.util.random.WeightedRandomList;

public class FacilityCorridorSection extends FacilitySinglePiece {
    private static final WeightedRandomList<WeightedEntry.Wrapper<PieceType>> VALID_NEIGHBORS = WeightedRandomList.create(
            WeightedEntry.wrap(PieceType.STAIRCASE_START, 1),
            WeightedEntry.wrap(PieceType.CORRIDOR, 5),
            WeightedEntry.wrap(PieceType.ROOM, 3));

    public FacilityCorridorSection(Zone zone, ResourceLocation templateName) {
        super(PieceType.STAIRCASE_SECTION, zone, templateName, LootTables.LOW_TIER_LAB);
    }

    @Override
    public WeightedRandomList<WeightedEntry.Wrapper<PieceType>> getValidNeighbors() {
        return VALID_NEIGHBORS;
    }
}
