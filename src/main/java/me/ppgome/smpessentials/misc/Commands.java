package me.ppgome.smpessentials.misc;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Commands extends JavaPlugin implements CommandExecutor {

    Map<String, Long> cooldowns = new HashMap<String, Long>();


    // PENIS COMMAND --I AM SO SORRY TO WHOEVER READS THIS--
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (command.getName().equalsIgnoreCase("penis")) {
            if (getConfig().getBoolean("penis")) {
                Player p = (Player) sender;
                Random rand = new Random();
                int size = rand.nextInt(13);
                if (cooldowns.containsKey(p.getName())) {
                    //Player is inside hashmap
                    if (cooldowns.get(p.getName()) > System.currentTimeMillis()) {
                        //They still have time left in the cooldown
                        long timeleft = (cooldowns.get(p.getName()) - System.currentTimeMillis()) / 1000;
                        p.sendMessage(ChatColor.GRAY + "[" + ChatColor.RED + "SMP" + ChatColor.GRAY + "] " +
                                ChatColor.RED + "Command ready in " + timeleft / 60 + " minutes and " + timeleft % 60 +
                                " seconds!");
                        return true;

                    } else {
                        for (Player player : Bukkit.getOnlinePlayers()) {
                            if (size == 0) {
                                player.sendMessage(ChatColor.GRAY + "[" + ChatColor.RED + "SMP" + ChatColor.GRAY + "] " +
                                        ChatColor.RED + p.getName() + "'s PP: 8D");
                                System.out.println(ChatColor.GRAY + "[" + ChatColor.RED + "SMP" + ChatColor.GRAY + "] " +
                                        ChatColor.RED + p.getName() + "'s PP: 8D");
                            }
                            if (size == 1) {
                                player.sendMessage(ChatColor.GRAY + "[" + ChatColor.RED + "SMP" + ChatColor.GRAY + "] " +
                                        ChatColor.RED + p.getName() + "'s PP: 8=D");
                                System.out.println(ChatColor.GRAY + "[" + ChatColor.RED + "SMP" + ChatColor.GRAY + "] " +
                                        ChatColor.RED + p.getName() + "'s PP: 8=D");
                            }
                            if (size == 2) {
                                player.sendMessage(ChatColor.GRAY + "[" + ChatColor.RED + "SMP" + ChatColor.GRAY + "] " +
                                        ChatColor.RED + p.getName() + "'s PP: 8==D");
                                System.out.println(ChatColor.GRAY + "[" + ChatColor.RED + "SMP" + ChatColor.GRAY + "] " +
                                        ChatColor.RED + p.getName() + "'s PP: 8==D");
                            }
                            if (size == 3) {
                                player.sendMessage(ChatColor.GRAY + "[" + ChatColor.RED + "SMP" + ChatColor.GRAY + "] " +
                                        ChatColor.RED + p.getName() + "'s PP: 8===D");
                                System.out.println(ChatColor.GRAY + "[" + ChatColor.RED + "SMP" + ChatColor.GRAY + "] " +
                                        ChatColor.RED + p.getName() + "'s PP: 8===D");
                            }
                            if (size == 4) {
                                player.sendMessage(ChatColor.GRAY + "[" + ChatColor.RED + "SMP" + ChatColor.GRAY + "] " +
                                        ChatColor.RED + p.getName() + "'s PP: 8====D");
                                System.out.println(ChatColor.GRAY + "[" + ChatColor.RED + "SMP" + ChatColor.GRAY + "] " +
                                        ChatColor.RED + p.getName() + "'s PP: 8====D");
                            }
                            if (size == 5) {
                                player.sendMessage(ChatColor.GRAY + "[" + ChatColor.RED + "SMP" + ChatColor.GRAY + "] " +
                                        ChatColor.RED + p.getName() + "'s PP: 8=====D");
                                System.out.println(ChatColor.GRAY + "[" + ChatColor.RED + "SMP" + ChatColor.GRAY + "] " +
                                        ChatColor.RED + p.getName() + "'s PP: 8=====D");
                            }
                            if (size == 6) {
                                player.sendMessage(ChatColor.GRAY + "[" + ChatColor.RED + "SMP" + ChatColor.GRAY + "] " +
                                        ChatColor.RED + p.getName() + "'s PP: 8======D");
                                System.out.println(ChatColor.GRAY + "[" + ChatColor.RED + "SMP" + ChatColor.GRAY + "] " +
                                        ChatColor.RED + p.getName() + "'s PP: 8======D");
                            }
                            if (size == 7) {
                                player.sendMessage(ChatColor.GRAY + "[" + ChatColor.RED + "SMP" + ChatColor.GRAY + "] " +
                                        ChatColor.RED + p.getName() + "'s PP: 8=======D");
                                System.out.println(ChatColor.GRAY + "[" + ChatColor.RED + "SMP" + ChatColor.GRAY + "] " +
                                        ChatColor.RED + p.getName() + "'s PP: 8=======D");
                            }
                            if (size == 8) {
                                player.sendMessage(ChatColor.GRAY + "[" + ChatColor.RED + "SMP" + ChatColor.GRAY + "] " +
                                        ChatColor.RED + p.getName() + "'s PP: 8========D");
                                System.out.println(ChatColor.GRAY + "[" + ChatColor.RED + "SMP" + ChatColor.GRAY + "] " +
                                        ChatColor.RED + p.getName() + "'s PP: 8========D");
                            }
                            if (size == 9) {
                                player.sendMessage(ChatColor.GRAY + "[" + ChatColor.RED + "SMP" + ChatColor.GRAY + "] " +
                                        ChatColor.RED + p.getName() + "'s PP: 8=========D");
                                System.out.println(ChatColor.GRAY + "[" + ChatColor.RED + "SMP" + ChatColor.GRAY + "] " +
                                        ChatColor.RED + p.getName() + "'s PP: 8=========D");
                            }
                            if (size == 10) {
                                player.sendMessage(ChatColor.GRAY + "[" + ChatColor.RED + "SMP" + ChatColor.GRAY + "] " +
                                        ChatColor.RED + p.getName() + "'s PP: 8==========D");
                                System.out.println(ChatColor.GRAY + "[" + ChatColor.RED + "SMP" + ChatColor.GRAY + "] " +
                                        ChatColor.RED + p.getName() + "'s PP: 8==========D");
                            }
                            if (size == 11) {
                                player.sendMessage(ChatColor.GRAY + "[" + ChatColor.RED + "SMP" + ChatColor.GRAY + "] " +
                                        ChatColor.RED + p.getName() + "'s PP: 8===========D");
                                System.out.println(ChatColor.GRAY + "[" + ChatColor.RED + "SMP" + ChatColor.GRAY + "] " +
                                        ChatColor.RED + p.getName() + "'s PP: 8===========D");
                            }
                            if (size == 12) {
                                player.sendMessage(ChatColor.GRAY + "[" + ChatColor.RED + "SMP" + ChatColor.GRAY + "] " +
                                        ChatColor.RED + p.getName() + "'s PP: 8============D");
                                System.out.println(ChatColor.GRAY + "[" + ChatColor.RED + "SMP" + ChatColor.GRAY + "] " +
                                        ChatColor.RED + p.getName() + "'s PP: 8============D");
                            }
                            cooldowns.put(p.getName(), System.currentTimeMillis() + (300 * 1000));
                        }
                    }
                } else {
                    cooldowns.put(p.getName(), System.currentTimeMillis() + (300 * 1000));
                    for (Player player : Bukkit.getOnlinePlayers()) {
                        if (size == 0) {
                            player.sendMessage(ChatColor.GRAY + "[" + ChatColor.RED + "SMP" + ChatColor.GRAY + "] " +
                                    ChatColor.RED + p.getName() + "'s PP: 8D");
                            System.out.println(ChatColor.GRAY + "[" + ChatColor.RED + "SMP" + ChatColor.GRAY + "] " +
                                    ChatColor.RED + p.getName() + "'s PP: 8D");
                        }
                        if (size == 1) {
                            player.sendMessage(ChatColor.GRAY + "[" + ChatColor.RED + "SMP" + ChatColor.GRAY + "] " +
                                    ChatColor.RED + p.getName() + "'s PP: 8=D");
                            System.out.println(ChatColor.GRAY + "[" + ChatColor.RED + "SMP" + ChatColor.GRAY + "] " +
                                    ChatColor.RED + p.getName() + "'s PP: 8=D");
                        }
                        if (size == 2) {
                            player.sendMessage(ChatColor.GRAY + "[" + ChatColor.RED + "SMP" + ChatColor.GRAY + "] " +
                                    ChatColor.RED + p.getName() + "'s PP: 8==D");
                            System.out.println(ChatColor.GRAY + "[" + ChatColor.RED + "SMP" + ChatColor.GRAY + "] " +
                                    ChatColor.RED + p.getName() + "'s PP: 8==D");
                        }
                        if (size == 3) {
                            player.sendMessage(ChatColor.GRAY + "[" + ChatColor.RED + "SMP" + ChatColor.GRAY + "] " +
                                    ChatColor.RED + p.getName() + "'s PP: 8===D");
                            System.out.println(ChatColor.GRAY + "[" + ChatColor.RED + "SMP" + ChatColor.GRAY + "] " +
                                    ChatColor.RED + p.getName() + "'s PP: 8===D");
                        }
                        if (size == 4) {
                            player.sendMessage(ChatColor.GRAY + "[" + ChatColor.RED + "SMP" + ChatColor.GRAY + "] " +
                                    ChatColor.RED + p.getName() + "'s PP: 8====D");
                            System.out.println(ChatColor.GRAY + "[" + ChatColor.RED + "SMP" + ChatColor.GRAY + "] " +
                                    ChatColor.RED + p.getName() + "'s PP: 8====D");
                        }
                        if (size == 5) {
                            player.sendMessage(ChatColor.GRAY + "[" + ChatColor.RED + "SMP" + ChatColor.GRAY + "] " +
                                    ChatColor.RED + p.getName() + "'s PP: 8=====D");
                            System.out.println(ChatColor.GRAY + "[" + ChatColor.RED + "SMP" + ChatColor.GRAY + "] " +
                                    ChatColor.RED + p.getName() + "'s PP: 8=====D");
                        }
                        if (size == 6) {
                            player.sendMessage(ChatColor.GRAY + "[" + ChatColor.RED + "SMP" + ChatColor.GRAY + "] " +
                                    ChatColor.RED + p.getName() + "'s PP: 8======D");
                            System.out.println(ChatColor.GRAY + "[" + ChatColor.RED + "SMP" + ChatColor.GRAY + "] " +
                                    ChatColor.RED + p.getName() + "'s PP: 8======D");
                        }
                        if (size == 7) {
                            player.sendMessage(ChatColor.GRAY + "[" + ChatColor.RED + "SMP" + ChatColor.GRAY + "] " +
                                    ChatColor.RED + p.getName() + "'s PP: 8=======D");
                            System.out.println(ChatColor.GRAY + "[" + ChatColor.RED + "SMP" + ChatColor.GRAY + "] " +
                                    ChatColor.RED + p.getName() + "'s PP: 8=======D");
                        }
                        if (size == 8) {
                            player.sendMessage(ChatColor.GRAY + "[" + ChatColor.RED + "SMP" + ChatColor.GRAY + "] " +
                                    ChatColor.RED + p.getName() + "'s PP: 8========D");
                            System.out.println(ChatColor.GRAY + "[" + ChatColor.RED + "SMP" + ChatColor.GRAY + "] " +
                                    ChatColor.RED + p.getName() + "'s PP: 8========D");
                        }
                        if (size == 9) {
                            player.sendMessage(ChatColor.GRAY + "[" + ChatColor.RED + "SMP" + ChatColor.GRAY + "] " +
                                    ChatColor.RED + p.getName() + "'s PP: 8=========D");
                            System.out.println(ChatColor.GRAY + "[" + ChatColor.RED + "SMP" + ChatColor.GRAY + "] " +
                                    ChatColor.RED + p.getName() + "'s PP: 8=========D");
                        }
                        if (size == 10) {
                            player.sendMessage(ChatColor.GRAY + "[" + ChatColor.RED + "SMP" + ChatColor.GRAY + "] " +
                                    ChatColor.RED + p.getName() + "'s PP: 8==========D");
                            System.out.println(ChatColor.GRAY + "[" + ChatColor.RED + "SMP" + ChatColor.GRAY + "] " +
                                    ChatColor.RED + p.getName() + "'s PP: 8==========D");
                        }
                        if (size == 11) {
                            player.sendMessage(ChatColor.GRAY + "[" + ChatColor.RED + "SMP" + ChatColor.GRAY + "] " +
                                    ChatColor.RED + p.getName() + "'s PP: 8===========D");
                            System.out.println(ChatColor.GRAY + "[" + ChatColor.RED + "SMP" + ChatColor.GRAY + "] " +
                                    ChatColor.RED + p.getName() + "'s PP: 8===========D");
                        }
                        if (size == 12) {
                            player.sendMessage(ChatColor.GRAY + "[" + ChatColor.RED + "SMP" + ChatColor.GRAY + "] " +
                                    ChatColor.RED + p.getName() + "'s PP: 8============D");
                            System.out.println(ChatColor.GRAY + "[" + ChatColor.RED + "SMP" + ChatColor.GRAY + "] " +
                                    ChatColor.RED + p.getName() + "'s PP: 8============D");
                        }
                    }
                }
            }
            return true;
        } return true;
    }
}