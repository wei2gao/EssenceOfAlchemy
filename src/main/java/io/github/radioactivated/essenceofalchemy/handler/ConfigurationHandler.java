package io.github.radioactivated.essenceofalchemy.handler;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import io.github.radioactivated.essenceofalchemy.reference.Reference;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler {

    public static Configuration config;
    public static boolean configValue = false;
    public static int anotherValue = 0;
    public static String AlsoAValue = "";

    public static void init(File cfgFile){


        if(config == null){
            config = new Configuration(cfgFile);
            loadConfig();
        }

        //System.out.println(configValue);
        //System.out.println(anotherValue);
        //Reference.anotherValue = anotherValue;
        //Reference.configValue = configValue;
    }

    @SubscribeEvent
    public void onConfigChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event){
        if(event.modID.equalsIgnoreCase(Reference.MODID)){
            //resync configs (reread config)
            loadConfig();
        }
    }

    private static void loadConfig() {
        configValue = config.getBoolean("configValue",Configuration.CATEGORY_GENERAL,true,"this is a config value");
        AlsoAValue = config.getString("alsoAValue",Configuration.CATEGORY_GENERAL,"","Another value");
        anotherValue = config.getInt("anotherValue",Configuration.CATEGORY_GENERAL,0,0,64,"this is another config value");
        Reference.configValue = configValue;
        Reference.anotherValue = anotherValue;
        Reference.AlsoAValue = AlsoAValue;
        if(config.hasChanged()){
            config.save();
        }

    }
}