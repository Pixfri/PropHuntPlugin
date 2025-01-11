package fr.pixfri.prophunt;

import fr.pixfri.prophunt.commands.CommandBroadcast;
import fr.pixfri.prophunt.utils.commands.SimpleCommand;
import org.bukkit.Bukkit;
import org.bukkit.craftbukkit.v1_20_R4.CraftServer;
import org.bukkit.plugin.java.JavaPlugin;

public class PropHunt extends JavaPlugin {
    @Override
    public void onEnable() {
        Bukkit.getLogger().info("[PropHunt] Plugin enabled");

        createCommand(new SimpleCommand(
                "broadcast",
                "Sends a message to everyone on the server.",
                "/[broadcast/bc] <message>",
                new CommandBroadcast(),
                "bc"
        ));
    }

    private void createCommand(SimpleCommand command) {
        CraftServer server = ((CraftServer) getServer());

        server.getCommandMap().register(getName(), command);
    }
}
