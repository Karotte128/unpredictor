package de.karotte128.unpredictor;

import org.bukkit.plugin.java.JavaPlugin;

public final class Unpredictor extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("unpredictor").setExecutor(new UnpredictorCommand());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
