package samebutdifferent.ecologics.registry;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.item.*;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.food.Foods;
import net.minecraft.world.item.*;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import samebutdifferent.ecologics.Ecologics;
import samebutdifferent.ecologics.item.CoconutSliceItem;
import samebutdifferent.ecologics.item.ModBoatItem;
import samebutdifferent.ecologics.item.PricklyPearItem;
import samebutdifferent.ecologics.item.SandcastleBlockItem;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(Ecologics.MOD_ID, Registry.ITEM_KEY);

    public static final RegistrySupplier<Item> COCONUT_SLICE = ITEMS.register("coconut_slice", () -> new CoconutSliceItem(new Item.Settings().group(Ecologics.TAB).food(Foods.SWEET_BERRIES)));
    public static final RegistrySupplier<Item> CRAB_CLAW = ITEMS.register("crab_claw", () -> new ShearsItem(new Item.Settings().group(Ecologics.TAB).durability(50)));
    public static final RegistrySupplier<Item> CRAB_MEAT = ITEMS.register("crab_meat", () -> new Item(new Item.Settings().group(Ecologics.TAB).food(Foods.COOKED_RABBIT)));
    public static final RegistrySupplier<Item> TROPICAL_STEW = ITEMS.register("tropical_stew", () -> new CoconutSliceItem(new Item.Properties().stacksTo(1).tab(Ecologics.TAB).food(Foods.RABBIT_STEW)));
    public static final RegistrySupplier<Item> COCONUT_CRAB_SPAWN_EGG = ITEMS.register("coconut_crab_spawn_egg", () -> new SpawnEggItem(() -> ModEntityTypes.COCONUT_CRAB.get(), 15686450, 5845811, new Item.Settings().group(Ecologics.TAB)));
    public static final RegistrySupplier<Item> CAMEL_SPAWN_EGG = ITEMS.register("camel_spawn_egg", () -> new SpawnEggItem(() -> ModEntityTypes.CAMEL.get(), 15714446, 5321501, new Item.Settings().group(Ecologics.TAB)));
    public static final RegistrySupplier<Item> PENGUIN_SPAWN_EGG = ITEMS.register("penguin_spawn_egg", () -> new SpawnEggItem(() -> ModEntityTypes.PENGUIN.get(), 1315860, 16382457, new Item.Settings().group(Ecologics.TAB)));
    public static final RegistrySupplier<Item> SQUIRREL_SPAWN_EGG = ITEMS.register("squirrel_spawn_egg", () -> new SpawnEggItem(() -> ModEntityTypes.SQUIRREL.get(), 10051392, 15720061, new Item.Settings().group(Ecologics.TAB)));
    public static final RegistrySupplier<Item> SANDCASTLE = ITEMS.register("sandcastle", SandcastleBlockItem::new);
    public static final RegistrySupplier<Item> MUSIC_DISC_COCONUT = ITEMS.register("music_disc_coconut", () -> new MusicDiscItem(10, () -> ModSoundEvents.MUSIC_DISC_COCONUT.get(), new Item.Properties().stacksTo(1).tab(Ecologics.TAB).rarity(Rarity.RARE)));
    public static final RegistrySupplier<Item> COCONUT_SIGN = ITEMS.register("coconut_sign", () -> new SignItem(new Item.Settings().maxCount(16).group(Ecologics.TAB), ModBlocks.COCONUT_SIGN.get(), ModBlocks.COCONUT_WALL_SIGN.get()));
    public static final RegistrySupplier<Item> COCONUT_BOAT = ITEMS.register("coconut_boat", () -> new ModBoatItem("coconut", new Item.Settings().maxCount(1).tab(Ecologics.TAB)));
    public static final RegistrySupplier<Item> PRICKLY_PEAR = ITEMS.register("prickly_pear", PricklyPearItem::new);
    public static final RegistrySupplier<Item> COOKED_PRICKLY_PEAR = ITEMS.register("cooked_prickly_pear", () -> new Item(new Item.Settings().group(Ecologics.TAB).food(Foods.APPLE)));
    public static final RegistrySupplier<Item> PENGUIN_FEATHER = ITEMS.register("penguin_feather", () -> new Item(new Item.Settings().group(Ecologics.TAB)));
    public static final RegistrySupplier<Item> WALNUT_SIGN = ITEMS.register("walnut_sign", () -> new SignItem(new Item.Settings().maxCount(16).tab(Ecologics.TAB), ModBlocks.WALNUT_SIGN.get(), ModBlocks.WALNUT_WALL_SIGN.get()));
    public static final RegistrySupplier<Item> WALNUT_BOAT = ITEMS.register("walnut_boat", () -> new ModBoatItem("walnut", new Item.Settings().maxCount(1).tab(Ecologics.TAB)));
    public static final RegistrySupplier<Item> WALNUT = ITEMS.register("walnut", () -> new Item(new Item.Settings().group(Ecologics.TAB).food(new FoodProperties.Builder().nutrition(3).saturationMod(0.6F).fast().build())));
    public static final RegistrySupplier<SignItem> AZALEA_SIGN = ITEMS.register("azalea_sign", () -> new SignItem(new Item.Settings().maxCount(16).tab(Ecologics.TAB), ModBlocks.AZALEA_SIGN.get(), ModBlocks.AZALEA_WALL_SIGN.get()));
    public static final RegistrySupplier<SignItem> FLOWERING_AZALEA_SIGN = ITEMS.register("flowering_azalea_sign", () -> new SignItem(new Item.Settings().maxCount(16).tab(Ecologics.TAB), ModBlocks.FLOWERING_AZALEA_SIGN.get(), ModBlocks.FLOWERING_AZALEA_WALL_SIGN.get()));
    public static final RegistrySupplier<Item> AZALEA_BOAT = ITEMS.register("azalea_boat", () -> new ModBoatItem("azalea", new Item.Settings().maxCount(1).tab(Ecologics.TAB)));
    public static final RegistrySupplier<Item> FLOWERING_AZALEA_BOAT = ITEMS.register("flowering_azalea_boat", () -> new ModBoatItem("flowering_azalea", new Item.Settings().stacksTo(1).tab(Ecologics.TAB)));
}
