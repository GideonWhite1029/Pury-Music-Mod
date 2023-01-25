
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.purymusic.init;

import net.purymusic.world.features.PurytableFeature;
import net.purymusic.PuryMusicMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

@Mod.EventBusSubscriber
public class PuryMusicModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, PuryMusicMod.MODID);
	public static final RegistryObject<Feature<?>> PURYTABLE = REGISTRY.register("purytable", PurytableFeature::feature);
}
