package net.kyoungtae.pixelheros.item;

import net.kyoungtae.pixelheros.PixelHeros;
import net.kyoungtae.pixelheros.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PixelHeros.MOD_ID);

    public static final RegistryObject<CreativeModeTab> CUSTOM_TAB = CREATIVE_MODE_TABS.register("custom_tab",
            ()->CreativeModeTab.builder().icon(()->new ItemStack(ModItems.TOPAZ.get()))
                    .title(Component.translatable("creativetab.custom_tab"))
                    .displayItems((pParamters, pOutput) -> {
                        pOutput.accept(ModItems.TOPAZ.get());
                        pOutput.accept(ModItems.RAW_TOPAZ.get());
                        pOutput.accept(ModBlocks.TOPAZ_BLOCK.get());
                        pOutput.accept(ModBlocks.TOPAZ_ORE.get());

                        pOutput.accept(ModItems.STRAWBERRY.get());

                        pOutput.accept(ModItems.METAL_DETECTOR.get());
                        pOutput.accept(ModItems.RECALL_SCROLL.get());

                        pOutput.accept(ModItems.PINE_CONE.get());

                        pOutput.accept(ModItems.TOPAZ_HELMET.get());
                        pOutput.accept(ModItems.TOPAZ_CHESTPLATE.get());
                        pOutput.accept(ModItems.TOPAZ_LEGGINGS.get());
                        pOutput.accept(ModItems.TOPAZ_BOOTS.get());
                    })
                    .build()
    );

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
