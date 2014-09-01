package io.github.radioactivated.essenceofalchemy;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import io.github.radioactivated.essenceofalchemy.handler.ConfigurationHandler;
import io.github.radioactivated.essenceofalchemy.init.ModItems;
import io.github.radioactivated.essenceofalchemy.init.ModRecipes;
import io.github.radioactivated.essenceofalchemy.proxy.IProxy;
import io.github.radioactivated.essenceofalchemy.reference.Reference;
import io.github.radioactivated.essenceofalchemy.util.LogHelper;

@Mod(modid=Reference.MODID,name=Reference.MODNAME,version=Reference.VERSION)
public class EssenceOfAlchemy
{

    @Mod.Instance(Reference.MODID)
    public static EssenceOfAlchemy instance;

    @SidedProxy(clientSide=Reference.CLIENTPROXY,serverSide=Reference.SERVERPROXY)
    public static IProxy proxy;

    @Mod.EventHandler
    public static void preInit(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
        ModItems.init();
    }

    @Mod.EventHandler
    public static void init(FMLInitializationEvent event)
    {
        ModRecipes.init();
    }

    @Mod.EventHandler
    public static void postInit(FMLPostInitializationEvent event)
    {
        LogHelper.info("Yay!");
    }
}
