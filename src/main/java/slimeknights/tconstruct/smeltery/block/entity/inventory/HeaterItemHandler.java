package slimeknights.tconstruct.smeltery.block.entity.inventory;

import net.minecraft.world.item.ItemStack;
import slimeknights.mantle.block.entity.MantleBlockEntity;
import slimeknights.mantle.inventory.SingleItemHandler;
import slimeknights.mantle.lib.util.BurnUtil;
import slimeknights.tconstruct.library.recipe.RecipeTypes;

/**
 * Item handler holding the heater inventory
 */
public class HeaterItemHandler extends SingleItemHandler<MantleBlockEntity> {
  public HeaterItemHandler(MantleBlockEntity parent) {
    super(parent, 64);
  }

  @Override
  protected boolean isItemValid(ItemStack stack) {
    // fuel module divides by 4, so anything 3 or less is treated as 0
    return BurnUtil.getBurnTime(stack/*, RecipeTypes.FUEL*/) > 3;
  }
}
