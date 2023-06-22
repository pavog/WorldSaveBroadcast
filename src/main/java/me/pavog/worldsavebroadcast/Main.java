package me.pavog.worldsavebroadcast;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.world.WorldSaveEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {

    private String message;

    @Override
    public void onEnable() {
        super.onEnable();

        this.saveDefaultConfig();

        this.message = this.getConfig().getString("message");
        if (this.message == null) {
            this.message = "&o[Server: Saved the world %name%]";
        }

        this.getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onWorldSave(WorldSaveEvent event) {
        String message = ChatColor.translateAlternateColorCodes('&', this.message)
                .replaceAll("%name%", event.getWorld().getName());
        this.getServer().broadcastMessage(message);
    }

}