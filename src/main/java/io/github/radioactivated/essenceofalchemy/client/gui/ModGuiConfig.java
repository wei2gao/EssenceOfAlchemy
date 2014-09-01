package io.github.radioactivated.essenceofalchemy.client.gui;

import cpw.mods.fml.client.config.GuiConfig;
import io.github.radioactivated.essenceofalchemy.handler.ConfigurationHandler;
import io.github.radioactivated.essenceofalchemy.reference.Reference;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;


public class ModGuiConfig extends GuiConfig {

    public ModGuiConfig(GuiScreen guiScreen){

        //I swear, this is like the most complicated piece of code in this whole tutorial so far
        super(guiScreen,
                new ConfigElement(ConfigurationHandler.config.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
                Reference.MODID,false,false,
                GuiConfig.getAbridgedConfigPath(ConfigurationHandler.config.toString()));
    }
}
