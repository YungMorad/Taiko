package me.dekhs.taiko;

import lombok.Getter;
import me.dekhs.taiko.database.MongoManager;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class Taiko extends JavaPlugin {

    @Getter
    public static Taiko INSTANCE;

    @Getter
    public static FileConfiguration config;

    @Override
    public void onLoad() {
        INSTANCE = this;
        config = Taiko.getConfig();
        this.saveDefaultConfig();
        MongoManager.init();
    }

    @Override
    public void onEnable() {

    }

    @Override
    public void onDisable() {

    }
}
