package net.pengtul.rzhungergames;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.util.Vector;

import java.util.List;

enum TeamSize {
    Solo,
    Duos,
    Trios,
}

public class GameCfg {
    TeamSize teamSize;
    int minStartPlayers;
    Vector lobbyLocation;
    Vector deadLocation;
    Vector mapLocationCenter;
    List<Integer> gameTimesSeconds;
    boolean randomEndPos;
    String sqlUsername;
    String sqlPasswd;
    String sqlDatabaseName;
    String sqlHostname;
    int sqlPort;

    public GameCfg(JavaPlugin pl) {
        FileConfiguration filecfg = pl.getConfig();
        int teamsize = filecfg.getInt("squad-types");
        switch (teamsize) {
            case 0: this.teamSize = TeamSize.Solo; break;
            case 1: this.teamSize = TeamSize.Duos; break;
            case 2: this.teamSize = TeamSize.Trios; break;
            default: pl.getLogger().warning("Invald teamsize setting, defaulting to Solos..."); this.teamSize = TeamSize.Solo; break;
        }

        this.minStartPlayers = filecfg.getInt("min-start-teams") * (this.teamSize.ordinal()+1);
        this.lobbyLocation = filecfg.getVector("lobby-location");
        this.deadLocation = filecfg.getVector("dead-store-location");
        this.mapLocationCenter = filecfg.getVector("map-center-location");
        this.gameTimesSeconds = filecfg.getIntegerList("game-times");
        this.randomEndPos = filecfg.getBoolean("random-ending-circle");

        this.sqlUsername = filecfg.getString("sql-username");
        this.sqlPasswd = filecfg.getString("sql-passwd");
        this.sqlDatabaseName = filecfg.getString("sql-dbname");
        this.sqlHostname = filecfg.getString("sql-hostname");
        this.sqlPort = filecfg.getInt("sql-port");
    }
}
