package samebutdifferent.ecologics.registry;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import samebutdifferent.ecologics.Ecologics;
import samebutdifferent.ecologics.block.entity.ModSignBlockEntity;
import samebutdifferent.ecologics.block.entity.PotBlockEntity;

public class ModBlockEntityTypes {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY_TYPES = DeferredRegister.create(Ecologics.MOD_ID, Registry.BLOCK_ENTITY_TYPE_KEY);

    public static final RegistrySupplier<BlockEntityType<ModSignBlockEntity>> SIGN = BLOCK_ENTITY_TYPES.register("sign", () -> BlockEntityType.Builder.create(ModSignBlockEntity::new,
            ModBlocks.COCONUT_SIGN.get(), ModBlocks.COCONUT_WALL_SIGN.get(),
            ModBlocks.WALNUT_SIGN.get(), ModBlocks.WALNUT_WALL_SIGN.get(),
            ModBlocks.AZALEA_SIGN.get(), ModBlocks.AZALEA_WALL_SIGN.get(),
            ModBlocks.FLOWERING_AZALEA_SIGN.get(), ModBlocks.FLOWERING_AZALEA_WALL_SIGN.get()
    ).build(null));
    public static final RegistrySupplier<BlockEntityType<PotBlockEntity>> POT = BLOCK_ENTITY_TYPES.register("pot", () -> BlockEntityType.Builder.create(PotBlockEntity::new, ModBlocks.POT.get()).build(null));
}
