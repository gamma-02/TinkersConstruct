package slimeknights.tconstruct.common.data.tags;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.core.Registry;
import slimeknights.tconstruct.TConstruct;
import slimeknights.tconstruct.common.TinkerTags;
import slimeknights.tconstruct.smeltery.TinkerSmeltery;
import slimeknights.tconstruct.tables.TinkerTables;

public class TileEntityTypeTagProvider extends FabricTagProvider<BlockEntityType<?>> {
  public TileEntityTypeTagProvider(FabricDataGenerator generatorIn) {
    super(generatorIn, Registry.BLOCK_ENTITY_TYPE, "tile_entity_types", TConstruct.MOD_ID);
  }

  @Override
  protected void generateTags() {
    this.tag(TinkerTags.TileEntityTypes.CRAFTING_STATION_BLACKLIST)
        .add(TinkerTables.craftingStationTile.get(), TinkerTables.tinkerStationTile.get(), TinkerTables.partBuilderTile.get(),
						 TinkerTables.partChestTile.get(), TinkerTables.tinkersChestTile.get(), TinkerTables.castChestTile.get(),
						 TinkerSmeltery.basin.get(), TinkerSmeltery.table.get(), TinkerSmeltery.smeltery.get());

  }

  @Override
  public String getName() {
    return "Tinkers' Construct Tile Entity Type Tags";
  }
}
