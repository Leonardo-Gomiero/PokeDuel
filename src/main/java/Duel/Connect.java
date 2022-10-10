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
import java.util.ArrayList;
import org.bson.Document;

public class Connect {

    public static void main(String[] args) {
        getValues();
    }

    public static void getValues() {

        /*
        System.out.println("getValues");
        
        //Conexão com a porta do mongo
        MongoClient mongo = new MongoClient("localhost", 27017);
        
        //Objeto db que busca o banco cliente
        MongoDatabase db = mongo.getDatabase("pokeduel");
        
        //Objeto que busca a collection "cadastro", chamado de docs
        MongoCollection<Document> docs = db.getCollection("pokemons");
        
        
        //"Varre" a collection, mostrando os itens que estão nela, os seus documentos chamados aqui de doc
        for(Document doc : docs.find(eq("_id", 487.0))){
            System.out.println("Item: " + doc);
        }
        
        
        
        //Mostra que deu certo
        System.out.println("getValues ok");
         */
        float bora = 0;
        try ( MongoClient mongo = new MongoClient("localhost", 27017);) {
            MongoDatabase database = mongo.getDatabase("pokeduel");
            MongoCollection<Document> collection = database.getCollection("pokemons");
            try {
                DistinctIterable<Float> docs = collection.distinct("Defense", Filters.eq("Name", "Giratina"), Float.class);
                MongoCursor<Float> results = docs.iterator();
                while (results.hasNext()) {
                    System.out.println(results.next());
                    //bora = results.getFloat();
                }
                System.out.println("Bora: ");
            } catch (MongoException me) {
                System.err.println("An error occurred: " + me);
            }

        }
    }
}
