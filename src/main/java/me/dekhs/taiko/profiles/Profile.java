package me.dekhs.taiko.profiles;

import lombok.Getter;
import lombok.Setter;
import me.dekhs.taiko.team.Team;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import java.util.UUID;

public class Profile {

    @Getter @Setter
    public UUID uuid;
    @Getter @Setter
    public Player player;
    @Getter @Setter
    public String playerName;
    @Getter @Setter
    public boolean isInTeam;
    @Getter @Setter
    public boolean registered;
    @Getter @Setter
    public Team team;
    @Getter @Setter
    public boolean isTeamLeader;
    @Getter @Setter
    public String teamName;
    @Getter @Setter
    public UUID teamUUID;
    @Getter @Setter
    public int ELO;
    @Getter @Setter
    public String division;


    public Profile(UUID uuid) {
        this.uuid = uuid;
        this.player = Bukkit.getPlayer(uuid);
        this.playerName = player.getDisplayName();
        this.ELO = 0;
        this.division = "Iron";
        //TODO FINIR LE CONSTRUCTEUR
    }
}
