package de.karotte128.unpredictor;


import com.destroystokyo.paper.event.server.ServerTickEndEvent;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class nextDay implements Listener {

    @EventHandler
    public void ontick(ServerTickEndEvent e){
        if (Bukkit.getServer().getWorld("world").getTime() == 0){
            int random = (int )(Math.random() * 50 + 1);
        }
    }
}
