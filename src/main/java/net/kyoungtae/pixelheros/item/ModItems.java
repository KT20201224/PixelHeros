package net.kyoungtae.pixelheros.item;

import net.kyoungtae.pixelheros.PixelHeros;
import net.kyoungtae.pixelheros.item.custom.FuelItem;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, PixelHeros.MOD_ID);

    // 아이템 등록

    // 기타
    public static final RegistryObject<Item> TOPAZ = ITEMS.register("topaz",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_TOPAZ = ITEMS.register("raw_topaz",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RECALL_SCROLL = ITEMS.register("recall_scroll",
            () -> new Item(new Item.Properties()));

    // 방어구
    public static final RegistryObject<Item> TOPAZ_HELMET = ITEMS.register("topaz_helmet",
            () -> new ArmorItem(ModArmorMaterials.TOPAZ, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> TOPAZ_CHESTPLATE = ITEMS.register("topaz_chestplate",
            () -> new ArmorItem(ModArmorMaterials.TOPAZ, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> TOPAZ_LEGGINGS = ITEMS.register("topaz_leggings",
            () -> new ArmorItem(ModArmorMaterials.TOPAZ, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> TOPAZ_BOOTS = ITEMS.register("topaz_boots",
            () -> new ArmorItem(ModArmorMaterials.TOPAZ, ArmorItem.Type.BOOTS, new Item.Properties()));

    // 가연성 재료
    public static final RegistryObject<Item> PINE_CONE = ITEMS.register("pine_cone",
            () -> new FuelItem(new Item.Properties(), 400));

    // 음식
    public static final RegistryObject<Item> STRAWBERRY = ITEMS.register("strawberry",
            () -> new Item(new Item.Properties().food(ModFoods.STRAWBERRY)));





    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
