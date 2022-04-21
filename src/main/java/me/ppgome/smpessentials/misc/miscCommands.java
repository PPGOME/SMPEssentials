package me.ppgome.smpessentials.misc;

import github.scarsz.discordsrv.DiscordSRV;
import github.scarsz.discordsrv.dependencies.jda.api.entities.TextChannel;
import me.ppgome.smpessentials.SMPEssentials;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class miscCommands implements CommandExecutor {

    Map<String, Long> cooldowns = new HashMap<String, Long>();


    // PENIS COMMAND --I AM SO SORRY TO WHOEVER READS THIS--
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (command.getName().equalsIgnoreCase("penis")) {
            if (SMPEssentials.getPlugin().getConfig().getBoolean("penis")) {
                Player p = (Player) sender;
                Random rand = new Random();
                int size = rand.nextInt(13);
                if (cooldowns.containsKey(p.getName())) {
                    //Player is inside hashmap
                    if (cooldowns.get(p.getName()) > System.currentTimeMillis()) {
                        //They still have time left in the cooldown
                        long timeleft = (cooldowns.get(p.getName()) - System.currentTimeMillis()) / 1000;
                        p.sendMessage(ChatColor.translateAlternateColorCodes('&',
                                SMPEssentials.getPlugin().getConfig().getString("Prefix")
                                        + ChatColor.RED + " Command ready in " + timeleft / 60 + " minutes and " +
                                        timeleft % 60 + " seconds!"));
                        return true;
                    } else {
                        for (int length = 0; length <= size; length++) {
                            String result = new String(new char[length]).replace("\0", "=");
                            if (length == size) {
                                for (Player player : Bukkit.getOnlinePlayers()) {
                                    player.sendMessage(ChatColor.translateAlternateColorCodes('&',
                                            SMPEssentials.getPlugin().getConfig().getString("Prefix")
                                                    + " " + ChatColor.RED + p.getName() + "'s PP: 8" + result + "D"));
                                }
                                if (SMPEssentials.getPlugin().getServer().getPluginManager().getPlugin("DiscordSRV") != null) {
                                    TextChannel textChannel = DiscordSRV.getPlugin().getDestinationTextChannelForGameChannelName("global");

                                    // null if the channel isn't specified in the config.yml
                                    if (textChannel != null) {
                                        textChannel.sendMessage(":straight_ruler: " + p.getName() + "'s PP: 8" + result + "D").queue();
                                    }
                                }
                            }
                        }
                        for (Player player : Bukkit.getOnlinePlayers()) {
                            cooldowns.put(p.getName(), System.currentTimeMillis() + (300 * 1000));
                        }
                    }
                } else {
                    cooldowns.put(p.getName(), System.currentTimeMillis() + (300 * 1000));
                    for (int length = 0; length <= size; length++) {
                        String result = new String(new char[length]).replace("\0", "=");
                        if (length == size) {
                            for (Player player : Bukkit.getOnlinePlayers()) {
                                player.sendMessage(ChatColor.translateAlternateColorCodes('&',
                                        SMPEssentials.getPlugin().getConfig().getString("Prefix")
                                                + " " + ChatColor.RED + p.getName() + "'s PP: 8" + result + "D"));
                            }
                            if (SMPEssentials.getPlugin().getServer().getPluginManager().getPlugin("DiscordSRV") != null) {
                                TextChannel textChannel = DiscordSRV.getPlugin().getDestinationTextChannelForGameChannelName("global");

                                // null if the channel isn't specified in the config.yml
                                if (textChannel != null) {
                                    textChannel.sendMessage(":straight_ruler: " + p.getName() + "'s PP: 8" + result + "D").queue();
                                }
                            }
                        }
                    }
                }
            }
            return true;
        }
        return true;
    }
}
