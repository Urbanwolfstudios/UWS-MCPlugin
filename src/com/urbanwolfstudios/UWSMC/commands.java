package com.urbanwolfstudios.UWSMC;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginDescriptionFile;

/**
 * Created by Adam on 1/20/2015.
 */
public class commands implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(label.equalsIgnoreCase("Version")){
            Player p = (Player) sender;
            p.sendMessage(ChatColor.RED + main.Name + ", V:"+ main.Version + ", By:" + main.Author + ", Website:" + main.Website);

        }


        return true;
    }
}
