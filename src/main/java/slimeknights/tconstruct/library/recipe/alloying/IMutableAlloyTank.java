package slimeknights.tconstruct.library.recipe.alloying;

import slimeknights.mantle.lib.transfer.fluid.FluidStack;

/** Extension of IAlloyTank for the sake of receiving outputs and consuming inputs */
public interface IMutableAlloyTank extends IAlloyTank {
  /**
   * Actually drains the fluid from the tank
   * @param tank        Tank index being drained
   * @param fluidStack  Fluid being drained
   * @return  Amount drained, for sanity checks
   */
  FluidStack drain(int tank, FluidStack fluidStack);

  /** Fills the tank with the output */
  long fill(FluidStack fluidStack);
}
