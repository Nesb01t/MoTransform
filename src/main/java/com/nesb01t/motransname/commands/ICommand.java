package com.nesb01t.motransname.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;

import static com.nesb01t.motransname.MoTransname.core;

public abstract class ICommand implements TabExecutor {
    public ICommand(String command) {
        regCommandSelf(command);
    }

    public void regCommandSelf(String command) {
        core.getCommand(command).setExecutor(this);
    }

    public abstract boolean onCommand(CommandSender sender, Command command, String label, String[] args);
}
