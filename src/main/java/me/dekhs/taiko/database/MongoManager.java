package me.dekhs.taiko.database;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import me.dekhs.taiko.Taiko;
import org.bson.Document;
import org.bukkit.configuration.file.FileConfiguration;

public class MongoManager {
    public static MongoDatabase database;
    public static MongoClient client;
    public static MongoCollection<Document> profiles;

    private static FileConfiguration config = Taiko.getConfig();


    public static void init() {
        String uri = config.getString("MONGODB.URI");
        String databaseName = config.getString("MONGODB.DATABASE");
        client = MongoClients.create(uri);
        database = client.getDatabase(databaseName);
        loadCollections();
    }

    public static void loadCollections() {
        profiles = database.getCollection("Profiles");
    }
}
