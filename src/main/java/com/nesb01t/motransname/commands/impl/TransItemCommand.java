package com.nesb01t.motransname.commands.impl;

import com.nesb01t.motransname.api.MaterialTransMap;
import com.nesb01t.motransname.api.Materials;
import com.nesb01t.motransname.commands.ICommand;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.List;

public class TransItemCommand extends ICommand {

    public TransItemCommand() {
        super("i");
    }


    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String label, String[] args) {
        return Materials.transNames;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            return false;
        }

        if (args.length < 1) {
            return false;
        }

        String header = ChatColor.translateAlternateColorCodes('&', "[&eMoTransname&f]&7 Query Result:");
        sender.sendMessage(header);
        for (int i = 0; i < args.length; i++) {
            String name = MaterialTransMap.mapCn2En.get(args[i]).replace('_', ' ').toLowerCase();
            String row = ChatColor.translateAlternateColorCodes('&', " &7· &f" + args[i] + " &7-> &f" + name);
            sender.sendMessage(row);
        }

        return true;
    }
}
