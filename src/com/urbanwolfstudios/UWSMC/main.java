package com.urbanwolfstudios.UWSMC;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

/**
 * Created by Adam on 1/20/2015.
 */
public class main extends JavaPlugin {

    public static final String Name = "UWS-MCPlugin";
    public static final String Version = "1.0";
    public static final String Website = "www.urbanwolfstudios.com";
    public static final String Author = "Adam Heiland";

    //Startup and Disable
    public void onEnable(){
        PluginDescriptionFile pdfFile = this.getDescription();
        this.getLogger().info(pdfFile.getName() +  "has been enabled");
        commands commandA= new commands();
            getCommand("uws").setExecutor(commandA);
    }

    public void onDisable(){
        PluginDescriptionFile pdfFile = this.getDescription();
        this.getLogger().info(pdfFile.getName() + "has been disabled");
    }

    //END
}
