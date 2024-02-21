package net.kyoungtae.pixelheros.datagen;

import net.kyoungtae.pixelheros.PixelHeros;
import net.kyoungtae.pixelheros.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput p_275343_, CompletableFuture<HolderLookup.Provider> p_275729_,
                               CompletableFuture<TagLookup<Block>> p_275322, @Nullable ExistingFileHelper existingFileHelper){
        super(p_275343_, p_275729_, p_275322, PixelHeros.MOD_ID, existingFileHelper);
    }
    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.TOPAZ_HELMET.get(),
                        ModItems.TOPAZ_CHESTPLATE.get(),
                        ModItems.TOPAZ_LEGGINGS.get(),
                        ModItems.TOPAZ_BOOTS.get());
    }
}
