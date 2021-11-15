package net.purple_shadow.strangemod.fluid;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.block.material.Material;
import net.minecraft.fluid.FlowingFluid;
import net.minecraft.fluid.Fluid;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidAttributes;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.purple_shadow.strangemod.StrangeMod;
import net.purple_shadow.strangemod.block.ModBlocks;

public class ModFluids {
    public static final ResourceLocation WATER_STILL_RL = new ResourceLocation("block/water_still");
    public static final ResourceLocation WATER_FLOWING_RL = new ResourceLocation("block/water_flow");
    public static final ResourceLocation WATER_OVERLAY_RL = new ResourceLocation("block/water_overlay");

    public static final DeferredRegister<Fluid> FLUIDS
            = DeferredRegister.create(ForgeRegistries.FLUIDS, StrangeMod.MOD_ID);

    // H

    public static final RegistryObject<FlowingFluid> H_FLUID
            = FLUIDS.register("h_fluid", () -> new ForgeFlowingFluid.Source(ModFluids.H_PROPERTIES));
    public static final RegistryObject<FlowingFluid> H_FLOWING
            = FLUIDS.register("h_flowing", () -> new ForgeFlowingFluid.Flowing(ModFluids.H_PROPERTIES));
    public static final ForgeFlowingFluid.Properties H_PROPERTIES = new ForgeFlowingFluid.Properties(
            () -> H_FLUID.get(), () -> H_FLOWING.get(), FluidAttributes.builder(WATER_STILL_RL, WATER_FLOWING_RL)
            .luminosity(2).color(0xbfe70fff)).block(() -> ModFluids.H_BLOCK.get());
    public static final RegistryObject<FlowingFluidBlock> H_BLOCK = ModBlocks.BLOCKS.register("h",
            () -> new FlowingFluidBlock(() -> ModFluids.H_FLUID.get(), AbstractBlock.Properties.of(Material.WATER)));

    // O

    public static final RegistryObject<FlowingFluid> O_FLUID
            = FLUIDS.register("o_fluid", () -> new ForgeFlowingFluid.Source(ModFluids.O_PROPERTIES));
    public static final RegistryObject<FlowingFluid> O_FLOWING
            = FLUIDS.register("o_flowing", () -> new ForgeFlowingFluid.Flowing(ModFluids.O_PROPERTIES));
    public static final ForgeFlowingFluid.Properties O_PROPERTIES = new ForgeFlowingFluid.Properties(
            () -> O_FLUID.get(), () -> O_FLOWING.get(), FluidAttributes.builder(WATER_STILL_RL, WATER_FLOWING_RL)
            .luminosity(2).color(0xbfe70fff)).block(() -> ModFluids.O_BLOCK.get());
    public static final RegistryObject<FlowingFluidBlock> O_BLOCK = ModBlocks.BLOCKS.register("o",
            () -> new FlowingFluidBlock(() -> ModFluids.O_FLUID.get(), AbstractBlock.Properties.of(Material.WATER)));

    // C

    public static final RegistryObject<FlowingFluid> C_FLUID
            = FLUIDS.register("c_fluid", () -> new ForgeFlowingFluid.Source(ModFluids.C_PROPERTIES));
    public static final RegistryObject<FlowingFluid> C_FLOWING
            = FLUIDS.register("c_flowing", () -> new ForgeFlowingFluid.Flowing(ModFluids.C_PROPERTIES));
    public static final ForgeFlowingFluid.Properties C_PROPERTIES = new ForgeFlowingFluid.Properties(
            () -> C_FLUID.get(), () -> C_FLOWING.get(), FluidAttributes.builder(WATER_STILL_RL, WATER_FLOWING_RL)
            .luminosity(2).color(0xbfe70fff)).block(() -> ModFluids.O_BLOCK.get());
    public static final RegistryObject<FlowingFluidBlock> C_BLOCK = ModBlocks.BLOCKS.register("c",
            () -> new FlowingFluidBlock(() -> ModFluids.C_FLUID.get(), AbstractBlock.Properties.of(Material.WATER)));



    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }
}