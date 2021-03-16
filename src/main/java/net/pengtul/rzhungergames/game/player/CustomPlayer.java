package net.pengtul.rzhungergames.game.player;

import net.pengtul.rzhungergames.game.classes.Classes;
import org.bukkit.entity.Player;

public class CustomPlayer {
    private Player player;
    private Classes classes;
    public CustomPlayer(Player p, Classes c) {
        this.player = p;
        this.classes = c;
    }
}
