package de.ketchupbombe;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by Hp on 09.07.2017.
 */
public class HelloWorldMaven extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage("§aPlugin loaded!");
    }

    @Override
    public void onDisable() {
    }
}
