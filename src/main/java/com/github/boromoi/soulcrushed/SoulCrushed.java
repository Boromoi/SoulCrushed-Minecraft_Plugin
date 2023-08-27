package com.github.boromoi.soulcrushed;

import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.command.defaults.BukkitCommand;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class SoulCrushed extends JavaPlugin  implements Listener  {

        @Override
        public void onEnable() {
            Bukkit.getConsoleSender().sendMessage("I am a working plugin");
            Bukkit.getPluginManager().registerEvents(this, this);
        }

        @EventHandler
        public void onPlayerJoin(PlayerJoinEvent event) {
            // Send message to specific player who joins the server.
            //event.getPlayer().sendMessage(Component.text("Hello, " + event.getPlayer().getName() + "!"));
            // Broadcast message about the player who joins the server.
            Bukkit.broadcast(Component.text("Hello, " + event.getPlayer().getName() + " kindled one thou better not die soon..."));
        }

        @EventHandler
        public void onPlayerDying(PlayerDeathEvent event) {
            // Send the player's death location in chat to the player who died.
            //Bukkit.getConsoleSender().sendMessage(event.getPlayer().getLastDeathLocation().toString());

            Player player = event.getPlayer();

            // Send the player's death location in chat to every player online.
            Bukkit.broadcast(Component.text("X: " + player.getLastDeathLocation().getBlockX() + " Y: " + player.getLastDeathLocation().getBlockY() + " Z: " + player.getLastDeathLocation().getBlockZ()));
        }

        @EventHandler
        public void onPlayerRespawn(PlayerRespawnEvent event) {
        // Set the max hp of the player depending on a death integer.
        }
}

/*{
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new SoulCrushed().getGreeting());
    }
}*/

    /*@Override
    public void onEnable() {
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }*/
