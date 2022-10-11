package Duel;

import com.mongodb.*;
import com.mongodb.client.DistinctIterable;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import static com.mongodb.client.model.Filters.eq;
import java.awt.List;
import java.io.StringWriter;
import java.util.ArrayList;
import javax.xml.transform.dom.DOMSource;
import org.bson.Document;
import java.lang.*;

public class Connect {

    public static void main(String[] args) {

        Pokemon(643);

    }

    public static void Pokemon(int num) {

        String name = getName(num);
        String ability = getAbility(num);
        int hp = getHP(num);
        int attack = getAttack(num);
        int defense = getDefense(num);
        int spAtk = getSpAtk(num);
        int spDef = getSpDef(num);
        int speed = getSpeed(num);

        Pokemon pokemon = new Pokemon(name, ability, hp, attack, defense, spAtk, spDef, speed);
        
        pokemon.showInfo();

    }

    public static String getName(int num) {
        double value = 0;
        String name = "";
        try ( MongoClient mongo = new MongoClient("localhost", 27017);) {
            MongoDatabase database = mongo.getDatabase("pokeduel");
            MongoCollection<Document> collection = database.getCollection("pokemons");
            try {
                DistinctIterable<String> docs = collection.distinct("Name", Filters.eq("_id", num), String.class);
                MongoCursor<String> results = docs.iterator();
                while (results.hasNext()) {

                    name = results.next();
                }
                //System.out.println("Name: " + name);
            } catch (MongoException me) {
                System.err.println("An error occurred: " + me);
            }
        }
        return name;
    }

    public static String getAbility(int num) {

        String ability = "";
        try ( MongoClient mongo = new MongoClient("localhost", 27017);) {
            MongoDatabase database = mongo.getDatabase("pokeduel");
            MongoCollection<Document> collection = database.getCollection("pokemons");
            try {
                DistinctIterable<String> docs = collection.distinct("Ability", Filters.eq("_id", num), String.class);
                MongoCursor<String> results = docs.iterator();
                while (results.hasNext()) {

                    ability = results.next();
                }
                //System.out.println("Ability: " + ability);
            } catch (MongoException me) {
                System.err.println("An error occurred: " + me);
            }
        }
        return ability;
    }

    public static int getDefense(int num) {
        int defense = 0;
        try ( MongoClient mongo = new MongoClient("localhost", 27017);) {
            MongoDatabase database = mongo.getDatabase("pokeduel");
            MongoCollection<Document> collection = database.getCollection("pokemons");
            try {
                DistinctIterable<Integer> docs = collection.distinct("Defense", Filters.eq("_id", num), Integer.class);
                MongoCursor<Integer> results = docs.iterator();
                while (results.hasNext()) {

                    defense = results.next();
                }
                //System.out.println("Defense: " + defense);
            } catch (MongoException me) {
                System.err.println("An error occurred: " + me);
            }
        }
        return defense;
    }

    public static int getAttack(int num) {
        int attack = 0;
        try ( MongoClient mongo = new MongoClient("localhost", 27017);) {
            MongoDatabase database = mongo.getDatabase("pokeduel");
            MongoCollection<Document> collection = database.getCollection("pokemons");
            try {
                DistinctIterable<Integer> docs = collection.distinct("Attack", Filters.eq("_id", num), Integer.class);
                MongoCursor<Integer> results = docs.iterator();
                while (results.hasNext()) {

                    attack = results.next();
                }
                //System.out.println("Attack: " + attack);
            } catch (MongoException me) {
                System.err.println("An error occurred: " + me);
            }
        }
        return attack;
    }

    public static int getHP(int num) {
        int hp = 0;
        try ( MongoClient mongo = new MongoClient("localhost", 27017);) {
            MongoDatabase database = mongo.getDatabase("pokeduel");
            MongoCollection<Document> collection = database.getCollection("pokemons");
            try {
                DistinctIterable<Integer> docs = collection.distinct("HP", Filters.eq("_id", num), Integer.class);
                MongoCursor<Integer> results = docs.iterator();
                while (results.hasNext()) {

                    hp = results.next();
                }
                //System.out.println("HP: " + hp);
            } catch (MongoException me) {
                System.err.println("An error occurred: " + me);
            }
        }
        return hp;
    }

    public static int getSpAtk(int num) {
        int spAtk = 0;
        try ( MongoClient mongo = new MongoClient("localhost", 27017);) {
            MongoDatabase database = mongo.getDatabase("pokeduel");
            MongoCollection<Document> collection = database.getCollection("pokemons");
            try {
                DistinctIterable<Integer> docs = collection.distinct("SpAtk", Filters.eq("_id", num), Integer.class);
                MongoCursor<Integer> results = docs.iterator();
                while (results.hasNext()) {

                    spAtk = results.next();
                }
                //System.out.println("Special Attack: " + spAtk);
            } catch (MongoException me) {
                System.err.println("An error occurred: " + me);
            }
        }
        return spAtk;
    }

    public static int getSpDef(int num) {
        int spDef = 0;
        try ( MongoClient mongo = new MongoClient("localhost", 27017);) {
            MongoDatabase database = mongo.getDatabase("pokeduel");
            MongoCollection<Document> collection = database.getCollection("pokemons");
            try {
                DistinctIterable<Integer> docs = collection.distinct("SpDef", Filters.eq("_id", num), Integer.class);
                MongoCursor<Integer> results = docs.iterator();
                while (results.hasNext()) {

                    spDef = results.next();
                }
                //System.out.println("Special Defense: " + spDef);
            } catch (MongoException me) {
                System.err.println("An error occurred: " + me);
            }
        }
        return spDef;
    }

    public static int getSpeed(int num) {
        int speed = 0;
        try ( MongoClient mongo = new MongoClient("localhost", 27017);) {
            MongoDatabase database = mongo.getDatabase("pokeduel");
            MongoCollection<Document> collection = database.getCollection("pokemons");
            try {
                DistinctIterable<Integer> docs = collection.distinct("Speed", Filters.eq("_id", num), Integer.class);
                MongoCursor<Integer> results = docs.iterator();
                while (results.hasNext()) {

                    speed = results.next();
                }
                //System.out.println("Speed: " + speed);
            } catch (MongoException me) {
                System.err.println("An error occurred: " + me);
            }
        }
        return speed;
    }
}
