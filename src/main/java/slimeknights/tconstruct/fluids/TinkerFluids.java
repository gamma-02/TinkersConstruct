package slimeknights.tconstruct.fluids;

import io.github.tropheusj.milk.Milk;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.material.Material;
import slimeknights.mantle.lib.fluid.SimpleFlowableFluid;
import slimeknights.mantle.lib.transfer.fluid.FluidAttributes;
import slimeknights.mantle.registration.ModelFluidAttributes;
import slimeknights.mantle.registration.object.FluidObject;
import slimeknights.tconstruct.common.TinkerModule;
import slimeknights.tconstruct.fluids.fluids.SlimeFluid;
import slimeknights.tconstruct.shared.block.SlimeType;

import java.util.EnumMap;
import java.util.Map;

/**
 * Contains all fluids used throughout the mod
 */
public final class TinkerFluids extends TinkerModule {
  public TinkerFluids() {
    Milk.enableMilkFluid();
  }

  // basic
  public static final FluidObject<SimpleFlowableFluid> blood = FLUIDS.register("blood", coolBuilder().density(1200).viscosity(1200).temperature(336), Material.WATER, 0);
  public static final FluidObject<SimpleFlowableFluid> venom = FLUIDS.register("venom", coolBuilder().density(1400).viscosity(1300).temperature(310), Material.WATER, 0);

  // slime -  note second name parameter is forge tag name
  public static final FluidObject<SimpleFlowableFluid> earthSlime = FLUIDS.register("earth_slime", "slime",  coolBuilder().density(1400).viscosity(1400).temperature(350), SlimeFluid.Source::new, SlimeFluid.Flowing::new, Material.WATER, 0);
  public static final FluidObject<SimpleFlowableFluid> skySlime   = FLUIDS.register("sky_slime",             coolBuilder().density(1500).viscosity(1500).temperature(310), SlimeFluid.Source::new, SlimeFluid.Flowing::new, Material.WATER, 0);
  public static final FluidObject<SimpleFlowableFluid> enderSlime = FLUIDS.register("ender_slime",           coolBuilder().density(1600).viscosity(1600).temperature(370), SlimeFluid.Source::new, SlimeFluid.Flowing::new, Material.WATER, 0);
  public static final FluidObject<SimpleFlowableFluid> magma      = FLUIDS.register("magma",                 coolBuilder().density(1900).viscosity(1900).temperature(600), SlimeFluid.Source::new, SlimeFluid.Flowing::new, Material.WATER, 3);
  public static final Map<SlimeType, FluidObject<SimpleFlowableFluid>> slime;
  static {
    slime = new EnumMap<>(SlimeType.class);
    slime.put(SlimeType.EARTH, earthSlime);
    slime.put(SlimeType.SKY, skySlime);
    slime.put(SlimeType.ENDER, enderSlime);
    slime.put(SlimeType.BLOOD, blood);
  }

  // base molten fluids
  public static final FluidObject<SimpleFlowableFluid> searedStone   = FLUIDS.register("seared_stone",   hotBuilder().temperature( 900), Material.LAVA,  6);
  public static final FluidObject<SimpleFlowableFluid> scorchedStone = FLUIDS.register("scorched_stone", hotBuilder().temperature( 800), Material.LAVA,  4);
  public static final FluidObject<SimpleFlowableFluid> moltenClay    = FLUIDS.register("molten_clay",    hotBuilder().temperature( 750), Material.LAVA,  3);
  public static final FluidObject<SimpleFlowableFluid> moltenGlass   = FLUIDS.register("molten_glass",   hotBuilder().temperature(1050), Material.LAVA,  1);
  public static final FluidObject<SimpleFlowableFluid> liquidSoul    = FLUIDS.register("liquid_soul",    hotBuilder().temperature( 700), Material.LAVA,  2);
  // ceramics compat
  public static final FluidObject<SimpleFlowableFluid> moltenPorcelain = FLUIDS.register("molten_porcelain", hotBuilder().temperature(1000), Material.LAVA, 2);
  // fancy molten fluids
  public static final FluidObject<SimpleFlowableFluid> moltenObsidian = FLUIDS.register("molten_obsidian", hotBuilder().temperature(1300), Material.LAVA, 3);
  public static final FluidObject<SimpleFlowableFluid> moltenEnder    = FLUIDS.register("molten_ender", "ender", hotBuilder().temperature( 777), Material.LAVA, 5);
  public static final FluidObject<SimpleFlowableFluid> blazingBlood   = FLUIDS.register("blazing_blood",   hotBuilder().temperature(1800).density(3500), Material.LAVA, 15);

