package com.github.boromoi.soulcrushed;

import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;
public final class SoulCrushed extends JavaPlugin  implements Listener  {

        @Override
        public void onEnable() {
            Bukkit.getConsoleSender().sendMessage("I am a working plugin");
            Bukkit.getPluginManager().registerEvents(this, this);
        }

        @EventHandler
        public void onPlayerJoin(PlayerJoinEvent event) {
            event.getPlayer().sendMessage(Component.text("Hello, " + event.getPlayer().getName() + "!"));
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
