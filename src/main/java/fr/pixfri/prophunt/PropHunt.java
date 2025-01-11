package fr.pixfri.prophunt;

import fr.pixfri.prophunt.commands.CommandBroadcast;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class PropHunt extends JavaPlugin {
    @Override
    public void onEnable() {
        Bukkit.getLogger().info("[PropHunt] Plugin enabled");

        getCommand("broadcast").setExecutor(new CommandBroadcast());
    }
}
