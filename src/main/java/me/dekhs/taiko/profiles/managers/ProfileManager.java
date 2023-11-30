package me.dekhs.taiko.profiles.managers;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import me.dekhs.taiko.database.MongoManager;
import me.dekhs.taiko.profiles.Profile;
import org.bson.Document;

import java.util.UUID;

public class ProfileManager {

    public boolean hasProfile(UUID uuid) {
        MongoCollection<Document> collection = MongoManager.database.getCollection("Profiles");
        if(collection.find(Filters.eq("playerId", member.getId())).first() != null) {
            return true;
        } else {
            return false;
        }
    }

    public void registerNewProfile(UUID uuid) {
        if(hasProfile(uuid)) {
            return;
        }
        Profile profile = new Profile(uuid);

        Document document = new Document("playerName", profile.getPlayerName());
        document.append("uuid", uuid.toString());
        document.append("isInTeam", profile.isInTeam());
        document.append("isRegistered", profile.isRegistered());
        document.append("playerWins", player.getWins());
        document.append("playerLooses", player.getLooses());
        document.append("playerRank", player.getRank());
        MongoManager.database.getCollection("Profiles").insertOne(document);
    }
    }

}