  // ores
  public static final FluidObject<SimpleFlowableFluid> moltenEmerald  = FLUIDS.register("molten_emerald",  hotBuilder().temperature(1234), Material.LAVA,  9);
  public static final FluidObject<SimpleFlowableFluid> moltenQuartz   = FLUIDS.register("molten_quartz",   hotBuilder().temperature( 937), Material.LAVA,  6);
  public static final FluidObject<SimpleFlowableFluid> moltenAmethyst = FLUIDS.register("molten_amethyst", hotBuilder().temperature(1250), Material.LAVA, 11);
  public static final FluidObject<SimpleFlowableFluid> moltenDiamond  = FLUIDS.register("molten_diamond",  hotBuilder().temperature(1750), Material.LAVA, 13);
  public static final FluidObject<SimpleFlowableFluid> moltenDebris   = FLUIDS.register("molten_debris",   hotBuilder().temperature(1475), Material.LAVA, 14);
  // metal ores
  public static final FluidObject<SimpleFlowableFluid> moltenIron   = FLUIDS.register("molten_iron",   hotBuilder().temperature(1100), Material.LAVA, 12);
  public static final FluidObject<SimpleFlowableFluid> moltenGold   = FLUIDS.register("molten_gold",   hotBuilder().temperature(1000), Material.LAVA, 12);
  public static final FluidObject<SimpleFlowableFluid> moltenCopper = FLUIDS.register("molten_copper", hotBuilder().temperature( 800), Material.LAVA, 12);
  public static final FluidObject<SimpleFlowableFluid> moltenCobalt = FLUIDS.register("molten_cobalt", hotBuilder().temperature(1250), Material.LAVA,  8);
  // alloys
  public static final FluidObject<SimpleFlowableFluid> moltenSlimesteel    = FLUIDS.register("molten_slimesteel",     hotBuilder().temperature(1200), Material.LAVA, 10);
  public static final FluidObject<SimpleFlowableFluid> moltenTinkersBronze = FLUIDS.register("molten_tinkers_bronze", "molten_silicon_bronze", hotBuilder().temperature(1000), Material.LAVA, 12);
  public static final FluidObject<SimpleFlowableFluid> moltenRoseGold      = FLUIDS.register("molten_rose_gold",      hotBuilder().temperature( 850), Material.LAVA, 12);
  public static final FluidObject<SimpleFlowableFluid> moltenPigIron       = FLUIDS.register("molten_pig_iron",       hotBuilder().temperature(1111), Material.LAVA, 10);

  public static final FluidObject<SimpleFlowableFluid> moltenManyullyn   = FLUIDS.register("molten_manyullyn",    hotBuilder().temperature(1500), Material.LAVA, 11);
  public static final FluidObject<SimpleFlowableFluid> moltenHepatizon   = FLUIDS.register("molten_hepatizon",    hotBuilder().temperature(1700), Material.LAVA,  8);
  public static final FluidObject<SimpleFlowableFluid> moltenQueensSlime = FLUIDS.register("molten_queens_slime", hotBuilder().temperature(1450), Material.LAVA,  9);
  public static final FluidObject<SimpleFlowableFluid> moltenSoulsteel   = FLUIDS.register("molten_soulsteel",    hotBuilder().temperature(1500), Material.LAVA,  6);
  public static final FluidObject<SimpleFlowableFluid> moltenNetherite   = FLUIDS.register("molten_netherite",    hotBuilder().temperature(1550), Material.LAVA, 14);
  public static final FluidObject<SimpleFlowableFluid> moltenKnightslime = FLUIDS.register("molten_knightslime",  hotBuilder().temperature(1425), Material.LAVA, 12);

