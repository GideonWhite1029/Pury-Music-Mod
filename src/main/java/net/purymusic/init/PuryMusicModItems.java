
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.purymusic.init;

import net.purymusic.item.Za4arHellsingItem;
import net.purymusic.item.YPIEQwQItem;
import net.purymusic.item.VirtualWorldItem;
import net.purymusic.item.VeberwowutuvebaangItem;
import net.purymusic.item.VeberFearItem;
import net.purymusic.item.VeberBeaItem;
import net.purymusic.item.SwergsBornToFlyItem;
import net.purymusic.item.ShapeOfVoiceItem;
import net.purymusic.item.SeimoroTakedaItem;
import net.purymusic.item.RXLZQUGLYItem;
import net.purymusic.item.RXLZQMyfavoritenameItem;
import net.purymusic.item.RXLZQBreathOfFireItem;
import net.purymusic.item.MxnarchNightwingItem;
import net.purymusic.item.MVTRIIIXSkinnyLifeItem;
import net.purymusic.item.MVTRIIIXAuroraItem;
import net.purymusic.PuryMusicMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

public class PuryMusicModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, PuryMusicMod.MODID);
	public static final RegistryObject<Item> MVTRIIIX_AURORA = REGISTRY.register("mvtriiix_aurora", () -> new MVTRIIIXAuroraItem());
	public static final RegistryObject<Item> MXNARCH_NIGHTWING = REGISTRY.register("mxnarch_nightwing", () -> new MxnarchNightwingItem());
	public static final RegistryObject<Item> VEBER_BEA = REGISTRY.register("veber_bea", () -> new VeberBeaItem());
	public static final RegistryObject<Item> RXLZQUGLY = REGISTRY.register("rxlzqugly", () -> new RXLZQUGLYItem());
	public static final RegistryObject<Item> SEIMORO_TAKEDA = REGISTRY.register("seimoro_takeda", () -> new SeimoroTakedaItem());
	public static final RegistryObject<Item> VEBERWOWUTUVEBAANG = REGISTRY.register("veberwowutuvebaang", () -> new VeberwowutuvebaangItem());
	public static final RegistryObject<Item> YPIE_QW_Q = REGISTRY.register("ypie_qw_q", () -> new YPIEQwQItem());
	public static final RegistryObject<Item> VIRTUAL_WORLD = REGISTRY.register("virtual_world", () -> new VirtualWorldItem());
	public static final RegistryObject<Item> SHAPE_OF_VOICE = REGISTRY.register("shape_of_voice", () -> new ShapeOfVoiceItem());
	public static final RegistryObject<Item> SWERGS_BORN_TO_FLY = REGISTRY.register("swergs_born_to_fly", () -> new SwergsBornToFlyItem());
	public static final RegistryObject<Item> MVTRIIIX_SKINNY_LIFE = REGISTRY.register("mvtriiix_skinny_life", () -> new MVTRIIIXSkinnyLifeItem());
	public static final RegistryObject<Item> VEBER_FEAR = REGISTRY.register("veber_fear", () -> new VeberFearItem());
	public static final RegistryObject<Item> RXLZQ_BREATH_OF_FIRE = REGISTRY.register("rxlzq_breath_of_fire", () -> new RXLZQBreathOfFireItem());
	public static final RegistryObject<Item> RXLZQ_MYFAVORITENAME = REGISTRY.register("rxlzq_myfavoritename", () -> new RXLZQMyfavoritenameItem());
	public static final RegistryObject<Item> ZA_4AR_HELLSING = REGISTRY.register("za_4ar_hellsing", () -> new Za4arHellsingItem());
}
