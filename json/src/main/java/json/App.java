package json;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class App {
  public static void main(String[] args) {
    
    //
    // créer des instances d'objets
    //
    var obj1 = new ProjectObject("David", 42, false);
    var obj2 = new ProjectObject("Allison", 7, true);
    ProjectObject[] objects = { obj1, obj2 };
    
    //
    // sortie en format JSON
    //
    String output;
    // sortie compact
    Gson gson = new Gson(); 
    output = gson.toJson(objects );
    System.out.println( output );

    // sortie mieux lisible par les humains
    gson = new GsonBuilder().setPrettyPrinting().create();
    output = gson.toJson(objects );
    System.out.println( output );

    // sortie vers un fichier
    try {
      var fw = new FileWriter("./data/output_sample.json" );
      fw.write( output );
      fw.close();
    } catch ( Exception e ) {
      System.out.println( "Échec d'écriture au fichier" );
    }

    //
    // entrée JSON
    //

    // lecture d'un fichier JSON
    var input = new StringBuilder();
    try {
      var fr = new Scanner ( new File( "./data/output_sample.json" ) );
      while ( fr.hasNext() ) input.append( fr.next() );
      fr.close();
    } catch ( Exception e ) {
      System.out.println( "Échec de lecture du fichier" );
    }

    // création de la liste d'objets 
    ProjectObject[] newObjects 
      = gson.fromJson( input.toString() , ProjectObject[].class );
    
    // afficher les valeurs
    for (ProjectObject o : newObjects ){
      System.out.println("Name: " + o.getName() + 
        ", num: " + o.getNum() +
        ", isWhatever: " + o.getIsWhatever() 
      );
    }

  }
  
}
