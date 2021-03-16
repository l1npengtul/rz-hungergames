package net.pengtul.rzhungergames;

import org.bukkit.plugin.java.JavaPlugin;

public class RZHungerGames extends JavaPlugin {
    public static boolean Started = false;
    public static GameCfg GameConfiguration;

    @Override
    public void onEnable() {
        this.saveDefaultConfig();

        RZHungerGames.GameConfiguration = new GameCfg(this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
