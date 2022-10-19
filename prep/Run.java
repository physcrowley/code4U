package prep;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

/** Classe pour tester et lancer le code dans le package {@code base} 
 * @author physcrowley (2022-10)
*/
public class Run {
    public static void main(String[] args) {
        
        // exemple d'usage d'un objet pour organiser les données
        struct();
    }

    

    /** Utilise le struct/record défini dans {@link base.Struct} */
    static void struct()
    {
        // tenter de lire le fichier de données
        String file = "./data/base_struct.txt"; 
                      // chemin à partir de la racine du "projet" code4U
        Scanner fileReader;
        try {
            fileReader = new Scanner( new File( file ) );
            fileReader.useLocale( Locale.CANADA ); // le décimal est un point (.)
        } catch ( Exception e ) {
            System.out.println( "Erreur : fichier \"" + file + "\" pas trouvé" );
            return; // quitter en cas d'échec
        }

        // créer un tableau en lisant le fichier
        Struct[] students = new Struct[ 100 ]; // un tableau assez grand
        int n = 0; // le nombre de lignes lus
        while ( fileReader.hasNextLine() && n < 100 )
        {
            students[ n ] = new Struct(); // un nouveau Struct à l'index n
            // extraires les valeurs pour cet élève
            students[ n ].name = fileReader.next();
            students[ n ].schoolYear = fileReader.nextInt();
            students[ n ].average = fileReader.nextDouble();
            // passer à la prochaine ligne
            fileReader.nextLine(); 
            n++;
        }
        fileReader.close();

        // Afficher quelques données
        System.out.println( "Noms des " + n + " élèves :" );
        System.out.print("\n\t");
        for ( int s = 0; s < n; s++ ) {
            System.out.print( students[ s ].name + " " );
        }
        System.out.println("\n");

        System.out.print( "La moyenne de la classe est ");
        double sum = 0;
        for ( int s = 0; s < n; s++ ) sum += students[ s ].average;
        System.out.printf( "%.1f\n", sum / n );
    }

}
