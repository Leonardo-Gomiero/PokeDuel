package Duel;

import com.mongodb.*;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class Connect {
    public static void main(String[] args) {
        getValues();
    }
    
    public static void getValues(){
        
        System.out.println("getValues");
        
        //Conexão com a porta do mongo
        MongoClient mongo = new MongoClient("localhost", 27017);
        
        //Objeto db que busca o banco cliente
        MongoDatabase db = mongo.getDatabase("pokeduel");
        
        //Objeto que busca a collection "cadastro", chamado de docs
        MongoCollection<Document> docs = db.getCollection("pokemons");
        
        
        //"Varre" a collection, mostrando os itens que estão nela, os seus documentos chamados aqui de doc
        for(Document doc : docs.find()){
            System.out.println("Item: " + doc);
        }
        
        //Mostra que deu certo
        System.out.println("getValues ok");
        
    }
}
