package me.ppgome.smpessentials;

import me.ppgome.smpessentials.misc.Commands;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class SMPEssentials extends JavaPlugin implements Listener {

    public static SMPEssentials getPlugin() {
        return plugin;
    }

    private static SMPEssentials plugin;

    @Override
    public void onEnable() {
        // Plugin startup logic

        System.out.println("SMPEssentials has started successfully.");

        plugin = this;

        getConfig().options().copyDefaults();
        saveDefaultConfig();

        Commands penis = new Commands();
        getCommand("penis").setExecutor(penis);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic

        System.out.println("OH NO THE SMPESSENTIALS PLUGIN IS DYING AAAAAAAAAAAAAA");
    }
}
