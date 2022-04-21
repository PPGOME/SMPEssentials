package me.ppgome.smpessentials;

import me.ppgome.smpessentials.funkyItems.beeBoots.BeeBoots;
import me.ppgome.smpessentials.home.warpHomeItem;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import static me.ppgome.smpessentials.SMPEssentials.getPlugin;

public class ItemCommands implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (command.getName().equalsIgnoreCase("smpessentialsgive")) {
            Player player = (Player) sender;
            if (!sender.hasPermission("smpessentials.give")) {
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&',
                        getPlugin().getConfig().getString("Prefix") + " " +
                                ChatColor.RED + "You cannot run this command."));
                return true;
            }
            if (args.length == 0) {
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&',
                        getPlugin().getConfig().getString("Prefix") + " " +
                                ChatColor.RED + "Usage: /smpessentials [arg1]"));
                return true;
            }
            if (args.length > 0) {
                if (args[0].equalsIgnoreCase("warpshard")) {
                    if (getPlugin().getConfig().getString("Home.WarpShardName") != null) {
                        player.getInventory().addItem(warpHomeItem.getWarpShard());
                    } else {
                        sender.sendMessage("The config file is broken, so the plugin has not been reloaded.");
                    }
                    if (getPlugin().getConfig().getString("BeeBoots.BeeBootsName") != null) {
                        player.getInventory().addItem(BeeBoots.getBeeBoots());
                    } else {
                        sender.sendMessage("The config file is broken, so the plugin has not been reloaded.");
                    }
                }
            }
        } return false;
    }
}
