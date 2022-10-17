package json;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Exemple d'utilisation de la bibliothèque externe Gson pour mettre en forme les données
 * d'objets pour le conserver dans des fichiers de format Json et, inversement, pour 
 * initialiser des objets facilement à partir de données stockées sous format Json.
 * <p></p>
 * L'objet de base est défini dans {@link json.ProjectObject}, incluant ses champs, le
 * constructeur et les accesseurs nécessaires pour cet exemple.
 * <p></p>
 * Les informations de base sur la bibliothèque Gson qui ont renseignées le
 * développement des exemples dans cette classe se trouvent à l'adresse : 
 * https://github.com/google/gson/blob/master/UserGuide.md
 * <p></p>
 * Les informations sur comment utiliser Gson avec Maven se trouvent à 
 * cette adresse : https://github.com/google/gson
 * 
 * @author phsycrowley (2022-10)
 */
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

    System.out.println( "Objets Java --> format Json");
    System.out.println( "~~~~~~~~~~~~~~~~~~~~~~~~~~~");

    String output;

    // sortie compact
    System.out.println( "\nCOMPACT ");
    Gson gson = new Gson(); 
    output = gson.toJson(objects );
    System.out.println( output );

    // sortie mieux lisible par les humains
    System.out.println( "\nJOLI ");
    gson = new GsonBuilder().setPrettyPrinting().create();
    output = gson.toJson(objects );
    System.out.println( output );

    // sortie vers un fichier
    String filePath = "./data/output_sample.json";
    System.out.println( "\nVOIR LE FICHIER " + filePath );
    try {
      var fw = new FileWriter( filePath );
      fw.write( output ); // la version jolie
      fw.close();
    } catch ( Exception e ) {
      System.out.println( "Échec d'écriture au fichier" );
    }

    //
    // entrée de format JSON
    //

    System.out.println( "\n\nFormat Json --> objets Java" );
    System.out.println(     "~~~~~~~~~~~~~~~~~~~~~~~~~~~" );

    // lecture d'un fichier JSON
    var input = new StringBuilder();
    try {
      var fr = new Scanner ( new File( filePath ) );
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
      System.out.println(
        "Name: " + o.getName() + ", num: " + o.getNum() +", isWhatever: " + o.getIsWhatever() 
      );
    }
    System.out.println();

  }
  
}
