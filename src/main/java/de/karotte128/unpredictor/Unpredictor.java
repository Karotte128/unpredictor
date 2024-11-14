package de.karotte128.unpredictor;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Unpredictor extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        PluginManager pluginManager = Bukkit.getPluginManager();
        pluginManager.registerEvents( new nextDay(),this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
