package net.opalviper.tutorialmod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.opalviper.tutorialmod.TutorialMod;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

   public  static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",
           () -> new Item(new Item.Properties()));
   public  static  final  RegistryObject<Item> RAW_SAPPHITE = ITEMS.register("raw_sapphire",
           ()-> new Item(new Item.Properties()));
   public static final  RegistryObject<Item> DARKALLOY = ITEMS.register("darkalloy",
           () -> new Item(new Item.Properties()));
   public static final RegistryObject<Item> METALS = ITEMS.register("metals",
           () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}


















