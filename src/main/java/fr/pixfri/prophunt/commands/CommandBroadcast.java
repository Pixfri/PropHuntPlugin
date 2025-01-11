package fr.pixfri.prophunt.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

public class CommandBroadcast implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, String[] args) {
        if (args.length == 0) {
            sender.sendMessage(ChatColor.RED + "Please provide a message.");
            return false;
        }

        String message = String.join(" ", args);
        message = ChatColor.translateAlternateColorCodes('&', message);

        Bukkit.broadcastMessage(message);

        return true;
    }
}
