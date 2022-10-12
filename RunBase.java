import java.io.File;
import java.util.Scanner;

import base.*;

public class RunBase {
    public static void main(String[] args) {
        
        // exemple de récursivité
        // recursion();

        // exemple d'usage d'un objet pour organiser les données
        struct();
    }

    static void recursion()
    {
        int val = 9;
        System.out.println("Boucle");
        Recursion.loop( val );
        System.out.println("Recursivité");
        Recursion.recurse( val );
    }

    static void struct()
    {
        // tenter de lire le fichier de données
        String file = "./data/struct.txt";
        Scanner fileReader;
        try{
            fileReader = new Scanner( new File( file ) );
        } catch (Exception e) {
            System.out.println( "Erreur : fichier \"" + file + "\" pas trouvé" );
            return; // quitter en cas d'échec
        }

        // créer un tableau en lisant le fichier
        Struct[] students = new Struct[ 100 ]; // un nombre suffisament grand
        int i = 0;
        while ( fileReader.hasNextLine() && i < 100 )
        {
            students[ i ] = new Struct();
            students[ i ].name = fileReader.next();
            students[ i ].schoolYear = fileReader.nextInt();
            students[ i ].average = fileReader.nextDouble();
            fileReader.nextLine();
            i++;
        }

        // Afficher quelques données
        System.out.println( "Noms des " + i + " élèves :" );
        System.out.print("\n\t");
        for ( int j = 0; j < i; j++ ) {
            System.out.print( students[ i ].name + " " );
        }
        System.out.println("\n");
    }
}
