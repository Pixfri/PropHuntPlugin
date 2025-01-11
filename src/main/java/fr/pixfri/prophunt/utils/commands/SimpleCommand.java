package fr.pixfri.prophunt.utils.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class SimpleCommand extends Command {
    private final CommandExecutor executor;

    public SimpleCommand(
            String name,
            String description,
            String usage,
            CommandExecutor executor,
            String... aliases
    ) {
        super(name, description, usage, Arrays.asList(aliases));

        this.executor = executor;
    }

    @Override
    public boolean execute(@NotNull CommandSender commandSender, @NotNull String label, @NotNull String[] args) {
        return executor.onCommand(commandSender, this, label, args);
    }
}
