package me.ppgome.smpessentials;

import me.ppgome.smpessentials.development.devCommands;
import me.ppgome.smpessentials.misc.miscCommands;
import org.bukkit.command.CommandExecutor;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class SMPEssentials extends JavaPlugin implements Listener, CommandExecutor {

    public static SMPEssentials getPlugin() {
        return plugin;
    }

    private static SMPEssentials plugin;

    @Override
    public void onEnable() {
        // Plugin startup logic

        System.out.println("SMPEssentials has started successfully.");
        getServer().getPluginManager().registerEvents(this, this);

        plugin = this;

        getConfig().options().copyDefaults();
        saveDefaultConfig();

        miscCommands penis = new miscCommands();
        getCommand("penis").setExecutor(penis);

        devCommands SMPEssentials = new devCommands();
        getCommand("smpessentials").setExecutor(SMPEssentials);

        ItemCommands SMPEssentialsGive = new ItemCommands();
        getCommand("smpessentialsgive").setExecutor(SMPEssentialsGive);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic

        System.out.println("OH NO THE SMPESSENTIALS PLUGIN IS DYING AAAAAAAAAAAAAA");
    }
}
