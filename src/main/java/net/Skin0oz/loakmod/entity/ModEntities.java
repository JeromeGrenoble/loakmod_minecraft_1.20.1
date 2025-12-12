package net.Skin0oz.loakmod.entity;

import net.Skin0oz.loakmod.LOAKMod;
import net.Skin0oz.loakmod.entity.custom.RamEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPE =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, LOAKMod.MOD_ID);

    public static final RegistryObject<EntityType<RamEntity>> RAM =
            ENTITY_TYPE.register("ram", () -> EntityType.Builder.of(RamEntity::new,MobCategory.CREATURE)
                    .sized(1f,1f).build("ram"));

    public static void register(IEventBus eventBus){
        ENTITY_TYPE.register(eventBus);
    }

}
