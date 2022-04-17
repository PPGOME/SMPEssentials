package me.ppgome.smpessentials.development;

import me.ppgome.smpessentials.SMPEssentials;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

import static me.ppgome.smpessentials.SMPEssentials.getPlugin;

public class devCommands implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (command.getName().equalsIgnoreCase("smpessentials")) {
            if (!sender.hasPermission("smpessentials.reload")) {
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&',
                        getPlugin().getConfig().getString("Prefix") + " " +
                                ChatColor.RED + "You cannot run this command.") );
                return true;
            }
            if(args.length == 0) {
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&',
                        getPlugin().getConfig().getString("Prefix") + " " +
                                ChatColor.RED + "Usage: /smpessentials reload") );
                return true;
            }
            if (args.length > 0) {
                if(args[0].equalsIgnoreCase("reload")) {
                    if(getPlugin().getConfig().getString("SMPEssentials.ReloadMessage") != null){

                        //Get the config's custom messages
                        String message = getPlugin().getConfig().getString("Prefix") + " " +
                                getPlugin().getConfig().getString("SMPEssentials.ReloadMessage");

                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', message));
                        getPlugin().reloadConfig();

                    } else {
                        sender.sendMessage("The config file is broken, so the plugin has not been reloaded.");
                    }
                }
            }
        }
        return false;
    }
}
