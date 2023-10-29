package com.nesb01t.motransname;

import com.nesb01t.motransname.commands.impl.TransItemCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class MoTransname extends JavaPlugin {
    public static MoTransname core;

    @Override
    public void onEnable() {
        core = this;
        TransItemCommand transItemCommand = new TransItemCommand();
    }

    @Override
    public void onDisable() {
    }
}
