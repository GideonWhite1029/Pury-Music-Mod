
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.purymusic.init;

import net.purymusic.PuryMusicMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

public class PuryMusicModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, PuryMusicMod.MODID);
	public static final RegistryObject<SoundEvent> AURORA = REGISTRY.register("aurora",
			() -> new SoundEvent(new ResourceLocation("pury_music", "aurora")));
	public static final RegistryObject<SoundEvent> NIGHTWING = REGISTRY.register("nightwing",
			() -> new SoundEvent(new ResourceLocation("pury_music", "nightwing")));
	public static final RegistryObject<SoundEvent> BE_A = REGISTRY.register("be_a", () -> new SoundEvent(new ResourceLocation("pury_music", "be_a")));
	public static final RegistryObject<SoundEvent> QWQ = REGISTRY.register("qwq", () -> new SoundEvent(new ResourceLocation("pury_music", "qwq")));
	public static final RegistryObject<SoundEvent> VIRTUAL_WORLD = REGISTRY.register("virtual_world",
			() -> new SoundEvent(new ResourceLocation("pury_music", "virtual_world")));
	public static final RegistryObject<SoundEvent> SHAPE_OF_VOICE = REGISTRY.register("shape_of_voice",
			() -> new SoundEvent(new ResourceLocation("pury_music", "shape_of_voice")));
	public static final RegistryObject<SoundEvent> TAKEDA = REGISTRY.register("takeda",
			() -> new SoundEvent(new ResourceLocation("pury_music", "takeda")));
	public static final RegistryObject<SoundEvent> SKINNY_LIFE = REGISTRY.register("skinny_life",
			() -> new SoundEvent(new ResourceLocation("pury_music", "skinny_life")));
	public static final RegistryObject<SoundEvent> FEAR = REGISTRY.register("fear", () -> new SoundEvent(new ResourceLocation("pury_music", "fear")));
	public static final RegistryObject<SoundEvent> BREATH_OF_FIRE = REGISTRY.register("breath_of_fire",
			() -> new SoundEvent(new ResourceLocation("pury_music", "breath_of_fire")));
	public static final RegistryObject<SoundEvent> MY_FAVORITE_NAME = REGISTRY.register("my_favorite_name",
			() -> new SoundEvent(new ResourceLocation("pury_music", "my_favorite_name")));
	public static final RegistryObject<SoundEvent> HELLSING = REGISTRY.register("hellsing",
			() -> new SoundEvent(new ResourceLocation("pury_music", "hellsing")));
	public static final RegistryObject<SoundEvent> BORN_TO_FLY = REGISTRY.register("born_to_fly",
			() -> new SoundEvent(new ResourceLocation("pury_music", "born_to_fly")));
	public static final RegistryObject<SoundEvent> WOWUTUVEBAANG = REGISTRY.register("wowutuvebaang",
			() -> new SoundEvent(new ResourceLocation("pury_music", "wowutuvebaang")));
	public static final RegistryObject<SoundEvent> UGLY = REGISTRY.register("ugly", () -> new SoundEvent(new ResourceLocation("pury_music", "ugly")));
}
