package net.bundy.jsmp.item;

import net.bundy.jsmp.JSmp;
import net.bundy.jsmp.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, JSmp.MOD_ID);

    public static final Supplier<CreativeModeTab> BISMUTH_ITEMS_TAB = CREATIVE_MODE_TAB.register("janskii_smp_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.CHROMATSIUM.get()))
                    .title(Component.translatable("creativetab.janskiismp.janskiismp"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.WOOD_SHEET);
                        output.accept(ModItems.WOODEN_COGWHEEL);
                        output.accept(ModItems.WOODEN_TOOL);
                        output.accept(ModItems.LEAF_WIRE);

                        output.accept(ModItems.CHROMATSIUM);
                        output.accept(ModItems.CHROMATSIUM_COGWHEEL);
                        output.accept(ModItems.CHROMATSIUM_TOOL);
                        output.accept(ModItems.CHROMATSIUM_WIRE);
                        output.accept(ModBlocks.CHROMATSIUM_BLOCK);
                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}