  // compat ores
  public static final FluidObject<SimpleFlowableFluid> moltenTin      = FLUIDS.register("molten_tin",      hotBuilder().temperature( 525), Material.LAVA, 12);
  public static final FluidObject<SimpleFlowableFluid> moltenAluminum = FLUIDS.register("molten_aluminum", hotBuilder().temperature( 725), Material.LAVA, 12);
  public static final FluidObject<SimpleFlowableFluid> moltenLead     = FLUIDS.register("molten_lead",     hotBuilder().temperature( 630), Material.LAVA, 12);
  public static final FluidObject<SimpleFlowableFluid> moltenSilver   = FLUIDS.register("molten_silver",   hotBuilder().temperature(1090), Material.LAVA, 12);
  public static final FluidObject<SimpleFlowableFluid> moltenNickel   = FLUIDS.register("molten_nickel",   hotBuilder().temperature(1250), Material.LAVA, 12);
  public static final FluidObject<SimpleFlowableFluid> moltenZinc     = FLUIDS.register("molten_zinc",     hotBuilder().temperature( 720), Material.LAVA, 12);
  public static final FluidObject<SimpleFlowableFluid> moltenPlatinum = FLUIDS.register("molten_platinum", hotBuilder().temperature(1270), Material.LAVA, 12);
  public static final FluidObject<SimpleFlowableFluid> moltenTungsten = FLUIDS.register("molten_tungsten", hotBuilder().temperature(1250), Material.LAVA, 12);
  public static final FluidObject<SimpleFlowableFluid> moltenOsmium   = FLUIDS.register("molten_osmium",   hotBuilder().temperature(1275), Material.LAVA,  4);
  public static final FluidObject<SimpleFlowableFluid> moltenUranium  = FLUIDS.register("molten_uranium",  hotBuilder().temperature(1130), Material.LAVA, 15);

  // compat alloys
  public static final FluidObject<SimpleFlowableFluid> moltenBronze     = FLUIDS.register("molten_bronze",     hotBuilder().temperature(1000), Material.LAVA, 10);
  public static final FluidObject<SimpleFlowableFluid> moltenBrass      = FLUIDS.register("molten_brass",      hotBuilder().temperature( 905), Material.LAVA, 10);
  public static final FluidObject<SimpleFlowableFluid> moltenElectrum   = FLUIDS.register("molten_electrum",   hotBuilder().temperature(1060), Material.LAVA, 10);
  public static final FluidObject<SimpleFlowableFluid> moltenInvar      = FLUIDS.register("molten_invar",      hotBuilder().temperature(1200), Material.LAVA, 10);
  public static final FluidObject<SimpleFlowableFluid> moltenConstantan = FLUIDS.register("molten_constantan", hotBuilder().temperature(1220), Material.LAVA, 10);
  public static final FluidObject<SimpleFlowableFluid> moltenPewter     = FLUIDS.register("molten_pewter",     hotBuilder().temperature( 700), Material.LAVA, 10);
  public static final FluidObject<SimpleFlowableFluid> moltenSteel      = FLUIDS.register("molten_steel",      hotBuilder().temperature(1250), Material.LAVA, 13);

  // mod-specific compat alloys
  // thermal
  public static final FluidObject<SimpleFlowableFluid> moltenEnderium = FLUIDS.register("molten_enderium", hotBuilder().temperature(1650), Material.LAVA, 12);
  public static final FluidObject<SimpleFlowableFluid> moltenLumium   = FLUIDS.register("molten_lumium",   hotBuilder().temperature(1350), Material.LAVA, 15);
  public static final FluidObject<SimpleFlowableFluid> moltenSignalum = FLUIDS.register("molten_signalum", hotBuilder().temperature(1425), Material.LAVA, 13);
  // mekanism
  public static final FluidObject<SimpleFlowableFluid> moltenRefinedGlowstone = FLUIDS.register("molten_refined_glowstone", hotBuilder().temperature(1125), Material.LAVA, 15);
  public static final FluidObject<SimpleFlowableFluid> moltenRefinedObsidian  = FLUIDS.register("molten_refined_obsidian",  hotBuilder().temperature(1775), Material.LAVA,  7);


  /** Creates a builder for a cool fluid with textures */
  private static FluidAttributes.Builder coolBuilder() {
    return ModelFluidAttributes.builder().sound(SoundEvents.BUCKET_FILL, SoundEvents.BUCKET_EMPTY);
  }

  /** Creates a builder for a hot fluid */
  private static FluidAttributes.Builder hotBuilder() {
    return ModelFluidAttributes.builder().density(2000).viscosity(10000).temperature(1000).sound(SoundEvents.BUCKET_FILL_LAVA, SoundEvents.BUCKET_EMPTY_LAVA);
  }
}
